package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class sl3 extends bf1 {

    /* JADX INFO: renamed from: H */
    public static final int f82155H = 0;

    /* JADX INFO: renamed from: L */
    public static final int f82156L = 1;

    /* JADX INFO: renamed from: M */
    public static final int f82157M = 2;

    /* JADX INFO: renamed from: C */
    public final int f82158C;

    /* JADX INFO: renamed from: F */
    public final int f82159F;

    /* JADX INFO: renamed from: b */
    @hib
    public kq6 f82160b;

    /* JADX INFO: renamed from: c */
    public final g93 f82161c;

    /* JADX INFO: renamed from: d */
    @hib
    public ByteBuffer f82162d;

    /* JADX INFO: renamed from: e */
    public boolean f82163e;

    /* JADX INFO: renamed from: f */
    public long f82164f;

    /* JADX INFO: renamed from: m */
    @hib
    public ByteBuffer f82165m;

    /* JADX INFO: renamed from: sl3$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12645a {
    }

    /* JADX INFO: renamed from: sl3$b */
    public static final class C12646b extends IllegalStateException {

        /* JADX INFO: renamed from: a */
        public final int f82166a;

        /* JADX INFO: renamed from: b */
        public final int f82167b;

        public C12646b(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + c0b.f15434d);
            this.f82166a = i;
            this.f82167b = i2;
        }
    }

    static {
        lf5.registerModule("goog.exo.decoder");
    }

    public sl3(int i) {
        this(i, 0);
    }

    private ByteBuffer createReplacementByteBuffer(int i) {
        int i2 = this.f82158C;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f82162d;
        throw new C12646b(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public static sl3 newNoDataInstance() {
        return new sl3(0);
    }

    @Override // p000.bf1
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f82162d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f82165m;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f82163e = false;
    }

    @z25({"data"})
    public void ensureSpaceForWrite(int i) {
        int i2 = i + this.f82159F;
        ByteBuffer byteBuffer = this.f82162d;
        if (byteBuffer == null) {
            this.f82162d = createReplacementByteBuffer(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f82162d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferCreateReplacementByteBuffer = createReplacementByteBuffer(i3);
        byteBufferCreateReplacementByteBuffer.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferCreateReplacementByteBuffer.put(byteBuffer);
        }
        this.f82162d = byteBufferCreateReplacementByteBuffer;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.f82162d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f82165m;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return m3089a(1073741824);
    }

    @z25({"supplementalData"})
    public void resetSupplementalData(int i) {
        ByteBuffer byteBuffer = this.f82165m;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f82165m = ByteBuffer.allocate(i);
        } else {
            this.f82165m.clear();
        }
    }

    public sl3(int i, int i2) {
        this.f82161c = new g93();
        this.f82158C = i;
        this.f82159F = i2;
    }
}
