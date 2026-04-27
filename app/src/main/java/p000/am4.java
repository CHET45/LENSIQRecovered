package p000;

import java.util.List;
import java.util.Map;
import p000.na9;
import p000.sa9;

/* JADX INFO: loaded from: classes6.dex */
public abstract class am4 implements cm4, na9.InterfaceC9764b, qa9 {

    /* JADX INFO: renamed from: a */
    public final na9 f2024a;

    /* JADX INFO: renamed from: am4$a */
    public static class C0319a implements sa9.InterfaceC12498b<na9.C9765c> {
        @Override // p000.sa9.InterfaceC12498b
        public na9.C9765c create(int i) {
            return new na9.C9765c(i);
        }
    }

    public am4(na9 na9Var) {
        this.f2024a = na9Var;
        na9Var.setCallback(this);
    }

    @Override // p000.cm4
    public void connectTrialEnd(@efb cn4 cn4Var, int i, @efb Map<String, List<String>> map) {
    }

    @Override // p000.cm4
    public void connectTrialStart(@efb cn4 cn4Var, @efb Map<String, List<String>> map) {
    }

    @Override // p000.cm4
    public final void downloadFromBeginning(@efb cn4 cn4Var, @efb bd1 bd1Var, @efb c8e c8eVar) {
        this.f2024a.infoReady(cn4Var, bd1Var, false);
    }

    @Override // p000.cm4
    public final void downloadFromBreakpoint(@efb cn4 cn4Var, @efb bd1 bd1Var) {
        this.f2024a.infoReady(cn4Var, bd1Var, true);
    }

    @Override // p000.cm4
    public void fetchEnd(@efb cn4 cn4Var, int i, long j) {
        this.f2024a.fetchEnd(cn4Var, i);
    }

    @Override // p000.cm4
    public final void fetchProgress(@efb cn4 cn4Var, int i, long j) {
        this.f2024a.fetchProgress(cn4Var, i, j);
    }

    @Override // p000.cm4
    public void fetchStart(@efb cn4 cn4Var, int i, long j) {
    }

    @Override // p000.qa9
    public boolean isAlwaysRecoverAssistModel() {
        return this.f2024a.isAlwaysRecoverAssistModel();
    }

    @Override // p000.qa9
    public void setAlwaysRecoverAssistModel(boolean z) {
        this.f2024a.setAlwaysRecoverAssistModel(z);
    }

    @Override // p000.qa9
    public void setAlwaysRecoverAssistModelIfNotSet(boolean z) {
        this.f2024a.setAlwaysRecoverAssistModelIfNotSet(z);
    }

    public void setAssistExtend(@efb na9.InterfaceC9763a interfaceC9763a) {
        this.f2024a.setAssistExtend(interfaceC9763a);
    }

    @Override // p000.cm4
    public final void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc) {
        this.f2024a.taskEnd(cn4Var, x15Var, exc);
    }

    public am4() {
        this(new na9(new C0319a()));
    }
}
