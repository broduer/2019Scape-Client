package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ny")
public class Class452 implements Interface72 {

	@OriginalMember(owner = "client!ny", name = "e", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 11)
	@Override
	public String method28957(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (arg0 == Class669.aClass669_15) {
			@Pc(10) Class39 local10 = (Class39) Class19.aClass32_Sub7_5.get(arg1[0], -305655229);
			return local10.method749((int) arg2, -1038506051);
		} else if (Class669.aClass669_1 == arg0 || Class669.aClass669_14 == arg0) {
			@Pc(29) Class47 local29 = (Class47) Class277.aClass32_Sub12_1.get((int) arg2, 1927257423);
			return local29.aString6;
		} else if (Class669.aClass669_4 == arg0 || arg0 == Class669.aClass669_2 || Class669.aClass669_5 == arg0 || arg0 == Class669.aClass669_9) {
			return ((Class39) Class19.aClass32_Sub7_5.get(arg1[0], 2044955521)).method749((int) arg2, -831086758);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ny", name = "n", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 11)
	@Override
	public String method28956(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (arg0 == Class669.aClass669_15) {
			@Pc(10) Class39 local10 = (Class39) Class19.aClass32_Sub7_5.get(arg1[0], -309937267);
			return local10.method749((int) arg2, -189922074);
		} else if (Class669.aClass669_1 == arg0 || Class669.aClass669_14 == arg0) {
			@Pc(29) Class47 local29 = (Class47) Class277.aClass32_Sub12_1.get((int) arg2, -1085586453);
			return local29.aString6;
		} else if (Class669.aClass669_4 == arg0 || arg0 == Class669.aClass669_2 || Class669.aClass669_5 == arg0 || arg0 == Class669.aClass669_9) {
			return ((Class39) Class19.aClass32_Sub7_5.get(arg1[0], 1268047144)).method749((int) arg2, -968328985);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ny", name = "c", descriptor = "(Lclient!yf;I)V", line = 60)
	static void method28958(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class347 local16 = (Class347) Class288.aClass55_Sub2_1.get(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], -1948031516);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anIntArrayArray57 == null ? 0 : local16.anIntArrayArray57.length;
	}

	@OriginalMember(owner = "client!ny", name = "ax", descriptor = "(B)I", line = 525)
	public static int method28959(@OriginalArg(0) byte arg0) {
		return Class166_Sub13.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!ny", name = "qg", descriptor = "(Lclient!yf;I)V", line = 7895)
	static final void method28960(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, -258860266);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class665.method32893(local16, local22, arg0, 168030255);
	}

	@OriginalMember(owner = "client!ny", name = "ayu", descriptor = "(Lclient!yf;B)V", line = 13995)
	static final void method28961(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class358.userCcExpiry * -1927181481;
	}

	@OriginalMember(owner = "client!ny", name = "bdq", descriptor = "(Lclient!yf;I)V", line = 14758)
	static final void method28962(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!ny", name = "bfp", descriptor = "(Lclient!yf;I)V", line = 15125)
	static final void method28963(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
