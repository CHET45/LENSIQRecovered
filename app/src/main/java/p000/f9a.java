package p000;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class f9a<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final z9a<? extends T>[] f35774b;

    /* JADX INFO: renamed from: f9a$a */
    public static final class C5686a<T> extends ConcurrentLinkedQueue<T> implements InterfaceC5689d<T> {
        private static final long serialVersionUID = -4025173261791142821L;

        /* JADX INFO: renamed from: a */
        public int f35775a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f35776b = new AtomicInteger();

        @Override // p000.f9a.InterfaceC5689d
        public int consumerIndex() {
            return this.f35775a;
        }

        @Override // p000.f9a.InterfaceC5689d
        public void drop() {
            poll();
        }

        @Override // p000.zif
        public boolean offer(T v1, T v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, p000.f9a.InterfaceC5689d, p000.zif
        @dib
        public T poll() {
            T t = (T) super.poll();
            if (t != null) {
                this.f35775a++;
            }
            return t;
        }

        @Override // p000.f9a.InterfaceC5689d
        public int producerIndex() {
            return this.f35776b.get();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, p000.zif
        public boolean offer(T e) {
            this.f35776b.getAndIncrement();
            return super.offer(e);
        }
    }

    /* JADX INFO: renamed from: f9a$b */
    public static final class C5687b<T> extends rv0<T> implements k9a<T> {
        private static final long serialVersionUID = -660395290758764731L;

        /* JADX INFO: renamed from: C */
        public boolean f35777C;

        /* JADX INFO: renamed from: F */
        public long f35778F;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f35779a;

        /* JADX INFO: renamed from: d */
        public final InterfaceC5689d<Object> f35782d;

        /* JADX INFO: renamed from: f */
        public final int f35784f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f35785m;

        /* JADX INFO: renamed from: b */
        public final mm2 f35780b = new mm2();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f35781c = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final bc0 f35783e = new bc0();

        public C5687b(ycg<? super T> actual, int sourceCount, InterfaceC5689d<Object> queue) {
            this.f35779a = actual;
            this.f35784f = sourceCount;
            this.f35782d = queue;
        }

        /* JADX INFO: renamed from: a */
        public void m10728a() {
            ycg<? super T> ycgVar = this.f35779a;
            InterfaceC5689d<Object> interfaceC5689d = this.f35782d;
            int iAddAndGet = 1;
            while (!this.f35785m) {
                Throwable th = this.f35783e.get();
                if (th != null) {
                    interfaceC5689d.clear();
                    ycgVar.onError(th);
                    return;
                }
                boolean z = interfaceC5689d.producerIndex() == this.f35784f;
                if (!interfaceC5689d.isEmpty()) {
                    ycgVar.onNext(null);
                }
                if (z) {
                    ycgVar.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            interfaceC5689d.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m10729b() {
            ycg<? super T> ycgVar = this.f35779a;
            InterfaceC5689d<Object> interfaceC5689d = this.f35782d;
            long j = this.f35778F;
            int iAddAndGet = 1;
            do {
                long j2 = this.f35781c.get();
                while (j != j2) {
                    if (this.f35785m) {
                        interfaceC5689d.clear();
                        return;
                    }
                    if (this.f35783e.get() != null) {
                        interfaceC5689d.clear();
                        this.f35783e.tryTerminateConsumer(this.f35779a);
                        return;
                    } else {
                        if (interfaceC5689d.consumerIndex() == this.f35784f) {
                            ycgVar.onComplete();
                            return;
                        }
                        Object objPoll = interfaceC5689d.poll();
                        if (objPoll == null) {
                            break;
                        } else if (objPoll != fhb.COMPLETE) {
                            ycgVar.onNext(objPoll);
                            j++;
                        }
                    }
                }
                if (j == j2) {
                    if (this.f35783e.get() != null) {
                        interfaceC5689d.clear();
                        this.f35783e.tryTerminateConsumer(this.f35779a);
                        return;
                    } else {
                        while (interfaceC5689d.peek() == fhb.COMPLETE) {
                            interfaceC5689d.drop();
                        }
                        if (interfaceC5689d.consumerIndex() == this.f35784f) {
                            ycgVar.onComplete();
                            return;
                        }
                    }
                }
                this.f35778F = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f35785m) {
                return;
            }
            this.f35785m = true;
            this.f35780b.dispose();
            if (getAndIncrement() == 0) {
                this.f35782d.clear();
            }
        }

        @Override // p000.zif
        public void clear() {
            this.f35782d.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f35777C) {
                m10728a();
            } else {
                m10729b();
            }
        }

        public boolean isCancelled() {
            return this.f35785m;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f35782d.isEmpty();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f35782d.offer(fhb.COMPLETE);
            drain();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            if (this.f35783e.tryAddThrowableOrReport(e)) {
                this.f35780b.dispose();
                this.f35782d.offer(fhb.COMPLETE);
                drain();
            }
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            this.f35780b.add(d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f35782d.offer(value);
            drain();
        }

        @Override // p000.zif
        @dib
        public T poll() {
            T t;
            do {
                t = (T) this.f35782d.poll();
            } while (t == fhb.COMPLETE);
            return t;
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f35781c, n);
                drain();
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            this.f35777C = true;
            return 2;
        }
    }

    /* JADX INFO: renamed from: f9a$d */
    public interface InterfaceC5689d<T> extends zif<T> {
        int consumerIndex();

        void drop();

        T peek();

        @Override // java.util.Queue, p000.f9a.InterfaceC5689d, p000.zif
        @dib
        T poll();

        int producerIndex();
    }

    public f9a(z9a<? extends T>[] sources) {
        this.f35774b = sources;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        z9a[] z9aVarArr = this.f35774b;
        int length = z9aVarArr.length;
        C5687b c5687b = new C5687b(s, length, length <= l86.bufferSize() ? new C5688c(length) : new C5686a());
        s.onSubscribe(c5687b);
        bc0 bc0Var = c5687b.f35783e;
        for (z9a z9aVar : z9aVarArr) {
            if (c5687b.isCancelled() || bc0Var.get() != null) {
                return;
            }
            z9aVar.subscribe(c5687b);
        }
    }

    /* JADX INFO: renamed from: f9a$c */
    public static final class C5688c<T> extends AtomicReferenceArray<T> implements InterfaceC5689d<T> {
        private static final long serialVersionUID = -7969063454040569579L;

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f35786a;

        /* JADX INFO: renamed from: b */
        public int f35787b;

        public C5688c(int length) {
            super(length);
            this.f35786a = new AtomicInteger();
        }

        @Override // p000.zif
        public void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // p000.f9a.InterfaceC5689d
        public int consumerIndex() {
            return this.f35787b;
        }

        @Override // p000.f9a.InterfaceC5689d
        public void drop() {
            int i = this.f35787b;
            lazySet(i, null);
            this.f35787b = i + 1;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f35787b == producerIndex();
        }

        @Override // p000.zif
        public boolean offer(T value) {
            Objects.requireNonNull(value, "value is null");
            int andIncrement = this.f35786a.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, value);
            return true;
        }

        @Override // p000.f9a.InterfaceC5689d
        public T peek() {
            int i = this.f35787b;
            if (i == length()) {
                return null;
            }
            return get(i);
        }

        @Override // p000.f9a.InterfaceC5689d, java.util.Queue, p000.zif
        @dib
        public T poll() {
            int i = this.f35787b;
            if (i == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.f35786a;
            do {
                T t = get(i);
                if (t != null) {
                    this.f35787b = i + 1;
                    lazySet(i, null);
                    return t;
                }
            } while (atomicInteger.get() != i);
            return null;
        }

        @Override // p000.f9a.InterfaceC5689d
        public int producerIndex() {
            return this.f35786a.get();
        }

        @Override // p000.zif
        public boolean offer(T v1, T v2) {
            throw new UnsupportedOperationException();
        }
    }
}
