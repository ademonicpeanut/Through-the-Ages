package peanut.tta.item;

import peanut.tta.creativetab.CreactiveTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSword;

public class ItembronzeSword extends ItemSword {
	
public ItembronzeSword(){
		
		super(1317, ToolMaterials.toolBronze);
		this.setCreativeTab(CreactiveTabs.TTA_TABCOMBAT);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("tta:bronzeSword");
	}

}
