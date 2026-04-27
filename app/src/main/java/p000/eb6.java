package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class eb6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final nfg<? extends zjd<? extends T>> f32510b;

    public eb6(nfg<? extends zjd<? extends T>> supplier) {
        this.f32510b = supplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        try {
            zjd<? extends T> zjdVar = this.f32510b.get();
            Objects.requireNonNull(zjdVar, "The publisher supplied is null");
            zjdVar.subscribe(s);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
