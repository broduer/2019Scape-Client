package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public class Class550 {

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
	public static final int anInt5293 = 2;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
	public static final int anInt5294 = -3;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
	public static final int anInt5295 = -4;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
	public static final int anInt5296 = -5;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
	public static final int anInt5297 = 1;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	public static final int anInt5298 = 15;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	public static final int anInt5299 = 3;

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
	public static final int anInt5300 = 6;

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
	public static final int anInt5301 = 7;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
	public static final int anInt5302 = 45;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	public static final int anInt5303 = 52;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
	public static final int anInt5304 = 21;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
	public static final int anInt5305 = 23;

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
	public static final int anInt5306 = 29;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
	public static final int anInt5307 = 35;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
	public static final int anInt5308 = 42;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public static final int anInt5309 = -2;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
	public static final int anInt5310 = 48;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
	public static final int anInt5311 = 49;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public static final int anInt5312 = 9;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	public static final int anInt5313 = 53;

	@OriginalMember(owner = "client!sh", name = "qn", descriptor = "I")
	static int anInt5314;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(Lclient!xf;I)V", line = 24)
	public static void method31028(@OriginalArg(0) Class657 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass429_3 == Class429.aClass429_1) {
			Class670.aClass146_6 = new Class146_Sub2(arg0);
		} else if (arg0.aClass429_3 == Class429.aClass429_2) {
			Class670.aClass146_6 = new Class146_Sub1(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 26)
	Class550() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "([J[IIII)V", line = 78)
	static void method31029(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) int local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method31029(arg0, arg1, arg2, local10 - 1, -431849412);
		method31029(arg0, arg1, local10 + 1, arg3, -993940483);
	}

	@OriginalMember(owner = "client!sh", name = "bj", descriptor = "(Lclient!yf;I)V", line = 5271)
	static final void method31030(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class391.method28289(local11, local14, arg0, 2095211317);
	}

	@OriginalMember(owner = "client!sh", name = "ru", descriptor = "(Lclient!yf;I)V", line = 8164)
	static final void method31031(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local11.aString164;
	}

	@OriginalMember(owner = "client!sh", name = "kw", descriptor = "(Lclient!hf;IIZB)V", line = 10925)
	static void method31032(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		@Pc(4) int local4 = arg0.anInt3981 * 1215292027;
		@Pc(9) int local9 = arg0.anInt3982 * -1490598249;
		if (arg0.aByte128 == 0) {
			arg0.anInt3981 = arg0.anInt3977 * 1048275485;
		} else if (arg0.aByte128 == 1) {
			arg0.anInt3981 = (arg1 - arg0.anInt3977 * 596415983) * 1521396915;
		} else if (arg0.aByte128 == 2) {
			arg0.anInt3981 = (arg1 * 596415983 * arg0.anInt3977 >> 14) * 1521396915;
		}
		if (arg0.aByte125 == 0) {
			arg0.anInt3982 = arg0.anInt3978 * -601711331;
		} else if (arg0.aByte125 == 1) {
			arg0.anInt3982 = (arg2 - arg0.anInt3978 * 701209115) * 491559207;
		} else if (arg0.aByte125 == 2) {
			arg0.anInt3982 = (arg0.anInt3978 * 701209115 * arg2 >> 14) * 491559207;
		}
		if (arg0.aByte128 == 4) {
			arg0.anInt3981 = arg0.anInt3983 * 1715024301 * -1490598249 * arg0.anInt3982 / (arg0.anInt3984 * -1923352313) * 1521396915;
		}
		if (arg0.aByte125 == 4) {
			arg0.anInt3982 = arg0.anInt3981 * 1215292027 * -1923352313 * arg0.anInt3984 / (arg0.anInt3983 * 1715024301) * 491559207;
		}
		if (client.aBoolean615 && (client.method25364(arg0).anInt1550 * -622772683 != 0 || arg0.anInt3971 * -158526639 == 0)) {
			if (arg0.anInt3982 * -1490598249 < 5 && arg0.anInt3981 * 1215292027 < 5) {
				arg0.anInt3982 = -1837171261;
				arg0.anInt3981 = -982950017;
			} else {
				if (arg0.anInt3982 * -1490598249 <= 0) {
					arg0.anInt3982 = -1837171261;
				}
				if (arg0.anInt3981 * 1215292027 <= 0) {
					arg0.anInt3981 = -982950017;
				}
			}
		}
		if (arg0.anInt3972 * -1428659995 == Class312.anInt4049 * 1565172903) {
			client.aClass312_4 = arg0;
		}
		if (arg3 && arg0.anObjectArray36 != null && (arg0.anInt3981 * 1215292027 != local4 || local9 != arg0.anInt3982 * -1490598249)) {
			@Pc(216) Class93_Sub39 local216 = new Class93_Sub39();
			local216.aClass312_1 = arg0;
			local216.anObjectArray4 = arg0.anObjectArray36;
			client.aClass22_47.method408(local216, -1970970745);
		}
	}

	@OriginalMember(owner = "client!sh", name = "kq", descriptor = "(Lclient!alu;IIIIIIIIII)V", line = 10996)
	static final void method31033(@OriginalArg(0) SubInterface arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (!Class383.method28142(arg1, null, 633209048)) {
			return;
		}
		if (arg0 == null || arg0.method23193((byte) 35)) {
			@Pc(21) Class320 local21 = Class166_Sub1.aClass320Array1[arg1];
			client.method25294(local21, local21.method27227(855839648), -1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
		} else {
			Class372.method28019(arg0, true, false, 1481537068);
		}
	}

	@OriginalMember(owner = "client!sh", name = "kf", descriptor = "([Lclient!hf;IB)V", line = 11674)
	static final void method31034(@OriginalArg(0) Class312[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class312 local9 = arg0[local1];
			if (local9 != null) {
				if (local9.anInt3971 * -158526639 == 0) {
					if (local9.aClass312Array1 != null) {
						method31034(local9.aClass312Array1, arg1, (byte) 41);
					}
					@Pc(35) SubInterface local35 = (SubInterface) client.aClass16_22.method214((long) (local9.anInt3953 * -1549590237));
					if (local35 != null) {
						Class189.method24583(local35.anInt3172 * 1220811495, arg1, 780494749);
					}
				}
				@Pc(54) Class93_Sub39 local54;
				if (arg1 == 0 && local9.anObjectArray33 != null) {
					local54 = new Class93_Sub39();
					local54.aClass312_1 = local9;
					local54.anObjectArray4 = local9.anObjectArray33;
					Class211.method25429(local54, -523735840);
				}
				if (arg1 == 1 && local9.anObjectArray34 != null) {
					if (local9.anInt3970 * 532402067 >= 0) {
						@Pc(83) Class312 local83 = Class659.method32808(local9.anInt3953 * -1549590237, 546421086);
						if (local83 == null || local83.aClass312Array2 == null || local9.anInt3970 * 532402067 >= local83.aClass312Array2.length || local9 != local83.aClass312Array2[local9.anInt3970 * 532402067]) {
							continue;
						}
					}
					local54 = new Class93_Sub39();
					local54.aClass312_1 = local9;
					local54.anObjectArray4 = local9.anObjectArray34;
					Class211.method25429(local54, -162905944);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "bdd", descriptor = "(Lclient!yf;B)V", line = 14762)
	static final void method31035(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class520.selfPlayer.method20024(1927066028).method32027((short) 448);
	}
}
