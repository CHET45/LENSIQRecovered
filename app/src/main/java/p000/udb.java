package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class udb implements w9c {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final udb f87754a = new udb();

    /* JADX INFO: renamed from: b */
    public static final int f87755b = 0;

    private udb() {
    }

    @Override // p000.w9c
    @gib
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ */
    public Object mo28851applyToFlingBMRW4eQ(long j, @yfb gz6<? super i4i, ? super zy2<? super i4i>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objInvoke = gz6Var.invoke(i4i.m30148boximpl(j), zy2Var);
        return objInvoke == pd8.getCOROUTINE_SUSPENDED() ? objInvoke : bth.f14751a;
    }

    @Override // p000.w9c
    /* JADX INFO: renamed from: applyToScroll-Rhakbz0 */
    public long mo28852applyToScrollRhakbz0(long j, int i, @yfb qy6<? super izb, izb> qy6Var) {
        return qy6Var.invoke(izb.m30418boximpl(j)).m30439unboximpl();
    }

    @Override // p000.w9c
    @yfb
    public InterfaceC0701e getEffectModifier() {
        return InterfaceC0701e.f5158d1;
    }

    @Override // p000.w9c
    public boolean isInProgress() {
        return false;
    }
}
