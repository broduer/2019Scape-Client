package com.jagex.graphics;

import com.jagex.core.utils.Cp1252;
import com.jagex.core.utils.StringTools;
import deob.ObfuscatedName;
import java.util.Random;

@ObfuscatedName("eu")
public abstract class Font {

	@ObfuscatedName("eu.e")
	public FontMetrics fontMetrics;

	@ObfuscatedName("eu.n")
	public Toolkit toolkit;

	@ObfuscatedName("eu.w")
	public static int strikethrough = -1;

	@ObfuscatedName("eu.l")
	public static int underline = -1;

	@ObfuscatedName("eu.u")
	public static int originalRgb = 0;

	@ObfuscatedName("eu.z")
	public static int rgb = 0;

	@ObfuscatedName("eu.p")
	public static int originalShadow = 0;

	@ObfuscatedName("eu.d")
	public static int shadow = 0;

	@ObfuscatedName("eu.c")
	public static int field1677 = 0;

	@ObfuscatedName("eu.r")
	public static int field1678 = 0;

	@ObfuscatedName("eu.v")
	public static String[] stringBuilder = new String[100];

	public Font(Toolkit arg0, FontMetrics arg1) {
		this.toolkit = arg0;
		this.fontMetrics = arg1;
	}

	@ObfuscatedName("eu.e(Ljava/lang/String;IIIIB)V")
	public void drawString(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.setStyle(arg3, arg4);
			this.drawChars(arg0, arg1, arg2, null, null, null, 0, 0);
		}
	}

	@ObfuscatedName("eu.n(Ljava/lang/String;IIIII)V")
	public void drawStringRight(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.setStyle(arg3, arg4);
			this.drawChars(arg0, arg1 - this.fontMetrics.stringWidth(arg0), arg2, null, null, null, 0, 0);
		}
	}

	@ObfuscatedName("eu.m(Ljava/lang/String;IIIII)V")
	public void drawStringCenter(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.setStyle(arg3, arg4);
			this.drawChars(arg0, arg1 - this.fontMetrics.stringWidth(arg0) / 2, arg2, null, null, null, 0, 0);
		}
	}

	@ObfuscatedName("eu.k(Ljava/lang/String;IIIIIIIII[Lcm;[ILch;IIS)I")
	public int drawStringTaggable(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Sprite[] arg10, int[] arg11, SpriteRelated arg12, int arg13, int arg14) {
		return this.drawStringTaggable(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14);
	}

	@ObfuscatedName("eu.f(Ljava/lang/String;IIIIIIIIII[Lcm;[ILch;III)I")
	public int drawStringTaggable(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Sprite[] arg11, int[] arg12, SpriteRelated arg13, int arg14, int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.setStyle(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.fontMetrics.field8566;
		}
		int[] var17;
		if (arg4 < this.fontMetrics.field8569 + this.fontMetrics.field8562 + arg9 && arg4 < arg9 + arg9) {
			var17 = null;
		} else {
			var17 = new int[] { arg3 };
		}
		int var18 = this.fontMetrics.splitInit(arg0, var17, stringBuilder, arg11);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && var18 >= arg10) {
			stringBuilder[arg10 - 1] = this.fontMetrics.truncString(stringBuilder[arg10 - 1], arg3, arg11);
			var18 = arg10;
		}
		if (arg8 == 3 && var18 == 1) {
			arg8 = 1;
		}
		int var19;
		if (arg8 == 0) {
			var19 = this.fontMetrics.field8562 + arg2;
		} else if (arg8 == 1) {
			var19 = (arg4 - this.fontMetrics.field8562 - this.fontMetrics.field8569 - (var18 - 1) * arg9) / 2 + this.fontMetrics.field8562 + arg2;
		} else if (arg8 == 2) {
			var19 = arg2 + arg4 - this.fontMetrics.field8569 - (var18 - 1) * arg9;
		} else {
			int var20 = (arg4 - this.fontMetrics.field8562 - this.fontMetrics.field8569 - (var18 - 1) * arg9) / (var18 + 1);
			if (var20 < 0) {
				var20 = 0;
			}
			var19 = this.fontMetrics.field8562 + arg2 + var20;
			arg9 += var20;
		}
		for (int var21 = 0; var21 < var18; var21++) {
			if (arg7 == 0) {
				this.drawChars(stringBuilder[var21], arg1, var19, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 1) {
				this.drawChars(stringBuilder[var21], arg1 + (arg3 - this.fontMetrics.stringWidth(stringBuilder[var21])) / 2, var19, arg11, arg12, arg13, arg14, arg15);
			} else if (arg7 == 2) {
				this.drawChars(stringBuilder[var21], arg1 + arg3 - this.fontMetrics.stringWidth(stringBuilder[var21]), var19, arg11, arg12, arg13, arg14, arg15);
			} else if (var18 - 1 == var21) {
				this.drawChars(stringBuilder[var21], arg1, var19, arg11, arg12, arg13, arg14, arg15);
			} else {
				this.method2716(stringBuilder[var21], arg3);
				this.drawChars(stringBuilder[var21], arg1, var19, arg11, arg12, arg13, arg14, arg15);
				field1677 = 0;
			}
			var19 += arg9;
		}
		return var18;
	}

	@ObfuscatedName("eu.w(Ljava/lang/String;IIIIII)V")
	public void drawCenteredWave(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == null) {
			return;
		}
		this.setStyle(arg3, arg4);
		int var7 = arg0.length();
		int[] var8 = new int[var7];
		for (int var9 = 0; var9 < var7; var9++) {
			var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
		}
		this.drawCharsAlpha(arg0, arg1 - this.fontMetrics.stringWidth(arg0) / 2, arg2, null, null, null, var8);
	}

	@ObfuscatedName("eu.l(Ljava/lang/String;IIIIIB)V")
	public void drawCenteredWave2(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == null) {
			return;
		}
		this.setStyle(arg3, arg4);
		int var7 = arg0.length();
		int[] var8 = new int[var7];
		int[] var9 = new int[var7];
		for (int var10 = 0; var10 < var7; var10++) {
			var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
			var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
		}
		this.drawCharsAlpha(arg0, arg1 - this.fontMetrics.stringWidth(arg0) / 2, arg2, null, null, var8, var9);
	}

	@ObfuscatedName("eu.u(Ljava/lang/String;IIIIIII)V")
	public void drawCenteredShake(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 == null) {
			return;
		}
		this.setStyle(arg3, arg4);
		double var8 = 7.0D - (double) arg6 / 8.0D;
		if (var8 < 0.0D) {
			var8 = 0.0D;
		}
		int var10 = arg0.length();
		int[] var11 = new int[var10];
		for (int var12 = 0; var12 < var10; var12++) {
			var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
		}
		this.drawCharsAlpha(arg0, arg1 - this.fontMetrics.stringWidth(arg0) / 2, arg2, null, null, null, var11);
	}

	@ObfuscatedName("eu.z(Ljava/lang/String;IIIILjava/util/Random;I[Lcm;[IB)I")
	public int method2689(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6, Sprite[] arg7, int[] arg8) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		int var10 = (arg5.nextInt() & 0x1F) + 192;
		this.setStyle(var10 << 24 | arg3 & 0xFFFFFF, var10 << 24 | arg4 & 0xFFFFFF);
		int var11 = arg0.length();
		int[] var12 = new int[var11];
		int var13 = 0;
		for (int var14 = 0; var14 < var11; var14++) {
			var12[var14] = var13;
			if ((arg5.nextInt() & 0x3) == 0) {
				var13++;
			}
		}
		this.drawCharsAlpha(arg0, arg1, arg2, arg7, arg8, var12, null);
		return var13;
	}

	@ObfuscatedName("eu.p(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lcm;[II)I")
	public int drawStringTaggableAntimacro(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11, Sprite[] arg12, int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		int var15 = (arg9.nextInt() & 0x1F) + 192;
		this.setStyle(var15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : var15 << 24 | arg6 & 0xFFFFFF);
		int var16 = arg0.length();
		int[] var17 = new int[var16];
		int var18 = 0;
		for (int var19 = 0; var19 < var16; var19++) {
			var17[var19] = var18;
			if ((arg9.nextInt() & 0x3) == 0) {
				var18++;
			}
		}
		int var20 = arg1;
		int var21 = this.fontMetrics.field8562 + arg2;
		int var22 = -1;
		if (arg8 == 1) {
			var21 += (arg4 - this.fontMetrics.field8562 - this.fontMetrics.field8569) / 2;
		} else if (arg8 == 2) {
			var21 = arg2 + arg4 - this.fontMetrics.field8569;
		}
		if (arg7 == 1) {
			var22 = this.fontMetrics.stringWidth(arg0) + var18;
			var20 = (arg3 - var22) / 2 + arg1;
		} else if (arg7 == 2) {
			var22 = this.fontMetrics.stringWidth(arg0) + var18;
			var20 = arg3 - var22 + arg1;
		}
		this.drawCharsAlpha(arg0, var20, var21, arg12, arg13, var17, null);
		if (arg11 != null) {
			if (var22 == -1) {
				var22 = this.fontMetrics.stringWidth(arg0) + var18;
			}
			arg11[0] = var20;
			arg11[1] = var21 - this.fontMetrics.field8562;
			arg11[2] = var22;
			arg11[3] = this.fontMetrics.field8569 + this.fontMetrics.field8562;
		}
		return var18;
	}

	@ObfuscatedName("eu.d(III)V")
	public void setStyle(int arg0, int arg1) {
		strikethrough = -1;
		underline = -1;
		originalRgb = arg0;
		rgb = arg0;
		field1677 = 0;
		field1678 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		originalShadow = arg1;
		shadow = arg1;
	}

	@ObfuscatedName("eu.c(Ljava/lang/String;I)V")
	public void evaluateTag(String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				rgb = rgb & 0xFF000000 | StringTools.method4321(arg0.substring(4), 16) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				rgb = rgb & 0xFF000000 | originalRgb & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				rgb = StringTools.method4321(arg0.substring(5), 16);
			} else if (arg0.equals("/argb")) {
				rgb = originalRgb;
			} else if (arg0.startsWith("str=")) {
				strikethrough = rgb & 0xFF000000 | StringTools.method4321(arg0.substring(4), 16);
			} else if (arg0.equals("str")) {
				strikethrough = rgb & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				strikethrough = -1;
			} else if (arg0.startsWith("u=")) {
				underline = rgb & 0xFF000000 | StringTools.method4321(arg0.substring(2), 16);
			} else if (arg0.equals("u")) {
				underline = rgb & 0xFF000000;
			} else if (arg0.equals("/u")) {
				underline = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				shadow = 0;
			} else if (arg0.startsWith("shad=")) {
				shadow = rgb & 0xFF000000 | StringTools.method4321(arg0.substring(5), 16);
			} else if (arg0.equals("shad")) {
				shadow = rgb & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				shadow = originalShadow;
			} else if (arg0.equals("br")) {
				this.setStyle(originalRgb, originalShadow);
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("eu.r(Ljava/lang/String;II)V")
	public void method2716(String arg0, int arg1) {
		int var3 = 0;
		boolean var4 = false;
		for (int var5 = 0; var5 < arg0.length(); var5++) {
			char var6 = arg0.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				var3++;
			}
		}
		if (var3 > 0) {
			field1677 = (arg1 - this.fontMetrics.stringWidth(arg0) << 8) / var3;
		}
	}

	@ObfuscatedName("eu.v(Ljava/lang/String;II[Lcm;[ILch;III)V")
	public void drawChars(String arg0, int arg1, int arg2, Sprite[] arg3, int[] arg4, SpriteRelated arg5, int arg6, int arg7) {
		int var9 = arg2 - this.fontMetrics.field8566;
		int var10 = -1;
		int var11 = -1;
		int var12 = arg0.length();
		for (int var13 = 0; var13 < var12; var13++) {
			char var14 = (char) (Cp1252.encode(arg0.charAt(var13)) & 0xFF);
			if (var14 == '<') {
				var10 = var13;
			} else {
				if (var14 == '>' && var10 != -1) {
					String var15 = arg0.substring(var10 + 1, var13);
					var10 = -1;
					if (var15.equals("lt")) {
						var14 = '<';
					} else if (var15.equals("gt")) {
						var14 = '>';
					} else if (var15.equals("nbsp")) {
						var14 = 160;
					} else if (var15.equals("shy")) {
						var14 = 173;
					} else if (var15.equals("times")) {
						var14 = 215;
					} else if (var15.equals("euro")) {
						var14 = 128;
					} else if (var15.equals("copy")) {
						var14 = 169;
					} else {
						if (!var15.equals("reg")) {
							if (var15.startsWith("img=")) {
								try {
									int var16 = StringTools.parseInt(var15.substring(4));
									Sprite var17 = arg3[var16];
									int var18 = arg4 == null ? var17.getY() : arg4[var16];
									if ((rgb & -16777216) == -16777216) {
										var17.drawSprite(arg1, this.fontMetrics.field8566 + var9 - var18, 1, -1, 1);
									} else {
										var17.drawSprite(arg1, this.fontMetrics.field8566 + var9 - var18, 0, rgb & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[var16].getX();
									var11 = -1;
								} catch (Exception var29) {
								}
							} else if (!var15.startsWith("sprite=")) {
								this.evaluateTag(var15);
							} else if (this.fontMetrics.fontIconProvider != null) {
								try {
									boolean var20 = true;
									int var21 = 0;
									int var22 = var15.indexOf(44);
									int var23;
									if (var22 == -1) {
										var23 = StringTools.parseInt(var15.substring(7));
									} else {
										var23 = StringTools.parseInt(var15.substring(7, var22));
										var21 = StringTools.parseInt(var15.substring(var22 + 1));
									}
									Sprite[] var24 = this.fontMetrics.fontIconProvider.getIconSprites(this.toolkit, var23);
									if (var24 != null) {
										int var25 = Math.min(var24[var21].getY(), this.fontMetrics.field8569 + this.fontMetrics.field8562);
										if ((rgb & -16777216) == -16777216) {
											var24[var21].drawSprite(arg1, this.fontMetrics.field8566 + var9 + 2 - var25, 1, -1, 1);
										} else {
											var24[var21].drawSprite(arg1, this.fontMetrics.field8566 + var9 + 2 - var25, 0, rgb & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += var24[var21].getX();
									}
									var11 = -1;
								} catch (Exception var28) {
								}
							}
							continue;
						}
						var14 = 174;
					}
				}
				if (var10 == -1) {
					if (var11 != -1) {
						arg1 += this.fontMetrics.method14537(var11, var14);
					}
					if (var14 == ' ') {
						if (field1677 > 0) {
							field1678 += field1677;
							arg1 += field1678 >> 8;
							field1678 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((shadow & 0xFF000000) != 0) {
							this.drawChar(var14, arg1 + 1, var9 + 1, shadow, true);
						}
						this.drawChar(var14, arg1, var9, rgb, false);
					} else {
						if ((shadow & 0xFF000000) != 0) {
							this.drawChar2(var14, arg1 + 1, var9 + 1, shadow, true, arg5, arg6, arg7);
						}
						this.drawChar2(var14, arg1, var9, rgb, false, arg5, arg6, arg7);
					}
					int var27 = this.fontMetrics.method14558(var14);
					if (strikethrough != -1) {
						this.toolkit.drawHorizontalLine(arg1, (int) ((double) this.fontMetrics.field8566 * 0.7D) + var9, var27, strikethrough);
					}
					if (underline != -1) {
						this.toolkit.drawHorizontalLine(arg1, this.fontMetrics.field8566 + var9 + 1, var27, underline);
					}
					arg1 += var27;
					var11 = var14;
				}
			}
		}
	}

	@ObfuscatedName("eu.o(Ljava/lang/String;II[Lcm;[I[I[II)V")
	public void drawCharsAlpha(String arg0, int arg1, int arg2, Sprite[] arg3, int[] arg4, int[] arg5, int[] arg6) {
		int var8 = arg2 - this.fontMetrics.field8566;
		int var9 = -1;
		int var10 = -1;
		int var11 = 0;
		int var12 = arg0.length();
		for (int var13 = 0; var13 < var12; var13++) {
			char var14 = (char) (Cp1252.encode(arg0.charAt(var13)) & 0xFF);
			if (var14 == '<') {
				var9 = var13;
			} else {
				if (var14 == '>' && var9 != -1) {
					String var15 = arg0.substring(var9 + 1, var13);
					var9 = -1;
					if (var15.equals("lt")) {
						var14 = '<';
					} else if (var15.equals("gt")) {
						var14 = '>';
					} else if (var15.equals("nbsp")) {
						var14 = 160;
					} else if (var15.equals("shy")) {
						var14 = 173;
					} else if (var15.equals("times")) {
						var14 = 215;
					} else if (var15.equals("euro")) {
						var14 = 128;
					} else if (var15.equals("copy")) {
						var14 = 169;
					} else {
						if (!var15.equals("reg")) {
							if (var15.startsWith("img=")) {
								try {
									int var16;
									if (arg5 == null) {
										var16 = 0;
									} else {
										var16 = arg5[var11];
									}
									int var17;
									if (arg6 == null) {
										var17 = 0;
									} else {
										var17 = arg6[var11];
									}
									var11++;
									int var18 = StringTools.parseInt(var15.substring(4));
									Sprite var19 = arg3[var18];
									int var20 = arg4 == null ? var19.getY() : arg4[var18];
									var19.drawSprite(arg1 + var16, this.fontMetrics.field8566 + var8 - var20 + var17, 1, -1, 1);
									arg1 += arg3[var18].getX();
									var10 = -1;
								} catch (Exception var35) {
								}
							} else if (!var15.startsWith("sprite=")) {
								this.evaluateTag(var15);
							} else if (this.fontMetrics.fontIconProvider != null) {
								try {
									boolean var22 = true;
									int var23 = 0;
									int var24 = var15.indexOf(44);
									int var25;
									if (var24 == -1) {
										var25 = StringTools.parseInt(var15.substring(7));
									} else {
										var25 = StringTools.parseInt(var15.substring(7, var24));
										var23 = StringTools.parseInt(var15.substring(var24 + 1));
									}
									int var26;
									if (arg5 == null) {
										var26 = 0;
									} else {
										var26 = arg5[var11];
									}
									int var27;
									if (arg6 == null) {
										var27 = 0;
									} else {
										var27 = arg6[var11];
									}
									var11++;
									Sprite[] var28 = this.fontMetrics.fontIconProvider.getIconSprites(this.toolkit, var25);
									if (var28 != null) {
										int var29 = Math.min(var28[var23].getY(), this.fontMetrics.field8569 + this.fontMetrics.field8562);
										var28[var23].drawSprite(arg1 + var26, this.fontMetrics.field8566 + var8 + 3 - var29 + var27, 1, -1, 1);
										arg1 += var28[var23].getX();
									}
									var10 = -1;
								} catch (Exception var34) {
								}
							}
							continue;
						}
						var14 = 174;
					}
				}
				if (var9 == -1) {
					if (var10 != -1) {
						arg1 += this.fontMetrics.method14537(var10, var14);
					}
					int var31;
					if (arg5 == null) {
						var31 = 0;
					} else {
						var31 = arg5[var11];
					}
					int var32;
					if (arg6 == null) {
						var32 = 0;
					} else {
						var32 = arg6[var11];
					}
					var11++;
					if (var14 != ' ') {
						if ((shadow & 0xFF000000) != 0) {
							this.drawChar(var14, arg1 + 1 + var31, var8 + 1 + var32, shadow, true);
						}
						this.drawChar(var14, arg1 + var31, var8 + var32, rgb, false);
					} else if (field1677 > 0) {
						field1678 += field1677;
						arg1 += field1678 >> 8;
						field1678 &= 0xFF;
					}
					int var33 = this.fontMetrics.method14558(var14);
					if (strikethrough != -1) {
						this.toolkit.drawHorizontalLine(arg1, (int) ((double) this.fontMetrics.field8566 * 0.7D) + var8, var33, strikethrough);
					}
					if (underline != -1) {
						this.toolkit.drawHorizontalLine(arg1, this.fontMetrics.field8566 + var8, var33, underline);
					}
					arg1 += var33;
					var10 = var14;
				}
			}
		}
	}

	@ObfuscatedName("eu.s(CIIIZ)V")
	public abstract void drawChar(char arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("eu.y(CIIIZLch;II)V")
	public abstract void drawChar2(char arg0, int arg1, int arg2, int arg3, boolean arg4, SpriteRelated arg5, int arg6, int arg7);
}
