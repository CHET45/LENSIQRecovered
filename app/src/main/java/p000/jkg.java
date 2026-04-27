package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class jkg {

    /* JADX INFO: renamed from: a */
    public int f51043a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f51044b;

    /* JADX INFO: renamed from: c */
    public int f51045c;

    /* JADX INFO: renamed from: d */
    public int f51046d;

    /* JADX INFO: renamed from: e */
    public mzh f51047e = mzh.getDefault();

    /* JADX INFO: renamed from: jkg$a */
    public class C7962a implements Comparator<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteBuffer f51048a;

        public C7962a(ByteBuffer byteBuffer) {
            this.f51048a = byteBuffer;
        }

        @Override // java.util.Comparator
        public int compare(Integer num, Integer num2) {
            return jkg.this.m14166q(num, num2, this.f51048a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m14150a(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static int m14151c(int i, ByteBuffer byteBuffer) {
        return i + byteBuffer.getInt(i);
    }

    /* JADX INFO: renamed from: e */
    public static int m14152e(int i, int i2, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + iCapacity) - byteBuffer.getInt(iCapacity)) + iCapacity;
    }

    /* JADX INFO: renamed from: h */
    public static String m14153h(int i, ByteBuffer byteBuffer, mzh mzhVar) {
        int i2 = i + byteBuffer.getInt(i);
        return mzhVar.decodeUtf8(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    /* JADX INFO: renamed from: j */
    public static jkg m14154j(jkg jkgVar, int i, ByteBuffer byteBuffer) {
        jkgVar.m14159f(m14151c(i, byteBuffer), byteBuffer);
        return jkgVar;
    }

    /* JADX INFO: renamed from: o */
    public static int m14155o(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = i + byteBuffer.getInt(i);
        int i4 = i2 + byteBuffer.getInt(i2);
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int iMin = Math.min(i5, i6);
        for (int i9 = 0; i9 < iMin; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    /* JADX INFO: renamed from: p */
    public static int m14156p(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int iMin = Math.min(i3, length);
        for (int i5 = 0; i5 < iMin; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    public void __reset() {
        m14159f(0, null);
    }

    /* JADX INFO: renamed from: b */
    public int m14157b(int i) {
        return i + this.f51044b.getInt(i);
    }

    /* JADX INFO: renamed from: d */
    public int m14158d(int i) {
        if (i < this.f51046d) {
            return this.f51044b.getShort(this.f51045c + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public void m14159f(int i, ByteBuffer byteBuffer) {
        this.f51044b = byteBuffer;
        if (byteBuffer == null) {
            this.f51043a = 0;
            this.f51045c = 0;
            this.f51046d = 0;
        } else {
            this.f51043a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f51045c = i2;
            this.f51046d = this.f51044b.getShort(i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public String m14160g(int i) {
        return m14153h(i, this.f51044b, this.f51047e);
    }

    public ByteBuffer getByteBuffer() {
        return this.f51044b;
    }

    /* JADX INFO: renamed from: i */
    public jkg m14161i(jkg jkgVar, int i) {
        return m14154j(jkgVar, i, this.f51044b);
    }

    /* JADX INFO: renamed from: k */
    public int m14162k(int i) {
        int i2 = i + this.f51043a;
        return i2 + this.f51044b.getInt(i2) + 4;
    }

    /* JADX INFO: renamed from: l */
    public ByteBuffer m14163l(int i, int i2) {
        int iM14158d = m14158d(i);
        if (iM14158d == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.f51044b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int iM14162k = m14162k(iM14158d);
        byteBufferOrder.position(iM14162k);
        byteBufferOrder.limit(iM14162k + (m14165n(iM14158d) * i2));
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: m */
    public ByteBuffer m14164m(ByteBuffer byteBuffer, int i, int i2) {
        int iM14158d = m14158d(i);
        if (iM14158d == 0) {
            return null;
        }
        int iM14162k = m14162k(iM14158d);
        byteBuffer.rewind();
        byteBuffer.limit((m14165n(iM14158d) * i2) + iM14162k);
        byteBuffer.position(iM14162k);
        return byteBuffer;
    }

    /* JADX INFO: renamed from: n */
    public int m14165n(int i) {
        int i2 = i + this.f51043a;
        return this.f51044b.getInt(i2 + this.f51044b.getInt(i2));
    }

    /* JADX INFO: renamed from: q */
    public int m14166q(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public void m14167r(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new C7962a(byteBuffer));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }
}
