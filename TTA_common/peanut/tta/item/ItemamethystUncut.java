package peanut.tta.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import peanut.tta.creativetab.CreactiveTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemamethystUncut extends Item {
	
	public ItemamethystUncut(){
		super(1311);
		this.setCreativeTab(CreactiveTabs.TTA_TABBASE);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("tta:amethystUncut");

	}

}

