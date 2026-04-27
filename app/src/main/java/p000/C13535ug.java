package p000;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import p000.e5e;
import p000.p7e;

/* JADX INFO: renamed from: ug */
/* JADX INFO: loaded from: classes3.dex */
@e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
@dwf({"SMAP\nAdSelectionManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n314#2,11:242\n*S KotlinDebug\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon\n*L\n50#1:231,11\n70#1:242,11\n*E\n"})
@p7e({p7e.EnumC10826a.f69934a})
@igg({"NewApi", "ClassVerificationFailure"})
public class C13535ug extends AbstractC6300gg {

    /* JADX INFO: renamed from: b */
    @yfb
    public final AdSelectionManager f87937b;

    /* JADX INFO: renamed from: ug$a */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    public static final class a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C16539a f87938a = new C16539a(null);

        /* JADX INFO: renamed from: ug$a$a, reason: collision with other inner class name */
        @dwf({"SMAP\nAdSelectionManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n314#2,11:242\n314#2,11:253\n*S KotlinDebug\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion\n*L\n146#1:231,11\n165#1:242,11\n182#1:253,11\n*E\n"})
        public static final class C16539a {

            /* JADX INFO: renamed from: ug$a$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", m4010f = "AdSelectionManagerImplCommon.kt", m4011i = {0, 0}, m4012l = {231}, m4013m = "getAdSelectionData", m4014n = {"adSelectionManager", "getAdSelectionDataRequest"}, m4015s = {"L$0", "L$1"})
            public static final class C16540a extends cz2 {

                /* JADX INFO: renamed from: a */
                public Object f87939a;

                /* JADX INFO: renamed from: b */
                public Object f87940b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f87941c;

                /* JADX INFO: renamed from: e */
                public int f87943e;

                public C16540a(zy2<? super C16540a> zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    this.f87941c = obj;
                    this.f87943e |= Integer.MIN_VALUE;
                    return C16539a.this.getAdSelectionData(null, null, this);
                }
            }

