package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public class uf3 {

    /* JADX INFO: renamed from: e */
    public static final String f87849e = "com.google.firebase.common.prefs:";

    /* JADX INFO: renamed from: f */
    @fdi
    public static final String f87850f = "firebase_data_collection_default_enabled";

    /* JADX INFO: renamed from: a */
    public final Context f87851a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f87852b;

    /* JADX INFO: renamed from: c */
    public final akd f87853c;

    /* JADX INFO: renamed from: d */
    public boolean f87854d;

    public uf3(Context context, String str, akd akdVar) {
        Context contextDirectBootSafe = directBootSafe(context);
        this.f87851a = contextDirectBootSafe;
        this.f87852b = contextDirectBootSafe.getSharedPreferences(f87849e + str, 0);
        this.f87853c = akdVar;
        this.f87854d = readAutoDataCollectionEnabled();
    }

    private static Context directBootSafe(Context context) {
        return lx2.createDeviceProtectedStorageContext(context);
    }

    private boolean readAutoDataCollectionEnabled() {
        return this.f87852b.contains(f87850f) ? this.f87852b.getBoolean(f87850f, true) : readManifestDataCollectionEnabled();
    }

    private boolean readManifestDataCollectionEnabled() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f87851a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f87851a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f87850f)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(f87850f);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void updateDataCollectionDefaultEnabled(boolean z) {
        if (this.f87854d != z) {
            this.f87854d = z;
            this.f87853c.publish(new o55<>(vf3.class, new vf3(z)));
        }
    }

    public synchronized boolean isEnabled() {
        return this.f87854d;
    }

    public synchronized void setEnabled(Boolean bool) {
        try {
            if (bool == null) {
                this.f87852b.edit().remove(f87850f).apply();
                updateDataCollectionDefaultEnabled(readManifestDataCollectionEnabled());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f87852b.edit().putBoolean(f87850f, zEquals).apply();
                updateDataCollectionDefaultEnabled(zEquals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
