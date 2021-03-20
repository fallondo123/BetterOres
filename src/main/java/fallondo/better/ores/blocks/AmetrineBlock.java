package fallondo.better.ores.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class AmetrineBlock extends Block {
    public AmetrineBlock() {
        super(FabricBlockSettings.of(Material.STONE)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .breakByTool(FabricToolTags.PICKAXES));
    }
}
