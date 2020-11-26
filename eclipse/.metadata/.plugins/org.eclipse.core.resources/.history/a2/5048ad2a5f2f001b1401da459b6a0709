package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemLithiumSword extends ItemSword {
	
	public ItemLithiumSword(ToolMaterial material) {

        super(material);
        
		this.setUnlocalizedName("itemLithiumSword");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":lithium-sword");
    }
}
