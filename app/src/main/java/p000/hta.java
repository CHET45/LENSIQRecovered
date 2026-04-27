package p000;

import p000.pn1;

/* JADX INFO: loaded from: classes7.dex */
public final class hta extends pn1.AbstractC11034a {

    /* JADX INFO: renamed from: a */
    public final r42 f44824a;

    /* JADX INFO: renamed from: b */
    public final rua<?, ?> f44825b;

    /* JADX INFO: renamed from: c */
    public final fta f44826c;

    /* JADX INFO: renamed from: d */
    public final rn1 f44827d;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7014a f44829f;

    /* JADX INFO: renamed from: g */
    public final q42[] f44830g;

    /* JADX INFO: renamed from: i */
    @eib
    @vc7("lock")
    public o42 f44832i;

    /* JADX INFO: renamed from: j */
    public boolean f44833j;

    /* JADX INFO: renamed from: k */
    public t34 f44834k;

    /* JADX INFO: renamed from: h */
    public final Object f44831h = new Object();

    /* JADX INFO: renamed from: e */
    public final fx2 f44828e = fx2.current();

    /* JADX INFO: renamed from: hta$a */
    public interface InterfaceC7014a {
        void onComplete();
    }

    public hta(r42 r42Var, rua<?, ?> ruaVar, fta ftaVar, rn1 rn1Var, InterfaceC7014a interfaceC7014a, q42[] q42VarArr) {
        this.f44824a = r42Var;
        this.f44825b = ruaVar;
        this.f44826c = ftaVar;
        this.f44827d = rn1Var;
        this.f44829f = interfaceC7014a;
        this.f44830g = q42VarArr;
    }

    private void finalizeWith(o42 o42Var) {
        boolean z;
        v7d.checkState(!this.f44833j, "already finalized");
        this.f44833j = true;
        synchronized (this.f44831h) {
            try {
                if (this.f44832i == null) {
                    this.f44832i = o42Var;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.f44829f.onComplete();
            return;
        }
        v7d.checkState(this.f44834k != null, "delayedStream is null");
        Runnable runnableM22348e = this.f44834k.m22348e(o42Var);
        if (runnableM22348e != null) {
            runnableM22348e.run();
        }
        this.f44829f.onComplete();
    }

    /* JADX INFO: renamed from: a */
    public o42 m12602a() {
        synchronized (this.f44831h) {
            try {
                o42 o42Var = this.f44832i;
                if (o42Var != null) {
                    return o42Var;
                }
                t34 t34Var = new t34();
                this.f44834k = t34Var;
                this.f44832i = t34Var;
                return t34Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.pn1.AbstractC11034a
    public void apply(fta ftaVar) {
        v7d.checkState(!this.f44833j, "apply() or fail() already called");
        v7d.checkNotNull(ftaVar, "headers");
        this.f44826c.merge(ftaVar);
        fx2 fx2VarAttach = this.f44828e.attach();
        try {
            o42 o42VarNewStream = this.f44824a.newStream(this.f44825b, this.f44826c, this.f44827d, this.f44830g);
            this.f44828e.detach(fx2VarAttach);
            finalizeWith(o42VarNewStream);
        } catch (Throwable th) {
            this.f44828e.detach(fx2VarAttach);
            throw th;
        }
    }

    @Override // p000.pn1.AbstractC11034a
    public void fail(n4g n4gVar) {
        v7d.checkArgument(!n4gVar.isOk(), "Cannot fail with OK status");
        v7d.checkState(!this.f44833j, "apply() or fail() already called");
        finalizeWith(new dp5(oc7.replaceInappropriateControlPlaneStatus(n4gVar), this.f44830g));
    }
}
