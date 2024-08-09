package vladlol.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import vladlol.mod.DermantineMod;
import vladlol.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static Tier DERMANTINE;

    static {
        DERMANTINE = TierSortingRegistry.registerTier(
                //если я хочу узнать уровни других материалов,то Tier , Ctrl+B, а там уже Ctrl+H
                new ForgeTier(5, 3000,10f,3f, 24,
                        ModTags.Blocks.NEEDS_DERMANTINE_TOOL, ()-> Ingredient.of(AllItems.DERMANTINE.get())),
                        new ResourceLocation(DermantineMod.MODID,"dermantine"),
                //как промежуток между чем и чем
                List.of(Tiers.NETHERITE), List.of());
    }
}
