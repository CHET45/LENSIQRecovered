package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class f4c extends InterfaceC0701e.d implements iv8 {

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super mv8, bth> f35326X;

    public f4c(@yfb qy6<? super mv8, bth> qy6Var) {
        this.f35326X = qy6Var;
    }

    @yfb
    public final qy6<mv8, bth> getCallback() {
        return this.f35326X;
    }

    @Override // p000.iv8
    public void onPlaced(@yfb mv8 mv8Var) {
        this.f35326X.invoke(mv8Var);
    }

    public final void setCallback(@yfb qy6<? super mv8, bth> qy6Var) {
        this.f35326X = qy6Var;
    }
}
