package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ol3 {

    /* JADX INFO: renamed from: a */
    public int f68016a;

    /* JADX INFO: renamed from: b */
    public int f68017b;

    /* JADX INFO: renamed from: c */
    public int f68018c;

    /* JADX INFO: renamed from: d */
    public int f68019d;

    /* JADX INFO: renamed from: e */
    public int f68020e;

    /* JADX INFO: renamed from: f */
    public int f68021f;

    /* JADX INFO: renamed from: g */
    public int f68022g;

    /* JADX INFO: renamed from: h */
    public int f68023h;

    /* JADX INFO: renamed from: i */
    public int f68024i;

    /* JADX INFO: renamed from: j */
    public int f68025j;

    /* JADX INFO: renamed from: k */
    public long f68026k;

    /* JADX INFO: renamed from: l */
    public int f68027l;

    private void addVideoFrameProcessingOffsets(long j, int i) {
        this.f68026k += j;
        this.f68027l += i;
    }

    public void addVideoFrameProcessingOffset(long j) {
        addVideoFrameProcessingOffsets(j, 1);
    }

    public synchronized void ensureUpdated() {
    }

    public void merge(ol3 ol3Var) {
        this.f68016a += ol3Var.f68016a;
        this.f68017b += ol3Var.f68017b;
        this.f68018c += ol3Var.f68018c;
        this.f68019d += ol3Var.f68019d;
        this.f68020e += ol3Var.f68020e;
        this.f68021f += ol3Var.f68021f;
        this.f68022g += ol3Var.f68022g;
        this.f68023h += ol3Var.f68023h;
        this.f68024i = Math.max(this.f68024i, ol3Var.f68024i);
        this.f68025j += ol3Var.f68025j;
        addVideoFrameProcessingOffsets(ol3Var.f68026k, ol3Var.f68027l);
    }

    public String toString() {
        return t0i.formatInvariant("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f68016a), Integer.valueOf(this.f68017b), Integer.valueOf(this.f68018c), Integer.valueOf(this.f68019d), Integer.valueOf(this.f68020e), Integer.valueOf(this.f68021f), Integer.valueOf(this.f68022g), Integer.valueOf(this.f68023h), Integer.valueOf(this.f68024i), Integer.valueOf(this.f68025j), Long.valueOf(this.f68026k), Integer.valueOf(this.f68027l));
    }
}
