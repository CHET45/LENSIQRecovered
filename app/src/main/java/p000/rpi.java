package p000;

import android.content.Context;
import androidx.work.ListenableWorker;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class rpi implements Runnable {

    /* JADX INFO: renamed from: m */
    public static final String f79002m = cj9.tagWithPrefix("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a */
    public final z6f<Void> f79003a = z6f.create();

    /* JADX INFO: renamed from: b */
    public final Context f79004b;

    /* JADX INFO: renamed from: c */
    public final oqi f79005c;

    /* JADX INFO: renamed from: d */
    public final ListenableWorker f79006d;

    /* JADX INFO: renamed from: e */
    public final eq6 f79007e;

    /* JADX INFO: renamed from: f */
    public final ong f79008f;

    /* JADX INFO: renamed from: rpi$a */
    public class RunnableC12200a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z6f f79009a;

        public RunnableC12200a(final z6f val$foregroundFuture) {
            this.f79009a = val$foregroundFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f79009a.setFuture(rpi.this.f79006d.getForegroundInfoAsync());
        }
    }

    /* JADX INFO: renamed from: rpi$b */
    public class RunnableC12201b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z6f f79011a;

        public RunnableC12201b(final z6f val$foregroundFuture) {
            this.f79011a = val$foregroundFuture;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                cq6 cq6Var = (cq6) this.f79011a.get();
                if (cq6Var == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", rpi.this.f79005c.f68339c));
                }
                cj9.get().debug(rpi.f79002m, String.format("Updating notification for %s", rpi.this.f79005c.f68339c), new Throwable[0]);
                rpi.this.f79006d.setRunInForeground(true);
                rpi rpiVar = rpi.this;
                rpiVar.f79003a.setFuture(rpiVar.f79007e.setForegroundAsync(rpiVar.f79004b, rpiVar.f79006d.getId(), cq6Var));
            } catch (Throwable th) {
                rpi.this.f79003a.setException(th);
            }
        }
    }

    @igg({"LambdaLast"})
    public rpi(@efb Context context, @efb oqi workSpec, @efb ListenableWorker worker, @efb eq6 foregroundUpdater, @efb ong taskExecutor) {
        this.f79004b = context;
        this.f79005c = workSpec;
        this.f79006d = worker;
        this.f79007e = foregroundUpdater;
        this.f79008f = taskExecutor;
    }

    @efb
    public ja9<Void> getFuture() {
        return this.f79003a;
    }

    @Override // java.lang.Runnable
    @igg({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f79005c.f68353q || nf1.isAtLeastS()) {
            this.f79003a.set(null);
            return;
        }
        z6f z6fVarCreate = z6f.create();
        this.f79008f.getMainThreadExecutor().execute(new RunnableC12200a(z6fVarCreate));
        z6fVarCreate.addListener(new RunnableC12201b(z6fVarCreate), this.f79008f.getMainThreadExecutor());
    }
}
