package p000;

import p000.na9;
import p000.oa9;
import p000.sa9;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bm4 extends am4 implements oa9.InterfaceC10278a {

    /* JADX INFO: renamed from: bm4$b */
    public static class C1944b implements sa9.InterfaceC12498b<oa9.C10279b> {
        private C1944b() {
        }

        @Override // p000.sa9.InterfaceC12498b
        public oa9.C10279b create(int i) {
            return new oa9.C10279b(i);
        }
    }

    private bm4(oa9 oa9Var) {
        super(new na9(new C1944b()));
        oa9Var.setCallback(this);
        setAssistExtend(oa9Var);
    }

    @Override // p000.na9.InterfaceC9764b
    public final void blockEnd(cn4 cn4Var, int i, h61 h61Var) {
    }

    @Override // p000.na9.InterfaceC9764b
    public final void infoReady(cn4 cn4Var, @efb bd1 bd1Var, boolean z, @efb na9.C9765c c9765c) {
    }

    @Override // p000.na9.InterfaceC9764b
    public final void progress(cn4 cn4Var, long j) {
    }

    @Override // p000.na9.InterfaceC9764b
    public final void progressBlock(cn4 cn4Var, int i, long j) {
    }

    @Override // p000.na9.InterfaceC9764b
    public final void taskEnd(cn4 cn4Var, x15 x15Var, @hib Exception exc, @efb na9.C9765c c9765c) {
    }

    public bm4() {
        this(new oa9());
    }
}
