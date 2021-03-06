/**
 *
 */
package us.tastybento.bskyblock.listeners.flags;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import us.tastybento.bskyblock.BSkyBlock;
import us.tastybento.bskyblock.api.configuration.WorldSettings;
import us.tastybento.bskyblock.database.objects.Island;
import us.tastybento.bskyblock.lists.Flags;
import us.tastybento.bskyblock.managers.IslandWorldManager;
import us.tastybento.bskyblock.managers.IslandsManager;
import us.tastybento.bskyblock.util.Util;

/**
 * @author tastybento
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({BSkyBlock.class, Util.class })
public class RemoveMobsListenerTest {

    private Island island;
    private IslandsManager im;
    private World world;
    private Location inside;
    private UUID uuid;
    private Player player;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        // Set up plugin
        BSkyBlock plugin = mock(BSkyBlock.class);
        Whitebox.setInternalState(BSkyBlock.class, "instance", plugin);

        // World
        world = mock(World.class);

        // Owner
        uuid = UUID.randomUUID();

        // Island initialization
        island = mock(Island.class);
        when(island.getOwner()).thenReturn(uuid);

        im = mock(IslandsManager.class);
        when(plugin.getIslands()).thenReturn(im);
        when(im.getIsland(Mockito.any(), Mockito.any(UUID.class))).thenReturn(island);

        inside = mock(Location.class);
        when(inside.getWorld()).thenReturn(world);

        Optional<Island> opIsland = Optional.ofNullable(island);
        when(im.getProtectedIslandAt(Mockito.eq(inside))).thenReturn(opIsland);
        // On island
        when(im.locationIsOnIsland(Mockito.any(), Mockito.any())).thenReturn(true);

        PowerMockito.mockStatic(Util.class);
        when(Util.getWorld(Mockito.any())).thenReturn(world);

        // World Settings
        IslandWorldManager iwm = mock(IslandWorldManager.class);
        when(plugin.getIWM()).thenReturn(iwm);
        WorldSettings ws = mock(WorldSettings.class);
        when(iwm.getWorldSettings(Mockito.any())).thenReturn(ws);
        Map<String, Boolean> worldFlags = new HashMap<>();
        when(ws.getWorldFlags()).thenReturn(worldFlags);
        Flags.REMOVE_MOBS.setSetting(world, true);

        // Sometimes use Mockito.withSettings().verboseLogging()
        player = mock(Player.class);
        UUID uuid = UUID.randomUUID();
        when(player.getUniqueId()).thenReturn(uuid);

    }

    /**
     * Test method for {@link us.tastybento.bskyblock.listeners.flags.RemoveMobsListener#onUserTeleport(org.bukkit.event.player.PlayerTeleportEvent)}.
     */
    @Test
    public void testOnUserTeleport() {
        PlayerTeleportEvent e = new PlayerTeleportEvent(player, inside, inside, PlayerTeleportEvent.TeleportCause.PLUGIN);
        new RemoveMobsListener().onUserTeleport(e);
        Mockito.verify(im).clearArea(Mockito.any());
    }

    /**
     * Test method for {@link us.tastybento.bskyblock.listeners.flags.RemoveMobsListener#onUserTeleport(org.bukkit.event.player.PlayerTeleportEvent)}.
     */
    @Test
    public void testOnUserTeleportDoNotRemove() {
        Flags.REMOVE_MOBS.setSetting(world, false);
        PlayerTeleportEvent e = new PlayerTeleportEvent(player, inside, inside, PlayerTeleportEvent.TeleportCause.PLUGIN);
        new RemoveMobsListener().onUserTeleport(e);
        Mockito.verify(im, Mockito.never()).clearArea(Mockito.any());
    }

    /**
     * Test method for {@link us.tastybento.bskyblock.listeners.flags.RemoveMobsListener#onUserTeleport(org.bukkit.event.player.PlayerTeleportEvent)}.
     */
    @Test
    public void testOnUserTeleportToNotIsland() {
        // Not on island
        when(im.locationIsOnIsland(Mockito.any(), Mockito.any())).thenReturn(false);
        PlayerTeleportEvent e = new PlayerTeleportEvent(player, inside, inside, PlayerTeleportEvent.TeleportCause.PLUGIN);
        new RemoveMobsListener().onUserTeleport(e);
        Mockito.verify(im, Mockito.never()).clearArea(Mockito.any());
    }

}
