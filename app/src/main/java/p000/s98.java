package p000;

import android.view.KeyEvent;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class s98 extends InterfaceC0701e.d implements quf {

    /* JADX INFO: renamed from: X */
    @gib
    public qy6<? super kq8, Boolean> f81005X;

    /* JADX INFO: renamed from: Y */
    @gib
    public qy6<? super kq8, Boolean> f81006Y;

    public s98(@gib qy6<? super kq8, Boolean> qy6Var, @gib qy6<? super kq8, Boolean> qy6Var2) {
        this.f81005X = qy6Var;
        this.f81006Y = qy6Var2;
    }

    @gib
    public final qy6<kq8, Boolean> getOnEvent() {
        return this.f81005X;
    }

    @gib
    public final qy6<kq8, Boolean> getOnPreEvent() {
        return this.f81006Y;
    }

    @Override // p000.quf
    /* JADX INFO: renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo */
    public boolean mo32024onInterceptKeyBeforeSoftKeyboardZmokQxo(@yfb KeyEvent keyEvent) {
        qy6<? super kq8, Boolean> qy6Var = this.f81005X;
        if (qy6Var != null) {
            return qy6Var.invoke(kq8.m30735boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // p000.quf
    /* JADX INFO: renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo */
    public boolean mo32025onPreInterceptKeyBeforeSoftKeyboardZmokQxo(@yfb KeyEvent keyEvent) {
        qy6<? super kq8, Boolean> qy6Var = this.f81006Y;
        if (qy6Var != null) {
            return qy6Var.invoke(kq8.m30735boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(@gib qy6<? super kq8, Boolean> qy6Var) {
        this.f81005X = qy6Var;
    }

    public final void setOnPreEvent(@gib qy6<? super kq8, Boolean> qy6Var) {
        this.f81006Y = qy6Var;
    }
}
