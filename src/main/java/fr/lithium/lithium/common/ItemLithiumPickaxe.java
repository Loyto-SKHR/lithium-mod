package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;

public class ItemLithiumPickaxe extends ItemPickaxe {
	
	public ItemLithiumPickaxe(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("lithiumPickaxe");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}
	

	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":lithium-pickaxe");
    }
}
