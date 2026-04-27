package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class ej0 implements tq2 {

    /* JADX INFO: renamed from: a */
    public static final int f33130a = 2;

    /* JADX INFO: renamed from: b */
    public static final tq2 f33131b = new ej0();

    /* JADX INFO: renamed from: ej0$a */
    public static final class C5331a implements tjb<C12176ro> {

        /* JADX INFO: renamed from: a */
        public static final C5331a f33132a = new C5331a();

        /* JADX INFO: renamed from: b */
        public static final ar5 f33133b = ar5.m2545of("packageName");

        /* JADX INFO: renamed from: c */
        public static final ar5 f33134c = ar5.m2545of("versionName");

        /* JADX INFO: renamed from: d */
        public static final ar5 f33135d = ar5.m2545of("appBuildVersion");

        /* JADX INFO: renamed from: e */
        public static final ar5 f33136e = ar5.m2545of("deviceManufacturer");

        /* JADX INFO: renamed from: f */
        public static final ar5 f33137f = ar5.m2545of("currentProcessDetails");

        /* JADX INFO: renamed from: g */
        public static final ar5 f33138g = ar5.m2545of("appProcessDetails");

        private C5331a() {
        }

        @Override // p000.l15
        public void encode(C12176ro c12176ro, ujb ujbVar) throws IOException {
            ujbVar.add(f33133b, c12176ro.getPackageName());
            ujbVar.add(f33134c, c12176ro.getVersionName());
            ujbVar.add(f33135d, c12176ro.getAppBuildVersion());
            ujbVar.add(f33136e, c12176ro.getDeviceManufacturer());
            ujbVar.add(f33137f, c12176ro.getCurrentProcessDetails());
            ujbVar.add(f33138g, c12176ro.getAppProcessDetails());
        }
    }

    /* JADX INFO: renamed from: ej0$b */
    public static final class C5332b implements tjb<k40> {

        /* JADX INFO: renamed from: a */
        public static final C5332b f33139a = new C5332b();

        /* JADX INFO: renamed from: b */
        public static final ar5 f33140b = ar5.m2545of("appId");

        /* JADX INFO: renamed from: c */
        public static final ar5 f33141c = ar5.m2545of("deviceModel");

        /* JADX INFO: renamed from: d */
        public static final ar5 f33142d = ar5.m2545of("sessionSdkVersion");

        /* JADX INFO: renamed from: e */
        public static final ar5 f33143e = ar5.m2545of("osVersion");

        /* JADX INFO: renamed from: f */
        public static final ar5 f33144f = ar5.m2545of("logEnvironment");

        /* JADX INFO: renamed from: g */
        public static final ar5 f33145g = ar5.m2545of("androidAppInfo");

        private C5332b() {
        }

        @Override // p000.l15
        public void encode(k40 k40Var, ujb ujbVar) throws IOException {
            ujbVar.add(f33140b, k40Var.getAppId());
            ujbVar.add(f33141c, k40Var.getDeviceModel());
            ujbVar.add(f33142d, k40Var.getSessionSdkVersion());
            ujbVar.add(f33143e, k40Var.getOsVersion());
            ujbVar.add(f33144f, k40Var.getLogEnvironment());
            ujbVar.add(f33145g, k40Var.getAndroidAppInfo());
        }
    }

    /* JADX INFO: renamed from: ej0$c */
    public static final class C5333c implements tjb<xf3> {

        /* JADX INFO: renamed from: a */
        public static final C5333c f33146a = new C5333c();

        /* JADX INFO: renamed from: b */
        public static final ar5 f33147b = ar5.m2545of("performance");

        /* JADX INFO: renamed from: c */
        public static final ar5 f33148c = ar5.m2545of("crashlytics");

        /* JADX INFO: renamed from: d */
        public static final ar5 f33149d = ar5.m2545of("sessionSamplingRate");

        private C5333c() {
        }

        @Override // p000.l15
        public void encode(xf3 xf3Var, ujb ujbVar) throws IOException {
            ujbVar.add(f33147b, xf3Var.getPerformance());
            ujbVar.add(f33148c, xf3Var.getCrashlytics());
            ujbVar.add(f33149d, xf3Var.getSessionSamplingRate());
        }
    }

    /* JADX INFO: renamed from: ej0$d */
    public static final class C5334d implements tjb<ycd> {

        /* JADX INFO: renamed from: a */
        public static final C5334d f33150a = new C5334d();

        /* JADX INFO: renamed from: b */
        public static final ar5 f33151b = ar5.m2545of("processName");

        /* JADX INFO: renamed from: c */
        public static final ar5 f33152c = ar5.m2545of("pid");

        /* JADX INFO: renamed from: d */
        public static final ar5 f33153d = ar5.m2545of("importance");

        /* JADX INFO: renamed from: e */
        public static final ar5 f33154e = ar5.m2545of("defaultProcess");

        private C5334d() {
        }

        @Override // p000.l15
        public void encode(ycd ycdVar, ujb ujbVar) throws IOException {
            ujbVar.add(f33151b, ycdVar.getProcessName());
            ujbVar.add(f33152c, ycdVar.getPid());
            ujbVar.add(f33153d, ycdVar.getImportance());
            ujbVar.add(f33154e, ycdVar.isDefaultProcess());
        }
    }

    /* JADX INFO: renamed from: ej0$e */
    public static final class C5335e implements tjb<e5f> {

        /* JADX INFO: renamed from: a */
        public static final C5335e f33155a = new C5335e();

        /* JADX INFO: renamed from: b */
        public static final ar5 f33156b = ar5.m2545of("eventType");

        /* JADX INFO: renamed from: c */
        public static final ar5 f33157c = ar5.m2545of("sessionData");

        /* JADX INFO: renamed from: d */
        public static final ar5 f33158d = ar5.m2545of("applicationInfo");

        private C5335e() {
        }

        @Override // p000.l15
        public void encode(e5f e5fVar, ujb ujbVar) throws IOException {
            ujbVar.add(f33156b, e5fVar.getEventType());
            ujbVar.add(f33157c, e5fVar.getSessionData());
            ujbVar.add(f33158d, e5fVar.getApplicationInfo());
        }
    }

    /* JADX INFO: renamed from: ej0$f */
    public static final class C5336f implements tjb<n5f> {

        /* JADX INFO: renamed from: a */
        public static final C5336f f33159a = new C5336f();

        /* JADX INFO: renamed from: b */
        public static final ar5 f33160b = ar5.m2545of("sessionId");

        /* JADX INFO: renamed from: c */
        public static final ar5 f33161c = ar5.m2545of("firstSessionId");

        /* JADX INFO: renamed from: d */
        public static final ar5 f33162d = ar5.m2545of("sessionIndex");

        /* JADX INFO: renamed from: e */
        public static final ar5 f33163e = ar5.m2545of("eventTimestampUs");

        /* JADX INFO: renamed from: f */
        public static final ar5 f33164f = ar5.m2545of("dataCollectionStatus");

        /* JADX INFO: renamed from: g */
        public static final ar5 f33165g = ar5.m2545of("firebaseInstallationId");

        /* JADX INFO: renamed from: h */
        public static final ar5 f33166h = ar5.m2545of("firebaseAuthenticationToken");

        private C5336f() {
        }

        @Override // p000.l15
        public void encode(n5f n5fVar, ujb ujbVar) throws IOException {
            ujbVar.add(f33160b, n5fVar.getSessionId());
            ujbVar.add(f33161c, n5fVar.getFirstSessionId());
            ujbVar.add(f33162d, n5fVar.getSessionIndex());
            ujbVar.add(f33163e, n5fVar.getEventTimestampUs());
            ujbVar.add(f33164f, n5fVar.getDataCollectionStatus());
            ujbVar.add(f33165g, n5fVar.getFirebaseInstallationId());
            ujbVar.add(f33166h, n5fVar.getFirebaseAuthenticationToken());
        }
    }

    private ej0() {
    }

    @Override // p000.tq2
    public void configure(o15<?> o15Var) {
        o15Var.registerEncoder(e5f.class, C5335e.f33155a);
        o15Var.registerEncoder(n5f.class, C5336f.f33159a);
        o15Var.registerEncoder(xf3.class, C5333c.f33146a);
        o15Var.registerEncoder(k40.class, C5332b.f33139a);
        o15Var.registerEncoder(C12176ro.class, C5331a.f33132a);
        o15Var.registerEncoder(ycd.class, C5334d.f33150a);
    }
}
