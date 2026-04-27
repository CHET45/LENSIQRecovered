package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ps6 extends or9 {

    /* JADX INFO: renamed from: a */
    public final or9 f71924a;

    public ps6(or9 or9Var) {
        this.f71924a = or9Var;
    }

    @Override // p000.bu1
    public String authority() {
        return this.f71924a.authority();
    }

    @Override // p000.or9
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f71924a.awaitTermination(j, timeUnit);
    }

    @Override // p000.or9
    public void enterIdle() {
        this.f71924a.enterIdle();
    }

    @Override // p000.or9
    public ws2 getState(boolean z) {
        return this.f71924a.getState(z);
    }

    @Override // p000.or9
    public boolean isShutdown() {
        return this.f71924a.isShutdown();
    }

    @Override // p000.or9
    public boolean isTerminated() {
        return this.f71924a.isTerminated();
    }

    @Override // p000.bu1
    public <RequestT, ResponseT> w22<RequestT, ResponseT> newCall(rua<RequestT, ResponseT> ruaVar, rn1 rn1Var) {
        return this.f71924a.newCall(ruaVar, rn1Var);
    }

    @Override // p000.or9
    public void notifyWhenStateChanged(ws2 ws2Var, Runnable runnable) {
        this.f71924a.notifyWhenStateChanged(ws2Var, runnable);
    }

    @Override // p000.or9
    public void resetConnectBackoff() {
        this.f71924a.resetConnectBackoff();
    }

    @Override // p000.or9
    public or9 shutdown() {
        return this.f71924a.shutdown();
    }

    @Override // p000.or9
    public or9 shutdownNow() {
        return this.f71924a.shutdownNow();
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", this.f71924a).toString();
    }
}
