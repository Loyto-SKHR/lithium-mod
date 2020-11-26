package fr.lithium.lithium.common;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemLithiumApple extends ItemFood {

	public ItemLithiumApple(int gigot, float saturation, boolean wolf) {
        super(gigot, saturation, wolf);
        
        this.setUnlocalizedName("lithiumApple");
        this.setCreativeTab(ModLithium.lithiumCreativeTabs);
        this.setAlwaysEdible();
    }
	
	@Override
    public void registerIcons(IIconRegister iconregister)
    {
        this.itemIcon = iconregister.registerIcon(ModLithium.MODID + ":lithium-apple");
    }
	
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 1200, 0));
		player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1200, 1));
		player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1200, 1));
		player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 2400, 2));
	}
}
