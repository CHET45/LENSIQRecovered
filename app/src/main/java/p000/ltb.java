package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ltb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final l11<? super Integer, ? super Throwable> f58708b;

    /* JADX INFO: renamed from: ltb$a */
    public static final class C8970a<T> extends AtomicInteger implements pxb<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f58709a;

        /* JADX INFO: renamed from: b */
        public final a0f f58710b;

        /* JADX INFO: renamed from: c */
        public final wub<? extends T> f58711c;

        /* JADX INFO: renamed from: d */
        public final l11<? super Integer, ? super Throwable> f58712d;

        /* JADX INFO: renamed from: e */
        public int f58713e;

        public C8970a(pxb<? super T> actual, l11<? super Integer, ? super Throwable> predicate, a0f sa, wub<? extends T> source) {
            this.f58709a = actual;
            this.f58710b = sa;
            this.f58711c = source;
            this.f58712d = predicate;
        }

        /* JADX INFO: renamed from: a */
        public void m16382a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f58710b.isDisposed()) {
                    this.f58711c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f58709a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            try {
                l11<? super Integer, ? super Throwable> l11Var = this.f58712d;
                int i = this.f58713e + 1;
                this.f58713e = i;
                if (l11Var.test(Integer.valueOf(i), t)) {
                    m16382a();
                } else {
                    this.f58709a.onError(t);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f58709a.onError(new qm2(t, th));
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f58709a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f58710b.replace(d);
        }
    }

    public ltb(vkb<T> source, l11<? super Integer, ? super Throwable> predicate) {
        super(source);
        this.f58708b = predicate;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        a0f a0fVar = new a0f();
        observer.onSubscribe(a0fVar);
        new C8970a(observer, this.f58708b, a0fVar, this.f63101a).m16382a();
    }
}
