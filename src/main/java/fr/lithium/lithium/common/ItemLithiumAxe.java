package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class ItemLithiumAxe extends ItemAxe {

	public ItemLithiumAxe(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("lithiumAxe");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}
	
	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":lithium-axe");
    }
}
