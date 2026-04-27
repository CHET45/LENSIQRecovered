package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class hxb<T, U, R> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    public final i11<? super T, ? super U, ? extends R> f45190b;

    /* JADX INFO: renamed from: c */
    public final wub<? extends U> f45191c;

    /* JADX INFO: renamed from: hxb$a */
    public static final class C7076a<T, U, R> extends AtomicReference<U> implements pxb<T>, lf4 {
        private static final long serialVersionUID = -312246233408980075L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f45192a;

        /* JADX INFO: renamed from: b */
        public final i11<? super T, ? super U, ? extends R> f45193b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<lf4> f45194c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<lf4> f45195d = new AtomicReference<>();

        public C7076a(pxb<? super R> actual, i11<? super T, ? super U, ? extends R> combiner) {
            this.f45192a = actual;
            this.f45193b = combiner;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f45194c);
            zf4.dispose(this.f45195d);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f45194c.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            zf4.dispose(this.f45195d);
            this.f45192a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            zf4.dispose(this.f45195d);
            this.f45192a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    R rApply = this.f45193b.apply(t, u);
                    Objects.requireNonNull(rApply, "The combiner returned a null value");
                    this.f45192a.onNext(rApply);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    dispose();
                    this.f45192a.onError(th);
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f45194c, d);
        }

        public void otherError(Throwable e) {
            zf4.dispose(this.f45194c);
            this.f45192a.onError(e);
        }

        public boolean setOther(lf4 o) {
            return zf4.setOnce(this.f45195d, o);
        }
    }

    /* JADX INFO: renamed from: hxb$b */
    public final class C7077b implements pxb<U> {

        /* JADX INFO: renamed from: a */
        public final C7076a<T, U, R> f45196a;

        public C7077b(C7076a<T, U, R> parent) {
            this.f45196a = parent;
        }

        @Override // p000.pxb
        public void onComplete() {
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f45196a.otherError(t);
        }

        @Override // p000.pxb
        public void onNext(U t) {
            this.f45196a.lazySet(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f45196a.setOther(d);
        }
    }

    public hxb(wub<T> source, i11<? super T, ? super U, ? extends R> combiner, wub<? extends U> other) {
        super(source);
        this.f45190b = combiner;
        this.f45191c = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> t) {
        m1f m1fVar = new m1f(t);
        C7076a c7076a = new C7076a(m1fVar, this.f45190b);
        m1fVar.onSubscribe(c7076a);
        this.f45191c.subscribe(new C7077b(c7076a));
        this.f63101a.subscribe(c7076a);
    }
}
