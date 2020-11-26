package fr.lithium.lithium.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LithiumCreativeTabs extends CreativeTabs {

	public LithiumCreativeTabs(String label)
    {
        super(label);
    }
	
	public Item getTabIconItem()
	{
	    return Item.getItemFromBlock(ModLithium.lithiumBlock);
	}
	
	@SideOnly(Side.CLIENT)
	public int func_151243_f()
	{
	    return 0;
	}
}
