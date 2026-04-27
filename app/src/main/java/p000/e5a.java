package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class e5a<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends aaa<? extends T>> f31845b;

    /* JADX INFO: renamed from: e5a$a */
    public static final class C5123a<T> extends AtomicInteger implements l9a<T>, fdg {
        private static final long serialVersionUID = 3520831347801429610L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f31846a;

        /* JADX INFO: renamed from: e */
        public final Iterator<? extends aaa<? extends T>> f31850e;

        /* JADX INFO: renamed from: f */
        public long f31851f;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f31847b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final b0f f31849d = new b0f();

        /* JADX INFO: renamed from: c */
        public final AtomicReference<Object> f31848c = new AtomicReference<>(ehb.COMPLETE);

        public C5123a(ycg<? super T> ycgVar, Iterator<? extends aaa<? extends T>> it) {
            this.f31846a = ycgVar;
            this.f31850e = it;
        }

        /* JADX INFO: renamed from: a */
        public void m9693a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f31848c;
            ycg<? super T> ycgVar = this.f31846a;
            b0f b0fVar = this.f31849d;
            while (!b0fVar.isDisposed()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != ehb.COMPLETE) {
                        long j = this.f31851f;
                        if (j != this.f31847b.get()) {
                            this.f31851f = j + 1;
                            atomicReference.lazySet(null);
                            ycgVar.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!b0fVar.isDisposed()) {
                        try {
                            if (this.f31850e.hasNext()) {
                                try {
                                    ((aaa) xjb.requireNonNull(this.f31850e.next(), "The source Iterator returned a null MaybeSource")).subscribe(this);
                                } catch (Throwable th) {
                                    n75.throwIfFatal(th);
                                    ycgVar.onError(th);
                                    return;
                                }
                            } else {
                                ycgVar.onComplete();
                            }
                        } catch (Throwable th2) {
                            n75.throwIfFatal(th2);
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
            this.f31849d.dispose();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f31848c.lazySet(ehb.COMPLETE);
            m9693a();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f31846a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            this.f31849d.replace(mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f31848c.lazySet(t);
            m9693a();
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f31847b, j);
                m9693a();
            }
        }
    }

    public e5a(Iterable<? extends aaa<? extends T>> iterable) {
        this.f31845b = iterable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        try {
            C5123a c5123a = new C5123a(ycgVar, (Iterator) xjb.requireNonNull(this.f31845b.iterator(), "The sources Iterable returned a null Iterator"));
            ycgVar.onSubscribe(c5123a);
            c5123a.m9693a();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }
}
