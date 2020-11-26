package fr.lithium.lithium.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSodiumOre extends Block {
	
    protected BlockSodiumOre(Material material)
    {
        super(material);
        
        this.setBlockName("sodiumOre");
        this.setBlockTextureName(ModLithium.MODID + ":sodium-ore");
        this.setCreativeTab(ModLithium.lithiumCreativeTabs);

        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(4.0F);
        this.setResistance(5.0F);
    }
}
