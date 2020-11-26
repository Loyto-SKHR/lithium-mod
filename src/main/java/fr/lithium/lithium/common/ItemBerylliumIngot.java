package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemBerylliumIngot extends Item {

	public ItemBerylliumIngot() {
		this.setUnlocalizedName("berylliumIngot");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}
		
	@Override
	public void registerIcons(IIconRegister iconregister)
	{
		this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":beryllium-ingot");
	}
}
