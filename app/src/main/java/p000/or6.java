package p000;

import java.util.concurrent.Executor;
import p000.da8;
import p000.r42;
import p000.wr9;

/* JADX INFO: loaded from: classes7.dex */
public abstract class or6 implements qr2 {
    /* JADX INFO: renamed from: a */
    public abstract qr2 mo18816a();

    @Override // p000.qr2
    public sc0 getAttributes() {
        return mo18816a().getAttributes();
    }

    @Override // p000.ac8
    public cb8 getLogId() {
        return mo18816a().getLogId();
    }

    @Override // p000.xa8
    public ja9<da8.C4695l> getStats() {
        return mo18816a().getStats();
    }

    @Override // p000.r42
    public o42 newStream(rua<?, ?> ruaVar, fta ftaVar, rn1 rn1Var, q42[] q42VarArr) {
        return mo18816a().newStream(ruaVar, ftaVar, rn1Var, q42VarArr);
    }

    @Override // p000.r42
    public void ping(r42.InterfaceC11878a interfaceC11878a, Executor executor) {
        mo18816a().ping(interfaceC11878a, executor);
    }

    @Override // p000.wr9
    public void shutdown(n4g n4gVar) {
        mo18816a().shutdown(n4gVar);
    }

    @Override // p000.wr9
    public void shutdownNow(n4g n4gVar) {
        mo18816a().shutdownNow(n4gVar);
    }

    @Override // p000.wr9
    public Runnable start(wr9.InterfaceC14756a interfaceC14756a) {
        return mo18816a().start(interfaceC14756a);
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo18816a()).toString();
    }
}
