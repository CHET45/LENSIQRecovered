package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface a2d {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C0021a f185a = C0021a.f186a;

    /* JADX INFO: renamed from: a2d$a */
    public static final class C0021a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C0021a f186a = new C0021a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a2d f187b = e2d.getPointerIconDefault();

        /* JADX INFO: renamed from: c */
        @yfb
        public static final a2d f188c = e2d.getPointerIconCrosshair();

        /* JADX INFO: renamed from: d */
        @yfb
        public static final a2d f189d = e2d.getPointerIconText();

        /* JADX INFO: renamed from: e */
        @yfb
        public static final a2d f190e = e2d.getPointerIconHand();

        private C0021a() {
        }

        @yfb
        public final a2d getCrosshair() {
            return f188c;
        }

        @yfb
        public final a2d getDefault() {
            return f187b;
        }

        @yfb
        public final a2d getHand() {
            return f190e;
        }

        @yfb
        public final a2d getText() {
            return f189d;
        }
    }
}
