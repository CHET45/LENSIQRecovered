package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class m7a<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f60147a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends wub<? extends R>> f60148b;

    /* JADX INFO: renamed from: m7a$a */
    public static final class C9212a<T, R> extends AtomicReference<lf4> implements pxb<R>, k9a<T>, lf4 {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f60149a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends R>> f60150b;

        public C9212a(pxb<? super R> downstream, sy6<? super T, ? extends wub<? extends R>> mapper) {
            this.f60149a = downstream;
            this.f60150b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f60149a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f60149a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(R t) {
            this.f60149a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.replace(this, d);
        }

        @Override // p000.k9a
        public void onSuccess(T t) {
            try {
                wub<? extends R> wubVarApply = this.f60150b.apply(t);
                Objects.requireNonNull(wubVarApply, "The mapper returned a null Publisher");
                wub<? extends R> wubVar = wubVarApply;
                if (isDisposed()) {
                    return;
                }
                wubVar.subscribe(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f60149a.onError(th);
            }
        }
    }

    public m7a(z9a<T> source, sy6<? super T, ? extends wub<? extends R>> mapper) {
        this.f60147a = source;
        this.f60148b = mapper;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        C9212a c9212a = new C9212a(observer, this.f60148b);
        observer.onSubscribe(c9212a);
        this.f60147a.subscribe(c9212a);
    }
}
