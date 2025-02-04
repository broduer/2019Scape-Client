package com.jagex.game.config.idktype;

import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.graphics.ModelUnlit;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("jv")
public class IDKType implements ConfigType {

	@ObfuscatedName("jv.e")
	public final Js5 configClient;

	@ObfuscatedName("jv.n")
	public int[] models;

	@ObfuscatedName("jv.m")
	public short[] recol_s;

	@ObfuscatedName("jv.k")
	public short[] recol_d;

	@ObfuscatedName("jv.f")
	public short[] retex_s;

	@ObfuscatedName("jv.w")
	public short[] retex_d;

	@ObfuscatedName("jv.l")
	public byte[] recolindices;

	@ObfuscatedName("jv.u")
	public byte[] retexindices;

	@ObfuscatedName("jv.z")
	public int[] heads = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("jv.p")
	public static final int[] field2951 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@ObfuscatedName("jv.d")
	public static final int[] field2959 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	public IDKType(int arg0, Js5 arg1) {
		this.configClient = arg1;
	}

	@ObfuscatedName("jv.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("jv.u(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			arg0.g1();
		} else if (arg1 == 2) {
			int var3 = arg0.g1();
			this.models = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.models[var4] = arg0.gSmart2or4s();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				int var5 = arg0.g1();
				this.recol_s = new short[var5];
				this.recol_d = new short[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.recol_s[var6] = (short) arg0.g2();
					this.recol_d[var6] = (short) arg0.g2();
				}
			} else if (arg1 == 41) {
				int var7 = arg0.g1();
				this.retex_s = new short[var7];
				this.retex_d = new short[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					this.retex_s[var8] = (short) arg0.g2();
					this.retex_d[var8] = (short) arg0.g2();
				}
			} else if (arg1 == 44) {
				int var9 = arg0.g2();
				int var10 = 0;
				for (int var11 = var9; var11 > 0; var11 >>= 0x1) {
					var10++;
				}
				this.recolindices = new byte[var10];
				byte var12 = 0;
				for (int var13 = 0; var13 < var10; var13++) {
					if ((var9 & 0x1 << var13) > 0) {
						this.recolindices[var13] = var12++;
					} else {
						this.recolindices[var13] = -1;
					}
				}
			} else if (arg1 == 45) {
				int var14 = arg0.g2();
				int var15 = 0;
				for (int var16 = var14; var16 > 0; var16 >>= 0x1) {
					var15++;
				}
				this.retexindices = new byte[var15];
				byte var17 = 0;
				for (int var18 = 0; var18 < var15; var18++) {
					if ((var14 & 0x1 << var18) > 0) {
						this.retexindices[var18] = var17++;
					} else {
						this.retexindices[var18] = -1;
					}
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.heads[arg1 - 60] = arg0.gSmart2or4s();
			}
		}
	}

	@ObfuscatedName("jv.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("jv.z(B)Z")
	public boolean hasReadyModels() {
		if (this.models == null) {
			return true;
		}
		boolean var1 = true;
		Js5 var2 = this.configClient;
		synchronized (this.configClient) {
			for (int var3 = 0; var3 < this.models.length; var3++) {
				if (!this.configClient.requestdownload(this.models[var3], 0)) {
					var1 = false;
				}
			}
			return var1;
		}
	}

	@ObfuscatedName("jv.p(I)Ldq;")
	public ModelUnlit getModel() {
		if (this.models == null) {
			return null;
		}
		ModelUnlit[] var1 = new ModelUnlit[this.models.length];
		Js5 var2 = this.configClient;
		synchronized (this.configClient) {
			int var3 = 0;
			while (true) {
				if (var3 >= this.models.length) {
					break;
				}
				var1[var3] = ModelUnlit.get(this.configClient, this.models[var3], 0);
				var3++;
			}
		}
		for (int var5 = 0; var5 < this.models.length; var5++) {
			if (var1[var5].version < 13) {
				var1[var5].scaleByPowerOfTwo(2);
			}
		}
		ModelUnlit var6;
		if (var1.length == 1) {
			var6 = var1[0];
		} else {
			var6 = new ModelUnlit(var1, var1.length);
		}
		if (var6 == null) {
			return null;
		}
		if (this.recol_s != null) {
			for (int var7 = 0; var7 < this.recol_s.length; var7++) {
				var6.method1943(this.recol_s[var7], this.recol_d[var7]);
			}
		}
		if (this.retex_s != null) {
			for (int var8 = 0; var8 < this.retex_s.length; var8++) {
				var6.method1937(this.retex_s[var8], this.retex_d[var8]);
			}
		}
		return var6;
	}

	@ObfuscatedName("jv.d(I)Z")
	public boolean hasReadyHeads() {
		boolean var1 = true;
		Js5 var2 = this.configClient;
		synchronized (this.configClient) {
			for (int var3 = 0; var3 < 5; var3++) {
				if (this.heads[var3] != -1 && !this.configClient.requestdownload(this.heads[var3], 0)) {
					var1 = false;
				}
			}
			return var1;
		}
	}

	@ObfuscatedName("jv.c(I)Ldq;")
	public ModelUnlit getHeadModel() {
		ModelUnlit[] var1 = new ModelUnlit[5];
		int var2 = 0;
		Js5 var3 = this.configClient;
		synchronized (this.configClient) {
			int var4 = 0;
			while (true) {
				if (var4 >= 5) {
					break;
				}
				if (this.heads[var4] != -1) {
					var1[var2++] = ModelUnlit.get(this.configClient, this.heads[var4], 0);
				}
				var4++;
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			if (var1[var6] != null && var1[var6].version < 13) {
				var1[var6].scaleByPowerOfTwo(2);
			}
		}
		ModelUnlit var7 = new ModelUnlit(var1, var2);
		if (this.recol_s != null) {
			for (int var8 = 0; var8 < this.recol_s.length; var8++) {
				var7.method1943(this.recol_s[var8], this.recol_d[var8]);
			}
		}
		if (this.retex_s != null) {
			for (int var9 = 0; var9 < this.retex_s.length; var9++) {
				var7.method1937(this.retex_s[var9], this.retex_d[var9]);
			}
		}
		return var7;
	}
}
