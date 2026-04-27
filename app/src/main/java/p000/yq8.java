package p000;

import android.view.KeyEvent;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class yq8 extends InterfaceC0701e.d implements xq8 {

    /* JADX INFO: renamed from: X */
    @gib
    public qy6<? super kq8, Boolean> f102650X;

    /* JADX INFO: renamed from: Y */
    @gib
    public qy6<? super kq8, Boolean> f102651Y;

    public yq8(@gib qy6<? super kq8, Boolean> qy6Var, @gib qy6<? super kq8, Boolean> qy6Var2) {
        this.f102650X = qy6Var;
        this.f102651Y = qy6Var2;
    }

    @gib
    public final qy6<kq8, Boolean> getOnEvent() {
        return this.f102650X;
    }

    @gib
    public final qy6<kq8, Boolean> getOnPreEvent() {
        return this.f102651Y;
    }

    @Override // p000.xq8
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
    public boolean mo27341onKeyEventZmokQxo(@yfb KeyEvent keyEvent) {
        qy6<? super kq8, Boolean> qy6Var = this.f102650X;
        if (qy6Var != null) {
            return qy6Var.invoke(kq8.m30735boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // p000.xq8
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo27342onPreKeyEventZmokQxo(@yfb KeyEvent keyEvent) {
        qy6<? super kq8, Boolean> qy6Var = this.f102651Y;
        if (qy6Var != null) {
            return qy6Var.invoke(kq8.m30735boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(@gib qy6<? super kq8, Boolean> qy6Var) {
        this.f102650X = qy6Var;
    }

    public final void setOnPreEvent(@gib qy6<? super kq8, Boolean> qy6Var) {
        this.f102651Y = qy6Var;
    }
}
