package net.kctops.hyrule_weaponry.datagen;

import net.kctops.hyrule_weaponry.HyruleWeaponry;
import net.kctops.hyrule_weaponry.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HyruleWeaponry.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.ANCIENT_SHORT_SWORD);
        handheldItem(ModItems.ANCIENT_BLADESAW);
        handheldItem(ModItems.ANCIENT_SPEAR);
        // handheldItem(ModItems.ANCIENT_BOW);
        // handheldItem(ModItems.ANCIENT_ARROW);
        // handheldItem(ModItems.ANCIENT_SHIELD);

        handheldItem(ModItems.BOKO_CLUB);
        handheldItem(ModItems.SPIKED_BOKO_CLUB);
        handheldItem(ModItems.DRAGONBONE_BOKO_CLUB);
        handheldItem(ModItems.BOKO_BAT);
        handheldItem(ModItems.SPIKED_BOKO_BAT);
        handheldItem(ModItems.DRAGONBONE_BOKO_BAT);
        handheldItem(ModItems.BOKO_SPEAR);
        handheldItem(ModItems.SPIKED_BOKO_SPEAR);
        handheldItem(ModItems.DRAGONBONE_BOKO_SPEAR);
        // handheldItem(ModItems.BOKO_BOW);
        // handheldItem(ModItems.SPIKED_BOKO_BOW);
        // handheldItem(ModItems.DRAGONBONE_BOKO_BOW);
        // handheldItem(ModItems.BOKO_SHIELD);
        // handheldItem(ModItems.SPIKED_BOKO_SHIELD);
        // handheldItem(ModItems.DRAGONBONE_BOKO_SHIELD);

        handheldItem(ModItems.GERUDO_SCIMITAR);
        handheldItem(ModItems.MOONLIGHT_SCIMITAR);
        handheldItem(ModItems.SCIMITAR_OF_THE_SEVEN);
        handheldItem(ModItems.GOLDEN_CLAYMORE);
        handheldItem(ModItems.GERUDO_SPEAR);
        handheldItem(ModItems.GOLDEN_BOW);
        // handheldItem(ModItems.GERUDO_SHIELD);
        // handheldItem(ModItems.RADIANT_SHIELD);
        // handheldItem(ModItems.DAYBREAKER);

        handheldItem(ModItems.COBBLE_CRUSHER);
        handheldItem(ModItems.STONE_SMASHER);
        handheldItem(ModItems.BOLDER_BREAKER);
        handheldItem(ModItems.DRILLSHAFT);

        handheldItem(ModItems.GUARDIAN_SWORD);
        handheldItem(ModItems.GUARDIAN_SWORD_PLUS);
        handheldItem(ModItems.GUARDIAN_SWORD_PLUS_PLUS);
        handheldItem(ModItems.ANCIENT_BATTLE_AXE);
        handheldItem(ModItems.ANCIENT_BATTLE_AXE_PLUS);
        handheldItem(ModItems.ANCIENT_BATTLE_AXE_PLUS_PLUS);
        handheldItem(ModItems.GUARDIAN_SPEAR);
        handheldItem(ModItems.GUARDIAN_SPEAR_PLUS);
        handheldItem(ModItems.GUARDIAN_SPEAR_PLUS_PLUS);

        handheldItem(ModItems.KNIGHTS_BROADSWORD);
        handheldItem(ModItems.KNIGHTS_CLAYMORE);
        handheldItem(ModItems.KNIGHTS_HALBERD);
        // handheldItem(ModItems.KNIGHTS_BOW);
        // handheldItem(ModItems.KNIGHTS_SHIELD);

        // handheldItem(ModItems.KOROK_LEAF);
        handheldItem(ModItems.FOREST_DWELLERS_SWORD);
        handheldItem(ModItems.FOREST_DWELLERS_SPEAR);
        // handheldItem(ModItems.FOREST_DWELLERS_BOW);
        // handheldItem(ModItems.FOREST_DWELLERS_SHIELD);

        handheldItem(ModItems.LIZAL_BOOMERANG);
        handheldItem(ModItems.LIZAL_FORKED_BOOMERANG);
        handheldItem(ModItems.LIZAL_TRI_BOOMERANG);
        handheldItem(ModItems.LIZAL_SPEAR);
        handheldItem(ModItems.ENHANCED_LIZAL_SPEAR);
        handheldItem(ModItems.FORKED_LIZAL_SPEAR);
        // handheldItem(ModItems.LIZAL_BOW);
        // handheldItem(ModItems.STRENGTHENED_LIZAL_BOW);
        // handheldItem(ModItems.STEEL_LIZAL_BOW);
        // handheldItem(ModItems.LIZAL_SHIELD);
        // handheldItem(ModItems.REINFORCED_LIZAL_SHIELD);
        // handheldItem(ModItems.STEEL_LIZAL_SHIELD);

        handheldItem(ModItems.LYNEL_SWORD);
        handheldItem(ModItems.MIGHTY_LYNEL_SWORD);
        handheldItem(ModItems.SAVAGE_LYNEL_SWORD);
        handheldItem(ModItems.LYNEL_CRUSHER);
        handheldItem(ModItems.MIGHTY_LYNEL_CRUSHER);
        handheldItem(ModItems.SAVAGE_LYNEL_CRUSHER);
        handheldItem(ModItems.LYNEL_SPEAR);
        handheldItem(ModItems.MIGHTY_LYNEL_SPEAR);
        handheldItem(ModItems.SAVAGE_LYNEL_SPEAR);
        // handheldItem(ModItems.LYNEL_BOW);
        // handheldItem(ModItems.MIGHTY_LYNEL_BOW);
        // handheldItem(ModItems.SAVAGE_LYNEL_BOW);
        // handheldItem(ModItems.LYNEL_SHIELD);
        // handheldItem(ModItems.MIGHTY_LYNEL_SHIELD);
        // handheldItem(ModItems.SAVAGE_LYNEL_SHIELD);

        handheldItem(ModItems.FLAMEBLADE);
        handheldItem(ModItems.FROSTBLADE);
        handheldItem(ModItems.THUNDERBLADE);
        handheldItem(ModItems.GREAT_FLAMEBLADE);
        handheldItem(ModItems.GREAT_FROSTBLADE);
        handheldItem(ModItems.GREAT_THUNDERBLADE);
        handheldItem(ModItems.FLAMESPEAR);
        handheldItem(ModItems.FROSTSPEAR);
        handheldItem(ModItems.THUNDERSPEAR);

        handheldItem(ModItems.MOBLIN_CLUB);
        handheldItem(ModItems.SPIKED_MOBLIN_CLUB);
        handheldItem(ModItems.DRAGONBONE_MOBLIN_CLUB);
        handheldItem(ModItems.MOBLIN_SPEAR);
        handheldItem(ModItems.SPIKED_MOBLIN_SPEAR);
        handheldItem(ModItems.DRAGONBONE_MOBLIN_SPEAR);

        handheldItem(ModItems.FEATHERED_EDGE);
        handheldItem(ModItems.FEATHERED_SPEAR);
        // handheldItem(ModItems.SWALLOW_BOW);
        // handheldItem(ModItems.FALCON_BOW);
        // handheldItem(ModItems.GREAT_EAGLE_BOW);
        // handheldItem(ModItems.KITE_SHIELD);

        handheldItem(ModItems.ROYAL_BROADSWORD);
        handheldItem(ModItems.ROYAL_CLAYMORE);
        handheldItem(ModItems.ROYAL_HALBERD);
        // handheldItem(ModItems.ROYAL_BOW);
        // handheldItem(ModItems.ROYAL_SHIELD);

        handheldItem(ModItems.ROYAL_GUARDS_BROADSWORD);
        handheldItem(ModItems.ROYAL_GUARDS_CLAYMORE);
        handheldItem(ModItems.ROYAL_GUARDS_HALBERD);
        // handheldItem(ModItems.ROYAL_GUARDS_BOW);
        // handheldItem(ModItems.ROYAL_GUARDS_SHIELD);

        handheldItem(ModItems.RUSTY_BROADSWORD);
        handheldItem(ModItems.RUSTY_CLAYMORE);
        handheldItem(ModItems.RUSTY_HALBERD);
        // handheldItem(ModItems.RUSTY_SHIELD);

        handheldItem(ModItems.EIGHTFOLD_BLADE);
        handheldItem(ModItems.EIGHTFOLD_LONGBLADE);
        handheldItem(ModItems.EDGE_OF_DUALITY);
        handheldItem(ModItems.SERPENTINE_SPEAR);
        // handheldItem(ModItems.PHRENIC_BOW);
        // handheldItem(ModItems.SHIELD_OF_THE_MINDS_EYE);

        handheldItem(ModItems.SOLDIERS_BROADSWORD);
        handheldItem(ModItems.SOLDIERS_CLAYMORE);
        handheldItem(ModItems.SOLDIERS_SPEAR);
        // handheldItem(ModItems.SOLDIERS_BOW);
        // handheldItem(ModItems.SOLDIERS_SHIELD);

        handheldItem(ModItems.TRAVELERS_BROADSWORD);
        handheldItem(ModItems.TRAVELERS_CLAYMORE);
        handheldItem(ModItems.TRAVELERS_SPEAR);
        // handheldItem(ModItems.TRAVELERS_BOW);
        // handheldItem(ModItems.TRAVELERS_SHIELD);

        handheldItem(ModItems.VICIOUS_SICKLE);
        handheldItem(ModItems.DEMON_CARVER);
        handheldItem(ModItems.WINDCLEAVER);
        // handheldItem(ModItems.DUPLEX_BOW);

        handheldItem(ModItems.ZORA_SWORD);
        handheldItem(ModItems.SILVER_LONGSWORD);
        handheldItem(ModItems.ZORA_SPEAR);
        handheldItem(ModItems.SILVERSCALE_SPEAR);
        handheldItem(ModItems.CEREMONIAL_TRIDENT);
        handheldItem(ModItems.LIGHTSCALE_TRIDENT);
        // handheldItem(ModItems.SILVER_BOW);
        // handheldItem(ModItems.SILVER_SHIELD);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HyruleWeaponry.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(HyruleWeaponry.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(HyruleWeaponry.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(HyruleWeaponry.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(HyruleWeaponry.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HyruleWeaponry.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HyruleWeaponry.MOD_ID,"item/" + item.getId().getPath()));
    }
}