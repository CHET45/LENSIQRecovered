package p000;

import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class dyg {

    /* JADX INFO: renamed from: a */
    public static final String f31328a = "ThreadPollFactory";

    /* JADX INFO: renamed from: b */
    public static final int f31329b = 2;

    /* JADX INFO: renamed from: dyg$a */
    public class C5017a extends ThreadPoolExecutor {
        public C5017a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
            super(i, i2, j, timeUnit, blockingQueue);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                try {
                    ((Future) runnable).get();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (CancellationException e) {
                    th = e;
                } catch (ExecutionException e2) {
                    th = e2.getCause();
                }
            }
            if (th != null) {
                Log.e(dyg.f31328a, "afterExecute:" + th);
            }
        }
    }

    /* JADX INFO: renamed from: dyg$b */
    public static final class C5018b {

        /* JADX INFO: renamed from: a */
        public static final dyg f31331a = new dyg();

        private C5018b() {
        }
    }

    public static dyg getInstance() {
        return C5018b.f31331a;
    }

    public ExecutorService buildAppStoreExecutor() {
        return Executors.newCachedThreadPool();
    }

    public ExecutorService buildDownloadExecutor() {
        C5017a c5017a = new C5017a(2, 2, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        c5017a.allowCoreThreadTimeOut(true);
        return c5017a;
    }

    public int getMaxDownloadNumber() {
        return 2;
    }
}
