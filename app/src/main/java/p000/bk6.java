package p000;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class bk6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final int f13930c;

    /* JADX INFO: renamed from: bk6$a */
    public static final class C1926a<T> extends ArrayDeque<T> implements lj6<T>, fdg {
        private static final long serialVersionUID = 7240042530241604978L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f13931a;

        /* JADX INFO: renamed from: b */
        public final int f13932b;

        /* JADX INFO: renamed from: c */
        public fdg f13933c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f13934d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f13935e;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f13936f = new AtomicLong();

        /* JADX INFO: renamed from: m */
        public final AtomicInteger f13937m = new AtomicInteger();

        public C1926a(ycg<? super T> ycgVar, int i) {
            this.f13931a = ycgVar;
            this.f13932b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m3218a() {
            if (this.f13937m.getAndIncrement() == 0) {
                ycg<? super T> ycgVar = this.f13931a;
                long jAddAndGet = this.f13936f.get();
                while (!this.f13935e) {
                    if (this.f13934d) {
                        long j = 0;
                        while (j != jAddAndGet) {
                            if (this.f13935e) {
                                return;
                            }
                            T tPoll = poll();
                            if (tPoll == null) {
                                ycgVar.onComplete();
                                return;
                            } else {
                                ycgVar.onNext(tPoll);
                                j++;
                            }
                        }
                        if (j != 0 && jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f13936f.addAndGet(-j);
                        }
                    }
                    if (this.f13937m.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f13935e = true;
            this.f13933c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f13934d = true;
            m3218a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f13931a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f13932b == size()) {
                poll();
            }
            offer(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f13933c, fdgVar)) {
                this.f13933c = fdgVar;
                this.f13931a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f13936f, j);
                m3218a();
            }
        }
    }

    public bk6(m86<T> m86Var, int i) {
        super(m86Var);
        this.f13930c = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C1926a(ycgVar, this.f13930c));
    }
}
