package p000;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import p000.n36;

/* JADX INFO: loaded from: classes3.dex */
public class p36 {

    /* JADX INFO: renamed from: h */
    public static final int f69553h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f69554i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f69555j = 2;

    /* JADX INFO: renamed from: k */
    public static final int f69556k = 3;

    /* JADX INFO: renamed from: l */
    public static final int f69557l = 4;

    /* JADX INFO: renamed from: m */
    public static final int f69558m = 7;

    /* JADX INFO: renamed from: n */
    public static final int f69559n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f69560o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f69561p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f69562q = 3;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ boolean f69563r = false;

    /* JADX INFO: renamed from: a */
    public final drd f69564a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<C10781b> f69565b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, Integer> f69566c;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, Integer> f69567d;

    /* JADX INFO: renamed from: e */
    public final int f69568e;

    /* JADX INFO: renamed from: f */
    public boolean f69569f;

    /* JADX INFO: renamed from: g */
    public Comparator<C10781b> f69570g;

    /* JADX INFO: renamed from: p36$a */
    public class C10780a implements Comparator<C10781b> {
        public C10780a() {
        }

        @Override // java.util.Comparator
        public int compare(C10781b c10781b, C10781b c10781b2) {
            byte b;
            byte b2;
            int i = c10781b.f69577e;
            int i2 = c10781b2.f69577e;
            do {
                b = p36.this.f69564a.get(i);
                b2 = p36.this.f69564a.get(i2);
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
            } while (b == b2);
            return b - b2;
        }
    }

    /* JADX INFO: renamed from: p36$b */
    public static class C10781b {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ boolean f69572f = false;

        /* JADX INFO: renamed from: a */
        public final int f69573a;

        /* JADX INFO: renamed from: b */
        public final int f69574b;

        /* JADX INFO: renamed from: c */
        public final double f69575c;

        /* JADX INFO: renamed from: d */
        public long f69576d;

        /* JADX INFO: renamed from: e */
        public int f69577e;

