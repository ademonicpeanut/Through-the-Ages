package peanut.tta.item.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import peanut.tta.block.ModBlocks;
import peanut.tta.item.ModItems;
import peanut.tta.lib.Reference;

public class FurnaceRecipes {
	
	public static void init(){
	GameRegistry.addSmelting(ModBlocks.copperOre.blockID, new ItemStack(ModItems.copperIngot), 0.35F);
	GameRegistry.addSmelting(ModBlocks.tinOre.blockID, new ItemStack(ModItems.tinIngot), 0.35F);
	GameRegistry.addSmelting(ModBlocks.leadOre.blockID, new ItemStack(ModItems.leadIngot), 0.5F);
	GameRegistry.addSmelting(ModBlocks.silverOre.blockID, new ItemStack(ModItems.silverIngot), 0.9F);
	GameRegistry.addSmelting(ModBlocks.titaniumOre.blockID, new ItemStack(ModItems.titaniumIngot), 1.2F);
	GameRegistry.addSmelting(ModBlocks.uraniumOre.blockID, new ItemStack(ModItems.uraniumIngot), 1.5F);
	GameRegistry.addSmelting(ModBlocks.cobaltOre.blockID, new ItemStack(ModItems.cobaltIngot), 0.5F);
	GameRegistry.addSmelting(ModBlocks.magnesiumOre.blockID, new ItemStack(ModItems.magnesiumIngot), 0.5F);
	GameRegistry.addSmelting(ModItems.bronzeMixture.itemID, new ItemStack(ModItems.bronzeIngot), 0.7F);
	}

}
