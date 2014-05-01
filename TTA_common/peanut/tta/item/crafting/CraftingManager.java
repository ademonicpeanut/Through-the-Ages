package peanut.tta.item.crafting;

import net.minecraft.item.ItemStack;
import peanut.tta.block.ModBlocks;
import peanut.tta.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void init(){
		GameRegistry.addRecipe(new ItemStack (ModBlocks.copperBlock, 1), new Object [] {
			"XXX", "XXX", "XXX", 'X', ModItems.copperIngot
		});
		GameRegistry.addRecipe(new ItemStack (ModBlocks.tinBlock, 1), new Object [] {
			"XXX", "XXX", "XXX", 'X', ModItems.tinIngot
		});
		GameRegistry.addRecipe(new ItemStack (ModBlocks.silverBlock, 1), new Object [] {
			"XXX", "XXX", "XXX", 'X', ModItems.silverIngot
		});
		GameRegistry.addRecipe(new ItemStack (ModBlocks.leadBlock, 1), new Object [] {
			"XXX", "XXX", "XXX", 'X', ModItems.leadIngot
		});
		GameRegistry.addRecipe(new ItemStack (ModBlocks.aluminumBlock, 1), new Object [] {
			"XXX", "XXX", "XXX", 'X', ModItems.aluminumIngot
		});
		GameRegistry.addRecipe(new ItemStack (ModBlocks.titaniumBlock, 1), new Object [] {
			"XXX", "XXX", "XXX", 'X', ModItems.titaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack (ModBlocks.uraniumBlock, 1), new Object [] {
			"XXX", "XXX", "XXX", 'X', ModItems.uraniumIngot
		});
		GameRegistry.addRecipe(new ItemStack (ModBlocks.cobaltBlock, 1), new Object [] {
			"XXX", "XXX", "XXX", 'X', ModItems.cobaltIngot
		});
		GameRegistry.addRecipe(new ItemStack (ModBlocks.magnesiumBlock, 1), new Object [] {
			"XXX", "XXX", "XXX", 'X', ModItems.magnesiumIngot
		});
		GameRegistry.addShapelessRecipe(new ItemStack (ModItems.copperIngot, 9), new Object[] {ModBlocks.copperBlock});
		GameRegistry.addShapelessRecipe(new ItemStack (ModItems.tinIngot, 9), new Object[] {ModBlocks.tinBlock});
		GameRegistry.addShapelessRecipe(new ItemStack (ModItems.silverIngot, 9), new Object[] {ModBlocks.silverBlock});
		GameRegistry.addShapelessRecipe(new ItemStack (ModItems.leadIngot, 9), new Object[] {ModBlocks.leadBlock});
		GameRegistry.addShapelessRecipe(new ItemStack (ModItems.aluminumIngot, 9), new Object[] {ModBlocks.aluminumBlock});
		GameRegistry.addShapelessRecipe(new ItemStack (ModItems.titaniumIngot, 9), new Object[] {ModBlocks.titaniumBlock});
		GameRegistry.addShapelessRecipe(new ItemStack (ModItems.uraniumIngot, 9), new Object[] {ModBlocks.uraniumBlock});
		GameRegistry.addShapelessRecipe(new ItemStack (ModItems.cobaltIngot, 9), new Object[] {ModBlocks.cobaltBlock});
		GameRegistry.addShapelessRecipe(new ItemStack (ModItems.magnesiumIngot, 9), new Object[] {ModBlocks.magnesiumBlock});
		GameRegistry.addShapelessRecipe(new ItemStack (ModItems.bronzeMixture, 5), new Object[] {ModItems.copperIngot, ModItems.copperIngot, ModItems.copperIngot, ModItems.copperIngot, ModItems.tinIngot});
	}

}
