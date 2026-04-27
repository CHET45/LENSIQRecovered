package p000;

import java.io.IOException;
import p000.gpi;
import p000.u27;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class c60 {

    /* JADX INFO: renamed from: a */
    public static final int f15816a = 100;

    /* JADX INFO: renamed from: b */
    public static volatile int f15817b = 100;

    /* JADX INFO: renamed from: c60$a */
    public static /* synthetic */ class C2208a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15818a;

        static {
            int[] iArr = new int[gpi.EnumC6460b.values().length];
            f15818a = iArr;
            try {
                iArr[gpi.EnumC6460b.f40762c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40763d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40764e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40765f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40766m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40757X.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40748C.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40753M1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40749F.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40759Z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40750H.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40756V1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40760Z1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40758Y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40755Q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40751L.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40752M.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15818a[gpi.EnumC6460b.f40754N.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private c60() {
    }

    /* JADX INFO: renamed from: A */
    public static int m3778A(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) {
        c68 c68Var = (c68) list;
        int iM3786I = m3786I(data, position, registers);
        c68Var.addInt(e72.decodeZigZag32(registers.f15819a));
        while (iM3786I < limit) {
            int iM3786I2 = m3786I(data, iM3786I, registers);
            if (tag != registers.f15819a) {
                break;
            }
            iM3786I = m3786I(data, iM3786I2, registers);
            c68Var.addInt(e72.decodeZigZag32(registers.f15819a));
        }
        return iM3786I;
    }

    /* JADX INFO: renamed from: B */
    public static int m3779B(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) {
        sk9 sk9Var = (sk9) list;
        int iM3789L = m3789L(data, position, registers);
        sk9Var.addLong(e72.decodeZigZag64(registers.f15820b));
        while (iM3789L < limit) {
            int iM3786I = m3786I(data, iM3789L, registers);
            if (tag != registers.f15819a) {
                break;
            }
            iM3789L = m3789L(data, iM3786I, registers);
            sk9Var.addLong(e72.decodeZigZag64(registers.f15820b));
        }
        return iM3789L;
    }

    /* JADX INFO: renamed from: C */
    public static int m3780C(byte[] data, int position, C2209b registers) throws be8 {
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a;
        if (i < 0) {
            throw be8.m3080g();
        }
        if (i == 0) {
            registers.f15821c = "";
            return iM3786I;
        }
        registers.f15821c = new String(data, iM3786I, i, v98.f90380b);
        return iM3786I + i;
    }

    /* JADX INFO: renamed from: D */
    public static int m3781D(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) throws be8 {
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a;
        if (i < 0) {
            throw be8.m3080g();
        }
        if (i == 0) {
            list.add("");
        } else {
            list.add(new String(data, iM3786I, i, v98.f90380b));
            iM3786I += i;
        }
        while (iM3786I < limit) {
            int iM3786I2 = m3786I(data, iM3786I, registers);
            if (tag != registers.f15819a) {
                break;
            }
            iM3786I = m3786I(data, iM3786I2, registers);
            int i2 = registers.f15819a;
            if (i2 < 0) {
                throw be8.m3080g();
            }
            if (i2 == 0) {
                list.add("");
            } else {
                list.add(new String(data, iM3786I, i2, v98.f90380b));
                iM3786I += i2;
            }
        }
        return iM3786I;
    }

    /* JADX INFO: renamed from: E */
    public static int m3782E(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) throws be8 {
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a;
        if (i < 0) {
            throw be8.m3080g();
        }
        if (i == 0) {
            list.add("");
        } else {
            int i2 = iM3786I + i;
            if (!lzh.m16496n(data, iM3786I, i2)) {
                throw be8.m3077d();
            }
            list.add(new String(data, iM3786I, i, v98.f90380b));
            iM3786I = i2;
        }
        while (iM3786I < limit) {
            int iM3786I2 = m3786I(data, iM3786I, registers);
            if (tag != registers.f15819a) {
                break;
            }
            iM3786I = m3786I(data, iM3786I2, registers);
            int i3 = registers.f15819a;
            if (i3 < 0) {
                throw be8.m3080g();
            }
            if (i3 == 0) {
                list.add("");
            } else {
                int i4 = iM3786I + i3;
                if (!lzh.m16496n(data, iM3786I, i4)) {
                    throw be8.m3077d();
                }
                list.add(new String(data, iM3786I, i3, v98.f90380b));
                iM3786I = i4;
            }
        }
        return iM3786I;
    }

    /* JADX INFO: renamed from: F */
    public static int m3783F(byte[] data, int position, C2209b registers) throws be8 {
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a;
        if (i < 0) {
            throw be8.m3080g();
        }
        if (i == 0) {
            registers.f15821c = "";
            return iM3786I;
        }
        registers.f15821c = lzh.m16490h(data, iM3786I, i);
        return iM3786I + i;
    }

    /* JADX INFO: renamed from: G */
    public static int m3784G(int tag, byte[] data, int position, int limit, uth unknownFields, C2209b registers) throws be8 {
        if (gpi.getTagFieldNumber(tag) == 0) {
            throw be8.m3076c();
        }
        int tagWireType = gpi.getTagWireType(tag);
        if (tagWireType == 0) {
            int iM3789L = m3789L(data, position, registers);
            unknownFields.m23577i(tag, Long.valueOf(registers.f15820b));
            return iM3789L;
        }
        if (tagWireType == 1) {
            unknownFields.m23577i(tag, Long.valueOf(m3803j(data, position)));
            return position + 8;
        }
        if (tagWireType == 2) {
            int iM3786I = m3786I(data, position, registers);
            int i = registers.f15819a;
            if (i < 0) {
                throw be8.m3080g();
            }
            if (i > data.length - iM3786I) {
                throw be8.m3084l();
            }
            if (i == 0) {
                unknownFields.m23577i(tag, wj1.f94379e);
            } else {
                unknownFields.m23577i(tag, wj1.copyFrom(data, iM3786I, i));
            }
            return iM3786I + i;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw be8.m3076c();
            }
            unknownFields.m23577i(tag, Integer.valueOf(m3801h(data, position)));
            return position + 4;
        }
        uth uthVarM23570g = uth.m23570g();
        int i2 = (tag & (-8)) | 4;
        int i3 = registers.f15823e + 1;
        registers.f15823e = i3;
        checkRecursionLimit(i3);
        int i4 = 0;
        while (true) {
            if (position >= limit) {
                break;
            }
            int iM3786I2 = m3786I(data, position, registers);
            int i5 = registers.f15819a;
            if (i5 == i2) {
                i4 = i5;
                position = iM3786I2;
                break;
            }
            i4 = i5;
            position = m3784G(i5, data, iM3786I2, limit, uthVarM23570g, registers);
        }
        registers.f15823e--;
        if (position > limit || i4 != i2) {
            throw be8.m3081h();
        }
        unknownFields.m23577i(tag, uthVarM23570g);
        return position;
    }

    /* JADX INFO: renamed from: H */
    public static int m3785H(int firstByte, byte[] data, int position, C2209b registers) {
        int i = firstByte & 127;
        int i2 = position + 1;
        byte b = data[position];
        if (b >= 0) {
            registers.f15819a = i | (b << 7);
            return i2;
        }
        int i3 = i | ((b & 127) << 7);
        int i4 = position + 2;
        byte b2 = data[i2];
        if (b2 >= 0) {
            registers.f15819a = i3 | (b2 << 14);
            return i4;
        }
        int i5 = i3 | ((b2 & 127) << 14);
        int i6 = position + 3;
        byte b3 = data[i4];
        if (b3 >= 0) {
            registers.f15819a = i5 | (b3 << 21);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 21);
        int i8 = position + 4;
        byte b4 = data[i6];
        if (b4 >= 0) {
            registers.f15819a = i7 | (b4 << 28);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 28);
        while (true) {
            int i10 = i8 + 1;
            if (data[i8] >= 0) {
                registers.f15819a = i9;
                return i10;
            }
            i8 = i10;
        }
    }

    /* JADX INFO: renamed from: I */
    public static int m3786I(byte[] data, int position, C2209b registers) {
        int i = position + 1;
        byte b = data[position];
        if (b < 0) {
            return m3785H(b, data, i, registers);
        }
        registers.f15819a = b;
        return i;
    }

    /* JADX INFO: renamed from: J */
    public static int m3787J(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) {
        c68 c68Var = (c68) list;
        int iM3786I = m3786I(data, position, registers);
        c68Var.addInt(registers.f15819a);
        while (iM3786I < limit) {
            int iM3786I2 = m3786I(data, iM3786I, registers);
            if (tag != registers.f15819a) {
                break;
            }
            iM3786I = m3786I(data, iM3786I2, registers);
            c68Var.addInt(registers.f15819a);
        }
        return iM3786I;
    }

    /* JADX INFO: renamed from: K */
    public static int m3788K(long firstByte, byte[] data, int position, C2209b registers) {
        int i = position + 1;
        byte b = data[position];
        long j = (firstByte & 127) | (((long) (b & 127)) << 7);
        int i2 = 7;
        while (b < 0) {
            int i3 = i + 1;
            byte b2 = data[i];
            i2 += 7;
            j |= ((long) (b2 & 127)) << i2;
            i = i3;
            b = b2;
        }
        registers.f15820b = j;
        return i;
    }

    /* JADX INFO: renamed from: L */
    public static int m3789L(byte[] data, int position, C2209b registers) {
        int i = position + 1;
        long j = data[position];
        if (j < 0) {
            return m3788K(j, data, i, registers);
        }
        registers.f15820b = j;
        return i;
    }

    /* JADX INFO: renamed from: M */
    public static int m3790M(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) {
        sk9 sk9Var = (sk9) list;
        int iM3789L = m3789L(data, position, registers);
        sk9Var.addLong(registers.f15820b);
        while (iM3789L < limit) {
            int iM3786I = m3786I(data, iM3789L, registers);
            if (tag != registers.f15819a) {
                break;
            }
            iM3789L = m3789L(data, iM3786I, registers);
            sk9Var.addLong(registers.f15820b);
        }
        return iM3789L;
    }

    /* JADX INFO: renamed from: N */
    public static int m3791N(Object msg, upe schema, byte[] data, int position, int limit, int endGroup, C2209b registers) throws IOException {
        vsa vsaVar = (vsa) schema;
        int i = registers.f15823e + 1;
        registers.f15823e = i;
        checkRecursionLimit(i);
        int iM24181f = vsaVar.m24181f(msg, data, position, limit, endGroup, registers);
        registers.f15823e--;
        registers.f15821c = msg;
        return iM24181f;
    }

    /* JADX INFO: renamed from: O */
    public static int m3792O(Object msg, upe schema, byte[] data, int position, int limit, C2209b registers) throws IOException {
        int iM3785H = position + 1;
        int i = data[position];
        if (i < 0) {
            iM3785H = m3785H(i, data, iM3785H, registers);
            i = registers.f15819a;
        }
        int i2 = iM3785H;
        if (i < 0 || i > limit - i2) {
            throw be8.m3084l();
        }
        int i3 = registers.f15823e + 1;
        registers.f15823e = i3;
        checkRecursionLimit(i3);
        int i4 = i + i2;
        schema.mergeFrom(msg, data, i2, i4, registers);
        registers.f15823e--;
        registers.f15821c = msg;
        return i4;
    }

    /* JADX INFO: renamed from: P */
    public static int m3793P(int tag, byte[] data, int position, int limit, C2209b registers) throws be8 {
        if (gpi.getTagFieldNumber(tag) == 0) {
            throw be8.m3076c();
        }
        int tagWireType = gpi.getTagWireType(tag);
        if (tagWireType == 0) {
            return m3789L(data, position, registers);
        }
        if (tagWireType == 1) {
            return position + 8;
        }
        if (tagWireType == 2) {
            return m3786I(data, position, registers) + registers.f15819a;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return position + 4;
            }
            throw be8.m3076c();
        }
        int i = (tag & (-8)) | 4;
        int i2 = 0;
        while (position < limit) {
            position = m3786I(data, position, registers);
            i2 = registers.f15819a;
            if (i2 == i) {
                break;
            }
            position = m3793P(i2, data, position, limit, registers);
        }
        if (position > limit || i2 != i) {
            throw be8.m3081h();
        }
        return position;
    }

    /* JADX INFO: renamed from: a */
    public static int m3794a(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) {
        sa1 sa1Var = (sa1) list;
        int iM3789L = m3789L(data, position, registers);
        sa1Var.addBoolean(registers.f15820b != 0);
        while (iM3789L < limit) {
            int iM3786I = m3786I(data, iM3789L, registers);
            if (tag != registers.f15819a) {
                break;
            }
            iM3789L = m3789L(data, iM3786I, registers);
            sa1Var.addBoolean(registers.f15820b != 0);
        }
        return iM3789L;
    }

    /* JADX INFO: renamed from: b */
    public static int m3795b(byte[] data, int position, C2209b registers) throws be8 {
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a;
        if (i < 0) {
            throw be8.m3080g();
        }
        if (i > data.length - iM3786I) {
            throw be8.m3084l();
        }
        if (i == 0) {
            registers.f15821c = wj1.f94379e;
            return iM3786I;
        }
        registers.f15821c = wj1.copyFrom(data, iM3786I, i);
        return iM3786I + i;
    }

    /* JADX INFO: renamed from: c */
    public static int m3796c(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) throws be8 {
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a;
        if (i < 0) {
            throw be8.m3080g();
        }
        if (i > data.length - iM3786I) {
            throw be8.m3084l();
        }
        if (i == 0) {
            list.add(wj1.f94379e);
        } else {
            list.add(wj1.copyFrom(data, iM3786I, i));
            iM3786I += i;
        }
        while (iM3786I < limit) {
            int iM3786I2 = m3786I(data, iM3786I, registers);
            if (tag != registers.f15819a) {
                break;
            }
            iM3786I = m3786I(data, iM3786I2, registers);
            int i2 = registers.f15819a;
            if (i2 < 0) {
                throw be8.m3080g();
            }
            if (i2 > data.length - iM3786I) {
                throw be8.m3084l();
            }
            if (i2 == 0) {
                list.add(wj1.f94379e);
            } else {
                list.add(wj1.copyFrom(data, iM3786I, i2));
                iM3786I += i2;
            }
        }
        return iM3786I;
    }

    private static void checkRecursionLimit(int depth) throws be8 {
        if (depth >= f15817b) {
            throw be8.m3082i();
        }
    }

    /* JADX INFO: renamed from: d */
    public static double m3797d(byte[] data, int position) {
        return Double.longBitsToDouble(m3803j(data, position));
    }

    /* JADX INFO: renamed from: e */
    public static int m3798e(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) {
        vj4 vj4Var = (vj4) list;
        vj4Var.addDouble(m3797d(data, position));
        int i = position + 8;
        while (i < limit) {
            int iM3786I = m3786I(data, i, registers);
            if (tag != registers.f15819a) {
                break;
            }
            vj4Var.addDouble(m3797d(data, iM3786I));
            i = iM3786I + 8;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: f */
    public static int m3799f(int tag, byte[] data, int position, int limit, u27.AbstractC13327e<?, ?> message, u27.C13330h<?, ?> extension, sth<uth, uth> unknownFieldSchema, C2209b registers) throws IOException {
        zr5<u27.C13329g> zr5Var = message.extensions;
        int i = tag >>> 3;
        if (extension.f86621d.isRepeated() && extension.f86621d.isPacked()) {
            switch (C2208a.f15818a[extension.getLiteType().ordinal()]) {
                case 1:
                    vj4 vj4Var = new vj4();
                    int iM3812s = m3812s(data, position, vj4Var, registers);
                    zr5Var.setField(extension.f86621d, vj4Var);
                    return iM3812s;
                case 2:
                    b46 b46Var = new b46();
                    int iM3815v = m3815v(data, position, b46Var, registers);
                    zr5Var.setField(extension.f86621d, b46Var);
                    return iM3815v;
                case 3:
                case 4:
                    sk9 sk9Var = new sk9();
                    int iM3819z = m3819z(data, position, sk9Var, registers);
                    zr5Var.setField(extension.f86621d, sk9Var);
                    return iM3819z;
                case 5:
                case 6:
                    c68 c68Var = new c68();
                    int iM3818y = m3818y(data, position, c68Var, registers);
                    zr5Var.setField(extension.f86621d, c68Var);
                    return iM3818y;
                case 7:
                case 8:
                    sk9 sk9Var2 = new sk9();
                    int iM3814u = m3814u(data, position, sk9Var2, registers);
                    zr5Var.setField(extension.f86621d, sk9Var2);
                    return iM3814u;
                case 9:
                case 10:
                    c68 c68Var2 = new c68();
                    int iM3813t = m3813t(data, position, c68Var2, registers);
                    zr5Var.setField(extension.f86621d, c68Var2);
                    return iM3813t;
                case 11:
                    sa1 sa1Var = new sa1();
                    int iM3811r = m3811r(data, position, sa1Var, registers);
                    zr5Var.setField(extension.f86621d, sa1Var);
                    return iM3811r;
                case 12:
                    c68 c68Var3 = new c68();
                    int iM3816w = m3816w(data, position, c68Var3, registers);
                    zr5Var.setField(extension.f86621d, c68Var3);
                    return iM3816w;
                case 13:
                    sk9 sk9Var3 = new sk9();
                    int iM3817x = m3817x(data, position, sk9Var3, registers);
                    zr5Var.setField(extension.f86621d, sk9Var3);
                    return iM3817x;
                case 14:
                    c68 c68Var4 = new c68();
                    int iM3818y2 = m3818y(data, position, c68Var4, registers);
                    iqe.m13306B(message, i, c68Var4, extension.f86621d.getEnumType(), null, unknownFieldSchema);
                    zr5Var.setField(extension.f86621d, c68Var4);
                    return iM3818y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + extension.f86621d.getLiteType());
            }
        }
        Object objValueOf = null;
        if (extension.getLiteType() == gpi.EnumC6460b.f40758Y) {
            position = m3786I(data, position, registers);
            if (extension.f86621d.getEnumType().findValueByNumber(registers.f15819a) == null) {
                iqe.m13313I(message, i, registers.f15819a, null, unknownFieldSchema);
                return position;
            }
            objValueOf = Integer.valueOf(registers.f15819a);
        } else {
            switch (C2208a.f15818a[extension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(m3797d(data, position));
                    position += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(m3805l(data, position));
                    position += 4;
                    break;
                case 3:
                case 4:
                    position = m3789L(data, position, registers);
                    objValueOf = Long.valueOf(registers.f15820b);
                    break;
                case 5:
                case 6:
                    position = m3786I(data, position, registers);
                    objValueOf = Integer.valueOf(registers.f15819a);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(m3803j(data, position));
                    position += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(m3801h(data, position));
                    position += 4;
                    break;
                case 11:
                    position = m3789L(data, position, registers);
                    objValueOf = Boolean.valueOf(registers.f15820b != 0);
                    break;
                case 12:
                    position = m3786I(data, position, registers);
                    objValueOf = Integer.valueOf(e72.decodeZigZag32(registers.f15819a));
                    break;
                case 13:
                    position = m3789L(data, position, registers);
                    objValueOf = Long.valueOf(e72.decodeZigZag64(registers.f15820b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    position = m3795b(data, position, registers);
                    objValueOf = registers.f15821c;
                    break;
                case 16:
                    position = m3780C(data, position, registers);
                    objValueOf = registers.f15821c;
                    break;
                case 17:
                    int i2 = (i << 3) | 4;
                    upe upeVarSchemaFor = lhd.getInstance().schemaFor((Class) extension.getMessageDefaultInstance().getClass());
                    if (extension.isRepeated()) {
                        int iM3807n = m3807n(upeVarSchemaFor, data, position, limit, i2, registers);
                        zr5Var.addRepeatedField(extension.f86621d, registers.f15821c);
                        return iM3807n;
                    }
                    Object field = zr5Var.getField(extension.f86621d);
                    if (field == null) {
                        field = upeVarSchemaFor.newInstance();
                        zr5Var.setField(extension.f86621d, field);
                    }
                    return m3791N(field, upeVarSchemaFor, data, position, limit, i2, registers);
                case 18:
                    upe upeVarSchemaFor2 = lhd.getInstance().schemaFor((Class) extension.getMessageDefaultInstance().getClass());
                    if (extension.isRepeated()) {
                        int iM3809p = m3809p(upeVarSchemaFor2, data, position, limit, registers);
                        zr5Var.addRepeatedField(extension.f86621d, registers.f15821c);
                        return iM3809p;
                    }
                    Object field2 = zr5Var.getField(extension.f86621d);
                    if (field2 == null) {
                        field2 = upeVarSchemaFor2.newInstance();
                        zr5Var.setField(extension.f86621d, field2);
                    }
                    return m3792O(field2, upeVarSchemaFor2, data, position, limit, registers);
            }
        }
        if (extension.isRepeated()) {
            zr5Var.addRepeatedField(extension.f86621d, objValueOf);
        } else {
            zr5Var.setField(extension.f86621d, objValueOf);
        }
        return position;
    }

    /* JADX INFO: renamed from: g */
    public static int m3800g(int tag, byte[] data, int position, int limit, Object message, psa defaultInstance, sth<uth, uth> unknownFieldSchema, C2209b registers) throws IOException {
        u27.C13330h c13330hFindLiteExtensionByNumber = registers.f15822d.findLiteExtensionByNumber(defaultInstance, tag >>> 3);
        if (c13330hFindLiteExtensionByNumber == null) {
            return m3784G(tag, data, position, limit, vsa.m24176a(message), registers);
        }
        u27.AbstractC13327e abstractC13327e = (u27.AbstractC13327e) message;
        abstractC13327e.m23062i0();
        return m3799f(tag, data, position, limit, abstractC13327e, c13330hFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    /* JADX INFO: renamed from: h */
    public static int m3801h(byte[] data, int position) {
        return ((data[position + 3] & 255) << 24) | (data[position] & 255) | ((data[position + 1] & 255) << 8) | ((data[position + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: i */
    public static int m3802i(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) {
        c68 c68Var = (c68) list;
        c68Var.addInt(m3801h(data, position));
        int i = position + 4;
        while (i < limit) {
            int iM3786I = m3786I(data, i, registers);
            if (tag != registers.f15819a) {
                break;
            }
            c68Var.addInt(m3801h(data, iM3786I));
            i = iM3786I + 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public static long m3803j(byte[] data, int position) {
        return ((((long) data[position + 7]) & 255) << 56) | (((long) data[position]) & 255) | ((((long) data[position + 1]) & 255) << 8) | ((((long) data[position + 2]) & 255) << 16) | ((((long) data[position + 3]) & 255) << 24) | ((((long) data[position + 4]) & 255) << 32) | ((((long) data[position + 5]) & 255) << 40) | ((((long) data[position + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: k */
    public static int m3804k(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) {
        sk9 sk9Var = (sk9) list;
        sk9Var.addLong(m3803j(data, position));
        int i = position + 8;
        while (i < limit) {
            int iM3786I = m3786I(data, i, registers);
            if (tag != registers.f15819a) {
                break;
            }
            sk9Var.addLong(m3803j(data, iM3786I));
            i = iM3786I + 8;
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static float m3805l(byte[] data, int position) {
        return Float.intBitsToFloat(m3801h(data, position));
    }

    /* JADX INFO: renamed from: m */
    public static int m3806m(int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) {
        b46 b46Var = (b46) list;
        b46Var.addFloat(m3805l(data, position));
        int i = position + 4;
        while (i < limit) {
            int iM3786I = m3786I(data, i, registers);
            if (tag != registers.f15819a) {
                break;
            }
            b46Var.addFloat(m3805l(data, iM3786I));
            i = iM3786I + 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: n */
    public static int m3807n(upe schema, byte[] data, int position, int limit, int endGroup, C2209b registers) throws IOException {
        Object objNewInstance = schema.newInstance();
        int iM3791N = m3791N(objNewInstance, schema, data, position, limit, endGroup, registers);
        schema.makeImmutable(objNewInstance);
        registers.f15821c = objNewInstance;
        return iM3791N;
    }

    /* JADX INFO: renamed from: o */
    public static int m3808o(upe schema, int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        int i = (tag & (-8)) | 4;
        int iM3807n = m3807n(schema, data, position, limit, i, registers);
        list.add(registers.f15821c);
        while (iM3807n < limit) {
            int iM3786I = m3786I(data, iM3807n, registers);
            if (tag != registers.f15819a) {
                break;
            }
            iM3807n = m3807n(schema, data, iM3786I, limit, i, registers);
            list.add(registers.f15821c);
        }
        return iM3807n;
    }

    /* JADX INFO: renamed from: p */
    public static int m3809p(upe schema, byte[] data, int position, int limit, C2209b registers) throws IOException {
        Object objNewInstance = schema.newInstance();
        int iM3792O = m3792O(objNewInstance, schema, data, position, limit, registers);
        schema.makeImmutable(objNewInstance);
        registers.f15821c = objNewInstance;
        return iM3792O;
    }

    /* JADX INFO: renamed from: q */
    public static int m3810q(upe<?> schema, int tag, byte[] data, int position, int limit, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        int iM3809p = m3809p(schema, data, position, limit, registers);
        list.add(registers.f15821c);
        while (iM3809p < limit) {
            int iM3786I = m3786I(data, iM3809p, registers);
            if (tag != registers.f15819a) {
                break;
            }
            iM3809p = m3809p(schema, data, iM3786I, limit, registers);
            list.add(registers.f15821c);
        }
        return iM3809p;
    }

    /* JADX INFO: renamed from: r */
    public static int m3811r(byte[] data, int position, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        sa1 sa1Var = (sa1) list;
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a + iM3786I;
        while (iM3786I < i) {
            iM3786I = m3789L(data, iM3786I, registers);
            sa1Var.addBoolean(registers.f15820b != 0);
        }
        if (iM3786I == i) {
            return iM3786I;
        }
        throw be8.m3084l();
    }

    /* JADX INFO: renamed from: s */
    public static int m3812s(byte[] data, int position, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        vj4 vj4Var = (vj4) list;
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a + iM3786I;
        while (iM3786I < i) {
            vj4Var.addDouble(m3797d(data, iM3786I));
            iM3786I += 8;
        }
        if (iM3786I == i) {
            return iM3786I;
        }
        throw be8.m3084l();
    }

    public static void setRecursionLimit(int limit) {
        f15817b = limit;
    }

    /* JADX INFO: renamed from: t */
    public static int m3813t(byte[] data, int position, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        c68 c68Var = (c68) list;
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a + iM3786I;
        while (iM3786I < i) {
            c68Var.addInt(m3801h(data, iM3786I));
            iM3786I += 4;
        }
        if (iM3786I == i) {
            return iM3786I;
        }
        throw be8.m3084l();
    }

    /* JADX INFO: renamed from: u */
    public static int m3814u(byte[] data, int position, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        sk9 sk9Var = (sk9) list;
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a + iM3786I;
        while (iM3786I < i) {
            sk9Var.addLong(m3803j(data, iM3786I));
            iM3786I += 8;
        }
        if (iM3786I == i) {
            return iM3786I;
        }
        throw be8.m3084l();
    }

    /* JADX INFO: renamed from: v */
    public static int m3815v(byte[] data, int position, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        b46 b46Var = (b46) list;
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a + iM3786I;
        while (iM3786I < i) {
            b46Var.addFloat(m3805l(data, iM3786I));
            iM3786I += 4;
        }
        if (iM3786I == i) {
            return iM3786I;
        }
        throw be8.m3084l();
    }

    /* JADX INFO: renamed from: w */
    public static int m3816w(byte[] data, int position, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        c68 c68Var = (c68) list;
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a + iM3786I;
        while (iM3786I < i) {
            iM3786I = m3786I(data, iM3786I, registers);
            c68Var.addInt(e72.decodeZigZag32(registers.f15819a));
        }
        if (iM3786I == i) {
            return iM3786I;
        }
        throw be8.m3084l();
    }

    /* JADX INFO: renamed from: x */
    public static int m3817x(byte[] data, int position, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        sk9 sk9Var = (sk9) list;
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a + iM3786I;
        while (iM3786I < i) {
            iM3786I = m3789L(data, iM3786I, registers);
            sk9Var.addLong(e72.decodeZigZag64(registers.f15820b));
        }
        if (iM3786I == i) {
            return iM3786I;
        }
        throw be8.m3084l();
    }

    /* JADX INFO: renamed from: y */
    public static int m3818y(byte[] data, int position, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        c68 c68Var = (c68) list;
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a + iM3786I;
        while (iM3786I < i) {
            iM3786I = m3786I(data, iM3786I, registers);
            c68Var.addInt(registers.f15819a);
        }
        if (iM3786I == i) {
            return iM3786I;
        }
        throw be8.m3084l();
    }

    /* JADX INFO: renamed from: z */
    public static int m3819z(byte[] data, int position, v98.InterfaceC13956l<?> list, C2209b registers) throws IOException {
        sk9 sk9Var = (sk9) list;
        int iM3786I = m3786I(data, position, registers);
        int i = registers.f15819a + iM3786I;
        while (iM3786I < i) {
            iM3786I = m3789L(data, iM3786I, registers);
            sk9Var.addLong(registers.f15820b);
        }
        if (iM3786I == i) {
            return iM3786I;
        }
        throw be8.m3084l();
    }

    /* JADX INFO: renamed from: c60$b */
    public static final class C2209b {

        /* JADX INFO: renamed from: a */
        public int f15819a;

        /* JADX INFO: renamed from: b */
        public long f15820b;

        /* JADX INFO: renamed from: c */
        public Object f15821c;

        /* JADX INFO: renamed from: d */
        public final yi5 f15822d;

        /* JADX INFO: renamed from: e */
        public int f15823e;

        public C2209b() {
            this.f15822d = yi5.getEmptyRegistry();
        }

        public C2209b(yi5 extensionRegistry) {
            extensionRegistry.getClass();
            this.f15822d = extensionRegistry;
        }
    }
}
