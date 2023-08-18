package com.keith.puregem.item;

import java.util.function.Supplier;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
     public static ForgeTier RUBY = new ForgeTier(3, 1561, 8.0F, 3.0F, 10, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.RUBY.get()));
}
