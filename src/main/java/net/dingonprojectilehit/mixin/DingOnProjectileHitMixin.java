package net.dingonprojectilehit.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;


@Mixin(PersistentProjectileEntity.class)
public class DingOnProjectileHitMixin {
	@ModifyConstant(method = "onEntityHit", constant = @Constant(classValue = PlayerEntity.class))
	private boolean ArrowPlaysSound(Object livingEntity, Class<?> playerEntity) {
		return true;
	}
}