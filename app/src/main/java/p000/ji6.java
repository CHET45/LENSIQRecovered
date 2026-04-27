package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class ji6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final i11<R, ? super T, R> f50648c;

    /* JADX INFO: renamed from: d */
    public final nfg<R> f50649d;

    /* JADX INFO: renamed from: ji6$a */
    public static final class C7911a<T, R> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = -1776795561228106469L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f50650C;

        /* JADX INFO: renamed from: F */
        public Throwable f50651F;

        /* JADX INFO: renamed from: H */
        public fdg f50652H;

        /* JADX INFO: renamed from: L */
        public R f50653L;

        /* JADX INFO: renamed from: M */
        public int f50654M;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f50655a;

        /* JADX INFO: renamed from: b */
        public final i11<R, ? super T, R> f50656b;

        /* JADX INFO: renamed from: c */
        public final tif<R> f50657c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f50658d;

        /* JADX INFO: renamed from: e */
        public final int f50659e;

        /* JADX INFO: renamed from: f */
        public final int f50660f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f50661m;

        public C7911a(ycg<? super R> actual, i11<R, ? super T, R> accumulator, R value, int prefetch) {
            this.f50655a = actual;
            this.f50656b = accumulator;
            this.f50653L = value;
            this.f50659e = prefetch;
            this.f50660f = prefetch - (prefetch >> 2);
            ozf ozfVar = new ozf(prefetch);
            this.f50657c = ozfVar;
            ozfVar.offer(value);
            this.f50658d = new AtomicLong();
        }

        /* JADX INFO: renamed from: a */
        public void m14103a() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f50655a;
            tif<R> tifVar = this.f50657c;
            int i = this.f50660f;
            int i2 = this.f50654M;
            int iAddAndGet = 1;
            do {
                long j = this.f50658d.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f50661m) {
                        tifVar.clear();
                        return;
                    }
                    boolean z = this.f50650C;
                    if (z && (th = this.f50651F) != null) {
                        tifVar.clear();
                        ycgVar.onError(th);
                        return;
                    }
                    R rPoll = tifVar.poll();
                    boolean z2 = rPoll == null;
                    if (z && z2) {
                        ycgVar.onComplete();
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    ycgVar.onNext(rPoll);
                    j2++;
                    i2++;
                    if (i2 == i) {
                        this.f50652H.request(i);
                        i2 = 0;
                    }
                }
                if (j2 == j && this.f50650C) {
                    Throwable th2 = this.f50651F;
                    if (th2 != null) {
                        tifVar.clear();
                        ycgVar.onError(th2);
                        return;
                    } else if (tifVar.isEmpty()) {
                        ycgVar.onComplete();
                        return;
                    }
                }
                if (j2 != 0) {
                    ro0.produced(this.f50658d, j2);
                }
                this.f50654M = i2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f50661m = true;
            this.f50652H.cancel();
            if (getAndIncrement() == 0) {
                this.f50657c.clear();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f50650C) {
                return;
            }
            this.f50650C = true;
            m14103a();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f50650C) {
                ofe.onError(t);
                return;
            }
            this.f50651F = t;
            this.f50650C = true;
            m14103a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f50650C) {
                return;
            }
            try {
                R rApply = this.f50656b.apply(this.f50653L, t);
                Objects.requireNonNull(rApply, "The accumulator returned a null value");
                this.f50653L = rApply;
                this.f50657c.offer(rApply);
                m14103a();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f50652H.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f50652H, s)) {
                this.f50652H = s;
                this.f50655a.onSubscribe(this);
                s.request(this.f50659e - 1);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f50658d, n);
                m14103a();
            }
        }
    }

    public ji6(l86<T> source, nfg<R> seedSupplier, i11<R, ? super T, R> accumulator) {
        super(source);
        this.f50648c = accumulator;
        this.f50649d = seedSupplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        try {
            R r = this.f50649d.get();
            Objects.requireNonNull(r, "The seed supplied is null");
            this.f49321b.subscribe((kj6) new C7911a(s, this.f50648c, r, l86.bufferSize()));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, s);
        }
    }
}
