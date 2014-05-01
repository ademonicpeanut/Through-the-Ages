package peanut.tta.item;

import peanut.tta.creativetab.CreactiveTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemcobaltIngot extends Item {
	
public ItemcobaltIngot(){
		
		super(1307);
		this.setCreativeTab(CreactiveTabs.TTA_TABBASE);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("tta:cobaltIngot");
	}

}
