package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class s52 implements AutoCloseable, x13 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e13 f80686a;

    public s52(@yfb e13 e13Var) {
        md8.checkNotNullParameter(e13Var, "coroutineContext");
        this.f80686a = e13Var;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        qj8.cancel$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    @Override // p000.x13
    @yfb
    public e13 getCoroutineContext() {
        return this.f80686a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s52(@yfb x13 x13Var) {
        this(x13Var.getCoroutineContext());
        md8.checkNotNullParameter(x13Var, "coroutineScope");
    }
}
