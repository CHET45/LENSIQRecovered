package p000;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p000.vhg;

/* JADX INFO: loaded from: classes4.dex */
public class wpi {

    /* JADX INFO: renamed from: a */
    public final Executor f95054a;

    /* JADX INFO: renamed from: b */
    public final t65 f95055b;

    /* JADX INFO: renamed from: c */
    public final nqi f95056c;

    /* JADX INFO: renamed from: d */
    public final vhg f95057d;

    @a28
    public wpi(Executor executor, t65 t65Var, nqi nqiVar, vhg vhgVar) {
        this.f95054a = executor;
        this.f95055b = t65Var;
        this.f95056c = nqiVar;
        this.f95057d = vhgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$ensureContextsScheduled$0() {
        Iterator<chh> it = this.f95055b.loadActiveContexts().iterator();
        while (it.hasNext()) {
            this.f95056c.schedule(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureContextsScheduled$1() {
        this.f95057d.runCriticalSection(new vhg.InterfaceC14075a() { // from class: vpi
            @Override // p000.vhg.InterfaceC14075a
            public final Object execute() {
                return this.f91959a.lambda$ensureContextsScheduled$0();
            }
        });
    }

    public void ensureContextsScheduled() {
        this.f95054a.execute(new Runnable() { // from class: upi
            @Override // java.lang.Runnable
            public final void run() {
                this.f88736a.lambda$ensureContextsScheduled$1();
            }
        });
    }
}
