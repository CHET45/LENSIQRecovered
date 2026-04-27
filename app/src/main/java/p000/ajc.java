package p000;

/* JADX INFO: loaded from: classes.dex */
public interface ajc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C0292a f1762a = C0292a.f1763a;

    /* JADX INFO: renamed from: ajc$a */
    public static final class C0292a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C0292a f1763a = new C0292a();

        private C0292a() {
        }

        public static /* synthetic */ ajc dashPathEffect$default(C0292a c0292a, float[] fArr, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            return c0292a.dashPathEffect(fArr, f);
        }

        @yfb
        public final ajc chainPathEffect(@yfb ajc ajcVar, @yfb ajc ajcVar2) {
            return C5978fu.actualChainPathEffect(ajcVar, ajcVar2);
        }

        @yfb
        public final ajc cornerPathEffect(float f) {
            return C5978fu.actualCornerPathEffect(f);
        }

        @yfb
        public final ajc dashPathEffect(@yfb float[] fArr, float f) {
            return C5978fu.actualDashPathEffect(fArr, f);
        }

        @yfb
        /* JADX INFO: renamed from: stampedPathEffect-7aD1DOk, reason: not valid java name */
        public final ajc m27222stampedPathEffect7aD1DOk(@yfb vic vicVar, float f, float f2, int i) {
            return C5978fu.m29664actualStampedPathEffect7aD1DOk(vicVar, f, f2, i);
        }
    }
}
