package net.kctops.hyrule_weaponry.datagen;

import net.kctops.hyrule_weaponry.HyruleWeaponry;
import net.kctops.hyrule_weaponry.loot.AddItemModifier;
import net.kctops.hyrule_weaponry.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, HyruleWeaponry.MOD_ID);
    }

    @Override
    protected void start() {
        /**
         * You get ancient soldier gear from ancient city.
         */
        add("ancient_short_sword_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build()}, ModItems.ANCIENT_SHORT_SWORD.get()));
        add("ancient_bladesaw_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build()}, ModItems.ANCIENT_BLADESAW.get()));
        add("ancient_spear_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build()}, ModItems.ANCIENT_SPEAR.get()));
//        add("ancient_bow_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build()}, ModItems.ANCIENT_BOW.get()));
//        add("ancient_arrow_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build()}, ModItems.ANCIENT_ARROW.get()));
//        add("ancient_shield_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build()}, ModItems.ANCIENT_SHIELD.get()));

        // -------------------------------------------
        //  Bokoblin gear
        // -------------------------------------------
        // boko club
        add("boko_club_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.BOKO_CLUB.get()));
        add("boko_club_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.BOKO_CLUB.get()));
        add("boko_club_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.BOKO_CLUB.get()));
        add("boko_club_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.BOKO_CLUB.get()));
        // spiked boko club
        add("spiked_boko_club_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.SPIKED_BOKO_CLUB.get()));
        add("spiked_boko_club_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.SPIKED_BOKO_CLUB.get()));
        add("spiked_boko_club_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.SPIKED_BOKO_CLUB.get()));
        add("spiked_boko_club_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.SPIKED_BOKO_CLUB.get()));
        // dragonbone boko club
        add("dragonbone_boko_club_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.DRAGONBONE_BOKO_CLUB.get()));
        add("dragonbone_boko_club_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.DRAGONBONE_BOKO_CLUB.get()));
        add("dragonbone_boko_club_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.DRAGONBONE_BOKO_CLUB.get()));
        add("dragonbone_boko_club_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.DRAGONBONE_BOKO_CLUB.get()));
        // boko bat
        add("boko_bat_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.BOKO_BAT.get()));
        add("boko_bat_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.BOKO_BAT.get()));
        add("boko_bat_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.BOKO_BAT.get()));
        add("boko_bat_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.BOKO_BAT.get()));
        // spiked boko bat
        add("spiked_boko_bat_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.SPIKED_BOKO_BAT.get()));
        add("spiked_boko_bat_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.SPIKED_BOKO_BAT.get()));
        add("spiked_boko_bat_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.SPIKED_BOKO_BAT.get()));
        add("spiked_boko_bat_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.SPIKED_BOKO_BAT.get()));
        // dragonbone boko bat
        add("dragonbone_boko_bat_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.DRAGONBONE_BOKO_BAT.get()));
        add("dragonbone_boko_bat_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.DRAGONBONE_BOKO_BAT.get()));
        add("dragonbone_boko_bat_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.DRAGONBONE_BOKO_BAT.get()));
        add("dragonbone_boko_bat_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.DRAGONBONE_BOKO_BAT.get()));
        // boko spear
        add("boko_spear_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.BOKO_SPEAR.get()));
        add("boko_spear_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.BOKO_SPEAR.get()));
        add("boko_spear_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.BOKO_SPEAR.get()));
        add("boko_spear_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.BOKO_SPEAR.get()));
        // spiked boko spear
        add("spiked_boko_spear_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.SPIKED_BOKO_SPEAR.get()));
        add("spiked_boko_spear_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.SPIKED_BOKO_SPEAR.get()));
        add("spiked_boko_spear_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.SPIKED_BOKO_SPEAR.get()));
        add("spiked_boko_spear_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.SPIKED_BOKO_SPEAR.get()));
        // dragonbone boko spear
        add("dragonbone_boko_spear_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.DRAGONBONE_BOKO_SPEAR.get()));
        add("dragonbone_boko_spear_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.DRAGONBONE_BOKO_SPEAR.get()));
        add("dragonbone_boko_spear_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.DRAGONBONE_BOKO_SPEAR.get()));
        add("dragonbone_boko_spear_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.DRAGONBONE_BOKO_SPEAR.get()));
//        // boko bow
//        add("boko_bow_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.BOKO_BOW.get()));
//        add("boko_bow_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.BOKO_BOW.get()));
//        add("boko_bow_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.BOKO_BOW.get()));
//        add("boko_bow_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.BOKO_BOW.get()));
//        // spiked boko bow
//        add("spiked_boko_bow_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.SPIKED_BOKO_BOW.get()));
//        add("spiked_boko_bow_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.SPIKED_BOKO_BOW.get()));
//        add("spiked_boko_bow_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.SPIKED_BOKO_BOW.get()));
//        add("spiked_boko_bow_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.SPIKED_BOKO_BOW.get()));
//        // dragonbone boko bow
//        add("dragonbone_boko_bow_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.DRAGONBONE_BOKO_BOW.get()));
//        add("dragonbone_boko_bow_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.DRAGONBONE_BOKO_BOW.get()));
//        add("dragonbone_boko_bow_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.DRAGONBONE_BOKO_BOW.get()));
//        add("dragonbone_boko_bow_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.DRAGONBONE_BOKO_BOW.get()));
        // boko shield
//        add("boko_shield_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.BOKO_BOW.get()));
//        add("boko_shield_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.BOKO_BOW.get()));
//        add("boko_shield_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.BOKO_BOW.get()));
//        add("boko_shield_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.BOKO_BOW.get()));
//        // spiked boko shield
//        add("spiked_boko_shield_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.SPIKED_BOKO_BOW.get()));
//        add("spiked_boko_shield_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.SPIKED_BOKO_BOW.get()));
//        add("spiked_boko_shield_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.SPIKED_BOKO_BOW.get()));
//        add("spiked_boko_shield_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.SPIKED_BOKO_BOW.get()));
//        // dragonbone boko shield
//        add("dragonbone_boko_shield_from_bastion_bridge", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()}, ModItems.DRAGONBONE_BOKO_BOW.get()));
//        add("dragonbone_boko_shield_from_bastion_hoglin_stable", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()}, ModItems.DRAGONBONE_BOKO_BOW.get()));
//        add("dragonbone_boko_shield_from_bastion_other", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()}, ModItems.DRAGONBONE_BOKO_BOW.get()));
//        add("dragonbone_boko_shield_from_bastion_treasure", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()}, ModItems.DRAGONBONE_BOKO_BOW.get()));

        /**
         * You get guaranteed rusty gear from spawn chest.
         */
        add("rusty_broadsword_from_spawn_bonus_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()}, ModItems.RUSTY_BROADSWORD.get()));
        add("rusty_claymore_from_spawn_bonus_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()}, ModItems.RUSTY_CLAYMORE.get()));
        add("rusty_halberd_from_spawn_bonus_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()}, ModItems.RUSTY_HALBERD.get()));
//        add("rusty_broadsword_from_abandoned_village", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()}, ModItems.RUSTY_SHIELD.get()));
    }
}
