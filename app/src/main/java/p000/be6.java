package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class be6<T, K, V> extends AbstractC7714j1<T, rb7<K, V>> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends K> f13505c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super T, ? extends V> f13506d;

    /* JADX INFO: renamed from: e */
    public final int f13507e;

    /* JADX INFO: renamed from: f */
    public final boolean f13508f;

    /* JADX INFO: renamed from: m */
    public final sy6<? super uu2<Object>, ? extends Map<K, Object>> f13509m;

    /* JADX INFO: renamed from: be6$a */
    public static final class C1858a<K, V> implements uu2<C1860c<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Queue<C1860c<K, V>> f13510a;

        public C1858a(Queue<C1860c<K, V>> evictedGroups) {
            this.f13510a = evictedGroups;
        }

        @Override // p000.uu2
        public void accept(C1860c<K, V> value) {
            this.f13510a.offer(value);
        }
    }

    /* JADX INFO: renamed from: be6$c */
    public static final class C1860c<K, T> extends rb7<K, T> {

        /* JADX INFO: renamed from: c */
        public final C1861d<T, K> f13526c;

        public C1860c(K key, C1861d<T, K> state) {
            super(key);
            this.f13526c = state;
        }

        public static <T, K> C1860c<K, T> createWith(K key, int bufferSize, C1859b<?, K, T> parent, boolean delayError) {
            return new C1860c<>(key, new C1861d(bufferSize, parent, key, delayError));
        }

        public void onComplete() {
            this.f13526c.onComplete();
        }

        public void onError(Throwable e) {
            this.f13526c.onError(e);
        }

        public void onNext(T t) {
            this.f13526c.onNext(t);
        }

        @Override // p000.l86
        public void subscribeActual(ycg<? super T> s) {
            this.f13526c.subscribe(s);
        }
    }

    /* JADX INFO: renamed from: be6$d */
    public static final class C1861d<T, K> extends rv0<T> implements zjd<T> {

        /* JADX INFO: renamed from: Q */
        public static final int f13527Q = 0;

        /* JADX INFO: renamed from: X */
        public static final int f13528X = 1;

        /* JADX INFO: renamed from: Y */
        public static final int f13529Y = 2;

        /* JADX INFO: renamed from: Z */
        public static final int f13530Z = 3;
        private static final long serialVersionUID = -3852313036005250360L;

        /* JADX INFO: renamed from: H */
        public boolean f13533H;

        /* JADX INFO: renamed from: L */
        public int f13534L;

        /* JADX INFO: renamed from: a */
        public final K f13537a;

        /* JADX INFO: renamed from: b */
        public final qzf<T> f13538b;

        /* JADX INFO: renamed from: c */
        public final C1859b<?, K, T> f13539c;

        /* JADX INFO: renamed from: d */
        public final boolean f13540d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f13542f;

        /* JADX INFO: renamed from: m */
        public Throwable f13543m;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f13541e = new AtomicLong();

        /* JADX INFO: renamed from: C */
        public final AtomicBoolean f13531C = new AtomicBoolean();

        /* JADX INFO: renamed from: F */
        public final AtomicReference<ycg<? super T>> f13532F = new AtomicReference<>();

        /* JADX INFO: renamed from: M */
        public final AtomicInteger f13535M = new AtomicInteger();

        /* JADX INFO: renamed from: N */
        public final AtomicBoolean f13536N = new AtomicBoolean();

        public C1861d(int bufferSize, C1859b<?, K, T> parent, K key, boolean delayError) {
            this.f13538b = new qzf<>(bufferSize);
            this.f13539c = parent;
            this.f13537a = key;
            this.f13540d = delayError;
        }

        /* JADX INFO: renamed from: a */
        public void m3065a() {
            if ((this.f13535M.get() & 2) == 0 && this.f13536N.compareAndSet(false, true)) {
                this.f13539c.cancel(this.f13537a);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m3066b(boolean d, boolean empty, ycg<? super T> a, boolean delayError, long emitted, boolean polled) {
            if (this.f13531C.get()) {
                m3067c(emitted, polled);
                return true;
            }
            if (!d) {
                return false;
            }
            if (delayError) {
                if (!empty) {
                    return false;
                }
                this.f13531C.lazySet(true);
                Throwable th = this.f13543m;
                if (th != null) {
                    a.onError(th);
                } else {
                    a.onComplete();
                    m3070f(emitted, polled);
                }
                return true;
            }
            Throwable th2 = this.f13543m;
            if (th2 != null) {
                this.f13538b.clear();
                this.f13531C.lazySet(true);
                a.onError(th2);
                return true;
            }
            if (!empty) {
                return false;
            }
            this.f13531C.lazySet(true);
            a.onComplete();
            m3070f(emitted, polled);
            return true;
        }

        /* JADX INFO: renamed from: c */
        public void m3067c(long emitted, boolean polled) {
            while (this.f13538b.poll() != null) {
                emitted++;
            }
            m3070f(emitted, polled);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f13531C.compareAndSet(false, true)) {
                m3065a();
                drain();
            }
        }

        @Override // p000.zif
        public void clear() {
            qzf<T> qzfVar = this.f13538b;
            while (qzfVar.poll() != null) {
                this.f13534L++;
            }
            m3074j();
        }

        /* JADX INFO: renamed from: d */
        public void m3068d() {
            Throwable th;
            qzf<T> qzfVar = this.f13538b;
            ycg<? super T> ycgVar = this.f13532F.get();
            int iAddAndGet = 1;
            while (true) {
                if (ycgVar != null) {
                    if (this.f13531C.get()) {
                        return;
                    }
                    boolean z = this.f13542f;
                    if (z && !this.f13540d && (th = this.f13543m) != null) {
                        qzfVar.clear();
                        ycgVar.onError(th);
                        return;
                    }
                    ycgVar.onNext(null);
                    if (z) {
                        Throwable th2 = this.f13543m;
                        if (th2 != null) {
                            ycgVar.onError(th2);
                            return;
                        } else {
                            ycgVar.onComplete();
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (ycgVar == null) {
                    ycgVar = this.f13532F.get();
                }
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f13533H) {
                m3068d();
            } else {
                m3069e();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        
            if (r3 != r16) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        
            r21 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        
            if (m3066b(r25.f13542f, r9.isEmpty(), r13, r10, r5, false) == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            r3 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        
            r3 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        
            if (r3 == r23) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
        
            p000.ro0.produced(r25.f13541e, r3);
            m3071g(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0012, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0012, code lost:
        
            continue;
         */
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m3069e() {
            /*
                r25 = this;
                r8 = r25
                qzf<T> r9 = r8.f13538b
                boolean r10 = r8.f13540d
                java.util.concurrent.atomic.AtomicReference<ycg<? super T>> r0 = r8.f13532F
                java.lang.Object r0 = r0.get()
                ycg r0 = (p000.ycg) r0
                java.util.concurrent.atomic.AtomicBoolean r11 = r8.f13531C
                r13 = r0
                r14 = 1
            L12:
                boolean r0 = r11.get()
                r15 = 0
                r5 = 0
                if (r0 == 0) goto L20
                r8.m3067c(r5, r15)
                goto L8c
            L20:
                if (r13 == 0) goto L8c
                java.util.concurrent.atomic.AtomicLong r0 = r8.f13541e
                long r16 = r0.get()
                r3 = r5
            L29:
                int r18 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
                if (r18 == 0) goto L63
                boolean r1 = r8.f13542f
                java.lang.Object r7 = r9.poll()
                if (r7 != 0) goto L38
                r19 = 1
                goto L3a
            L38:
                r19 = r15
            L3a:
                r20 = r19 ^ 1
                r0 = r25
                r2 = r19
                r21 = r3
                r3 = r13
                r4 = r10
                r23 = r5
                r5 = r21
                r12 = r7
                r7 = r20
                boolean r0 = r0.m3066b(r1, r2, r3, r4, r5, r7)
                if (r0 == 0) goto L52
                goto L12
            L52:
                if (r19 == 0) goto L57
                r5 = r21
                goto L66
            L57:
                r13.onNext(r12)
                r0 = 1
                r5 = r21
                long r3 = r5 + r0
                r5 = r23
                goto L29
            L63:
                r23 = r5
                r5 = r3
            L66:
                if (r18 != 0) goto L7f
                boolean r1 = r8.f13542f
                boolean r2 = r9.isEmpty()
                r7 = 0
                r0 = r25
                r3 = r13
                r4 = r10
                r21 = r5
                boolean r0 = r0.m3066b(r1, r2, r3, r4, r5, r7)
                if (r0 == 0) goto L7c
                goto L12
            L7c:
                r3 = r21
                goto L80
            L7f:
                r3 = r5
            L80:
                int r0 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
                if (r0 == 0) goto L8c
                java.util.concurrent.atomic.AtomicLong r0 = r8.f13541e
                p000.ro0.produced(r0, r3)
                r8.m3071g(r3)
            L8c:
                int r0 = -r14
                int r14 = r8.addAndGet(r0)
                if (r14 != 0) goto L94
                return
            L94:
                if (r13 != 0) goto L12
                java.util.concurrent.atomic.AtomicReference<ycg<? super T>> r0 = r8.f13532F
                java.lang.Object r0 = r0.get()
                r13 = r0
                ycg r13 = (p000.ycg) r13
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.be6.C1861d.m3069e():void");
        }

        /* JADX INFO: renamed from: f */
        public void m3070f(long emitted, boolean polled) {
            if (polled) {
                emitted++;
            }
            if (emitted != 0) {
                m3071g(emitted);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m3071g(long e) {
            if ((this.f13535M.get() & 2) == 0) {
                this.f13539c.m3064b(e);
            }
        }

        /* JADX INFO: renamed from: h */
        public boolean m3072h() {
            return this.f13535M.get() == 0 && this.f13535M.compareAndSet(0, 2);
        }

        /* JADX INFO: renamed from: i */
        public boolean m3073i() {
            boolean zCompareAndSet = this.f13536N.compareAndSet(false, true);
            this.f13542f = true;
            drain();
            return zCompareAndSet;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            if (this.f13538b.isEmpty()) {
                m3074j();
                return true;
            }
            m3074j();
            return false;
        }

        /* JADX INFO: renamed from: j */
        public void m3074j() {
            int i = this.f13534L;
            if (i != 0) {
                this.f13534L = 0;
                m3071g(i);
            }
        }

        public void onComplete() {
            this.f13542f = true;
            drain();
        }

        public void onError(Throwable e) {
            this.f13543m = e;
            this.f13542f = true;
            drain();
        }

        public void onNext(T t) {
            this.f13538b.offer(t);
            drain();
        }

        @Override // p000.zif
        @dib
        public T poll() {
            T tPoll = this.f13538b.poll();
            if (tPoll != null) {
                this.f13534L++;
                return tPoll;
            }
            m3074j();
            return null;
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f13541e, n);
                drain();
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return 0;
        }

        @Override // p000.zjd
        public void subscribe(ycg<? super T> subscriber) {
            int i;
            do {
                i = this.f13535M.get();
                if ((i & 1) != 0) {
                    w05.error(new IllegalStateException("Only one Subscriber allowed!"), subscriber);
                    return;
                }
            } while (!this.f13535M.compareAndSet(i, i | 1));
            subscriber.onSubscribe(this);
            this.f13532F.lazySet(subscriber);
            if (this.f13531C.get()) {
                this.f13532F.lazySet(null);
            } else {
                drain();
            }
        }
    }

    public be6(l86<T> source, sy6<? super T, ? extends K> keySelector, sy6<? super T, ? extends V> valueSelector, int bufferSize, boolean delayError, sy6<? super uu2<Object>, ? extends Map<K, Object>> mapFactory) {
        super(source);
        this.f13505c = keySelector;
        this.f13506d = valueSelector;
        this.f13507e = bufferSize;
        this.f13508f = delayError;
        this.f13509m = mapFactory;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super rb7<K, V>> s) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> mapApply;
        try {
            if (this.f13509m == null) {
                mapApply = new ConcurrentHashMap<>();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                mapApply = this.f13509m.apply(new C1858a(concurrentLinkedQueue));
            }
            this.f49321b.subscribe((kj6) new C1859b(s, this.f13505c, this.f13506d, this.f13507e, this.f13508f, mapApply, concurrentLinkedQueue));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            s.onSubscribe(xz4.INSTANCE);
            s.onError(th);
        }
    }

    /* JADX INFO: renamed from: be6$b */
    public static final class C1859b<T, K, V> extends AtomicLong implements kj6<T>, fdg {

        /* JADX INFO: renamed from: X */
        public static final Object f13511X = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* JADX INFO: renamed from: C */
        public final Queue<C1860c<K, V>> f13512C;

        /* JADX INFO: renamed from: F */
        public fdg f13513F;

        /* JADX INFO: renamed from: L */
        public long f13515L;

        /* JADX INFO: renamed from: Q */
        public boolean f13518Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super rb7<K, V>> f13519a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends K> f13520b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super T, ? extends V> f13521c;

        /* JADX INFO: renamed from: d */
        public final int f13522d;

        /* JADX INFO: renamed from: e */
        public final int f13523e;

        /* JADX INFO: renamed from: f */
        public final boolean f13524f;

        /* JADX INFO: renamed from: m */
        public final Map<Object, C1860c<K, V>> f13525m;

        /* JADX INFO: renamed from: H */
        public final AtomicBoolean f13514H = new AtomicBoolean();

        /* JADX INFO: renamed from: M */
        public final AtomicInteger f13516M = new AtomicInteger(1);

        /* JADX INFO: renamed from: N */
        public final AtomicLong f13517N = new AtomicLong();

        public C1859b(ycg<? super rb7<K, V>> actual, sy6<? super T, ? extends K> keySelector, sy6<? super T, ? extends V> valueSelector, int bufferSize, boolean delayError, Map<Object, C1860c<K, V>> groups, Queue<C1860c<K, V>> evictedGroups) {
            this.f13519a = actual;
            this.f13520b = keySelector;
            this.f13521c = valueSelector;
            this.f13522d = bufferSize;
            this.f13523e = bufferSize - (bufferSize >> 2);
            this.f13524f = delayError;
            this.f13525m = groups;
            this.f13512C = evictedGroups;
        }

        /* JADX INFO: renamed from: a */
        public static String m3063a(long n) {
            return "Unable to emit a new group (#" + n + ") due to lack of requests. Please make sure the downstream can always accept a new group as well as each group is consumed in order for the whole operator to be able to proceed.";
        }

        private void completeEvictions() {
            if (this.f13512C != null) {
                int i = 0;
                while (true) {
                    C1860c<K, V> c1860cPoll = this.f13512C.poll();
                    if (c1860cPoll == null) {
                        break;
                    } else if (c1860cPoll.f13526c.m3073i()) {
                        i++;
                    }
                }
                if (i != 0) {
                    this.f13516M.addAndGet(-i);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3064b(long n) {
            long j;
            long jAddCap;
            AtomicLong atomicLong = this.f13517N;
            int i = this.f13523e;
            do {
                j = atomicLong.get();
                jAddCap = ro0.addCap(j, n);
            } while (!atomicLong.compareAndSet(j, jAddCap));
            while (true) {
                long j2 = i;
                if (jAddCap < j2) {
                    return;
                }
                if (atomicLong.compareAndSet(jAddCap, jAddCap - j2)) {
                    this.f13513F.request(j2);
                }
                jAddCap = atomicLong.get();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f13514H.compareAndSet(false, true)) {
                completeEvictions();
                if (this.f13516M.decrementAndGet() == 0) {
                    this.f13513F.cancel();
                }
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f13518Q) {
                return;
            }
            Iterator<C1860c<K, V>> it = this.f13525m.values().iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f13525m.clear();
            completeEvictions();
            this.f13518Q = true;
            this.f13519a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f13518Q) {
                ofe.onError(t);
                return;
            }
            this.f13518Q = true;
            Iterator<C1860c<K, V>> it = this.f13525m.values().iterator();
            while (it.hasNext()) {
                it.next().onError(t);
            }
            this.f13525m.clear();
            completeEvictions();
            this.f13519a.onError(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ycg
        public void onNext(T t) {
            boolean z;
            if (this.f13518Q) {
                return;
            }
            try {
                K kApply = this.f13520b.apply(t);
                Object obj = kApply != null ? kApply : f13511X;
                C1860c c1860cCreateWith = this.f13525m.get(obj);
                if (c1860cCreateWith != null) {
                    z = false;
                } else {
                    if (this.f13514H.get()) {
                        return;
                    }
                    c1860cCreateWith = C1860c.createWith(kApply, this.f13522d, this, this.f13524f);
                    this.f13525m.put(obj, (C1860c<K, V>) c1860cCreateWith);
                    this.f13516M.getAndIncrement();
                    z = true;
                }
                try {
                    c1860cCreateWith.onNext(k75.nullCheck(this.f13521c.apply(t), "The valueSelector returned a null value."));
                    completeEvictions();
                    if (z) {
                        if (this.f13515L == get()) {
                            this.f13513F.cancel();
                            onError(new bwa(m3063a(this.f13515L)));
                            return;
                        }
                        this.f13515L++;
                        this.f13519a.onNext(c1860cCreateWith);
                        if (c1860cCreateWith.f13526c.m3072h()) {
                            cancel(kApply);
                            c1860cCreateWith.onComplete();
                            m3064b(1L);
                        }
                    }
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f13513F.cancel();
                    if (z) {
                        if (this.f13515L == get()) {
                            bwa bwaVar = new bwa(m3063a(this.f13515L));
                            bwaVar.initCause(th);
                            onError(bwaVar);
                            return;
                        }
                        this.f13519a.onNext(c1860cCreateWith);
                    }
                    onError(th);
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                this.f13513F.cancel();
                onError(th2);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f13513F, s)) {
                this.f13513F = s;
                this.f13519a.onSubscribe(this);
                s.request(this.f13522d);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this, n);
            }
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) f13511X;
            }
            if (this.f13525m.remove(k) == null || this.f13516M.decrementAndGet() != 0) {
                return;
            }
            this.f13513F.cancel();
        }
    }
}