        public C10781b(int i, int i2, int i3, long j) {
            this.f69577e = i;
            this.f69573a = i2;
            this.f69574b = i3;
            this.f69576d = j;
            this.f69575c = Double.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int elemWidth(int i, int i2) {
            return elemWidth(this.f69573a, this.f69574b, this.f69576d, i, i2);
        }

        /* JADX INFO: renamed from: f */
        public static C10781b m19239f(int i, int i2, int i3, int i4) {
            return new C10781b(i, i3, i4, i2);
        }

        /* JADX INFO: renamed from: g */
        public static C10781b m19240g(int i, boolean z) {
            return new C10781b(i, 26, 0, z ? 1L : 0L);
        }

        /* JADX INFO: renamed from: h */
        public static C10781b m19241h(int i, float f) {
            return new C10781b(i, 3, 2, f);
        }

        /* JADX INFO: renamed from: i */
        public static C10781b m19242i(int i, double d) {
            return new C10781b(i, 3, 3, d);
        }

        /* JADX INFO: renamed from: j */
        public static C10781b m19243j(int i, int i2) {
            return new C10781b(i, 1, 1, i2);
        }

        /* JADX INFO: renamed from: k */
        public static C10781b m19244k(int i, int i2) {
            return new C10781b(i, 1, 2, i2);
        }

        /* JADX INFO: renamed from: l */
        public static C10781b m19245l(int i, long j) {
            return new C10781b(i, 1, 3, j);
        }

        /* JADX INFO: renamed from: m */
        public static C10781b m19246m(int i, int i2) {
            return new C10781b(i, 1, 0, i2);
        }

        /* JADX INFO: renamed from: n */
        public static C10781b m19247n(int i, int i2) {
            return new C10781b(i, 2, 1, i2);
        }

        /* JADX INFO: renamed from: o */
        public static C10781b m19248o(int i, int i2) {
            return new C10781b(i, 2, 2, i2);
        }

        /* JADX INFO: renamed from: p */
        public static C10781b m19249p(int i, long j) {
            return new C10781b(i, 2, 3, j);
        }

        private static byte packedType(int i, int i2) {
            return (byte) (i | (i2 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int paddingBytes(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        /* JADX INFO: renamed from: q */
        public static C10781b m19250q(int i, int i2) {
            return new C10781b(i, 2, 0, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType() {
            return storedPackedType(0);
        }

        private int storedWidth(int i) {
            return n36.m17750g(this.f69573a) ? Math.max(this.f69574b, i) : this.f69574b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int elemWidth(int i, int i2, long j, int i3, int i4) {
            if (n36.m17750g(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int iM19233b = p36.m19233b((int) (((long) ((paddingBytes(i3, i5) + i3) + (i4 * i5))) - j));
                if ((1 << iM19233b) == i5) {
                    return iM19233b;
                }
            }
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType(int i) {
            return packedType(storedWidth(i), this.f69573a);
        }

        public C10781b(int i, int i2, int i3, double d) {
            this.f69577e = i;
            this.f69573a = i2;
            this.f69574b = i3;
            this.f69575c = d;
            this.f69576d = Long.MIN_VALUE;
        }
    }

    public p36(int i) {
        this(new c70(i), 1);
    }

    private int align(int i) {
        int i2 = 1 << i;
        int iPaddingBytes = C10781b.paddingBytes(this.f69564a.writePosition(), i2);
        while (true) {
            int i3 = iPaddingBytes - 1;
            if (iPaddingBytes == 0) {
                return i2;
            }
            this.f69564a.put((byte) 0);
            iPaddingBytes = i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m19233b(long j) {
        if (j <= n36.C9677j.m17759a((byte) -1)) {
            return 0;
        }
        if (j <= n36.C9677j.m17761c((short) -1)) {
            return 1;
        }
        return j <= n36.C9677j.m17760b(-1) ? 2 : 3;
    }

    private C10781b createKeyVector(int i, int i2) {
        long j = i2;
        int iMax = Math.max(0, m19233b(j));
        int i3 = i;
        while (i3 < this.f69565b.size()) {
            i3++;
            iMax = Math.max(iMax, C10781b.elemWidth(4, 0, this.f69565b.get(i3).f69577e, this.f69564a.writePosition(), i3));
        }
        int iAlign = align(iMax);
        writeInt(j, iAlign);
        int iWritePosition = this.f69564a.writePosition();
        while (i < this.f69565b.size()) {
            int i4 = this.f69565b.get(i).f69577e;
            writeOffset(this.f69565b.get(i).f69577e, iAlign);
            i++;
        }
        return new C10781b(-1, n36.m17753j(4, 0), iMax, iWritePosition);
    }

    private C10781b createVector(int i, int i2, int i3, boolean z, boolean z2, C10781b c10781b) {
        int i4;
        int iM17753j;
        int i5 = i3;
        long j = i5;
        int iMax = Math.max(0, m19233b(j));
        if (c10781b != null) {
            iMax = Math.max(iMax, c10781b.elemWidth(this.f69564a.writePosition(), 0));
            i4 = 3;
        } else {
            i4 = 1;
        }
        int i6 = 4;
        int iMax2 = iMax;
        for (int i7 = i2; i7 < this.f69565b.size(); i7++) {
            iMax2 = Math.max(iMax2, this.f69565b.get(i7).elemWidth(this.f69564a.writePosition(), i7 + i4));
            if (z && i7 == i2) {
                i6 = this.f69565b.get(i7).f69573a;
                if (!n36.m17752i(i6)) {
                    throw new n36.C9669b("TypedVector does not support this element type");
                }
            }
        }
        int i8 = i2;
        int iAlign = align(iMax2);
        if (c10781b != null) {
            writeOffset(c10781b.f69576d, iAlign);
            writeInt(1 << c10781b.f69574b, iAlign);
        }
        if (!z2) {
            writeInt(j, iAlign);
        }
        int iWritePosition = this.f69564a.writePosition();
        for (int i9 = i8; i9 < this.f69565b.size(); i9++) {
            writeAny(this.f69565b.get(i9), iAlign);
        }
        if (!z) {
            while (i8 < this.f69565b.size()) {
                this.f69564a.put(this.f69565b.get(i8).storedPackedType(iMax2));
                i8++;
            }
        }
        if (c10781b != null) {
            iM17753j = 9;
        } else if (z) {
            if (!z2) {
                i5 = 0;
            }
            iM17753j = n36.m17753j(i6, i5);
        } else {
            iM17753j = 10;
        }
        return new C10781b(i, iM17753j, iMax2, iWritePosition);
    }

    private int putKey(String str) {
        if (str == null) {
            return -1;
        }
        int iWritePosition = this.f69564a.writePosition();
        if ((this.f69568e & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f69564a.put(bytes, 0, bytes.length);
            this.f69564a.put((byte) 0);
            this.f69566c.put(str, Integer.valueOf(iWritePosition));
            return iWritePosition;
        }
        Integer num = this.f69566c.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f69564a.put(bytes2, 0, bytes2.length);
        this.f69564a.put((byte) 0);
        this.f69566c.put(str, Integer.valueOf(iWritePosition));
        return iWritePosition;
    }

    private void writeAny(C10781b c10781b, int i) {
        int i2 = c10781b.f69573a;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                writeDouble(c10781b.f69575c, i);
                return;
            } else if (i2 != 26) {
                writeOffset(c10781b.f69576d, i);
                return;
            }
        }
        writeInt(c10781b.f69576d, i);
    }

    private C10781b writeBlob(int i, byte[] bArr, int i2, boolean z) {
        int iM19233b = m19233b(bArr.length);
        writeInt(bArr.length, align(iM19233b));
        int iWritePosition = this.f69564a.writePosition();
        this.f69564a.put(bArr, 0, bArr.length);
        if (z) {
            this.f69564a.put((byte) 0);
        }
        return C10781b.m19239f(i, iWritePosition, i2, iM19233b);
    }

    private void writeDouble(double d, int i) {
        if (i == 4) {
            this.f69564a.putFloat((float) d);
        } else if (i == 8) {
            this.f69564a.putDouble(d);
        }
    }

    private void writeInt(long j, int i) {
        if (i == 1) {
            this.f69564a.put((byte) j);
            return;
        }
        if (i == 2) {
            this.f69564a.putShort((short) j);
        } else if (i == 4) {
            this.f69564a.putInt((int) j);
        } else {
            if (i != 8) {
                return;
            }
            this.f69564a.putLong(j);
        }
    }

    private void writeOffset(long j, int i) {
        writeInt((int) (((long) this.f69564a.writePosition()) - j), i);
    }

    private C10781b writeString(int i, String str) {
        return writeBlob(i, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public int endMap(String str, int i) {
        int iPutKey = putKey(str);
        ArrayList<C10781b> arrayList = this.f69565b;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.f69570g);
        C10781b c10781bCreateVector = createVector(iPutKey, i, this.f69565b.size() - i, false, false, createKeyVector(i, this.f69565b.size() - i));
        while (this.f69565b.size() > i) {
            this.f69565b.remove(r0.size() - 1);
        }
        this.f69565b.add(c10781bCreateVector);
        return (int) c10781bCreateVector.f69576d;
    }

    public int endVector(String str, int i, boolean z, boolean z2) {
        C10781b c10781bCreateVector = createVector(putKey(str), i, this.f69565b.size() - i, z, z2, null);
        while (this.f69565b.size() > i) {
            this.f69565b.remove(r10.size() - 1);
        }
        this.f69565b.add(c10781bCreateVector);
        return (int) c10781bCreateVector.f69576d;
    }

    public ByteBuffer finish() {
        int iAlign = align(this.f69565b.get(0).elemWidth(this.f69564a.writePosition(), 0));
        writeAny(this.f69565b.get(0), iAlign);
        this.f69564a.put(this.f69565b.get(0).storedPackedType());
        this.f69564a.put((byte) iAlign);
        this.f69569f = true;
        return ByteBuffer.wrap(this.f69564a.data(), 0, this.f69564a.writePosition());
    }

    public drd getBuffer() {
        return this.f69564a;
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
        return this.f69565b.size();
    }

    public int startVector() {
        return this.f69565b.size();
    }

    public p36() {
        this(256);
    }

    private void putUInt64(String str, long j) {
        this.f69565b.add(C10781b.m19249p(putKey(str), j));
    }

    public int putBlob(String str, byte[] bArr) {
        C10781b c10781bWriteBlob = writeBlob(putKey(str), bArr, 25, false);
        this.f69565b.add(c10781bWriteBlob);
        return (int) c10781bWriteBlob.f69576d;
    }

    public void putBoolean(String str, boolean z) {
        this.f69565b.add(C10781b.m19240g(putKey(str), z));
    }

    public void putFloat(String str, float f) {
        this.f69565b.add(C10781b.m19241h(putKey(str), f));
    }

    public void putInt(String str, int i) {
        putInt(str, i);
    }

    public int putString(String str, String str2) {
        int iPutKey = putKey(str);
        if ((this.f69568e & 2) == 0) {
            C10781b c10781bWriteString = writeString(iPutKey, str2);
            this.f69565b.add(c10781bWriteString);
            return (int) c10781bWriteString.f69576d;
        }
        Integer num = this.f69567d.get(str2);
        if (num != null) {
            this.f69565b.add(C10781b.m19239f(iPutKey, num.intValue(), 5, m19233b(str2.length())));
            return num.intValue();
        }
        C10781b c10781bWriteString2 = writeString(iPutKey, str2);
        this.f69567d.put(str2, Integer.valueOf((int) c10781bWriteString2.f69576d));
        this.f69565b.add(c10781bWriteString2);
        return (int) c10781bWriteString2.f69576d;
    }

    public void putUInt(long j) {
        putUInt(null, j);
    }

    @Deprecated
    public p36(ByteBuffer byteBuffer, int i) {
        this(new c70(byteBuffer.array()), i);
    }

    private void putUInt(String str, long j) {
        C10781b c10781bM19249p;
        int iPutKey = putKey(str);
        int iM19233b = m19233b(j);
        if (iM19233b == 0) {
            c10781bM19249p = C10781b.m19250q(iPutKey, (int) j);
        } else if (iM19233b == 1) {
            c10781bM19249p = C10781b.m19247n(iPutKey, (int) j);
        } else if (iM19233b == 2) {
            c10781bM19249p = C10781b.m19248o(iPutKey, (int) j);
        } else {
            c10781bM19249p = C10781b.m19249p(iPutKey, j);
        }
        this.f69565b.add(c10781bM19249p);
    }

    public void putFloat(double d) {
        putFloat((String) null, d);
    }

    public void putInt(String str, long j) {
        int iPutKey = putKey(str);
        if (-128 <= j && j <= 127) {
            this.f69565b.add(C10781b.m19246m(iPutKey, (int) j));
            return;
        }
        if (-32768 <= j && j <= 32767) {
            this.f69565b.add(C10781b.m19243j(iPutKey, (int) j));
        } else if (-2147483648L <= j && j <= 2147483647L) {
            this.f69565b.add(C10781b.m19244k(iPutKey, (int) j));
        } else {
            this.f69565b.add(C10781b.m19245l(iPutKey, j));
        }
    }

    public p36(drd drdVar, int i) {
        this.f69565b = new ArrayList<>();
        this.f69566c = new HashMap<>();
        this.f69567d = new HashMap<>();
        this.f69569f = false;
        this.f69570g = new C10780a();
        this.f69564a = drdVar;
        this.f69568e = i;
    }

    public void putFloat(String str, double d) {
        this.f69565b.add(C10781b.m19242i(putKey(str), d));
    }

    public void putInt(long j) {
        putInt((String) null, j);
    }

    public p36(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
