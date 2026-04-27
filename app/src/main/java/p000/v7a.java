package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public final class v7a<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final r4a<T> f90239a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends Stream<? extends R>> f90240b;

    /* JADX INFO: renamed from: v7a$a */
    public static final class C13926a<T, R> extends pv0<R> implements k9a<T>, hnf<T> {
        private static final long serialVersionUID = 7363336003027148283L;

        /* JADX INFO: renamed from: C */
        public boolean f90241C;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f90242a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends Stream<? extends R>> f90243b;

        /* JADX INFO: renamed from: c */
        public lf4 f90244c;

        /* JADX INFO: renamed from: d */
        public volatile Iterator<? extends R> f90245d;

        /* JADX INFO: renamed from: e */
        public AutoCloseable f90246e;

        /* JADX INFO: renamed from: f */
        public boolean f90247f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f90248m;

        public C13926a(pxb<? super R> downstream, sy6<? super T, ? extends Stream<? extends R>> mapper) {
            this.f90242a = downstream;
            this.f90243b = mapper;
        }

        /* JADX INFO: renamed from: a */
        public void m23842a(AutoCloseable c) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m23843b() {
            if (getAndIncrement() != 0) {
                return;
            }
            pxb<? super R> pxbVar = this.f90242a;
            Iterator<? extends R> it = this.f90245d;
            int iAddAndGet = 1;
            while (true) {
                if (this.f90248m) {
                    clear();
                } else if (this.f90241C) {
                    pxbVar.onNext(null);
                    pxbVar.onComplete();
                } else {
                    try {
                        R next = it.next();
                        if (!this.f90248m) {
                            pxbVar.onNext(next);
                            if (!this.f90248m) {
                                try {
                                    boolean zHasNext = it.hasNext();
                                    if (!this.f90248m && !zHasNext) {
                                        pxbVar.onComplete();
                                        this.f90248m = true;
                                    }
                                } catch (Throwable th) {
                                    o75.throwIfFatal(th);
                                    pxbVar.onError(th);
                                    this.f90248m = true;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        pxbVar.onError(th2);
                        this.f90248m = true;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p000.zif
        public void clear() {
            this.f90245d = null;
            AutoCloseable autoCloseable = this.f90246e;
            this.f90246e = null;
            m23842a(autoCloseable);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f90248m = true;
            this.f90244c.dispose();
            if (this.f90241C) {
                return;
            }
            m23843b();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f90248m;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            Iterator<? extends R> it = this.f90245d;
            if (it == null) {
                return true;
            }
            if (!this.f90247f || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f90242a.onComplete();
        }

        @Override // p000.k9a
        public void onError(@cfb Throwable e) {
            this.f90242a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(@cfb lf4 d) {
            if (zf4.validate(this.f90244c, d)) {
                this.f90244c = d;
                this.f90242a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(@cfb T t) {
            try {
                Stream<? extends R> streamApply = this.f90243b.apply(t);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                Stream<? extends R> stream = streamApply;
                Iterator<? extends R> it = stream.iterator();
                if (!it.hasNext()) {
                    this.f90242a.onComplete();
                    m23842a(stream);
                } else {
                    this.f90245d = it;
                    this.f90246e = stream;
                    m23843b();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f90242a.onError(th);
            }
        }

        @Override // p000.zif
        @dib
        public R poll() throws Throwable {
            Iterator<? extends R> it = this.f90245d;
            if (it == null) {
                return null;
            }
            if (!this.f90247f) {
                this.f90247f = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            return it.next();
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            this.f90241C = true;
            return 2;
        }
    }

    public v7a(r4a<T> source, sy6<? super T, ? extends Stream<? extends R>> mapper) {
        this.f90239a = source;
        this.f90240b = mapper;
    }

    @Override // p000.vkb
    public void subscribeActual(@cfb pxb<? super R> s) {
        this.f90239a.subscribe(new C13926a(s, this.f90240b));
    }
}
