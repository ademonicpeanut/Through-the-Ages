package peanut.tta.block;

import peanut.tta.lib.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;



public class ModBlocks {
	
	public static final Block copperOre =  new peanut.tta.block.BlockcopperOre().setUnlocalizedName("Cuprite");
	public static final Block tinOre = new peanut.tta.block.BlocktinOre().setUnlocalizedName("Cassiterite");
	public static final Block silverOre = new peanut.tta.block.BlocksilverOre().setUnlocalizedName("Argentite");
	public static final Block leadOre = new peanut.tta.block.BlockleadOre().setUnlocalizedName("Pyrite");
	public static final Block aluminumOre = new peanut.tta.block.BlockaluminumOre().setUnlocalizedName("Bauxite");
	public static final Block titaniumOre = new peanut.tta.block.BlocktitaniumOre().setUnlocalizedName("Ilmenite");
	public static final Block uraniumOre = new peanut.tta.block.BlockuraniumOre().setUnlocalizedName("Uranite");
	public static final Block cobaltOre = new peanut.tta.block.BlockcobaltOre().setUnlocalizedName("Cobalite");
	public static final Block magnesiumOre = new peanut.tta.block.BlockmagnesiumOre().setUnlocalizedName("Dolomite");
	public static final Block rubyOre = new peanut.tta.block.BlockrubyOre().setUnlocalizedName("Ruby ore");
	public static final Block sapphireOre = new peanut.tta.block.BlocksapphireOre().setUnlocalizedName("Sapphire ore");
	public static final Block amethystOre = new peanut.tta.block.BlockamethystOre().setUnlocalizedName("Amethyst Ore");
	public static final Block copperBlock = new peanut.tta.block.BlockcopperBlock().setUnlocalizedName("Copper Block");
	public static final Block tinBlock = new peanut.tta.block.BlocktinBlock().setUnlocalizedName("Tin Block");
	public static final Block silverBlock = new peanut.tta.block.BlocksilverBlock().setUnlocalizedName("Silver Block");
	public static final Block leadBlock = new peanut.tta.block.BlockleadBlock().setUnlocalizedName("Lead Block");
	public static final Block aluminumBlock = new peanut.tta.block.BlockaluminumBlock().setUnlocalizedName("Aluminum Block");
	public static final Block titaniumBlock = new peanut.tta.block.BlocktitaniumBlock().setUnlocalizedName("Titanium Block");
	public static final Block uraniumBlock = new peanut.tta.block.BlockuraniumBlock().setUnlocalizedName("Uranium Block");
	public static final Block cobaltBlock = new peanut.tta.block.BlockcobaltBlock().setUnlocalizedName("Cobalt Block");
	public static final Block magnesiumBlock = new peanut.tta.block.BlockmagnesiumBlock().setUnlocalizedName("Magnesium Block");
	
	


public static void init(){
	
	GameRegistry.registerBlock(copperOre, Names.Blocks.COPPER_ORE);
	GameRegistry.registerBlock(tinOre, Names.Blocks.TIN_ORE);
	GameRegistry.registerBlock(silverOre, Names.Blocks.SILVER_ORE);
	GameRegistry.registerBlock(leadOre, Names.Blocks.LEAD_ORE);
	GameRegistry.registerBlock(aluminumOre, Names.Blocks.ALUMINUM_ORE);
	GameRegistry.registerBlock(titaniumOre, Names.Blocks.TITANIUM_ORE);
	GameRegistry.registerBlock(uraniumOre, Names.Blocks.URANIUM_ORE);
	GameRegistry.registerBlock(cobaltOre, Names.Blocks.COBALT_ORE);
	GameRegistry.registerBlock(magnesiumOre, Names.Blocks.MAGNESIUM_ORE);
	GameRegistry.registerBlock(rubyOre, Names.Blocks.RUBY_ORE);
	GameRegistry.registerBlock(sapphireOre, Names.Blocks.SAPPHIRE_ORE);
	GameRegistry.registerBlock(amethystOre, Names.Blocks.AMETHYST_ORE);
	GameRegistry.registerBlock(copperBlock, Names.Blocks.COPPER_BLOCK);
	GameRegistry.registerBlock(tinBlock, Names.Blocks.TIN_BLOCK);
	GameRegistry.registerBlock(silverBlock, Names.Blocks.SILVER_BLOCK);
	GameRegistry.registerBlock(leadBlock, Names.Blocks.LEAD_BLOCK);
	GameRegistry.registerBlock(aluminumBlock, Names.Blocks.ALUMINIUM_BLOCK);
	GameRegistry.registerBlock(titaniumBlock, Names.Blocks.TITANIUM_BLOCK);
	GameRegistry.registerBlock(uraniumBlock, Names.Blocks.URANIUM_BLOCK);
	GameRegistry.registerBlock(cobaltBlock, Names.Blocks.COBALT_BLOCK);
	GameRegistry.registerBlock(magnesiumBlock, Names.Blocks.MAGNESIUM_BLOCK);
	LanguageRegistry.addName(copperOre, "Cuprite");
	LanguageRegistry.addName(tinOre, "Cassiterite");
	LanguageRegistry.addName(silverOre, "Argentite");
	LanguageRegistry.addName(leadOre, "Pyrite");
	LanguageRegistry.addName(aluminumOre, "Bauxite");
	LanguageRegistry.addName(titaniumOre, "Ilmenite");
	LanguageRegistry.addName(uraniumOre, "Uranite");
	LanguageRegistry.addName(cobaltOre, "Cobalatite");
	LanguageRegistry.addName(magnesiumOre, "Dolomite");
	LanguageRegistry.addName(rubyOre, "Ruby Ore");
	LanguageRegistry.addName(sapphireOre, "Sapphire Ore");
	LanguageRegistry.addName(amethystOre, "Amethyst Ore");
	LanguageRegistry.addName(copperBlock, "Copper Block");
	LanguageRegistry.addName(tinBlock, "Tin Block");
	LanguageRegistry.addName(silverBlock, "Silver Block");
	LanguageRegistry.addName(leadBlock, "Lead Block");
	LanguageRegistry.addName(aluminumBlock, "Aluminum Block");
	LanguageRegistry.addName(titaniumBlock, "Titanium Block");
	LanguageRegistry.addName(uraniumBlock, "Uranium Block");
	LanguageRegistry.addName(cobaltBlock, "Cobalt Block");
	LanguageRegistry.addName(magnesiumBlock, "Magnesium Block");
	}
}
