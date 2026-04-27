package p000;

import java.util.List;
import java.util.Map;
import p000.ma9;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xl4 implements cm4, ma9.InterfaceC9236a, qa9 {

    /* JADX INFO: renamed from: a */
    public final ma9 f98401a;

    public xl4(ma9 ma9Var) {
        this.f98401a = ma9Var;
        ma9Var.setCallback(this);
    }

    @Override // p000.cm4
    public void connectEnd(@efb cn4 cn4Var, int i, int i2, @efb Map<String, List<String>> map) {
        this.f98401a.connectEnd(cn4Var);
    }

    @Override // p000.cm4
    public void connectStart(@efb cn4 cn4Var, int i, @efb Map<String, List<String>> map) {
    }

    @Override // p000.cm4
    public void connectTrialEnd(@efb cn4 cn4Var, int i, @efb Map<String, List<String>> map) {
    }

    @Override // p000.cm4
    public void connectTrialStart(@efb cn4 cn4Var, @efb Map<String, List<String>> map) {
    }

    @Override // p000.cm4
    public void downloadFromBeginning(@efb cn4 cn4Var, @efb bd1 bd1Var, @efb c8e c8eVar) {
        this.f98401a.downloadFromBeginning(cn4Var, bd1Var, c8eVar);
    }

    @Override // p000.cm4
    public void downloadFromBreakpoint(@efb cn4 cn4Var, @efb bd1 bd1Var) {
        this.f98401a.downloadFromBreakpoint(cn4Var, bd1Var);
    }

    @Override // p000.cm4
    public void fetchEnd(@efb cn4 cn4Var, int i, long j) {
    }

    @Override // p000.cm4
    public void fetchProgress(@efb cn4 cn4Var, int i, long j) {
        this.f98401a.fetchProgress(cn4Var, j);
    }

    @Override // p000.cm4
    public void fetchStart(@efb cn4 cn4Var, int i, long j) {
    }

    @Override // p000.qa9
    public boolean isAlwaysRecoverAssistModel() {
        return this.f98401a.isAlwaysRecoverAssistModel();
    }

    @Override // p000.qa9
    public void setAlwaysRecoverAssistModel(boolean z) {
        this.f98401a.setAlwaysRecoverAssistModel(z);
    }

    @Override // p000.qa9
    public void setAlwaysRecoverAssistModelIfNotSet(boolean z) {
        this.f98401a.setAlwaysRecoverAssistModelIfNotSet(z);
    }

    @Override // p000.cm4
    public final void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc) {
        this.f98401a.taskEnd(cn4Var, x15Var, exc);
    }

    @Override // p000.cm4
    public final void taskStart(@efb cn4 cn4Var) {
        this.f98401a.taskStart(cn4Var);
    }

    public xl4() {
        this(new ma9());
    }
}
