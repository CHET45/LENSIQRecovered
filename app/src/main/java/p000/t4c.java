package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class t4c extends InterfaceC0701e.d implements iv8 {

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super r78, bth> f83710X;

    /* JADX INFO: renamed from: Y */
    public final boolean f83711Y = true;

    /* JADX INFO: renamed from: Z */
    public long f83712Z = s78.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public t4c(@yfb qy6<? super r78, bth> qy6Var) {
        this.f83710X = qy6Var;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return this.f83711Y;
    }

    @Override // p000.iv8
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo27780onRemeasuredozmzZPI(long j) {
        if (r78.m32085equalsimpl0(this.f83712Z, j)) {
            return;
        }
        this.f83710X.invoke(r78.m32079boximpl(j));
        this.f83712Z = j;
    }

    public final void update(@yfb qy6<? super r78, bth> qy6Var) {
        this.f83710X = qy6Var;
        this.f83712Z = s78.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
