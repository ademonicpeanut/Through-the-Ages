package peanut.tta.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import peanut.tta.creativetab.CreactiveTabs;
import peanut.tta.item.ToolMaterials;

public class ItembronzePickaxe extends ItemPickaxe {

	public ItembronzePickaxe(){
		
		super(1314, ToolMaterials.toolBronze);
		this.setCreativeTab(CreactiveTabs.TTA_TABTOOLS);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("tta:bronzePickaxe");
	}

}
