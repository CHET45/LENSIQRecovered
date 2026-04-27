package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class qub<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f75808b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f75809c;

    /* JADX INFO: renamed from: d */
    public final voe f75810d;

    /* JADX INFO: renamed from: e */
    public final int f75811e;

    /* JADX INFO: renamed from: f */
    public final boolean f75812f;

    /* JADX INFO: renamed from: qub$a */
    public static final class C11703a<T> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f75813C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f75814F;

        /* JADX INFO: renamed from: H */
        public Throwable f75815H;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f75816a;

        /* JADX INFO: renamed from: b */
        public final long f75817b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f75818c;

        /* JADX INFO: renamed from: d */
        public final voe f75819d;

        /* JADX INFO: renamed from: e */
        public final rzf<Object> f75820e;

        /* JADX INFO: renamed from: f */
        public final boolean f75821f;

        /* JADX INFO: renamed from: m */
        public mf4 f75822m;

        public C11703a(oxb<? super T> oxbVar, long j, TimeUnit timeUnit, voe voeVar, int i, boolean z) {
            this.f75816a = oxbVar;
            this.f75817b = j;
            this.f75818c = timeUnit;
            this.f75819d = voeVar;
            this.f75820e = new rzf<>(i);
            this.f75821f = z;
        }

        /* JADX INFO: renamed from: a */
        public void m20669a() {
            if (getAndIncrement() != 0) {
                return;
            }
            oxb<? super T> oxbVar = this.f75816a;
            rzf<Object> rzfVar = this.f75820e;
            boolean z = this.f75821f;
            TimeUnit timeUnit = this.f75818c;
            voe voeVar = this.f75819d;
            long j = this.f75817b;
            int iAddAndGet = 1;
            while (!this.f75813C) {
                boolean z2 = this.f75814F;
                Long l = (Long) rzfVar.peek();
                boolean z3 = l == null;
                long jNow = voeVar.now(timeUnit);
                if (!z3 && l.longValue() > jNow - j) {
                    z3 = true;
                }
                if (z2) {
                    if (!z) {
                        Throwable th = this.f75815H;
                        if (th != null) {
                            this.f75820e.clear();
                            oxbVar.onError(th);
                            return;
                        } else if (z3) {
                            oxbVar.onComplete();
                            return;
                        }
                    } else if (z3) {
                        Throwable th2 = this.f75815H;
                        if (th2 != null) {
                            oxbVar.onError(th2);
                            return;
                        } else {
                            oxbVar.onComplete();
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
                    rzfVar.poll();
                    oxbVar.onNext(rzfVar.poll());
                }
            }
            this.f75820e.clear();
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f75813C) {
                return;
            }
            this.f75813C = true;
            this.f75822m.dispose();
            if (getAndIncrement() == 0) {
                this.f75820e.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f75813C;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f75814F = true;
            m20669a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f75815H = th;
            this.f75814F = true;
            m20669a();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f75820e.offer(Long.valueOf(this.f75819d.now(this.f75818c)), t);
            m20669a();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f75822m, mf4Var)) {
                this.f75822m = mf4Var;
                this.f75816a.onSubscribe(this);
            }
        }
    }

    public qub(xub<T> xubVar, long j, TimeUnit timeUnit, voe voeVar, int i, boolean z) {
        super(xubVar);
        this.f75808b = j;
        this.f75809c = timeUnit;
        this.f75810d = voeVar;
        this.f75811e = i;
        this.f75812f = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C11703a(oxbVar, this.f75808b, this.f75809c, this.f75810d, this.f75811e, this.f75812f));
    }
}
