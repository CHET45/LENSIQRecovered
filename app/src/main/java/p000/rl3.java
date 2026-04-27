package p000;

import androidx.media3.common.C1213a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class rl3 extends cf1 {

    /* JADX INFO: renamed from: H */
    public static final int f78601H = 0;

    /* JADX INFO: renamed from: L */
    public static final int f78602L = 1;

    /* JADX INFO: renamed from: M */
    public static final int f78603M = 2;

    /* JADX INFO: renamed from: C */
    public final int f78604C;

    /* JADX INFO: renamed from: F */
    public final int f78605F;

    /* JADX INFO: renamed from: b */
    @hib
    public C1213a f78606b;

    /* JADX INFO: renamed from: c */
    public final f93 f78607c;

    /* JADX INFO: renamed from: d */
    @hib
    public ByteBuffer f78608d;

    /* JADX INFO: renamed from: e */
    public boolean f78609e;

    /* JADX INFO: renamed from: f */
    public long f78610f;

    /* JADX INFO: renamed from: m */
    @hib
    public ByteBuffer f78611m;

    /* JADX INFO: renamed from: rl3$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12141a {
    }

    /* JADX INFO: renamed from: rl3$b */
    public static final class C12142b extends IllegalStateException {

        /* JADX INFO: renamed from: a */
        public final int f78612a;

        /* JADX INFO: renamed from: b */
        public final int f78613b;

        public C12142b(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + c0b.f15434d);
            this.f78612a = i;
            this.f78613b = i2;
        }
    }

    static {
        dga.registerModule("media3.decoder");
    }

    public rl3(int i) {
        this(i, 0);
    }

    private ByteBuffer createReplacementByteBuffer(int i) {
        int i2 = this.f78604C;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f78608d;
        throw new C12142b(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public static rl3 newNoDataInstance() {
        return new rl3(0);
    }

    @Override // p000.cf1
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f78608d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f78611m;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f78609e = false;
    }

    @z25({"data"})
    public void ensureSpaceForWrite(int i) {
        int i2 = i + this.f78605F;
        ByteBuffer byteBuffer = this.f78608d;
        if (byteBuffer == null) {
            this.f78608d = createReplacementByteBuffer(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f78608d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferCreateReplacementByteBuffer = createReplacementByteBuffer(i3);
        byteBufferCreateReplacementByteBuffer.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferCreateReplacementByteBuffer.put(byteBuffer);
        }
        this.f78608d = byteBufferCreateReplacementByteBuffer;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.f78608d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f78611m;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return m3932a(1073741824);
    }

    @z25({"supplementalData"})
    public void resetSupplementalData(int i) {
        ByteBuffer byteBuffer = this.f78611m;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f78611m = ByteBuffer.allocate(i);
        } else {
            this.f78611m.clear();
        }
    }

    public rl3(int i, int i2) {
        this.f78607c = new f93();
        this.f78604C = i;
        this.f78605F = i2;
    }
}
