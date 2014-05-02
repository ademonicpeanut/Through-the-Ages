package peanut.tta.creativetab;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import peanut.tta.lib.Reference;
import peanut.tta.item.ModItems;

public class CreactiveTabs {
	
	public static final CreativeTabs TTA_TABBASE = new CreativeTabs(Reference.MOD_ID)
	{
		 @Override
	        public Item getTabIconItem()
	        {
	            return ModItems.bronzeIngot;
	        }
		 @Override
	        @SideOnly(Side.CLIENT)
	        public String getTranslatedTabLabel()
	        {
	            return "TtA Base";
	        }
	};
	public static final CreativeTabs TTA_TABTOOLS = new CreativeTabs(Reference.MOD_ID){
		
		@Override
		public Item getTabIconItem(){
			return ModItems.bronzePickaxe;
		}
		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel(){
			return "TtA Tools";
		}
	};
public static final CreativeTabs TTA_TABCOMBAT = new CreativeTabs(Reference.MOD_ID){
		
		@Override
		public Item getTabIconItem(){
			return ModItems.bronzeSword;
		}
		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel(){
			return "TtA Combat";
		}
	};
}
