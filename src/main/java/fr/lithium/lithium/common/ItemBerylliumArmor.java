package fr.lithium.lithium.common;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemBerylliumArmor extends ItemArmor {
	public ItemBerylliumArmor(ArmorMaterial material, int type)
    {
        super(material, 0, type);
    }
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(slot == 2)
        {
            return ModLithium.MODID + ":textures/models/armor/beryllium-layer-2.png";
        }
        return ModLithium.MODID + ":textures/models/armor/beryllium-layer-1.png";
    }
}
