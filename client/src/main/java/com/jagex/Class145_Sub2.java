package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ait")
public class Class145_Sub2 extends Class145 {

	@OriginalMember(owner = "client!ait", name = "m", descriptor = "J")
	long aLong48 = 0L;

	@OriginalMember(owner = "client!ait", name = "n", descriptor = "Lclient!aqd;")
	Class104_Sub2_Sub1 aClass104_Sub2_Sub1_9;

	@OriginalMember(owner = "client!ait", name = "<init>", descriptor = "(Lclient!aqd;[Lclient!lk;)V", line = 18)
	Class145_Sub2(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class400[] arg1) {
		super(arg1);
		this.aClass104_Sub2_Sub1_9 = arg0;
		@Pc(10) byte local10 = 0;
		@Pc(14) ByteBuffer local14 = this.aClass104_Sub2_Sub1_9.aByteBuffer7;
		local14.clear();
		for (@Pc(19) short local19 = 0; local19 < this.aClass400Array3.length; local19++) {
			@Pc(26) short local26 = 0;
			@Pc(31) Class400 local31 = this.aClass400Array3[local19];
			for (@Pc(33) int local33 = 0; local33 < local31.method28497(); local33++) {
				@Pc(41) Class399 local41 = local31.method28502(local33);
				if (local41 == Class399.aClass399_9) {
					this.method11486(local14, local19, local26, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				} else if (local41 == Class399.aClass399_2) {
					this.method11486(local14, local19, local26, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				} else if (local41 == Class399.aClass399_10) {
					this.method11486(local14, local19, local26, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				} else if (local41 == Class399.aClass399_3) {
					this.method11486(local14, local19, local26, (byte) 0, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class399.aClass399_1) {
					this.method11486(local14, local19, local26, (byte) 1, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class399.aClass399_4) {
					this.method11486(local14, local19, local26, (byte) 2, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class399.aClass399_5) {
					this.method11486(local14, local19, local26, (byte) 3, (byte) 0, (byte) 5, local10++);
				}
				local26 = (short) (local26 + local41.anInt4676);
			}
		}
		this.method11486(local14, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		this.aLong48 = IDirect3DDevice.CreateVertexDeclaration(this.aClass104_Sub2_Sub1_9.aLong121, this.aClass104_Sub2_Sub1_9.aLong132);
		this.aClass104_Sub2_Sub1_9.method20882(this);
	}

	@OriginalMember(owner = "client!ait", name = "e", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V", line = 44)
	void method11486(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!ait", name = "f", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V", line = 44)
	void method11487(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!ait", name = "k", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V", line = 44)
	void method11488(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!ait", name = "m", descriptor = "()V", line = 53)
	@Override
	public void method30884() {
		if (this.aLong48 != 0L) {
			IUnknown.Release(this.aLong48);
			this.aLong48 = 0L;
		}
		this.aClass104_Sub2_Sub1_9.method20886(this);
	}

	@OriginalMember(owner = "client!ait", name = "u", descriptor = "()V", line = 53)
	@Override
	public void method30885() {
		if (this.aLong48 != 0L) {
			IUnknown.Release(this.aLong48);
			this.aLong48 = 0L;
		}
		this.aClass104_Sub2_Sub1_9.method20886(this);
	}

	@OriginalMember(owner = "client!ait", name = "n", descriptor = "()V", line = 61)
	void method11489() {
		if (this.aLong48 != 0L) {
			this.aClass104_Sub2_Sub1_9.method19587(this.aLong48);
			this.aLong48 = 0L;
		}
	}

	@OriginalMember(owner = "client!ait", name = "l", descriptor = "()V", line = 61)
	void method11490() {
		if (this.aLong48 != 0L) {
			this.aClass104_Sub2_Sub1_9.method19587(this.aLong48);
			this.aLong48 = 0L;
		}
	}

	@OriginalMember(owner = "client!ait", name = "w", descriptor = "()V", line = 61)
	void method11491() {
		if (this.aLong48 != 0L) {
			this.aClass104_Sub2_Sub1_9.method19587(this.aLong48);
			this.aLong48 = 0L;
		}
	}

	@OriginalMember(owner = "client!ait", name = "z", descriptor = "()V", line = 61)
	void method11492() {
		if (this.aLong48 != 0L) {
			this.aClass104_Sub2_Sub1_9.method19587(this.aLong48);
			this.aLong48 = 0L;
		}
	}

	@OriginalMember(owner = "client!ait", name = "finalize", descriptor = "()V", line = 68)
	@Override
	protected void finalize() {
		this.method11489();
	}

	@OriginalMember(owner = "client!ait", name = "hl", descriptor = "()V", line = 68)
	void method11493() {
		this.method11489();
	}
}