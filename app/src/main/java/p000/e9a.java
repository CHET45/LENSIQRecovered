package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class e9a<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final aaa<? extends T>[] f32225b;

    /* JADX INFO: renamed from: e9a$a */
    public static final class C5200a<T> extends ConcurrentLinkedQueue<T> implements InterfaceC5203d<T> {
        private static final long serialVersionUID = -4025173261791142821L;

        /* JADX INFO: renamed from: a */
        public int f32226a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f32227b = new AtomicInteger();

        @Override // p000.e9a.InterfaceC5203d
        public int consumerIndex() {
            return this.f32226a;
        }

        @Override // p000.e9a.InterfaceC5203d
        public void drop() {
            poll();
        }

        @Override // p000.ajf
        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, p000.e9a.InterfaceC5203d, p000.ajf
        @cib
        public T poll() {
            T t = (T) super.poll();
            if (t != null) {
                this.f32226a++;
            }
            return t;
        }

        @Override // p000.e9a.InterfaceC5203d
        public int producerIndex() {
            return this.f32227b.get();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, p000.ajf
        public boolean offer(T t) {
            this.f32227b.getAndIncrement();
            return super.offer(t);
        }
    }

    /* JADX INFO: renamed from: e9a$b */
    public static final class C5201b<T> extends sv0<T> implements l9a<T> {
        private static final long serialVersionUID = -660395290758764731L;

        /* JADX INFO: renamed from: C */
        public boolean f32228C;

        /* JADX INFO: renamed from: F */
        public long f32229F;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f32230a;

        /* JADX INFO: renamed from: d */
        public final InterfaceC5203d<Object> f32233d;

        /* JADX INFO: renamed from: f */
        public final int f32235f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f32236m;

        /* JADX INFO: renamed from: b */
        public final nm2 f32231b = new nm2();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f32232c = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final cc0 f32234e = new cc0();

        public C5201b(ycg<? super T> ycgVar, int i, InterfaceC5203d<Object> interfaceC5203d) {
            this.f32230a = ycgVar;
            this.f32235f = i;
            this.f32233d = interfaceC5203d;
        }

        /* JADX INFO: renamed from: a */
        public void m9813a() {
            ycg<? super T> ycgVar = this.f32230a;
            InterfaceC5203d<Object> interfaceC5203d = this.f32233d;
            int iAddAndGet = 1;
            while (!this.f32236m) {
                Throwable th = this.f32234e.get();
                if (th != null) {
                    interfaceC5203d.clear();
                    ycgVar.onError(th);
                    return;
                }
                boolean z = interfaceC5203d.producerIndex() == this.f32235f;
                if (!interfaceC5203d.isEmpty()) {
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
            interfaceC5203d.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m9814b() {
            ycg<? super T> ycgVar = this.f32230a;
            InterfaceC5203d<Object> interfaceC5203d = this.f32233d;
            long j = this.f32229F;
            int iAddAndGet = 1;
            do {
                long j2 = this.f32232c.get();
                while (j != j2) {
                    if (this.f32236m) {
                        interfaceC5203d.clear();
                        return;
                    }
                    if (this.f32234e.get() != null) {
                        interfaceC5203d.clear();
                        ycgVar.onError(this.f32234e.terminate());
                        return;
                    } else {
                        if (interfaceC5203d.consumerIndex() == this.f32235f) {
                            ycgVar.onComplete();
                            return;
                        }
                        Object objPoll = interfaceC5203d.poll();
                        if (objPoll == null) {
                            break;
                        } else if (objPoll != ehb.COMPLETE) {
                            ycgVar.onNext(objPoll);
                            j++;
                        }
                    }
                }
                if (j == j2) {
                    if (this.f32234e.get() != null) {
                        interfaceC5203d.clear();
                        ycgVar.onError(this.f32234e.terminate());
                        return;
                    } else {
                        while (interfaceC5203d.peek() == ehb.COMPLETE) {
                            interfaceC5203d.drop();
                        }
                        if (interfaceC5203d.consumerIndex() == this.f32235f) {
                            ycgVar.onComplete();
                            return;
                        }
                    }
                }
                this.f32229F = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f32236m) {
                return;
            }
            this.f32236m = true;
            this.f32231b.dispose();
            if (getAndIncrement() == 0) {
                this.f32233d.clear();
            }
        }

        @Override // p000.ajf
        public void clear() {
            this.f32233d.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f32228C) {
                m9813a();
            } else {
                m9814b();
            }
        }

        public boolean isCancelled() {
            return this.f32236m;
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f32233d.isEmpty();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f32233d.offer(ehb.COMPLETE);
            drain();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            if (!this.f32234e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            this.f32231b.dispose();
            this.f32233d.offer(ehb.COMPLETE);
            drain();
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            this.f32231b.add(mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f32233d.offer(t);
            drain();
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            T t;
            do {
                t = (T) this.f32233d.poll();
            } while (t == ehb.COMPLETE);
            return t;
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f32232c, j);
                drain();
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f32228C = true;
            return 2;
        }
    }

    /* JADX INFO: renamed from: e9a$d */
    public interface InterfaceC5203d<T> extends ajf<T> {
        int consumerIndex();

        void drop();

        T peek();

        @Override // java.util.Queue, p000.e9a.InterfaceC5203d, p000.ajf
        @cib
        T poll();

        int producerIndex();
    }

    public e9a(aaa<? extends T>[] aaaVarArr) {
        this.f32225b = aaaVarArr;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        aaa[] aaaVarArr = this.f32225b;
        int length = aaaVarArr.length;
        C5201b c5201b = new C5201b(ycgVar, length, length <= m86.bufferSize() ? new C5202c(length) : new C5200a());
        ycgVar.onSubscribe(c5201b);
        cc0 cc0Var = c5201b.f32234e;
        for (aaa aaaVar : aaaVarArr) {
            if (c5201b.isCancelled() || cc0Var.get() != null) {
                return;
            }
            aaaVar.subscribe(c5201b);
        }
    }

    /* JADX INFO: renamed from: e9a$c */
    public static final class C5202c<T> extends AtomicReferenceArray<T> implements InterfaceC5203d<T> {
        private static final long serialVersionUID = -7969063454040569579L;

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f32237a;

        /* JADX INFO: renamed from: b */
        public int f32238b;

        public C5202c(int i) {
            super(i);
            this.f32237a = new AtomicInteger();
        }

        @Override // p000.ajf
        public void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // p000.e9a.InterfaceC5203d
        public int consumerIndex() {
            return this.f32238b;
        }

        @Override // p000.e9a.InterfaceC5203d
        public void drop() {
            int i = this.f32238b;
            lazySet(i, null);
            this.f32238b = i + 1;
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f32238b == producerIndex();
        }

        @Override // p000.ajf
        public boolean offer(T t) {
            xjb.requireNonNull(t, "value is null");
            int andIncrement = this.f32237a.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t);
            return true;
        }

        @Override // p000.e9a.InterfaceC5203d
        public T peek() {
            int i = this.f32238b;
            if (i == length()) {
                return null;
            }
            return get(i);
        }

        @Override // p000.e9a.InterfaceC5203d, java.util.Queue, p000.ajf
        @cib
        public T poll() {
            int i = this.f32238b;
            if (i == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.f32237a;
            do {
                T t = get(i);
                if (t != null) {
                    this.f32238b = i + 1;
                    lazySet(i, null);
                    return t;
                }
            } while (atomicInteger.get() != i);
            return null;
        }

        @Override // p000.e9a.InterfaceC5203d
        public int producerIndex() {
            return this.f32237a.get();
        }

        @Override // p000.ajf
        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException();
        }
    }
}
