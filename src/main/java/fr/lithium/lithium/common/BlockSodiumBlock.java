package fr.lithium.lithium.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSodiumBlock extends Block {

	public BlockSodiumBlock(Material material) {
		super(material);
        
        this.setBlockName("sodiumBlock");
        this.setBlockTextureName(ModLithium.MODID + ":sodium-block");
        this.setCreativeTab(ModLithium.lithiumCreativeTabs);

        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(4.0F);
        this.setResistance(5.0F);
	}
}
