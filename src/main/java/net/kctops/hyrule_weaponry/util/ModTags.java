package net.kctops.hyrule_weaponry.util;

import net.kctops.hyrule_weaponry.HyruleWeaponry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ANCIENT_SOLDIER = tag("ancient_solider");
        public static final TagKey<Block> BOKOBLIN = tag("bokoblin");
        public static final TagKey<Block> GERUDO = tag("gerudo");
        public static final TagKey<Block> GORON = tag("goron");
        public static final TagKey<Block> GUARDIAN = tag("guardian");
        public static final TagKey<Block> KNIGHTS = tag("knights");
        public static final TagKey<Block> KOROK = tag("korok");
        public static final TagKey<Block> LIZALFOS = tag("lizalfos");
        public static final TagKey<Block> LYNEL = tag("lynel");
        public static final TagKey<Block> MAGIC = tag("magic");
        public static final TagKey<Block> MOBLIN = tag("moblin");
        public static final TagKey<Block> RITO = tag("rito");
        public static final TagKey<Block> ROYAL = tag("royal");
        public static final TagKey<Block> ROYAL_GUARDS = tag("royal_guards");
        public static final TagKey<Block> RUSTY = tag("rusty");
        public static final TagKey<Block> SHIEKAH = tag("shiekah");
        public static final TagKey<Block> SOLDIERS = tag("soldiers");
        public static final TagKey<Block> TRAVELERS = tag("travelers");
        public static final TagKey<Block> YIGA_CLAN = tag("yiga_clan");
        public static final TagKey<Block> ZORA = tag("zora");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(HyruleWeaponry.MOD_ID, name));
        }
    }
    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(HyruleWeaponry.MOD_ID, name));
        }
    }
}
