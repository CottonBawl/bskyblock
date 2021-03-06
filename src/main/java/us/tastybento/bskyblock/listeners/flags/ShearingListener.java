package us.tastybento.bskyblock.listeners.flags;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerShearEntityEvent;

import us.tastybento.bskyblock.lists.Flags;

/**
 * Handles shearing
 * @author tastybento
 *
 */
public class ShearingListener extends AbstractFlagListener {

    // Protect sheep
    @EventHandler(priority = EventPriority.LOW)
    public void onShear(final PlayerShearEntityEvent e) {
        checkIsland(e, e.getEntity().getLocation(), Flags.SHEARING);
    }

}
