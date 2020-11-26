package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemSodiumIngot extends Item {
	
	public ItemSodiumIngot() {
		this.setUnlocalizedName("lsodiumIngot");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}
		
	@Override
	public void registerIcons(IIconRegister iconregister)
	{
		this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":sodium-ingot");
	}
}
