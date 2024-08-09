package vladlol.tabs;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import vladlol.items.AllItems;
import vladlol.mod.DermantineMod;

@Mod.EventBusSubscriber(modid = DermantineMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTab {
    public static CreativeModeTab tab;
    @SubscribeEvent
    public static void regTab(CreativeModeTabEvent.Register e){
        tab = e.registerCreativeModeTab(new ResourceLocation(DermantineMod.MODID, "dermantine_tab"),
                builder -> builder.icon(()->new ItemStack(AllItems.DERMANTINE.get())).
                        title(Component.translatable("modcreativetab_tab")));
    }
}
