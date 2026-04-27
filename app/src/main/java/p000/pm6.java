package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class pm6 extends InterfaceC0701e.d implements nm6 {

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super in6, bth> f71383X;

    public pm6(@yfb qy6<? super in6, bth> qy6Var) {
        this.f71383X = qy6Var;
    }

    @yfb
    public final qy6<in6, bth> getOnFocusEvent() {
        return this.f71383X;
    }

    @Override // p000.nm6
    public void onFocusEvent(@yfb in6 in6Var) {
        this.f71383X.invoke(in6Var);
    }

    public final void setOnFocusEvent(@yfb qy6<? super in6, bth> qy6Var) {
        this.f71383X = qy6Var;
    }
}
