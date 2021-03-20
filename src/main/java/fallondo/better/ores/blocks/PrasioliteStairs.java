package fallondo.better.ores.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static fallondo.better.ores.BetterOres.AMETRINE_BLOCK;

public class PrasioliteStairs extends StairsBlock {
    public PrasioliteStairs() {
        super(AMETRINE_BLOCK.getDefaultState(),
            FabricBlockSettings.of(Material.STONE)
            .strength(2f, 3f)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool()
            .breakByTool(FabricToolTags.PICKAXES));
    }
}
