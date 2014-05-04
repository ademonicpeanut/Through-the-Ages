package peanut.tta.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import peanut.tta.creativetab.CreactiveTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockresearchTable extends Block {
	
    private Icon field_40000_a;
    private Icon field_40000_b;

    public BlockresearchTable(){
	   super(822, Material.wood);
	   this.setHardness(0.3F);
	   this.setCreativeTab(CreactiveTabs.TTA_TABBASE);
	   this.setStepSound(soundWoodFootstep);
    }

    public void registerIcons(IconRegister iconRegister){
    	this.blockIcon =  iconRegister.registerIcon("tta:table_Side");
    	this.field_40000_a =  iconRegister.registerIcon("tta:table_Top");
    	this.field_40000_b = iconRegister.registerIcon("tta:table_Bottom");
        
    }
    public Icon getIcon(int par1, int par2){
    	return par1 == 0 ? this.field_40000_b : (par1 == 1 ? this.field_40000_a : this.blockIcon);
    }
    //TODO make this block placable like a bed, also 1x2 big. Also make an interface.
}

    
