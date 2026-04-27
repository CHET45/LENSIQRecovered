package p000;

import java.util.Objects;
import p000.rh6;

/* JADX INFO: loaded from: classes7.dex */
public final class zh6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super l86<Throwable>, ? extends zjd<?>> f105085c;

    /* JADX INFO: renamed from: zh6$a */
    public static final class C16138a<T> extends rh6.AbstractC12094c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public C16138a(ycg<? super T> actual, qg6<Throwable> processor, fdg receiver) {
            super(actual, processor, receiver);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f78309L.cancel();
            this.f78307F.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            m21360c(t);
        }
    }

    public zh6(l86<T> source, sy6<? super l86<Throwable>, ? extends zjd<?>> handler) {
        super(source);
        this.f105085c = handler;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        u1f u1fVar = new u1f(s);
        qg6<T> serialized = nsh.create(8).toSerialized();
        try {
            zjd<?> zjdVarApply = this.f105085c.apply(serialized);
            Objects.requireNonNull(zjdVarApply, "handler returned a null Publisher");
            zjd<?> zjdVar = zjdVarApply;
            rh6.C12093b c12093b = new rh6.C12093b(this.f49321b);
            C16138a c16138a = new C16138a(u1fVar, serialized, c12093b);
            c12093b.f78306d = c16138a;
            s.onSubscribe(c16138a);
            zjdVar.subscribe(c12093b);
            c12093b.onNext(0);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
