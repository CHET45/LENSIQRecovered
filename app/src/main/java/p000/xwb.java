package p000;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class xwb<T> extends AbstractC9666n3<T, vkb<T>> {

    /* JADX INFO: renamed from: b */
    public final long f99567b;

    /* JADX INFO: renamed from: c */
    public final long f99568c;

    /* JADX INFO: renamed from: d */
    public final int f99569d;

    /* JADX INFO: renamed from: xwb$a */
    public static final class RunnableC15333a<T> extends AtomicInteger implements pxb<T>, lf4, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super vkb<T>> f99570a;

        /* JADX INFO: renamed from: b */
        public final long f99571b;

        /* JADX INFO: renamed from: c */
        public final int f99572c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f99573d = new AtomicBoolean();

        /* JADX INFO: renamed from: e */
        public long f99574e;

        /* JADX INFO: renamed from: f */
        public lf4 f99575f;

        /* JADX INFO: renamed from: m */
        public osh<T> f99576m;

        public RunnableC15333a(pxb<? super vkb<T>> actual, long count, int capacityHint) {
            this.f99570a = actual;
            this.f99571b = count;
            this.f99572c = capacityHint;
            lazySet(1);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f99573d.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f99573d.get();
        }

        @Override // p000.pxb
        public void onComplete() {
            osh<T> oshVar = this.f99576m;
            if (oshVar != null) {
                this.f99576m = null;
                oshVar.onComplete();
            }
            this.f99570a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            osh<T> oshVar = this.f99576m;
            if (oshVar != null) {
                this.f99576m = null;
                oshVar.onError(t);
            }
            this.f99570a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            dxb dxbVar;
            osh<T> oshVarCreate = this.f99576m;
            if (oshVarCreate != null || this.f99573d.get()) {
                dxbVar = null;
            } else {
                getAndIncrement();
                oshVarCreate = osh.create(this.f99572c, this);
                this.f99576m = oshVarCreate;
                dxbVar = new dxb(oshVarCreate);
                this.f99570a.onNext(dxbVar);
            }
            if (oshVarCreate != null) {
                oshVarCreate.onNext(t);
                long j = this.f99574e + 1;
                this.f99574e = j;
                if (j >= this.f99571b) {
                    this.f99574e = 0L;
                    this.f99576m = null;
                    oshVarCreate.onComplete();
                }
                if (dxbVar == null || !dxbVar.m9520a()) {
                    return;
                }
                this.f99576m = null;
                oshVarCreate.onComplete();
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f99575f, d)) {
                this.f99575f = d;
                this.f99570a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f99575f.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: xwb$b */
    public static final class RunnableC15334b<T> extends AtomicInteger implements pxb<T>, lf4, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;

        /* JADX INFO: renamed from: C */
        public long f99577C;

        /* JADX INFO: renamed from: F */
        public lf4 f99578F;

        /* JADX INFO: renamed from: a */
        public final pxb<? super vkb<T>> f99579a;

        /* JADX INFO: renamed from: b */
        public final long f99580b;

        /* JADX INFO: renamed from: c */
        public final long f99581c;

        /* JADX INFO: renamed from: d */
        public final int f99582d;

        /* JADX INFO: renamed from: e */
        public final ArrayDeque<osh<T>> f99583e = new ArrayDeque<>();

        /* JADX INFO: renamed from: f */
        public final AtomicBoolean f99584f = new AtomicBoolean();

        /* JADX INFO: renamed from: m */
        public long f99585m;

        public RunnableC15334b(pxb<? super vkb<T>> actual, long count, long skip, int capacityHint) {
            this.f99579a = actual;
            this.f99580b = count;
            this.f99581c = skip;
            this.f99582d = capacityHint;
            lazySet(1);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f99584f.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f99584f.get();
        }

        @Override // p000.pxb
        public void onComplete() {
            ArrayDeque<osh<T>> arrayDeque = this.f99583e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f99579a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            ArrayDeque<osh<T>> arrayDeque = this.f99583e;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(t);
            }
            this.f99579a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            dxb dxbVar;
            ArrayDeque<osh<T>> arrayDeque = this.f99583e;
            long j = this.f99585m;
            long j2 = this.f99581c;
            if (j % j2 != 0 || this.f99584f.get()) {
                dxbVar = null;
            } else {
                getAndIncrement();
                osh<T> oshVarCreate = osh.create(this.f99582d, this);
                dxbVar = new dxb(oshVarCreate);
                arrayDeque.offer(oshVarCreate);
                this.f99579a.onNext(dxbVar);
            }
            long j3 = this.f99577C + 1;
            Iterator<osh<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.f99580b) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.f99584f.get()) {
                    return;
                } else {
                    this.f99577C = j3 - j2;
                }
            } else {
                this.f99577C = j3;
            }
            this.f99585m = j + 1;
            if (dxbVar == null || !dxbVar.m9520a()) {
                return;
            }
            dxbVar.f31252a.onComplete();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f99578F, d)) {
                this.f99578F = d;
                this.f99579a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f99578F.dispose();
            }
        }
    }

    public xwb(wub<T> source, long count, long skip, int capacityHint) {
        super(source);
        this.f99567b = count;
        this.f99568c = skip;
        this.f99569d = capacityHint;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super vkb<T>> t) {
        if (this.f99567b == this.f99568c) {
            this.f63101a.subscribe(new RunnableC15333a(t, this.f99567b, this.f99569d));
        } else {
            this.f63101a.subscribe(new RunnableC15334b(t, this.f99567b, this.f99568c, this.f99569d));
        }
    }
}
