package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import p000.v7e;

/* JADX INFO: renamed from: qw */
/* JADX INFO: loaded from: classes.dex */
public final class C11718qw<T> extends AtomicBoolean implements vu2<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final zy2<T> f75960a;

    /* JADX WARN: Multi-variable type inference failed */
    public C11718qw(@yfb zy2<? super T> zy2Var) {
        super(false);
        this.f75960a = zy2Var;
    }

    @Override // p000.vu2
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            zy2<T> zy2Var = this.f75960a;
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
