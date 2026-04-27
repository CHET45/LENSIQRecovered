package p000;

import java.io.IOException;
import p000.hpi;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class d60 {

    /* JADX INFO: renamed from: a */
    public static final int f28491a = 100;

    /* JADX INFO: renamed from: b */
    public static volatile int f28492b = 100;

    /* JADX INFO: renamed from: d60$a */
    public static /* synthetic */ class C4624a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28493a;

        static {
            int[] iArr = new int[hpi.EnumC6968b.values().length];
            f28493a = iArr;
            try {
                iArr[hpi.EnumC6968b.f44496c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44497d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44498e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44499f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44500m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44491X.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44482C.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44487M1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44483F.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44493Z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44484H.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44490V1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44494Z1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44492Y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44489Q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44485L.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44486M.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28493a[hpi.EnumC6968b.f44488N.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private d60() {
    }

    /* JADX INFO: renamed from: A */
    public static int m8889A(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) {
        b68 b68Var = (b68) list;
        int iM8897I = m8897I(data, position, registers);
        b68Var.addInt(f72.decodeZigZag32(registers.f28494a));
        while (iM8897I < limit) {
            int iM8897I2 = m8897I(data, iM8897I, registers);
            if (tag != registers.f28494a) {
                break;
            }
            iM8897I = m8897I(data, iM8897I2, registers);
            b68Var.addInt(f72.decodeZigZag32(registers.f28494a));
        }
        return iM8897I;
    }

    /* JADX INFO: renamed from: B */
    public static int m8890B(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) {
        rk9 rk9Var = (rk9) list;
        int iM8900L = m8900L(data, position, registers);
        rk9Var.addLong(f72.decodeZigZag64(registers.f28495b));
        while (iM8900L < limit) {
            int iM8897I = m8897I(data, iM8900L, registers);
            if (tag != registers.f28494a) {
                break;
            }
            iM8900L = m8900L(data, iM8897I, registers);
            rk9Var.addLong(f72.decodeZigZag64(registers.f28495b));
        }
        return iM8900L;
    }

    /* JADX INFO: renamed from: C */
    public static int m8891C(byte[] data, int position, C4625b registers) throws ce8 {
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a;
        if (i < 0) {
            throw ce8.m3924g();
        }
        if (i == 0) {
            registers.f28496c = "";
            return iM8897I;
        }
        registers.f28496c = new String(data, iM8897I, i, w98.f93674b);
        return iM8897I + i;
    }

    /* JADX INFO: renamed from: D */
    public static int m8892D(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) throws ce8 {
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a;
        if (i < 0) {
            throw ce8.m3924g();
        }
        if (i == 0) {
            list.add("");
        } else {
            list.add(new String(data, iM8897I, i, w98.f93674b));
            iM8897I += i;
        }
        while (iM8897I < limit) {
            int iM8897I2 = m8897I(data, iM8897I, registers);
            if (tag != registers.f28494a) {
                break;
            }
            iM8897I = m8897I(data, iM8897I2, registers);
            int i2 = registers.f28494a;
            if (i2 < 0) {
                throw ce8.m3924g();
            }
            if (i2 == 0) {
                list.add("");
            } else {
                list.add(new String(data, iM8897I, i2, w98.f93674b));
                iM8897I += i2;
            }
        }
        return iM8897I;
    }

    /* JADX INFO: renamed from: E */
    public static int m8893E(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) throws ce8 {
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a;
        if (i < 0) {
            throw ce8.m3924g();
        }
        if (i == 0) {
            list.add("");
        } else {
            int i2 = iM8897I + i;
            if (!pzh.m19874n(data, iM8897I, i2)) {
                throw ce8.m3921d();
            }
            list.add(new String(data, iM8897I, i, w98.f93674b));
            iM8897I = i2;
        }
        while (iM8897I < limit) {
            int iM8897I2 = m8897I(data, iM8897I, registers);
            if (tag != registers.f28494a) {
                break;
            }
            iM8897I = m8897I(data, iM8897I2, registers);
            int i3 = registers.f28494a;
            if (i3 < 0) {
                throw ce8.m3924g();
            }
            if (i3 == 0) {
                list.add("");
            } else {
                int i4 = iM8897I + i3;
                if (!pzh.m19874n(data, iM8897I, i4)) {
                    throw ce8.m3921d();
                }
                list.add(new String(data, iM8897I, i3, w98.f93674b));
                iM8897I = i4;
            }
        }
        return iM8897I;
    }

    /* JADX INFO: renamed from: F */
    public static int m8894F(byte[] data, int position, C4625b registers) throws ce8 {
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a;
        if (i < 0) {
            throw ce8.m3924g();
        }
        if (i == 0) {
            registers.f28496c = "";
            return iM8897I;
        }
        registers.f28496c = pzh.m19868h(data, iM8897I, i);
        return iM8897I + i;
    }

    /* JADX INFO: renamed from: G */
    public static int m8895G(int tag, byte[] data, int position, int limit, tth unknownFields, C4625b registers) throws ce8 {
        if (hpi.getTagFieldNumber(tag) == 0) {
            throw ce8.m3920c();
        }
        int tagWireType = hpi.getTagWireType(tag);
        if (tagWireType == 0) {
            int iM8900L = m8900L(data, position, registers);
            unknownFields.m22843i(tag, Long.valueOf(registers.f28495b));
            return iM8900L;
        }
        if (tagWireType == 1) {
            unknownFields.m22843i(tag, Long.valueOf(m8914j(data, position)));
            return position + 8;
        }
        if (tagWireType == 2) {
            int iM8897I = m8897I(data, position, registers);
            int i = registers.f28494a;
            if (i < 0) {
                throw ce8.m3924g();
            }
            if (i > data.length - iM8897I) {
                throw ce8.m3928l();
            }
            if (i == 0) {
                unknownFields.m22843i(tag, vj1.f91344e);
            } else {
                unknownFields.m22843i(tag, vj1.copyFrom(data, iM8897I, i));
            }
            return iM8897I + i;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw ce8.m3920c();
            }
            unknownFields.m22843i(tag, Integer.valueOf(m8912h(data, position)));
            return position + 4;
        }
        tth tthVarM22836g = tth.m22836g();
        int i2 = (tag & (-8)) | 4;
        int i3 = registers.f28498e + 1;
        registers.f28498e = i3;
        checkRecursionLimit(i3);
        int i4 = 0;
        while (true) {
            if (position >= limit) {
                break;
            }
            int iM8897I2 = m8897I(data, position, registers);
            int i5 = registers.f28494a;
            if (i5 == i2) {
                i4 = i5;
                position = iM8897I2;
                break;
            }
            i4 = i5;
            position = m8895G(i5, data, iM8897I2, limit, tthVarM22836g, registers);
        }
        registers.f28498e--;
        if (position > limit || i4 != i2) {
            throw ce8.m3925h();
        }
        unknownFields.m22843i(tag, tthVarM22836g);
        return position;
    }

    /* JADX INFO: renamed from: H */
    public static int m8896H(int firstByte, byte[] data, int position, C4625b registers) {
        int i = firstByte & 127;
        int i2 = position + 1;
        byte b = data[position];
        if (b >= 0) {
            registers.f28494a = i | (b << 7);
            return i2;
        }
        int i3 = i | ((b & 127) << 7);
        int i4 = position + 2;
        byte b2 = data[i2];
        if (b2 >= 0) {
            registers.f28494a = i3 | (b2 << 14);
            return i4;
        }
        int i5 = i3 | ((b2 & 127) << 14);
        int i6 = position + 3;
        byte b3 = data[i4];
        if (b3 >= 0) {
            registers.f28494a = i5 | (b3 << 21);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 21);
        int i8 = position + 4;
        byte b4 = data[i6];
        if (b4 >= 0) {
            registers.f28494a = i7 | (b4 << 28);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 28);
        while (true) {
            int i10 = i8 + 1;
            if (data[i8] >= 0) {
                registers.f28494a = i9;
                return i10;
            }
            i8 = i10;
        }
    }

    /* JADX INFO: renamed from: I */
    public static int m8897I(byte[] data, int position, C4625b registers) {
        int i = position + 1;
        byte b = data[position];
        if (b < 0) {
            return m8896H(b, data, i, registers);
        }
        registers.f28494a = b;
        return i;
    }

    /* JADX INFO: renamed from: J */
    public static int m8898J(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) {
        b68 b68Var = (b68) list;
        int iM8897I = m8897I(data, position, registers);
        b68Var.addInt(registers.f28494a);
        while (iM8897I < limit) {
            int iM8897I2 = m8897I(data, iM8897I, registers);
            if (tag != registers.f28494a) {
                break;
            }
            iM8897I = m8897I(data, iM8897I2, registers);
            b68Var.addInt(registers.f28494a);
        }
        return iM8897I;
    }

    /* JADX INFO: renamed from: K */
    public static int m8899K(long firstByte, byte[] data, int position, C4625b registers) {
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
        registers.f28495b = j;
        return i;
    }

    /* JADX INFO: renamed from: L */
    public static int m8900L(byte[] data, int position, C4625b registers) {
        int i = position + 1;
        long j = data[position];
        if (j < 0) {
            return m8899K(j, data, i, registers);
        }
        registers.f28495b = j;
        return i;
    }

    /* JADX INFO: renamed from: M */
    public static int m8901M(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) {
        rk9 rk9Var = (rk9) list;
        int iM8900L = m8900L(data, position, registers);
        rk9Var.addLong(registers.f28495b);
        while (iM8900L < limit) {
            int iM8897I = m8897I(data, iM8900L, registers);
            if (tag != registers.f28494a) {
                break;
            }
            iM8900L = m8900L(data, iM8897I, registers);
            rk9Var.addLong(registers.f28495b);
        }
        return iM8900L;
    }

    /* JADX INFO: renamed from: N */
    public static int m8902N(Object msg, tpe schema, byte[] data, int position, int limit, int endGroup, C4625b registers) throws IOException {
        wsa wsaVar = (wsa) schema;
        int i = registers.f28498e + 1;
        registers.f28498e = i;
        checkRecursionLimit(i);
        int iM24807f = wsaVar.m24807f(msg, data, position, limit, endGroup, registers);
        registers.f28498e--;
        registers.f28496c = msg;
        return iM24807f;
    }

    /* JADX INFO: renamed from: O */
    public static int m8903O(Object msg, tpe schema, byte[] data, int position, int limit, C4625b registers) throws IOException {
        int iM8896H = position + 1;
        int i = data[position];
        if (i < 0) {
            iM8896H = m8896H(i, data, iM8896H, registers);
            i = registers.f28494a;
        }
        int i2 = iM8896H;
        if (i < 0 || i > limit - i2) {
            throw ce8.m3928l();
        }
        int i3 = registers.f28498e + 1;
        registers.f28498e = i3;
        checkRecursionLimit(i3);
        int i4 = i + i2;
        schema.mergeFrom(msg, data, i2, i4, registers);
        registers.f28498e--;
        registers.f28496c = msg;
        return i4;
    }

    /* JADX INFO: renamed from: P */
    public static int m8904P(int tag, byte[] data, int position, int limit, C4625b registers) throws ce8 {
        if (hpi.getTagFieldNumber(tag) == 0) {
            throw ce8.m3920c();
        }
        int tagWireType = hpi.getTagWireType(tag);
        if (tagWireType == 0) {
            return m8900L(data, position, registers);
        }
        if (tagWireType == 1) {
            return position + 8;
        }
        if (tagWireType == 2) {
            return m8897I(data, position, registers) + registers.f28494a;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return position + 4;
            }
            throw ce8.m3920c();
        }
        int i = (tag & (-8)) | 4;
        int i2 = 0;
        while (position < limit) {
            position = m8897I(data, position, registers);
            i2 = registers.f28494a;
            if (i2 == i) {
                break;
            }
            position = m8904P(i2, data, position, limit, registers);
        }
        if (position > limit || i2 != i) {
            throw ce8.m3925h();
        }
        return position;
    }

    /* JADX INFO: renamed from: a */
    public static int m8905a(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) {
        ra1 ra1Var = (ra1) list;
        int iM8900L = m8900L(data, position, registers);
        ra1Var.addBoolean(registers.f28495b != 0);
        while (iM8900L < limit) {
            int iM8897I = m8897I(data, iM8900L, registers);
            if (tag != registers.f28494a) {
                break;
            }
            iM8900L = m8900L(data, iM8897I, registers);
            ra1Var.addBoolean(registers.f28495b != 0);
        }
        return iM8900L;
    }

    /* JADX INFO: renamed from: b */
    public static int m8906b(byte[] data, int position, C4625b registers) throws ce8 {
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a;
        if (i < 0) {
            throw ce8.m3924g();
        }
        if (i > data.length - iM8897I) {
            throw ce8.m3928l();
        }
        if (i == 0) {
            registers.f28496c = vj1.f91344e;
            return iM8897I;
        }
        registers.f28496c = vj1.copyFrom(data, iM8897I, i);
        return iM8897I + i;
    }

    /* JADX INFO: renamed from: c */
    public static int m8907c(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) throws ce8 {
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a;
        if (i < 0) {
            throw ce8.m3924g();
        }
        if (i > data.length - iM8897I) {
            throw ce8.m3928l();
        }
        if (i == 0) {
            list.add(vj1.f91344e);
        } else {
            list.add(vj1.copyFrom(data, iM8897I, i));
            iM8897I += i;
        }
        while (iM8897I < limit) {
            int iM8897I2 = m8897I(data, iM8897I, registers);
            if (tag != registers.f28494a) {
                break;
            }
            iM8897I = m8897I(data, iM8897I2, registers);
            int i2 = registers.f28494a;
            if (i2 < 0) {
                throw ce8.m3924g();
            }
            if (i2 > data.length - iM8897I) {
                throw ce8.m3928l();
            }
            if (i2 == 0) {
                list.add(vj1.f91344e);
            } else {
                list.add(vj1.copyFrom(data, iM8897I, i2));
                iM8897I += i2;
            }
        }
        return iM8897I;
    }

    private static void checkRecursionLimit(int depth) throws ce8 {
        if (depth >= f28492b) {
            throw ce8.m3926i();
        }
    }

    /* JADX INFO: renamed from: d */
    public static double m8908d(byte[] data, int position) {
        return Double.longBitsToDouble(m8914j(data, position));
    }

    /* JADX INFO: renamed from: e */
    public static int m8909e(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) {
        uj4 uj4Var = (uj4) list;
        uj4Var.addDouble(m8908d(data, position));
        int i = position + 8;
        while (i < limit) {
            int iM8897I = m8897I(data, i, registers);
            if (tag != registers.f28494a) {
                break;
            }
            uj4Var.addDouble(m8908d(data, iM8897I));
            i = iM8897I + 8;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: f */
    public static int m8910f(int tag, byte[] data, int position, int limit, v27.AbstractC13826e<?, ?> message, v27.C13829h<?, ?> extension, rth<tth, tth> unknownFieldSchema, C4625b registers) throws IOException {
        as5<v27.C13828g> as5Var = message.extensions;
        int i = tag >>> 3;
        if (extension.f89770d.isRepeated() && extension.f89770d.isPacked()) {
            switch (C4624a.f28493a[extension.getLiteType().ordinal()]) {
                case 1:
                    uj4 uj4Var = new uj4();
                    int iM8923s = m8923s(data, position, uj4Var, registers);
                    as5Var.setField(extension.f89770d, uj4Var);
                    return iM8923s;
                case 2:
                    a46 a46Var = new a46();
                    int iM8926v = m8926v(data, position, a46Var, registers);
                    as5Var.setField(extension.f89770d, a46Var);
                    return iM8926v;
                case 3:
                case 4:
                    rk9 rk9Var = new rk9();
                    int iM8930z = m8930z(data, position, rk9Var, registers);
                    as5Var.setField(extension.f89770d, rk9Var);
                    return iM8930z;
                case 5:
                case 6:
                    b68 b68Var = new b68();
                    int iM8929y = m8929y(data, position, b68Var, registers);
                    as5Var.setField(extension.f89770d, b68Var);
                    return iM8929y;
                case 7:
                case 8:
                    rk9 rk9Var2 = new rk9();
                    int iM8925u = m8925u(data, position, rk9Var2, registers);
                    as5Var.setField(extension.f89770d, rk9Var2);
                    return iM8925u;
                case 9:
                case 10:
                    b68 b68Var2 = new b68();
                    int iM8924t = m8924t(data, position, b68Var2, registers);
                    as5Var.setField(extension.f89770d, b68Var2);
                    return iM8924t;
                case 11:
                    ra1 ra1Var = new ra1();
                    int iM8922r = m8922r(data, position, ra1Var, registers);
                    as5Var.setField(extension.f89770d, ra1Var);
                    return iM8922r;
                case 12:
                    b68 b68Var3 = new b68();
                    int iM8927w = m8927w(data, position, b68Var3, registers);
                    as5Var.setField(extension.f89770d, b68Var3);
                    return iM8927w;
                case 13:
                    rk9 rk9Var3 = new rk9();
                    int iM8928x = m8928x(data, position, rk9Var3, registers);
                    as5Var.setField(extension.f89770d, rk9Var3);
                    return iM8928x;
                case 14:
                    b68 b68Var4 = new b68();
                    int iM8929y2 = m8929y(data, position, b68Var4, registers);
                    hqe.m12541B(message, i, b68Var4, extension.f89770d.getEnumType(), null, unknownFieldSchema);
                    as5Var.setField(extension.f89770d, b68Var4);
                    return iM8929y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + extension.f89770d.getLiteType());
            }
        }
        Object objValueOf = null;
        if (extension.getLiteType() == hpi.EnumC6968b.f44492Y) {
            position = m8897I(data, position, registers);
            if (extension.f89770d.getEnumType().findValueByNumber(registers.f28494a) == null) {
                hqe.m12548I(message, i, registers.f28494a, null, unknownFieldSchema);
                return position;
            }
            objValueOf = Integer.valueOf(registers.f28494a);
        } else {
            switch (C4624a.f28493a[extension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(m8908d(data, position));
                    position += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(m8916l(data, position));
                    position += 4;
                    break;
                case 3:
                case 4:
                    position = m8900L(data, position, registers);
                    objValueOf = Long.valueOf(registers.f28495b);
                    break;
                case 5:
                case 6:
                    position = m8897I(data, position, registers);
                    objValueOf = Integer.valueOf(registers.f28494a);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(m8914j(data, position));
                    position += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(m8912h(data, position));
                    position += 4;
                    break;
                case 11:
                    position = m8900L(data, position, registers);
                    objValueOf = Boolean.valueOf(registers.f28495b != 0);
                    break;
                case 12:
                    position = m8897I(data, position, registers);
                    objValueOf = Integer.valueOf(f72.decodeZigZag32(registers.f28494a));
                    break;
                case 13:
                    position = m8900L(data, position, registers);
                    objValueOf = Long.valueOf(f72.decodeZigZag64(registers.f28495b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    position = m8906b(data, position, registers);
                    objValueOf = registers.f28496c;
                    break;
                case 16:
                    position = m8891C(data, position, registers);
                    objValueOf = registers.f28496c;
                    break;
                case 17:
                    int i2 = (i << 3) | 4;
                    tpe tpeVarSchemaFor = khd.getInstance().schemaFor((Class) extension.getMessageDefaultInstance().getClass());
                    if (extension.isRepeated()) {
                        int iM8918n = m8918n(tpeVarSchemaFor, data, position, limit, i2, registers);
                        as5Var.addRepeatedField(extension.f89770d, registers.f28496c);
                        return iM8918n;
                    }
                    Object field = as5Var.getField(extension.f89770d);
                    if (field == null) {
                        field = tpeVarSchemaFor.newInstance();
                        as5Var.setField(extension.f89770d, field);
                    }
                    return m8902N(field, tpeVarSchemaFor, data, position, limit, i2, registers);
                case 18:
                    tpe tpeVarSchemaFor2 = khd.getInstance().schemaFor((Class) extension.getMessageDefaultInstance().getClass());
                    if (extension.isRepeated()) {
                        int iM8920p = m8920p(tpeVarSchemaFor2, data, position, limit, registers);
                        as5Var.addRepeatedField(extension.f89770d, registers.f28496c);
                        return iM8920p;
                    }
                    Object field2 = as5Var.getField(extension.f89770d);
                    if (field2 == null) {
                        field2 = tpeVarSchemaFor2.newInstance();
                        as5Var.setField(extension.f89770d, field2);
                    }
                    return m8903O(field2, tpeVarSchemaFor2, data, position, limit, registers);
            }
        }
        if (extension.isRepeated()) {
            as5Var.addRepeatedField(extension.f89770d, objValueOf);
        } else {
            as5Var.setField(extension.f89770d, objValueOf);
        }
        return position;
    }

    /* JADX INFO: renamed from: g */
    public static int m8911g(int tag, byte[] data, int position, int limit, Object message, qsa defaultInstance, rth<tth, tth> unknownFieldSchema, C4625b registers) throws IOException {
        v27.C13829h c13829hFindLiteExtensionByNumber = registers.f28497d.findLiteExtensionByNumber(defaultInstance, tag >>> 3);
        if (c13829hFindLiteExtensionByNumber == null) {
            return m8895G(tag, data, position, limit, wsa.m24802a(message), registers);
        }
        v27.AbstractC13826e abstractC13826e = (v27.AbstractC13826e) message;
        abstractC13826e.m23747j0();
        return m8910f(tag, data, position, limit, abstractC13826e, c13829hFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    /* JADX INFO: renamed from: h */
    public static int m8912h(byte[] data, int position) {
        return ((data[position + 3] & 255) << 24) | (data[position] & 255) | ((data[position + 1] & 255) << 8) | ((data[position + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: i */
    public static int m8913i(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) {
        b68 b68Var = (b68) list;
        b68Var.addInt(m8912h(data, position));
        int i = position + 4;
        while (i < limit) {
            int iM8897I = m8897I(data, i, registers);
            if (tag != registers.f28494a) {
                break;
            }
            b68Var.addInt(m8912h(data, iM8897I));
            i = iM8897I + 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public static long m8914j(byte[] data, int position) {
        return ((((long) data[position + 7]) & 255) << 56) | (((long) data[position]) & 255) | ((((long) data[position + 1]) & 255) << 8) | ((((long) data[position + 2]) & 255) << 16) | ((((long) data[position + 3]) & 255) << 24) | ((((long) data[position + 4]) & 255) << 32) | ((((long) data[position + 5]) & 255) << 40) | ((((long) data[position + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: k */
    public static int m8915k(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) {
        rk9 rk9Var = (rk9) list;
        rk9Var.addLong(m8914j(data, position));
        int i = position + 8;
        while (i < limit) {
            int iM8897I = m8897I(data, i, registers);
            if (tag != registers.f28494a) {
                break;
            }
            rk9Var.addLong(m8914j(data, iM8897I));
            i = iM8897I + 8;
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static float m8916l(byte[] data, int position) {
        return Float.intBitsToFloat(m8912h(data, position));
    }

    /* JADX INFO: renamed from: m */
    public static int m8917m(int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) {
        a46 a46Var = (a46) list;
        a46Var.addFloat(m8916l(data, position));
        int i = position + 4;
        while (i < limit) {
            int iM8897I = m8897I(data, i, registers);
            if (tag != registers.f28494a) {
                break;
            }
            a46Var.addFloat(m8916l(data, iM8897I));
            i = iM8897I + 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: n */
    public static int m8918n(tpe schema, byte[] data, int position, int limit, int endGroup, C4625b registers) throws IOException {
        Object objNewInstance = schema.newInstance();
        int iM8902N = m8902N(objNewInstance, schema, data, position, limit, endGroup, registers);
        schema.makeImmutable(objNewInstance);
        registers.f28496c = objNewInstance;
        return iM8902N;
    }

    /* JADX INFO: renamed from: o */
    public static int m8919o(tpe schema, int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        int i = (tag & (-8)) | 4;
        int iM8918n = m8918n(schema, data, position, limit, i, registers);
        list.add(registers.f28496c);
        while (iM8918n < limit) {
            int iM8897I = m8897I(data, iM8918n, registers);
            if (tag != registers.f28494a) {
                break;
            }
            iM8918n = m8918n(schema, data, iM8897I, limit, i, registers);
            list.add(registers.f28496c);
        }
        return iM8918n;
    }

    /* JADX INFO: renamed from: p */
    public static int m8920p(tpe schema, byte[] data, int position, int limit, C4625b registers) throws IOException {
        Object objNewInstance = schema.newInstance();
        int iM8903O = m8903O(objNewInstance, schema, data, position, limit, registers);
        schema.makeImmutable(objNewInstance);
        registers.f28496c = objNewInstance;
        return iM8903O;
    }

    /* JADX INFO: renamed from: q */
    public static int m8921q(tpe<?> schema, int tag, byte[] data, int position, int limit, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        int iM8920p = m8920p(schema, data, position, limit, registers);
        list.add(registers.f28496c);
        while (iM8920p < limit) {
            int iM8897I = m8897I(data, iM8920p, registers);
            if (tag != registers.f28494a) {
                break;
            }
            iM8920p = m8920p(schema, data, iM8897I, limit, registers);
            list.add(registers.f28496c);
        }
        return iM8920p;
    }

    /* JADX INFO: renamed from: r */
    public static int m8922r(byte[] data, int position, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        ra1 ra1Var = (ra1) list;
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a + iM8897I;
        while (iM8897I < i) {
            iM8897I = m8900L(data, iM8897I, registers);
            ra1Var.addBoolean(registers.f28495b != 0);
        }
        if (iM8897I == i) {
            return iM8897I;
        }
        throw ce8.m3928l();
    }

    /* JADX INFO: renamed from: s */
    public static int m8923s(byte[] data, int position, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        uj4 uj4Var = (uj4) list;
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a + iM8897I;
        while (iM8897I < i) {
            uj4Var.addDouble(m8908d(data, iM8897I));
            iM8897I += 8;
        }
        if (iM8897I == i) {
            return iM8897I;
        }
        throw ce8.m3928l();
    }

    public static void setRecursionLimit(int limit) {
        f28492b = limit;
    }

    /* JADX INFO: renamed from: t */
    public static int m8924t(byte[] data, int position, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        b68 b68Var = (b68) list;
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a + iM8897I;
        while (iM8897I < i) {
            b68Var.addInt(m8912h(data, iM8897I));
            iM8897I += 4;
        }
        if (iM8897I == i) {
            return iM8897I;
        }
        throw ce8.m3928l();
    }

    /* JADX INFO: renamed from: u */
    public static int m8925u(byte[] data, int position, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        rk9 rk9Var = (rk9) list;
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a + iM8897I;
        while (iM8897I < i) {
            rk9Var.addLong(m8914j(data, iM8897I));
            iM8897I += 8;
        }
        if (iM8897I == i) {
            return iM8897I;
        }
        throw ce8.m3928l();
    }

    /* JADX INFO: renamed from: v */
    public static int m8926v(byte[] data, int position, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        a46 a46Var = (a46) list;
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a + iM8897I;
        while (iM8897I < i) {
            a46Var.addFloat(m8916l(data, iM8897I));
            iM8897I += 4;
        }
        if (iM8897I == i) {
            return iM8897I;
        }
        throw ce8.m3928l();
    }

    /* JADX INFO: renamed from: w */
    public static int m8927w(byte[] data, int position, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        b68 b68Var = (b68) list;
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a + iM8897I;
        while (iM8897I < i) {
            iM8897I = m8897I(data, iM8897I, registers);
            b68Var.addInt(f72.decodeZigZag32(registers.f28494a));
        }
        if (iM8897I == i) {
            return iM8897I;
        }
        throw ce8.m3928l();
    }

    /* JADX INFO: renamed from: x */
    public static int m8928x(byte[] data, int position, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        rk9 rk9Var = (rk9) list;
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a + iM8897I;
        while (iM8897I < i) {
            iM8897I = m8900L(data, iM8897I, registers);
            rk9Var.addLong(f72.decodeZigZag64(registers.f28495b));
        }
        if (iM8897I == i) {
            return iM8897I;
        }
        throw ce8.m3928l();
    }

    /* JADX INFO: renamed from: y */
    public static int m8929y(byte[] data, int position, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        b68 b68Var = (b68) list;
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a + iM8897I;
        while (iM8897I < i) {
            iM8897I = m8897I(data, iM8897I, registers);
            b68Var.addInt(registers.f28494a);
        }
        if (iM8897I == i) {
            return iM8897I;
        }
        throw ce8.m3928l();
    }

    /* JADX INFO: renamed from: z */
    public static int m8930z(byte[] data, int position, w98.InterfaceC14504k<?> list, C4625b registers) throws IOException {
        rk9 rk9Var = (rk9) list;
        int iM8897I = m8897I(data, position, registers);
        int i = registers.f28494a + iM8897I;
        while (iM8897I < i) {
            iM8897I = m8900L(data, iM8897I, registers);
            rk9Var.addLong(registers.f28495b);
        }
        if (iM8897I == i) {
            return iM8897I;
        }
        throw ce8.m3928l();
    }

    /* JADX INFO: renamed from: d60$b */
    public static final class C4625b {

        /* JADX INFO: renamed from: a */
        public int f28494a;

        /* JADX INFO: renamed from: b */
        public long f28495b;

        /* JADX INFO: renamed from: c */
        public Object f28496c;

        /* JADX INFO: renamed from: d */
        public final zi5 f28497d;

        /* JADX INFO: renamed from: e */
        public int f28498e;

        public C4625b() {
            this.f28497d = zi5.getEmptyRegistry();
        }

        public C4625b(zi5 extensionRegistry) {
            extensionRegistry.getClass();
            this.f28497d = extensionRegistry;
        }
    }
}
