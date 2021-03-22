package fallondo.better.ores.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class EnderiteBlock extends Block {
    public EnderiteBlock() {
        super(FabricBlockSettings.of(Material.METAL)
            .strength(10f, 12f)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
            .breakByTool(FabricToolTags.PICKAXES, 5));
    }
}
