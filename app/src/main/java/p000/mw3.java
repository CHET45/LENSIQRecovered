package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class mw3 implements gc9 {

    /* JADX INFO: renamed from: A */
    public static final int f62505A = 144310272;

    /* JADX INFO: renamed from: B */
    public static final int f62506B = 13107200;

    /* JADX INFO: renamed from: m */
    public static final int f62507m = 50000;

    /* JADX INFO: renamed from: n */
    public static final int f62508n = 50000;

    /* JADX INFO: renamed from: o */
    public static final int f62509o = 2500;

    /* JADX INFO: renamed from: p */
    public static final int f62510p = 5000;

    /* JADX INFO: renamed from: q */
    public static final int f62511q = -1;

    /* JADX INFO: renamed from: r */
    public static final boolean f62512r = false;

    /* JADX INFO: renamed from: s */
    public static final int f62513s = 0;

    /* JADX INFO: renamed from: t */
    public static final boolean f62514t = false;

    /* JADX INFO: renamed from: u */
    public static final int f62515u = 131072000;

    /* JADX INFO: renamed from: v */
    public static final int f62516v = 13107200;

    /* JADX INFO: renamed from: w */
    public static final int f62517w = 131072;

    /* JADX INFO: renamed from: x */
    public static final int f62518x = 131072;

    /* JADX INFO: renamed from: y */
    public static final int f62519y = 131072;

    /* JADX INFO: renamed from: z */
    public static final int f62520z = 131072;

    /* JADX INFO: renamed from: b */
    public final mm3 f62521b;

    /* JADX INFO: renamed from: c */
    public final long f62522c;

    /* JADX INFO: renamed from: d */
    public final long f62523d;

    /* JADX INFO: renamed from: e */
    public final long f62524e;

    /* JADX INFO: renamed from: f */
    public final long f62525f;

    /* JADX INFO: renamed from: g */
    public final int f62526g;

    /* JADX INFO: renamed from: h */
    public final boolean f62527h;

    /* JADX INFO: renamed from: i */
    public final long f62528i;

    /* JADX INFO: renamed from: j */
    public final boolean f62529j;

    /* JADX INFO: renamed from: k */
    public int f62530k;

    /* JADX INFO: renamed from: l */
    public boolean f62531l;

    /* JADX INFO: renamed from: mw3$a */
    public static final class C9569a {

        /* JADX INFO: renamed from: a */
        @hib
        public mm3 f62532a;

        /* JADX INFO: renamed from: b */
        public int f62533b = 50000;

        /* JADX INFO: renamed from: c */
        public int f62534c = 50000;

        /* JADX INFO: renamed from: d */
        public int f62535d = 2500;

        /* JADX INFO: renamed from: e */
        public int f62536e = 5000;

        /* JADX INFO: renamed from: f */
        public int f62537f = -1;

        /* JADX INFO: renamed from: g */
        public boolean f62538g = false;

        /* JADX INFO: renamed from: h */
        public int f62539h = 0;

        /* JADX INFO: renamed from: i */
        public boolean f62540i = false;

        /* JADX INFO: renamed from: j */
        public boolean f62541j;

        public mw3 build() {
            u80.checkState(!this.f62541j);
            this.f62541j = true;
            if (this.f62532a == null) {
                this.f62532a = new mm3(true, 65536);
            }
            return new mw3(this.f62532a, this.f62533b, this.f62534c, this.f62535d, this.f62536e, this.f62537f, this.f62538g, this.f62539h, this.f62540i);
        }

        @op1
        public C9569a setAllocator(mm3 mm3Var) {
            u80.checkState(!this.f62541j);
            this.f62532a = mm3Var;
            return this;
        }

        @op1
        public C9569a setBackBuffer(int i, boolean z) {
            u80.checkState(!this.f62541j);
            mw3.assertGreaterOrEqual(i, 0, "backBufferDurationMs", a43.f347l);
            this.f62539h = i;
            this.f62540i = z;
            return this;
        }

        @op1
        public C9569a setBufferDurationsMs(int i, int i2, int i3, int i4) {
            u80.checkState(!this.f62541j);
            mw3.assertGreaterOrEqual(i3, 0, "bufferForPlaybackMs", a43.f347l);
            mw3.assertGreaterOrEqual(i4, 0, "bufferForPlaybackAfterRebufferMs", a43.f347l);
            mw3.assertGreaterOrEqual(i, i3, "minBufferMs", "bufferForPlaybackMs");
            mw3.assertGreaterOrEqual(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            mw3.assertGreaterOrEqual(i2, i, "maxBufferMs", "minBufferMs");
            this.f62533b = i;
            this.f62534c = i2;
            this.f62535d = i3;
            this.f62536e = i4;
            return this;
        }

        @op1
        public C9569a setPrioritizeTimeOverSizeThresholds(boolean z) {
            u80.checkState(!this.f62541j);
            this.f62538g = z;
            return this;
        }

        @op1
        public C9569a setTargetBufferBytes(int i) {
            u80.checkState(!this.f62541j);
            this.f62537f = i;
            return this;
        }
    }

    public mw3() {
        this(new mm3(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertGreaterOrEqual(int i, int i2, String str, String str2) {
        u80.checkArgument(i >= i2, str + " cannot be less than " + str2);
    }

    private static int getDefaultBufferSize(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void reset(boolean z) {
        int i = this.f62526g;
        if (i == -1) {
            i = 13107200;
        }
        this.f62530k = i;
        this.f62531l = false;
        if (z) {
            this.f62521b.reset();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m17634b(n1e[] n1eVarArr, pf5[] pf5VarArr) {
        int defaultBufferSize = 0;
        for (int i = 0; i < n1eVarArr.length; i++) {
            if (pf5VarArr[i] != null) {
                defaultBufferSize += getDefaultBufferSize(n1eVarArr[i].getTrackType());
            }
        }
        return Math.max(13107200, defaultBufferSize);
    }

    @Override // p000.gc9
    public InterfaceC6430gn getAllocator() {
        return this.f62521b;
    }

    @Override // p000.gc9
    public long getBackBufferDurationUs() {
        return this.f62528i;
    }

    @Override // p000.gc9
    public void onPrepared() {
        reset(false);
    }

    @Override // p000.gc9
    public void onReleased() {
        reset(true);
    }

    @Override // p000.gc9
    public void onStopped() {
        reset(true);
    }

    @Override // p000.gc9
    public void onTracksSelected(t1h t1hVar, pja pjaVar, n1e[] n1eVarArr, m6h m6hVar, pf5[] pf5VarArr) {
        int iM17634b = this.f62526g;
        if (iM17634b == -1) {
            iM17634b = m17634b(n1eVarArr, pf5VarArr);
        }
        this.f62530k = iM17634b;
        this.f62521b.setTargetBufferSize(iM17634b);
    }

    @Override // p000.gc9
    public boolean retainBackBufferFromKeyframe() {
        return this.f62529j;
    }

    @Override // p000.gc9
    public boolean shouldContinueLoading(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f62521b.getTotalBytesAllocated() >= this.f62530k;
        long jMin = this.f62522c;
        if (f > 1.0f) {
            jMin = Math.min(x0i.getMediaDurationForPlayoutDuration(jMin, f), this.f62523d);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            if (!this.f62527h && z2) {
                z = false;
            }
            this.f62531l = z;
            if (!z && j2 < 500000) {
                yh9.m25919w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f62523d || z2) {
            this.f62531l = false;
        }
        return this.f62531l;
    }

    @Override // p000.gc9
    public boolean shouldStartPlayback(t1h t1hVar, pja pjaVar, long j, float f, boolean z, long j2) {
        long playoutDurationForMediaDuration = x0i.getPlayoutDurationForMediaDuration(j, f);
        long jMin = z ? this.f62525f : this.f62524e;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || playoutDurationForMediaDuration >= jMin || (!this.f62527h && this.f62521b.getTotalBytesAllocated() >= this.f62530k);
    }

    public mw3(mm3 mm3Var, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        assertGreaterOrEqual(i3, 0, "bufferForPlaybackMs", a43.f347l);
        assertGreaterOrEqual(i4, 0, "bufferForPlaybackAfterRebufferMs", a43.f347l);
        assertGreaterOrEqual(i, i3, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i2, i, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i6, 0, "backBufferDurationMs", a43.f347l);
        this.f62521b = mm3Var;
        this.f62522c = x0i.msToUs(i);
        this.f62523d = x0i.msToUs(i2);
        this.f62524e = x0i.msToUs(i3);
        this.f62525f = x0i.msToUs(i4);
        this.f62526g = i5;
        this.f62530k = i5 == -1 ? 13107200 : i5;
        this.f62527h = z;
        this.f62528i = x0i.msToUs(i6);
        this.f62529j = z2;
    }
}
