package io.redspace.ironsspellbooks.entity.dragon;

import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;

public class DragonEntity extends LivingEntity {

    public DragonEntity(EntityType<? extends LivingEntity> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public Iterable<ItemStack> getArmorSlots() {
        return List.of();
    }

    @Override
    public ItemStack getItemBySlot(EquipmentSlot pSlot) {
        return ItemStack.EMPTY;
    }

    @Override
    public void setItemSlot(EquipmentSlot pSlot, ItemStack pStack) {

    }

    @Override
    public HumanoidArm getMainArm() {
        return HumanoidArm.RIGHT;
    }

    public final AnimationState testAnimationState = new AnimationState();

}
