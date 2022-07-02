
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
public class Dark_Oak_WoodHoeItem extends NewdimensionsModElements.ModElement {
	@ObjectHolder("newdimensions:dark_oak_wood_hoe")
	public static final Item block = null;
	public Dark_Oak_WoodHoeItem(NewdimensionsModElements instance) {
		super(instance, 176);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 122;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.DARK_OAK_LOG, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(NewDimensionsItemGroup.tab)) {
		}.setRegistryName("dark_oak_wood_hoe"));
	}
}
