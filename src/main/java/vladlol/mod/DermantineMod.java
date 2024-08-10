package vladlol.mod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import vladlol.blocks.AllBlocks;
import vladlol.items.AllItems;
import vladlol.tabs.ModCreativeTab;


@Mod(DermantineMod.MODID)
public class DermantineMod
{
    public static final String MODID = "dermantinemod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DermantineMod()
    {
        IEventBus bus= FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::commonSetup);

        AllItems.ITEMS.register(bus);
        AllBlocks.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);

        bus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(AllItems.DERMANTINE_BLOCK);
        }

        if(event.getTab() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(AllItems.DERMANTINE_ORE);
        }

        if(event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(AllItems.DERMANTINE_SHOVEL);
            event.accept(AllItems.DERMANTINE_PICKAXE);
            event.accept(AllItems.DERMANTINE_AXE);
            event.accept(AllItems.DERMANTINE_HOE);
        }

        if(event.getTab() == CreativeModeTabs.COMBAT){
            event.accept(AllItems.DERMANTINE_SWORD);
            event.accept(AllItems.DERMANTINE_HORSE_ARMOR);
            event.accept(AllItems.DERMANTINE_HELMET);
            event.accept(AllItems.DERMANTINE_CHESTPLATE);
            event.accept(AllItems.DERMANTINE_LEGGINGS);
            event.accept(AllItems.DERMANTINE_BOOTS);
        }

        if(event.getTab() == CreativeModeTabs.INGREDIENTS){
            event.accept(AllItems.DERMANTINE);
            event.accept(AllItems.RAW_DERMANTINE);
        }

        if(event.getTab() == ModCreativeTab.tab){
            event.accept(AllItems.DERMANTINE);
            event.accept(AllItems.RAW_DERMANTINE);
            event.accept(AllItems.DERMANTINE_ORE);
            event.accept(AllItems.DERMANTINE_BLOCK);

            event.accept(AllItems.DERMANTINE_PICKAXE);
            event.accept(AllItems.DERMANTINE_SWORD);
            event.accept(AllItems.DERMANTINE_AXE);
            event.accept(AllItems.DERMANTINE_SHOVEL);
            event.accept(AllItems.DERMANTINE_HOE);

            event.accept(AllItems.DERMANTINE_HELMET);
            event.accept(AllItems.DERMANTINE_CHESTPLATE);
            event.accept(AllItems.DERMANTINE_LEGGINGS);
            event.accept(AllItems.DERMANTINE_BOOTS);
            event.accept(AllItems.DERMANTINE_HORSE_ARMOR);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
