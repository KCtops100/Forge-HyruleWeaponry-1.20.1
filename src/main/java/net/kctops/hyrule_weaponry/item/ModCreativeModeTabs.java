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
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());
                        pOutput.accept(ModItems.ANCIENT_SHORT_SWORD.get());

                    })
                    .build()
    );
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
