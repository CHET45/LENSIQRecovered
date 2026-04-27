package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class svb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f83075b;

    /* JADX INFO: renamed from: c */
    public final long f83076c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f83077d;

    /* JADX INFO: renamed from: e */
    public final woe f83078e;

    /* JADX INFO: renamed from: f */
    public final int f83079f;

    /* JADX INFO: renamed from: m */
    public final boolean f83080m;

    /* JADX INFO: renamed from: svb$a */
    public static final class C12807a<T> extends AtomicBoolean implements pxb<T>, lf4 {
        private static final long serialVersionUID = -5677354903406201275L;

        /* JADX INFO: renamed from: C */
        public lf4 f83081C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f83082F;

        /* JADX INFO: renamed from: H */
        public Throwable f83083H;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f83084a;

        /* JADX INFO: renamed from: b */
        public final long f83085b;

        /* JADX INFO: renamed from: c */
        public final long f83086c;

        /* JADX INFO: renamed from: d */
        public final TimeUnit f83087d;

        /* JADX INFO: renamed from: e */
        public final woe f83088e;

        /* JADX INFO: renamed from: f */
        public final qzf<Object> f83089f;

        /* JADX INFO: renamed from: m */
        public final boolean f83090m;

        public C12807a(pxb<? super T> actual, long count, long time, TimeUnit unit, woe scheduler, int bufferSize, boolean delayError) {
            this.f83084a = actual;
            this.f83085b = count;
            this.f83086c = time;
            this.f83087d = unit;
            this.f83088e = scheduler;
            this.f83089f = new qzf<>(bufferSize);
            this.f83090m = delayError;
        }

        /* JADX INFO: renamed from: a */
        public void m22265a() {
            Throwable th;
            if (compareAndSet(false, true)) {
                pxb<? super T> pxbVar = this.f83084a;
                qzf<Object> qzfVar = this.f83089f;
                boolean z = this.f83090m;
                long jNow = this.f83088e.now(this.f83087d) - this.f83086c;
                while (!this.f83082F) {
                    if (!z && (th = this.f83083H) != null) {
                        qzfVar.clear();
                        pxbVar.onError(th);
                        return;
                    }
                    Object objPoll = qzfVar.poll();
                    if (objPoll == null) {
                        Throwable th2 = this.f83083H;
                        if (th2 != null) {
                            pxbVar.onError(th2);
                            return;
                        } else {
                            pxbVar.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = qzfVar.poll();
                    if (((Long) objPoll).longValue() >= jNow) {
                        pxbVar.onNext(objPoll2);
                    }
                }
                qzfVar.clear();
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f83082F) {
                return;
            }
            this.f83082F = true;
            this.f83081C.dispose();
            if (compareAndSet(false, true)) {
                this.f83089f.clear();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f83082F;
        }

        @Override // p000.pxb
        public void onComplete() {
            m22265a();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f83083H = t;
            m22265a();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            qzf<Object> qzfVar = this.f83089f;
            long jNow = this.f83088e.now(this.f83087d);
            long j = this.f83086c;
            long j2 = this.f83085b;
            boolean z = j2 == Long.MAX_VALUE;
            qzfVar.offer(Long.valueOf(jNow), t);
            while (!qzfVar.isEmpty()) {
                if (((Long) qzfVar.peek()).longValue() > jNow - j && (z || (qzfVar.size() >> 1) <= j2)) {
                    return;
                }
                qzfVar.poll();
                qzfVar.poll();
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f83081C, d)) {
                this.f83081C = d;
                this.f83084a.onSubscribe(this);
            }
        }
    }

    public svb(wub<T> source, long count, long time, TimeUnit unit, woe scheduler, int bufferSize, boolean delayError) {
        super(source);
        this.f83075b = count;
        this.f83076c = time;
        this.f83077d = unit;
        this.f83078e = scheduler;
        this.f83079f = bufferSize;
        this.f83080m = delayError;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C12807a(t, this.f83075b, this.f83076c, this.f83077d, this.f83078e, this.f83079f, this.f83080m));
    }
}
