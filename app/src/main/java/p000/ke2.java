package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ke2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends ph2> f53686a;

    /* JADX INFO: renamed from: b */
    public final int f53687b;

    /* JADX INFO: renamed from: ke2$a */
    public static final class C8293a extends AtomicInteger implements kj6<ph2>, lf4 {
        private static final long serialVersionUID = 9032184911934499404L;

        /* JADX INFO: renamed from: C */
        public zif<ph2> f53688C;

        /* JADX INFO: renamed from: F */
        public fdg f53689F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f53690H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f53691L;

        /* JADX INFO: renamed from: a */
        public final ch2 f53692a;

        /* JADX INFO: renamed from: b */
        public final int f53693b;

        /* JADX INFO: renamed from: c */
        public final int f53694c;

        /* JADX INFO: renamed from: d */
        public final a f53695d = new a(this);

        /* JADX INFO: renamed from: e */
        public final AtomicBoolean f53696e = new AtomicBoolean();

        /* JADX INFO: renamed from: f */
        public int f53697f;

        /* JADX INFO: renamed from: m */
        public int f53698m;

        /* JADX INFO: renamed from: ke2$a$a */
        public static final class a extends AtomicReference<lf4> implements ch2 {
            private static final long serialVersionUID = -5454794857847146511L;

            /* JADX INFO: renamed from: a */
            public final C8293a f53699a;

            public a(C8293a parent) {
                this.f53699a = parent;
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                this.f53699a.m14667b();
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                this.f53699a.m14668c(e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.replace(this, d);
            }
        }

        public C8293a(ch2 actual, int prefetch) {
            this.f53692a = actual;
            this.f53693b = prefetch;
            this.f53694c = prefetch - (prefetch >> 2);
        }

        /* JADX INFO: renamed from: a */
        public void m14666a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!isDisposed()) {
                if (!this.f53691L) {
                    boolean z = this.f53690H;
                    try {
                        ph2 ph2VarPoll = this.f53688C.poll();
                        boolean z2 = ph2VarPoll == null;
                        if (z && z2) {
                            this.f53692a.onComplete();
                            return;
                        } else if (!z2) {
                            this.f53691L = true;
                            ph2VarPoll.subscribe(this.f53695d);
                            m14669d();
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        m14668c(th);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14667b() {
            this.f53691L = false;
            m14666a();
        }

        /* JADX INFO: renamed from: c */
        public void m14668c(Throwable e) {
            if (!this.f53696e.compareAndSet(false, true)) {
                ofe.onError(e);
            } else {
                this.f53689F.cancel();
                this.f53692a.onError(e);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m14669d() {
            if (this.f53697f != 1) {
                int i = this.f53698m + 1;
                if (i != this.f53694c) {
                    this.f53698m = i;
                } else {
                    this.f53698m = 0;
                    this.f53689F.request(i);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f53689F.cancel();
            zf4.dispose(this.f53695d);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f53695d.get());
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f53690H = true;
            m14666a();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (!this.f53696e.compareAndSet(false, true)) {
                ofe.onError(t);
            } else {
                zf4.dispose(this.f53695d);
                this.f53692a.onError(t);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f53689F, s)) {
                this.f53689F = s;
                int i = this.f53693b;
                long j = i == Integer.MAX_VALUE ? Long.MAX_VALUE : i;
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f53697f = iRequestFusion;
                        this.f53688C = bodVar;
                        this.f53690H = true;
                        this.f53692a.onSubscribe(this);
                        m14666a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f53697f = iRequestFusion;
                        this.f53688C = bodVar;
                        this.f53692a.onSubscribe(this);
                        s.request(j);
                        return;
                    }
                }
                if (this.f53693b == Integer.MAX_VALUE) {
                    this.f53688C = new qzf(l86.bufferSize());
                } else {
                    this.f53688C = new ozf(this.f53693b);
                }
                this.f53692a.onSubscribe(this);
                s.request(j);
            }
        }

        @Override // p000.ycg
        public void onNext(ph2 t) {
            if (this.f53697f != 0 || this.f53688C.offer(t)) {
                m14666a();
            } else {
                onError(new bwa());
            }
        }
    }

    public ke2(zjd<? extends ph2> sources, int prefetch) {
        this.f53686a = sources;
        this.f53687b = prefetch;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f53686a.subscribe(new C8293a(observer, this.f53687b));
    }
}
