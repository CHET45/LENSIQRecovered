package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: yd */
/* JADX INFO: loaded from: classes7.dex */
public class C15619yd<E> extends du1<E> implements InterfaceC0187ae<E> {
    public C15619yd(@yfb e13 e13Var, @yfb au1<E> au1Var, boolean z) {
        super(e13Var, au1Var, false, z);
        m22033i((jj8) e13Var.get(jj8.f50715A));
    }

    @Override // p000.sj8
    /* JADX INFO: renamed from: h */
    public boolean mo22032h(@yfb Throwable th) {
        q13.handleCoroutineException(getContext(), th);
        return true;
    }

    @Override // p000.sj8
    /* JADX INFO: renamed from: k */
    public void mo22034k(@gib Throwable th) {
        au1<E> au1VarM9366q = m9366q();
        if (th != null) {
            CancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            if (CancellationException == null) {
                CancellationException = y75.CancellationException(kk3.getClassSimpleName(this) + " was cancelled", th);
            }
        }
        au1VarM9366q.cancel(CancellationException);
    }
}
