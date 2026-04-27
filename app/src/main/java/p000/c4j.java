package p000;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class c4j {

    /* JADX INFO: renamed from: a */
    public final String f15782a;

    public c4j(String str) {
        this.f15782a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* JADX INFO: renamed from: f */
    private static String m3763f(String str, String str2, @hib Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m3764a(String str, @hib Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m3763f(this.f15782a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m3765b(String str, @hib Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m3763f(this.f15782a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m3766c(Throwable th, String str, @hib Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m3763f(this.f15782a, str, objArr), th);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m3767d(String str, @hib Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m3763f(this.f15782a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m3768e(String str, @hib Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m3763f(this.f15782a, str, objArr));
        }
        return 0;
    }
}
