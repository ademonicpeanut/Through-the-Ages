package peanut.tta.item;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class ToolMaterials {

	public static EnumToolMaterial toolBronze = EnumHelper.addToolMaterial("BRONZE", 2, 512, 4.5F, 1.5F, 15);
	public static EnumArmorMaterial armorBronze = EnumHelper.addArmorMaterial("BRONZE", 20, new int[]{2, 5, 4, 2}, 10);
	
}
