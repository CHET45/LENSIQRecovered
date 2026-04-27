package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class q5a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f73273b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f73274c;

    /* JADX INFO: renamed from: d */
    public final voe f73275d;

    /* JADX INFO: renamed from: q5a$a */
    public static final class RunnableC11311a<T> extends AtomicReference<mf4> implements l9a<T>, mf4, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f73276a;

        /* JADX INFO: renamed from: b */
        public final long f73277b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f73278c;

        /* JADX INFO: renamed from: d */
        public final voe f73279d;

        /* JADX INFO: renamed from: e */
        public T f73280e;

        /* JADX INFO: renamed from: f */
        public Throwable f73281f;

        public RunnableC11311a(l9a<? super T> l9aVar, long j, TimeUnit timeUnit, voe voeVar) {
            this.f73276a = l9aVar;
            this.f73277b = j;
            this.f73278c = timeUnit;
            this.f73279d = voeVar;
        }

        /* JADX INFO: renamed from: a */
        public void m20074a() {
            ag4.replace(this, this.f73279d.scheduleDirect(this, this.f73277b, this.f73278c));
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            m20074a();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f73281f = th;
            m20074a();
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f73276a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f73280e = t;
            m20074a();
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f73281f;
            if (th != null) {
                this.f73276a.onError(th);
                return;
            }
            T t = this.f73280e;
            if (t != null) {
                this.f73276a.onSuccess(t);
            } else {
                this.f73276a.onComplete();
            }
        }
    }

    public q5a(aaa<T> aaaVar, long j, TimeUnit timeUnit, voe voeVar) {
        super(aaaVar);
        this.f73273b = j;
        this.f73274c = timeUnit;
        this.f73275d = voeVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new RunnableC11311a(l9aVar, this.f73273b, this.f73274c, this.f73275d));
    }
}
