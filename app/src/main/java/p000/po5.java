package p000;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public class po5 {

    /* JADX INFO: renamed from: a */
    public static final mo5 f71534a = new C11049a();

    /* JADX INFO: renamed from: b */
    public static final mo5 f71535b = new C11050b();

    /* JADX INFO: renamed from: c */
    public static final mo5 f71536c = new C11051c();

    /* JADX INFO: renamed from: d */
    public static final mo5 f71537d = new C11052d();

    /* JADX INFO: renamed from: po5$a */
    public class C11049a implements mo5 {
        @Override // p000.mo5
        public qo5 evaluate(float f, float f2, float f3, float f4) {
            return qo5.m20466a(255, qfh.m20343n(0, 255, f2, f3, f));
        }
    }

    /* JADX INFO: renamed from: po5$b */
    public class C11050b implements mo5 {
        @Override // p000.mo5
        public qo5 evaluate(float f, float f2, float f3, float f4) {
            return qo5.m20467b(qfh.m20343n(255, 0, f2, f3, f), 255);
        }
    }

    /* JADX INFO: renamed from: po5$c */
    public class C11051c implements mo5 {
        @Override // p000.mo5
        public qo5 evaluate(float f, float f2, float f3, float f4) {
            return qo5.m20467b(qfh.m20343n(255, 0, f2, f3, f), qfh.m20343n(0, 255, f2, f3, f));
        }
    }

    /* JADX INFO: renamed from: po5$d */
    public class C11052d implements mo5 {
        @Override // p000.mo5
        public qo5 evaluate(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return qo5.m20467b(qfh.m20343n(255, 0, f2, f5, f), qfh.m20343n(0, 255, f5, f3, f));
        }
    }

    private po5() {
    }

    /* JADX INFO: renamed from: a */
    public static mo5 m19634a(int i, boolean z) {
        if (i == 0) {
            return z ? f71534a : f71535b;
        }
        if (i == 1) {
            return z ? f71535b : f71534a;
        }
        if (i == 2) {
            return f71536c;
        }
        if (i == 3) {
            return f71537d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i);
    }
}
