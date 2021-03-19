package fallondo.better.ores.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class TinOre extends Block {
    public TinOre() {
        super(FabricBlockSettings.of(Material.STONE)
            .strength(5f, 6f)
            .sounds(BlockSoundGroup.STONE)
            .breakByHand(false)
            .breakByTool(FabricToolTags.PICKAXES));
    }
}
