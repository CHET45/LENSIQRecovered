package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public enum arh implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: b */
    @igg({"ThreadPoolCreation"})
    public static final Handler f11705b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f11705b.post(runnable);
    }
}
