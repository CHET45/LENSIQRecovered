package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
public final class e8e extends rj8 {

    /* JADX INFO: renamed from: e */
    @yfb
    public final zy2<bth> f32133e;

    /* JADX WARN: Multi-variable type inference failed */
    public e8e(@yfb zy2<? super bth> zy2Var) {
        this.f32133e = zy2Var;
    }

    @Override // p000.rj8
    public boolean getOnCancelling() {
        return false;
    }

    @Override // p000.rj8
    public void invoke(@gib Throwable th) {
        zy2<bth> zy2Var = this.f32133e;
        v7e.C13927a c13927a = v7e.f90266b;
        zy2Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
    }
}
