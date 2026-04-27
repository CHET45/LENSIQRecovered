package p000;

import p000.nye;

/* JADX INFO: loaded from: classes7.dex */
public final class udd<E> extends du1<E> implements vdd<E> {
    public udd(@yfb e13 e13Var, @yfb au1<E> au1Var) {
        super(e13Var, au1Var, true, true);
    }

    @Override // p000.vdd
    public /* bridge */ /* synthetic */ nye getChannel() {
        return getChannel();
    }

    @Override // p000.AbstractC12833t0, p000.sj8, p000.jj8
    public boolean isActive() {
        return super.isActive();
    }

    @Override // p000.AbstractC12833t0
    /* JADX INFO: renamed from: p */
    public void mo11681p(@yfb Throwable th, boolean z) {
        if (m9366q().close(th) || z) {
            return;
        }
        q13.handleCoroutineException(getContext(), th);
    }

    @Override // p000.AbstractC12833t0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onCompleted(@yfb bth bthVar) {
        nye.C10119a.close$default(m9366q(), null, 1, null);
    }
}
