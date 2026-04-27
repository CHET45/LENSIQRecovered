package p000;

import java.nio.ByteBuffer;
import p000.ul3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class g6i extends ul3 {

    /* JADX INFO: renamed from: M1 */
    public static final int f38912M1 = 3;

    /* JADX INFO: renamed from: X */
    public static final int f38913X = 0;

    /* JADX INFO: renamed from: Y */
    public static final int f38914Y = 1;

    /* JADX INFO: renamed from: Z */
    public static final int f38915Z = 2;

    /* JADX INFO: renamed from: C */
    public int f38916C;

    /* JADX INFO: renamed from: F */
    @hib
    public kq6 f38917F;

    /* JADX INFO: renamed from: H */
    @hib
    public ByteBuffer[] f38918H;

    /* JADX INFO: renamed from: L */
    @hib
    public int[] f38919L;

    /* JADX INFO: renamed from: M */
    public int f38920M;

    /* JADX INFO: renamed from: N */
    @hib
    public ByteBuffer f38921N;

    /* JADX INFO: renamed from: Q */
    public final ul3.InterfaceC13578a<g6i> f38922Q;

    /* JADX INFO: renamed from: d */
    public int f38923d;

    /* JADX INFO: renamed from: e */
    public int f38924e;

    /* JADX INFO: renamed from: f */
    @hib
    public ByteBuffer f38925f;

    /* JADX INFO: renamed from: m */
    public int f38926m;

    public g6i(ul3.InterfaceC13578a<g6i> interfaceC13578a) {
        this.f38922Q = interfaceC13578a;
    }

    private static boolean isSafeToMultiply(int i, int i2) {
        return i >= 0 && i2 >= 0 && (i2 <= 0 || i < Integer.MAX_VALUE / i2);
    }

    public void init(long j, int i, @hib ByteBuffer byteBuffer) {
        this.f88311b = j;
        this.f38924e = i;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.f38921N = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f38921N;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.f38921N = ByteBuffer.allocate(iLimit);
        } else {
            this.f38921N.clear();
        }
        this.f38921N.put(byteBuffer);
        this.f38921N.flip();
        byteBuffer.position(0);
    }

    public void initForPrivateFrame(int i, int i2) {
        this.f38926m = i;
        this.f38916C = i2;
    }

    public boolean initForYuvFrame(int i, int i2, int i3, int i4, int i5) {
        this.f38926m = i;
        this.f38916C = i2;
        this.f38920M = i5;
        int i6 = (int) ((((long) i2) + 1) / 2);
        if (isSafeToMultiply(i3, i2) && isSafeToMultiply(i4, i6)) {
            int i7 = i2 * i3;
            int i8 = i6 * i4;
            int i9 = (i8 * 2) + i7;
            if (isSafeToMultiply(i8, 2) && i9 >= i7) {
                ByteBuffer byteBuffer = this.f38925f;
                if (byteBuffer == null || byteBuffer.capacity() < i9) {
                    this.f38925f = ByteBuffer.allocateDirect(i9);
                } else {
                    this.f38925f.position(0);
                    this.f38925f.limit(i9);
                }
                if (this.f38918H == null) {
                    this.f38918H = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f38925f;
                ByteBuffer[] byteBufferArr = this.f38918H;
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
                if (this.f38919L == null) {
                    this.f38919L = new int[3];
                }
                int[] iArr = this.f38919L;
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i4;
                return true;
            }
        }
        return false;
    }

    @Override // p000.ul3
    public void release() {
        this.f38922Q.releaseOutputBuffer(this);
    }
}
