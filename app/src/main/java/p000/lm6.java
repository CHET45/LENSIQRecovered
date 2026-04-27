package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class lm6 extends InterfaceC0701e.d implements nm6 {

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super in6, bth> f58224X;

    /* JADX INFO: renamed from: Y */
    @gib
    public in6 f58225Y;

    public lm6(@yfb qy6<? super in6, bth> qy6Var) {
        this.f58224X = qy6Var;
    }

    @yfb
    public final qy6<in6, bth> getOnFocusChanged() {
        return this.f58224X;
    }

    @Override // p000.nm6
    public void onFocusEvent(@yfb in6 in6Var) {
        if (md8.areEqual(this.f58225Y, in6Var)) {
            return;
        }
        this.f58225Y = in6Var;
        this.f58224X.invoke(in6Var);
    }

    public final void setOnFocusChanged(@yfb qy6<? super in6, bth> qy6Var) {
        this.f58224X = qy6Var;
    }
}
