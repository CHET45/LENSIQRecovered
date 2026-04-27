package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.blankj.utilcode.util.C2473f;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes7.dex */
public class jyg {

    /* JADX INFO: renamed from: a */
    public static final String f52253a = "ThreadPoolUtil";

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f52254b = dyg.getInstance().buildAppStoreExecutor();

    /* JADX INFO: renamed from: c */
    public static Handler f52255c = new Handler(Looper.getMainLooper());

    public static void post(Runnable runnable) {
        try {
            f52254b.execute(runnable);
        } catch (Exception e) {
            C2473f.m4168e(f52253a, "post:error:", e);
        }
    }

    public static void postDelayed(Runnable runnable, long j) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = runnable;
        f52255c.sendMessageDelayed(messageObtain, j);
    }

    public static void removeCallbacks(Runnable runnable) {
        f52255c.removeCallbacksAndMessages(runnable);
    }
}
