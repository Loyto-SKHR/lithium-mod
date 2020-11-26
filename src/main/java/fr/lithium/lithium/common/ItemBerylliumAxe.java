package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemBerylliumAxe extends ItemAxe {

	public ItemBerylliumAxe(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("berylliumAxe");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}
	
	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":beryllium-axe");
    }

}
