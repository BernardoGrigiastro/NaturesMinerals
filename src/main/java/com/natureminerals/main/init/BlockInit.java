package com.natureminerals.main.init;

import com.natureminerals.main.NatureMinerals;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NatureMinerals.MODID);
	
	//materials
	public static final RegistryObject<Block> UVAROVITE_BLOCK = BLOCKS.register("uvarovite_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).harvestLevel(4).harvestTool(ToolType.PICKAXE).strength(4.0F, 6.0F)
					.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> UVAROVITE_ORE = BLOCKS.register("uvarovite_ore", 
			() -> new OreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).harvestLevel(4).harvestTool(ToolType.PICKAXE).strength(4.0F, 6.0F)
					.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> KUNZITE_BLOCK = BLOCKS.register("kunzite_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(5).harvestTool(ToolType.PICKAXE).strength(6.0F, 6.0F)
					.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> KUNZITE_ORE = BLOCKS.register("kunzite_ore", 
			() -> new OreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PINK).harvestLevel(5).harvestTool(ToolType.PICKAXE).strength(6.0F, 6.0F)
					.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> STIBNITE_BLOCK = BLOCKS.register("stibnite_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).harvestLevel(6).harvestTool(ToolType.PICKAXE).strength(7.0F, 6.0F)
					.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> STIBNITE_ORE = BLOCKS.register("stibnite_ore", 
			() -> new OreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).harvestLevel(6).harvestTool(ToolType.PICKAXE).strength(7.0F, 6.0F)
					.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> ASTRITE_BLOCK = BLOCKS.register("astrite_block",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_RED).harvestLevel(7).harvestTool(ToolType.PICKAXE).strength(10.0F, 10.0F)
					.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ASTRITE_ORE = BLOCKS.register("astrite_ore",
			() -> new OreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_RED).harvestLevel(7).harvestTool(ToolType.PICKAXE).strength(10.0F, 10.0F)
					.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	
	//alloys
	public static final RegistryObject<Block> THOUNITE_BLOCK = BLOCKS.register("thounite_block",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_RED).harvestLevel(8).harvestTool(ToolType.PICKAXE).strength(12.0F, 10.0F)
					.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	
	
	//smeltery molten materials
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_UVAROVITE = BLOCKS
            .register("molten_uvarovite_block", () -> new FlowingFluidBlock(FluidInit.UVAROVITE,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_KUNZITE = BLOCKS
            .register("molten_kunzite_block", () -> new FlowingFluidBlock(FluidInit.KUNZITE,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_STIBNITE = BLOCKS
            .register("molten_stibnite_block", () -> new FlowingFluidBlock(FluidInit.STIBNITE,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ASTRITE = BLOCKS
            .register("molten_astrite_block", () -> new FlowingFluidBlock(FluidInit.ASTRITE,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_THOUNITE = BLOCKS
            .register("molten_thounite_block", () -> new FlowingFluidBlock(FluidInit.THOUNITE,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    
    //smeltery fuels
    public static final RegistryObject<FlowingFluidBlock> BLOOD_LAVA = BLOCKS
            .register("bloodlava_block", () -> new FlowingFluidBlock(FluidInit.BLOODLAVA,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> BLAZING_BLOOD = BLOCKS
            .register("blazingblood_block", () -> new FlowingFluidBlock(FluidInit.BLAZINGBLOOD,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    
}





