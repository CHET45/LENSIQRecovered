package p000;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class ck6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final int f16801c;

    /* JADX INFO: renamed from: ck6$a */
    public static final class C2342a<T> extends ArrayDeque<T> implements kj6<T>, fdg {
        private static final long serialVersionUID = 7240042530241604978L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f16802a;

        /* JADX INFO: renamed from: b */
        public final int f16803b;

        /* JADX INFO: renamed from: c */
        public fdg f16804c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f16805d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f16806e;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f16807f = new AtomicLong();

        /* JADX INFO: renamed from: m */
        public final AtomicInteger f16808m = new AtomicInteger();

        public C2342a(ycg<? super T> actual, int count) {
            this.f16802a = actual;
            this.f16803b = count;
        }

        /* JADX INFO: renamed from: a */
        public void m4017a() {
            if (this.f16808m.getAndIncrement() == 0) {
                ycg<? super T> ycgVar = this.f16802a;
                long jProduced = this.f16807f.get();
                while (!this.f16806e) {
                    if (this.f16805d) {
                        long j = 0;
                        while (j != jProduced) {
                            if (this.f16806e) {
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
                        if (isEmpty()) {
                            ycgVar.onComplete();
                            return;
                        } else if (j != 0) {
                            jProduced = ro0.produced(this.f16807f, j);
                        }
                    }
                    if (this.f16808m.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            this.f16806e = true;
            this.f16804c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f16805d = true;
            m4017a();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f16802a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f16803b == size()) {
                poll();
            }
            offer(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f16804c, s)) {
                this.f16804c = s;
                this.f16802a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f16807f, n);
                m4017a();
            }
        }
    }

    public ck6(l86<T> source, int count) {
        super(source);
        this.f16801c = count;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C2342a(s, this.f16801c));
    }
}
