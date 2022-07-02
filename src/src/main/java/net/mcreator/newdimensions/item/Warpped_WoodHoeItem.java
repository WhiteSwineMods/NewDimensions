
package net.mcreator.newdimensions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;
import net.minecraft.block.Blocks;

import net.mcreator.newdimensions.itemgroup.NewDimensionsItemGroup;
import net.mcreator.newdimensions.NewdimensionsModElements;

@NewdimensionsModElements.ModElement.Tag
public class Warpped_WoodHoeItem extends NewdimensionsModElements.ModElement {
	@ObjectHolder("newdimensions:warpped_wood_hoe")
	public static final Item block = null;
	public Warpped_WoodHoeItem(NewdimensionsModElements instance) {
		super(instance, 196);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 137;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 9;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.WARPED_STEM, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(NewDimensionsItemGroup.tab)) {
		}.setRegistryName("warpped_wood_hoe"));
	}
}
