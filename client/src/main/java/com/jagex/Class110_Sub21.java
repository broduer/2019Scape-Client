package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agw")
public class Class110_Sub21 extends Class110 {

	@OriginalMember(owner = "client!agw", name = "n", descriptor = "I")
	final int anInt992;

	@OriginalMember(owner = "client!agw", name = "<init>", descriptor = "(Lclient!alw;)V", line = 9)
	Class110_Sub21(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt992 = arg0.g2(-1434290800) * 1783796673;
	}

	@OriginalMember(owner = "client!agw", name = "n", descriptor = "(I)V", line = 14)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		Class152.aClass243Array2[this.anInt992 * 53967937].method25882((byte) 16);
	}

	@OriginalMember(owner = "client!agw", name = "f", descriptor = "()V", line = 14)
	@Override
	public void method20150() {
		Class152.aClass243Array2[this.anInt992 * 53967937].method25882((byte) 16);
	}

	@OriginalMember(owner = "client!agw", name = "bl", descriptor = "(Lclient!arm;I)Ljava/lang/String;", line = 1361)
	static String method8544(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aString98 == null || arg0.aString98.length() == 0) {
			return arg0.aString100 == null || arg0.aString100.length() <= 0 ? arg0.aString99 : arg0.aString99 + Class74.aClass74_140.method1259(Class106.lang, (byte) 33) + arg0.aString100;
		} else if (arg0.aString100 == null || arg0.aString100.length() <= 0) {
			return arg0.aString99 + Class74.aClass74_140.method1259(Class106.lang, (byte) -33) + arg0.aString98;
		} else {
			return arg0.aString99 + Class74.aClass74_140.method1259(Class106.lang, (byte) 20) + arg0.aString100 + Class74.aClass74_140.method1259(Class106.lang, (byte) -6) + arg0.aString98;
		}
	}

	@OriginalMember(owner = "client!agw", name = "jh", descriptor = "([Lclient!hf;Lclient!hf;ZI)V", line = 10883)
	static void method8545(@OriginalArg(0) Class312[] arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15 = arg1.anInt3991 * 1312295363 == 0 ? arg1.anInt3981 * 1215292027 : arg1.anInt3991 * 1312295363;
		@Pc(31) int local31 = arg1.anInt4043 * -1927602083 == 0 ? arg1.anInt3982 * -1490598249 : arg1.anInt4043 * -1927602083;
		Class206.method24700(arg0, arg1.anInt3953 * -1549590237, local15, local31, arg2, 1171588306);
		if (arg1.aClass312Array1 != null) {
			Class206.method24700(arg1.aClass312Array1, arg1.anInt3953 * -1549590237, local15, local31, arg2, -672135787);
		}
		@Pc(64) SubInterface local64 = (SubInterface) client.aClass16_22.method214((long) (arg1.anInt3953 * -1549590237));
		if (local64 != null) {
			Class568.method31298(local64.anInt3172 * 1220811495, local15, local31, arg2, (byte) -4);
		}
		if (arg1 != client.aClass312_4) {
			return;
		}
		@Pc(82) int local82 = Class174.anInt3293 * -1081967415;
		@Pc(84) int[] local84 = Class174.anIntArray278;
		@Pc(86) int local86;
		for (local86 = 0; local86 < local82; local86++) {
			@Pc(95) Class132_Sub1_Sub1_Sub1_Sub2 local95 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local84[local86]];
			if (local95 != null) {
				local95.method20020(local15, local31, arg2, (byte) 22);
			}
		}
		for (local86 = 0; local86 < client.anInt3540 * 568731113; local86++) {
			@Pc(117) int local117 = client.anIntArray323[local86];
			@Pc(123) Class93_Sub15 local123 = (Class93_Sub15) client.aClass16_18.method214((long) local117);
			if (local123 != null) {
				((Class132_Sub1_Sub1_Sub1) local123.anObject5).method20020(local15, local31, arg2, (byte) 30);
			}
		}
	}
}
