package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLithiumIngot extends Item {

	public ItemLithiumIngot() {
		this.setUnlocalizedName("lithiumIngot");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}
		
	@Override
	public void registerIcons(IIconRegister iconregister)
	{
		this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":lithium-ingot");
	}
}
