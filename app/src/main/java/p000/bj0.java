package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class bj0 implements tq2 {

    /* JADX INFO: renamed from: a */
    public static final int f13845a = 2;

    /* JADX INFO: renamed from: b */
    public static final tq2 f13846b = new bj0();

    /* JADX INFO: renamed from: bj0$a */
    public static final class C1917a implements tjb<oae> {

        /* JADX INFO: renamed from: a */
        public static final C1917a f13847a = new C1917a();

        /* JADX INFO: renamed from: b */
        public static final ar5 f13848b = ar5.m2545of(nae.f63811a);

        /* JADX INFO: renamed from: c */
        public static final ar5 f13849c = ar5.m2545of(nae.f63813c);

        /* JADX INFO: renamed from: d */
        public static final ar5 f13850d = ar5.m2545of(nae.f63814d);

        /* JADX INFO: renamed from: e */
        public static final ar5 f13851e = ar5.m2545of(nae.f63812b);

        /* JADX INFO: renamed from: f */
        public static final ar5 f13852f = ar5.m2545of(nae.f63815e);

        private C1917a() {
        }

        @Override // p000.l15
        public void encode(oae oaeVar, ujb ujbVar) throws IOException {
            ujbVar.add(f13848b, oaeVar.getRolloutId());
            ujbVar.add(f13849c, oaeVar.getParameterKey());
            ujbVar.add(f13850d, oaeVar.getParameterValue());
            ujbVar.add(f13851e, oaeVar.getVariantId());
            ujbVar.add(f13852f, oaeVar.getTemplateVersion());
        }
    }

    private bj0() {
    }

    @Override // p000.tq2
    public void configure(o15<?> o15Var) {
        C1917a c1917a = C1917a.f13847a;
        o15Var.registerEncoder(oae.class, c1917a);
        o15Var.registerEncoder(pl0.class, c1917a);
    }
}
