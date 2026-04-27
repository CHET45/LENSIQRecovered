package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class ij6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final voe f47164c;

    /* JADX INFO: renamed from: d */
    public final boolean f47165d;

    /* JADX INFO: renamed from: ij6$a */
    public static final class RunnableC7315a<T> extends AtomicReference<Thread> implements lj6<T>, fdg, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f47166a;

        /* JADX INFO: renamed from: b */
        public final voe.AbstractC14185c f47167b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<fdg> f47168c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f47169d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final boolean f47170e;

        /* JADX INFO: renamed from: f */
        public zjd<T> f47171f;

        /* JADX INFO: renamed from: ij6$a$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final fdg f47172a;

            /* JADX INFO: renamed from: b */
            public final long f47173b;

            public a(fdg fdgVar, long j) {
                this.f47172a = fdgVar;
                this.f47173b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f47172a.request(this.f47173b);
            }
        }

        public RunnableC7315a(ycg<? super T> ycgVar, voe.AbstractC14185c abstractC14185c, zjd<T> zjdVar, boolean z) {
            this.f47166a = ycgVar;
            this.f47167b = abstractC14185c;
            this.f47171f = zjdVar;
            this.f47170e = !z;
        }

        /* JADX INFO: renamed from: a */
        public void m13132a(long j, fdg fdgVar) {
            if (this.f47170e || Thread.currentThread() == get()) {
                fdgVar.request(j);
            } else {
                this.f47167b.schedule(new a(fdgVar, j));
            }
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f47168c);
            this.f47167b.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f47166a.onComplete();
            this.f47167b.dispose();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f47166a.onError(th);
            this.f47167b.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f47166a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this.f47168c, fdgVar)) {
                long andSet = this.f47169d.getAndSet(0L);
                if (andSet != 0) {
                    m13132a(andSet, fdgVar);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                fdg fdgVar = this.f47168c.get();
                if (fdgVar != null) {
                    m13132a(j, fdgVar);
                    return;
                }
                so0.add(this.f47169d, j);
                fdg fdgVar2 = this.f47168c.get();
                if (fdgVar2 != null) {
                    long andSet = this.f47169d.getAndSet(0L);
                    if (andSet != 0) {
                        m13132a(andSet, fdgVar2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            zjd<T> zjdVar = this.f47171f;
            this.f47171f = null;
            zjdVar.subscribe(this);
        }
    }

    public ij6(m86<T> m86Var, voe voeVar, boolean z) {
        super(m86Var);
        this.f47164c = voeVar;
        this.f47165d = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        voe.AbstractC14185c abstractC14185cCreateWorker = this.f47164c.createWorker();
        RunnableC7315a runnableC7315a = new RunnableC7315a(ycgVar, abstractC14185cCreateWorker, this.f52360b, this.f47165d);
        ycgVar.onSubscribe(runnableC7315a);
        abstractC14185cCreateWorker.schedule(runnableC7315a);
    }
}
