package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
@ah5
public interface sd1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C12522a f81248a = C12522a.f81249a;

    /* JADX INFO: renamed from: sd1$a */
    public static final class C12522a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C12522a f81249a = new C12522a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final InterfaceC11178py<Float> f81250b = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: c */
        @yfb
        public static final sd1 f81251c = new a();

        /* JADX INFO: renamed from: sd1$a$a */
        public static final class a implements sd1 {
        }

        private C12522a() {
        }

        public final float defaultCalculateScrollDistance$foundation_release(float f, float f2, float f3) {
            float f4 = f2 + f;
            if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
                return 0.0f;
            }
            float f5 = f4 - f3;
            return Math.abs(f) < Math.abs(f5) ? f : f5;
        }

        @yfb
        public final sd1 getDefaultBringIntoViewSpec$foundation_release() {
            return f81251c;
        }

        @yfb
        public final InterfaceC11178py<Float> getDefaultScrollAnimationSpec() {
            return f81250b;
        }
    }

    default float calculateScrollDistance(float f, float f2, float f3) {
        return f81248a.defaultCalculateScrollDistance$foundation_release(f, f2, f3);
    }

    @yfb
    default InterfaceC11178py<Float> getScrollAnimationSpec() {
        return f81248a.getDefaultScrollAnimationSpec();
    }
}
