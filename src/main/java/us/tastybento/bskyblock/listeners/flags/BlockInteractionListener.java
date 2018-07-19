package us.tastybento.bskyblock.listeners.flags;

import org.bukkit.Material;
import org.bukkit.block.FlowerPot;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import us.tastybento.bskyblock.api.flags.AbstractFlagListener;
import us.tastybento.bskyblock.lists.Flags;

/**
 * @author tastybento
 *
 */
public class BlockInteractionListener extends AbstractFlagListener {

    /**
     * Handle interaction with blocks
     * @param e - event
     */
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerInteract(final PlayerInteractEvent e) {
        if (!e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            return;
        }
        switch (e.getClickedBlock().getType()) {
        case ACACIA_BOAT:
            break;
        case ACACIA_BUTTON:
            break;
        case ACACIA_DOOR:
            break;
        case ACACIA_FENCE:
            break;
        case ACACIA_FENCE_GATE:
            break;
        case ACACIA_LEAVES:
            break;
        case ACACIA_LOG:
            break;
        case ACACIA_PLANKS:
            break;
        case ACACIA_PRESSURE_PLATE:
            break;
        case ACACIA_SAPLING:
            break;
        case ACACIA_SLAB:
            break;
        case ACACIA_STAIRS:
            break;
        case ACACIA_TRAPDOOR:
            break;
        case ACACIA_WOOD:
            break;
        case ACTIVATOR_RAIL:
            break;
        case AIR:
            break;
        case ALLIUM:
            break;
        case ANDESITE:
            break;
        case ANVIL:
            break;
        case APPLE:
            break;
        case ARMOR_STAND:
            break;
        case ARROW:
            break;
        case ATTACHED_MELON_STEM:
            break;
        case ATTACHED_PUMPKIN_STEM:
            break;
        case AZURE_BLUET:
            break;
        case BAKED_POTATO:
            break;
        case BARRIER:
            break;
        case BAT_SPAWN_EGG:
            break;
        case BEACON:
            break;
        case BEDROCK:
            break;
        case BEEF:
            break;
        case BEETROOT:
            break;
        case BEETROOTS:
            break;
        case BEETROOT_SEEDS:
            break;
        case BEETROOT_SOUP:
            break;
        case BIRCH_BOAT:
            break;
        case BIRCH_BUTTON:
            break;
        case BIRCH_DOOR:
            break;
        case BIRCH_FENCE:
            break;
        case BIRCH_FENCE_GATE:
            break;
        case BIRCH_LEAVES:
            break;
        case BIRCH_LOG:
            break;
        case BIRCH_PLANKS:
            break;
        case BIRCH_PRESSURE_PLATE:
            break;
        case BIRCH_SAPLING:
            break;
        case BIRCH_SLAB:
            break;
        case BIRCH_STAIRS:
            break;
        case BIRCH_TRAPDOOR:
            break;
        case BIRCH_WOOD:
            break;
        case BLACK_BANNER:
            break;
        case BLACK_BED:
            break;
        case BLACK_CARPET:
            break;
        case BLACK_CONCRETE:
            break;
        case BLACK_CONCRETE_POWDER:
            break;
        case BLACK_GLAZED_TERRACOTTA:
            break;
        case BLACK_SHULKER_BOX:
            break;
        case BLACK_STAINED_GLASS:
            break;
        case BLACK_STAINED_GLASS_PANE:
            break;
        case BLACK_TERRACOTTA:
            break;
        case BLACK_WALL_BANNER:
            break;
        case BLACK_WOOL:
            break;
        case BLAZE_POWDER:
            break;
        case BLAZE_ROD:
            break;
        case BLAZE_SPAWN_EGG:
            break;
        case BLUE_BANNER:
            break;
        case BLUE_BED:
            break;
        case BLUE_CARPET:
            break;
        case BLUE_CONCRETE:
            break;
        case BLUE_CONCRETE_POWDER:
            break;
        case BLUE_GLAZED_TERRACOTTA:
            break;
        case BLUE_ICE:
            break;
        case BLUE_ORCHID:
            break;
        case BLUE_SHULKER_BOX:
            break;
        case BLUE_STAINED_GLASS:
            break;
        case BLUE_STAINED_GLASS_PANE:
            break;
        case BLUE_TERRACOTTA:
            break;
        case BLUE_WALL_BANNER:
            break;
        case BLUE_WOOL:
            break;
        case BONE:
            break;
        case BONE_BLOCK:
            break;
        case BONE_MEAL:
            break;
        case BOOK:
            break;
        case BOOKSHELF:
            break;
        case BOW:
            break;
        case BOWL:
            break;
        case BRAIN_CORAL:
            break;
        case BRAIN_CORAL_BLOCK:
            break;
        case BRAIN_CORAL_FAN:
            break;
        case BREAD:
            break;
        case BREWING_STAND:
            break;
        case BRICK:
            break;
        case BRICKS:
            break;
        case BRICK_SLAB:
            break;
        case BRICK_STAIRS:
            break;
        case BROWN_BANNER:
            break;
        case BROWN_BED:
            break;
        case BROWN_CARPET:
            break;
        case BROWN_CONCRETE:
            break;
        case BROWN_CONCRETE_POWDER:
            break;
        case BROWN_GLAZED_TERRACOTTA:
            break;
        case BROWN_MUSHROOM:
            break;
        case BROWN_MUSHROOM_BLOCK:
            break;
        case BROWN_SHULKER_BOX:
            break;
        case BROWN_STAINED_GLASS:
            break;
        case BROWN_STAINED_GLASS_PANE:
            break;
        case BROWN_TERRACOTTA:
            break;
        case BROWN_WALL_BANNER:
            break;
        case BROWN_WOOL:
            break;
        case BUBBLE_COLUMN:
            break;
        case BUBBLE_CORAL:
            break;
        case BUBBLE_CORAL_BLOCK:
            break;
        case BUBBLE_CORAL_FAN:
            break;
        case BUCKET:
            break;
        case CACTUS:
            break;
        case CACTUS_GREEN:
            break;
        case CAKE:
            break;
        case CARROT:
            break;
        case CARROTS:
            break;
        case CARROT_ON_A_STICK:
            break;
        case CARVED_PUMPKIN:
            break;
        case CAULDRON:
            break;
        case CAVE_AIR:
            break;
        case CAVE_SPIDER_SPAWN_EGG:
            break;
        case CHAINMAIL_BOOTS:
            break;
        case CHAINMAIL_CHESTPLATE:
            break;
        case CHAINMAIL_HELMET:
            break;
        case CHAINMAIL_LEGGINGS:
            break;
        case CHAIN_COMMAND_BLOCK:
            break;
        case CHARCOAL:
            break;
        case CHEST:
            break;
        case CHEST_MINECART:
            break;
        case CHICKEN:
            break;
        case CHICKEN_SPAWN_EGG:
            break;
        case CHIPPED_ANVIL:
            break;
        case CHISELED_QUARTZ_BLOCK:
            break;
        case CHISELED_RED_SANDSTONE:
            break;
        case CHISELED_SANDSTONE:
            break;
        case CHISELED_STONE_BRICKS:
            break;
        case CHORUS_FLOWER:
            break;
        case CHORUS_FRUIT:
            break;
        case CHORUS_PLANT:
            break;
        case CLAY:
            break;
        case CLAY_BALL:
            break;
        case CLOCK:
            break;
        case COAL:
            break;
        case COAL_BLOCK:
            break;
        case COAL_ORE:
            break;
        case COARSE_DIRT:
            break;
        case COBBLESTONE:
            break;
        case COBBLESTONE_SLAB:
            break;
        case COBBLESTONE_STAIRS:
            break;
        case COBBLESTONE_WALL:
            break;
        case COBWEB:
            break;
        case COCOA:
            break;
        case COCOA_BEANS:
            break;
        case COD:
            break;
        case COD_BUCKET:
            break;
        case COD_SPAWN_EGG:
            break;
        case COMMAND_BLOCK:
            break;
        case COMMAND_BLOCK_MINECART:
            break;
        case COMPARATOR:
            break;
        case COMPASS:
            break;
        case CONDUIT:
            break;
        case COOKED_BEEF:
            break;
        case COOKED_CHICKEN:
            break;
        case COOKED_COD:
            break;
        case COOKED_MUTTON:
            break;
        case COOKED_PORKCHOP:
            break;
        case COOKED_RABBIT:
            break;
        case COOKED_SALMON:
            break;
        case COOKIE:
            break;
        case COW_SPAWN_EGG:
            break;
        case CRACKED_STONE_BRICKS:
            break;
        case CRAFTING_TABLE:
            break;
        case CREEPER_HEAD:
            break;
        case CREEPER_SPAWN_EGG:
            break;
        case CREEPER_WALL_HEAD:
            break;
        case CUT_RED_SANDSTONE:
            break;
        case CUT_SANDSTONE:
            break;
        case CYAN_BANNER:
            break;
        case CYAN_BED:
            break;
        case CYAN_CARPET:
            break;
        case CYAN_CONCRETE:
            break;
        case CYAN_CONCRETE_POWDER:
            break;
        case CYAN_DYE:
            break;
        case CYAN_GLAZED_TERRACOTTA:
            break;
        case CYAN_SHULKER_BOX:
            break;
        case CYAN_STAINED_GLASS:
            break;
        case CYAN_STAINED_GLASS_PANE:
            break;
        case CYAN_TERRACOTTA:
            break;
        case CYAN_WALL_BANNER:
            break;
        case CYAN_WOOL:
            break;
        case DAMAGED_ANVIL:
            break;
        case DANDELION:
            break;
        case DANDELION_YELLOW:
            break;
        case DARK_OAK_BOAT:
            break;
        case DARK_OAK_BUTTON:
            break;
        case DARK_OAK_DOOR:
            break;
        case DARK_OAK_FENCE:
            break;
        case DARK_OAK_FENCE_GATE:
            break;
        case DARK_OAK_LEAVES:
            break;
        case DARK_OAK_LOG:
            break;
        case DARK_OAK_PLANKS:
            break;
        case DARK_OAK_PRESSURE_PLATE:
            break;
        case DARK_OAK_SAPLING:
            break;
        case DARK_OAK_SLAB:
            break;
        case DARK_OAK_STAIRS:
            break;
        case DARK_OAK_TRAPDOOR:
            break;
        case DARK_OAK_WOOD:
            break;
        case DARK_PRISMARINE:
            break;
        case DARK_PRISMARINE_SLAB:
            break;
        case DARK_PRISMARINE_STAIRS:
            break;
        case DAYLIGHT_DETECTOR:
            break;
        case DEAD_BRAIN_CORAL_BLOCK:
            break;
        case DEAD_BUBBLE_CORAL_BLOCK:
            break;
        case DEAD_BUSH:
            break;
        case DEAD_FIRE_CORAL_BLOCK:
            break;
        case DEAD_HORN_CORAL_BLOCK:
            break;
        case DEAD_TUBE_CORAL_BLOCK:
            break;
        case DEBUG_STICK:
            break;
        case DETECTOR_RAIL:
            break;
        case DIAMOND:
            break;
        case DIAMOND_AXE:
            break;
        case DIAMOND_BLOCK:
            break;
        case DIAMOND_BOOTS:
            break;
        case DIAMOND_CHESTPLATE:
            break;
        case DIAMOND_HELMET:
            break;
        case DIAMOND_HOE:
            break;
        case DIAMOND_HORSE_ARMOR:
            break;
        case DIAMOND_LEGGINGS:
            break;
        case DIAMOND_ORE:
            break;
        case DIAMOND_PICKAXE:
            break;
        case DIAMOND_SHOVEL:
            break;
        case DIAMOND_SWORD:
            break;
        case DIORITE:
            break;
        case DIRT:
            break;
        case DISPENSER:
            break;
        case DOLPHIN_SPAWN_EGG:
            break;
        case DONKEY_SPAWN_EGG:
            break;
        case DRAGON_BREATH:
            break;
        case DRAGON_EGG:
            break;
        case DRAGON_HEAD:
            break;
        case DRAGON_WALL_HEAD:
            break;
        case DRIED_KELP:
            break;
        case DRIED_KELP_BLOCK:
            break;
        case DROPPER:
            break;
        case DROWNED_SPAWN_EGG:
            break;
        case EGG:
            break;
        case ELDER_GUARDIAN_SPAWN_EGG:
            break;
        case ELYTRA:
            break;
        case EMERALD:
            break;
        case EMERALD_BLOCK:
            break;
        case EMERALD_ORE:
            break;
        case ENCHANTED_BOOK:
            break;
        case ENCHANTED_GOLDEN_APPLE:
            break;
        case ENCHANTING_TABLE:
            break;
        case ENDERMAN_SPAWN_EGG:
            break;
        case ENDERMITE_SPAWN_EGG:
            break;
        case ENDER_CHEST:
            break;
        case ENDER_EYE:
            break;
        case ENDER_PEARL:
            break;
        case END_CRYSTAL:
            break;
        case END_GATEWAY:
            break;
        case END_PORTAL:
            break;
        case END_PORTAL_FRAME:
            break;
        case END_ROD:
            break;
        case END_STONE:
            break;
        case END_STONE_BRICKS:
            break;
        case EVOKER_SPAWN_EGG:
            break;
        case EXPERIENCE_BOTTLE:
            break;
        case FARMLAND:
            break;
        case FEATHER:
            break;
        case FERMENTED_SPIDER_EYE:
            break;
        case FERN:
            break;
        case FILLED_MAP:
            break;
        case FIRE:
            break;
        case FIREWORK_ROCKET:
            break;
        case FIREWORK_STAR:
            break;
        case FIRE_CHARGE:
            break;
        case FIRE_CORAL:
            break;
        case FIRE_CORAL_BLOCK:
            break;
        case FIRE_CORAL_FAN:
            break;
        case FISHING_ROD:
            break;
        case FLINT:
            break;
        case FLINT_AND_STEEL:
            break;
        case FLOWER_POT:
            break;
        case FROSTED_ICE:
            break;
        case FURNACE:
            break;
        case FURNACE_MINECART:
            break;
        case GHAST_SPAWN_EGG:
            break;
        case GHAST_TEAR:
            break;
        case GLASS:
            break;
        case GLASS_BOTTLE:
            break;
        case GLASS_PANE:
            break;
        case GLISTERING_MELON_SLICE:
            break;
        case GLOWSTONE:
            break;
        case GLOWSTONE_DUST:
            break;
        case GOLDEN_APPLE:
            break;
        case GOLDEN_AXE:
            break;
        case GOLDEN_BOOTS:
            break;
        case GOLDEN_CARROT:
            break;
        case GOLDEN_CHESTPLATE:
            break;
        case GOLDEN_HELMET:
            break;
        case GOLDEN_HOE:
            break;
        case GOLDEN_HORSE_ARMOR:
            break;
        case GOLDEN_LEGGINGS:
            break;
        case GOLDEN_PICKAXE:
            break;
        case GOLDEN_SHOVEL:
            break;
        case GOLDEN_SWORD:
            break;
        case GOLD_BLOCK:
            break;
        case GOLD_INGOT:
            break;
        case GOLD_NUGGET:
            break;
        case GOLD_ORE:
            break;
        case GRANITE:
            break;
        case GRASS:
            break;
        case GRASS_BLOCK:
            break;
        case GRASS_PATH:
            break;
        case GRAVEL:
            break;
        case GRAY_BANNER:
            break;
        case GRAY_BED:
            break;
        case GRAY_CARPET:
            break;
        case GRAY_CONCRETE:
            break;
        case GRAY_CONCRETE_POWDER:
            break;
        case GRAY_DYE:
            break;
        case GRAY_GLAZED_TERRACOTTA:
            break;
        case GRAY_SHULKER_BOX:
            break;
        case GRAY_STAINED_GLASS:
            break;
        case GRAY_STAINED_GLASS_PANE:
            break;
        case GRAY_TERRACOTTA:
            break;
        case GRAY_WALL_BANNER:
            break;
        case GRAY_WOOL:
            break;
        case GREEN_BANNER:
            break;
        case GREEN_BED:
            break;
        case GREEN_CARPET:
            break;
        case GREEN_CONCRETE:
            break;
        case GREEN_CONCRETE_POWDER:
            break;
        case GREEN_GLAZED_TERRACOTTA:
            break;
        case GREEN_SHULKER_BOX:
            break;
        case GREEN_STAINED_GLASS:
            break;
        case GREEN_STAINED_GLASS_PANE:
            break;
        case GREEN_TERRACOTTA:
            break;
        case GREEN_WALL_BANNER:
            break;
        case GREEN_WOOL:
            break;
        case GUARDIAN_SPAWN_EGG:
            break;
        case GUNPOWDER:
            break;
        case HAY_BLOCK:
            break;
        case HEART_OF_THE_SEA:
            break;
        case HEAVY_WEIGHTED_PRESSURE_PLATE:
            break;
        case HOPPER:
            break;
        case HOPPER_MINECART:
            break;
        case HORN_CORAL:
            break;
        case HORN_CORAL_BLOCK:
            break;
        case HORN_CORAL_FAN:
            break;
        case HORSE_SPAWN_EGG:
            break;
        case HUSK_SPAWN_EGG:
            break;
        case ICE:
            break;
        case INFESTED_CHISELED_STONE_BRICKS:
            break;
        case INFESTED_COBBLESTONE:
            break;
        case INFESTED_CRACKED_STONE_BRICKS:
            break;
        case INFESTED_MOSSY_STONE_BRICKS:
            break;
        case INFESTED_STONE:
            break;
        case INFESTED_STONE_BRICKS:
            break;
        case INK_SAC:
            break;
        case IRON_AXE:
            break;
        case IRON_BARS:
            break;
        case IRON_BLOCK:
            break;
        case IRON_BOOTS:
            break;
        case IRON_CHESTPLATE:
            break;
        case IRON_DOOR:
            break;
        case IRON_HELMET:
            break;
        case IRON_HOE:
            break;
        case IRON_HORSE_ARMOR:
            break;
        case IRON_INGOT:
            break;
        case IRON_LEGGINGS:
            break;
        case IRON_NUGGET:
            break;
        case IRON_ORE:
            break;
        case IRON_PICKAXE:
            break;
        case IRON_SHOVEL:
            break;
        case IRON_SWORD:
            break;
        case IRON_TRAPDOOR:
            break;
        case ITEM_FRAME:
            break;
        case JACK_O_LANTERN:
            break;
        case JUKEBOX:
            break;
        case JUNGLE_BOAT:
            break;
        case JUNGLE_BUTTON:
            break;
        case JUNGLE_DOOR:
            break;
        case JUNGLE_FENCE:
            break;
        case JUNGLE_FENCE_GATE:
            break;
        case JUNGLE_LEAVES:
            break;
        case JUNGLE_LOG:
            break;
        case JUNGLE_PLANKS:
            break;
        case JUNGLE_PRESSURE_PLATE:
            break;
        case JUNGLE_SAPLING:
            break;
        case JUNGLE_SLAB:
            break;
        case JUNGLE_STAIRS:
            break;
        case JUNGLE_TRAPDOOR:
            break;
        case JUNGLE_WOOD:
            break;
        case KELP:
            break;
        case KELP_PLANT:
            break;
        case KNOWLEDGE_BOOK:
            break;
        case LADDER:
            break;
        case LAPIS_BLOCK:
            break;
        case LAPIS_LAZULI:
            break;
        case LAPIS_ORE:
            break;
        case LARGE_FERN:
            break;
        case LAVA:
            break;
        case LAVA_BUCKET:
            break;
        case LEAD:
            break;
        case LEATHER:
            break;
        case LEATHER_BOOTS:
            break;
        case LEATHER_CHESTPLATE:
            break;
        case LEATHER_HELMET:
            break;
        case LEATHER_LEGGINGS:
            break;
        case LEVER:
            break;
        case LIGHT_BLUE_BANNER:
            break;
        case LIGHT_BLUE_BED:
            break;
        case LIGHT_BLUE_CARPET:
            break;
        case LIGHT_BLUE_CONCRETE:
            break;
        case LIGHT_BLUE_CONCRETE_POWDER:
            break;
        case LIGHT_BLUE_DYE:
            break;
        case LIGHT_BLUE_GLAZED_TERRACOTTA:
            break;
        case LIGHT_BLUE_SHULKER_BOX:
            break;
        case LIGHT_BLUE_STAINED_GLASS:
            break;
        case LIGHT_BLUE_STAINED_GLASS_PANE:
            break;
        case LIGHT_BLUE_TERRACOTTA:
            break;
        case LIGHT_BLUE_WALL_BANNER:
            break;
        case LIGHT_BLUE_WOOL:
            break;
        case LIGHT_GRAY_BANNER:
            break;
        case LIGHT_GRAY_BED:
            break;
        case LIGHT_GRAY_CARPET:
            break;
        case LIGHT_GRAY_CONCRETE:
            break;
        case LIGHT_GRAY_CONCRETE_POWDER:
            break;
        case LIGHT_GRAY_DYE:
            break;
        case LIGHT_GRAY_GLAZED_TERRACOTTA:
            break;
        case LIGHT_GRAY_SHULKER_BOX:
            break;
        case LIGHT_GRAY_STAINED_GLASS:
            break;
        case LIGHT_GRAY_STAINED_GLASS_PANE:
            break;
        case LIGHT_GRAY_TERRACOTTA:
            break;
        case LIGHT_GRAY_WALL_BANNER:
            break;
        case LIGHT_GRAY_WOOL:
            break;
        case LIGHT_WEIGHTED_PRESSURE_PLATE:
            break;
        case LILAC:
            break;
        case LILY_PAD:
            break;
        case LIME_BANNER:
            break;
        case LIME_BED:
            break;
        case LIME_CARPET:
            break;
        case LIME_CONCRETE:
            break;
        case LIME_CONCRETE_POWDER:
            break;
        case LIME_DYE:
            break;
        case LIME_GLAZED_TERRACOTTA:
            break;
        case LIME_SHULKER_BOX:
            break;
        case LIME_STAINED_GLASS:
            break;
        case LIME_STAINED_GLASS_PANE:
            break;
        case LIME_TERRACOTTA:
            break;
        case LIME_WALL_BANNER:
            break;
        case LIME_WOOL:
            break;
        case LINGERING_POTION:
            break;
        case LLAMA_SPAWN_EGG:
            break;
        case MAGENTA_BANNER:
            break;
        case MAGENTA_BED:
            break;
        case MAGENTA_CARPET:
            break;
        case MAGENTA_CONCRETE:
            break;
        case MAGENTA_CONCRETE_POWDER:
            break;
        case MAGENTA_DYE:
            break;
        case MAGENTA_GLAZED_TERRACOTTA:
            break;
        case MAGENTA_SHULKER_BOX:
            break;
        case MAGENTA_STAINED_GLASS:
            break;
        case MAGENTA_STAINED_GLASS_PANE:
            break;
        case MAGENTA_TERRACOTTA:
            break;
        case MAGENTA_WALL_BANNER:
            break;
        case MAGENTA_WOOL:
            break;
        case MAGMA_BLOCK:
            break;
        case MAGMA_CREAM:
            break;
        case MAGMA_CUBE_SPAWN_EGG:
            break;
        case MAP:
            break;
        case MELON:
            break;
        case MELON_SEEDS:
            break;
        case MELON_SLICE:
            break;
        case MELON_STEM:
            break;
        case MILK_BUCKET:
            break;
        case MINECART:
            break;
        case MOOSHROOM_SPAWN_EGG:
            break;
        case MOSSY_COBBLESTONE:
            break;
        case MOSSY_COBBLESTONE_WALL:
            break;
        case MOSSY_STONE_BRICKS:
            break;
        case MOVING_PISTON:
            break;
        case MULE_SPAWN_EGG:
            break;
        case MUSHROOM_STEM:
            break;
        case MUSHROOM_STEW:
            break;
        case MUSIC_DISC_11:
            break;
        case MUSIC_DISC_13:
            break;
        case MUSIC_DISC_BLOCKS:
            break;
        case MUSIC_DISC_CAT:
            break;
        case MUSIC_DISC_CHIRP:
            break;
        case MUSIC_DISC_FAR:
            break;
        case MUSIC_DISC_MALL:
            break;
        case MUSIC_DISC_MELLOHI:
            break;
        case MUSIC_DISC_STAL:
            break;
        case MUSIC_DISC_STRAD:
            break;
        case MUSIC_DISC_WAIT:
            break;
        case MUSIC_DISC_WARD:
            break;
        case MUTTON:
            break;
        case MYCELIUM:
            break;
        case NAME_TAG:
            break;
        case NAUTILUS_SHELL:
            break;
        case NETHERRACK:
            break;
        case NETHER_BRICK:
            break;
        case NETHER_BRICKS:
            break;
        case NETHER_BRICK_FENCE:
            break;
        case NETHER_BRICK_SLAB:
            break;
        case NETHER_BRICK_STAIRS:
            break;
        case NETHER_PORTAL:
            break;
        case NETHER_QUARTZ_ORE:
            break;
        case NETHER_STAR:
            break;
        case NETHER_WART:
            break;
        case NETHER_WART_BLOCK:
            break;
        case NOTE_BLOCK:
            break;
        case OAK_BOAT:
            break;
        case OAK_BUTTON:
            break;
        case OAK_DOOR:
            break;
        case OAK_FENCE:
            break;
        case OAK_FENCE_GATE:
            break;
        case OAK_LEAVES:
            break;
        case OAK_LOG:
            break;
        case OAK_PLANKS:
            break;
        case OAK_PRESSURE_PLATE:
            break;
        case OAK_SAPLING:
            break;
        case OAK_SLAB:
            break;
        case OAK_STAIRS:
            break;
        case OAK_TRAPDOOR:
            break;
        case OAK_WOOD:
            break;
        case OBSERVER:
            break;
        case OBSIDIAN:
            break;
        case OCELOT_SPAWN_EGG:
            break;
        case ORANGE_BANNER:
            break;
        case ORANGE_BED:
            break;
        case ORANGE_CARPET:
            break;
        case ORANGE_CONCRETE:
            break;
        case ORANGE_CONCRETE_POWDER:
            break;
        case ORANGE_DYE:
            break;
        case ORANGE_GLAZED_TERRACOTTA:
            break;
        case ORANGE_SHULKER_BOX:
            break;
        case ORANGE_STAINED_GLASS:
            break;
        case ORANGE_STAINED_GLASS_PANE:
            break;
        case ORANGE_TERRACOTTA:
            break;
        case ORANGE_TULIP:
            break;
        case ORANGE_WALL_BANNER:
            break;
        case ORANGE_WOOL:
            break;
        case OXEYE_DAISY:
            break;
        case PACKED_ICE:
            break;
        case PAINTING:
            break;
        case PAPER:
            break;
        case PARROT_SPAWN_EGG:
            break;
        case PEONY:
            break;
        case PETRIFIED_OAK_SLAB:
            break;
        case PHANTOM_MEMBRANE:
            break;
        case PHANTOM_SPAWN_EGG:
            break;
        case PIG_SPAWN_EGG:
            break;
        case PINK_BANNER:
            break;
        case PINK_BED:
            break;
        case PINK_CARPET:
            break;
        case PINK_CONCRETE:
            break;
        case PINK_CONCRETE_POWDER:
            break;
        case PINK_DYE:
            break;
        case PINK_GLAZED_TERRACOTTA:
            break;
        case PINK_SHULKER_BOX:
            break;
        case PINK_STAINED_GLASS:
            break;
        case PINK_STAINED_GLASS_PANE:
            break;
        case PINK_TERRACOTTA:
            break;
        case PINK_TULIP:
            break;
        case PINK_WALL_BANNER:
            break;
        case PINK_WOOL:
            break;
        case PISTON:
            break;
        case PISTON_HEAD:
            break;
        case PLAYER_HEAD:
            break;
        case PLAYER_WALL_HEAD:
            break;
        case PODZOL:
            break;
        case POISONOUS_POTATO:
            break;
        case POLAR_BEAR_SPAWN_EGG:
            break;
        case POLISHED_ANDESITE:
            break;
        case POLISHED_DIORITE:
            break;
        case POLISHED_GRANITE:
            break;
        case POPPED_CHORUS_FRUIT:
            break;
        case POPPY:
            break;
        case PORKCHOP:
            break;
        case POTATO:
            break;
        case POTATOES:
            break;
        case POTION:
            break;
        case POTTED_ACACIA_SAPLING:
            break;
        case POTTED_ALLIUM:
            break;
        case POTTED_AZURE_BLUET:
            break;
        case POTTED_BIRCH_SAPLING:
            break;
        case POTTED_BLUE_ORCHID:
            break;
        case POTTED_BROWN_MUSHROOM:
            break;
        case POTTED_CACTUS:
            break;
        case POTTED_DANDELION:
            break;
        case POTTED_DARK_OAK_SAPLING:
            break;
        case POTTED_DEAD_BUSH:
            break;
        case POTTED_FERN:
            break;
        case POTTED_JUNGLE_SAPLING:
            break;
        case POTTED_OAK_SAPLING:
            break;
        case POTTED_ORANGE_TULIP:
            break;
        case POTTED_OXEYE_DAISY:
            break;
        case POTTED_PINK_TULIP:
            break;
        case POTTED_POPPY:
            break;
        case POTTED_RED_MUSHROOM:
            break;
        case POTTED_RED_TULIP:
            break;
        case POTTED_SPRUCE_SAPLING:
            break;
        case POTTED_WHITE_TULIP:
            break;
        case POWERED_RAIL:
            break;
        case PRISMARINE:
            break;
        case PRISMARINE_BRICKS:
            break;
        case PRISMARINE_BRICK_SLAB:
            break;
        case PRISMARINE_BRICK_STAIRS:
            break;
        case PRISMARINE_CRYSTALS:
            break;
        case PRISMARINE_SHARD:
            break;
        case PRISMARINE_SLAB:
            break;
        case PRISMARINE_STAIRS:
            break;
        case PUFFERFISH:
            break;
        case PUFFERFISH_BUCKET:
            break;
        case PUFFERFISH_SPAWN_EGG:
            break;
        case PUMPKIN:
            break;
        case PUMPKIN_PIE:
            break;
        case PUMPKIN_SEEDS:
            break;
        case PUMPKIN_STEM:
            break;
        case PURPLE_BANNER:
            break;
        case PURPLE_BED:
            break;
        case PURPLE_CARPET:
            break;
        case PURPLE_CONCRETE:
            break;
        case PURPLE_CONCRETE_POWDER:
            break;
        case PURPLE_DYE:
            break;
        case PURPLE_GLAZED_TERRACOTTA:
            break;
        case PURPLE_SHULKER_BOX:
            break;
        case PURPLE_STAINED_GLASS:
            break;
        case PURPLE_STAINED_GLASS_PANE:
            break;
        case PURPLE_TERRACOTTA:
            break;
        case PURPLE_WALL_BANNER:
            break;
        case PURPLE_WOOL:
            break;
        case PURPUR_BLOCK:
            break;
        case PURPUR_PILLAR:
            break;
        case PURPUR_SLAB:
            break;
        case PURPUR_STAIRS:
            break;
        case QUARTZ:
            break;
        case QUARTZ_BLOCK:
            break;
        case QUARTZ_PILLAR:
            break;
        case QUARTZ_SLAB:
            break;
        case QUARTZ_STAIRS:
            break;
        case RABBIT:
            break;
        case RABBIT_FOOT:
            break;
        case RABBIT_HIDE:
            break;
        case RABBIT_SPAWN_EGG:
            break;
        case RABBIT_STEW:
            break;
        case RAIL:
            break;
        case REDSTONE:
            break;
        case REDSTONE_BLOCK:
            break;
        case REDSTONE_LAMP:
            break;
        case REDSTONE_ORE:
            break;
        case REDSTONE_TORCH:
            break;
        case REDSTONE_WALL_TORCH:
            break;
        case REDSTONE_WIRE:
            break;
        case RED_BANNER:
            break;
        case RED_BED:
            break;
        case RED_CARPET:
            break;
        case RED_CONCRETE:
            break;
        case RED_CONCRETE_POWDER:
            break;
        case RED_GLAZED_TERRACOTTA:
            break;
        case RED_MUSHROOM:
            break;
        case RED_MUSHROOM_BLOCK:
            break;
        case RED_NETHER_BRICKS:
            break;
        case RED_SAND:
            break;
        case RED_SANDSTONE:
            break;
        case RED_SANDSTONE_SLAB:
            break;
        case RED_SANDSTONE_STAIRS:
            break;
        case RED_SHULKER_BOX:
            break;
        case RED_STAINED_GLASS:
            break;
        case RED_STAINED_GLASS_PANE:
            break;
        case RED_TERRACOTTA:
            break;
        case RED_TULIP:
            break;
        case RED_WALL_BANNER:
            break;
        case RED_WOOL:
            break;
        case REPEATER:
            break;
        case REPEATING_COMMAND_BLOCK:
            break;
        case ROSE_BUSH:
            break;
        case ROSE_RED:
            break;
        case ROTTEN_FLESH:
            break;
        case SADDLE:
            break;
        case SALMON:
            break;
        case SALMON_BUCKET:
            break;
        case SALMON_SPAWN_EGG:
            break;
        case SAND:
            break;
        case SANDSTONE:
            break;
        case SANDSTONE_SLAB:
            break;
        case SANDSTONE_STAIRS:
            break;
        case SCUTE:
            break;
        case SEAGRASS:
            break;
        case SEA_LANTERN:
            break;
        case SEA_PICKLE:
            break;
        case SHEARS:
            break;
        case SHEEP_SPAWN_EGG:
            break;
        case SHIELD:
            break;
        case SHULKER_BOX:
            break;
        case SHULKER_SHELL:
            break;
        case SHULKER_SPAWN_EGG:
            break;
        case SIGN:
            break;
        case SILVERFISH_SPAWN_EGG:
            break;
        case SKELETON_HORSE_SPAWN_EGG:
            break;
        case SKELETON_SKULL:
            break;
        case SKELETON_SPAWN_EGG:
            break;
        case SKELETON_WALL_SKULL:
            break;
        case SLIME_BALL:
            break;
        case SLIME_BLOCK:
            break;
        case SLIME_SPAWN_EGG:
            break;
        case SMOOTH_QUARTZ:
            break;
        case SMOOTH_RED_SANDSTONE:
            break;
        case SMOOTH_SANDSTONE:
            break;
        case SMOOTH_STONE:
            break;
        case SNOW:
            break;
        case SNOWBALL:
            break;
        case SNOW_BLOCK:
            break;
        case SOUL_SAND:
            break;
        case SPAWNER:
            break;
        case SPECTRAL_ARROW:
            break;
        case SPIDER_EYE:
            break;
        case SPIDER_SPAWN_EGG:
            break;
        case SPLASH_POTION:
            break;
        case SPONGE:
            break;
        case SPRUCE_BOAT:
            break;
        case SPRUCE_BUTTON:
            break;
        case SPRUCE_DOOR:
            break;
        case SPRUCE_FENCE:
            break;
        case SPRUCE_FENCE_GATE:
            break;
        case SPRUCE_LEAVES:
            break;
        case SPRUCE_LOG:
            break;
        case SPRUCE_PLANKS:
            break;
        case SPRUCE_PRESSURE_PLATE:
            break;
        case SPRUCE_SAPLING:
            break;
        case SPRUCE_SLAB:
            break;
        case SPRUCE_STAIRS:
            break;
        case SPRUCE_TRAPDOOR:
            break;
        case SPRUCE_WOOD:
            break;
        case SQUID_SPAWN_EGG:
            break;
        case STICK:
            break;
        case STICKY_PISTON:
            break;
        case STONE:
            break;
        case STONE_AXE:
            break;
        case STONE_BRICKS:
            break;
        case STONE_BRICK_SLAB:
            break;
        case STONE_BRICK_STAIRS:
            break;
        case STONE_BUTTON:
            break;
        case STONE_HOE:
            break;
        case STONE_PICKAXE:
            break;
        case STONE_PRESSURE_PLATE:
            break;
        case STONE_SHOVEL:
            break;
        case STONE_SLAB:
            break;
        case STONE_SWORD:
            break;
        case STRAY_SPAWN_EGG:
            break;
        case STRING:
            break;
        case STRIPPED_ACACIA_LOG:
            break;
        case STRIPPED_ACACIA_WOOD:
            break;
        case STRIPPED_BIRCH_LOG:
            break;
        case STRIPPED_BIRCH_WOOD:
            break;
        case STRIPPED_DARK_OAK_LOG:
            break;
        case STRIPPED_DARK_OAK_WOOD:
            break;
        case STRIPPED_JUNGLE_LOG:
            break;
        case STRIPPED_JUNGLE_WOOD:
            break;
        case STRIPPED_OAK_LOG:
            break;
        case STRIPPED_OAK_WOOD:
            break;
        case STRIPPED_SPRUCE_LOG:
            break;
        case STRIPPED_SPRUCE_WOOD:
            break;
        case STRUCTURE_BLOCK:
            break;
        case STRUCTURE_VOID:
            break;
        case SUGAR:
            break;
        case SUGAR_CANE:
            break;
        case SUNFLOWER:
            break;
        case TALL_GRASS:
            break;
        case TALL_SEAGRASS:
            break;
        case TERRACOTTA:
            break;
        case TIPPED_ARROW:
            break;
        case TNT:
            break;
        case TNT_MINECART:
            break;
        case TORCH:
            break;
        case TOTEM_OF_UNDYING:
            break;
        case TRAPPED_CHEST:
            break;
        case TRIDENT:
            break;
        case TRIPWIRE:
            break;
        case TRIPWIRE_HOOK:
            break;
        case TROPICAL_FISH:
            break;
        case TROPICAL_FISH_BUCKET:
            break;
        case TROPICAL_FISH_SPAWN_EGG:
            break;
        case TUBE_CORAL:
            break;
        case TUBE_CORAL_BLOCK:
            break;
        case TUBE_CORAL_FAN:
            break;
        case TURTLE_EGG:
            break;
        case TURTLE_HELMET:
            break;
        case TURTLE_SPAWN_EGG:
            break;
        case VEX_SPAWN_EGG:
            break;
        case VILLAGER_SPAWN_EGG:
            break;
        case VINDICATOR_SPAWN_EGG:
            break;
        case VINE:
            break;
        case VOID_AIR:
            break;
        case WALL_SIGN:
            break;
        case WALL_TORCH:
            break;
        case WATER:
            break;
        case WATER_BUCKET:
            break;
        case WET_SPONGE:
            break;
        case WHEAT:
            break;
        case WHEAT_SEEDS:
            break;
        case WHITE_BANNER:
            break;
        case WHITE_BED:
            break;
        case WHITE_CARPET:
            break;
        case WHITE_CONCRETE:
            break;
        case WHITE_CONCRETE_POWDER:
            break;
        case WHITE_GLAZED_TERRACOTTA:
            break;
        case WHITE_SHULKER_BOX:
            break;
        case WHITE_STAINED_GLASS:
            break;
        case WHITE_STAINED_GLASS_PANE:
            break;
        case WHITE_TERRACOTTA:
            break;
        case WHITE_TULIP:
            break;
        case WHITE_WALL_BANNER:
            break;
        case WHITE_WOOL:
            break;
        case WITCH_SPAWN_EGG:
            break;
        case WITHER_SKELETON_SKULL:
            break;
        case WITHER_SKELETON_SPAWN_EGG:
            break;
        case WITHER_SKELETON_WALL_SKULL:
            break;
        case WOLF_SPAWN_EGG:
            break;
        case WOODEN_AXE:
            break;
        case WOODEN_HOE:
            break;
        case WOODEN_PICKAXE:
            break;
        case WOODEN_SHOVEL:
            break;
        case WOODEN_SWORD:
            break;
        case WRITABLE_BOOK:
            break;
        case WRITTEN_BOOK:
            break;
        case YELLOW_BANNER:
            break;
        case YELLOW_BED:
            break;
        case YELLOW_CARPET:
            break;
        case YELLOW_CONCRETE:
            break;
        case YELLOW_CONCRETE_POWDER:
            break;
        case YELLOW_GLAZED_TERRACOTTA:
            break;
        case YELLOW_SHULKER_BOX:
            break;
        case YELLOW_STAINED_GLASS:
            break;
        case YELLOW_STAINED_GLASS_PANE:
            break;
        case YELLOW_TERRACOTTA:
            break;
        case YELLOW_WALL_BANNER:
            break;
        case YELLOW_WOOL:
            break;
        case ZOMBIE_HEAD:
            break;
        case ZOMBIE_HORSE_SPAWN_EGG:
            break;
        case ZOMBIE_PIGMAN_SPAWN_EGG:
            break;
        case ZOMBIE_SPAWN_EGG:
            break;
        case ZOMBIE_VILLAGER_SPAWN_EGG:
            break;
        case ZOMBIE_WALL_HEAD:
            break;
        default:
            break;

        }
        switch (e.getClickedBlock().getType()) {
        case ANVIL:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.ANVIL);
            break;
        case BEACON:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.BEACON);
            break;
        case BED:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.BED);
            break;
        case BREWING_STAND:
        case CAULDRON:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.BREWING);
            break;
        case CHEST:
        case STORAGE_MINECART:
        case TRAPPED_CHEST:
        case BLACK_SHULKER_BOX:
        case BLUE_SHULKER_BOX:
        case BROWN_SHULKER_BOX:
        case CYAN_SHULKER_BOX:
        case GRAY_SHULKER_BOX:
        case GREEN_SHULKER_BOX:
        case LIGHT_BLUE_SHULKER_BOX:
        case LIME_SHULKER_BOX:
        case PINK_SHULKER_BOX:
        case MAGENTA_SHULKER_BOX:
        case ORANGE_SHULKER_BOX:
        case PURPLE_SHULKER_BOX:
        case RED_SHULKER_BOX:
        case SILVER_SHULKER_BOX:
        case WHITE_SHULKER_BOX:
        case YELLOW_SHULKER_BOX:
        case DISPENSER:
        case DROPPER:
        case HOPPER:
        case HOPPER_MINECART:

            checkIsland(e, e.getClickedBlock().getLocation(), Flags.CHEST);
            break;

        case ACACIA_DOOR:
        case BIRCH_DOOR:
        case DARK_OAK_DOOR:
        case IRON_DOOR:
        case IRON_DOOR_BLOCK:
        case JUNGLE_DOOR:
        case SPRUCE_DOOR:
        case WOODEN_DOOR:
        case WOOD_DOOR:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.DOOR);
            break;
        case TRAP_DOOR:
        case IRON_TRAPDOOR:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.TRAPDOOR);
            break;
        case ACACIA_FENCE_GATE:
        case BIRCH_FENCE_GATE:
        case DARK_OAK_FENCE_GATE:
        case FENCE_GATE:
        case JUNGLE_FENCE_GATE:
        case SPRUCE_FENCE_GATE:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.GATE);
            break;

        case BURNING_FURNACE:
        case FURNACE:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.FURNACE);
            break;
        case ENCHANTMENT_TABLE:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.ENCHANTING);
            break;
        case ENDER_CHEST:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.ENDER_CHEST);
            break;
        case JUKEBOX:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.JUKEBOX);
            break;
        case NOTE_BLOCK:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.NOTE_BLOCK);
            break;
        case WORKBENCH:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.CRAFTING);
            break;
        case STONE_BUTTON:
        case WOOD_BUTTON:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.BUTTON);
            break;
        case LEVER:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.LEVER);
            break;
        case DIODE:
        case DIODE_BLOCK_OFF:
        case DIODE_BLOCK_ON:
        case REDSTONE_COMPARATOR_ON:
        case REDSTONE_COMPARATOR_OFF:
        case DAYLIGHT_DETECTOR:
        case DAYLIGHT_DETECTOR_INVERTED:
        case REDSTONE_COMPARATOR:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.REDSTONE);
            break;
        case DRAGON_EGG:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.BREAK_BLOCKS);
            break;
        case ENDER_PORTAL_FRAME:
            checkIsland(e, e.getClickedBlock().getLocation(), Flags.PLACE_BLOCKS);
            break;
        case FLOWER_POT:
            FlowerPot pot = (FlowerPot) e.getClickedBlock().getState();
            if (pot.getContents() == null || pot.getContents().getItemType().equals(Material.AIR)) {
                checkIsland(e, e.getClickedBlock().getLocation(), Flags.PLACE_BLOCKS);
            } else {
                checkIsland(e, e.getClickedBlock().getLocation(), Flags.BREAK_BLOCKS);
            }
            break;
        default:
            break;

        }
        // Now check for in-hand items
        if (e.getItem() != null) {
            switch (e.getItem().getType()) {
            case ENDER_PEARL:
                checkIsland(e, e.getClickedBlock().getLocation(), Flags.ENDER_PEARL);
                break;
            case MONSTER_EGG:
                checkIsland(e, e.getClickedBlock().getLocation(), Flags.SPAWN_EGGS);
                break;
            default:
                break;

            }
        }
    }
}
