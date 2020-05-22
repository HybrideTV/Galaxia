package com.galaxia.mod.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator generator, IChunkProvider provider)
    {
        switch (world.provider.getDimension())
        {
            case 0:
                runGenerator(com.galaxia.mod.init.BlocksMod.galaxite_ore, Blocks.STONE, 3, 6, 0, 40, random, chunkX, chunkZ, world);
                runGenerator(com.galaxia.mod.init.BlocksMod.creedite_ore, Blocks.STONE, 3, 9, 0, 40, random, chunkX, chunkZ, world);
                runGenerator(com.galaxia.mod.init.BlocksMod.aragonite_ore, Blocks.STONE, 3, 15, 0, 40, random, chunkX, chunkZ, world);

                break;
        }
    }
 
    private void runGenerator(Block block, Block blockIn, int maxSize, int chance, int minHeight, int maxHeight, Random random, int chunkX, int chunkZ, World world)
    {
        if (minHeight > maxHeight || minHeight < 0 || minHeight > 256)
            throw new IllegalArgumentException("Ore Generated out of bounds");
 
        int heightDiff = maxHeight - minHeight + 1;
 
        for (int i = 0; i < chance; i++)
        {
            int x = chunkX * 16 + random.nextInt(16);
            int y = minHeight + random.nextInt(heightDiff);
            int z = chunkZ * 16 + random.nextInt(16);
 
            WorldGenerator generator = new WorldGenMinable(block.getDefaultState(), maxSize, BlockMatcher.forBlock(blockIn));
            generator.generate(world, random, new BlockPos(x, y, z));
        }
    }
}