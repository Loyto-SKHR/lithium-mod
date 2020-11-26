package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;

public class ItemLithiumShovel extends ItemSpade {

	public ItemLithiumShovel(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("lithiumShovel");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}

	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":lithium-shovel");
    }
}
