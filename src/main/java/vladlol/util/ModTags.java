package vladlol.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import vladlol.mod.DermantineMod;

public class ModTags {
    public static class Blocks{

        public static final TagKey<Block> NEEDS_DERMANTINE_TOOL =
                tag("needs_dermantine_tool");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(DermantineMod.MODID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
