package p000;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.u43;
import p000.z33;
import p000.z3g;

/* JADX INFO: loaded from: classes5.dex */
public class c33 {

    /* JADX INFO: renamed from: A */
    public static final String f15634A = "com.crashlytics.version-control-info";

    /* JADX INFO: renamed from: B */
    public static final String f15635B = "version-control-info.textproto";

    /* JADX INFO: renamed from: C */
    public static final String f15636C = "META-INF/";

    /* JADX INFO: renamed from: t */
    public static final String f15638t = "fatal";

    /* JADX INFO: renamed from: u */
    public static final String f15639u = "timestamp";

    /* JADX INFO: renamed from: v */
    public static final String f15640v = "_ae";

    /* JADX INFO: renamed from: w */
    public static final String f15641w = ".ae";

    /* JADX INFO: renamed from: y */
    public static final int f15643y = 1;

    /* JADX INFO: renamed from: z */
    public static final String f15644z = "Crashlytics Android SDK/%s";

    /* JADX INFO: renamed from: a */
    public final Context f15645a;

    /* JADX INFO: renamed from: b */
    public final tf3 f15646b;

    /* JADX INFO: renamed from: c */
    public final q33 f15647c;

    /* JADX INFO: renamed from: d */
    public final gzh f15648d;

    /* JADX INFO: renamed from: e */
    public final g53 f15649e;

    /* JADX INFO: renamed from: f */
    public final jr7 f15650f;

    /* JADX INFO: renamed from: g */
    public final kt5 f15651g;

    /* JADX INFO: renamed from: h */
    public final d30 f15652h;

    /* JADX INFO: renamed from: i */
    public final gi9 f15653i;

    /* JADX INFO: renamed from: j */
    public final r33 f15654j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC16189zn f15655k;

    /* JADX INFO: renamed from: l */
    public final z23 f15656l;

    /* JADX INFO: renamed from: m */
    public final b6f f15657m;

    /* JADX INFO: renamed from: n */
    public u43 f15658n;

    /* JADX INFO: renamed from: o */
    public q7f f15659o = null;

