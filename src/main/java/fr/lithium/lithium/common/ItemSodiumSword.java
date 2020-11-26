package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSodiumSword extends ItemSword {

	public ItemSodiumSword(ToolMaterial material) {

        super(material);
        
		this.setUnlocalizedName("sodiumSword");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}

	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":sodium-sword");
    }
}
