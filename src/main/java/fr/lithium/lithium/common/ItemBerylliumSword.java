package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemBerylliumSword extends ItemSword {

	public ItemBerylliumSword(ToolMaterial material) {

        super(material);
        
		this.setUnlocalizedName("berylliumSword");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}

	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":beryllium-sword");
    }
}
