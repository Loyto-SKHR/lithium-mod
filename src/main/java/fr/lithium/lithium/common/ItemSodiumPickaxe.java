package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemSodiumPickaxe extends ItemPickaxe {

	public ItemSodiumPickaxe(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("sodiumPickaxe");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}
	

	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":sodium-pickaxe");
    }
}
