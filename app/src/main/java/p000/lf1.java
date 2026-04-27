package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lf1 {

    /* JADX INFO: renamed from: B */
    public static final int f57422B = 0;

    /* JADX INFO: renamed from: C */
    public static final int f57423C = 1;

    /* JADX INFO: renamed from: D */
    public static final int f57424D = 2;

    /* JADX INFO: renamed from: E */
    public static final int f57425E = 3;

    /* JADX INFO: renamed from: F */
    public static final int f57426F = 60;

    /* JADX INFO: renamed from: G */
    public static final long f57427G = 1152921504606846975L;

    /* JADX INFO: renamed from: H */
    public static final long f57428H = 4611686018427387904L;

    /* JADX INFO: renamed from: I */
    public static final long f57429I = 4611686018427387903L;

    /* JADX INFO: renamed from: d */
    public static final long f57433d = 0;

    /* JADX INFO: renamed from: e */
    public static final long f57434e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: r */
    public static final int f57447r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f57448s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f57449t = 2;

    /* JADX INFO: renamed from: u */
    public static final int f57450u = 3;

    /* JADX INFO: renamed from: v */
    public static final int f57451v = 4;

    /* JADX INFO: renamed from: w */
    public static final int f57452w = 5;

    /* JADX INFO: renamed from: a */
    @yfb
    public static final yu1<Object> f57430a = new yu1<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b */
    @un8
    public static final int f57431b = bkg.systemProp$default("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);

    /* JADX INFO: renamed from: c */
    public static final int f57432c = bkg.systemProp$default("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);

    /* JADX INFO: renamed from: f */
    @un8
    @yfb
    public static final qhg f57435f = new qhg("BUFFERED");

    /* JADX INFO: renamed from: g */
    @yfb
    public static final qhg f57436g = new qhg("SHOULD_BUFFER");

    /* JADX INFO: renamed from: h */
    @yfb
    public static final qhg f57437h = new qhg("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: i */
    @yfb
    public static final qhg f57438i = new qhg("RESUMING_BY_EB");

    /* JADX INFO: renamed from: j */
    @yfb
    public static final qhg f57439j = new qhg("POISONED");

    /* JADX INFO: renamed from: k */
    @yfb
    public static final qhg f57440k = new qhg("DONE_RCV");

    /* JADX INFO: renamed from: l */
    @yfb
    public static final qhg f57441l = new qhg("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: m */
    @yfb
    public static final qhg f57442m = new qhg("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: n */
    @yfb
    public static final qhg f57443n = new qhg("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: o */
    @yfb
    public static final qhg f57444o = new qhg("SUSPEND");

    /* JADX INFO: renamed from: p */
    @yfb
    public static final qhg f57445p = new qhg("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: q */
    @yfb
    public static final qhg f57446q = new qhg("FAILED");

    /* JADX INFO: renamed from: x */
    @yfb
    public static final qhg f57453x = new qhg("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: y */
    @yfb
    public static final qhg f57454y = new qhg("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: z */
    @yfb
    public static final qhg f57455z = new qhg("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: A */
    @yfb
    public static final qhg f57421A = new qhg("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: lf1$a */
    public /* synthetic */ class C8804a<E> extends n07 implements gz6<Long, yu1<E>, yu1<E>> {

        /* JADX INFO: renamed from: a */
        public static final C8804a f57456a = new C8804a();

        public C8804a() {
            super(2, lf1.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final yu1<E> invoke(long j, yu1<E> yu1Var) {
            return lf1.createSegment(j, yu1Var);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Object invoke(Long l, Object obj) {
            return invoke(l.longValue(), (yu1) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m16114a(dq1 dq1Var, Object obj, kz6 kz6Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            kz6Var = null;
        }
        return tryResume0(dq1Var, obj, kz6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long constructEBCompletedAndPauseFlag(long j, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long constructSendersAndCloseStatus(long j, int i) {
        return (((long) i) << 60) + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> yu1<E> createSegment(long j, yu1<E> yu1Var) {
        return new yu1<>(j, yu1Var, yu1Var.getChannel(), 0);
    }

    @yfb
    public static final <E> to8<yu1<E>> createSegmentFunction() {
        return C8804a.f57456a;
    }

    @yfb
    public static final qhg getCHANNEL_CLOSED() {
        return f57443n;
    }

    private static final long getEbCompletedCounter(long j) {
        return j & 4611686018427387903L;
    }

    private static final boolean getEbPauseExpandBuffers(long j) {
        return (j & 4611686018427387904L) != 0;
    }

    private static final int getSendersCloseStatus(long j) {
        return (int) (j >> 60);
    }

    private static final long getSendersCounter(long j) {
        return j & f57427G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long initialBufferEnd(int i) {
        if (i == 0) {
            return 0L;
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean tryResume0(dq1<? super T> dq1Var, T t, kz6<? super Throwable, ? super T, ? super e13, bth> kz6Var) {
        Object objTryResume = dq1Var.tryResume(t, null, kz6Var);
        if (objTryResume == null) {
            return false;
        }
        dq1Var.completeResume(objTryResume);
        return true;
    }
}
