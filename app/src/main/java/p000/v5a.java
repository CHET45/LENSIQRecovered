package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class v5a<T, U> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final zjd<U> f90021b;

    /* JADX INFO: renamed from: v5a$a */
    public static final class C13876a<T> extends AtomicReference<lf4> implements k9a<T> {
        private static final long serialVersionUID = 706635022205076709L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f90022a;

        public C13876a(k9a<? super T> downstream) {
            this.f90022a = downstream;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f90022a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f90022a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f90022a.onSuccess(value);
        }
    }

    /* JADX INFO: renamed from: v5a$b */
    public static final class C13877b<T> implements kj6<Object>, lf4 {

        /* JADX INFO: renamed from: a */
        public final C13876a<T> f90023a;

        /* JADX INFO: renamed from: b */
        public z9a<T> f90024b;

        /* JADX INFO: renamed from: c */
        public fdg f90025c;

        public C13877b(k9a<? super T> actual, z9a<T> source) {
            this.f90023a = new C13876a<>(actual);
            this.f90024b = source;
        }

        /* JADX INFO: renamed from: a */
        public void m23800a() {
            z9a<T> z9aVar = this.f90024b;
            this.f90024b = null;
            z9aVar.subscribe(this.f90023a);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f90025c.cancel();
            this.f90025c = ldg.CANCELLED;
            zf4.dispose(this.f90023a);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f90023a.get());
        }

        @Override // p000.ycg
        public void onComplete() {
            fdg fdgVar = this.f90025c;
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar != ldgVar) {
                this.f90025c = ldgVar;
                m23800a();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            fdg fdgVar = this.f90025c;
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar == ldgVar) {
                ofe.onError(t);
            } else {
                this.f90025c = ldgVar;
                this.f90023a.f90022a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            fdg fdgVar = this.f90025c;
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar != ldgVar) {
                fdgVar.cancel();
                this.f90025c = ldgVar;
                m23800a();
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f90025c, s)) {
                this.f90025c = s;
                this.f90023a.f90022a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public v5a(z9a<T> source, zjd<U> other) {
        super(source);
        this.f90021b = other;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f90021b.subscribe(new C13877b(observer, this.f100099a));
    }
}
