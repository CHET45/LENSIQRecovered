package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class o7a<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final z9a<T> f66600b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends zjd<? extends R>> f66601c;

    public o7a(z9a<T> source, sy6<? super T, ? extends zjd<? extends R>> mapper) {
        this.f66600b = source;
        this.f66601c = mapper;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f66600b.subscribe(new C10213a(s, this.f66601c));
    }

    /* JADX INFO: renamed from: o7a$a */
    public static final class C10213a<T, R> extends AtomicReference<fdg> implements kj6<R>, k9a<T>, fdg {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f66602a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends zjd<? extends R>> f66603b;

        /* JADX INFO: renamed from: c */
        public lf4 f66604c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f66605d = new AtomicLong();

        public C10213a(ycg<? super R> downstream, sy6<? super T, ? extends zjd<? extends R>> mapper) {
            this.f66602a = downstream;
            this.f66603b = mapper;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f66604c.dispose();
            ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f66602a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f66602a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(R t) {
            this.f66602a.onNext(t);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f66604c, d)) {
                this.f66604c = d;
                this.f66602a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T t) {
            try {
                zjd<? extends R> zjdVarApply = this.f66603b.apply(t);
                Objects.requireNonNull(zjdVarApply, "The mapper returned a null Publisher");
                zjd<? extends R> zjdVar = zjdVarApply;
                if (get() != ldg.CANCELLED) {
                    zjdVar.subscribe(this);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f66602a.onError(th);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this, this.f66605d, n);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this, this.f66605d, s);
        }
    }
}
