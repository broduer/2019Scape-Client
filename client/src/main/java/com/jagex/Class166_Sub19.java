package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ams")
public class Class166_Sub19 extends Class166 {

	@OriginalMember(owner = "client!ams", name = "l", descriptor = "I")
	public static final int anInt2190 = 0;

	@OriginalMember(owner = "client!ams", name = "w", descriptor = "I")
	public static final int anInt2191 = 1;

	@OriginalMember(owner = "client!ams", name = "<init>", descriptor = "(Lclient!ali;)V", line = 11)
	public Class166_Sub19(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ams", name = "<init>", descriptor = "(ILclient!ali;)V", line = 15)
	public Class166_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ams", name = "o", descriptor = "(S)V", line = 19)
	public void method15758(@OriginalArg(0) short arg0) {
		if (this.anInt2379 * 960141055 != 1 && this.anInt2379 * 960141055 != 0) {
			this.anInt2379 = this.method16545((byte) -84) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ams", name = "f", descriptor = "()I", line = 23)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!ams", name = "e", descriptor = "(B)I", line = 23)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ams", name = "l", descriptor = "()I", line = 23)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!ams", name = "u", descriptor = "()I", line = 23)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!ams", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!ams", name = "n", descriptor = "(II)I", line = 27)
	@Override
	int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!ams", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16551(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ams", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ams", name = "k", descriptor = "(II)V", line = 31)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ams", name = "c", descriptor = "(I)V", line = 31)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ams", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ams", name = "s", descriptor = "(I)I", line = 35)
	public int method15759(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}
}