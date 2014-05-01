package peanut.tta.item;

import peanut.tta.lib.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item copperIngot = new ItemcopperIngot().setUnlocalizedName("Copper Ingot");
	public static Item tinIngot = new ItemtinIngot().setUnlocalizedName("Tin Ingot");
	public static Item silverIngot = new ItemsilverIngot().setUnlocalizedName("Silver Ingot");
	public static Item leadIngot = new ItemleadIngot().setUnlocalizedName("Lead Ingot");
	public static Item aluminumIngot = new ItemaluminumIngot().setUnlocalizedName("Aluminum Ingot");
	public static Item titaniumIngot = new ItemtitaniumIngot().setUnlocalizedName("Titanium Ingot");
	public static Item uraniumIngot = new ItemuraniumIngot().setUnlocalizedName("Uranium Ingot");
	public static Item cobaltIngot = new ItemcobaltIngot().setUnlocalizedName("Cobalt Ingot");
	public static Item magnesiumIngot = new ItemmagnesiumIngot().setUnlocalizedName("Magnesium Ingot");
	public static Item rubyUncut = new ItemrubyUncut().setUnlocalizedName("Uncut Ruby");
	public static Item sapphireUncut = new ItemsapphireUncut().setUnlocalizedName("Uncut Sapphire");
	public static Item amethystUncut = new ItemamethystUncut().setUnlocalizedName("Uncut Amethyst");
	public static Item bronzeMixture = new ItembronzeMixture().setUnlocalizedName("Bronze Mixture");
	public static Item bronzeIngot = new ItembronzeIngot().setUnlocalizedName("Bronze Ingot");
	public static Item bronzePickaxe = new ItembronzePickaxe().setUnlocalizedName("Bronze Pickaxe");
	public static Item bronzeShovel = new ItembronzeShovel().setUnlocalizedName("Bronze Shovel");
	public static Item bronzeAxe = new ItembronzeAxe().setUnlocalizedName("Bronze Axe");
	public static Item bronzeHoe = new ItembronzeHoe().setUnlocalizedName("Bronze Hoe");
	public static Item bronzeSword = new ItembronzeSword().setUnlocalizedName("Bronze Sword");
	
	
	public static void init(){
		
		GameRegistry.registerItem(copperIngot, Names.Items.COPPER_INGOT);
		GameRegistry.registerItem(tinIngot, Names.Items.TIN_INGOT);
		GameRegistry.registerItem(silverIngot, Names.Items.SILVER_INGOT);
		GameRegistry.registerItem(leadIngot, Names.Items.LEAD_INGOT);
		GameRegistry.registerItem(aluminumIngot, Names.Items.ALUMINUM_INGOT);
		GameRegistry.registerItem(titaniumIngot, Names.Items.TITANIUM_INGOT);
		GameRegistry.registerItem(uraniumIngot, Names.Items.URANIUM_INGOT);
		GameRegistry.registerItem(cobaltIngot, Names.Items.COBALT_INGOT);
		GameRegistry.registerItem(magnesiumIngot, Names.Items.MAGNESIUM_INGOT);
		GameRegistry.registerItem(rubyUncut, Names.Items.RUBY_UNCUT);
		GameRegistry.registerItem(sapphireUncut, Names.Items.SAPPHIRE_UNCUT);
		GameRegistry.registerItem(amethystUncut, Names.Items.AMETHYST_UNCUT);
		GameRegistry.registerItem(bronzeMixture, Names.Items.BRONZE_MIXTURE);
		GameRegistry.registerItem(bronzeIngot, Names.Items.BRONZE_INGOT);
		GameRegistry.registerItem(bronzePickaxe, Names.Items.BRONZE_PICKAXE);
		GameRegistry.registerItem(bronzeShovel, Names.Items.BRONZE_SHOVEL);
		GameRegistry.registerItem(bronzeAxe, Names.Items.BRONZE_AXE);
		GameRegistry.registerItem(bronzeHoe, Names.Items.BRONZE_HOE);
		GameRegistry.registerItem(bronzeSword, Names.Items.BRONZE_SWORD);
		LanguageRegistry.addName(copperIngot, "Copper Ingot");
		LanguageRegistry.addName(tinIngot, "Tin Ingot");
		LanguageRegistry.addName(silverIngot, "Silver Ingot");
		LanguageRegistry.addName(leadIngot, "Lead Ingot");
		LanguageRegistry.addName(aluminumIngot, "Aluminum Ingot");
		LanguageRegistry.addName(titaniumIngot, "Titanium Ingot");
		LanguageRegistry.addName(uraniumIngot, "Uranium Ingot");
		LanguageRegistry.addName(cobaltIngot, "Cobalt Ingot");
		LanguageRegistry.addName(magnesiumIngot, "Magnesium Ingot");
		LanguageRegistry.addName(rubyUncut, "Uncut Ruby");
		LanguageRegistry.addName(sapphireUncut, "Uncut Sapphire");
		LanguageRegistry.addName(amethystUncut, "Uncut Amethyst");
		LanguageRegistry.addName(bronzeMixture, "Bronze Mixture");
		LanguageRegistry.addName(bronzeIngot, "Bronze Ingot");
		LanguageRegistry.addName(bronzePickaxe, "Bronze Pickaxe");
		LanguageRegistry.addName(bronzeShovel, "Bronze Shovel");
		LanguageRegistry.addName(bronzeAxe, "Bronze Axe");
		LanguageRegistry.addName(bronzeHoe, "Bronze Hoe");
		LanguageRegistry.addName(bronzeSword, "Bronze Sword");
		}
	}


