package com.servegame.bl4de.PlayGround.item;

import com.servegame.bl4de.PlayGround.PlayGround;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * File: ItemPlayGroundItem.java
 *
 * @author Brandon Bires-Navel (brandonnavel@outlook.com)
 */
public class ItemPlayGroundItem extends Item {

    public ItemPlayGroundItem(String name) {
        setUnlocalizedName(name);
        setCreativeTab(PlayGround.CREATIVETAB);
        setRegistryName(name);

    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Item tool tip");
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.getBlockState(pos).getBlock() == Blocks.GRASS){
            worldIn.setBlockState(pos, Blocks.DIAMOND_BLOCK.getDefaultState());
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }




}
