package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,39:1\n732#2,3:40\n732#2,3:43\n732#2,3:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n17#1:40,3\n23#1:43,3\n30#1:46,3\n*E\n"})
public class du1<E> extends AbstractC12833t0<bth> implements au1<E> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final au1<E> f30872d;

    public du1(@yfb e13 e13Var, @yfb au1<E> au1Var, boolean z, boolean z2) {
        super(e13Var, z, z2);
        this.f30872d = au1Var;
    }

    @Override // p000.sj8, p000.jj8
    public final void cancel(@gib CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new kj8(mo22028c(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // p000.sj8
    public void cancelInternal(@yfb Throwable th) {
        CancellationException cancellationException$default = sj8.toCancellationException$default(this, th, null, 1, null);
        this.f30872d.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // p000.nye
    public boolean close(@gib Throwable th) {
        return this.f30872d.close(th);
    }

    @yfb
    public final au1<E> getChannel() {
        return this;
    }

    @Override // p000.hsd
    @yfb
    public jve<E> getOnReceive() {
        return this.f30872d.getOnReceive();
    }

    @Override // p000.hsd
    @yfb
    public jve<xu1<E>> getOnReceiveCatching() {
        return this.f30872d.getOnReceiveCatching();
    }

    @Override // p000.hsd
    @yfb
    public jve<E> getOnReceiveOrNull() {
        return this.f30872d.getOnReceiveOrNull();
    }

    @Override // p000.nye
    @yfb
    public lve<E, nye<E>> getOnSend() {
        return this.f30872d.getOnSend();
    }

    @Override // p000.nye
    public void invokeOnClose(@yfb qy6<? super Throwable, bth> qy6Var) {
        this.f30872d.invokeOnClose(qy6Var);
    }

    @Override // p000.hsd
    public boolean isClosedForReceive() {
        return this.f30872d.isClosedForReceive();
    }

    @Override // p000.nye
    public boolean isClosedForSend() {
        return this.f30872d.isClosedForSend();
    }

    @Override // p000.hsd
    public boolean isEmpty() {
        return this.f30872d.isEmpty();
    }

    @Override // p000.hsd
    @yfb
    public mu1<E> iterator() {
        return this.f30872d.iterator();
    }

    @Override // p000.nye
    @q64(level = u64.f86866b, message = "Deprecated in the favour of 'trySend' method", replaceWith = @i2e(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.f30872d.offer(e);
    }

    @Override // p000.hsd
    @gib
    @q64(level = u64.f86866b, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @i2e(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return this.f30872d.poll();
    }

    @yfb
    /* JADX INFO: renamed from: q */
    public final au1<E> m9366q() {
        return this.f30872d;
    }

    @Override // p000.hsd
    @gib
    public Object receive(@yfb zy2<? super E> zy2Var) {
        return this.f30872d.receive(zy2Var);
    }

    @Override // p000.hsd
    @gib
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public Object mo28703receiveCatchingJP2dKIU(@yfb zy2<? super xu1<? extends E>> zy2Var) {
        Object objMo28703receiveCatchingJP2dKIU = this.f30872d.mo28703receiveCatchingJP2dKIU(zy2Var);
        pd8.getCOROUTINE_SUSPENDED();
        return objMo28703receiveCatchingJP2dKIU;
    }

    @Override // p000.hsd
    @gib
    @ip9
    @q64(level = u64.f86866b, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @i2e(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object receiveOrNull(@yfb zy2<? super E> zy2Var) {
        return this.f30872d.receiveOrNull(zy2Var);
    }

    @Override // p000.nye
    @gib
    public Object send(E e, @yfb zy2<? super bth> zy2Var) {
        return this.f30872d.send(e, zy2Var);
    }

    @Override // p000.hsd
    @yfb
    /* JADX INFO: renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public Object mo28704tryReceivePtdJZtk() {
        return this.f30872d.mo28704tryReceivePtdJZtk();
    }

    @Override // p000.nye
    @yfb
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public Object mo28705trySendJP2dKIU(E e) {
        return this.f30872d.mo28705trySendJP2dKIU(e);
    }

    @Override // p000.sj8, p000.jj8
    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancelInternal(new kj8(mo22028c(), null, this));
    }

    @Override // p000.sj8, p000.jj8
    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(Throwable th) {
        cancelInternal(new kj8(mo22028c(), null, this));
        return true;
    }
}
