package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class gbe extends InterfaceC0701e.d implements fbe {

    /* JADX INFO: renamed from: X */
    @gib
    public qy6<? super hbe, Boolean> f39316X;

    /* JADX INFO: renamed from: Y */
    @gib
    public qy6<? super hbe, Boolean> f39317Y;

    public gbe(@gib qy6<? super hbe, Boolean> qy6Var, @gib qy6<? super hbe, Boolean> qy6Var2) {
        this.f39316X = qy6Var;
        this.f39317Y = qy6Var2;
    }

    @gib
    public final qy6<hbe, Boolean> getOnEvent() {
        return this.f39316X;
    }

    @gib
    public final qy6<hbe, Boolean> getOnPreEvent() {
        return this.f39317Y;
    }

    @Override // p000.fbe
    public boolean onPreRotaryScrollEvent(@yfb hbe hbeVar) {
        qy6<? super hbe, Boolean> qy6Var = this.f39317Y;
        if (qy6Var != null) {
            return qy6Var.invoke(hbeVar).booleanValue();
        }
        return false;
    }

    @Override // p000.fbe
    public boolean onRotaryScrollEvent(@yfb hbe hbeVar) {
        qy6<? super hbe, Boolean> qy6Var = this.f39316X;
        if (qy6Var != null) {
            return qy6Var.invoke(hbeVar).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(@gib qy6<? super hbe, Boolean> qy6Var) {
        this.f39316X = qy6Var;
    }

    public final void setOnPreEvent(@gib qy6<? super hbe, Boolean> qy6Var) {
        this.f39317Y = qy6Var;
    }
}
