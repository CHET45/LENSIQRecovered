package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public final class wd6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final Stream<T> f93976b;

    /* JADX INFO: renamed from: wd6$a */
    public static abstract class AbstractC14555a<T> extends AtomicLong implements bod<T> {
        private static final long serialVersionUID = -9082954702547571853L;

        /* JADX INFO: renamed from: a */
        public Iterator<T> f93977a;

        /* JADX INFO: renamed from: b */
        public AutoCloseable f93978b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f93979c;

        /* JADX INFO: renamed from: d */
        public boolean f93980d;

        public AbstractC14555a(Iterator<T> iterator, AutoCloseable closeable) {
            this.f93977a = iterator;
            this.f93978b = closeable;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f93979c = true;
            request(1L);
        }

        @Override // p000.zif
        public void clear() {
            this.f93977a = null;
            AutoCloseable autoCloseable = this.f93978b;
            this.f93978b = null;
            if (autoCloseable != null) {
                wd6.m24487b(autoCloseable);
            }
        }

        @Override // p000.zif
        public boolean isEmpty() {
            Iterator<T> it = this.f93977a;
            if (it == null) {
                return true;
            }
            if (!this.f93980d || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // p000.zif
        public boolean offer(@cfb T value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.zif
        @dib
        public T poll() {
            Iterator<T> it = this.f93977a;
            if (it == null) {
                return null;
            }
            if (!this.f93980d) {
                this.f93980d = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            T next = this.f93977a.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n) && ro0.add(this, n) == 0) {
                run(n);
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 1) == 0) {
                return 0;
            }
            lazySet(Long.MAX_VALUE);
            return 1;
        }

        public abstract void run(long n);

        @Override // p000.zif
        public boolean offer(@cfb T v1, @cfb T v2) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: wd6$b */
    public static final class C14556b<T> extends AbstractC14555a<T> {
        private static final long serialVersionUID = -9082954702547571853L;

        /* JADX INFO: renamed from: e */
        public final bq2<? super T> f93981e;

        public C14556b(bq2<? super T> downstream, Iterator<T> iterator, AutoCloseable closeable) {
            super(iterator, closeable);
            this.f93981e = downstream;
        }

        @Override // p000.wd6.AbstractC14555a
        public void run(long n) {
            Iterator<T> it = this.f93977a;
            bq2<? super T> bq2Var = this.f93981e;
            long j = 0;
            while (!this.f93979c) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator returned a null value");
                    if (bq2Var.tryOnNext(next)) {
                        j++;
                    }
                    if (this.f93979c) {
                        continue;
                    } else {
                        try {
                            if (!it.hasNext()) {
                                bq2Var.onComplete();
                                this.f93979c = true;
                            } else if (j != n) {
                                continue;
                            } else {
                                n = get();
                                if (j != n) {
                                    continue;
                                } else if (compareAndSet(n, 0L)) {
                                    return;
                                } else {
                                    n = get();
                                }
                            }
                        } catch (Throwable th) {
                            o75.throwIfFatal(th);
                            bq2Var.onError(th);
                            this.f93979c = true;
                        }
                    }
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    bq2Var.onError(th2);
                    this.f93979c = true;
                }
            }
            clear();
        }
    }

    /* JADX INFO: renamed from: wd6$c */
    public static final class C14557c<T> extends AbstractC14555a<T> {
        private static final long serialVersionUID = -9082954702547571853L;

        /* JADX INFO: renamed from: e */
        public final ycg<? super T> f93982e;

        public C14557c(ycg<? super T> downstream, Iterator<T> iterator, AutoCloseable closeable) {
            super(iterator, closeable);
            this.f93982e = downstream;
        }

        @Override // p000.wd6.AbstractC14555a
        public void run(long n) {
            Iterator<T> it = this.f93977a;
            ycg<? super T> ycgVar = this.f93982e;
            long j = 0;
            while (!this.f93979c) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator returned a null value");
                    ycgVar.onNext(next);
                    if (this.f93979c) {
                        continue;
                    } else {
                        try {
                            if (it.hasNext()) {
                                j++;
                                if (j != n) {
                                    continue;
                                } else {
                                    n = get();
                                    if (j != n) {
                                        continue;
                                    } else if (compareAndSet(n, 0L)) {
                                        return;
                                    } else {
                                        n = get();
                                    }
                                }
                            } else {
                                ycgVar.onComplete();
                                this.f93979c = true;
                            }
                        } catch (Throwable th) {
                            o75.throwIfFatal(th);
                            ycgVar.onError(th);
                            this.f93979c = true;
                        }
                    }
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    ycgVar.onError(th2);
                    this.f93979c = true;
                }
            }
            clear();
        }
    }

    public wd6(Stream<T> stream) {
        this.f93976b = stream;
    }

    /* JADX INFO: renamed from: b */
    public static void m24487b(AutoCloseable c) {
        try {
            c.close();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    public static <T> void subscribeStream(ycg<? super T> s, Stream<T> stream) {
        try {
            Iterator<T> it = stream.iterator();
            if (!it.hasNext()) {
                w05.complete(s);
                m24487b(stream);
            } else if (s instanceof bq2) {
                s.onSubscribe(new C14556b((bq2) s, it, stream));
            } else {
                s.onSubscribe(new C14557c(s, it, stream));
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
            m24487b(stream);
        }
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        subscribeStream(s, this.f93976b);
    }
}
