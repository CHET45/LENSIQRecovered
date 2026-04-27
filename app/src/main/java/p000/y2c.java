package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class y2c extends InterfaceC0701e.d implements o77 {

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super mv8, bth> f100186X;

    public y2c(@yfb qy6<? super mv8, bth> qy6Var) {
        this.f100186X = qy6Var;
    }

    @yfb
    public final qy6<mv8, bth> getCallback() {
        return this.f100186X;
    }

    @Override // p000.o77
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        this.f100186X.invoke(mv8Var);
    }

    public final void setCallback(@yfb qy6<? super mv8, bth> qy6Var) {
        this.f100186X = qy6Var;
    }
}
