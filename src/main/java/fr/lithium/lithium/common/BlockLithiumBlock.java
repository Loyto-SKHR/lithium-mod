package fr.lithium.lithium.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLithiumBlock extends Block {

	public BlockLithiumBlock(Material material) {
		super(material);
        
        this.setBlockName("lithiumBlock");
        this.setBlockTextureName(ModLithium.MODID + ":lithium-block");
        this.setCreativeTab(ModLithium.lithiumCreativeTabs);

        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(4.0F);
        this.setResistance(5.0F);
	}
}
