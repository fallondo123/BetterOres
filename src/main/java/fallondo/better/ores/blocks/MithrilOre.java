package fallondo.better.ores.blocks;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;

public class MithrilOre extends Block {
    public MithrilOre() {
        super(FabricBlockSettings.of(Material.STONE)
            .strength(5f, 6f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .breakByTool(FabricToolTags.PICKAXES));
    }
}
