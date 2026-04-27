package p000;

import android.os.Vibrator;
import com.blankj.utilcode.util.C2479l;

/* JADX INFO: loaded from: classes3.dex */
public final class m5i {

    /* JADX INFO: renamed from: a */
    public static Vibrator f59956a;

    private m5i() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @j5e("android.permission.VIBRATE")
    public static void cancel() {
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        vibrator.cancel();
    }

    private static Vibrator getVibrator() {
        if (f59956a == null) {
            f59956a = (Vibrator) C2479l.getApp().getSystemService("vibrator");
        }
        return f59956a;
    }

    @j5e("android.permission.VIBRATE")
    public static void vibrate(long j) {
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(j);
    }

    @j5e("android.permission.VIBRATE")
    public static void vibrate(long[] jArr, int i) {
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(jArr, i);
    }
}
