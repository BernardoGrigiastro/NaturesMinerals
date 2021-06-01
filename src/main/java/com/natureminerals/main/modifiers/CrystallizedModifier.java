package com.natureminerals.main.modifiers;

import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.nbt.IModDataReadOnly;
import slimeknights.tconstruct.library.tools.nbt.StatsNBT;

public class CrystallizedModifier extends Modifier {

	public CrystallizedModifier() {
		super(0x4AEDD9);
		
	}
	
	@Override
	public void addToolStats(ToolDefinition toolDefinition, StatsNBT baseStats, IModDataReadOnly persistentData, IModDataReadOnly volatileData, int level, ModifierStatsBuilder builder) {
		builder.multiplyAttackDamage(1 + (level * 0.02f));
	}

}
