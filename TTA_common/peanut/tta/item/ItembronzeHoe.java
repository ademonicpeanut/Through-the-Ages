package peanut.tta.item;

import peanut.tta.creativetab.CreactiveTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemHoe;

public class ItembronzeHoe extends ItemHoe {
	
public ItembronzeHoe(){
		
		super(1318, ToolMaterials.toolBronze);
		this.setCreativeTab(CreactiveTabs.TTA_TABTOOLS);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("tta:bronzeHoe");
	}

}
