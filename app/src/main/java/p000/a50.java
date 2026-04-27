package p000;

import java.util.concurrent.Executor;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class a50 extends png {

    /* JADX INFO: renamed from: c */
    public static volatile a50 f414c;

    /* JADX INFO: renamed from: d */
    @efb
    public static final Executor f415d = new Executor() { // from class: y40
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a50.lambda$static$0(runnable);
        }
    };

    /* JADX INFO: renamed from: e */
    @efb
    public static final Executor f416e = new Executor() { // from class: z40
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a50.lambda$static$1(runnable);
        }
    };

    /* JADX INFO: renamed from: a */
    @efb
    public png f417a;

    /* JADX INFO: renamed from: b */
    @efb
    public final png f418b;

    private a50() {
        o04 o04Var = new o04();
        this.f418b = o04Var;
        this.f417a = o04Var;
    }

    @efb
    public static Executor getIOThreadExecutor() {
        return f416e;
    }

    @efb
    public static a50 getInstance() {
        if (f414c != null) {
            return f414c;
        }
        synchronized (a50.class) {
            try {
                if (f414c == null) {
                    f414c = new a50();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f414c;
    }

    @efb
    public static Executor getMainThreadExecutor() {
        return f415d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
        getInstance().postToMainThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(Runnable runnable) {
        getInstance().executeOnDiskIO(runnable);
    }

    @Override // p000.png
    public void executeOnDiskIO(@efb Runnable runnable) {
        this.f417a.executeOnDiskIO(runnable);
    }

    @Override // p000.png
    public boolean isMainThread() {
        return this.f417a.isMainThread();
    }

    @Override // p000.png
    public void postToMainThread(@efb Runnable runnable) {
        this.f417a.postToMainThread(runnable);
    }

    public void setDelegate(@hib png pngVar) {
        if (pngVar == null) {
            pngVar = this.f418b;
        }
        this.f417a = pngVar;
    }
}
