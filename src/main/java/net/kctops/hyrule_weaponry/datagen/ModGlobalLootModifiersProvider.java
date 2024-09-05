package net.kctops.hyrule_weaponry.datagen;

import net.kctops.hyrule_weaponry.HyruleWeaponry;
import net.kctops.hyrule_weaponry.loot.AddItemModifier;
import net.kctops.hyrule_weaponry.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, HyruleWeaponry.MOD_ID);
    }

    @Override
    protected void start() {
        add("rusty_broadsword_from_abandoned_village", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()}, ModItems.RUSTY_BROADSWORD.get()));
        add("rusty_claymore_from_abandoned_village", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()}, ModItems.RUSTY_CLAYMORE.get()));
        add("rusty_halberd_from_abandoned_village", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()}, ModItems.RUSTY_HALBERD.get()));
//        add("rusty_broadsword_from_abandoned_village", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()}, ModItems.RUSTY_SHIELD.get()));
    }
}
