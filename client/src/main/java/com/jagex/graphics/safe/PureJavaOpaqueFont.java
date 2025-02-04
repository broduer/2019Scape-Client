package com.jagex.graphics.safe;

import com.jagex.game.client.JavaGraphicsRelated3;
import com.jagex.graphics.Font;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.FullSpriteData;
import com.jagex.graphics.PalettedSpriteData;
import com.jagex.graphics.SpriteRelated;
import deob.ObfuscatedName;

@ObfuscatedName("afl")
public class PureJavaOpaqueFont extends Font {

	@ObfuscatedName("afl.o")
	public PureJavaToolkit field10238;

	@ObfuscatedName("afl.s")
	public byte[][] field10239;

	public PureJavaOpaqueFont(PureJavaToolkit arg0, FontMetrics arg1, PalettedSpriteData arg2) {
		super(arg0, arg1);
		this.field10238 = arg0;
		this.field10239 = new byte[256][];
		for (int var4 = 0; var4 < 256; var4++) {
			int var5 = this.fontMetrics.method14558(var4);
			int var6 = this.fontMetrics.method14529(var4);
			short[] var7 = this.fontMetrics.method14561(var4);
			short var8 = var7[0];
			short var9 = var7[1];
			byte[] var10 = new byte[var5 * var6];
			for (int var11 = 0; var11 < var6; var11++) {
				for (int var12 = 0; var12 < var5; var12++) {
					var10[var5 * var11 + var12] = arg2.colour[this.fontMetrics.field8570 * var12 + this.fontMetrics.field8571 * (this.fontMetrics.field8570 * var11 + var9) + var8];
				}
			}
			this.field10239[var4] = var10;
		}
	}

	public PureJavaOpaqueFont(PureJavaToolkit arg0, FontMetrics arg1, FullSpriteData arg2) {
		super(arg0, arg1);
		this.field10238 = arg0;
		int[] var4 = arg2.method2604(false);
		this.field10239 = new byte[256][];
		for (int var5 = 0; var5 < 256; var5++) {
			int var6 = this.fontMetrics.method14558(var5);
			int var7 = this.fontMetrics.method14529(var5);
			short[] var8 = this.fontMetrics.method14561(var5);
			short var9 = var8[0];
			short var10 = var8[1];
			byte[] var11 = new byte[var6 * var7];
			for (int var12 = 0; var12 < var7; var12++) {
				for (int var13 = 0; var13 < var6; var13++) {
					int var14 = var4[this.fontMetrics.field8570 * var13 + this.fontMetrics.field8571 * (this.fontMetrics.field8570 * var12 + var10) + var9];
					byte var15 = (byte) ((var14 & 0xFF) + (var14 >> 8 & 0xFF) * 4 + (var14 >> 16 & 0xFF) * 3 >> 3);
					var11[var6 * var12 + var13] = var15;
				}
			}
			this.field10239[var5] = var11;
		}
	}

