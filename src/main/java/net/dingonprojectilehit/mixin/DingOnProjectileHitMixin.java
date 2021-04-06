package net.dingonprojectilehit.mixin;

import net.minecraft.entity.projectile.PersistentProjectileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PersistentProjectileEntity.class)
public class DingOnProjectileHitMixin {
	@Redirect(method = "onEntityHit", require = 0, at = @At(value = "CONSTANT", args = "classValue=net/minecraft/entity/player/PlayerEntity"))
	public boolean onInstanceOf(Object livingEntity, Class<?> clPlayerEntity) {
		return true;
	}
	@Redirect(method = "onEntityHit", require = 0, at = @At(value = "CONSTANT", args = "classValue=net/minecraft/class_1657"))
	public boolean onInstanceO(Object livingEntity, Class<?> clPlayerEntity) {
		return true;
	}
}