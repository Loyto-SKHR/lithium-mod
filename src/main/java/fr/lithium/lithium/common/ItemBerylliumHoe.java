package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemBerylliumHoe extends ItemHoe {
	
	public ItemBerylliumHoe(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("berylliumHoe");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}
	
	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":beryllium-hoe");
    }

}
