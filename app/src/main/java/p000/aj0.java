package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class aj0 implements tq2 {

    /* JADX INFO: renamed from: a */
    public static final int f1686a = 2;

    /* JADX INFO: renamed from: b */
    public static final tq2 f1687b = new aj0();

    /* JADX INFO: renamed from: aj0$a */
    public static final class C0268a implements tjb<f42> {

        /* JADX INFO: renamed from: a */
        public static final C0268a f1688a = new C0268a();

        /* JADX INFO: renamed from: b */
        public static final ar5 f1689b = ar5.builder("window").withProperty(hb0.builder().tag(1).build()).build();

        /* JADX INFO: renamed from: c */
        public static final ar5 f1690c = ar5.builder("logSourceMetrics").withProperty(hb0.builder().tag(2).build()).build();

        /* JADX INFO: renamed from: d */
        public static final ar5 f1691d = ar5.builder("globalMetrics").withProperty(hb0.builder().tag(3).build()).build();

        /* JADX INFO: renamed from: e */
        public static final ar5 f1692e = ar5.builder("appNamespace").withProperty(hb0.builder().tag(4).build()).build();

        private C0268a() {
        }

        @Override // p000.l15
        public void encode(f42 f42Var, ujb ujbVar) throws IOException {
            ujbVar.add(f1689b, f42Var.getWindowInternal());
            ujbVar.add(f1690c, f42Var.getLogSourceMetricsList());
            ujbVar.add(f1691d, f42Var.getGlobalMetricsInternal());
            ujbVar.add(f1692e, f42Var.getAppNamespace());
        }
    }

    /* JADX INFO: renamed from: aj0$b */
    public static final class C0269b implements tjb<n77> {

        /* JADX INFO: renamed from: a */
        public static final C0269b f1693a = new C0269b();

        /* JADX INFO: renamed from: b */
        public static final ar5 f1694b = ar5.builder("storageMetrics").withProperty(hb0.builder().tag(1).build()).build();

        private C0269b() {
        }

        @Override // p000.l15
        public void encode(n77 n77Var, ujb ujbVar) throws IOException {
            ujbVar.add(f1694b, n77Var.getStorageMetricsInternal());
        }
    }

    /* JADX INFO: renamed from: aj0$c */
    public static final class C0270c implements tjb<ei9> {

        /* JADX INFO: renamed from: a */
        public static final C0270c f1695a = new C0270c();

        /* JADX INFO: renamed from: b */
        public static final ar5 f1696b = ar5.builder("eventsDroppedCount").withProperty(hb0.builder().tag(1).build()).build();

        /* JADX INFO: renamed from: c */
        public static final ar5 f1697c = ar5.builder("reason").withProperty(hb0.builder().tag(3).build()).build();

        private C0270c() {
        }

        @Override // p000.l15
        public void encode(ei9 ei9Var, ujb ujbVar) throws IOException {
            ujbVar.add(f1696b, ei9Var.getEventsDroppedCount());
            ujbVar.add(f1697c, ei9Var.getReason());
        }
    }

    /* JADX INFO: renamed from: aj0$d */
    public static final class C0271d implements tjb<ri9> {

        /* JADX INFO: renamed from: a */
        public static final C0271d f1698a = new C0271d();

        /* JADX INFO: renamed from: b */
        public static final ar5 f1699b = ar5.builder("logSource").withProperty(hb0.builder().tag(1).build()).build();

        /* JADX INFO: renamed from: c */
        public static final ar5 f1700c = ar5.builder("logEventDropped").withProperty(hb0.builder().tag(2).build()).build();

        private C0271d() {
        }

        @Override // p000.l15
        public void encode(ri9 ri9Var, ujb ujbVar) throws IOException {
            ujbVar.add(f1699b, ri9Var.getLogSource());
            ujbVar.add(f1700c, ri9Var.getLogEventDroppedList());
        }
    }

    /* JADX INFO: renamed from: aj0$e */
    public static final class C0272e implements tjb<dhd> {

        /* JADX INFO: renamed from: a */
        public static final C0272e f1701a = new C0272e();

        /* JADX INFO: renamed from: b */
        public static final ar5 f1702b = ar5.m2545of("clientMetrics");

        private C0272e() {
        }

        @Override // p000.l15
        public void encode(dhd dhdVar, ujb ujbVar) throws IOException {
            ujbVar.add(f1702b, dhdVar.getClientMetrics());
        }
    }

    /* JADX INFO: renamed from: aj0$f */
    public static final class C0273f implements tjb<i5g> {

        /* JADX INFO: renamed from: a */
        public static final C0273f f1703a = new C0273f();

        /* JADX INFO: renamed from: b */
        public static final ar5 f1704b = ar5.builder("currentCacheSizeBytes").withProperty(hb0.builder().tag(1).build()).build();

        /* JADX INFO: renamed from: c */
        public static final ar5 f1705c = ar5.builder("maxCacheSizeBytes").withProperty(hb0.builder().tag(2).build()).build();

        private C0273f() {
        }

        @Override // p000.l15
        public void encode(i5g i5gVar, ujb ujbVar) throws IOException {
            ujbVar.add(f1704b, i5gVar.getCurrentCacheSizeBytes());
            ujbVar.add(f1705c, i5gVar.getMaxCacheSizeBytes());
        }
    }

    /* JADX INFO: renamed from: aj0$g */
    public static final class C0274g implements tjb<f1h> {

        /* JADX INFO: renamed from: a */
        public static final C0274g f1706a = new C0274g();

        /* JADX INFO: renamed from: b */
        public static final ar5 f1707b = ar5.builder("startMs").withProperty(hb0.builder().tag(1).build()).build();

        /* JADX INFO: renamed from: c */
        public static final ar5 f1708c = ar5.builder("endMs").withProperty(hb0.builder().tag(2).build()).build();

        private C0274g() {
        }

        @Override // p000.l15
        public void encode(f1h f1hVar, ujb ujbVar) throws IOException {
            ujbVar.add(f1707b, f1hVar.getStartMs());
            ujbVar.add(f1708c, f1hVar.getEndMs());
        }
    }

    private aj0() {
    }

    @Override // p000.tq2
    public void configure(o15<?> o15Var) {
        o15Var.registerEncoder(dhd.class, C0272e.f1701a);
        o15Var.registerEncoder(f42.class, C0268a.f1688a);
        o15Var.registerEncoder(f1h.class, C0274g.f1706a);
        o15Var.registerEncoder(ri9.class, C0271d.f1698a);
        o15Var.registerEncoder(ei9.class, C0270c.f1695a);
        o15Var.registerEncoder(n77.class, C0269b.f1693a);
        o15Var.registerEncoder(i5g.class, C0273f.f1703a);
    }
}
