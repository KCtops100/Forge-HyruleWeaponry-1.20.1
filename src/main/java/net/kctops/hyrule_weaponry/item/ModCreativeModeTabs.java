package net.kctops.hyrule_weaponry.item;

import net.kctops.hyrule_weaponry.HyruleWeaponry;
import net.kctops.hyrule_weaponry.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HyruleWeaponry.MOD_ID);
    public static final RegistryObject<CreativeModeTab> HYRULE_WEAPONS_TAB = CREATIVE_MODE_TABS.register("hyrule_weapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.THING.get()))
                    .title(Component.translatable("creativetab.hyrule_weapons_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_BLADESAW.get());
                        pOutput.accept(ModItems.ANCIENT_SPEAR.get());
//                        pOutput.accept(ModItems.ANCIENT_BOW.get());
//                        pOutput.accept(ModItems.ANCIENT_ARROW.get());
//                        pOutput.accept(ModItems.ANCIENT_SHIELD.get());

                        pOutput.accept(ModItems.BOKO_CLUB.get());
                        pOutput.accept(ModItems.SPIKED_BOKO_CLUB.get());
                        pOutput.accept(ModItems.DRAGONBONE_BOKO_CLUB.get());
                        pOutput.accept(ModItems.BOKO_BAT.get());
                        pOutput.accept(ModItems.SPIKED_BOKO_BAT.get());
                        pOutput.accept(ModItems.DRAGONBONE_BOKO_BAT.get());
                        pOutput.accept(ModItems.BOKO_SPEAR.get());
                        pOutput.accept(ModItems.SPIKED_BOKO_SPEAR.get());
                        pOutput.accept(ModItems.DRAGONBONE_BOKO_SPEAR.get());
//                        pOutput.accept(ModItems.BOKO_BOW.get());
//                        pOutput.accept(ModItems.SPIKED_BOKO_BOW.get());
//                        pOutput.accept(ModItems.DRAGONBONE_BOKO_BOW.get());
//                        pOutput.accept(ModItems.BOKO_SHIELD.get());
//                        pOutput.accept(ModItems.SPIKED_BOKO_SHIELD.get());
//                        pOutput.accept(ModItems.DRAGONBONE_BOKO_SHIELD.get());

                        pOutput.accept(ModItems.GERUDO_SCIMITAR.get());
                        pOutput.accept(ModItems.MOONLIGHT_SCIMITAR.get());
                        pOutput.accept(ModItems.SCIMITAR_OF_THE_SEVEN.get());
                        pOutput.accept(ModItems.GOLDEN_CLAYMORE.get());
                        pOutput.accept(ModItems.GERUDO_SPEAR.get());
                        pOutput.accept(ModItems.GOLDEN_BOW.get());
//                        pOutput.accept(ModItems.GERUDO_SHIELD.get());
//                        pOutput.accept(ModItems.RADIANT_SHIELD.get());
//                        pOutput.accept(ModItems.DAYBREAKER.get());

                        pOutput.accept(ModItems.COBBLE_CRUSHER.get());
                        pOutput.accept(ModItems.STONE_SMASHER.get());
                        pOutput.accept(ModItems.BOLDER_BREAKER.get());
                        pOutput.accept(ModItems.DRILLSHAFT.get());

                        pOutput.accept(ModItems.GUARDIAN_SWORD.get());
                        pOutput.accept(ModItems.GUARDIAN_SWORD_PLUS.get());
                        pOutput.accept(ModItems.GUARDIAN_SWORD_PLUS_PLUS.get());
                        pOutput.accept(ModItems.ANCIENT_BATTLE_AXE.get());
                        pOutput.accept(ModItems.ANCIENT_BATTLE_AXE_PLUS.get());
                        pOutput.accept(ModItems.ANCIENT_BATTLE_AXE_PLUS_PLUS.get());
                        pOutput.accept(ModItems.GUARDIAN_SPEAR.get());
                        pOutput.accept(ModItems.GUARDIAN_SPEAR_PLUS.get());
                        pOutput.accept(ModItems.GUARDIAN_SPEAR_PLUS_PLUS.get());
//                        pOutput.accept(ModItems.GUARDIAN_SHIELD.get());
//                        pOutput.accept(ModItems.GUARDIAN_SHIELD_PLUS.get());
//                        pOutput.accept(ModItems.GUARDIAN_SHIELD_PLUS_PLUS.get());

                        pOutput.accept(ModItems.KNIGHTS_BROADSWORD.get());
                        pOutput.accept(ModItems.KNIGHTS_CLAYMORE.get());
                        pOutput.accept(ModItems.KNIGHTS_HALBERD.get());
//                        pOutput.accept(ModItems.KNIGHTS_BOW.get());
//                        pOutput.accept(ModItems.KNIGHTS_SHIELD.get());

//                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.FOREST_DWELLERS_SWORD.get());
                        pOutput.accept(ModItems.FOREST_DWELLERS_SPEAR.get());
//                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
//                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());

                        pOutput.accept(ModItems.LIZAL_BOOMERANG.get());
                        pOutput.accept(ModItems.LIZAL_FORKED_BOOMERANG.get());
                        pOutput.accept(ModItems.LIZAL_TRI_BOOMERANG.get());
                        pOutput.accept(ModItems.LIZAL_SPEAR.get());
                        pOutput.accept(ModItems.ENHANCED_LIZAL_SPEAR.get());
                        pOutput.accept(ModItems.FORKED_LIZAL_SPEAR.get());
//                        pOutput.accept(ModItems.LIZAL_BOW.get());
//                        pOutput.accept(ModItems.STRENGTHENED_LIZAL_BOW.get());
//                        pOutput.accept(ModItems.STEEL_LIZAL_BOW.get());
//                        pOutput.accept(ModItems.LIZAL_SHIELD.get());
//                        pOutput.accept(ModItems.REINFORCED_LIZAL_SHIELD.get());
//                        pOutput.accept(ModItems.STEEL_LIZAL_SHIELD.get());

                        pOutput.accept(ModItems.LYNEL_SWORD.get());
                        pOutput.accept(ModItems.MIGHTY_LYNEL_SWORD.get());
                        pOutput.accept(ModItems.SAVAGE_LYNEL_SWORD.get());
                        pOutput.accept(ModItems.LYNEL_CRUSHER.get());
                        pOutput.accept(ModItems.MIGHTY_LYNEL_CRUSHER.get());
                        pOutput.accept(ModItems.SAVAGE_LYNEL_CRUSHER.get());
                        pOutput.accept(ModItems.LYNEL_SPEAR.get());
                        pOutput.accept(ModItems.MIGHTY_LYNEL_SPEAR.get());
                        pOutput.accept(ModItems.SAVAGE_LYNEL_SPEAR.get());
//                        pOutput.accept(ModItems.LYNEL_BOW.get());
//                        pOutput.accept(ModItems.MIGHTY_LYNEL_BOW.get());
//                        pOutput.accept(ModItems.SAVAGE_LYNEL_BOW.get());
//                        pOutput.accept(ModItems.LYNEL_SHIELD.get());
//                        pOutput.accept(ModItems.MIGHTY_LYNEL_SHIELD.get());
//                        pOutput.accept(ModItems.SAVAGE_LYNEL_SHIELD.get());

                        pOutput.accept(ModItems.FLAMEBLADE.get());
                        pOutput.accept(ModItems.FROSTBLADE.get());
                        pOutput.accept(ModItems.THUNDERBLADE.get());
                        pOutput.accept(ModItems.GREAT_FLAMEBLADE.get());
                        pOutput.accept(ModItems.GREAT_FROSTBLADE.get());
                        pOutput.accept(ModItems.GREAT_THUNDERBLADE.get());
                        pOutput.accept(ModItems.FLAMESPEAR.get());
                        pOutput.accept(ModItems.FROSTSPEAR.get());
                        pOutput.accept(ModItems.THUNDERSPEAR.get());

                        pOutput.accept(ModItems.MOBLIN_CLUB.get());
                        pOutput.accept(ModItems.SPIKED_MOBLIN_CLUB.get());
                        pOutput.accept(ModItems.DRAGONBONE_MOBLIN_CLUB.get());
                        pOutput.accept(ModItems.MOBLIN_SPEAR.get());
                        pOutput.accept(ModItems.SPIKED_MOBLIN_SPEAR.get());
                        pOutput.accept(ModItems.DRAGONBONE_MOBLIN_SPEAR.get());

                        pOutput.accept(ModItems.FEATHERED_EDGE.get());
                        pOutput.accept(ModItems.FEATHERED_SPEAR.get());
//                        pOutput.accept(ModItems.SWALLOW_BOW.get());
//                        pOutput.accept(ModItems.FALCON_BOW.get());
//                        pOutput.accept(ModItems.GREAT_EAGLE_BOW.get());
//                        pOutput.accept(ModItems.KITE_SHIELD.get());

                        pOutput.accept(ModItems.ROYAL_BROADSWORD.get());
                        pOutput.accept(ModItems.ROYAL_CLAYMORE.get());
                        pOutput.accept(ModItems.ROYAL_HALBERD.get());
//                        pOutput.accept(ModItems.ROYAL_BOW.get());
//                        pOutput.accept(ModItems.ROYAL_SHIELD.get());

                        pOutput.accept(ModItems.ROYAL_GUARDS_BROADSWORD.get());
                        pOutput.accept(ModItems.ROYAL_GUARDS_CLAYMORE.get());
                        pOutput.accept(ModItems.ROYAL_GUARDS_HALBERD.get());
//                        pOutput.accept(ModItems.ROYAL_GUARDS_BOW.get());
//                        pOutput.accept(ModItems.ROYAL_GUARDS_SHIELD.get());

                        pOutput.accept(ModItems.RUSTY_BROADSWORD.get());
                        pOutput.accept(ModItems.RUSTY_CLAYMORE.get());
                        pOutput.accept(ModItems.RUSTY_HALBERD.get());
//                        pOutput.accept(ModItems.RUSTY_SHIELD.get());

                        pOutput.accept(ModItems.EIGHTFOLD_BLADE.get());
                        pOutput.accept(ModItems.EIGHTFOLD_LONGBLADE.get());
                        pOutput.accept(ModItems.EDGE_OF_DUALITY.get());
                        pOutput.accept(ModItems.SERPENTINE_SPEAR.get());
//                        pOutput.accept(ModItems.PHRENIC_BOW.get());
//                        pOutput.accept(ModItems.SHIELD_OF_THE_MINDS_EYE.get());

                        pOutput.accept(ModItems.SOLDIERS_BROADSWORD.get());
                        pOutput.accept(ModItems.SOLDIERS_CLAYMORE.get());
                        pOutput.accept(ModItems.SOLDIERS_SPEAR.get());
//                        pOutput.accept(ModItems.SOLDIERS_BOW.get());
//                        pOutput.accept(ModItems.SOLDIERS_SHIELD.get());

                        pOutput.accept(ModItems.TRAVELERS_SWORD.get());
                        pOutput.accept(ModItems.TRAVELERS_CLAYMORE.get());
                        pOutput.accept(ModItems.TRAVELERS_SPEAR.get());
//                        pOutput.accept(ModItems.TRAVELERS_BOW.get());
//                        pOutput.accept(ModItems.TRAVELERS_SHIELD.get());

                        pOutput.accept(ModItems.VICIOUS_SICKLE.get());
                        pOutput.accept(ModItems.DEMON_CARVER.get());
                        pOutput.accept(ModItems.WINDCLEAVER.get());
//                        pOutput.accept(ModItems.DUPLEX_BOW.get());

                        pOutput.accept(ModItems.ZORA_SWORD.get());
                        pOutput.accept(ModItems.SILVER_LONGSWORD.get());
                        pOutput.accept(ModItems.ZORA_SPEAR.get());
                        pOutput.accept(ModItems.SILVERSCALE_SPEAR.get());
                        pOutput.accept(ModItems.CEREMONIAL_TRIDENT.get());
                        pOutput.accept(ModItems.LIGHTSCALE_TRIDENT.get());
//                        pOutput.accept(ModItems.SILVER_BOW.get());
//                        pOutput.accept(ModItems.SILVER_SHIELD.get());
                    })
                    .build()
    );
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
