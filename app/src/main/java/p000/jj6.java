package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class jj6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final woe f50700c;

    /* JADX INFO: renamed from: d */
    public final boolean f50701d;

    /* JADX INFO: renamed from: jj6$a */
    public static final class RunnableC7915a<T> extends AtomicReference<Thread> implements kj6<T>, fdg, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f50702a;

        /* JADX INFO: renamed from: b */
        public final woe.AbstractC14729c f50703b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<fdg> f50704c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f50705d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final boolean f50706e;

        /* JADX INFO: renamed from: f */
        public zjd<T> f50707f;

        /* JADX INFO: renamed from: jj6$a$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final fdg f50708a;

            /* JADX INFO: renamed from: b */
            public final long f50709b;

            public a(fdg s, long n) {
                this.f50708a = s;
                this.f50709b = n;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f50708a.request(this.f50709b);
            }
        }

        public RunnableC7915a(ycg<? super T> actual, woe.AbstractC14729c worker, zjd<T> source, boolean requestOn) {
            this.f50702a = actual;
            this.f50703b = worker;
            this.f50707f = source;
            this.f50706e = !requestOn;
        }

        /* JADX INFO: renamed from: a */
        public void m14133a(final long n, final fdg s) {
            if (this.f50706e || Thread.currentThread() == get()) {
                s.request(n);
            } else {
                this.f50703b.schedule(new a(s, n));
            }
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f50704c);
            this.f50703b.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f50702a.onComplete();
            this.f50703b.dispose();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f50702a.onError(t);
            this.f50703b.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f50702a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.setOnce(this.f50704c, s)) {
                long andSet = this.f50705d.getAndSet(0L);
                if (andSet != 0) {
                    m14133a(andSet, s);
                }
            }
        }

        @Override // p000.fdg
        public void request(final long n) {
            if (ldg.validate(n)) {
                fdg fdgVar = this.f50704c.get();
                if (fdgVar != null) {
                    m14133a(n, fdgVar);
                    return;
                }
                ro0.add(this.f50705d, n);
                fdg fdgVar2 = this.f50704c.get();
                if (fdgVar2 != null) {
                    long andSet = this.f50705d.getAndSet(0L);
                    if (andSet != 0) {
                        m14133a(andSet, fdgVar2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            zjd<T> zjdVar = this.f50707f;
            this.f50707f = null;
            zjdVar.subscribe(this);
        }
    }

    public jj6(l86<T> source, woe scheduler, boolean nonScheduledRequests) {
        super(source);
        this.f50700c = scheduler;
        this.f50701d = nonScheduledRequests;
    }

    @Override // p000.l86
    public void subscribeActual(final ycg<? super T> s) {
        woe.AbstractC14729c abstractC14729cCreateWorker = this.f50700c.createWorker();
        RunnableC7915a runnableC7915a = new RunnableC7915a(s, abstractC14729cCreateWorker, this.f49321b, this.f50701d);
        s.onSubscribe(runnableC7915a);
        abstractC14729cCreateWorker.schedule(runnableC7915a);
    }
}
