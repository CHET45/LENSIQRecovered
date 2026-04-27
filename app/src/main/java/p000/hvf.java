package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p000.if0;

/* JADX INFO: loaded from: classes4.dex */
public class hvf implements if0 {

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final int f44988q = -1;

    /* JADX INFO: renamed from: r */
    public static final float f44989r = 1.0E-4f;

    /* JADX INFO: renamed from: s */
    public static final int f44990s = 1024;

    /* JADX INFO: renamed from: b */
    public int f44991b;

    /* JADX INFO: renamed from: c */
    public float f44992c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f44993d = 1.0f;

    /* JADX INFO: renamed from: e */
    public if0.C7262a f44994e;

    /* JADX INFO: renamed from: f */
    public if0.C7262a f44995f;

    /* JADX INFO: renamed from: g */
    public if0.C7262a f44996g;

    /* JADX INFO: renamed from: h */
    public if0.C7262a f44997h;

    /* JADX INFO: renamed from: i */
    public boolean f44998i;

    /* JADX INFO: renamed from: j */
    @hib
    public fvf f44999j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f45000k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f45001l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f45002m;

    /* JADX INFO: renamed from: n */
    public long f45003n;

    /* JADX INFO: renamed from: o */
    public long f45004o;

    /* JADX INFO: renamed from: p */
    public boolean f45005p;

    public hvf() {
        if0.C7262a c7262a = if0.C7262a.f46719e;
        this.f44994e = c7262a;
        this.f44995f = c7262a;
        this.f44996g = c7262a;
        this.f44997h = c7262a;
        ByteBuffer byteBuffer = if0.f46718a;
        this.f45000k = byteBuffer;
        this.f45001l = byteBuffer.asShortBuffer();
        this.f45002m = byteBuffer;
        this.f44991b = -1;
    }

    @Override // p000.if0
    @op1
    public final if0.C7262a configure(if0.C7262a c7262a) throws if0.C7263b {
        if (c7262a.f46722c != 2) {
            throw new if0.C7263b(c7262a);
        }
        int i = this.f44991b;
        if (i == -1) {
            i = c7262a.f46720a;
        }
        this.f44994e = c7262a;
        if0.C7262a c7262a2 = new if0.C7262a(i, c7262a.f46721b, 2);
        this.f44995f = c7262a2;
        this.f44998i = true;
        return c7262a2;
    }

    @Override // p000.if0
    public final void flush() {
        if (isActive()) {
            if0.C7262a c7262a = this.f44994e;
            this.f44996g = c7262a;
            if0.C7262a c7262a2 = this.f44995f;
            this.f44997h = c7262a2;
            if (this.f44998i) {
                this.f44999j = new fvf(c7262a.f46720a, c7262a.f46721b, this.f44992c, this.f44993d, c7262a2.f46720a);
            } else {
                fvf fvfVar = this.f44999j;
                if (fvfVar != null) {
                    fvfVar.flush();
                }
            }
        }
        this.f45002m = if0.f46718a;
        this.f45003n = 0L;
        this.f45004o = 0L;
        this.f45005p = false;
    }

    public final long getMediaDuration(long j) {
        if (this.f45004o < 1024) {
            return (long) (((double) this.f44992c) * j);
        }
        long pendingInputBytes = this.f45003n - ((long) ((fvf) u80.checkNotNull(this.f44999j)).getPendingInputBytes());
        int i = this.f44997h.f46720a;
        int i2 = this.f44996g.f46720a;
        return i == i2 ? x0i.scaleLargeTimestamp(j, pendingInputBytes, this.f45004o) : x0i.scaleLargeTimestamp(j, pendingInputBytes * ((long) i), this.f45004o * ((long) i2));
    }

    @Override // p000.if0
    public final ByteBuffer getOutput() {
        int outputSize;
        fvf fvfVar = this.f44999j;
        if (fvfVar != null && (outputSize = fvfVar.getOutputSize()) > 0) {
            if (this.f45000k.capacity() < outputSize) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(outputSize).order(ByteOrder.nativeOrder());
                this.f45000k = byteBufferOrder;
                this.f45001l = byteBufferOrder.asShortBuffer();
            } else {
                this.f45000k.clear();
                this.f45001l.clear();
            }
            fvfVar.getOutput(this.f45001l);
            this.f45004o += (long) outputSize;
            this.f45000k.limit(outputSize);
            this.f45002m = this.f45000k;
        }
        ByteBuffer byteBuffer = this.f45002m;
        this.f45002m = if0.f46718a;
        return byteBuffer;
    }

    @Override // p000.if0
    public final boolean isActive() {
        return this.f44995f.f46720a != -1 && (Math.abs(this.f44992c - 1.0f) >= 1.0E-4f || Math.abs(this.f44993d - 1.0f) >= 1.0E-4f || this.f44995f.f46720a != this.f44994e.f46720a);
    }

    @Override // p000.if0
    public final boolean isEnded() {
        fvf fvfVar;
        return this.f45005p && ((fvfVar = this.f44999j) == null || fvfVar.getOutputSize() == 0);
    }

    @Override // p000.if0
    public final void queueEndOfStream() {
        fvf fvfVar = this.f44999j;
        if (fvfVar != null) {
            fvfVar.queueEndOfStream();
        }
        this.f45005p = true;
    }

    @Override // p000.if0
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            fvf fvfVar = (fvf) u80.checkNotNull(this.f44999j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f45003n += (long) iRemaining;
            fvfVar.queueInput(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p000.if0
    public final void reset() {
        this.f44992c = 1.0f;
        this.f44993d = 1.0f;
        if0.C7262a c7262a = if0.C7262a.f46719e;
        this.f44994e = c7262a;
        this.f44995f = c7262a;
        this.f44996g = c7262a;
        this.f44997h = c7262a;
        ByteBuffer byteBuffer = if0.f46718a;
        this.f45000k = byteBuffer;
        this.f45001l = byteBuffer.asShortBuffer();
        this.f45002m = byteBuffer;
        this.f44991b = -1;
        this.f44998i = false;
        this.f44999j = null;
        this.f45003n = 0L;
        this.f45004o = 0L;
        this.f45005p = false;
    }

    public final void setOutputSampleRateHz(int i) {
        this.f44991b = i;
    }

    public final void setPitch(float f) {
        if (this.f44993d != f) {
            this.f44993d = f;
            this.f44998i = true;
        }
    }

    public final void setSpeed(float f) {
        if (this.f44992c != f) {
            this.f44992c = f;
            this.f44998i = true;
        }
    }
}
