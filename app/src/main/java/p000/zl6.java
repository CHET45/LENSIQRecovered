package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zl6<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<? extends T>[] f105377b;

    /* JADX INFO: renamed from: c */
    public final Iterable<? extends zjd<? extends T>> f105378c;

    /* JADX INFO: renamed from: d */
    public final py6<? super Object[], ? extends R> f105379d;

    /* JADX INFO: renamed from: e */
    public final int f105380e;

    /* JADX INFO: renamed from: f */
    public final boolean f105381f;

    /* JADX INFO: renamed from: zl6$a */
    public static final class C16172a<T, R> extends AtomicInteger implements fdg {
        private static final long serialVersionUID = -2434867452883857743L;

        /* JADX INFO: renamed from: C */
        public final Object[] f105382C;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f105383a;

        /* JADX INFO: renamed from: b */
        public final C16173b<T, R>[] f105384b;

        /* JADX INFO: renamed from: c */
        public final py6<? super Object[], ? extends R> f105385c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f105386d;

        /* JADX INFO: renamed from: e */
        public final cc0 f105387e;

        /* JADX INFO: renamed from: f */
        public final boolean f105388f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f105389m;

        public C16172a(ycg<? super R> ycgVar, py6<? super Object[], ? extends R> py6Var, int i, int i2, boolean z) {
            this.f105383a = ycgVar;
            this.f105385c = py6Var;
            this.f105388f = z;
            C16173b<T, R>[] c16173bArr = new C16173b[i];
            for (int i3 = 0; i3 < i; i3++) {
                c16173bArr[i3] = new C16173b<>(this, i2);
            }
            this.f105382C = new Object[i];
            this.f105384b = c16173bArr;
            this.f105386d = new AtomicLong();
            this.f105387e = new cc0();
        }

        /* JADX INFO: renamed from: a */
        public void m26887a() {
            for (C16173b<T, R> c16173b : this.f105384b) {
                c16173b.cancel();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m26888b() {
            boolean z;
            T tPoll;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f105383a;
            C16173b<T, R>[] c16173bArr = this.f105384b;
            int length = c16173bArr.length;
            Object[] objArr = this.f105382C;
            int iAddAndGet = 1;
            do {
                long j = this.f105386d.get();
                long j2 = 0;
                while (j != j2) {
                    if (this.f105389m) {
                        return;
                    }
                    if (!this.f105388f && this.f105387e.get() != null) {
                        m26887a();
                        ycgVar.onError(this.f105387e.terminate());
                        return;
                    }
                    boolean z3 = false;
                    for (int i = 0; i < length; i++) {
                        C16173b<T, R> c16173b = c16173bArr[i];
                        if (objArr[i] == null) {
                            try {
                                z = c16173b.f105395f;
                                ajf<T> ajfVar = c16173b.f105393d;
                                tPoll = ajfVar != null ? ajfVar.poll() : null;
                                z2 = tPoll == null;
                            } catch (Throwable th) {
                                n75.throwIfFatal(th);
                                this.f105387e.addThrowable(th);
                                if (!this.f105388f) {
                                    m26887a();
                                    ycgVar.onError(this.f105387e.terminate());
                                    return;
                                }
                            }
                            if (z && z2) {
                                m26887a();
                                if (this.f105387e.get() != null) {
                                    ycgVar.onError(this.f105387e.terminate());
                                    return;
                                } else {
                                    ycgVar.onComplete();
                                    return;
                                }
                            }
                            if (z2) {
                                z3 = true;
                            } else {
                                objArr[i] = tPoll;
                            }
                        }
                    }
                    if (z3) {
                        break;
                    }
                    try {
                        ycgVar.onNext((Object) xjb.requireNonNull(this.f105385c.apply(objArr.clone()), "The zipper returned a null value"));
                        j2++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        m26887a();
                        this.f105387e.addThrowable(th2);
                        ycgVar.onError(this.f105387e.terminate());
                        return;
                    }
                }
                if (j == j2) {
                    if (this.f105389m) {
                        return;
                    }
                    if (!this.f105388f && this.f105387e.get() != null) {
                        m26887a();
                        ycgVar.onError(this.f105387e.terminate());
                        return;
                    }
                    for (int i2 = 0; i2 < length; i2++) {
                        C16173b<T, R> c16173b2 = c16173bArr[i2];
                        if (objArr[i2] == null) {
                            try {
                                boolean z4 = c16173b2.f105395f;
                                ajf<T> ajfVar2 = c16173b2.f105393d;
                                T tPoll2 = ajfVar2 != null ? ajfVar2.poll() : null;
                                boolean z5 = tPoll2 == null;
                                if (z4 && z5) {
                                    m26887a();
                                    if (this.f105387e.get() != null) {
                                        ycgVar.onError(this.f105387e.terminate());
                                        return;
                                    } else {
                                        ycgVar.onComplete();
                                        return;
                                    }
                                }
                                if (!z5) {
                                    objArr[i2] = tPoll2;
                                }
                            } catch (Throwable th3) {
                                n75.throwIfFatal(th3);
                                this.f105387e.addThrowable(th3);
                                if (!this.f105388f) {
                                    m26887a();
                                    ycgVar.onError(this.f105387e.terminate());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j2 != 0) {
                    for (C16173b<T, R> c16173b3 : c16173bArr) {
                        c16173b3.request(j2);
                    }
                    if (j != Long.MAX_VALUE) {
                        this.f105386d.addAndGet(-j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: c */
        public void m26889c(C16173b<T, R> c16173b, Throwable th) {
            if (!this.f105387e.addThrowable(th)) {
                pfe.onError(th);
            } else {
                c16173b.f105395f = true;
                m26888b();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f105389m) {
                return;
            }
            this.f105389m = true;
            m26887a();
        }

        /* JADX INFO: renamed from: d */
        public void m26890d(zjd<? extends T>[] zjdVarArr, int i) {
            C16173b<T, R>[] c16173bArr = this.f105384b;
            for (int i2 = 0; i2 < i && !this.f105389m; i2++) {
                if (!this.f105388f && this.f105387e.get() != null) {
                    return;
                }
                zjdVarArr[i2].subscribe(c16173bArr[i2]);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f105386d, j);
                m26888b();
            }
        }
    }

    /* JADX INFO: renamed from: zl6$b */
    public static final class C16173b<T, R> extends AtomicReference<fdg> implements lj6<T>, fdg {
        private static final long serialVersionUID = -4627193790118206028L;

        /* JADX INFO: renamed from: a */
        public final C16172a<T, R> f105390a;

        /* JADX INFO: renamed from: b */
        public final int f105391b;

        /* JADX INFO: renamed from: c */
        public final int f105392c;

        /* JADX INFO: renamed from: d */
        public ajf<T> f105393d;

        /* JADX INFO: renamed from: e */
        public long f105394e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f105395f;

        /* JADX INFO: renamed from: m */
        public int f105396m;

        public C16173b(C16172a<T, R> c16172a, int i) {
            this.f105390a = c16172a;
            this.f105391b = i;
            this.f105392c = i - (i >> 2);
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f105395f = true;
            this.f105390a.m26888b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f105390a.m26889c(this, th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f105396m != 2) {
                this.f105393d.offer(t);
            }
            this.f105390a.m26888b();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this, fdgVar)) {
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f105396m = iRequestFusion;
                        this.f105393d = codVar;
                        this.f105395f = true;
                        this.f105390a.m26888b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f105396m = iRequestFusion;
                        this.f105393d = codVar;
                        fdgVar.request(this.f105391b);
                        return;
                    }
                }
                this.f105393d = new pzf(this.f105391b);
                fdgVar.request(this.f105391b);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (this.f105396m != 1) {
                long j2 = this.f105394e + j;
                if (j2 < this.f105392c) {
                    this.f105394e = j2;
                } else {
                    this.f105394e = 0L;
                    get().request(j2);
                }
            }
        }
    }

    public zl6(zjd<? extends T>[] zjdVarArr, Iterable<? extends zjd<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var, int i, boolean z) {
        this.f105377b = zjdVarArr;
        this.f105378c = iterable;
        this.f105379d = py6Var;
        this.f105380e = i;
        this.f105381f = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        int length;
        zjd<? extends T>[] zjdVarArr = this.f105377b;
        if (zjdVarArr == null) {
            zjdVarArr = new zjd[8];
            length = 0;
            for (zjd<? extends T> zjdVar : this.f105378c) {
                if (length == zjdVarArr.length) {
                    zjd<? extends T>[] zjdVarArr2 = new zjd[(length >> 2) + length];
                    System.arraycopy(zjdVarArr, 0, zjdVarArr2, 0, length);
                    zjdVarArr = zjdVarArr2;
                }
                zjdVarArr[length] = zjdVar;
                length++;
            }
        } else {
            length = zjdVarArr.length;
        }
        int i = length;
        if (i == 0) {
            x05.complete(ycgVar);
            return;
        }
        C16172a c16172a = new C16172a(ycgVar, this.f105379d, i, this.f105380e, this.f105381f);
        ycgVar.onSubscribe(c16172a);
        c16172a.m26890d(zjdVarArr, i);
    }
}
