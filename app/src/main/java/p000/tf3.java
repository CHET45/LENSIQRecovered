package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public class tf3 {

    /* JADX INFO: renamed from: i */
    public static final String f84488i = "firebase_crashlytics_collection_enabled";

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f84489a;

    /* JADX INFO: renamed from: b */
    public final lw5 f84490b;

    /* JADX INFO: renamed from: c */
    public final Object f84491c;

    /* JADX INFO: renamed from: d */
    public TaskCompletionSource<Void> f84492d;

    /* JADX INFO: renamed from: e */
    public boolean f84493e;

    /* JADX INFO: renamed from: f */
    public boolean f84494f;

    /* JADX INFO: renamed from: g */
    @hib
    public Boolean f84495g;

    /* JADX INFO: renamed from: h */
    public final TaskCompletionSource<Void> f84496h;

    public tf3(lw5 lw5Var) {
        Object obj = new Object();
        this.f84491c = obj;
        this.f84492d = new TaskCompletionSource<>();
        this.f84493e = false;
        this.f84494f = false;
        this.f84496h = new TaskCompletionSource<>();
        Context applicationContext = lw5Var.getApplicationContext();
        this.f84490b = lw5Var;
        this.f84489a = lc2.getSharedPrefs(applicationContext);
        Boolean dataCollectionValueFromSharedPreferences = getDataCollectionValueFromSharedPreferences();
        this.f84495g = dataCollectionValueFromSharedPreferences == null ? getDataCollectionValueFromManifest(applicationContext) : dataCollectionValueFromSharedPreferences;
        synchronized (obj) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    this.f84492d.trySetResult(null);
                    this.f84493e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @hib
    private Boolean getDataCollectionValueFromManifest(Context context) {
        Boolean crashlyticsDataCollectionEnabledFromManifest = readCrashlyticsDataCollectionEnabledFromManifest(context);
        if (crashlyticsDataCollectionEnabledFromManifest == null) {
            this.f84494f = false;
            return null;
        }
        this.f84494f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(crashlyticsDataCollectionEnabledFromManifest));
    }

    @hib
    private Boolean getDataCollectionValueFromSharedPreferences() {
        if (!this.f84489a.contains(f84488i)) {
            return null;
        }
        this.f84494f = false;
        return Boolean.valueOf(this.f84489a.getBoolean(f84488i, true));
    }

    private boolean isFirebaseDataCollectionDefaultEnabled() {
        try {
            return this.f84490b.isDataCollectionDefaultEnabled();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void logDataCollectionState(boolean z) {
        ej9.getLogger().m10061d(String.format("Crashlytics automatic data collection %s by %s.", z ? "ENABLED" : "DISABLED", this.f84495g == null ? "global Firebase setting" : this.f84494f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    @hib
    private static Boolean readCrashlyticsDataCollectionEnabledFromManifest(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f84488i)) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean(f84488i));
        } catch (PackageManager.NameNotFoundException e) {
            ej9.getLogger().m10064e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    @igg({"ApplySharedPref"})
    private static void storeDataCollectionValueInSharedPreferences(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean(f84488i, bool.booleanValue());
        } else {
            editorEdit.remove(f84488i);
        }
        editorEdit.apply();
    }

    public void grantDataCollectionPermission(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f84496h.trySetResult(null);
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f84495g;
            zBooleanValue = bool != null ? bool.booleanValue() : isFirebaseDataCollectionDefaultEnabled();
            logDataCollectionState(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public synchronized void setCrashlyticsDataCollectionEnabled(@hib Boolean bool) {
        if (bool != null) {
            try {
                this.f84494f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f84495g = bool != null ? bool : getDataCollectionValueFromManifest(this.f84490b.getApplicationContext());
        storeDataCollectionValueInSharedPreferences(this.f84489a, bool);
        synchronized (this.f84491c) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    if (!this.f84493e) {
                        this.f84492d.trySetResult(null);
                        this.f84493e = true;
                    }
                } else if (this.f84493e) {
                    this.f84492d = new TaskCompletionSource<>();
                    this.f84493e = false;
                }
            } finally {
            }
        }
    }

    public Task<Void> waitForAutomaticDataCollectionEnabled() {
        Task<Void> task;
        synchronized (this.f84491c) {
            task = this.f84492d.getTask();
        }
        return task;
    }

    public Task<Void> waitForDataCollectionPermission() {
        return t43.race(this.f84496h.getTask(), waitForAutomaticDataCollectionEnabled());
    }
}
