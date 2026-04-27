package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface vac {

    /* JADX INFO: renamed from: vac$a */
    @dwf({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n1#2:485\n148#3:486\n148#3:487\n148#3:488\n148#3:489\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n*L\n208#1:486\n210#1:487\n212#1:488\n214#1:489\n*E\n"})
    @vw7
    public static final class C13966a implements vac {

        /* JADX INFO: renamed from: e */
        public static final int f90471e = 0;

        /* JADX INFO: renamed from: a */
        public final float f90472a;

        /* JADX INFO: renamed from: b */
        public final float f90473b;

        /* JADX INFO: renamed from: c */
        public final float f90474c;

        /* JADX INFO: renamed from: d */
        public final float f90475d;

        public /* synthetic */ C13966a(float f, float f2, float f3, float f4, jt3 jt3Var) {
            this(f, f2, f3, f4);
        }

        @f0g
        /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m32753getBottomD9Ej5fM$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m32754getLeftD9Ej5fM$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m32755getRightD9Ej5fM$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m32756getTopD9Ej5fM$annotations() {
        }

        @Override // p000.vac
        /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
        public float mo32749calculateBottomPaddingD9Ej5fM() {
            return this.f90475d;
        }

        @Override // p000.vac
        /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
        public float mo32750calculateLeftPaddingu2uoSUM(@yfb ov8 ov8Var) {
            return this.f90472a;
        }

        @Override // p000.vac
        /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
        public float mo32751calculateRightPaddingu2uoSUM(@yfb ov8 ov8Var) {
            return this.f90474c;
        }

        @Override // p000.vac
        /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
        public float mo32752calculateTopPaddingD9Ej5fM() {
            return this.f90473b;
        }

        public boolean equals(@gib Object obj) {
            if (!(obj instanceof C13966a)) {
                return false;
            }
            C13966a c13966a = (C13966a) obj;
            return kn4.m30710equalsimpl0(this.f90472a, c13966a.f90472a) && kn4.m30710equalsimpl0(this.f90473b, c13966a.f90473b) && kn4.m30710equalsimpl0(this.f90474c, c13966a.f90474c) && kn4.m30710equalsimpl0(this.f90475d, c13966a.f90475d);
        }

        public int hashCode() {
            return (((((kn4.m30711hashCodeimpl(this.f90472a) * 31) + kn4.m30711hashCodeimpl(this.f90473b)) * 31) + kn4.m30711hashCodeimpl(this.f90474c)) * 31) + kn4.m30711hashCodeimpl(this.f90475d);
        }

        @yfb
        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) kn4.m30716toStringimpl(this.f90472a)) + ", top=" + ((Object) kn4.m30716toStringimpl(this.f90473b)) + ", right=" + ((Object) kn4.m30716toStringimpl(this.f90474c)) + ", bottom=" + ((Object) kn4.m30716toStringimpl(this.f90475d)) + ')';
        }

        private C13966a(float f, float f2, float f3, float f4) {
            this.f90472a = f;
            this.f90473b = f2;
            this.f90474c = f3;
            this.f90475d = f4;
            if (f < 0.0f) {
                throw new IllegalArgumentException("Left padding must be non-negative");
            }
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Top padding must be non-negative");
            }
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Right padding must be non-negative");
            }
            if (f4 < 0.0f) {
                throw new IllegalArgumentException("Bottom padding must be non-negative");
            }
        }

        public /* synthetic */ C13966a(float f, float f2, float f3, float f4, int i, jt3 jt3Var) {
            this((i & 1) != 0 ? kn4.m30705constructorimpl(0) : f, (i & 2) != 0 ? kn4.m30705constructorimpl(0) : f2, (i & 4) != 0 ? kn4.m30705constructorimpl(0) : f3, (i & 8) != 0 ? kn4.m30705constructorimpl(0) : f4, null);
        }
    }

    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    float mo32749calculateBottomPaddingD9Ej5fM();

    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    float mo32750calculateLeftPaddingu2uoSUM(@yfb ov8 ov8Var);

    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    float mo32751calculateRightPaddingu2uoSUM(@yfb ov8 ov8Var);

    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    float mo32752calculateTopPaddingD9Ej5fM();
}
