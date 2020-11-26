package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemSodiumAxe extends ItemAxe {

	public ItemSodiumAxe(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("sodiumAxe");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}
	
	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":sodium-axe");
    }
}
