package net.kctops.hyrule_weaponry.item;

import net.kctops.hyrule_weaponry.HyruleWeaponry;
import net.kctops.hyrule_weaponry.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier ANCIENT_SOLDIER_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.ANCIENT_SOLDIER,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "ancient_soldier_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier BOKOBLIN_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.BOKOBLIN,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "bokoblin_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier GERUDO_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.GERUDO,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "gerudo_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier GORON_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.GORON,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "goron_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier GUARDIAN_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.GUARDIAN,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "guardian_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier KNIGHTS_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.KNIGHTS,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "knights_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier KOROK_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.KOROK,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "korok_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier LIZALFOS_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.LIZALFOS,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "lizalfos_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier LYNEL_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.LYNEL,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "lynel_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier MAGIC_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.MAGIC,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "magic_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier MOBLIN_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.MOBLIN,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "moblin_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier RITO_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.RITO,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "rito_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier ROYAL_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.ROYAL,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "royal_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier ROYAL_GUARDS_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.ROYAL_GUARDS,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "royal_guards_gear"),
            List.of(Tiers.NETHERITE), List.of()
    );
    public static final Tier RUSTY = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.RUSTY,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "rusty_gear"),
            List.of(Tiers.WOOD), List.of(Tiers.STONE)
    );
    public static final Tier SHIEKAH_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.SHIEKAH,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "shiekah_gear"),
            List.of(Tiers.WOOD), List.of(Tiers.STONE)
    );
    public static final Tier SOLDIERS_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.SOLDIERS,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "soldiers_gear"),
            List.of(Tiers.WOOD), List.of(Tiers.STONE)
    );
    public static final Tier TRAVELERS_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.TRAVELERS,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "travelers"),
            List.of(Tiers.WOOD), List.of(Tiers.STONE)
    );
    public static final Tier YIGA_CLAN_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.YIGA_CLAN,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "yiga_clan_gear"),
            List.of(Tiers.WOOD), List.of(Tiers.STONE)
    );
    public static final Tier ZORA_GEAR = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,
                    25,
                    2f,
                    0.5f,
                    6,
                    ModTags.Blocks.ZORA,
                    () -> Ingredient.of(ModItems.THING.get())
            ), new ResourceLocation(HyruleWeaponry.MOD_ID, "zora_gear"),
            List.of(Tiers.WOOD), List.of(Tiers.STONE)
    );
}
