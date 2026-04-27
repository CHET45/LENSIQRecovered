package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public abstract class do6 {

    /* JADX INFO: renamed from: c */
    public static final int f30260c = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f30265a;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C4890a f30259b = new C4890a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final djg f30261d = new gv3();

    /* JADX INFO: renamed from: e */
    @yfb
    public static final z27 f30262e = new z27("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: f */
    @yfb
    public static final z27 f30263f = new z27("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: m */
    @yfb
    public static final z27 f30264m = new z27("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: C */
    @yfb
    public static final z27 f30258C = new z27("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: do6$a */
    public static final class C4890a {
        public /* synthetic */ C4890a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final z27 getCursive() {
            return do6.f30258C;
        }

        @yfb
        public final djg getDefault() {
            return do6.f30261d;
        }

        @yfb
        public final z27 getMonospace() {
            return do6.f30264m;
        }

        @yfb
        public final z27 getSansSerif() {
            return do6.f30262e;
        }

        @yfb
        public final z27 getSerif() {
            return do6.f30263f;
        }

        private C4890a() {
        }
    }

    /* JADX INFO: renamed from: do6$b */
    public interface InterfaceC4891b {
        /* JADX INFO: renamed from: resolve-DPcqOEQ$default, reason: not valid java name */
        static /* synthetic */ i2g m28658resolveDPcqOEQ$default(InterfaceC4891b interfaceC4891b, do6 do6Var, jp6 jp6Var, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i3 & 1) != 0) {
                do6Var = null;
            }
            if ((i3 & 2) != 0) {
                jp6Var = jp6.f51403b.getNormal();
            }
            if ((i3 & 4) != 0) {
                i = fp6.f37355b.m29582getNormal_LCdwA();
            }
            if ((i3 & 8) != 0) {
                i2 = gp6.f40694b.m29849getAllGVVA2EU();
            }
            return interfaceC4891b.mo28659resolveDPcqOEQ(do6Var, jp6Var, i, i2);
        }

        @gib
        Object preload(@yfb do6 do6Var, @yfb zy2<? super bth> zy2Var);

        @yfb
        /* JADX INFO: renamed from: resolve-DPcqOEQ, reason: not valid java name */
        i2g<Object> mo28659resolveDPcqOEQ(@gib do6 do6Var, @yfb jp6 jp6Var, int i, int i2);
    }

    public /* synthetic */ do6(boolean z, jt3 jt3Var) {
        this(z);
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }

    @q64(level = u64.f86866b, message = "Unused property that has no meaning. Do not use.")
    public final boolean getCanLoadSynchronously() {
        return this.f30265a;
    }

    private do6(boolean z) {
        this.f30265a = z;
    }
}
