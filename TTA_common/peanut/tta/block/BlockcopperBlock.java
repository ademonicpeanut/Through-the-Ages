package peanut.tta.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import peanut.tta.creativetab.CreactiveTabs;

public class BlockcopperBlock extends Block {
	
	public BlockcopperBlock(){
		super(812, Material.iron);
		this.setHardness(2.0F);
		this.setCreativeTab(CreactiveTabs.TTA_TABBASE);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon("tta:copperBlock");
	}

}
