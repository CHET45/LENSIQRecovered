package p000;

import p000.ade;

/* JADX INFO: loaded from: classes8.dex */
@ade.InterfaceC0186a
public final class fig extends ade {

    /* JADX INFO: renamed from: a */
    public final ade f36809a;

    /* JADX INFO: renamed from: b */
    public final Object f36810b;

    public fig(ade adeVar, Object obj) {
        this.f36809a = adeVar;
        this.f36810b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fig) {
            return this.f36809a.equals(((fig) obj).f36809a);
        }
        return false;
    }

    public int hashCode() {
        return this.f36809a.hashCode();
    }

    @Override // p000.ade
    public void testAssumptionFailure(fp5 fp5Var) {
        synchronized (this.f36810b) {
            this.f36809a.testAssumptionFailure(fp5Var);
        }
    }

    @Override // p000.ade
    public void testFailure(fp5 fp5Var) throws Exception {
        synchronized (this.f36810b) {
            this.f36809a.testFailure(fp5Var);
        }
    }

    @Override // p000.ade
    public void testFinished(j74 j74Var) throws Exception {
        synchronized (this.f36810b) {
            this.f36809a.testFinished(j74Var);
        }
    }

    @Override // p000.ade
    public void testIgnored(j74 j74Var) throws Exception {
        synchronized (this.f36810b) {
            this.f36809a.testIgnored(j74Var);
        }
    }

    @Override // p000.ade
    public void testRunFinished(w7e w7eVar) throws Exception {
        synchronized (this.f36810b) {
            this.f36809a.testRunFinished(w7eVar);
        }
    }

    @Override // p000.ade
    public void testRunStarted(j74 j74Var) throws Exception {
        synchronized (this.f36810b) {
            this.f36809a.testRunStarted(j74Var);
        }
    }

    @Override // p000.ade
    public void testStarted(j74 j74Var) throws Exception {
        synchronized (this.f36810b) {
            this.f36809a.testStarted(j74Var);
        }
    }

    public String toString() {
        return this.f36809a.toString() + " (with synchronization wrapper)";
    }
}
