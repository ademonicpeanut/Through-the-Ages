package peanut.tta.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import peanut.tta.creativetab.CreactiveTabs;

public class ItemaluminumIngot extends Item {
	
	public ItemaluminumIngot(){
		
		super(1304);
		this.setCreativeTab(CreactiveTabs.TTA_TABBASE);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("tta:aluminumIngot");
	}
}
