package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemSodiumShovel  extends ItemSpade {

	public ItemSodiumShovel(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("sodiumShovel");
		this.setCreativeTab(ModLithium.lithiumCreativeTabs);
	}

	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":sodium-shovel");
    }

}
