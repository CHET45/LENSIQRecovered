package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class rvb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f79871b;

    /* JADX INFO: renamed from: c */
    public final long f79872c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f79873d;

    /* JADX INFO: renamed from: e */
    public final voe f79874e;

    /* JADX INFO: renamed from: f */
    public final int f79875f;

    /* JADX INFO: renamed from: m */
    public final boolean f79876m;

    /* JADX INFO: renamed from: rvb$a */
    public static final class C12319a<T> extends AtomicBoolean implements oxb<T>, mf4 {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: C */
        public mf4 f79877C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f79878F;

        /* JADX INFO: renamed from: H */
        public Throwable f79879H;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f79880a;

        /* JADX INFO: renamed from: b */
        public final long f79881b;

        /* JADX INFO: renamed from: c */
        public final long f79882c;

        /* JADX INFO: renamed from: d */
        public final TimeUnit f79883d;

        /* JADX INFO: renamed from: e */
        public final voe f79884e;

        /* JADX INFO: renamed from: f */
        public final rzf<Object> f79885f;

        /* JADX INFO: renamed from: m */
        public final boolean f79886m;

        public C12319a(oxb<? super T> oxbVar, long j, long j2, TimeUnit timeUnit, voe voeVar, int i, boolean z) {
            this.f79880a = oxbVar;
            this.f79881b = j;
            this.f79882c = j2;
            this.f79883d = timeUnit;
            this.f79884e = voeVar;
            this.f79885f = new rzf<>(i);
            this.f79886m = z;
        }

        /* JADX INFO: renamed from: a */
        public void m21578a() {
            Throwable th;
            if (compareAndSet(false, true)) {
                oxb<? super T> oxbVar = this.f79880a;
                rzf<Object> rzfVar = this.f79885f;
                boolean z = this.f79886m;
                long jNow = this.f79884e.now(this.f79883d) - this.f79882c;
                while (!this.f79878F) {
                    if (!z && (th = this.f79879H) != null) {
                        rzfVar.clear();
                        oxbVar.onError(th);
                        return;
                    }
                    Object objPoll = rzfVar.poll();
                    if (objPoll == null) {
                        Throwable th2 = this.f79879H;
                        if (th2 != null) {
                            oxbVar.onError(th2);
                            return;
                        } else {
                            oxbVar.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = rzfVar.poll();
                    if (((Long) objPoll).longValue() >= jNow) {
                        oxbVar.onNext(objPoll2);
                    }
                }
                rzfVar.clear();
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f79878F) {
                return;
            }
            this.f79878F = true;
            this.f79877C.dispose();
            if (compareAndSet(false, true)) {
                this.f79885f.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f79878F;
        }

        @Override // p000.oxb
        public void onComplete() {
            m21578a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f79879H = th;
            m21578a();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            rzf<Object> rzfVar = this.f79885f;
            long jNow = this.f79884e.now(this.f79883d);
            long j = this.f79882c;
            long j2 = this.f79881b;
            boolean z = j2 == Long.MAX_VALUE;
            rzfVar.offer(Long.valueOf(jNow), t);
            while (!rzfVar.isEmpty()) {
                if (((Long) rzfVar.peek()).longValue() > jNow - j && (z || (rzfVar.size() >> 1) <= j2)) {
                    return;
                }
                rzfVar.poll();
                rzfVar.poll();
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f79877C, mf4Var)) {
                this.f79877C = mf4Var;
                this.f79880a.onSubscribe(this);
            }
        }
    }

    public rvb(xub<T> xubVar, long j, long j2, TimeUnit timeUnit, voe voeVar, int i, boolean z) {
        super(xubVar);
        this.f79871b = j;
        this.f79872c = j2;
        this.f79873d = timeUnit;
        this.f79874e = voeVar;
        this.f79875f = i;
        this.f79876m = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C12319a(oxbVar, this.f79871b, this.f79872c, this.f79873d, this.f79874e, this.f79875f, this.f79876m));
    }
}
