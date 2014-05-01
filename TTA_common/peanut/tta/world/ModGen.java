package peanut.tta.world;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModGen {
	
	public static WorldGencopperOre copperOreWorldGen = new WorldGencopperOre();
	public static WorldGentinOre tinOreWorldGen = new WorldGentinOre();
	public static WorldGensilverOre silverOreWorldGen = new WorldGensilverOre();
	public static WorldGenleadOre leadOreWorldGen = new WorldGenleadOre();
	public static WorldGenaluminumOre aluminumOreWorldGen = new WorldGenaluminumOre();
	public static WorldGentitaniumOre titaniumOreWorldGen = new WorldGentitaniumOre();
	public static WorldGenuraniumOre uraniumOreWorldGen = new WorldGenuraniumOre();
	public static WorldGencobaltOre cobaltOreWorldGen = new WorldGencobaltOre();
	public static WorldGenmagnesiumOre magnesiumOreWorldGen = new WorldGenmagnesiumOre();
	public static WorldGenrubyOre rubyOreWorldGen = new WorldGenrubyOre();
	public static WorldGensapphireOre sapphireOreWorldGen = new WorldGensapphireOre();
	public static WorldGenamethystOre amethystOreWorldGen = new WorldGenamethystOre();
	
	public static void init() {
		
		GameRegistry.registerWorldGenerator(copperOreWorldGen);
		GameRegistry.registerWorldGenerator(tinOreWorldGen);
		GameRegistry.registerWorldGenerator(silverOreWorldGen);
		GameRegistry.registerWorldGenerator(leadOreWorldGen);
		GameRegistry.registerWorldGenerator(aluminumOreWorldGen);
		GameRegistry.registerWorldGenerator(titaniumOreWorldGen);
		GameRegistry.registerWorldGenerator(uraniumOreWorldGen);
		GameRegistry.registerWorldGenerator(cobaltOreWorldGen);
		GameRegistry.registerWorldGenerator(magnesiumOreWorldGen);
		GameRegistry.registerWorldGenerator(rubyOreWorldGen);
		GameRegistry.registerWorldGenerator(sapphireOreWorldGen);
		GameRegistry.registerWorldGenerator(amethystOreWorldGen);
		
	}
}
