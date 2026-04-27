package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class dmf<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final oof<T> f30069b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends zjd<? extends R>> f30070c;

    public dmf(oof<T> source, sy6<? super T, ? extends zjd<? extends R>> mapper) {
        this.f30069b = source;
        this.f30070c = mapper;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> downstream) {
        this.f30069b.subscribe(new C4866a(downstream, this.f30070c));
    }

    /* JADX INFO: renamed from: dmf$a */
    public static final class C4866a<S, T> extends AtomicLong implements hnf<S>, kj6<T>, fdg {
        private static final long serialVersionUID = 7759721921468635667L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f30071a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super S, ? extends zjd<? extends T>> f30072b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<fdg> f30073c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public lf4 f30074d;

        public C4866a(ycg<? super T> actual, sy6<? super S, ? extends zjd<? extends T>> mapper) {
            this.f30071a = actual;
            this.f30072b = mapper;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f30074d.dispose();
            ldg.cancel(this.f30073c);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f30071a.onComplete();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f30071a.onError(e);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f30071a.onNext(t);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f30074d = d;
            this.f30071a.onSubscribe(this);
        }

        @Override // p000.hnf
        public void onSuccess(S value) {
            try {
                zjd<? extends T> zjdVarApply = this.f30072b.apply(value);
                Objects.requireNonNull(zjdVarApply, "the mapper returned a null Publisher");
                zjd<? extends T> zjdVar = zjdVarApply;
                if (this.f30073c.get() != ldg.CANCELLED) {
                    zjdVar.subscribe(this);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f30071a.onError(th);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this.f30073c, this, n);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this.f30073c, this, s);
        }
    }
}
