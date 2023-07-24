package com.keith.puregem.item;

import com.keith.puregem.PureGem;
import com.keith.puregem.item.custom.AmethystItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
    

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }

}