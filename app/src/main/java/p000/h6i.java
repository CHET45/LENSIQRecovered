package p000;

import androidx.media3.common.C1213a;
import java.nio.ByteBuffer;
import p000.tl3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class h6i extends tl3 {

    /* JADX INFO: renamed from: M1 */
    public static final int f42523M1 = 0;

    /* JADX INFO: renamed from: V1 */
    public static final int f42524V1 = 1;

    /* JADX INFO: renamed from: Z1 */
    public static final int f42525Z1 = 2;

    /* JADX INFO: renamed from: a2 */
    public static final int f42526a2 = 3;

    /* JADX INFO: renamed from: C */
    public int f42527C;

    /* JADX INFO: renamed from: F */
    public int f42528F;

    /* JADX INFO: renamed from: H */
    @hib
    public C1213a f42529H;

    /* JADX INFO: renamed from: L */
    @hib
    public ByteBuffer[] f42530L;

    /* JADX INFO: renamed from: M */
    @hib
    public int[] f42531M;

    /* JADX INFO: renamed from: N */
    public int f42532N;

    /* JADX INFO: renamed from: Q */
    public int f42533Q;

    /* JADX INFO: renamed from: X */
    public int f42534X;

    /* JADX INFO: renamed from: Y */
    @hib
    public ByteBuffer f42535Y;

    /* JADX INFO: renamed from: Z */
    public final tl3.InterfaceC13090a<h6i> f42536Z;

    /* JADX INFO: renamed from: e */
    public long f42537e;

    /* JADX INFO: renamed from: f */
    public int f42538f;

    /* JADX INFO: renamed from: m */
    @hib
    public ByteBuffer f42539m;

    public h6i(tl3.InterfaceC13090a<h6i> interfaceC13090a) {
        this.f42536Z = interfaceC13090a;
    }

    private static boolean isSafeToMultiply(int i, int i2) {
        return i >= 0 && i2 >= 0 && (i2 <= 0 || i < Integer.MAX_VALUE / i2);
    }

    public void init(long j, int i, @hib ByteBuffer byteBuffer) {
        this.f85177b = j;
        this.f42538f = i;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.f42535Y = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f42535Y;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.f42535Y = ByteBuffer.allocate(iLimit);
        } else {
            this.f42535Y.clear();
        }
        this.f42535Y.put(byteBuffer);
        this.f42535Y.flip();
        byteBuffer.position(0);
    }

    public boolean initForOffsetFrames(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.f42530L == null) {
            this.f42530L = new ByteBuffer[3];
        }
        ByteBuffer byteBuffer = this.f42539m;
        if (byteBuffer == null) {
            return false;
        }
        this.f42527C = i2;
        this.f42528F = i3;
        this.f42532N = i6;
        ByteBuffer[] byteBufferArr = this.f42530L;
        int i8 = i4 * i3;
        int i9 = (i3 >> 1) * i5;
        int i10 = i4 * i7;
        byteBuffer.position(i);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferArr[0] = byteBufferSlice;
        byteBufferSlice.limit(i8);
        byteBuffer.position(i10 + i);
        ByteBuffer byteBufferSlice2 = byteBuffer.slice();
        byteBufferArr[1] = byteBufferSlice2;
        byteBufferSlice2.limit(i9);
        byteBuffer.position(i10 + ((i7 >> 1) * i5) + i);
        ByteBuffer byteBufferSlice3 = byteBuffer.slice();
        byteBufferArr[2] = byteBufferSlice3;
        byteBufferSlice3.limit(i9);
        if (this.f42531M == null) {
            this.f42531M = new int[3];
        }
        int[] iArr = this.f42531M;
        iArr[0] = i4;
        iArr[1] = i5;
        iArr[2] = i5;
        return true;
    }

    public void initForPrivateFrame(int i, int i2) {
        this.f42527C = i;
        this.f42528F = i2;
    }

    public boolean initForYuvFrame(int i, int i2, int i3, int i4, int i5) {
        this.f42527C = i;
        this.f42528F = i2;
        this.f42532N = i5;
        this.f42533Q = i3;
        this.f42534X = i4;
        int i6 = (int) ((((long) i2) + 1) / 2);
        if (isSafeToMultiply(i3, i2) && isSafeToMultiply(i4, i6)) {
            int i7 = i2 * i3;
            int i8 = i6 * i4;
            int i9 = (i8 * 2) + i7;
            if (isSafeToMultiply(i8, 2) && i9 >= i7) {
                ByteBuffer byteBuffer = this.f42539m;
                if (byteBuffer == null || byteBuffer.capacity() < i9) {
                    this.f42539m = ByteBuffer.allocateDirect(i9);
                } else {
                    this.f42539m.position(0);
                    this.f42539m.limit(i9);
                }
                if (this.f42530L == null) {
                    this.f42530L = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f42539m;
                ByteBuffer[] byteBufferArr = this.f42530L;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i7);
                byteBuffer2.position(i7);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i8);
                byteBuffer2.position(i7 + i8);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i8);
                if (this.f42531M == null) {
                    this.f42531M = new int[3];
                }
                int[] iArr = this.f42531M;
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i4;
                return true;
            }
        }
        return false;
    }

    @Override // p000.tl3
    public void release() {
        this.f42536Z.releaseOutputBuffer(this);
    }
}
