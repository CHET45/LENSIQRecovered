package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public final class u7a<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final r4a<T> f86986b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends Stream<? extends R>> f86987c;

    /* JADX INFO: renamed from: u7a$a */
    public static final class C13394a<T, R> extends rv0<R> implements k9a<T>, hnf<T> {
        private static final long serialVersionUID = 7363336003027148283L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f86988C;

        /* JADX INFO: renamed from: F */
        public boolean f86989F;

        /* JADX INFO: renamed from: H */
        public long f86990H;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f86991a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends Stream<? extends R>> f86992b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f86993c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public lf4 f86994d;

        /* JADX INFO: renamed from: e */
        public volatile Iterator<? extends R> f86995e;

        /* JADX INFO: renamed from: f */
        public AutoCloseable f86996f;

        /* JADX INFO: renamed from: m */
        public boolean f86997m;

        public C13394a(ycg<? super R> downstream, sy6<? super T, ? extends Stream<? extends R>> mapper) {
            this.f86991a = downstream;
            this.f86992b = mapper;
        }

        /* JADX INFO: renamed from: a */
        public void m23126a(AutoCloseable c) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f86988C = true;
            this.f86994d.dispose();
            if (this.f86989F) {
                return;
            }
            drain();
        }

        @Override // p000.zif
        public void clear() {
            this.f86995e = null;
            AutoCloseable autoCloseable = this.f86996f;
            this.f86996f = null;
            m23126a(autoCloseable);
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f86991a;
            long j = this.f86990H;
            long j2 = this.f86993c.get();
            Iterator<? extends R> it = this.f86995e;
            int iAddAndGet = 1;
            while (true) {
                if (this.f86988C) {
                    clear();
                } else if (this.f86989F) {
                    if (it != null) {
                        ycgVar.onNext(null);
                        ycgVar.onComplete();
                    }
                } else if (it != null && j != j2) {
                    try {
                        R next = it.next();
                        if (!this.f86988C) {
                            ycgVar.onNext(next);
                            j++;
                            if (!this.f86988C) {
                                try {
                                    boolean zHasNext = it.hasNext();
                                    if (!this.f86988C && !zHasNext) {
                                        ycgVar.onComplete();
                                        this.f86988C = true;
                                    }
                                } catch (Throwable th) {
                                    o75.throwIfFatal(th);
                                    ycgVar.onError(th);
                                    this.f86988C = true;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        ycgVar.onError(th2);
                        this.f86988C = true;
                    }
                }
                this.f86990H = j;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                j2 = this.f86993c.get();
                if (it == null) {
                    it = this.f86995e;
                }
            }
        }

        @Override // p000.zif
        public boolean isEmpty() {
            Iterator<? extends R> it = this.f86995e;
            if (it == null) {
                return true;
            }
            if (!this.f86997m || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f86991a.onComplete();
        }

        @Override // p000.k9a
        public void onError(@cfb Throwable e) {
            this.f86991a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(@cfb lf4 d) {
            if (zf4.validate(this.f86994d, d)) {
                this.f86994d = d;
                this.f86991a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(@cfb T t) {
            try {
                Stream<? extends R> streamApply = this.f86992b.apply(t);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                Stream<? extends R> stream = streamApply;
                Iterator<? extends R> it = stream.iterator();
                if (!it.hasNext()) {
                    this.f86991a.onComplete();
                    m23126a(stream);
                } else {
                    this.f86995e = it;
                    this.f86996f = stream;
                    drain();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f86991a.onError(th);
            }
        }

        @Override // p000.zif
        @dib
        public R poll() throws Throwable {
            Iterator<? extends R> it = this.f86995e;
            if (it == null) {
                return null;
            }
            if (!this.f86997m) {
                this.f86997m = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            return it.next();
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f86993c, n);
                drain();
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            this.f86989F = true;
            return 2;
        }
    }

    public u7a(r4a<T> source, sy6<? super T, ? extends Stream<? extends R>> mapper) {
        this.f86986b = source;
        this.f86987c = mapper;
    }

    @Override // p000.l86
    public void subscribeActual(@cfb ycg<? super R> s) {
        this.f86986b.subscribe(new C13394a(s, this.f86987c));
    }
}
