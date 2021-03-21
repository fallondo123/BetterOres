package fallondo.better.ores.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static fallondo.better.ores.BetterOres.CITRINE_BLOCK;

public class CitrineStairs extends StairsBlock {
    public CitrineStairs() {
        super(CITRINE_BLOCK.getDefaultState(),
            FabricBlockSettings.of(Material.STONE)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .breakByTool(FabricToolTags.PICKAXES, 2));
    }
}
