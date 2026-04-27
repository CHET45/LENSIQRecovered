package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class ej9 {

    /* JADX INFO: renamed from: c */
    public static final String f33202c = "FirebaseCrashlytics";

    /* JADX INFO: renamed from: d */
    public static final ej9 f33203d = new ej9(f33202c);

    /* JADX INFO: renamed from: a */
    public final String f33204a;

    /* JADX INFO: renamed from: b */
    public int f33205b = 4;

    public ej9(String str) {
        this.f33204a = str;
    }

    private boolean canLog(int i) {
        return this.f33205b <= i || Log.isLoggable(this.f33204a, i);
    }

    public static ej9 getLogger() {
        return f33203d;
    }

    /* JADX INFO: renamed from: d */
    public void m10062d(String str, Throwable th) {
        canLog(3);
    }

    /* JADX INFO: renamed from: e */
    public void m10064e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.f33204a, str, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m10066i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.f33204a, str, th);
        }
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    /* JADX INFO: renamed from: v */
    public void m10068v(String str, Throwable th) {
        canLog(2);
    }

    /* JADX INFO: renamed from: w */
    public void m10070w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.f33204a, str, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m10061d(String str) {
        m10062d(str, null);
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.f33204a, str);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m10067v(String str) {
        m10068v(str, null);
    }

    /* JADX INFO: renamed from: e */
    public void m10063e(String str) {
        m10064e(str, null);
    }

    /* JADX INFO: renamed from: i */
    public void m10065i(String str) {
        m10066i(str, null);
    }

    /* JADX INFO: renamed from: w */
    public void m10069w(String str) {
        m10070w(str, null);
    }
}
