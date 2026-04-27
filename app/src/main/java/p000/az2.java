package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@c5e(24)
public final class az2<T> extends AtomicBoolean implements Consumer<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final zy2<T> f12218a;

    /* JADX WARN: Multi-variable type inference failed */
    public az2(@yfb zy2<? super T> zy2Var) {
        super(false);
        this.f12218a = zy2Var;
    }

    @Override // java.util.function.Consumer
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            zy2<T> zy2Var = this.f12218a;
            v7e.C13927a c13927a = v7e.f90266b;
            zy2Var.resumeWith(v7e.m32723constructorimpl(t));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @yfb
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
