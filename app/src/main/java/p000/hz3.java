package p000;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p000.vhg;

/* JADX INFO: loaded from: classes4.dex */
public class hz3 implements soe {

    /* JADX INFO: renamed from: f */
    public static final Logger f45282f = Logger.getLogger(nhh.class.getName());

    /* JADX INFO: renamed from: a */
    public final nqi f45283a;

    /* JADX INFO: renamed from: b */
    public final Executor f45284b;

    /* JADX INFO: renamed from: c */
    public final un0 f45285c;

    /* JADX INFO: renamed from: d */
    public final t65 f45286d;

    /* JADX INFO: renamed from: e */
    public final vhg f45287e;

    @a28
    public hz3(Executor executor, un0 un0Var, nqi nqiVar, t65 t65Var, vhg vhgVar) {
        this.f45284b = executor;
        this.f45285c = un0Var;
        this.f45283a = nqiVar;
        this.f45286d = t65Var;
        this.f45287e = vhgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$schedule$0(chh chhVar, a65 a65Var) {
        this.f45286d.persist(chhVar, a65Var);
        this.f45283a.schedule(chhVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$schedule$1(final chh chhVar, qhh qhhVar, a65 a65Var) {
        try {
            bhh bhhVar = this.f45285c.get(chhVar.getBackendName());
            if (bhhVar == null) {
                String str = String.format("Transport backend '%s' is not registered", chhVar.getBackendName());
                f45282f.warning(str);
                qhhVar.onSchedule(new IllegalArgumentException(str));
            } else {
                final a65 a65VarDecorate = bhhVar.decorate(a65Var);
                this.f45287e.runCriticalSection(new vhg.InterfaceC14075a() { // from class: fz3
                    @Override // p000.vhg.InterfaceC14075a
                    public final Object execute() {
                        return this.f38053a.lambda$schedule$0(chhVar, a65VarDecorate);
                    }
                });
                qhhVar.onSchedule(null);
            }
        } catch (Exception e) {
            f45282f.warning("Error scheduling event " + e.getMessage());
            qhhVar.onSchedule(e);
        }
    }

    @Override // p000.soe
    public void schedule(final chh chhVar, final a65 a65Var, final qhh qhhVar) {
        this.f45284b.execute(new Runnable() { // from class: ez3
            @Override // java.lang.Runnable
            public final void run() {
                this.f34535a.lambda$schedule$1(chhVar, qhhVar, a65Var);
            }
        });
    }
}
