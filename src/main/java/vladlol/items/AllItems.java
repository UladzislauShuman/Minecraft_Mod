package vladlol.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vladlol.blocks.AllBlocks;
import vladlol.items.custom.DermantineArmorItem;
import vladlol.items.custom.tools.DermantineSwordItem;
import vladlol.mod.DermantineMod;

import java.util.Objects;

public class AllItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DermantineMod.MODID);

    //слиток и известь
    public static final RegistryObject<Item> RAW_DERMANTINE = ITEMS.register("raw_dermantine", Dermantine::new);
    public static final RegistryObject<Item> DERMANTINE = ITEMS.register("dermantine", Dermantine::new);

    //блок руды
    public static final RegistryObject<Item> DERMANTINE_ORE = ITEMS.register("dermantine_ore",
            ()-> new BlockItem(AllBlocks.DERMANTINE_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DERMANTINE_BLOCK = ITEMS.register("dermantine_block",
            ()->new BlockItem(AllBlocks.DERMANTINE_BLOCK.get(),new Item.Properties()));

    //дермантинованные инструменты
    public static final RegistryObject<Item> DERMANTINE_PICKAXE = ITEMS.register("dermantine_pickaxe",
            ()->new PickaxeItem(ModToolTiers.DERMANTINE,2, 3f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DERMANTINE_SWORD = ITEMS.register("dermantine_sword",
            ()->new DermantineSwordItem(ModToolTiers.DERMANTINE,10, 1f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DERMANTINE_AXE = ITEMS.register("dermantine_axe",
            ()->new AxeItem(ModToolTiers.DERMANTINE, 7f, -2.3f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DERMANTINE_SHOVEL = ITEMS.register("dermantine_shovel",
            ()->new ShovelItem(ModToolTiers.DERMANTINE,3f, -3f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DERMANTINE_HOE = ITEMS.register("dermantine_hoe",
            ()->new HoeItem(ModToolTiers.DERMANTINE, -2, 2f, new Item.Properties().stacksTo(1)));

    //броня
    public static final RegistryObject<Item> DERMANTINE_HELMET = ITEMS.register("dermantine_helmet",
            //вообще, у меня пока там такая реализация класса, что -- можно и просто ArmorItem использовать
            ()->new DermantineArmorItem(ModArmorMaterials.DERMANTINE,ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DERMANTINE_CHESTPLATE = ITEMS.register("dermantine_chestplate",
            ()->new DermantineArmorItem(ModArmorMaterials.DERMANTINE,ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DERMANTINE_LEGGINGS = ITEMS.register("dermantine_leggings",
            ()->new DermantineArmorItem(ModArmorMaterials.DERMANTINE,ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DERMANTINE_BOOTS = ITEMS.register("dermantine_boots",
            ()->new DermantineArmorItem(ModArmorMaterials.DERMANTINE,ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DERMANTINE_HORSE_ARMOR = ITEMS.register("dermantine_horse_armor",
            ()->new HorseArmorItem(16, "dermantine", new Item.Properties().stacksTo(1)));

}