    /* JADX INFO: renamed from: p */
    public final TaskCompletionSource<Boolean> f15660p = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: q */
    public final TaskCompletionSource<Boolean> f15661q = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: r */
    public final TaskCompletionSource<Void> f15662r = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: s */
    public final AtomicBoolean f15663s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: x */
    public static final FilenameFilter f15642x = new FilenameFilter() { // from class: b33
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return c33.lambda$static$0(file, str);
        }
    };

    /* JADX INFO: renamed from: D */
    public static final Charset f15637D = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c33$a */
    public class C2176a implements u43.InterfaceC13356a {
        public C2176a() {
        }

        @Override // p000.u43.InterfaceC13356a
        public void onUncaughtException(@efb q7f q7fVar, @efb Thread thread, @efb Throwable th) {
            c33.this.m3734w(q7fVar, thread, th);
        }
    }

    /* JADX INFO: renamed from: c33$b */
    public class CallableC2177b implements Callable<Task<Void>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f15665a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f15666b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Thread f15667c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ q7f f15668d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f15669e;

        /* JADX INFO: renamed from: c33$b$a */
        public class a implements SuccessContinuation<a7f, Void> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f15671a;

            public a(String str) {
                this.f15671a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @efb
            public Task<Void> then(@hib a7f a7fVar) throws Exception {
                if (a7fVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{c33.this.logAnalyticsAppExceptionEvents(), c33.this.f15657m.sendReports(c33.this.f15649e.f38789a, CallableC2177b.this.f15669e ? this.f15671a : null)});
                }
                ej9.getLogger().m10069w("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        public CallableC2177b(long j, Throwable th, Thread thread, q7f q7fVar, boolean z) {
            this.f15665a = j;
            this.f15666b = th;
            this.f15667c = thread;
            this.f15668d = q7fVar;
            this.f15669e = z;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Task<Void> call() throws Exception {
            long timestampSeconds = c33.getTimestampSeconds(this.f15665a);
            String currentSessionId = c33.this.getCurrentSessionId();
            if (currentSessionId == null) {
                ej9.getLogger().m10063e("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            c33.this.f15647c.create();
            c33.this.f15657m.persistFatalEvent(this.f15666b, this.f15667c, currentSessionId, timestampSeconds);
            c33.this.doWriteAppExceptionMarker(this.f15665a);
            c33.this.m3729q(this.f15668d);
            c33.this.doOpenSession(new yk1().getSessionId(), Boolean.valueOf(this.f15669e));
            return !c33.this.f15646b.isAutomaticDataCollectionEnabled() ? Tasks.forResult(null) : this.f15668d.getSettingsAsync().onSuccessTask(c33.this.f15649e.f38789a, new a(currentSessionId));
        }
    }

    /* JADX INFO: renamed from: c33$c */
    public class C2178c implements SuccessContinuation<Void, Boolean> {
        public C2178c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @efb
        public Task<Boolean> then(@hib Void r1) throws Exception {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c33$d */
    public class C2179d implements SuccessContinuation<Boolean, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Task f15674a;

        /* JADX INFO: renamed from: c33$d$a */
        public class a implements SuccessContinuation<a7f, Void> {
            public a() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            @efb
            public Task<Void> then(@hib a7f a7fVar) throws Exception {
                if (a7fVar == null) {
                    ej9.getLogger().m10069w("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
                c33.this.logAnalyticsAppExceptionEvents();
                c33.this.f15657m.sendReports(c33.this.f15649e.f38789a);
                c33.this.f15662r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        public C2179d(Task task) {
            this.f15674a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @efb
        public Task<Void> then(@hib Boolean bool) throws Exception {
            if (bool.booleanValue()) {
                ej9.getLogger().m10061d("Sending cached crash reports...");
                c33.this.f15646b.grantDataCollectionPermission(bool.booleanValue());
                return this.f15674a.onSuccessTask(c33.this.f15649e.f38789a, new a());
            }
            ej9.getLogger().m10067v("Deleting cached crash reports...");
            c33.deleteFiles(c33.this.m3737z());
            c33.this.f15657m.removeAllReports();
            c33.this.f15662r.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    /* JADX INFO: renamed from: c33$e */
    public class CallableC2180e implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f15677a;

        public CallableC2180e(long j) {
            this.f15677a = j;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt(c33.f15638t, 1);
            bundle.putLong("timestamp", this.f15677a);
            c33.this.f15655k.logEvent("_ae", bundle);
            return null;
        }
    }

    public c33(Context context, jr7 jr7Var, tf3 tf3Var, kt5 kt5Var, q33 q33Var, d30 d30Var, gzh gzhVar, gi9 gi9Var, b6f b6fVar, r33 r33Var, InterfaceC16189zn interfaceC16189zn, z23 z23Var, g53 g53Var) {
        this.f15645a = context;
        this.f15650f = jr7Var;
        this.f15646b = tf3Var;
        this.f15651g = kt5Var;
        this.f15647c = q33Var;
        this.f15652h = d30Var;
        this.f15648d = gzhVar;
        this.f15653i = gi9Var;
        this.f15654j = r33Var;
        this.f15655k = interfaceC16189zn;
        this.f15656l = z23Var;
        this.f15657m = b6fVar;
        this.f15649e = g53Var;
    }

    private static z3g.AbstractC15979a createAppData(jr7 jr7Var, d30 d30Var) {
        return z3g.AbstractC15979a.create(jr7Var.getAppIdentifier(), d30Var.f28306f, d30Var.f28307g, jr7Var.getInstallIds().getCrashlyticsInstallId(), z54.determineFrom(d30Var.f28304d).getId(), d30Var.f28308h);
    }

    private static z3g.AbstractC15980b createDeviceData(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return z3g.AbstractC15980b.create(lc2.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), lc2.calculateTotalRamInBytes(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), lc2.isEmulator(), lc2.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static z3g.AbstractC15981c createOsData() {
        return z3g.AbstractC15981c.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, lc2.isRooted());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteFiles(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void doCloseSessions(boolean z, q7f q7fVar, boolean z2) {
        String str;
        g53.checkBackgroundThread();
        ArrayList arrayList = new ArrayList(this.f15657m.listSortedOpenSessionIds());
        if (arrayList.size() <= z) {
            ej9.getLogger().m10067v("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z ? 1 : 0);
        if (z2 && q7fVar.getSettingsSync().f576b.f584b) {
            writeApplicationExitInfoEventIfRelevant(str2);
        } else {
            ej9.getLogger().m10067v("ANR feature disabled.");
        }
        if (z2 && this.f15654j.hasCrashDataForSession(str2)) {
            finalizePreviousNativeSession(str2);
        }
        if (z != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f15656l.setSessionId(null);
            str = null;
        }
        this.f15657m.finalizeSessions(getCurrentTimestampSeconds(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOpenSession(String str, Boolean bool) {
        long currentTimestampSeconds = getCurrentTimestampSeconds();
        ej9.getLogger().m10061d("Opening a new session with ID " + str);
        this.f15654j.prepareNativeSession(str, String.format(Locale.US, f15644z, p33.getVersion()), currentTimestampSeconds, z3g.create(createAppData(this.f15650f, this.f15652h), createOsData(), createDeviceData(this.f15645a)));
        if (bool.booleanValue() && str != null) {
            this.f15648d.setNewSession(str);
        }
        this.f15653i.setCurrentSession(str);
        this.f15656l.setSessionId(str);
        this.f15657m.onBeginSession(str, currentTimestampSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doWriteAppExceptionMarker(long j) {
        try {
            if (this.f15651g.getCommonFile(f15641w + j).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            ej9.getLogger().m10070w("Could not create app exception marker file.", e);
        }
    }

    private void finalizePreviousNativeSession(String str) {
        ej9.getLogger().m10067v("Finalizing native report for session " + str);
        r9b sessionFileProvider = this.f15654j.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        z33.AbstractC15960a applicationExitInto = sessionFileProvider.getApplicationExitInto();
        if (nativeCoreAbsent(str, minidumpFile, applicationExitInto)) {
            ej9.getLogger().m10069w("No native core present");
            return;
        }
        long jLastModified = minidumpFile.lastModified();
        gi9 gi9Var = new gi9(this.f15651g, str);
        File nativeSessionDir = this.f15651g.getNativeSessionDir(str);
        if (!nativeSessionDir.isDirectory()) {
            ej9.getLogger().m10069w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        doWriteAppExceptionMarker(jLastModified);
        List<p9b> listM3714t = m3714t(sessionFileProvider, str, this.f15651g, gi9Var.getBytesForLog());
        q9b.m20180a(nativeSessionDir, listM3714t);
        ej9.getLogger().m10061d("CrashlyticsController#finalizePreviousNativeSession");
        this.f15657m.finalizeSessionWithNativeEvent(str, listM3714t, applicationExitInto);
        gi9Var.clearLog();
    }

    private static boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hib
    public String getCurrentSessionId() {
        SortedSet<String> sortedSetListSortedOpenSessionIds = this.f15657m.listSortedOpenSessionIds();
        if (sortedSetListSortedOpenSessionIds.isEmpty()) {
            return null;
        }
        return sortedSetListSortedOpenSessionIds.first();
    }

    private static long getCurrentTimestampSeconds() {
        return getTimestampSeconds(System.currentTimeMillis());
    }

    private InputStream getResourceAsStream(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        ej9.getLogger().m10069w("Couldn't get Class Loader");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getTimestampSeconds(long j) {
        return j / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openSession$1(String str) {
        doOpenSession(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(File file, String str) {
        return str.startsWith(f15641w);
    }

    private Task<Void> logAnalyticsAppExceptionEvent(long j) {
        if (firebaseCrashExists()) {
            ej9.getLogger().m10069w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        ej9.getLogger().m10061d("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new CallableC2180e(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> logAnalyticsAppExceptionEvents() {
        ArrayList arrayList = new ArrayList();
        for (File file : m3737z()) {
            try {
                arrayList.add(logAnalyticsAppExceptionEvent(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                ej9.getLogger().m10069w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean nativeCoreAbsent(String str, File file, z33.AbstractC15960a abstractC15960a) {
        if (file == null || !file.exists()) {
            ej9.getLogger().m10069w("No minidump data found for session " + str);
        }
        if (abstractC15960a == null) {
            ej9.getLogger().m10065i("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && abstractC15960a == null;
    }

    private static p9b nativeCoreFile(r9b r9bVar) {
        File minidumpFile = r9bVar.getMinidumpFile();
        return (minidumpFile == null || !minidumpFile.exists()) ? new dk1("minidump_file", "minidump", new byte[]{0}) : new is5("minidump_file", "minidump", minidumpFile);
    }

    private static byte[] readResource(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @efb
    /* JADX INFO: renamed from: t */
    public static List<p9b> m3714t(r9b r9bVar, String str, kt5 kt5Var, byte[] bArr) {
        File sessionFile = kt5Var.getSessionFile(str, gzh.f41892h);
        File sessionFile2 = kt5Var.getSessionFile(str, "keys");
        File sessionFile3 = kt5Var.getSessionFile(str, gzh.f41895k);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dk1("logs_file", "logs", bArr));
        arrayList.add(new is5("crash_meta_file", "metadata", r9bVar.getMetadataFile()));
        arrayList.add(new is5("session_meta_file", i7f.f45937b, r9bVar.getSessionFile()));
        arrayList.add(new is5("app_meta_file", "app", r9bVar.getAppFile()));
        arrayList.add(new is5("device_meta_file", xs1.f99118w, r9bVar.getDeviceFile()));
        arrayList.add(new is5("os_meta_file", "os", r9bVar.getOsFile()));
        arrayList.add(nativeCoreFile(r9bVar));
        arrayList.add(new is5("user_meta_file", "user", sessionFile));
        arrayList.add(new is5("keys_file", "keys", sessionFile2));
        arrayList.add(new is5("rollouts_file", "rollouts", sessionFile3));
        return arrayList;
    }

    private Task<Boolean> waitForReportAction() {
        if (this.f15646b.isAutomaticDataCollectionEnabled()) {
            ej9.getLogger().m10061d("Automatic data collection is enabled. Allowing upload.");
            this.f15660p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        ej9.getLogger().m10061d("Automatic data collection is disabled.");
        ej9.getLogger().m10067v("Notifying that unsent reports are available.");
        this.f15660p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> taskOnSuccessTask = this.f15646b.waitForAutomaticDataCollectionEnabled().onSuccessTask(new C2178c());
        ej9.getLogger().m10061d("Waiting for send/deleteUnsentReports to be called.");
        return t43.race(taskOnSuccessTask, this.f15661q.getTask());
    }

    private void writeApplicationExitInfoEventIfRelevant(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            ej9.getLogger().m10067v("ANR feature enabled, but device is API " + i);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f15645a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f15657m.persistRelevantAppExitInfoEvent(str, historicalProcessExitReasons, new gi9(this.f15651g, str), gzh.loadFromExistingSession(str, this.f15651g, this.f15649e));
        } else {
            ej9.getLogger().m10067v("No ApplicationExitInfo available. Session: " + str);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m3715A(Thread thread, Throwable th) {
        q7f q7fVar = this.f15659o;
        if (q7fVar == null) {
            ej9.getLogger().m10069w("settingsProvider not set");
        } else {
            m3735x(q7fVar, thread, th, true);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m3716B(final String str) {
        this.f15649e.f38789a.submit(new Runnable() { // from class: a33
            @Override // java.lang.Runnable
            public final void run() {
                this.f257a.lambda$openSession$1(str);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m3717C() {
        try {
            String strM3733v = m3733v();
            if (strM3733v != null) {
                m3721G(f15634A, strM3733v);
                ej9.getLogger().m10065i("Saved version control info");
            }
        } catch (IOException e) {
            ej9.getLogger().m10070w("Unable to save version control info", e);
        }
    }

    /* JADX INFO: renamed from: D */
    public Task<Void> m3718D() {
        this.f15661q.trySetResult(Boolean.TRUE);
        return this.f15662r.getTask();
    }

    /* JADX INFO: renamed from: E */
    public void m3719E(String str, String str2) {
        try {
            this.f15648d.setCustomKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f15645a;
            if (context != null && lc2.isAppDebuggable(context)) {
                throw e;
            }
            ej9.getLogger().m10063e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: renamed from: F */
    public void m3720F(Map<String, String> map) {
        this.f15648d.setCustomKeys(map);
    }

    /* JADX INFO: renamed from: G */
    public void m3721G(String str, String str2) {
        try {
            this.f15648d.setInternalKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f15645a;
            if (context != null && lc2.isAppDebuggable(context)) {
                throw e;
            }
            ej9.getLogger().m10063e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: renamed from: H */
    public void m3722H(String str) {
        this.f15648d.setUserId(str);
    }

    /* JADX INFO: renamed from: I */
    public void m3723I(Task<a7f> task) {
        if (this.f15657m.hasReportsToSend()) {
            ej9.getLogger().m10067v("Crash reports are available to be sent.");
            waitForReportAction().onSuccessTask(this.f15649e.f38789a, new C2179d(task));
        } else {
            ej9.getLogger().m10067v("No crash reports are available to be sent.");
            this.f15660p.trySetResult(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m3724J(@efb Thread thread, @efb Throwable th, @efb Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (m3736y()) {
            return;
        }
        long timestampSeconds = getTimestampSeconds(jCurrentTimeMillis);
        String currentSessionId = getCurrentSessionId();
        if (currentSessionId == null) {
            ej9.getLogger().m10069w("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f15657m.persistNonFatalEvent(th, thread, new p65(currentSessionId, timestampSeconds, map));
        }
    }

    /* JADX INFO: renamed from: K */
    public void m3725K(long j, String str) {
        if (m3736y()) {
            return;
        }
        this.f15653i.writeToLog(j, str);
    }

    @efb
    /* JADX INFO: renamed from: n */
    public Task<Boolean> m3726n() {
        if (this.f15663s.compareAndSet(false, true)) {
            return this.f15660p.getTask();
        }
        ej9.getLogger().m10069w("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: o */
    public Task<Void> m3727o() {
        this.f15661q.trySetResult(Boolean.FALSE);
        return this.f15662r.getTask();
    }

    /* JADX INFO: renamed from: p */
    public boolean m3728p() {
        g53.checkBackgroundThread();
        if (!this.f15647c.isPresent()) {
            String currentSessionId = getCurrentSessionId();
            return currentSessionId != null && this.f15654j.hasCrashDataForSession(currentSessionId);
        }
        ej9.getLogger().m10067v("Found previous crash marker.");
        this.f15647c.remove();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m3729q(q7f q7fVar) {
        doCloseSessions(false, q7fVar, false);
    }

    /* JADX INFO: renamed from: r */
    public void m3730r(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, q7f q7fVar) {
        this.f15659o = q7fVar;
        m3716B(str);
        u43 u43Var = new u43(new C2176a(), q7fVar, uncaughtExceptionHandler, this.f15654j);
        this.f15658n = u43Var;
        Thread.setDefaultUncaughtExceptionHandler(u43Var);
    }

    /* JADX INFO: renamed from: s */
    public boolean m3731s(q7f q7fVar) {
        g53.checkBackgroundThread();
        if (m3736y()) {
            ej9.getLogger().m10069w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        ej9.getLogger().m10067v("Finalizing previously open sessions.");
        try {
            doCloseSessions(true, q7fVar, true);
            ej9.getLogger().m10067v("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            ej9.getLogger().m10064e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: u */
    public gzh m3732u() {
        return this.f15648d;
    }

    /* JADX INFO: renamed from: v */
    public String m3733v() throws IOException {
        String versionControlInfo = lc2.getVersionControlInfo(this.f15645a);
        if (versionControlInfo != null) {
            ej9.getLogger().m10061d("Read version control info from string resource");
            return Base64.encodeToString(versionControlInfo.getBytes(f15637D), 0);
        }
        InputStream resourceAsStream = getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            ej9.getLogger().m10065i("No version control information found");
            return null;
        }
        try {
            ej9.getLogger().m10061d("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(readResource(resourceAsStream), 0);
            resourceAsStream.close();
            return strEncodeToString;
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m3734w(@efb q7f q7fVar, @efb Thread thread, @efb Throwable th) {
        m3735x(q7fVar, thread, th, false);
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m3735x(@efb q7f q7fVar, @efb Thread thread, @efb Throwable th, boolean z) {
        try {
            ej9.getLogger().m10061d("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            if (!z) {
                u23.notifyCrashOccurred();
            }
            Task taskSubmitTask = this.f15649e.f38789a.submitTask(new CallableC2177b(System.currentTimeMillis(), th, thread, q7fVar, z));
            if (!z) {
                try {
                    f1i.awaitEvenIfOnMainThread(taskSubmitTask);
                } catch (TimeoutException unused) {
                    ej9.getLogger().m10063e("Cannot send reports. Timed out while fetching settings.");
                } catch (Exception e) {
                    ej9.getLogger().m10064e("Error handling uncaught exception", e);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m3736y() {
        u43 u43Var = this.f15658n;
        return u43Var != null && u43Var.m23093a();
    }

    /* JADX INFO: renamed from: z */
    public List<File> m3737z() {
        return this.f15651g.getCommonFiles(f15642x);
    }
}