            /* JADX INFO: renamed from: ug$a$a$b */
            @ck3(m4009c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", m4010f = "AdSelectionManagerImplCommon.kt", m4011i = {0, 0}, m4012l = {231}, m4013m = "persistAdSelectionResult", m4014n = {"adSelectionManager", "persistAdSelectionResultRequest"}, m4015s = {"L$0", "L$1"})
            public static final class b extends cz2 {

                /* JADX INFO: renamed from: a */
                public Object f87944a;

                /* JADX INFO: renamed from: b */
                public Object f87945b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f87946c;

                /* JADX INFO: renamed from: e */
                public int f87948e;

                public b(zy2<? super b> zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    this.f87946c = obj;
                    this.f87948e |= Integer.MIN_VALUE;
                    return C16539a.this.persistAdSelectionResult(null, null, this);
                }
            }

            /* JADX INFO: renamed from: ug$a$a$c */
            @ck3(m4009c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", m4010f = "AdSelectionManagerImplCommon.kt", m4011i = {0, 0}, m4012l = {231}, m4013m = "selectAds", m4014n = {"adSelectionManager", "adSelectionFromOutcomesConfig"}, m4015s = {"L$0", "L$1"})
            public static final class c extends cz2 {

                /* JADX INFO: renamed from: a */
                public Object f87949a;

                /* JADX INFO: renamed from: b */
                public Object f87950b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f87951c;

                /* JADX INFO: renamed from: e */
                public int f87953e;

                public c(zy2<? super c> zy2Var) {
                    super(zy2Var);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    this.f87951c = obj;
                    this.f87953e |= Integer.MIN_VALUE;
                    return C16539a.this.selectAds(null, null, this);
                }
            }

            public /* synthetic */ C16539a(jt3 jt3Var) {
                this();
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @p000.gib
            @p000.ih4
            @p000.j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object getAdSelectionData(@p000.yfb android.adservices.adselection.AdSelectionManager r5, @p000.yfb p000.o37 r6, @p000.yfb p000.zy2<? super p000.k37> r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof p000.C13535ug.a.C16539a.C16540a
                    if (r0 == 0) goto L13
                    r0 = r7
                    ug$a$a$a r0 = (p000.C13535ug.a.C16539a.C16540a) r0
                    int r1 = r0.f87943e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f87943e = r1
                    goto L18
                L13:
                    ug$a$a$a r0 = new ug$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f87941c
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f87943e
                    r3 = 1
                    if (r2 == 0) goto L3a
                    if (r2 != r3) goto L32
                    java.lang.Object r5 = r0.f87940b
                    o37 r5 = (p000.o37) r5
                    java.lang.Object r5 = r0.f87939a
                    p000.C8356kg.m14733a(r5)
                    p000.y7e.throwOnFailure(r7)
                    goto L6f
                L32:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L3a:
                    p000.y7e.throwOnFailure(r7)
                    r0.f87939a = r5
                    r0.f87940b = r6
                    r0.f87943e = r3
                    fq1 r7 = new fq1
                    zy2 r2 = p000.od8.intercepted(r0)
                    r7.<init>(r2, r3)
                    r7.initCancellability()
                    android.adservices.adselection.GetAdSelectionDataRequest r6 = r6.convertToAdServices$ads_adservices_release()
                    p63 r2 = new p63
                    r2.<init>()
                    android.os.OutcomeReceiver r3 = p000.k8c.asOutcomeReceiver(r7)
                    p000.C12067rg.m21287a(r5, r6, r2, r3)
                    java.lang.Object r7 = r7.getResult()
                    java.lang.Object r5 = p000.pd8.getCOROUTINE_SUSPENDED()
                    if (r7 != r5) goto L6c
                    p000.jk3.probeCoroutineSuspended(r0)
                L6c:
                    if (r7 != r1) goto L6f
                    return r1
                L6f:
                    android.adservices.adselection.GetAdSelectionDataOutcome r5 = p000.C12562sg.m21937a(r7)
                    k37 r6 = new k37
                    r6.<init>(r5)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C13535ug.a.C16539a.getAdSelectionData(android.adservices.adselection.AdSelectionManager, o37, zy2):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @p000.gib
            @p000.ih4
            @p000.j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object persistAdSelectionResult(@p000.yfb android.adservices.adselection.AdSelectionManager r5, @p000.yfb p000.cqc r6, @p000.yfb p000.zy2<? super p000.C16117zg> r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof p000.C13535ug.a.C16539a.b
                    if (r0 == 0) goto L13
                    r0 = r7
                    ug$a$a$b r0 = (p000.C13535ug.a.C16539a.b) r0
                    int r1 = r0.f87948e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f87948e = r1
                    goto L18
                L13:
                    ug$a$a$b r0 = new ug$a$a$b
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f87946c
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f87948e
                    r3 = 1
                    if (r2 == 0) goto L3a
                    if (r2 != r3) goto L32
                    java.lang.Object r5 = r0.f87945b
                    cqc r5 = (p000.cqc) r5
                    java.lang.Object r5 = r0.f87944a
                    p000.C8356kg.m14733a(r5)
                    p000.y7e.throwOnFailure(r7)
                    goto L6f
                L32:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L3a:
                    p000.y7e.throwOnFailure(r7)
                    r0.f87944a = r5
                    r0.f87945b = r6
                    r0.f87948e = r3
                    fq1 r7 = new fq1
                    zy2 r2 = p000.od8.intercepted(r0)
                    r7.<init>(r2, r3)
                    r7.initCancellability()
                    android.adservices.adselection.PersistAdSelectionResultRequest r6 = r6.convertToAdServices$ads_adservices_release()
                    p63 r2 = new p63
                    r2.<init>()
                    android.os.OutcomeReceiver r3 = p000.k8c.asOutcomeReceiver(r7)
                    p000.C13019tg.m22494a(r5, r6, r2, r3)
                    java.lang.Object r7 = r7.getResult()
                    java.lang.Object r5 = p000.pd8.getCOROUTINE_SUSPENDED()
                    if (r7 != r5) goto L6c
                    p000.jk3.probeCoroutineSuspended(r0)
                L6c:
                    if (r7 != r1) goto L6f
                    return r1
                L6f:
                    android.adservices.adselection.AdSelectionOutcome r5 = p000.C9867ng.m17929a(r7)
                    zg r6 = new zg
                    r6.<init>(r5)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C13535ug.a.C16539a.persistAdSelectionResult(android.adservices.adselection.AdSelectionManager, cqc, zy2):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @p000.gib
            @p000.ih4
            @p000.j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object selectAds(@p000.yfb android.adservices.adselection.AdSelectionManager r5, @p000.yfb p000.C5796fg r6, @p000.yfb p000.zy2<? super p000.C16117zg> r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof p000.C13535ug.a.C16539a.c
                    if (r0 == 0) goto L13
                    r0 = r7
                    ug$a$a$c r0 = (p000.C13535ug.a.C16539a.c) r0
                    int r1 = r0.f87953e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f87953e = r1
                    goto L18
                L13:
                    ug$a$a$c r0 = new ug$a$a$c
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f87951c
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f87953e
                    r3 = 1
                    if (r2 == 0) goto L3a
                    if (r2 != r3) goto L32
                    java.lang.Object r5 = r0.f87950b
                    fg r5 = (p000.C5796fg) r5
                    java.lang.Object r5 = r0.f87949a
                    p000.C8356kg.m14733a(r5)
                    p000.y7e.throwOnFailure(r7)
                    goto L6f
                L32:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L3a:
                    p000.y7e.throwOnFailure(r7)
                    r0.f87949a = r5
                    r0.f87950b = r6
                    r0.f87953e = r3
                    fq1 r7 = new fq1
                    zy2 r2 = p000.od8.intercepted(r0)
                    r7.<init>(r2, r3)
                    r7.initCancellability()
                    android.adservices.adselection.AdSelectionFromOutcomesConfig r6 = r6.convertToAdServices$ads_adservices_release()
                    p63 r2 = new p63
                    r2.<init>()
                    android.os.OutcomeReceiver r3 = p000.k8c.asOutcomeReceiver(r7)
                    p000.C11472qg.m20353a(r5, r6, r2, r3)
                    java.lang.Object r7 = r7.getResult()
                    java.lang.Object r5 = p000.pd8.getCOROUTINE_SUSPENDED()
                    if (r7 != r5) goto L6c
                    p000.jk3.probeCoroutineSuspended(r0)
                L6c:
                    if (r7 != r1) goto L6f
                    return r1
                L6f:
                    android.adservices.adselection.AdSelectionOutcome r5 = p000.C9867ng.m17929a(r7)
                    zg r6 = new zg
                    r6.<init>(r5)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C13535ug.a.C16539a.selectAds(android.adservices.adselection.AdSelectionManager, fg, zy2):java.lang.Object");
            }

            private C16539a() {
            }
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ug$b */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 8), @e5e(extension = 31, version = 9)})
    public static final class b {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f87954a = new a(null);

        /* JADX INFO: renamed from: ug$b$a */
        @dwf({"SMAP\nAdSelectionManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n314#2,11:242\n*S KotlinDebug\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion\n*L\n204#1:231,11\n219#1:242,11\n*E\n"})
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @gib
            @ih4
            @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            public final Object reportEvent(@yfb AdSelectionManager adSelectionManager, @yfb u2e u2eVar, @yfb zy2<? super bth> zy2Var) {
                fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
                fq1Var.initCancellability();
                adSelectionManager.reportEvent(u2eVar.convertToAdServices$ads_adservices_release(), new p63(), k8c.asOutcomeReceiver(fq1Var));
                Object result = fq1Var.getResult();
                if (result == pd8.getCOROUTINE_SUSPENDED()) {
                    jk3.probeCoroutineSuspended(zy2Var);
                }
                return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
            }

            @gib
            @ih4
            @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            public final Object updateAdCounterHistogram(@yfb AdSelectionManager adSelectionManager, @yfb hwh hwhVar, @yfb zy2<? super bth> zy2Var) {
                fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
                fq1Var.initCancellability();
                adSelectionManager.updateAdCounterHistogram(hwhVar.convertToAdServices$ads_adservices_release(), new p63(), k8c.asOutcomeReceiver(fq1Var));
                Object result = fq1Var.getResult();
                if (result == pd8.getCOROUTINE_SUSPENDED()) {
                    jk3.probeCoroutineSuspended(zy2Var);
                }
                return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
            }

            private a() {
            }
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: ug$c */
    @ck3(m4009c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon", m4010f = "AdSelectionManagerImplCommon.kt", m4011i = {}, m4012l = {44}, m4013m = "selectAds$suspendImpl", m4014n = {}, m4015s = {})
    public static final class c extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f87955a;

        /* JADX INFO: renamed from: c */
        public int f87957c;

        public c(zy2<? super c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f87955a = obj;
            this.f87957c |= Integer.MIN_VALUE;
            return C13535ug.m23334f(C13535ug.this, null, this);
        }
    }

    public C13535ug(@yfb AdSelectionManager adSelectionManager) {
        md8.checkNotNullParameter(adSelectionManager, "mAdSelectionManager");
        this.f87937b = adSelectionManager;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m23330a(C13535ug c13535ug, o37 o37Var, zy2<? super k37> zy2Var) {
        C2307ch c2307ch = C2307ch.f16504a;
        if (c2307ch.adServicesVersion() >= 10 || c2307ch.extServicesVersionS() >= 10) {
            return a.f87938a.getAdSelectionData(c13535ug.f87937b, o37Var, zy2Var);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m23331c(C13535ug c13535ug, cqc cqcVar, zy2<? super C16117zg> zy2Var) {
        C2307ch c2307ch = C2307ch.f16504a;
        if (c2307ch.adServicesVersion() >= 10 || c2307ch.extServicesVersionS() >= 10) {
            return a.f87938a.persistAdSelectionResult(c13535ug.f87937b, cqcVar, zy2Var);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m23332d(C13535ug c13535ug, u2e u2eVar, zy2<? super bth> zy2Var) {
        C2307ch c2307ch = C2307ch.f16504a;
        if (c2307ch.adServicesVersion() < 8 && c2307ch.extServicesVersionS() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objReportEvent = b.f87954a.reportEvent(c13535ug.f87937b, u2eVar, zy2Var);
        return objReportEvent == pd8.getCOROUTINE_SUSPENDED() ? objReportEvent : bth.f14751a;
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m23333e(C13535ug c13535ug, d3e d3eVar, zy2<? super bth> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        c13535ug.m23337b().reportImpression(d3eVar.convertToAdServices$ads_adservices_release(), new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.ih4
    @p000.j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m23334f(p000.C13535ug r4, p000.C15642yf r5, p000.zy2<? super p000.C16117zg> r6) {
        /*
            boolean r0 = r6 instanceof p000.C13535ug.c
            if (r0 == 0) goto L13
            r0 = r6
            ug$c r0 = (p000.C13535ug.c) r0
            int r1 = r0.f87957c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87957c = r1
            goto L18
        L13:
            ug$c r0 = new ug$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f87955a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f87957c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000.y7e.throwOnFailure(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            p000.y7e.throwOnFailure(r6)
            android.adservices.adselection.AdSelectionConfig r5 = r5.convertToAdServices$ads_adservices_release()
            r0.f87957c = r3
            java.lang.Object r6 = r4.selectAdsInternal(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            android.adservices.adselection.AdSelectionOutcome r4 = p000.C9867ng.m17929a(r6)
            zg r5 = new zg
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C13535ug.m23334f(ug, yf, zy2):java.lang.Object");
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m23335g(C13535ug c13535ug, C5796fg c5796fg, zy2<? super C16117zg> zy2Var) {
        C2307ch c2307ch = C2307ch.f16504a;
        if (c2307ch.adServicesVersion() >= 10 || c2307ch.extServicesVersionS() >= 10) {
            return a.f87938a.selectAds(c13535ug.f87937b, c5796fg, zy2Var);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m23336h(C13535ug c13535ug, hwh hwhVar, zy2<? super bth> zy2Var) {
        C2307ch c2307ch = C2307ch.f16504a;
        if (c2307ch.adServicesVersion() < 8 && c2307ch.extServicesVersionS() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objUpdateAdCounterHistogram = b.f87954a.updateAdCounterHistogram(c13535ug.f87937b, hwhVar, zy2Var);
        return objUpdateAdCounterHistogram == pd8.getCOROUTINE_SUSPENDED() ? objUpdateAdCounterHistogram : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public final Object selectAdsInternal(AdSelectionConfig adSelectionConfig, zy2<? super AdSelectionOutcome> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        m23337b().selectAds(adSelectionConfig, new p63(), k8c.asOutcomeReceiver(fq1Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final AdSelectionManager m23337b() {
        return this.f87937b;
    }

    @Override // p000.AbstractC6300gg
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public Object getAdSelectionData(@yfb o37 o37Var, @yfb zy2<? super k37> zy2Var) {
        return m23330a(this, o37Var, zy2Var);
    }

    @Override // p000.AbstractC6300gg
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public Object persistAdSelectionResult(@yfb cqc cqcVar, @yfb zy2<? super C16117zg> zy2Var) {
        return m23331c(this, cqcVar, zy2Var);
    }

    @Override // p000.AbstractC6300gg
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public Object reportEvent(@yfb u2e u2eVar, @yfb zy2<? super bth> zy2Var) {
        return m23332d(this, u2eVar, zy2Var);
    }

    @Override // p000.AbstractC6300gg
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public Object reportImpression(@yfb d3e d3eVar, @yfb zy2<? super bth> zy2Var) {
        return m23333e(this, d3eVar, zy2Var);
    }

    @Override // p000.AbstractC6300gg
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public Object selectAds(@yfb C15642yf c15642yf, @yfb zy2<? super C16117zg> zy2Var) {
        return m23334f(this, c15642yf, zy2Var);
    }

    @Override // p000.AbstractC6300gg
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public Object updateAdCounterHistogram(@yfb hwh hwhVar, @yfb zy2<? super bth> zy2Var) {
        return m23336h(this, hwhVar, zy2Var);
    }

    @Override // p000.AbstractC6300gg
    @gib
    @ih4
    @j5e("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public Object selectAds(@yfb C5796fg c5796fg, @yfb zy2<? super C16117zg> zy2Var) {
        return m23335g(this, c5796fg, zy2Var);
    }
}
