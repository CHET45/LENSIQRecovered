package p000;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class z85 {

    /* JADX INFO: renamed from: a */
    public static final int f104370a = 4;

    /* JADX INFO: renamed from: b */
    public static final Executor f104371b = TaskExecutors.MAIN_THREAD;

    /* JADX INFO: renamed from: c */
    public static final Executor f104372c = new p63();

    /* JADX INFO: renamed from: d */
    public static final Executor f104373d = new vyg(4, AsyncTask.THREAD_POOL_EXECUTOR);

    private z85() {
    }
}
