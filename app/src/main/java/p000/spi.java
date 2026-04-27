package p000;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1520a;
import java.util.UUID;
import p000.p7e;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class spi implements eq6 {

    /* JADX INFO: renamed from: d */
    public static final String f82569d = cj9.tagWithPrefix("WMFgUpdater");

    /* JADX INFO: renamed from: a */
    public final ong f82570a;

    /* JADX INFO: renamed from: b */
    public final dq6 f82571b;

    /* JADX INFO: renamed from: c */
    public final pqi f82572c;

    /* JADX INFO: renamed from: spi$a */
    public class RunnableC12742a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z6f f82573a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UUID f82574b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ cq6 f82575c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Context f82576d;

        public RunnableC12742a(final z6f val$future, final UUID val$id, final cq6 val$foregroundInfo, final Context val$context) {
            this.f82573a = val$future;
            this.f82574b = val$id;
            this.f82575c = val$foregroundInfo;
            this.f82576d = val$context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f82573a.isCancelled()) {
                    String string = this.f82574b.toString();
                    tpi.EnumC13161a state = spi.this.f82572c.getState(string);
                    if (state == null || state.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    spi.this.f82571b.startForeground(string, this.f82575c);
                    this.f82576d.startService(C1520a.createNotifyIntent(this.f82576d, string, this.f82575c));
                }
                this.f82573a.set(null);
            } catch (Throwable th) {
                this.f82573a.setException(th);
            }
        }
    }

    public spi(@efb WorkDatabase workDatabase, @efb dq6 foregroundProcessor, @efb ong taskExecutor) {
        this.f82571b = foregroundProcessor;
        this.f82570a = taskExecutor;
        this.f82572c = workDatabase.workSpecDao();
    }

    @Override // p000.eq6
    @efb
    public ja9<Void> setForegroundAsync(@efb final Context context, @efb final UUID id, @efb final cq6 foregroundInfo) {
        z6f z6fVarCreate = z6f.create();
        this.f82570a.executeOnBackgroundThread(new RunnableC12742a(z6fVarCreate, id, foregroundInfo, context));
        return z6fVarCreate;
    }
}
