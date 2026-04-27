package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class nl3 {

    /* JADX INFO: renamed from: a */
    public int f64828a;

    /* JADX INFO: renamed from: b */
    public int f64829b;

    /* JADX INFO: renamed from: c */
    public int f64830c;

    /* JADX INFO: renamed from: d */
    public int f64831d;

    /* JADX INFO: renamed from: e */
    public int f64832e;

    /* JADX INFO: renamed from: f */
    public int f64833f;

    /* JADX INFO: renamed from: g */
    public int f64834g;

    /* JADX INFO: renamed from: h */
    public int f64835h;

    /* JADX INFO: renamed from: i */
    public int f64836i;

    /* JADX INFO: renamed from: j */
    public int f64837j;

    /* JADX INFO: renamed from: k */
    public long f64838k;

    /* JADX INFO: renamed from: l */
    public int f64839l;

    private void addVideoFrameProcessingOffsets(long j, int i) {
        this.f64838k += j;
        this.f64839l += i;
    }

    public void addVideoFrameProcessingOffset(long j) {
        addVideoFrameProcessingOffsets(j, 1);
    }

    public synchronized void ensureUpdated() {
    }

    public void merge(nl3 nl3Var) {
        this.f64828a += nl3Var.f64828a;
        this.f64829b += nl3Var.f64829b;
        this.f64830c += nl3Var.f64830c;
        this.f64831d += nl3Var.f64831d;
        this.f64832e += nl3Var.f64832e;
        this.f64833f += nl3Var.f64833f;
        this.f64834g += nl3Var.f64834g;
        this.f64835h += nl3Var.f64835h;
        this.f64836i = Math.max(this.f64836i, nl3Var.f64836i);
        this.f64837j += nl3Var.f64837j;
        addVideoFrameProcessingOffsets(nl3Var.f64838k, nl3Var.f64839l);
    }

    public String toString() {
        return x0i.formatInvariant("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f64828a), Integer.valueOf(this.f64829b), Integer.valueOf(this.f64830c), Integer.valueOf(this.f64831d), Integer.valueOf(this.f64832e), Integer.valueOf(this.f64833f), Integer.valueOf(this.f64834g), Integer.valueOf(this.f64835h), Integer.valueOf(this.f64836i), Integer.valueOf(this.f64837j), Long.valueOf(this.f64838k), Integer.valueOf(this.f64839l));
    }
}
