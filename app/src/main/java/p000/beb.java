package p000;

import p000.afh;

/* JADX INFO: loaded from: classes4.dex */
public class beb<R> implements afh<R> {

    /* JADX INFO: renamed from: a */
    public static final beb<?> f13551a = new beb<>();

    /* JADX INFO: renamed from: b */
    public static final efh<?> f13552b = new C1863a();

    /* JADX INFO: renamed from: beb$a */
    public static class C1863a<R> implements efh<R> {
        @Override // p000.efh
        public afh<R> build(hh3 hh3Var, boolean z) {
            return beb.f13551a;
        }
    }

    public static <R> afh<R> get() {
        return f13551a;
    }

    public static <R> efh<R> getFactory() {
        return (efh<R>) f13552b;
    }

    @Override // p000.afh
    public boolean transition(Object obj, afh.InterfaceC0213a interfaceC0213a) {
        return false;
    }
}
