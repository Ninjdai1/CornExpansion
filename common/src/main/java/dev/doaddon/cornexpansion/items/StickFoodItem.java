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
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        // Call the superclass method to handle normal item consumption behavior
        super.finishUsingItem(itemStack, level, entity);

        // Create the stick item stack
        ItemStack stickStack = new ItemStack(Items.STICK);

        if (entity instanceof Player && ((Player) entity).getAbilities().instabuild) {
            // If in creative mode, do not decrease the item stack
            return stickStack;
        } else {
            // Decrease the item stack by 1
            itemStack.shrink(1);

            // If the item stack is now empty, return the stick
            if (itemStack.isEmpty()) {
                return stickStack;
            } else {
                // Add the stick to the player's inventory if possible
                if (!level.isClientSide) {
                    if (entity instanceof Player) {
                        Player player = (Player) entity;

                        if (!player.getInventory().add(stickStack)) {
                            // Drop the stick in the world if inventory is full
                            player.drop(stickStack, false);
                        }
                    }
                }

                // Return the remaining item stack
                return itemStack;
            }
        }
    }
}
