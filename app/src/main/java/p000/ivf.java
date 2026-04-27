package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ivf implements hf0 {

    /* JADX INFO: renamed from: r */
    public static final int f48613r = -1;

    /* JADX INFO: renamed from: s */
    public static final float f48614s = 1.0E-4f;

    /* JADX INFO: renamed from: t */
    public static final int f48615t = 1024;

    /* JADX INFO: renamed from: b */
    public final boolean f48616b;

    /* JADX INFO: renamed from: c */
    public int f48617c;

    /* JADX INFO: renamed from: d */
    public float f48618d;

    /* JADX INFO: renamed from: e */
    public float f48619e;

    /* JADX INFO: renamed from: f */
    public hf0.C6832a f48620f;

    /* JADX INFO: renamed from: g */
    public hf0.C6832a f48621g;

    /* JADX INFO: renamed from: h */
    public hf0.C6832a f48622h;

    /* JADX INFO: renamed from: i */
    public hf0.C6832a f48623i;

    /* JADX INFO: renamed from: j */
    public boolean f48624j;

    /* JADX INFO: renamed from: k */
    @hib
    public gvf f48625k;

    /* JADX INFO: renamed from: l */
    public ByteBuffer f48626l;

    /* JADX INFO: renamed from: m */
    public ShortBuffer f48627m;

    /* JADX INFO: renamed from: n */
    public ByteBuffer f48628n;

    /* JADX INFO: renamed from: o */
    public long f48629o;

    /* JADX INFO: renamed from: p */
    public long f48630p;

    /* JADX INFO: renamed from: q */
    public boolean f48631q;

    public ivf() {
        this(false);
    }

    private boolean areParametersSetToDefaultValues() {
        return Math.abs(this.f48618d - 1.0f) < 1.0E-4f && Math.abs(this.f48619e - 1.0f) < 1.0E-4f && this.f48621g.f43350a == this.f48620f.f43350a;
    }

    @Override // p000.hf0
    public hf0.C6832a configure(hf0.C6832a c6832a) throws hf0.C6833b {
        if (c6832a.f43352c != 2) {
            throw new hf0.C6833b(c6832a);
        }
        int i = this.f48617c;
        if (i == -1) {
            i = c6832a.f43350a;
        }
        this.f48620f = c6832a;
        hf0.C6832a c6832a2 = new hf0.C6832a(i, c6832a.f43351b, 2);
        this.f48621g = c6832a2;
        this.f48624j = true;
        return c6832a2;
    }

    @Override // p000.hf0
    public void flush() {
        if (isActive()) {
            hf0.C6832a c6832a = this.f48620f;
            this.f48622h = c6832a;
            hf0.C6832a c6832a2 = this.f48621g;
            this.f48623i = c6832a2;
            if (this.f48624j) {
                this.f48625k = new gvf(c6832a.f43350a, c6832a.f43351b, this.f48618d, this.f48619e, c6832a2.f43350a);
            } else {
                gvf gvfVar = this.f48625k;
                if (gvfVar != null) {
                    gvfVar.flush();
                }
            }
        }
        this.f48628n = hf0.f43348a;
        this.f48629o = 0L;
        this.f48630p = 0L;
        this.f48631q = false;
    }

    @Override // p000.hf0
    public long getDurationAfterProcessorApplied(long j) {
        return getPlayoutDuration(j);
    }

    public long getMediaDuration(long j) {
        if (this.f48630p < 1024) {
            return (long) (((double) this.f48618d) * j);
        }
        long pendingInputBytes = this.f48629o - ((long) ((gvf) v80.checkNotNull(this.f48625k)).getPendingInputBytes());
        int i = this.f48623i.f43350a;
        int i2 = this.f48622h.f43350a;
        return i == i2 ? t0i.scaleLargeTimestamp(j, pendingInputBytes, this.f48630p) : t0i.scaleLargeTimestamp(j, pendingInputBytes * ((long) i), this.f48630p * ((long) i2));
    }

    @Override // p000.hf0
    public ByteBuffer getOutput() {
        int outputSize;
        gvf gvfVar = this.f48625k;
        if (gvfVar != null && (outputSize = gvfVar.getOutputSize()) > 0) {
            if (this.f48626l.capacity() < outputSize) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(outputSize).order(ByteOrder.nativeOrder());
                this.f48626l = byteBufferOrder;
                this.f48627m = byteBufferOrder.asShortBuffer();
            } else {
                this.f48626l.clear();
                this.f48627m.clear();
            }
            gvfVar.getOutput(this.f48627m);
            this.f48630p += (long) outputSize;
            this.f48626l.limit(outputSize);
            this.f48628n = this.f48626l;
        }
        ByteBuffer byteBuffer = this.f48628n;
        this.f48628n = hf0.f43348a;
        return byteBuffer;
    }

    public long getPlayoutDuration(long j) {
        if (this.f48630p < 1024) {
            return (long) (j / ((double) this.f48618d));
        }
        long pendingInputBytes = this.f48629o - ((long) ((gvf) v80.checkNotNull(this.f48625k)).getPendingInputBytes());
        int i = this.f48623i.f43350a;
        int i2 = this.f48622h.f43350a;
        return i == i2 ? t0i.scaleLargeTimestamp(j, this.f48630p, pendingInputBytes) : t0i.scaleLargeTimestamp(j, this.f48630p * ((long) i2), pendingInputBytes * ((long) i));
    }

    public long getProcessedInputBytes() {
        return this.f48629o - ((long) ((gvf) v80.checkNotNull(this.f48625k)).getPendingInputBytes());
    }

    @Override // p000.hf0
    public boolean isActive() {
        return this.f48621g.f43350a != -1 && (this.f48616b || !areParametersSetToDefaultValues());
    }

    @Override // p000.hf0
    public boolean isEnded() {
        gvf gvfVar;
        return this.f48631q && ((gvfVar = this.f48625k) == null || gvfVar.getOutputSize() == 0);
    }

    @Override // p000.hf0
    public void queueEndOfStream() {
        gvf gvfVar = this.f48625k;
        if (gvfVar != null) {
            gvfVar.queueEndOfStream();
        }
        this.f48631q = true;
    }

    @Override // p000.hf0
    public void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            gvf gvfVar = (gvf) v80.checkNotNull(this.f48625k);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f48629o += (long) iRemaining;
            gvfVar.queueInput(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p000.hf0
    public void reset() {
        this.f48618d = 1.0f;
        this.f48619e = 1.0f;
        hf0.C6832a c6832a = hf0.C6832a.f43349e;
        this.f48620f = c6832a;
        this.f48621g = c6832a;
        this.f48622h = c6832a;
        this.f48623i = c6832a;
        ByteBuffer byteBuffer = hf0.f43348a;
        this.f48626l = byteBuffer;
        this.f48627m = byteBuffer.asShortBuffer();
        this.f48628n = byteBuffer;
        this.f48617c = -1;
        this.f48624j = false;
        this.f48625k = null;
        this.f48629o = 0L;
        this.f48630p = 0L;
        this.f48631q = false;
    }

    public void setOutputSampleRateHz(int i) {
        v80.checkArgument(i == -1 || i > 0);
        this.f48617c = i;
    }

    public void setPitch(@y46(from = 0.0d, fromInclusive = false) float f) {
        v80.checkArgument(f > 0.0f);
        if (this.f48619e != f) {
            this.f48619e = f;
            this.f48624j = true;
        }
    }

    public void setSpeed(@y46(from = 0.0d, fromInclusive = false) float f) {
        v80.checkArgument(f > 0.0f);
        if (this.f48618d != f) {
            this.f48618d = f;
            this.f48624j = true;
        }
    }

    public ivf(boolean z) {
        this.f48618d = 1.0f;
        this.f48619e = 1.0f;
        hf0.C6832a c6832a = hf0.C6832a.f43349e;
        this.f48620f = c6832a;
        this.f48621g = c6832a;
        this.f48622h = c6832a;
        this.f48623i = c6832a;
        ByteBuffer byteBuffer = hf0.f43348a;
        this.f48626l = byteBuffer;
        this.f48627m = byteBuffer.asShortBuffer();
        this.f48628n = byteBuffer;
        this.f48617c = -1;
        this.f48616b = z;
    }
}
