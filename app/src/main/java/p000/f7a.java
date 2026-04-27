package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class f7a<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final aaa<T> f35622b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends Iterable<? extends R>> f35623c;

    /* JADX INFO: renamed from: f7a$a */
    public static final class C5663a<T, R> extends sv0<R> implements l9a<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f35624a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends Iterable<? extends R>> f35625b;

        /* JADX INFO: renamed from: c */
        public final AtomicLong f35626c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public mf4 f35627d;

        /* JADX INFO: renamed from: e */
        public volatile Iterator<? extends R> f35628e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f35629f;

        /* JADX INFO: renamed from: m */
        public boolean f35630m;

        public C5663a(ycg<? super R> ycgVar, py6<? super T, ? extends Iterable<? extends R>> py6Var) {
            this.f35624a = ycgVar;
            this.f35625b = py6Var;
        }

        /* JADX INFO: renamed from: a */
        public void m10698a(ycg<? super R> ycgVar, Iterator<? extends R> it) {
            while (!this.f35629f) {
                try {
                    ycgVar.onNext(it.next());
                    if (this.f35629f) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            ycgVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        ycgVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    ycgVar.onError(th2);
                    return;
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f35629f = true;
            this.f35627d.dispose();
            this.f35627d = ag4.DISPOSED;
        }

        @Override // p000.ajf
        public void clear() {
            this.f35628e = null;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f35624a;
            Iterator<? extends R> it = this.f35628e;
            if (this.f35630m && it != null) {
                ycgVar.onNext(null);
                ycgVar.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j = this.f35626c.get();
                    if (j == Long.MAX_VALUE) {
                        m10698a(ycgVar, it);
                        return;
                    }
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.f35629f) {
                            return;
                        }
                        try {
                            ycgVar.onNext((Object) xjb.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (this.f35629f) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    ycgVar.onComplete();
                                    return;
                                }
                            } catch (Throwable th) {
                                n75.throwIfFatal(th);
                                ycgVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            n75.throwIfFatal(th2);
                            ycgVar.onError(th2);
                            return;
                        }
                    }
                    if (j2 != 0) {
                        so0.produced(this.f35626c, j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f35628e;
                }
            }
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f35628e == null;
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f35624a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f35627d = ag4.DISPOSED;
            this.f35624a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f35627d, mf4Var)) {
                this.f35627d = mf4Var;
                this.f35624a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                Iterator<? extends R> it = this.f35625b.apply(t).iterator();
                if (!it.hasNext()) {
                    this.f35624a.onComplete();
                } else {
                    this.f35628e = it;
                    drain();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f35624a.onError(th);
            }
        }

        @Override // p000.ajf
        @cib
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f35628e;
            if (it == null) {
                return null;
            }
            R r = (R) xjb.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f35628e = null;
            }
            return r;
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f35626c, j);
                drain();
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f35630m = true;
            return 2;
        }
    }

    public f7a(aaa<T> aaaVar, py6<? super T, ? extends Iterable<? extends R>> py6Var) {
        this.f35622b = aaaVar;
        this.f35623c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f35622b.subscribe(new C5663a(ycgVar, this.f35623c));
    }
}
