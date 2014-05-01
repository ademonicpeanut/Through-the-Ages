package peanut.tta.block;

import peanut.tta.creativetab.CreactiveTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockaluminumOre extends BlockSand{
	
	public BlockaluminumOre(){
	super(804, Material.sand);
	this.setHardness(0.6F);
	this.setCreativeTab(CreactiveTabs.TTA_TABBASE);
	this.setStepSound(soundGravelFootstep);
	}

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister){
	this.blockIcon = iconRegister.registerIcon("tta:aluminumOre");
	}   

}


