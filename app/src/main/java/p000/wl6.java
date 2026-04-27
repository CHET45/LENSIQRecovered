package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wl6<T, U, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final i11<? super T, ? super U, ? extends R> f94615c;

    /* JADX INFO: renamed from: d */
    public final zjd<? extends U> f94616d;

    /* JADX INFO: renamed from: wl6$a */
    public final class C14669a implements kj6<U> {

        /* JADX INFO: renamed from: a */
        public final C14670b<T, U, R> f94617a;

        public C14669a(C14670b<T, U, R> wlf) {
            this.f94617a = wlf;
        }

        @Override // p000.ycg
        public void onComplete() {
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f94617a.otherError(t);
        }

        @Override // p000.ycg
        public void onNext(U t) {
            this.f94617a.lazySet(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (this.f94617a.setOther(s)) {
                s.request(Long.MAX_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: wl6$b */
    public static final class C14670b<T, U, R> extends AtomicReference<U> implements bq2<T>, fdg {
        private static final long serialVersionUID = -312246233408980075L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f94619a;

        /* JADX INFO: renamed from: b */
        public final i11<? super T, ? super U, ? extends R> f94620b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<fdg> f94621c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f94622d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<fdg> f94623e = new AtomicReference<>();

        public C14670b(ycg<? super R> actual, i11<? super T, ? super U, ? extends R> combiner) {
            this.f94619a = actual;
            this.f94620b = combiner;
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f94621c);
            ldg.cancel(this.f94623e);
        }

        @Override // p000.ycg
        public void onComplete() {
            ldg.cancel(this.f94623e);
            this.f94619a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            ldg.cancel(this.f94623e);
            this.f94619a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f94621c.get().request(1L);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this.f94621c, this.f94622d, s);
        }

        public void otherError(Throwable e) {
            ldg.cancel(this.f94621c);
            this.f94619a.onError(e);
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this.f94621c, this.f94622d, n);
        }

        public boolean setOther(fdg o) {
            return ldg.setOnce(this.f94623e, o);
        }

        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    R rApply = this.f94620b.apply(t, u);
                    Objects.requireNonNull(rApply, "The combiner returned a null value");
                    this.f94619a.onNext(rApply);
                    return true;
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    cancel();
                    this.f94619a.onError(th);
                }
            }
            return false;
        }
    }

    public wl6(l86<T> source, i11<? super T, ? super U, ? extends R> combiner, zjd<? extends U> other) {
        super(source);
        this.f94615c = combiner;
        this.f94616d = other;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        u1f u1fVar = new u1f(s);
        C14670b c14670b = new C14670b(u1fVar, this.f94615c);
        u1fVar.onSubscribe(c14670b);
        this.f94616d.subscribe(new C14669a(c14670b));
        this.f49321b.subscribe((kj6) c14670b);
    }
}
