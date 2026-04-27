package p000;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class w06 {

    /* JADX INFO: renamed from: a */
    public final pz6<ga0, u06> f93039a;

    /* JADX INFO: renamed from: b */
    @xc7("this")
    public u06 f93040b;

    /* JADX INFO: renamed from: c */
    @xc7("this")
    public ga0 f93041c = new ga0();

    public w06(pz6<ga0, u06> pz6Var) {
        this.f93039a = pz6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeIfShutdown$0(Runnable runnable) {
        this.f93041c.enqueueAndForgetEvenAfterShutdown(runnable);
    }

    /* JADX INFO: renamed from: b */
    public synchronized <T> T m24300b(pz6<u06, T> pz6Var) {
        m24301c();
        return pz6Var.apply(this.f93040b);
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m24301c() {
        if (!m24304f()) {
            this.f93040b = this.f93039a.apply(this.f93041c);
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized <T> T m24302d(pz6<Executor, T> pz6Var, pz6<Executor, T> pz6Var2) {
        Executor executor = new Executor() { // from class: v06
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f89607a.lambda$executeIfShutdown$0(runnable);
            }
        };
        u06 u06Var = this.f93040b;
        if (u06Var != null && !u06Var.isTerminated()) {
            return pz6Var2.apply(executor);
        }
        return pz6Var.apply(executor);
    }

    @fdi
    /* JADX INFO: renamed from: e */
    public ga0 m24303e() {
        return this.f93041c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m24304f() {
        return this.f93040b != null;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m24305g(vu2<u06> vu2Var) {
        m24301c();
        vu2Var.accept(this.f93040b);
    }

    /* JADX INFO: renamed from: h */
    public synchronized Task<Void> m24306h() {
        Task<Void> taskTerminate;
        m24301c();
        taskTerminate = this.f93040b.terminate();
        this.f93041c.shutdown();
        return taskTerminate;
    }
}
