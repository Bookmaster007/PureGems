package com.keith.puregem.item;

import com.keith.puregem.PureGem;
import com.keith.puregem.item.custom.AmethystItem;
import com.keith.puregem.item.custom.ModArmorItem;
import com.keith.puregem.item.custom.RubyAxe;
import com.keith.puregem.item.custom.RubySword;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PureGem.MODID);
    public static final DeferredRegister<Item> VANILLA_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");
    public static  final RegistryObject<Item> AMETHYST_SHARD = VANILLA_ITEMS.register("amethyst_shard",() -> new AmethystItem(new Item.Properties()));
    public static  final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",() -> new RubySword(ModTiers.RUBY,3,5,(new Item.Properties()).fireResistant()));
    public static  final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",() -> new ShovelItem(ModTiers.RUBY,1.5F,3.0F,(new Item.Properties()).fireResistant()));
    public static  final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",() -> new RubyAxe(ModTiers.RUBY,5.0F,-3.0F,(new Item.Properties()).fireResistant()));
    public static  final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",() -> new HoeItem(ModTiers.RUBY,3,5,(new Item.Properties()).fireResistant()));
    public static  final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",() -> new PickaxeItem(ModTiers.RUBY,3,5,(new Item.Properties()).fireResistant()));


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",()->new Item( (new Item.Properties()).fireResistant()));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",()->new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",()->new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",()->new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",()->new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, (new Item.Properties()).fireResistant()));


    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }

}