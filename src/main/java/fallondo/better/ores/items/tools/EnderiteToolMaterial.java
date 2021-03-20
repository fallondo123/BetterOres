package fallondo.better.ores.items.tools;

import fallondo.better.ores.BetterOres;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EnderiteToolMaterial implements ToolMaterial {

    public static final EnderiteToolMaterial INSTANCE = new EnderiteToolMaterial();

    @Override
    public int getDurability() {
        return 4062;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }

    @Override
    public float getAttackDamage() {
        return 4.5F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BetterOres.ENDERITE_INGOT);
    }

}
