package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface ww2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C14812a f95584a = C14812a.f95585a;

    /* JADX INFO: renamed from: ww2$a */
    public static final class C14812a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C14812a f95585a = new C14812a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final ww2 f95586b = new a();

        /* JADX INFO: renamed from: c */
        @yfb
        public static final ww2 f95587c = new e();

        /* JADX INFO: renamed from: d */
        @yfb
        public static final ww2 f95588d = new c();

        /* JADX INFO: renamed from: e */
        @yfb
        public static final ww2 f95589e = new d();

        /* JADX INFO: renamed from: f */
        @yfb
        public static final ww2 f95590f = new f();

        /* JADX INFO: renamed from: g */
        @yfb
        public static final g26 f95591g = new g26(1.0f);

        /* JADX INFO: renamed from: h */
        @yfb
        public static final ww2 f95592h = new b();

        /* JADX INFO: renamed from: ww2$a$a */
        public static final class a implements ww2 {
            @Override // p000.ww2
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo29683computeScaleFactorH7hwNQA(long j, long j2) {
                float fM33323computeFillMaxDimensioniLBOSCw = xw2.m33323computeFillMaxDimensioniLBOSCw(j, j2);
                return qme.ScaleFactor(fM33323computeFillMaxDimensioniLBOSCw, fM33323computeFillMaxDimensioniLBOSCw);
            }
        }

        /* JADX INFO: renamed from: ww2$a$b */
        public static final class b implements ww2 {
            @Override // p000.ww2
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo29683computeScaleFactorH7hwNQA(long j, long j2) {
                return qme.ScaleFactor(xw2.m33325computeFillWidthiLBOSCw(j, j2), xw2.m33322computeFillHeightiLBOSCw(j, j2));
            }
        }

        /* JADX INFO: renamed from: ww2$a$c */
        public static final class c implements ww2 {
            @Override // p000.ww2
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo29683computeScaleFactorH7hwNQA(long j, long j2) {
                float fM33322computeFillHeightiLBOSCw = xw2.m33322computeFillHeightiLBOSCw(j, j2);
                return qme.ScaleFactor(fM33322computeFillHeightiLBOSCw, fM33322computeFillHeightiLBOSCw);
            }
        }

        /* JADX INFO: renamed from: ww2$a$d */
        public static final class d implements ww2 {
            @Override // p000.ww2
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo29683computeScaleFactorH7hwNQA(long j, long j2) {
                float fM33325computeFillWidthiLBOSCw = xw2.m33325computeFillWidthiLBOSCw(j, j2);
                return qme.ScaleFactor(fM33325computeFillWidthiLBOSCw, fM33325computeFillWidthiLBOSCw);
            }
        }

        /* JADX INFO: renamed from: ww2$a$e */
        public static final class e implements ww2 {
            @Override // p000.ww2
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo29683computeScaleFactorH7hwNQA(long j, long j2) {
                float fM33324computeFillMinDimensioniLBOSCw = xw2.m33324computeFillMinDimensioniLBOSCw(j, j2);
                return qme.ScaleFactor(fM33324computeFillMinDimensioniLBOSCw, fM33324computeFillMinDimensioniLBOSCw);
            }
        }

        /* JADX INFO: renamed from: ww2$a$f */
        public static final class f implements ww2 {
            @Override // p000.ww2
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo29683computeScaleFactorH7hwNQA(long j, long j2) {
                if (wpf.m33069getWidthimpl(j) <= wpf.m33069getWidthimpl(j2) && wpf.m33066getHeightimpl(j) <= wpf.m33066getHeightimpl(j2)) {
                    return qme.ScaleFactor(1.0f, 1.0f);
                }
                float fM33324computeFillMinDimensioniLBOSCw = xw2.m33324computeFillMinDimensioniLBOSCw(j, j2);
                return qme.ScaleFactor(fM33324computeFillMinDimensioniLBOSCw, fM33324computeFillMinDimensioniLBOSCw);
            }
        }

        private C14812a() {
        }

        @f0g
        public static /* synthetic */ void getCrop$annotations() {
        }

        @f0g
        public static /* synthetic */ void getFillBounds$annotations() {
        }

        @f0g
        public static /* synthetic */ void getFillHeight$annotations() {
        }

        @f0g
        public static /* synthetic */ void getFillWidth$annotations() {
        }

        @f0g
        public static /* synthetic */ void getFit$annotations() {
        }

        @f0g
        public static /* synthetic */ void getInside$annotations() {
        }

        @f0g
        public static /* synthetic */ void getNone$annotations() {
        }

        @yfb
        public final ww2 getCrop() {
            return f95586b;
        }

        @yfb
        public final ww2 getFillBounds() {
            return f95592h;
        }

        @yfb
        public final ww2 getFillHeight() {
            return f95588d;
        }

        @yfb
        public final ww2 getFillWidth() {
            return f95589e;
        }

        @yfb
        public final ww2 getFit() {
            return f95587c;
        }

        @yfb
        public final ww2 getInside() {
            return f95590f;
        }

        @yfb
        public final g26 getNone() {
            return f95591g;
        }
    }

    /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
    long mo29683computeScaleFactorH7hwNQA(long j, long j2);
}
