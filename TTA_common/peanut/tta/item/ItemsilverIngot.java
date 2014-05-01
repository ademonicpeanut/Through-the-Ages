package peanut.tta.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import peanut.tta.creativetab.CreactiveTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemsilverIngot extends Item {
	
public ItemsilverIngot(){
		
		super(1302);
		this.setCreativeTab(CreactiveTabs.TTA_TABBASE);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("tta:silverIngot");
	}
}


