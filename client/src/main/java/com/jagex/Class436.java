package com.jagex;

import com.jagex.twitchtv.TwitchEventResult;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class436 {

	@OriginalMember(owner = "client!nf", name = "jg", descriptor = "I")
	static int anInt4803;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!nf;")
	public static final Class436 aClass436_10 = new Class436(14, 0);

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!nf;")
	public static final Class436 aClass436_2 = new Class436(15, -1);

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!nf;")
	public static final Class436 aClass436_12 = new Class436(16, -2);

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "Lclient!nf;")
	public static final Class436 aClass436_4 = new Class436(19, -2);

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!nf;")
	static final Class436 aClass436_5 = new Class436(23, 4);

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!nf;")
	static final Class436 aClass436_3 = new Class436(24, -1);

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!nf;")
	public static final Class436 aClass436_1 = new Class436(26, 0);

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Lclient!nf;")
	static final Class436 aClass436_7 = new Class436(27, 0);

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "Lclient!nf;")
	public static final Class436 aClass436_8 = new Class436(28, -2);

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Lclient!nf;")
	public static final Class436 aClass436_9 = new Class436(29, -2);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!nf;")
	public static final Class436 aClass436_6 = new Class436(30, -2);

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "Lclient!nf;")
	static final Class436 aClass436_11 = new Class436(31, 4);

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "[Lclient!nf;")
	static final Class436[] aClass436Array1 = new Class436[32];

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	public final int anInt4802;

	static {
		@Pc(77) Class436[] local77 = Class334.method27817(-1387240508);
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass436Array1[local77[local79].anInt4802 * 663664571] = local77[local79];
		}
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "()[Lclient!nf;")
	static Class436[] method29127() {
		return new Class436[] { aClass436_7, aClass436_8, aClass436_4, aClass436_3, aClass436_9, aClass436_11, aClass436_5, aClass436_6, aClass436_12, aClass436_1, aClass436_2, aClass436_10 };
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "()[Lclient!nf;")
	static Class436[] method29128() {
		return new Class436[] { aClass436_7, aClass436_8, aClass436_4, aClass436_3, aClass436_9, aClass436_11, aClass436_5, aClass436_6, aClass436_12, aClass436_1, aClass436_2, aClass436_10 };
	}

	@OriginalMember(owner = "client!nf", name = "ao", descriptor = "(III)V")
	static void method29129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) TwitchEventResult local5 = new TwitchEventResult(arg0, arg1);
		@Pc(8) Class601 local8 = local5.f();
		if (local8 != null) {
			Class312.method27463(local8.method37268(), local5, (byte) 49);
		}
	}

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "(B)I")
	public static int method29130(@OriginalArg(0) byte arg0) {
		return Class669.aTwitchTV1.GetWebcamState();
	}

	@OriginalMember(owner = "client!nf", name = "aq", descriptor = "(Lclient!yp;I)V")
	static void method29131(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		if (arg0.anIntArray525[arg0.anInt5778 * 1896589581] > arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1]) {
			arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!nf", name = "aya", descriptor = "(Lclient!yp;I)V")
	static void method29132(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!nf", name = "bdq", descriptor = "(Lclient!yp;S)V")
	static void method29133(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass274_1.method26792(local12, 326461728).anInt3920 * -1506819259;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V")
	static void method29134(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class149.aString48 = Class149.aString48.trim();
		Class149.anInt1525 = 0;
		if (Class149.aString48.length() == 0) {
			Class149.anInt1523 = 0;
			return;
		}
		Class294.method26961("--> " + Class149.aString48, 1455295997);
		Class138.method11536(Class149.aString48, false, arg0, (byte) 70);
		if (arg0) {
			Class149.anInt1523 = Class149.aString48.length() * -1734720461;
		} else {
			Class149.anInt1523 = 0;
			Class149.aString48 = "";
		}
	}

	@OriginalMember(owner = "client!nf", name = "mz", descriptor = "(II)V")
	static void method29135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) Class80 local3 = client.aClass24_21.method580((byte) -18); local3 != null; local3 = client.aClass24_21.method566((byte) 7)) {
			if ((local3.aLong338 * 3209506792906532031L >> 48 & 0xFFFFL) == (long) arg0) {
				local3.method24395((byte) 112);
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "aj", descriptor = "(Lclient!yp;I)V")
	static void method29136(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class374 local9 = (Class374) arg0.aClass80_Sub1_Sub20_2.anObjectArray5[arg0.anInt5780 * -1336568839];
		@Pc(32) Interface22 local32 = (Interface22) (arg0.anIntArray526[arg0.anInt5780 * -1336568839] == 0 ? arg0.aMap23.get(local9.aClass107_1.aClass143_6) : arg0.aMap24.get(local9.aClass107_1.aClass143_6));
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local32.method36978(local9, (byte) -29);
	}

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "(I)[Lclient!hd;")
	static Class309[] method29137(@OriginalArg(0) int arg0) {
		return new Class309[] { Class309.aClass309_2, Class309.aClass309_1, Class309.aClass309_3 };
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(II)V")
	Class436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4802 = arg0 * -795773581;
	}
}
