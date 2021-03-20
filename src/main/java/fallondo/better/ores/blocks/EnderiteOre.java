package fallondo.better.ores.blocks;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;

public class EnderiteOre extends Block {
    public EnderiteOre() {
        super(FabricBlockSettings.of(Material.METAL)
            .strength(9f, 12f)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool()
            .breakByTool(FabricToolTags.PICKAXES));
    }
}
