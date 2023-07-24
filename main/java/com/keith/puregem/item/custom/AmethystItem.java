package com.keith.puregem.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AmethystItem extends Item {
    public AmethystItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide && hand == InteractionHand.MAIN_HAND) {
            if (player.removeAllEffects()) {
                player.getMainHandItem().setCount(player.getMainHandItem().getCount() - 1);
            }
        }
        return super.use(level, player, hand);
    }

}
