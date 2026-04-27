package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
@xxb
@q64(level = u64.f86866b, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
public final class uq2<E> implements ud1<E> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vd1<E> f88739a;

    private uq2(vd1<E> vd1Var) {
        this.f88739a = vd1Var;
    }

    @Override // p000.ud1
    public void cancel(@gib CancellationException cancellationException) {
        this.f88739a.cancel(cancellationException);
    }

    @Override // p000.nye
    public boolean close(@gib Throwable th) {
        return this.f88739a.close(th);
    }

    @Override // p000.nye
    @yfb
    public lve<E, nye<E>> getOnSend() {
        return this.f88739a.getOnSend();
    }

    public final E getValue() {
        return this.f88739a.getValue();
    }

    @gib
    public final E getValueOrNull() {
        return this.f88739a.getValueOrNull();
    }

    @Override // p000.nye
    public void invokeOnClose(@yfb qy6<? super Throwable, bth> qy6Var) {
        this.f88739a.invokeOnClose(qy6Var);
    }

    @Override // p000.nye
    public boolean isClosedForSend() {
        return this.f88739a.isClosedForSend();
    }

    @Override // p000.nye
    @q64(level = u64.f86866b, message = "Deprecated in the favour of 'trySend' method", replaceWith = @i2e(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.f88739a.offer(e);
    }

    @Override // p000.ud1
    @yfb
    public hsd<E> openSubscription() {
        return this.f88739a.openSubscription();
    }

    @Override // p000.nye
    @gib
    public Object send(E e, @yfb zy2<? super bth> zy2Var) {
        return this.f88739a.send(e, zy2Var);
    }

    @Override // p000.nye
    @yfb
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28705trySendJP2dKIU(E e) {
        return this.f88739a.mo28705trySendJP2dKIU(e);
    }

    @Override // p000.ud1
    @q64(level = u64.f86867c, message = "Binary compatibility only")
    public /* synthetic */ boolean cancel(Throwable th) {
        return this.f88739a.cancel(th);
    }

    public uq2() {
        this(new vd1(-1));
    }

    public uq2(E e) {
        this();
        mo28705trySendJP2dKIU(e);
    }
}
