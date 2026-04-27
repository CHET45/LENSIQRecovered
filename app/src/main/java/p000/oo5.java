package p000;

/* JADX INFO: loaded from: classes5.dex */
public class oo5 {

    /* JADX INFO: renamed from: a */
    public static final no5 f68229a = new C10480a();

    /* JADX INFO: renamed from: b */
    public static final no5 f68230b = new C10481b();

    /* JADX INFO: renamed from: c */
    public static final no5 f68231c = new C10482c();

    /* JADX INFO: renamed from: d */
    public static final no5 f68232d = new C10483d();

    /* JADX INFO: renamed from: oo5$a */
    public class C10480a implements no5 {
        @Override // p000.no5
        public ro5 evaluate(float f, float f2, float f3, float f4) {
            return ro5.m21448a(255, rfh.m21277n(0, 255, f2, f3, f));
        }
    }

    /* JADX INFO: renamed from: oo5$b */
    public class C10481b implements no5 {
        @Override // p000.no5
        public ro5 evaluate(float f, float f2, float f3, float f4) {
            return ro5.m21449b(rfh.m21277n(255, 0, f2, f3, f), 255);
        }
    }

    /* JADX INFO: renamed from: oo5$c */
    public class C10482c implements no5 {
        @Override // p000.no5
        public ro5 evaluate(float f, float f2, float f3, float f4) {
            return ro5.m21449b(rfh.m21277n(255, 0, f2, f3, f), rfh.m21277n(0, 255, f2, f3, f));
        }
    }

    /* JADX INFO: renamed from: oo5$d */
    public class C10483d implements no5 {
        @Override // p000.no5
        public ro5 evaluate(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return ro5.m21449b(rfh.m21277n(255, 0, f2, f5, f), rfh.m21277n(0, 255, f5, f3, f));
        }
    }

    private oo5() {
    }

    /* JADX INFO: renamed from: a */
    public static no5 m18799a(int i, boolean z) {
        if (i == 0) {
            return z ? f68229a : f68230b;
        }
        if (i == 1) {
            return z ? f68230b : f68229a;
        }
        if (i == 2) {
            return f68231c;
        }
        if (i == 3) {
            return f68232d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i);
    }
}
