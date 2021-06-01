package com.natureminerals.main.modifiers;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class ElectrifyingModifier extends Modifier {

	public ElectrifyingModifier() {
		super(0xFBBE53);
	}
	
	@Override
	public int afterLivingHit(IModifierToolStack tool, int level, LivingEntity attacker, LivingEntity target, float damageDealt, boolean isCritical, float cooldown) {
		if(target.level instanceof ServerWorld) {
			BlockPos pos = target.blockPosition();
			if (target.level.canSeeSky(pos)) {
				LightningBoltEntity lightningBolt = EntityType.LIGHTNING_BOLT.create(target.level);
	            lightningBolt.moveTo(Vector3d.atBottomCenterOf(pos));
	            target.level.addFreshEntity(lightningBolt);
			}
		}
		return 0;
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if(event.getPlayer().level.isThundering() && isEffective) {
			event.setNewSpeed(event.getNewSpeed() * (level * 1.5f));
		}
	}

}
