package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class sui {

    /* JADX INFO: renamed from: a */
    public static ii9 f82939a = ii9.VERBOSE;

    /* JADX INFO: renamed from: a */
    public static int m22256a(String str, String str2) {
        if (f82939a.getValue() > ii9.DEBUG.getValue()) {
            return 0;
        }
        return Log.d("AEE_" + str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static int m22258b(String str, String str2) {
        if (f82939a.getValue() > ii9.ERROR.getValue()) {
            return 0;
        }
        return Log.e("AEE_" + str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m22259c(String str, String str2) {
        if (f82939a.getValue() > ii9.INFO.getValue()) {
            return 0;
        }
        return Log.i("AEE_" + str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static int m22260d(String str, String str2) {
        if (f82939a != ii9.VERBOSE) {
            return 0;
        }
        return Log.v("AEE_" + str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static int m22261e(String str, String str2) {
        if (f82939a.getValue() > ii9.WARN.getValue()) {
            return 0;
        }
        return Log.w("AEE_" + str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static int m22262f(String str, String str2) {
        if (f82939a.getValue() > ii9.ERROR.getValue()) {
            return 0;
        }
        return Log.wtf("AEE_" + str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m22257a(ii9 ii9Var) {
        f82939a = ii9Var;
    }
}
