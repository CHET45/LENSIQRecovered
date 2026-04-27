package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class cj0 implements tq2 {

    /* JADX INFO: renamed from: a */
    public static final int f16674a = 2;

    /* JADX INFO: renamed from: b */
    public static final tq2 f16675b = new cj0();

    /* JADX INFO: renamed from: cj0$a */
    public static final class C2327a implements tjb<nae> {

        /* JADX INFO: renamed from: a */
        public static final C2327a f16676a = new C2327a();

        /* JADX INFO: renamed from: b */
        public static final ar5 f16677b = ar5.m2545of(nae.f63811a);

        /* JADX INFO: renamed from: c */
        public static final ar5 f16678c = ar5.m2545of(nae.f63812b);

        /* JADX INFO: renamed from: d */
        public static final ar5 f16679d = ar5.m2545of(nae.f63813c);

        /* JADX INFO: renamed from: e */
        public static final ar5 f16680e = ar5.m2545of(nae.f63814d);

        /* JADX INFO: renamed from: f */
        public static final ar5 f16681f = ar5.m2545of(nae.f63815e);

        private C2327a() {
        }

        @Override // p000.l15
        public void encode(nae naeVar, ujb ujbVar) throws IOException {
            ujbVar.add(f16677b, naeVar.getRolloutId());
            ujbVar.add(f16678c, naeVar.getVariantId());
            ujbVar.add(f16679d, naeVar.getParameterKey());
            ujbVar.add(f16680e, naeVar.getParameterValue());
            ujbVar.add(f16681f, naeVar.getTemplateVersion());
        }
    }

    private cj0() {
    }

    @Override // p000.tq2
    public void configure(o15<?> o15Var) {
        C2327a c2327a = C2327a.f16676a;
        o15Var.registerEncoder(nae.class, c2327a);
        o15Var.registerEncoder(ol0.class, c2327a);
    }
}
