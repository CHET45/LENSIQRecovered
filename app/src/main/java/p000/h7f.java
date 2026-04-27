package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class h7f implements q7f {

    /* JADX INFO: renamed from: j */
    public static final String f42745j = "existing_instance_identifier";

    /* JADX INFO: renamed from: k */
    public static final String f42746k = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";

    /* JADX INFO: renamed from: a */
    public final Context f42747a;

    /* JADX INFO: renamed from: b */
    public final r7f f42748b;

    /* JADX INFO: renamed from: c */
    public final j7f f42749c;

    /* JADX INFO: renamed from: d */
    public final fa3 f42750d;

    /* JADX INFO: renamed from: e */
    public final an1 f42751e;

    /* JADX INFO: renamed from: f */
    public final s7f f42752f;

    /* JADX INFO: renamed from: g */
    public final tf3 f42753g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference<a7f> f42754h;

    /* JADX INFO: renamed from: i */
    public final AtomicReference<TaskCompletionSource<a7f>> f42755i;

    /* JADX INFO: renamed from: h7f$a */
    public class C6738a implements SuccessContinuation<Void, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g53 f42756a;

        public C6738a(g53 g53Var) {
            this.f42756a = g53Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ JSONObject lambda$then$0() throws Exception {
            return h7f.this.f42752f.invoke(h7f.this.f42748b, true);
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @efb
        public Task<Void> then(@hib Void r5) throws Exception {
            JSONObject jSONObject = (JSONObject) this.f42756a.f38792d.getExecutor().submit(new Callable() { // from class: g7f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f38968a.lambda$then$0();
                }
            }).get();
            if (jSONObject != null) {
                a7f settingsJson = h7f.this.f42749c.parseSettingsJson(jSONObject);
                h7f.this.f42751e.writeCachedSettings(settingsJson.f577c, jSONObject);
                h7f.this.logSettings(jSONObject, "Loaded settings: ");
                h7f h7fVar = h7f.this;
                h7fVar.setStoredBuildInstanceIdentifier(h7fVar.f42748b.f77352f);
                h7f.this.f42754h.set(settingsJson);
                ((TaskCompletionSource) h7f.this.f42755i.get()).trySetResult(settingsJson);
            }
            return Tasks.forResult(null);
        }
    }

    public h7f(Context context, r7f r7fVar, fa3 fa3Var, j7f j7fVar, an1 an1Var, s7f s7fVar, tf3 tf3Var) {
        AtomicReference<a7f> atomicReference = new AtomicReference<>();
        this.f42754h = atomicReference;
        this.f42755i = new AtomicReference<>(new TaskCompletionSource());
        this.f42747a = context;
        this.f42748b = r7fVar;
        this.f42750d = fa3Var;
        this.f42749c = j7fVar;
        this.f42751e = an1Var;
        this.f42752f = s7fVar;
        this.f42753g = tf3Var;
        atomicReference.set(kz3.m15177a(fa3Var));
    }

    public static h7f create(Context context, String str, jr7 jr7Var, lo7 lo7Var, String str2, String str3, kt5 kt5Var, tf3 tf3Var) {
        String installerPackageName = jr7Var.getInstallerPackageName();
        cjg cjgVar = new cjg();
        return new h7f(context, new r7f(str, jr7Var.getModelName(), jr7Var.getOsBuildVersionString(), jr7Var.getOsDisplayVersionString(), jr7Var, lc2.createInstanceIdFrom(lc2.getMappingFileId(context), str, str3, str2), str3, str2, z54.determineFrom(installerPackageName).getId()), cjgVar, new j7f(cjgVar), new an1(kt5Var), new lz3(String.format(Locale.US, f42746k, str), lo7Var), tf3Var);
    }

    private a7f getCachedSettingsData(d7f d7fVar) throws Throwable {
        a7f a7fVar = null;
        try {
            if (!d7f.SKIP_CACHE_LOOKUP.equals(d7fVar)) {
                JSONObject cachedSettings = this.f42751e.readCachedSettings();
                if (cachedSettings != null) {
                    a7f settingsJson = this.f42749c.parseSettingsJson(cachedSettings);
                    if (settingsJson != null) {
                        logSettings(cachedSettings, "Loaded cached settings: ");
                        long currentTimeMillis = this.f42750d.getCurrentTimeMillis();
                        if (d7f.IGNORE_CACHE_EXPIRATION.equals(d7fVar) || !settingsJson.isExpired(currentTimeMillis)) {
                            try {
                                ej9.getLogger().m10067v("Returning cached settings.");
                                a7fVar = settingsJson;
                            } catch (Exception e) {
                                e = e;
                                a7fVar = settingsJson;
                                ej9.getLogger().m10064e("Failed to get cached settings", e);
                            }
                        } else {
                            ej9.getLogger().m10067v("Cached settings have expired.");
                        }
                    } else {
                        ej9.getLogger().m10064e("Failed to parse cached settings data.", null);
                    }
                } else {
                    ej9.getLogger().m10061d("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return a7fVar;
    }

    private String getStoredBuildInstanceIdentifier() {
        return lc2.getSharedPrefs(this.f42747a).getString(f42745j, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logSettings(JSONObject jSONObject, String str) {
        ej9.getLogger().m10061d(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"CommitPrefEdits"})
    public boolean setStoredBuildInstanceIdentifier(String str) {
        SharedPreferences.Editor editorEdit = lc2.getSharedPrefs(this.f42747a).edit();
        editorEdit.putString(f42745j, str);
        editorEdit.apply();
        return true;
    }

    @Override // p000.q7f
    public Task<a7f> getSettingsAsync() {
        return this.f42755i.get().getTask();
    }

    @Override // p000.q7f
    public a7f getSettingsSync() {
        return this.f42754h.get();
    }

    /* JADX INFO: renamed from: i */
    public boolean m12187i() {
        return !getStoredBuildInstanceIdentifier().equals(this.f42748b.f77352f);
    }

    public Task<Void> loadSettingsData(g53 g53Var) {
        return loadSettingsData(d7f.USE_CACHE, g53Var);
    }

    public Task<Void> loadSettingsData(d7f d7fVar, g53 g53Var) throws Throwable {
        a7f cachedSettingsData;
        if (!m12187i() && (cachedSettingsData = getCachedSettingsData(d7fVar)) != null) {
            this.f42754h.set(cachedSettingsData);
            this.f42755i.get().trySetResult(cachedSettingsData);
            return Tasks.forResult(null);
        }
        a7f cachedSettingsData2 = getCachedSettingsData(d7f.IGNORE_CACHE_EXPIRATION);
        if (cachedSettingsData2 != null) {
            this.f42754h.set(cachedSettingsData2);
            this.f42755i.get().trySetResult(cachedSettingsData2);
        }
        return this.f42753g.waitForDataCollectionPermission().onSuccessTask(g53Var.f38789a, new C6738a(g53Var));
    }
}
