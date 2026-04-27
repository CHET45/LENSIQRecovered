package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class f5a<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends z9a<? extends T>> f35369b;

    /* JADX INFO: renamed from: f5a$a */
    public static final class C5600a<T> extends AtomicInteger implements k9a<T>, fdg {
        private static final long serialVersionUID = 3520831347801429610L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f35370a;

        /* JADX INFO: renamed from: e */
        public final Iterator<? extends z9a<? extends T>> f35374e;

        /* JADX INFO: renamed from: f */
        public long f35375f;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f35371b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final a0f f35373d = new a0f();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<Object> f35372c = new AtomicReference<>(fhb.COMPLETE);

        public C5600a(ycg<? super T> actual, Iterator<? extends z9a<? extends T>> sources) {
            this.f35370a = actual;
            this.f35374e = sources;
        }

        /* JADX INFO: renamed from: a */
        public void m10628a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f35372c;
            ycg<? super T> ycgVar = this.f35370a;
            a0f a0fVar = this.f35373d;
            while (!a0fVar.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != fhb.COMPLETE) {
                        long j = this.f35375f;
                        if (j != this.f35371b.get()) {
                            this.f35375f = j + 1;
                            atomicReference.lazySet(null);
                            ycgVar.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!a0fVar.isDisposed()) {
                        try {
                            if (this.f35374e.hasNext()) {
                                try {
                                    z9a<? extends T> next = this.f35374e.next();
                                    Objects.requireNonNull(next, "The source Iterator returned a null MaybeSource");
                                    next.subscribe(this);
                                } catch (Throwable th) {
                                    o75.throwIfFatal(th);
                                    ycgVar.onError(th);
                                    return;
                                }
                            } else {
                                ycgVar.onComplete();
                            }
                        } catch (Throwable th2) {
                            o75.throwIfFatal(th2);
                            ycgVar.onError(th2);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f35373d.dispose();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f35372c.lazySet(fhb.COMPLETE);
            m10628a();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f35370a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            this.f35373d.replace(d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f35372c.lazySet(value);
            m10628a();
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f35371b, n);
                m10628a();
            }
        }
    }

    public f5a(Iterable<? extends z9a<? extends T>> sources) {
        this.f35369b = sources;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        try {
            Iterator<? extends z9a<? extends T>> it = this.f35369b.iterator();
            Objects.requireNonNull(it, "The sources Iterable returned a null Iterator");
            C5600a c5600a = new C5600a(s, it);
            s.onSubscribe(c5600a);
            c5600a.m10628a();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
