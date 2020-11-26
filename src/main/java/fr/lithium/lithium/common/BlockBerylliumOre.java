package fr.lithium.lithium.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBerylliumOre extends Block {
	
    protected BlockBerylliumOre(Material material)
    {
        super(material);
        
        this.setBlockName("berylliumOre");
        this.setBlockTextureName(ModLithium.MODID + ":beryllium-ore");
        this.setCreativeTab(ModLithium.lithiumCreativeTabs);

        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(4.0F);
        this.setResistance(5.0F);
    }

}
