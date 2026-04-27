package p000;

import java.util.concurrent.CancellationException;
import p000.nye;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,124:1\n732#2,3:125\n732#2,3:128\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n*L\n73#1:125,3\n79#1:128,3\n*E\n"})
public class xd1<E> extends AbstractC12833t0<bth> implements vdd<E>, ud1<E> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final ud1<E> f97549d;

    public xd1(@yfb e13 e13Var, @yfb ud1<E> ud1Var, boolean z) {
        super(e13Var, false, z);
        this.f97549d = ud1Var;
        m22033i((jj8) e13Var.get(jj8.f50715A));
    }

    @Override // p000.sj8, p000.jj8
    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(Throwable th) {
        if (th == null) {
            th = new kj8(mo22028c(), null, this);
        }
        cancelInternal(th);
        return true;
    }

    @Override // p000.sj8
    public void cancelInternal(@yfb Throwable th) {
        CancellationException cancellationException$default = sj8.toCancellationException$default(this, th, null, 1, null);
        this.f97549d.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // p000.nye
    public boolean close(@gib Throwable th) {
        boolean zClose = this.f97549d.close(th);
        start();
        return zClose;
    }

    @Override // p000.vdd
    @yfb
    public nye<E> getChannel() {
        return this;
    }

    @Override // p000.nye
    @yfb
    public lve<E, nye<E>> getOnSend() {
        return this.f97549d.getOnSend();
    }

    @Override // p000.nye
    public void invokeOnClose(@yfb qy6<? super Throwable, bth> qy6Var) {
        this.f97549d.invokeOnClose(qy6Var);
    }

    @Override // p000.AbstractC12833t0, p000.sj8, p000.jj8
    public boolean isActive() {
        return super.isActive();
    }

    @Override // p000.nye
    public boolean isClosedForSend() {
        return this.f97549d.isClosedForSend();
    }

    @Override // p000.nye
    @q64(level = u64.f86866b, message = "Deprecated in the favour of 'trySend' method", replaceWith = @i2e(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.f97549d.offer(e);
    }

    @yfb
    public hsd<E> openSubscription() {
        return this.f97549d.openSubscription();
    }

    @Override // p000.AbstractC12833t0
    /* JADX INFO: renamed from: p */
    public void mo11681p(@yfb Throwable th, boolean z) {
        if (this.f97549d.close(th) || z) {
            return;
        }
        q13.handleCoroutineException(getContext(), th);
    }

    @yfb
    /* JADX INFO: renamed from: q */
    public final ud1<E> m25097q() {
        return this.f97549d;
    }

    @Override // p000.AbstractC12833t0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onCompleted(@yfb bth bthVar) {
        nye.C10119a.close$default(this.f97549d, null, 1, null);
    }

    @Override // p000.nye
    @gib
    public Object send(E e, @yfb zy2<? super bth> zy2Var) {
        return this.f97549d.send(e, zy2Var);
    }

    @Override // p000.nye
    @yfb
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28705trySendJP2dKIU(E e) {
        return this.f97549d.mo28705trySendJP2dKIU(e);
    }

    @Override // p000.sj8, p000.jj8
    public final void cancel(@gib CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new kj8(mo22028c(), null, this);
        }
        cancelInternal(cancellationException);
    }
}
