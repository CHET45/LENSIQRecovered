package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public final class nqc {

    /* JADX INFO: renamed from: a */
    @efb
    public w06 f65312a;

    @p7e({p7e.EnumC10826a.f69934a})
    public nqc(w06 w06Var) {
        this.f65312a = w06Var;
    }

    public void deleteAllIndexes() {
        this.f65312a.m24305g(new vu2() { // from class: mqc
            @Override // p000.vu2
            public final void accept(Object obj) {
                ((u06) obj).deleteAllFieldIndexes();
            }
        });
    }

    public void disableIndexAutoCreation() {
        this.f65312a.m24305g(new vu2() { // from class: lqc
            @Override // p000.vu2
            public final void accept(Object obj) {
                ((u06) obj).setIndexAutoCreationEnabled(false);
            }
        });
    }

    public void enableIndexAutoCreation() {
        this.f65312a.m24305g(new vu2() { // from class: kqc
            @Override // p000.vu2
            public final void accept(Object obj) {
                ((u06) obj).setIndexAutoCreationEnabled(true);
            }
        });
    }
}