	@ObfuscatedName("afl.s(CIIIZ)V")
	public void drawChar(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.field10238.colour == null) {
			return;
		}
		int var6 = arg2 + this.fontMetrics.method14560(arg0);
		int var7 = this.fontMetrics.method14558(arg0);
		int var8 = this.fontMetrics.method14529(arg0);
		int var9 = this.field10238.sizeX;
		int var10 = var6 * var9 + arg1;
		int var11 = var9 - var7;
		int var12 = 0;
		int var13 = 0;
		if (var6 < this.field10238.clipMinY) {
			int var14 = this.field10238.clipMinY - var6;
			var8 -= var14;
			var6 = this.field10238.clipMinY;
			var13 += var7 * var14;
			var10 += var9 * var14;
		}
		if (var6 + var8 > this.field10238.clipMaxY) {
			var8 -= var6 + var8 - this.field10238.clipMaxY;
		}
		if (arg1 < this.field10238.clipMinX) {
			int var15 = this.field10238.clipMinX - arg1;
			var7 -= var15;
			arg1 = this.field10238.clipMinX;
			var13 += var15;
			var10 += var15;
			var12 += var15;
			var11 += var15;
		}
		if (arg1 + var7 > this.field10238.clipMaxX) {
			int var16 = arg1 + var7 - this.field10238.clipMaxX;
			var7 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var7 <= 0 || var8 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method16394(this.field10239[arg0], this.field10238.colour, arg3, var13, var10, var7, var8, var11, var12);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method16400(this.field10239[arg0], this.field10238.colour, arg3, var13, var10, var7, var8, var11, var12);
		}
	}

	@ObfuscatedName("afl.bl([B[IIIIIIII)V")
	public void method16394(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (int var14 = var11; var14 < 0; var14++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("afl.bk([B[IIIIIIII)V")
	public void method16400(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg2 >>> 24;
		int var11 = 255 - var10;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					int var14 = ((arg2 & 0xFF00) * var10 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 & 0xFF00FF00) >> 8;
					int var15 = arg1[arg4];
					arg1[arg4++] = (((var15 & 0xFF00) * var11 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 & 0xFF00FF00) >> 8) + var14;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("afl.y(CIIIZLch;II)V")
	public void drawChar2(char arg0, int arg1, int arg2, int arg3, boolean arg4, SpriteRelated arg5, int arg6, int arg7) {
		if (this.field10238.colour == null) {
			return;
		}
		if (arg5 == null) {
			this.drawChar(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		int var9 = arg2 + this.fontMetrics.method14560(arg0);
		int var10 = this.fontMetrics.method14558(arg0);
		int var11 = this.fontMetrics.method14529(arg0);
		int var12 = this.field10238.sizeX;
		int var13 = var9 * var12 + arg1;
		int var14 = var12 - var10;
		int var15 = 0;
		int var16 = 0;
		if (var9 < this.field10238.clipMinY) {
			int var17 = this.field10238.clipMinY - var9;
			var11 -= var17;
			var9 = this.field10238.clipMinY;
			var16 += var10 * var17;
			var13 += var12 * var17;
		}
		if (var9 + var11 > this.field10238.clipMaxY) {
			var11 -= var9 + var11 - this.field10238.clipMaxY;
		}
		if (arg1 < this.field10238.clipMinX) {
			int var18 = this.field10238.clipMinX - arg1;
			var10 -= var18;
			arg1 = this.field10238.clipMinX;
			var16 += var18;
			var13 += var18;
			var15 += var18;
			var14 += var18;
		}
		if (arg1 + var10 > this.field10238.clipMaxX) {
			int var19 = arg1 + var10 - this.field10238.clipMaxX;
			var10 -= var19;
			var15 += var19;
			var14 += var19;
		}
		if (var10 <= 0 || var11 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method16396(this.field10239[arg0], this.field10238.colour, arg3, var16, var13, var10, var11, var14, var15, arg1, var9, this.fontMetrics.method14558(arg0), arg5, arg6, arg7);
		} else {
			this.method16397(this.field10239[arg0], this.field10238.colour, arg3, var16, var13, var10, var11, var14, var15, arg1, var9, this.fontMetrics.method14558(arg0), arg5, arg6, arg7);
		}
	}

	@ObfuscatedName("afl.bh([B[IIIIIIIIIIILch;II)V")
	public void method16396(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, SpriteRelated arg12, int arg13, int arg14) {
		JavaGraphicsRelated3 var16 = (JavaGraphicsRelated3) arg12;
		int[] var17 = var16.field9414;
		int[] var18 = var16.field9415;
		int var19 = arg10;
		if (arg14 > arg10) {
			var19 = arg14;
			arg4 += this.field10238.sizeX * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		int var20 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
		for (int var21 = var19; var21 < var20; var21++) {
			int var22 = var17[var21 - arg14] + arg13;
			int var23 = var18[var21 - arg14];
			int var24 = arg5;
			if (arg9 > var22) {
				int var25 = arg9 - var22;
				if (var25 >= var23) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				var23 -= var25;
			} else {
				int var26 = var22 - arg9;
				if (var26 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += var26;
				var24 = arg5 - var26;
				arg4 += var26;
			}
			int var27 = 0;
			if (var24 < var23) {
				var23 = var24;
			} else {
				var27 = var24 - var23;
			}
			for (int var28 = 0; var28 < var23; var28++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += arg8 + var27;
			arg4 += arg7 + var27;
		}
	}

	@ObfuscatedName("afl.bx([B[IIIIIIIIIIILch;II)V")
	public void method16397(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, SpriteRelated arg12, int arg13, int arg14) {
		JavaGraphicsRelated3 var16 = (JavaGraphicsRelated3) arg12;
		int[] var17 = var16.field9414;
		int[] var18 = var16.field9415;
		int var19 = arg9 - this.field10238.clipMinX;
		int var20 = arg10;
		if (arg14 > arg10) {
			var20 = arg14;
			arg4 += this.field10238.sizeX * (arg14 - arg10);
			arg3 += (arg14 - arg10) * arg11;
		}
		int var21 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
		int var22 = arg2 >>> 24;
		int var23 = 255 - var22;
		for (int var24 = var20; var24 < var21; var24++) {
			int var25 = var17[var24 - arg14] + arg13;
			int var26 = var18[var24 - arg14];
			int var27 = arg5;
			if (var19 > var25) {
				int var28 = var19 - var25;
				if (var28 >= var26) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				var26 -= var28;
			} else {
				int var29 = var25 - var19;
				if (var29 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += var29;
				var27 = arg5 - var29;
				arg4 += var29;
			}
			int var30 = 0;
			if (var27 < var26) {
				var26 = var27;
			} else {
				var30 = var27 - var26;
			}
			for (int var31 = -var26; var31 < 0; var31++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					int var32 = ((arg2 & 0xFF00FF) * var22 & 0xFF00FF00) + ((arg2 & 0xFF00) * var22 & 0xFF0000) >> 8;
					int var33 = arg1[arg4];
					arg1[arg4++] = (((var33 & 0xFF00) * var23 & 0xFF0000) + ((var33 & 0xFF00FF) * var23 & 0xFF00FF00) >> 8) + var32;
				}
			}
			arg3 += arg8 + var30;
			arg4 += arg7 + var30;
		}
	}
}
