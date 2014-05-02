package peanut.tta.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import peanut.tta.creativetab.CreactiveTabs;

public class ItembronzeSet extends ItemArmor {

	public ItembronzeSet(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4, String nameToAdd) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(CreactiveTabs.TTA_TABCOMBAT);
		this.maxStackSize = 1;
		this.material = par2EnumArmorMaterial;
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		nametoadd = nameToAdd;
	}
	public EnumArmorMaterial material;
	public String nametoadd;
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer){
		if(stack.toString().contains("leggings")) {
			return "tta:" + nametoadd + "_2.png";
		}
		if(stack.toString().contains("Leggings")) if(itemID == ModItems.bronzeLeggings.itemID){
			return "tta:" + nametoadd + "_2.png";
		}
		return "tta:" + nametoadd + "_1.png";
		
	}
	public void registerIcons(IconRegister par1iconRegister){
		if(itemID == ModItems.bronzeHelmet.itemID){
			itemIcon = par1iconRegister.registerIcon("tta:bronzeHelmet");
		}
		if(itemID == ModItems.bronzeBody.itemID){
			itemIcon = par1iconRegister.registerIcon("tta:bronzeBody");
		}
		if(itemID == ModItems.bronzeLeggings.itemID){
			itemIcon = par1iconRegister.registerIcon("tta:bronzeLeggings");
		}
		if(itemID == ModItems.bronzeBoots.itemID){
			itemIcon = par1iconRegister.registerIcon("tta:bronzeBoots");
		}
	}
}
