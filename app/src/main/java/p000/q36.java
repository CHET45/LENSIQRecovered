package p000;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import p000.o36;

/* JADX INFO: loaded from: classes5.dex */
public class q36 {

    /* JADX INFO: renamed from: h */
    public static final int f73090h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f73091i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f73092j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f73093k = 3;

    /* JADX INFO: renamed from: l */
    public static final int f73094l = 4;

    /* JADX INFO: renamed from: m */
    public static final int f73095m = 7;

    /* JADX INFO: renamed from: n */
    public static final int f73096n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f73097o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f73098p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f73099q = 3;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ boolean f73100r = false;

    /* JADX INFO: renamed from: a */
    public final crd f73101a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<C11285b> f73102b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, Integer> f73103c;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, Integer> f73104d;

    /* JADX INFO: renamed from: e */
    public final int f73105e;

    /* JADX INFO: renamed from: f */
    public boolean f73106f;

    /* JADX INFO: renamed from: g */
    public Comparator<C11285b> f73107g;

    /* JADX INFO: renamed from: q36$a */
    public class C11284a implements Comparator<C11285b> {
        public C11284a() {
        }

        @Override // java.util.Comparator
        public int compare(C11285b c11285b, C11285b c11285b2) {
            byte b;
            byte b2;
            int i = c11285b.f73114e;
            int i2 = c11285b2.f73114e;
            do {
                b = q36.this.f73101a.get(i);
                b2 = q36.this.f73101a.get(i2);
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
            } while (b == b2);
            return b - b2;
        }
    }

    /* JADX INFO: renamed from: q36$b */
    public static class C11285b {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ boolean f73109f = false;

        /* JADX INFO: renamed from: a */
        public final int f73110a;

        /* JADX INFO: renamed from: b */
        public final int f73111b;

        /* JADX INFO: renamed from: c */
        public final double f73112c;

        /* JADX INFO: renamed from: d */
        public long f73113d;

        /* JADX INFO: renamed from: e */
        public int f73114e;

