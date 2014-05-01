package peanut.tta.item;

import peanut.tta.creativetab.CreactiveTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemAxe;

public class ItembronzeAxe extends ItemAxe {
	
public ItembronzeAxe(){
		
		super(1316, ToolMaterials.toolBronze);
		this.setCreativeTab(CreactiveTabs.TTA_TABTOOLS);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("tta:bronzeAxe");
	}

}
