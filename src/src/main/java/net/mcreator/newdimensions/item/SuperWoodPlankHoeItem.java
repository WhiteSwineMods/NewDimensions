
package net.mcreator.newdimensions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.newdimensions.itemgroup.NewDimensionsItemGroup;
import net.mcreator.newdimensions.block.SuperWoodPlanksBlock;
import net.mcreator.newdimensions.NewdimensionsModElements;

@NewdimensionsModElements.ModElement.Tag
public class SuperWoodPlankHoeItem extends NewdimensionsModElements.ModElement {
	@ObjectHolder("newdimensions:super_wood_plank_hoe")
	public static final Item block = null;
	public SuperWoodPlankHoeItem(NewdimensionsModElements instance) {
		super(instance, 229);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SuperWoodPlanksBlock.block, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(NewDimensionsItemGroup.tab)) {
		}.setRegistryName("super_wood_plank_hoe"));
	}
}
