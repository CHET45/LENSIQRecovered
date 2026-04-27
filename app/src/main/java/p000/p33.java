package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public class p33 {

    /* JADX INFO: renamed from: A */
    public static final String f69523A = "crash_marker";

    /* JADX INFO: renamed from: r */
    public static final String f69524r = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin";

    /* JADX INFO: renamed from: s */
    public static final int f69525s = 1024;

    /* JADX INFO: renamed from: t */
    public static final int f69526t = 10;

    /* JADX INFO: renamed from: u */
    public static final String f69527u = "com.crashlytics.RequireBuildId";

    /* JADX INFO: renamed from: v */
    public static final boolean f69528v = true;

    /* JADX INFO: renamed from: w */
    public static final int f69529w = 3;

    /* JADX INFO: renamed from: x */
    public static final String f69530x = "com.crashlytics.on-demand.recorded-exceptions";

    /* JADX INFO: renamed from: y */
    public static final String f69531y = "com.crashlytics.on-demand.dropped-exceptions";

    /* JADX INFO: renamed from: z */
    public static final String f69532z = "initialization_marker";

    /* JADX INFO: renamed from: a */
    public final Context f69533a;

    /* JADX INFO: renamed from: b */
    public final lw5 f69534b;

    /* JADX INFO: renamed from: c */
    public final tf3 f69535c;

    /* JADX INFO: renamed from: f */
    public q33 f69538f;

    /* JADX INFO: renamed from: g */
    public q33 f69539g;

    /* JADX INFO: renamed from: h */
    public boolean f69540h;

    /* JADX INFO: renamed from: i */
    public c33 f69541i;

    /* JADX INFO: renamed from: j */
    public final jr7 f69542j;

    /* JADX INFO: renamed from: k */
    public final kt5 f69543k;

    /* JADX INFO: renamed from: l */
    @fdi
    public final ad1 f69544l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC16189zn f69545m;

    /* JADX INFO: renamed from: n */
    public final z23 f69546n;

    /* JADX INFO: renamed from: o */
    public final r33 f69547o;

    /* JADX INFO: renamed from: p */
    public final jyd f69548p;

    /* JADX INFO: renamed from: q */
    public final g53 f69549q;

    /* JADX INFO: renamed from: e */
    public final long f69537e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    public final n2c f69536d = new n2c();

    public p33(lw5 lw5Var, jr7 jr7Var, r33 r33Var, tf3 tf3Var, ad1 ad1Var, InterfaceC16189zn interfaceC16189zn, kt5 kt5Var, z23 z23Var, jyd jydVar, g53 g53Var) {
        this.f69534b = lw5Var;
        this.f69535c = tf3Var;
        this.f69533a = lw5Var.getApplicationContext();
        this.f69542j = jr7Var;
        this.f69547o = r33Var;
        this.f69544l = ad1Var;
        this.f69545m = interfaceC16189zn;
        this.f69543k = kt5Var;
        this.f69546n = z23Var;
        this.f69548p = jydVar;
        this.f69549q = g53Var;
    }

    private void checkForPreviousCrash() {
        try {
            this.f69540h = Boolean.TRUE.equals((Boolean) this.f69549q.f38789a.getExecutor().submit(new Callable() { // from class: n33
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f63112a.lambda$checkForPreviousCrash$10();
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f69540h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: doBackgroundInitialization, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$finishInitSynchronously$9(q7f q7fVar) {
        g53.checkBackgroundThread();
        m19206p();
        try {
            try {
                this.f69544l.registerBreadcrumbHandler(new zc1() { // from class: g33
                    @Override // p000.zc1
                    public final void handleBreadcrumb(String str) {
                        this.f38314a.log(str);
                    }
                });
                this.f69541i.m3717C();
            } catch (Exception e) {
                ej9.getLogger().m10064e("Crashlytics encountered a problem during asynchronous initialization.", e);
            }
            if (!q7fVar.getSettingsSync().f576b.f583a) {
                ej9.getLogger().m10061d("Collection of crash reports disabled in Crashlytics settings.");
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            if (!this.f69541i.m3731s(q7fVar)) {
                ej9.getLogger().m10069w("Previous sessions could not be finalized.");
            }
            this.f69541i.m3723I(q7fVar.getSettingsAsync());
            m19205o();
        } catch (Throwable th) {
            m19205o();
            throw th;
        }
    }

    private void finishInitSynchronously(final q7f q7fVar) {
        Future<?> futureSubmit = this.f69549q.f38789a.getExecutor().submit(new Runnable() { // from class: f33
            @Override // java.lang.Runnable
            public final void run() {
                this.f34945a.lambda$finishInitSynchronously$9(q7fVar);
            }
        });
        ej9.getLogger().m10061d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            ej9.getLogger().m10064e("Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            ej9.getLogger().m10064e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            ej9.getLogger().m10064e("Crashlytics timed out during initialization.", e3);
        }
    }

    public static String getVersion() {
        return "20.0.3";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$checkForPreviousCrash$10() throws Exception {
        return Boolean.valueOf(this.f69541i.m3728p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$log$2(long j, String str) {
        this.f69541i.m3725K(j, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$log$3(final long j, final String str) {
        this.f69549q.f38790b.submit(new Runnable() { // from class: m33
            @Override // java.lang.Runnable
            public final void run() {
                this.f59802a.lambda$log$2(j, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logException$1(Throwable th, Map map) {
        this.f69541i.m3724J(Thread.currentThread(), th, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logFatalException$8(Throwable th) {
        this.f69541i.m3721G(f69530x, Integer.toString(this.f69536d.getRecordedOnDemandExceptions()));
        this.f69541i.m3721G(f69531y, Integer.toString(this.f69536d.getDroppedOnDemandExceptions()));
        this.f69541i.m3715A(Thread.currentThread(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCustomKey$5(String str, String str2) {
        this.f69541i.m3719E(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCustomKeys$6(Map map) {
        this.f69541i.m3720F(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setInternalKey$7(String str, String str2) {
        this.f69541i.m3721G(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUserId$4(String str) {
        this.f69541i.m3722H(str);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m19202n(String str, boolean z) {
        if (!z) {
            ej9.getLogger().m10067v("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e(ej9.f33202c, ".");
        Log.e(ej9.f33202c, ".     |  | ");
        Log.e(ej9.f33202c, ".     |  |");
        Log.e(ej9.f33202c, ".     |  |");
        Log.e(ej9.f33202c, ".   \\ |  | /");
        Log.e(ej9.f33202c, ".    \\    /");
        Log.e(ej9.f33202c, ".     \\  /");
        Log.e(ej9.f33202c, ".      \\/");
        Log.e(ej9.f33202c, ".");
        Log.e(ej9.f33202c, f69524r);
        Log.e(ej9.f33202c, ".");
        Log.e(ej9.f33202c, ".      /\\");
        Log.e(ej9.f33202c, ".     /  \\");
        Log.e(ej9.f33202c, ".    /    \\");
        Log.e(ej9.f33202c, ".   / |  | \\");
        Log.e(ej9.f33202c, ".     |  |");
        Log.e(ej9.f33202c, ".     |  |");
        Log.e(ej9.f33202c, ".     |  |");
        Log.e(ej9.f33202c, ".");
        return false;
    }

    @efb
    public Task<Boolean> checkForUnsentReports() {
        return this.f69541i.m3726n();
    }

    public Task<Void> deleteUnsentReports() {
        return this.f69541i.m3727o();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f69540h;
    }

    @op1
    public Task<Void> doBackgroundInitializationAsync(final q7f q7fVar) {
        return this.f69549q.f38789a.submit(new Runnable() { // from class: d33
            @Override // java.lang.Runnable
            public final void run() {
                this.f28310a.lambda$doBackgroundInitializationAsync$0(q7fVar);
            }
        });
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f69535c.isAutomaticDataCollectionEnabled();
    }

    /* JADX INFO: renamed from: l */
    public boolean m19203l() {
        return this.f69538f.isPresent();
    }

    public void log(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f69537e;
        this.f69549q.f38789a.submit(new Runnable() { // from class: o33
            @Override // java.lang.Runnable
            public final void run() {
                this.f66359a.lambda$log$3(jCurrentTimeMillis, str);
            }
        });
    }

    public void logException(@efb final Throwable th, @efb final Map<String, String> map) {
        this.f69549q.f38789a.submit(new Runnable() { // from class: l33
            @Override // java.lang.Runnable
            public final void run() {
                this.f56057a.lambda$logException$1(th, map);
            }
        });
    }

    public void logFatalException(final Throwable th) {
        ej9.getLogger().m10061d("Recorded on-demand fatal events: " + this.f69536d.getRecordedOnDemandExceptions());
        ej9.getLogger().m10061d("Dropped on-demand fatal events: " + this.f69536d.getDroppedOnDemandExceptions());
        this.f69549q.f38789a.submit(new Runnable() { // from class: h33
            @Override // java.lang.Runnable
            public final void run() {
                this.f42159a.lambda$logFatalException$8(th);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public c33 m19204m() {
        return this.f69541i;
    }

    /* JADX INFO: renamed from: o */
    public void m19205o() {
        g53.checkBackgroundThread();
        try {
            if (this.f69538f.remove()) {
                return;
            }
            ej9.getLogger().m10069w("Initialization marker file was not properly removed.");
        } catch (Exception e) {
            ej9.getLogger().m10064e("Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public boolean onPreExecute(d30 d30Var, q7f q7fVar) {
        if (!m19202n(d30Var.f28302b, lc2.getBooleanResourceValue(this.f69533a, f69527u, true))) {
            throw new IllegalStateException(f69524r);
        }
        String sessionId = new yk1().getSessionId();
        try {
            this.f69539g = new q33(f69523A, this.f69543k);
            this.f69538f = new q33(f69532z, this.f69543k);
            gzh gzhVar = new gzh(sessionId, this.f69543k, this.f69549q);
            gi9 gi9Var = new gi9(this.f69543k);
            lva lvaVar = new lva(1024, new gzd(10));
            this.f69548p.setupListener(gzhVar);
            this.f69541i = new c33(this.f69533a, this.f69542j, this.f69535c, this.f69543k, this.f69539g, d30Var, gzhVar, gi9Var, b6f.create(this.f69533a, this.f69542j, this.f69543k, d30Var, gi9Var, gzhVar, lvaVar, q7fVar, this.f69536d, this.f69546n, this.f69549q), this.f69547o, this.f69545m, this.f69546n, this.f69549q);
            boolean zM19203l = m19203l();
            checkForPreviousCrash();
            this.f69541i.m3730r(sessionId, Thread.getDefaultUncaughtExceptionHandler(), q7fVar);
            if (!zM19203l || !lc2.canTryConnection(this.f69533a)) {
                ej9.getLogger().m10061d("Successfully configured exception handler.");
                return true;
            }
            ej9.getLogger().m10061d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            finishInitSynchronously(q7fVar);
            return false;
        } catch (Exception e) {
            ej9.getLogger().m10064e("Crashlytics was not started due to an exception during initialization", e);
            this.f69541i = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m19206p() {
        g53.checkBackgroundThread();
        this.f69538f.create();
        ej9.getLogger().m10067v("Initialization marker file was created.");
    }

    public Task<Void> sendUnsentReports() {
        return this.f69541i.m3718D();
    }

    public void setCrashlyticsCollectionEnabled(@hib Boolean bool) {
        this.f69535c.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(final String str, final String str2) {
        this.f69549q.f38789a.submit(new Runnable() { // from class: j33
            @Override // java.lang.Runnable
            public final void run() {
                this.f49472a.lambda$setCustomKey$5(str, str2);
            }
        });
    }

    public void setCustomKeys(final Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        this.f69549q.f38789a.submit(new Runnable() { // from class: e33
            @Override // java.lang.Runnable
            public final void run() {
                this.f31624a.lambda$setCustomKeys$6(map);
            }
        });
    }

    public void setInternalKey(final String str, final String str2) {
        this.f69549q.f38789a.submit(new Runnable() { // from class: k33
            @Override // java.lang.Runnable
            public final void run() {
                this.f52491a.lambda$setInternalKey$7(str, str2);
            }
        });
    }

    public void setUserId(final String str) {
        this.f69549q.f38789a.submit(new Runnable() { // from class: i33
            @Override // java.lang.Runnable
            public final void run() {
                this.f45570a.lambda$setUserId$4(str);
            }
        });
    }
}
