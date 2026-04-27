package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class rub<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f79671b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f79672c;

    /* JADX INFO: renamed from: d */
    public final woe f79673d;

    /* JADX INFO: renamed from: e */
    public final int f79674e;

    /* JADX INFO: renamed from: f */
    public final boolean f79675f;

    /* JADX INFO: renamed from: rub$a */
    public static final class C12306a<T> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f79676C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f79677F;

        /* JADX INFO: renamed from: H */
        public Throwable f79678H;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f79679a;

        /* JADX INFO: renamed from: b */
        public final long f79680b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f79681c;

        /* JADX INFO: renamed from: d */
        public final woe f79682d;

        /* JADX INFO: renamed from: e */
        public final qzf<Object> f79683e;

        /* JADX INFO: renamed from: f */
        public final boolean f79684f;

        /* JADX INFO: renamed from: m */
        public lf4 f79685m;

        public C12306a(pxb<? super T> actual, long time, TimeUnit unit, woe scheduler, int bufferSize, boolean delayError) {
            this.f79679a = actual;
            this.f79680b = time;
            this.f79681c = unit;
            this.f79682d = scheduler;
            this.f79683e = new qzf<>(bufferSize);
            this.f79684f = delayError;
        }

        /* JADX INFO: renamed from: a */
        public void m21572a() {
            if (getAndIncrement() != 0) {
                return;
            }
            pxb<? super T> pxbVar = this.f79679a;
            qzf<Object> qzfVar = this.f79683e;
            boolean z = this.f79684f;
            TimeUnit timeUnit = this.f79681c;
            woe woeVar = this.f79682d;
            long j = this.f79680b;
            int iAddAndGet = 1;
            while (!this.f79676C) {
                boolean z2 = this.f79677F;
                Long l = (Long) qzfVar.peek();
                boolean z3 = l == null;
                long jNow = woeVar.now(timeUnit);
                if (!z3 && l.longValue() > jNow - j) {
                    z3 = true;
                }
                if (z2) {
                    if (!z) {
                        Throwable th = this.f79678H;
                        if (th != null) {
                            this.f79683e.clear();
                            pxbVar.onError(th);
                            return;
                        } else if (z3) {
                            pxbVar.onComplete();
                            return;
                        }
                    } else if (z3) {
                        Throwable th2 = this.f79678H;
                        if (th2 != null) {
                            pxbVar.onError(th2);
                            return;
                        } else {
                            pxbVar.onComplete();
                            return;
                        }
                    }
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    qzfVar.poll();
                    pxbVar.onNext(qzfVar.poll());
                }
            }
            this.f79683e.clear();
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f79676C) {
                return;
            }
            this.f79676C = true;
            this.f79685m.dispose();
            if (getAndIncrement() == 0) {
                this.f79683e.clear();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f79676C;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f79677F = true;
            m21572a();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f79678H = t;
            this.f79677F = true;
            m21572a();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f79683e.offer(Long.valueOf(this.f79682d.now(this.f79681c)), t);
            m21572a();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f79685m, d)) {
                this.f79685m = d;
                this.f79679a.onSubscribe(this);
            }
        }
    }

    public rub(wub<T> source, long time, TimeUnit unit, woe scheduler, int bufferSize, boolean delayError) {
        super(source);
        this.f79671b = time;
        this.f79672c = unit;
        this.f79673d = scheduler;
        this.f79674e = bufferSize;
        this.f79675f = delayError;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C12306a(t, this.f79671b, this.f79672c, this.f79673d, this.f79674e, this.f79675f));
    }
}
