package vladlol.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vladlol.items.AllItems;
import vladlol.mod.DermantineMod;
import vladlol.tabs.ModCreativeTab;

import java.util.function.Supplier;

public class AllBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DermantineMod.MODID);

    public static final RegistryObject<Block> DERMANTINE_ORE = BLOCKS.register("dermantine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).requiresCorrectToolForDrops()));
//    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
//        RegistryObject<T> toReturn = BLOCKS.register(name, block);
//        registerBlockItem(name, toReturn, tab);
//        return toReturn;
//    }
//
//    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
//        //.tab(tab);
//        return AllItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
//    }
//
//    public static void register(IEventBus eventBus){
//        BLOCKS.register(eventBus);
//    }

}
