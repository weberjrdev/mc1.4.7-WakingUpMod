package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;

public class WorldGenClay extends WorldGenerator {

   private int field_76518_a;
   private int field_76517_b;


   public WorldGenClay(int p_i3787_1_) {
      this.field_76518_a = Block.field_72041_aW.field_71990_ca;
      this.field_76517_b = p_i3787_1_;
   }

   public boolean func_76484_a(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_) {
      if(p_76484_1_.func_72803_f(p_76484_3_, p_76484_4_, p_76484_5_) != Material.field_76244_g) {
         return false;
      } else {
         int var6 = p_76484_2_.nextInt(this.field_76517_b - 2) + 2;
         byte var7 = 1;

         for(int var8 = p_76484_3_ - var6; var8 <= p_76484_3_ + var6; ++var8) {
            for(int var9 = p_76484_5_ - var6; var9 <= p_76484_5_ + var6; ++var9) {
               int var10 = var8 - p_76484_3_;
               int var11 = var9 - p_76484_5_;
               if(var10 * var10 + var11 * var11 <= var6 * var6) {
                  for(int var12 = p_76484_4_ - var7; var12 <= p_76484_4_ + var7; ++var12) {
                     int var13 = p_76484_1_.func_72798_a(var8, var12, var9);
                     if(var13 == Block.field_71979_v.field_71990_ca || var13 == Block.field_72041_aW.field_71990_ca) {
                        p_76484_1_.func_72822_b(var8, var12, var9, this.field_76518_a);
                     }
                  }
               }
            }
         }

         return true;
      }
   }
}
