package net.kctops.hyrule_weaponry.item;

import io.netty.util.Attribute;
import net.kctops.hyrule_weaponry.HyruleWeaponry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TridentItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HyruleWeaponry.MOD_ID);

    public static final RegistryObject<Item> THING = ITEMS.register("thing", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ANCIENT_SHORT_SWORD = ITEMS.register("ancient_short_sword",
            () -> new SwordItem(ModToolTiers.ANCIENT_SOLDIER_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENT_BLADESAW = ITEMS.register("ancient_bladesaw",
            () -> new SwordItem(ModToolTiers.ANCIENT_SOLDIER_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENT_SPEAR = ITEMS.register("ancient_spear",
            () -> new SwordItem(ModToolTiers.ANCIENT_SOLDIER_GEAR, 1, 1, new Item.Properties()));
    // public static final RegistryObject<Item> ANCIENT_BOW = ITEMS.register("ancient_bow",
    // () -> new SwordItem(ModToolTiers.ANCIENT_SOLDIER_GEAR, 1, 1, new Item.Properties()));
    // public static final RegistryObject<Item> ANCIENT_ARROW = ITEMS.register("ancient_arrow",
    // () -> new SwordItem(ModToolTiers.ANCIENT_SOLDIER_GEAR, 1, 1, new Item.Properties()));
    // public static final RegistryObject<Item> ANCIENT_SHIELD = ITEMS.register("ancient_shield",
    // () -> new SwordItem(ModToolTiers.ANCIENT_SOLDIER_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> BOKO_CLUB = ITEMS.register("boko_club",
            () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SPIKED_BOKO_CLUB = ITEMS.register("spiked_boko_club",
            () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_BOKO_CLUB = ITEMS.register("dragonbone_boko_club",
            () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> BOKO_BAT = ITEMS.register("boko_bat",
            () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SPIKED_BOKO_BAT = ITEMS.register("spiked_boko_bat",
            () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_BOKO_BAT = ITEMS.register("dragonbone_boko_bat",
            () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> BOKO_SPEAR = ITEMS.register("boko_spear",
            () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SPIKED_BOKO_SPEAR = ITEMS.register("spiked_boko_spear",
            () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_BOKO_SPEAR = ITEMS.register("dragonbone_boko_spear",
            () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
//     public static final RegistryObject<Item> BOKO_BOW = ITEMS.register("ancient_short_sword",
//             () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
//     public static final RegistryObject<Item> SPIKED_BOKO_BOW = ITEMS.register("ancient_short_sword",
//             () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
//     public static final RegistryObject<Item> DRAGONBONE_BOKO_BOW = ITEMS.register("ancient_short_sword",
//             () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
//     public static final RegistryObject<Item> BOKO_SHIELD = ITEMS.register("ancient_short_sword",
//             () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
//     public static final RegistryObject<Item> SPIKED_BOKO_SHIELD = ITEMS.register("ancient_short_sword",
//             () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));
//     public static final RegistryObject<Item> DRAGONBONE_BOKO_SHIELD = ITEMS.register("ancient_short_sword",
//             () -> new SwordItem(ModToolTiers.BOKOBLIN_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> GERUDO_SCIMITAR = ITEMS.register("gerudo_scimitar",
            () -> new SwordItem(ModToolTiers.GERUDO_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MOONLIGHT_SCIMITAR = ITEMS.register("moonlight_scimitar",
            () -> new SwordItem(ModToolTiers.GERUDO_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SCIMITAR_OF_THE_SEVEN = ITEMS.register("scimitar_of_the_seven",
            () -> new SwordItem(ModToolTiers.GERUDO_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_CLAYMORE = ITEMS.register("golden_claymore",
            () -> new SwordItem(ModToolTiers.GERUDO_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GERUDO_SPEAR = ITEMS.register("gerudo_spear",
            () -> new SwordItem(ModToolTiers.GERUDO_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_BOW = ITEMS.register("golden_bow",
            () -> new SwordItem(ModToolTiers.GERUDO_GEAR, 1, 1, new Item.Properties()));
// public static final RegistryObject<Item> GERUDO_SHIELD = ITEMS.register("gerudo_shield",
//         () -> new SwordItem(ModToolTiers.GERUDO_GEAR, 1, 1, new Item.Properties()));
// public static final RegistryObject<Item> RADIANT_SHIELD = ITEMS.register("radiant_shield",
//         () -> new SwordItem(ModToolTiers.GERUDO_GEAR, 1, 1, new Item.Properties()));
// public static final RegistryObject<Item> DAYBREAKER = ITEMS.register("daybreaker",
//         () -> new SwordItem(ModToolTiers.GERUDO_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> COBBLE_CRUSHER = ITEMS.register("cobble_crusher",
            () -> new SwordItem(ModToolTiers.GORON_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> STONE_SMASHER = ITEMS.register("stone_smasher",
            () -> new SwordItem(ModToolTiers.GORON_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> BOLDER_BREAKER = ITEMS.register("bolder_breaker",
            () -> new SwordItem(ModToolTiers.GORON_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRILLSHAFT = ITEMS.register("drillshaft",
            () -> new SwordItem(ModToolTiers.GORON_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> GUARDIAN_SWORD = ITEMS.register("guardian_sword",
            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GUARDIAN_SWORD_PLUS = ITEMS.register("guardian_sword_plus",
            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GUARDIAN_SWORD_PLUS_PLUS = ITEMS.register("guardian_sword_plus_plus",
            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENT_BATTLE_AXE = ITEMS.register("ancient_battle_axe",
            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENT_BATTLE_AXE_PLUS = ITEMS.register("ancient_battle_axe_plus",
            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENT_BATTLE_AXE_PLUS_PLUS = ITEMS.register("ancient_battle_axe_plus_plus",
            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GUARDIAN_SPEAR = ITEMS.register("guardian_spear",
            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GUARDIAN_SPEAR_PLUS = ITEMS.register("guardian_spear_plus",
            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GUARDIAN_SPEAR_PLUS_PLUS = ITEMS.register("guardian_spear_plus_plus",
            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> GUARDIAN_SHIELD = ITEMS.register("guardian_shield",
//            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> GUARDIAN_SHIELD_PLUS = ITEMS.register("guardian_shield_plus",
//            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> GUARDIAN_SHIELD_PLUS_PLUS = ITEMS.register("guardian_shield_plus_plus",
//            () -> new SwordItem(ModToolTiers.GUARDIAN_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> KNIGHTS_BROADSWORD = ITEMS.register("knights_broadsword",
            () -> new SwordItem(ModToolTiers.KNIGHTS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> KNIGHTS_CLAYMORE = ITEMS.register("knights_claymore",
            () -> new SwordItem(ModToolTiers.KNIGHTS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> KNIGHTS_HALBERD = ITEMS.register("knights_halberd",
            () -> new SwordItem(ModToolTiers.KNIGHTS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> KNIGHTS_BOW = ITEMS.register("knights_bow",
//            () -> new SwordItem(ModToolTiers.KNIGHTS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> KNIGHTS_SHIELD = ITEMS.register("knights_shield",
//            () -> new SwordItem(ModToolTiers.KNIGHTS_GEAR, 1, 1, new Item.Properties()));

//    public static final RegistryObject<Item> KOROK_LEAF = ITEMS.register("korok_leaf",
//            () -> new SwordItem(ModToolTiers.KOROK_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> FOREST_DWELLERS_SWORD = ITEMS.register("forest_dwellers_sword",
            () -> new SwordItem(ModToolTiers.KOROK_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> FOREST_DWELLERS_SPEAR = ITEMS.register("forest_dwellers_spear",
            () -> new SwordItem(ModToolTiers.KOROK_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> FOREST_DWELLERS_BOW = ITEMS.register("forest_dwellers_bow",
//            () -> new SwordItem(ModToolTiers.KOROK_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> FOREST_DWELLERS_SHIELD = ITEMS.register("forest_dwellers_shield",
//            () -> new SwordItem(ModToolTiers.KOROK_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> LIZAL_BOOMERANG = ITEMS.register("lizal_boomerang",
            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> LIZAL_FORKED_BOOMERANG = ITEMS.register("lizal_forked_boomerang",
            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> LIZAL_TRI_BOOMERANG = ITEMS.register("lizal_tri_boomerang",
            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> LIZAL_SPEAR = ITEMS.register("lizal_spear",
            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ENHANCED_LIZAL_SPEAR = ITEMS.register("enhanced_lizal_spear",
            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> FORKED_LIZAL_SPEAR = ITEMS.register("forked_lizal_spear",
            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> LIZAL_BOW = ITEMS.register("lizal_bow",
//            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> STRENGTHENED_LIZAL_BOW = ITEMS.register("strengthened_lizal_bow",
//            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> STEEL_LIZAL_BOW = ITEMS.register("steel_lizal_bow",
//            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> LIZAL_SHIELD = ITEMS.register("lizal_shield",
//            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> REINFORCED_LIZAL_SHIELD = ITEMS.register("reinforced_lizal_shield",
//            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> STEEL_LIZAL_SHIELD = ITEMS.register("steel_lizal_shield",
//            () -> new SwordItem(ModToolTiers.LIZALFOS_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> LYNEL_SWORD = ITEMS.register("lynel_sword",
            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MIGHTY_LYNEL_SWORD = ITEMS.register("mighty_lynel_sword",
            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAVAGE_LYNEL_SWORD = ITEMS.register("savage_lynel_sword",
            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> LYNEL_CRUSHER = ITEMS.register("lynel_crusher",
            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MIGHTY_LYNEL_CRUSHER = ITEMS.register("mighty_lynel_crusher",
            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAVAGE_LYNEL_CRUSHER = ITEMS.register("savage_lynel_crusher",
            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> LYNEL_SPEAR = ITEMS.register("lynel_spear",
            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MIGHTY_LYNEL_SPEAR = ITEMS.register("mighty_lynel_spear",
            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAVAGE_LYNEL_SPEAR = ITEMS.register("savage_lynel_spear",
            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> LYNEL_BOW = ITEMS.register("lynel_bow",
//            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> MIGHTY_LYNEL_BOW = ITEMS.register("mighty_lynel_bow",
//            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> SAVAGE_LYNEL_BOW = ITEMS.register("savage_lynel_bow",
//            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> LYNEL_SHIELD = ITEMS.register("lynel_shield",
//            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> MIGHTY_LYNEL_SHIELD = ITEMS.register("mighty_lynel_shield",
//            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> SAVAGE_LYNEL_SHIELD = ITEMS.register("savage_lynel_shield",
//            () -> new SwordItem(ModToolTiers.LYNEL_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> FLAMEBLADE = ITEMS.register("flameblade",
            () -> new SwordItem(ModToolTiers.MAGIC_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> FROSTBLADE = ITEMS.register("frostblade",
            () -> new SwordItem(ModToolTiers.MAGIC_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> THUNDERBLADE = ITEMS.register("thunderblade",
            () -> new SwordItem(ModToolTiers.MAGIC_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GREAT_FLAMEBLADE = ITEMS.register("great_flameblade",
            () -> new SwordItem(ModToolTiers.MAGIC_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GREAT_FROSTBLADE = ITEMS.register("great_frostblade",
            () -> new SwordItem(ModToolTiers.MAGIC_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GREAT_THUNDERBLADE = ITEMS.register("great_thunderblade",
            () -> new SwordItem(ModToolTiers.MAGIC_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> FLAMESPEAR = ITEMS.register("flamespear",
            () -> new SwordItem(ModToolTiers.MAGIC_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> FROSTSPEAR = ITEMS.register("frostspear",
            () -> new SwordItem(ModToolTiers.MAGIC_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> THUNDERSPEAR = ITEMS.register("thunderspear",
            () -> new SwordItem(ModToolTiers.MAGIC_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> MOBLIN_CLUB = ITEMS.register("moblin_gear",
            () -> new SwordItem(ModToolTiers.MOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SPIKED_MOBLIN_CLUB = ITEMS.register("spiked_moblin_gear",
            () -> new SwordItem(ModToolTiers.MOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_MOBLIN_CLUB = ITEMS.register("dragonbone_moblin_gear",
            () -> new SwordItem(ModToolTiers.MOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MOBLIN_SPEAR = ITEMS.register("moblin_spear",
            () -> new SwordItem(ModToolTiers.MOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SPIKED_MOBLIN_SPEAR = ITEMS.register("spiked_moblin_spear",
            () -> new SwordItem(ModToolTiers.MOBLIN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_MOBLIN_SPEAR = ITEMS.register("dragonbone_moblin_spear",
            () -> new SwordItem(ModToolTiers.MOBLIN_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> FEATHERED_EDGE = ITEMS.register("feathered_edge",
            () -> new SwordItem(ModToolTiers.RITO_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> FEATHERED_SPEAR = ITEMS.register("feathered_spear",
            () -> new SwordItem(ModToolTiers.RITO_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> SWALLOW_BOW = ITEMS.register("swallow_bow",
//            () -> new SwordItem(ModToolTiers.RITO_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> FALCON_BOW = ITEMS.register("falcon_bow",
//            () -> new SwordItem(ModToolTiers.RITO_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> GREAT_EAGLE_BOW = ITEMS.register("great_eagle_bow",
//            () -> new SwordItem(ModToolTiers.RITO_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> KITE_SHIELD = ITEMS.register("kite_shield",
//            () -> new SwordItem(ModToolTiers.RITO_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> ROYAL_BROADSWORD = ITEMS.register("royal_broadsword",
            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ROYAL_CLAYMORE = ITEMS.register("royal_claymore",
            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ROYAL_HALBERD = ITEMS.register("royal_halberd",
            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> ROYAL_BOW = ITEMS.register("royal_bow",
//            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> ROYAL_SHIELD = ITEMS.register("royal_shield",
//            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> ROYAL_GUARDS_BROADSWORD = ITEMS.register("royal_guards_broadsword",
            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ROYAL_GUARDS_CLAYMORE = ITEMS.register("royal_guards_claymore",
            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ROYAL_GUARDS_HALBERD = ITEMS.register("royal_guards_halberd",
            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> ROYAL_GUARDS_BOW = ITEMS.register("royal_guards_bow",
//            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> ROYAL_GUARDS_SHIELD = ITEMS.register("royal_guards_shield",
//            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> RUSTY_BROADSWORD = ITEMS.register("rusty_broadsword",
            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_CLAYMORE = ITEMS.register("rusty_claymore",
            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> RUSTY_HALBERD = ITEMS.register("rusty_halberd",
            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> RUSTY_SHIELD = ITEMS.register("rusty_shield",
//            () -> new SwordItem(ModToolTiers.ROYAL_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> EIGHTFOLD_BLADE = ITEMS.register("eightfold_blade",
            () -> new SwordItem(ModToolTiers.SHIEKAH_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> EIGHTFOLD_LONGBLADE = ITEMS.register("eightfold_longblade",
            () -> new SwordItem(ModToolTiers.SHIEKAH_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> EDGE_OF_DUALITY = ITEMS.register("edge_of_duality",
            () -> new SwordItem(ModToolTiers.SHIEKAH_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SERPENTINE_SPEAR = ITEMS.register("serpentine_spear",
            () -> new SwordItem(ModToolTiers.SHIEKAH_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> PHRENIC_BOW = ITEMS.register("phrenic_bow",
//            () -> new SwordItem(ModToolTiers.SHIEKAH_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> SHIELD_OF_THE_MINDS_EYE = ITEMS.register("shield_of_the_minds_eye",
//            () -> new SwordItem(ModToolTiers.SHIEKAH_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> SOLDIERS_BROADSWORD = ITEMS.register("soldiers_broadsword",
            () -> new SwordItem(ModToolTiers.SOLDIERS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SOLDIERS_CLAYMORE = ITEMS.register("soldiers_claymore",
            () -> new SwordItem(ModToolTiers.SOLDIERS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SOLDIERS_SPEAR = ITEMS.register("soldiers_spear",
            () -> new SwordItem(ModToolTiers.SOLDIERS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> SOLDIERS_BOW = ITEMS.register("soldiers_bow",
//            () -> new SwordItem(ModToolTiers.SOLDIERS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> SOLDIERS_SHIELD = ITEMS.register("soldiers_shield",
//            () -> new SwordItem(ModToolTiers.SOLDIERS_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> TRAVELERS_SWORD = ITEMS.register("travelers_sword",
            () -> new SwordItem(ModToolTiers.TRAVELERS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> TRAVELERS_CLAYMORE = ITEMS.register("travelers_claymore",
            () -> new SwordItem(ModToolTiers.TRAVELERS_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> TRAVELERS_SPEAR = ITEMS.register("travelers_spear",
            () -> new SwordItem(ModToolTiers.TRAVELERS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> TRAVELERS_BOW = ITEMS.register("travelers_bow",
//            () -> new SwordItem(ModToolTiers.TRAVELERS_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> TRAVELERS_SHIELD = ITEMS.register("travelers_shield",
//            () -> new SwordItem(ModToolTiers.TRAVELERS_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> VICIOUS_SICKLE = ITEMS.register("vicious_sickle",
            () -> new SwordItem(ModToolTiers.YIGA_CLAN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DEMON_CARVER = ITEMS.register("demon_carver",
            () -> new SwordItem(ModToolTiers.YIGA_CLAN_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> WINDCLEAVER = ITEMS.register("windcleaver",
            () -> new SwordItem(ModToolTiers.YIGA_CLAN_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> DUPLEX_BOW = ITEMS.register("duplex_bow",
//            () -> new SwordItem(ModToolTiers.YIGA_CLAN_GEAR, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> ZORA_SWORD = ITEMS.register("zora_sword",
            () -> new SwordItem(ModToolTiers.ZORA_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_LONGSWORD = ITEMS.register("silver_longsword",
            () -> new SwordItem(ModToolTiers.ZORA_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ZORA_SPEAR = ITEMS.register("zora_spear",
            () -> new SwordItem(ModToolTiers.ZORA_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SILVERSCALE_SPEAR = ITEMS.register("silverscale_spear",
            () -> new SwordItem(ModToolTiers.ZORA_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> CEREMONIAL_TRIDENT = ITEMS.register("ceremonial_trident",
            () -> new SwordItem(ModToolTiers.ZORA_GEAR, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> LIGHTSCALE_TRIDENT = ITEMS.register("lightscale_trident",
            () -> new SwordItem(ModToolTiers.ZORA_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> SILVER_BOW = ITEMS.register("silver_bow",
//            () -> new SwordItem(ModToolTiers.ZORA_GEAR, 1, 1, new Item.Properties()));
//    public static final RegistryObject<Item> SILVER_SHIELD = ITEMS.register("silver_shield",
//            () -> new SwordItem(ModToolTiers.ZORA_GEAR, 1, 1, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
