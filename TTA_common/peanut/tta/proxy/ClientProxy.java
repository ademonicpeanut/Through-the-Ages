package peanut.tta.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import peanut.tta.lib.RenderIds;

public class ClientProxy extends CommonProxy {

	@Override
	public void initRenderingAndTextures() {
		RenderIds.copperOre = RenderingRegistry.getNextAvailableRenderId();
		
		
	}

	@Override
	public void registerTileEntities() {
		
		
	}

}
