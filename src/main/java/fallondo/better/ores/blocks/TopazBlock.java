package fallondo.better.ores.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class TopazBlock extends Block {
    public TopazBlock() {
        super(FabricBlockSettings.of(Material.METAL)
            .strength(5f, 6f)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
            .breakByTool(FabricToolTags.PICKAXES));
    }
}