        public C11285b(int i, int i2, int i3, long j) {
            this.f73114e = i;
            this.f73110a = i2;
            this.f73111b = i3;
            this.f73113d = j;
            this.f73112c = Double.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int elemWidth(int i, int i2) {
            return elemWidth(this.f73110a, this.f73111b, this.f73113d, i, i2);
        }

        /* JADX INFO: renamed from: f */
        public static C11285b m20041f(int i, int i2, int i3, int i4) {
            return new C11285b(i, i3, i4, i2);
        }

        /* JADX INFO: renamed from: g */
        public static C11285b m20042g(int i, boolean z) {
            return new C11285b(i, 26, 0, z ? 1L : 0L);
        }

        /* JADX INFO: renamed from: h */
        public static C11285b m20043h(int i, float f) {
            return new C11285b(i, 3, 2, f);
        }

        /* JADX INFO: renamed from: i */
        public static C11285b m20044i(int i, double d) {
            return new C11285b(i, 3, 3, d);
        }

        /* JADX INFO: renamed from: j */
        public static C11285b m20045j(int i, int i2) {
            return new C11285b(i, 1, 1, i2);
        }

        /* JADX INFO: renamed from: k */
        public static C11285b m20046k(int i, int i2) {
            return new C11285b(i, 1, 2, i2);
        }

        /* JADX INFO: renamed from: l */
        public static C11285b m20047l(int i, long j) {
            return new C11285b(i, 1, 3, j);
        }

        /* JADX INFO: renamed from: m */
        public static C11285b m20048m(int i, int i2) {
            return new C11285b(i, 1, 0, i2);
        }

        /* JADX INFO: renamed from: n */
        public static C11285b m20049n(int i, int i2) {
            return new C11285b(i, 2, 1, i2);
        }

        /* JADX INFO: renamed from: o */
        public static C11285b m20050o(int i, int i2) {
            return new C11285b(i, 2, 2, i2);
        }

        /* JADX INFO: renamed from: p */
        public static C11285b m20051p(int i, long j) {
            return new C11285b(i, 2, 3, j);
        }

        private static byte packedType(int i, int i2) {
            return (byte) (i | (i2 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int paddingBytes(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        /* JADX INFO: renamed from: q */
        public static C11285b m20052q(int i, int i2) {
            return new C11285b(i, 2, 0, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType() {
            return storedPackedType(0);
        }

        private int storedWidth(int i) {
            return o36.m18323g(this.f73110a) ? Math.max(this.f73111b, i) : this.f73111b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int elemWidth(int i, int i2, long j, int i3, int i4) {
            if (o36.m18323g(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int iM20035b = q36.m20035b((int) (((long) ((paddingBytes(i3, i5) + i3) + (i4 * i5))) - j));
                if ((1 << iM20035b) == i5) {
                    return iM20035b;
                }
            }
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType(int i) {
            return packedType(storedWidth(i), this.f73110a);
        }

        public C11285b(int i, int i2, int i3, double d) {
            this.f73114e = i;
            this.f73110a = i2;
            this.f73111b = i3;
            this.f73112c = d;
            this.f73113d = Long.MIN_VALUE;
        }
    }

    public q36(int i) {
        this(new b70(i), 1);
    }

    private int align(int i) {
        int i2 = 1 << i;
        int iPaddingBytes = C11285b.paddingBytes(this.f73101a.writePosition(), i2);
        while (true) {
            int i3 = iPaddingBytes - 1;
            if (iPaddingBytes == 0) {
                return i2;
            }
            this.f73101a.put((byte) 0);
            iPaddingBytes = i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m20035b(long j) {
        if (j <= o36.C10176j.m18332a((byte) -1)) {
            return 0;
        }
        if (j <= o36.C10176j.m18334c((short) -1)) {
            return 1;
        }
        return j <= o36.C10176j.m18333b(-1) ? 2 : 3;
    }

    private C11285b createKeyVector(int i, int i2) {
        long j = i2;
        int iMax = Math.max(0, m20035b(j));
        int i3 = i;
        while (i3 < this.f73102b.size()) {
            i3++;
            iMax = Math.max(iMax, C11285b.elemWidth(4, 0, this.f73102b.get(i3).f73114e, this.f73101a.writePosition(), i3));
        }
        int iAlign = align(iMax);
        writeInt(j, iAlign);
        int iWritePosition = this.f73101a.writePosition();
        while (i < this.f73102b.size()) {
            int i4 = this.f73102b.get(i).f73114e;
            writeOffset(this.f73102b.get(i).f73114e, iAlign);
            i++;
        }
        return new C11285b(-1, o36.m18326j(4, 0), iMax, iWritePosition);
    }

    private C11285b createVector(int i, int i2, int i3, boolean z, boolean z2, C11285b c11285b) {
        int i4;
        int iM18326j;
        int i5 = i3;
        long j = i5;
        int iMax = Math.max(0, m20035b(j));
        if (c11285b != null) {
            iMax = Math.max(iMax, c11285b.elemWidth(this.f73101a.writePosition(), 0));
            i4 = 3;
        } else {
            i4 = 1;
        }
        int i6 = 4;
        int iMax2 = iMax;
        for (int i7 = i2; i7 < this.f73102b.size(); i7++) {
            iMax2 = Math.max(iMax2, this.f73102b.get(i7).elemWidth(this.f73101a.writePosition(), i7 + i4));
            if (z && i7 == i2) {
                i6 = this.f73102b.get(i7).f73110a;
                if (!o36.m18325i(i6)) {
                    throw new o36.C10168b("TypedVector does not support this element type");
                }
            }
        }
        int i8 = i2;
        int iAlign = align(iMax2);
        if (c11285b != null) {
            writeOffset(c11285b.f73113d, iAlign);
            writeInt(1 << c11285b.f73111b, iAlign);
        }
        if (!z2) {
            writeInt(j, iAlign);
        }
        int iWritePosition = this.f73101a.writePosition();
        for (int i9 = i8; i9 < this.f73102b.size(); i9++) {
            writeAny(this.f73102b.get(i9), iAlign);
        }
        if (!z) {
            while (i8 < this.f73102b.size()) {
                this.f73101a.put(this.f73102b.get(i8).storedPackedType(iMax2));
                i8++;
            }
        }
        if (c11285b != null) {
            iM18326j = 9;
        } else if (z) {
            if (!z2) {
                i5 = 0;
            }
            iM18326j = o36.m18326j(i6, i5);
        } else {
            iM18326j = 10;
        }
        return new C11285b(i, iM18326j, iMax2, iWritePosition);
    }

    private int putKey(String str) {
        if (str == null) {
            return -1;
        }
        int iWritePosition = this.f73101a.writePosition();
        if ((this.f73105e & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f73101a.put(bytes, 0, bytes.length);
            this.f73101a.put((byte) 0);
            this.f73103c.put(str, Integer.valueOf(iWritePosition));
            return iWritePosition;
        }
        Integer num = this.f73103c.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f73101a.put(bytes2, 0, bytes2.length);
        this.f73101a.put((byte) 0);
        this.f73103c.put(str, Integer.valueOf(iWritePosition));
        return iWritePosition;
    }

    private void writeAny(C11285b c11285b, int i) {
        int i2 = c11285b.f73110a;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                writeDouble(c11285b.f73112c, i);
                return;
            } else if (i2 != 26) {
                writeOffset(c11285b.f73113d, i);
                return;
            }
        }
        writeInt(c11285b.f73113d, i);
    }

    private C11285b writeBlob(int i, byte[] bArr, int i2, boolean z) {
        int iM20035b = m20035b(bArr.length);
        writeInt(bArr.length, align(iM20035b));
        int iWritePosition = this.f73101a.writePosition();
        this.f73101a.put(bArr, 0, bArr.length);
        if (z) {
            this.f73101a.put((byte) 0);
        }
        return C11285b.m20041f(i, iWritePosition, i2, iM20035b);
    }

    private void writeDouble(double d, int i) {
        if (i == 4) {
            this.f73101a.putFloat((float) d);
        } else if (i == 8) {
            this.f73101a.putDouble(d);
        }
    }

    private void writeInt(long j, int i) {
        if (i == 1) {
            this.f73101a.put((byte) j);
            return;
        }
        if (i == 2) {
            this.f73101a.putShort((short) j);
        } else if (i == 4) {
            this.f73101a.putInt((int) j);
        } else {
            if (i != 8) {
                return;
            }
            this.f73101a.putLong(j);
        }
    }

    private void writeOffset(long j, int i) {
        writeInt((int) (((long) this.f73101a.writePosition()) - j), i);
    }

    private C11285b writeString(int i, String str) {
        return writeBlob(i, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public int endMap(String str, int i) {
        int iPutKey = putKey(str);
        ArrayList<C11285b> arrayList = this.f73102b;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.f73107g);
        C11285b c11285bCreateVector = createVector(iPutKey, i, this.f73102b.size() - i, false, false, createKeyVector(i, this.f73102b.size() - i));
        while (this.f73102b.size() > i) {
            this.f73102b.remove(r0.size() - 1);
        }
        this.f73102b.add(c11285bCreateVector);
        return (int) c11285bCreateVector.f73113d;
    }

    public int endVector(String str, int i, boolean z, boolean z2) {
        C11285b c11285bCreateVector = createVector(putKey(str), i, this.f73102b.size() - i, z, z2, null);
        while (this.f73102b.size() > i) {
            this.f73102b.remove(r10.size() - 1);
        }
        this.f73102b.add(c11285bCreateVector);
        return (int) c11285bCreateVector.f73113d;
    }

    public ByteBuffer finish() {
        int iAlign = align(this.f73102b.get(0).elemWidth(this.f73101a.writePosition(), 0));
        writeAny(this.f73102b.get(0), iAlign);
        this.f73101a.put(this.f73102b.get(0).storedPackedType());
        this.f73101a.put((byte) iAlign);
        this.f73106f = true;
        return ByteBuffer.wrap(this.f73101a.data(), 0, this.f73101a.writePosition());
    }

    public crd getBuffer() {
        return this.f73101a;
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public void putBoolean(boolean z) {
        putBoolean(null, z);
    }

    public void putFloat(float f) {
        putFloat((String) null, f);
    }

    public void putInt(int i) {
        putInt((String) null, i);
    }

    public int putString(String str) {
        return putString(null, str);
    }

    public void putUInt(int i) {
        putUInt(null, i);
    }

    public void putUInt64(BigInteger bigInteger) {
        putUInt64(null, bigInteger.longValue());
    }

    public int startMap() {
        return this.f73102b.size();
    }

    public int startVector() {
        return this.f73102b.size();
    }

    public q36() {
        this(256);
    }

    private void putUInt64(String str, long j) {
        this.f73102b.add(C11285b.m20051p(putKey(str), j));
    }

    public int putBlob(String str, byte[] bArr) {
        C11285b c11285bWriteBlob = writeBlob(putKey(str), bArr, 25, false);
        this.f73102b.add(c11285bWriteBlob);
        return (int) c11285bWriteBlob.f73113d;
    }

    public void putBoolean(String str, boolean z) {
        this.f73102b.add(C11285b.m20042g(putKey(str), z));
    }

    public void putFloat(String str, float f) {
        this.f73102b.add(C11285b.m20043h(putKey(str), f));
    }

    public void putInt(String str, int i) {
        putInt(str, i);
    }

    public int putString(String str, String str2) {
        int iPutKey = putKey(str);
        if ((this.f73105e & 2) == 0) {
            C11285b c11285bWriteString = writeString(iPutKey, str2);
            this.f73102b.add(c11285bWriteString);
            return (int) c11285bWriteString.f73113d;
        }
        Integer num = this.f73104d.get(str2);
        if (num != null) {
            this.f73102b.add(C11285b.m20041f(iPutKey, num.intValue(), 5, m20035b(str2.length())));
            return num.intValue();
        }
        C11285b c11285bWriteString2 = writeString(iPutKey, str2);
        this.f73104d.put(str2, Integer.valueOf((int) c11285bWriteString2.f73113d));
        this.f73102b.add(c11285bWriteString2);
        return (int) c11285bWriteString2.f73113d;
    }

    public void putUInt(long j) {
        putUInt(null, j);
    }

    @Deprecated
    public q36(ByteBuffer byteBuffer, int i) {
        this(new b70(byteBuffer.array()), i);
    }

    private void putUInt(String str, long j) {
        C11285b c11285bM20051p;
        int iPutKey = putKey(str);
        int iM20035b = m20035b(j);
        if (iM20035b == 0) {
            c11285bM20051p = C11285b.m20052q(iPutKey, (int) j);
        } else if (iM20035b == 1) {
            c11285bM20051p = C11285b.m20049n(iPutKey, (int) j);
        } else if (iM20035b == 2) {
            c11285bM20051p = C11285b.m20050o(iPutKey, (int) j);
        } else {
            c11285bM20051p = C11285b.m20051p(iPutKey, j);
        }
        this.f73102b.add(c11285bM20051p);
    }

    public void putFloat(double d) {
        putFloat((String) null, d);
    }

    public void putInt(String str, long j) {
        int iPutKey = putKey(str);
        if (-128 <= j && j <= 127) {
            this.f73102b.add(C11285b.m20048m(iPutKey, (int) j));
            return;
        }
        if (-32768 <= j && j <= 32767) {
            this.f73102b.add(C11285b.m20045j(iPutKey, (int) j));
        } else if (-2147483648L <= j && j <= 2147483647L) {
            this.f73102b.add(C11285b.m20046k(iPutKey, (int) j));
        } else {
            this.f73102b.add(C11285b.m20047l(iPutKey, j));
        }
    }

    public q36(crd crdVar, int i) {
        this.f73102b = new ArrayList<>();
        this.f73103c = new HashMap<>();
        this.f73104d = new HashMap<>();
        this.f73106f = false;
        this.f73107g = new C11284a();
        this.f73101a = crdVar;
        this.f73105e = i;
    }

    public void putFloat(String str, double d) {
        this.f73102b.add(C11285b.m20044i(putKey(str), d));
    }

    public void putInt(long j) {
        putInt((String) null, j);
    }

    public q36(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
