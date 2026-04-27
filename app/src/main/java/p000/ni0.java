package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ni0 implements tq2 {

    /* JADX INFO: renamed from: a */
    public static final int f64583a = 2;

    /* JADX INFO: renamed from: b */
    public static final tq2 f64584b = new ni0();

    /* JADX INFO: renamed from: ni0$a */
    public static final class C9881a implements tjb<AbstractC6463gq> {

        /* JADX INFO: renamed from: a */
        public static final C9881a f64585a = new C9881a();

        /* JADX INFO: renamed from: b */
        public static final ar5 f64586b = ar5.m2545of("sdkVersion");

        /* JADX INFO: renamed from: c */
        public static final ar5 f64587c = ar5.m2545of("model");

        /* JADX INFO: renamed from: d */
        public static final ar5 f64588d = ar5.m2545of(xs1.f99117v);

        /* JADX INFO: renamed from: e */
        public static final ar5 f64589e = ar5.m2545of(xs1.f99118w);

        /* JADX INFO: renamed from: f */
        public static final ar5 f64590f = ar5.m2545of(xs1.f99119x);

        /* JADX INFO: renamed from: g */
        public static final ar5 f64591g = ar5.m2545of("osBuild");

        /* JADX INFO: renamed from: h */
        public static final ar5 f64592h = ar5.m2545of(xs1.f99121z);

        /* JADX INFO: renamed from: i */
        public static final ar5 f64593i = ar5.m2545of(xs1.f99097A);

        /* JADX INFO: renamed from: j */
        public static final ar5 f64594j = ar5.m2545of(xs1.f99098B);

        /* JADX INFO: renamed from: k */
        public static final ar5 f64595k = ar5.m2545of(xs1.f99099C);

        /* JADX INFO: renamed from: l */
        public static final ar5 f64596l = ar5.m2545of("mccMnc");

        /* JADX INFO: renamed from: m */
        public static final ar5 f64597m = ar5.m2545of("applicationBuild");

        private C9881a() {
        }

        @Override // p000.l15
        public void encode(AbstractC6463gq abstractC6463gq, ujb ujbVar) throws IOException {
            ujbVar.add(f64586b, abstractC6463gq.getSdkVersion());
            ujbVar.add(f64587c, abstractC6463gq.getModel());
            ujbVar.add(f64588d, abstractC6463gq.getHardware());
            ujbVar.add(f64589e, abstractC6463gq.getDevice());
            ujbVar.add(f64590f, abstractC6463gq.getProduct());
            ujbVar.add(f64591g, abstractC6463gq.getOsBuild());
            ujbVar.add(f64592h, abstractC6463gq.getManufacturer());
            ujbVar.add(f64593i, abstractC6463gq.getFingerprint());
            ujbVar.add(f64594j, abstractC6463gq.getLocale());
            ujbVar.add(f64595k, abstractC6463gq.getCountry());
            ujbVar.add(f64596l, abstractC6463gq.getMccMnc());
            ujbVar.add(f64597m, abstractC6463gq.getApplicationBuild());
        }
    }

    /* JADX INFO: renamed from: ni0$b */
    public static final class C9882b implements tjb<ax0> {

        /* JADX INFO: renamed from: a */
        public static final C9882b f64598a = new C9882b();

        /* JADX INFO: renamed from: b */
        public static final ar5 f64599b = ar5.m2545of("logRequest");

        private C9882b() {
        }

        @Override // p000.l15
        public void encode(ax0 ax0Var, ujb ujbVar) throws IOException {
            ujbVar.add(f64599b, ax0Var.getLogRequests());
        }
    }

    /* JADX INFO: renamed from: ni0$c */
    public static final class C9883c implements tjb<c42> {

        /* JADX INFO: renamed from: a */
        public static final C9883c f64600a = new C9883c();

        /* JADX INFO: renamed from: b */
        public static final ar5 f64601b = ar5.m2545of("clientType");

        /* JADX INFO: renamed from: c */
        public static final ar5 f64602c = ar5.m2545of("androidClientInfo");

        private C9883c() {
        }

        @Override // p000.l15
        public void encode(c42 c42Var, ujb ujbVar) throws IOException {
            ujbVar.add(f64601b, c42Var.getClientType());
            ujbVar.add(f64602c, c42Var.getAndroidClientInfo());
        }
    }

    /* JADX INFO: renamed from: ni0$d */
    public static final class C9884d implements tjb<wi2> {

        /* JADX INFO: renamed from: a */
        public static final C9884d f64603a = new C9884d();

        /* JADX INFO: renamed from: b */
        public static final ar5 f64604b = ar5.m2545of("privacyContext");

        /* JADX INFO: renamed from: c */
        public static final ar5 f64605c = ar5.m2545of("productIdOrigin");

        private C9884d() {
        }

        @Override // p000.l15
        public void encode(wi2 wi2Var, ujb ujbVar) throws IOException {
            ujbVar.add(f64604b, wi2Var.getPrivacyContext());
            ujbVar.add(f64605c, wi2Var.getProductIdOrigin());
        }
    }

    /* JADX INFO: renamed from: ni0$e */
    public static final class C9885e implements tjb<cg5> {

        /* JADX INFO: renamed from: a */
        public static final C9885e f64606a = new C9885e();

        /* JADX INFO: renamed from: b */
        public static final ar5 f64607b = ar5.m2545of("clearBlob");

        /* JADX INFO: renamed from: c */
        public static final ar5 f64608c = ar5.m2545of("encryptedBlob");

        private C9885e() {
        }

        @Override // p000.l15
        public void encode(cg5 cg5Var, ujb ujbVar) throws IOException {
            ujbVar.add(f64607b, cg5Var.getClearBlob());
            ujbVar.add(f64608c, cg5Var.getEncryptedBlob());
        }
    }

    /* JADX INFO: renamed from: ni0$f */
    public static final class C9886f implements tjb<kj5> {

        /* JADX INFO: renamed from: a */
        public static final C9886f f64609a = new C9886f();

        /* JADX INFO: renamed from: b */
        public static final ar5 f64610b = ar5.m2545of("originAssociatedProductId");

        private C9886f() {
        }

        @Override // p000.l15
        public void encode(kj5 kj5Var, ujb ujbVar) throws IOException {
            ujbVar.add(f64610b, kj5Var.getOriginAssociatedProductId());
        }
    }

    /* JADX INFO: renamed from: ni0$g */
    public static final class C9887g implements tjb<mj5> {

        /* JADX INFO: renamed from: a */
        public static final C9887g f64611a = new C9887g();

        /* JADX INFO: renamed from: b */
        public static final ar5 f64612b = ar5.m2545of("prequest");

        private C9887g() {
        }

        @Override // p000.l15
        public void encode(mj5 mj5Var, ujb ujbVar) throws IOException {
            ujbVar.add(f64612b, mj5Var.getPrequest());
        }
    }

    /* JADX INFO: renamed from: ni0$h */
    public static final class C9888h implements tjb<di9> {

        /* JADX INFO: renamed from: a */
        public static final C9888h f64613a = new C9888h();

        /* JADX INFO: renamed from: b */
        public static final ar5 f64614b = ar5.m2545of("eventTimeMs");

        /* JADX INFO: renamed from: c */
        public static final ar5 f64615c = ar5.m2545of("eventCode");

        /* JADX INFO: renamed from: d */
        public static final ar5 f64616d = ar5.m2545of("complianceData");

        /* JADX INFO: renamed from: e */
        public static final ar5 f64617e = ar5.m2545of("eventUptimeMs");

        /* JADX INFO: renamed from: f */
        public static final ar5 f64618f = ar5.m2545of("sourceExtension");

        /* JADX INFO: renamed from: g */
        public static final ar5 f64619g = ar5.m2545of("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: h */
        public static final ar5 f64620h = ar5.m2545of("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: i */
        public static final ar5 f64621i = ar5.m2545of("networkConnectionInfo");

        /* JADX INFO: renamed from: j */
        public static final ar5 f64622j = ar5.m2545of("experimentIds");

        private C9888h() {
        }

        @Override // p000.l15
        public void encode(di9 di9Var, ujb ujbVar) throws IOException {
            ujbVar.add(f64614b, di9Var.getEventTimeMs());
            ujbVar.add(f64615c, di9Var.getEventCode());
            ujbVar.add(f64616d, di9Var.getComplianceData());
            ujbVar.add(f64617e, di9Var.getEventUptimeMs());
            ujbVar.add(f64618f, di9Var.getSourceExtension());
            ujbVar.add(f64619g, di9Var.getSourceExtensionJsonProto3());
            ujbVar.add(f64620h, di9Var.getTimezoneOffsetSeconds());
            ujbVar.add(f64621i, di9Var.getNetworkConnectionInfo());
            ujbVar.add(f64622j, di9Var.getExperimentIds());
        }
    }

    /* JADX INFO: renamed from: ni0$i */
    public static final class C9889i implements tjb<ni9> {

        /* JADX INFO: renamed from: a */
        public static final C9889i f64623a = new C9889i();

        /* JADX INFO: renamed from: b */
        public static final ar5 f64624b = ar5.m2545of("requestTimeMs");

        /* JADX INFO: renamed from: c */
        public static final ar5 f64625c = ar5.m2545of("requestUptimeMs");

        /* JADX INFO: renamed from: d */
        public static final ar5 f64626d = ar5.m2545of("clientInfo");

        /* JADX INFO: renamed from: e */
        public static final ar5 f64627e = ar5.m2545of("logSource");

        /* JADX INFO: renamed from: f */
        public static final ar5 f64628f = ar5.m2545of("logSourceName");

        /* JADX INFO: renamed from: g */
        public static final ar5 f64629g = ar5.m2545of("logEvent");

        /* JADX INFO: renamed from: h */
        public static final ar5 f64630h = ar5.m2545of("qosTier");

        private C9889i() {
        }

        @Override // p000.l15
        public void encode(ni9 ni9Var, ujb ujbVar) throws IOException {
            ujbVar.add(f64624b, ni9Var.getRequestTimeMs());
            ujbVar.add(f64625c, ni9Var.getRequestUptimeMs());
            ujbVar.add(f64626d, ni9Var.getClientInfo());
            ujbVar.add(f64627e, ni9Var.getLogSource());
            ujbVar.add(f64628f, ni9Var.getLogSourceName());
            ujbVar.add(f64629g, ni9Var.getLogEvents());
            ujbVar.add(f64630h, ni9Var.getQosTier());
        }
    }

    /* JADX INFO: renamed from: ni0$j */
    public static final class C9890j implements tjb<gbb> {

        /* JADX INFO: renamed from: a */
        public static final C9890j f64631a = new C9890j();

        /* JADX INFO: renamed from: b */
        public static final ar5 f64632b = ar5.m2545of("networkType");

        /* JADX INFO: renamed from: c */
        public static final ar5 f64633c = ar5.m2545of("mobileSubtype");

        private C9890j() {
        }

        @Override // p000.l15
        public void encode(gbb gbbVar, ujb ujbVar) throws IOException {
            ujbVar.add(f64632b, gbbVar.getNetworkType());
            ujbVar.add(f64633c, gbbVar.getMobileSubtype());
        }
    }

    private ni0() {
    }

    @Override // p000.tq2
    public void configure(o15<?> o15Var) {
        C9882b c9882b = C9882b.f64598a;
        o15Var.registerEncoder(ax0.class, c9882b);
        o15Var.registerEncoder(kj0.class, c9882b);
        C9889i c9889i = C9889i.f64623a;
        o15Var.registerEncoder(ni9.class, c9889i);
        o15Var.registerEncoder(hl0.class, c9889i);
        C9883c c9883c = C9883c.f64600a;
        o15Var.registerEncoder(c42.class, c9883c);
        o15Var.registerEncoder(lj0.class, c9883c);
        C9881a c9881a = C9881a.f64585a;
        o15Var.registerEncoder(AbstractC6463gq.class, c9881a);
        o15Var.registerEncoder(hj0.class, c9881a);
        C9888h c9888h = C9888h.f64613a;
        o15Var.registerEncoder(di9.class, c9888h);
        o15Var.registerEncoder(gl0.class, c9888h);
        C9884d c9884d = C9884d.f64603a;
        o15Var.registerEncoder(wi2.class, c9884d);
        o15Var.registerEncoder(mj0.class, c9884d);
        C9887g c9887g = C9887g.f64611a;
        o15Var.registerEncoder(mj5.class, c9887g);
        o15Var.registerEncoder(vk0.class, c9887g);
        C9886f c9886f = C9886f.f64609a;
        o15Var.registerEncoder(kj5.class, c9886f);
        o15Var.registerEncoder(uk0.class, c9886f);
        C9890j c9890j = C9890j.f64631a;
        o15Var.registerEncoder(gbb.class, c9890j);
        o15Var.registerEncoder(jl0.class, c9890j);
        C9885e c9885e = C9885e.f64606a;
        o15Var.registerEncoder(cg5.class, c9885e);
        o15Var.registerEncoder(tk0.class, c9885e);
    }
}
