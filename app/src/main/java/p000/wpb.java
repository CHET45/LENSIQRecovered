package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public final class wpb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final Stream<T> f95036a;

    /* JADX INFO: renamed from: wpb$a */
    public static final class C14739a<T> implements tmd<T> {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f95037a;

        /* JADX INFO: renamed from: b */
        public Iterator<T> f95038b;

        /* JADX INFO: renamed from: c */
        public AutoCloseable f95039c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f95040d;

        /* JADX INFO: renamed from: e */
        public boolean f95041e;

        /* JADX INFO: renamed from: f */
        public boolean f95042f;

        public C14739a(pxb<? super T> downstream, Iterator<T> iterator, AutoCloseable closeable) {
            this.f95037a = downstream;
            this.f95038b = iterator;
            this.f95039c = closeable;
        }

        @Override // p000.zif
        public void clear() {
            this.f95038b = null;
            AutoCloseable autoCloseable = this.f95039c;
            this.f95039c = null;
            if (autoCloseable != null) {
                wpb.m24711a(autoCloseable);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f95040d = true;
            run();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f95040d;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            Iterator<T> it = this.f95038b;
            if (it == null) {
                return true;
            }
            if (!this.f95041e || it.hasNext()) {
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
            Iterator<T> it = this.f95038b;
            if (it == null) {
                return null;
            }
            if (!this.f95041e) {
                this.f95041e = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            T next = this.f95038b.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 1) == 0) {
                return 0;
            }
            this.f95042f = true;
            return 1;
        }

        public void run() {
            if (this.f95042f) {
                return;
            }
            Iterator<T> it = this.f95038b;
            pxb<? super T> pxbVar = this.f95037a;
            while (!this.f95040d) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator.next returned a null value");
                    if (!this.f95040d) {
                        pxbVar.onNext(next);
                        if (!this.f95040d) {
                            try {
                                if (!it.hasNext()) {
                                    pxbVar.onComplete();
                                    this.f95040d = true;
                                }
                            } catch (Throwable th) {
                                o75.throwIfFatal(th);
                                pxbVar.onError(th);
                                this.f95040d = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    pxbVar.onError(th2);
                    this.f95040d = true;
                }
            }
            clear();
        }

        @Override // p000.zif
        public boolean offer(@cfb T v1, @cfb T v2) {
            throw new UnsupportedOperationException();
        }
    }

    public wpb(Stream<T> stream) {
        this.f95036a = stream;
    }

    /* JADX INFO: renamed from: a */
    public static void m24711a(AutoCloseable c) {
        try {
            c.close();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    public static <T> void subscribeStream(pxb<? super T> observer, Stream<T> stream) {
        try {
            Iterator<T> it = stream.iterator();
            if (!it.hasNext()) {
                b05.complete(observer);
                m24711a(stream);
            } else {
                C14739a c14739a = new C14739a(observer, it, stream);
                observer.onSubscribe(c14739a);
                c14739a.run();
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
            m24711a(stream);
        }
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        subscribeStream(observer, this.f95036a);
    }
}
