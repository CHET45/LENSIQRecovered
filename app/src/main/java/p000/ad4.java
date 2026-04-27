package p000;

import p000.p64;

/* JADX INFO: loaded from: classes.dex */
public class ad4 extends p64 {

    /* JADX INFO: renamed from: m */
    public int f1116m;

    public ad4(wki wkiVar) {
        super(wkiVar);
        if (wkiVar instanceof rl7) {
            this.f69821e = p64.EnumC10807a.HORIZONTAL_DIMENSION;
        } else {
            this.f69821e = p64.EnumC10807a.VERTICAL_DIMENSION;
        }
    }

    @Override // p000.p64
    public void resolve(int i) {
        if (this.f69826j) {
            return;
        }
        this.f69826j = true;
        this.f69823g = i;
        for (j64 j64Var : this.f69827k) {
            j64Var.update(j64Var);
        }
    }
}
