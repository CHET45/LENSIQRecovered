package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import p000.jj8;

/* JADX INFO: loaded from: classes7.dex */
public final class gg2<T> extends AbstractC12833t0<T> implements BiFunction<T, Throwable, bth> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final CompletableFuture<T> f39755d;

    public gg2(@yfb e13 e13Var, @yfb CompletableFuture<T> completableFuture) {
        super(e13Var, true, true);
        this.f39755d = completableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ bth apply(Object obj, Throwable th) {
        apply2(obj, th);
        return bth.f14751a;
    }

    @Override // p000.AbstractC12833t0
    public void onCompleted(T t) {
        this.f39755d.complete(t);
    }

    @Override // p000.AbstractC12833t0
    /* JADX INFO: renamed from: p */
    public void mo11681p(@yfb Throwable th, boolean z) {
        this.f39755d.completeExceptionally(th);
    }

    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(@gib T t, @gib Throwable th) {
        jj8.C7916a.cancel$default((jj8) this, (CancellationException) null, 1, (Object) null);
    }
}
