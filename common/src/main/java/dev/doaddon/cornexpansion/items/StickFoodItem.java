package dev.doaddon.cornexpansion.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class StickFoodItem extends Item {
    public StickFoodItem(Item.Properties arg) {
        super(arg);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack item, Level level, LivingEntity entity) {
        ItemStack itemStack = super.finishUsingItem(item, level, entity);
        return entity instanceof Player && ((Player) entity).getAbilities().instabuild ? itemStack : new ItemStack(Items.STICK);
    }
}
