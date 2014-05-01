package peanut.tta.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import peanut.tta.block.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGencobaltOre implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1 : generateNether(world, random, chunkX*16, chunkZ*16);
		case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		
		for(int i = 0; i < 22; i++){
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(48-16) + 16;
			int Zcoord = blockZ + random.nextInt(16);
			
			new WorldGenMinable(ModBlocks.cobaltOre.blockID, 6).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
	}

	private void generateNether(World world, Random random, int i, int j) {
		
		

	}

}
