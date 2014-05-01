package peanut.tta.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import peanut.tta.creativetab.CreactiveTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemleadIngot extends Item {
	
	public ItemleadIngot(){
		
		super(1303);
		this.setCreativeTab(CreactiveTabs.TTA_TABBASE);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("tta:leadIngot");

	}
}
