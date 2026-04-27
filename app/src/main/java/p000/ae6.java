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
public final class ae6<T, K, V> extends AbstractC8162k1<T, sb7<K, V>> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends K> f1214c;

    /* JADX INFO: renamed from: d */
    public final py6<? super T, ? extends V> f1215d;

    /* JADX INFO: renamed from: e */
    public final int f1216e;

    /* JADX INFO: renamed from: f */
    public final boolean f1217f;

    /* JADX INFO: renamed from: m */
    public final py6<? super tu2<Object>, ? extends Map<K, Object>> f1218m;

    /* JADX INFO: renamed from: ae6$a */
    public static final class C0192a<K, V> implements tu2<C0194c<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Queue<C0194c<K, V>> f1219a;

        public C0192a(Queue<C0194c<K, V>> queue) {
            this.f1219a = queue;
        }

        @Override // p000.tu2
        public void accept(C0194c<K, V> c0194c) {
            this.f1219a.offer(c0194c);
        }
    }

    /* JADX INFO: renamed from: ae6$b */
    public static final class C0193b<T, K, V> extends sv0<sb7<K, V>> implements lj6<T> {

        /* JADX INFO: renamed from: Z */
        public static final Object f1220Z = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* JADX INFO: renamed from: C */
        public final Queue<C0194c<K, V>> f1221C;

        /* JADX INFO: renamed from: F */
        public fdg f1222F;

        /* JADX INFO: renamed from: H */
        public final AtomicBoolean f1223H = new AtomicBoolean();

        /* JADX INFO: renamed from: L */
        public final AtomicLong f1224L = new AtomicLong();

        /* JADX INFO: renamed from: M */
        public final AtomicInteger f1225M = new AtomicInteger(1);

        /* JADX INFO: renamed from: N */
        public Throwable f1226N;

        /* JADX INFO: renamed from: Q */
        public volatile boolean f1227Q;

        /* JADX INFO: renamed from: X */
        public boolean f1228X;

        /* JADX INFO: renamed from: Y */
        public boolean f1229Y;

        /* JADX INFO: renamed from: a */
        public final ycg<? super sb7<K, V>> f1230a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends K> f1231b;

        /* JADX INFO: renamed from: c */
        public final py6<? super T, ? extends V> f1232c;

        /* JADX INFO: renamed from: d */
        public final int f1233d;

        /* JADX INFO: renamed from: e */
        public final boolean f1234e;

        /* JADX INFO: renamed from: f */
        public final Map<Object, C0194c<K, V>> f1235f;

        /* JADX INFO: renamed from: m */
        public final rzf<sb7<K, V>> f1236m;

        public C0193b(ycg<? super sb7<K, V>> ycgVar, py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, int i, boolean z, Map<Object, C0194c<K, V>> map, Queue<C0194c<K, V>> queue) {
            this.f1230a = ycgVar;
            this.f1231b = py6Var;
            this.f1232c = py6Var2;
            this.f1233d = i;
            this.f1234e = z;
            this.f1235f = map;
            this.f1221C = queue;
            this.f1236m = new rzf<>(i);
        }

        private void completeEvictions() {
            if (this.f1221C != null) {
                int i = 0;
                while (true) {
                    C0194c<K, V> c0194cPoll = this.f1221C.poll();
                    if (c0194cPoll == null) {
                        break;
                    }
                    c0194cPoll.onComplete();
                    i++;
                }
                if (i != 0) {
                    this.f1225M.addAndGet(-i);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m438a(boolean z, boolean z2, ycg<?> ycgVar, rzf<?> rzfVar) {
            if (this.f1223H.get()) {
                rzfVar.clear();
                return true;
            }
            if (this.f1234e) {
                if (!z || !z2) {
                    return false;
                }
                Throwable th = this.f1226N;
                if (th != null) {
                    ycgVar.onError(th);
                } else {
                    ycgVar.onComplete();
                }
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th2 = this.f1226N;
            if (th2 != null) {
                rzfVar.clear();
                ycgVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            ycgVar.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m439b() {
            Throwable th;
            rzf<sb7<K, V>> rzfVar = this.f1236m;
            ycg<? super sb7<K, V>> ycgVar = this.f1230a;
            int iAddAndGet = 1;
            while (!this.f1223H.get()) {
                boolean z = this.f1227Q;
                if (z && !this.f1234e && (th = this.f1226N) != null) {
                    rzfVar.clear();
                    ycgVar.onError(th);
                    return;
                }
                ycgVar.onNext(null);
                if (z) {
                    Throwable th2 = this.f1226N;
                    if (th2 != null) {
                        ycgVar.onError(th2);
                        return;
                    } else {
                        ycgVar.onComplete();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m440c() {
            rzf<sb7<K, V>> rzfVar = this.f1236m;
            ycg<? super sb7<K, V>> ycgVar = this.f1230a;
            int iAddAndGet = 1;
            do {
                long j = this.f1224L.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f1227Q;
                    sb7<K, V> sb7VarPoll = rzfVar.poll();
                    boolean z2 = sb7VarPoll == null;
                    if (m438a(z, z2, ycgVar, rzfVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    ycgVar.onNext(sb7VarPoll);
                    j2++;
                }
                if (j2 == j && m438a(this.f1227Q, rzfVar.isEmpty(), ycgVar, rzfVar)) {
                    return;
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        this.f1224L.addAndGet(-j2);
                    }
                    this.f1222F.request(j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f1223H.compareAndSet(false, true)) {
                completeEvictions();
                if (this.f1225M.decrementAndGet() == 0) {
                    this.f1222F.cancel();
                }
            }
        }

        @Override // p000.ajf
        public void clear() {
            this.f1236m.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f1229Y) {
                m439b();
            } else {
                m440c();
            }
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f1236m.isEmpty();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f1228X) {
                return;
            }
            Iterator<C0194c<K, V>> it = this.f1235f.values().iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f1235f.clear();
            Queue<C0194c<K, V>> queue = this.f1221C;
            if (queue != null) {
                queue.clear();
            }
            this.f1228X = true;
            this.f1227Q = true;
            drain();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f1228X) {
                pfe.onError(th);
                return;
            }
            this.f1228X = true;
            Iterator<C0194c<K, V>> it = this.f1235f.values().iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.f1235f.clear();
            Queue<C0194c<K, V>> queue = this.f1221C;
            if (queue != null) {
                queue.clear();
            }
            this.f1226N = th;
            this.f1227Q = true;
            drain();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.ycg
        public void onNext(T t) {
            boolean z;
            C0194c c0194c;
            if (this.f1228X) {
                return;
            }
            rzf<sb7<K, V>> rzfVar = this.f1236m;
            try {
                K kApply = this.f1231b.apply(t);
                Object obj = kApply != null ? kApply : f1220Z;
                C0194c<K, V> c0194c2 = this.f1235f.get(obj);
                if (c0194c2 != null) {
                    z = false;
                    c0194c = c0194c2;
                } else {
                    if (this.f1223H.get()) {
                        return;
                    }
                    C0194c c0194cCreateWith = C0194c.createWith(kApply, this.f1233d, this, this.f1234e);
                    this.f1235f.put(obj, c0194cCreateWith);
                    this.f1225M.getAndIncrement();
                    z = true;
                    c0194c = c0194cCreateWith;
                }
                try {
                    c0194c.onNext(xjb.requireNonNull(this.f1232c.apply(t), "The valueSelector returned null"));
                    completeEvictions();
                    if (z) {
                        rzfVar.offer(c0194c);
                        drain();
                    }
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f1222F.cancel();
                    onError(th);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f1222F.cancel();
                onError(th2);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f1222F, fdgVar)) {
                this.f1222F = fdgVar;
                this.f1230a.onSubscribe(this);
                fdgVar.request(this.f1233d);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f1224L, j);
                drain();
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f1229Y = true;
            return 2;
        }

        @Override // p000.ajf
        @cib
        public sb7<K, V> poll() {
            return this.f1236m.poll();
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) f1220Z;
            }
            this.f1235f.remove(k);
            if (this.f1225M.decrementAndGet() == 0) {
                this.f1222F.cancel();
                if (this.f1229Y || getAndIncrement() != 0) {
                    return;
                }
                this.f1236m.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ae6$c */
    public static final class C0194c<K, T> extends sb7<K, T> {

        /* JADX INFO: renamed from: c */
        public final C0195d<T, K> f1237c;

        public C0194c(K k, C0195d<T, K> c0195d) {
            super(k);
            this.f1237c = c0195d;
        }

        public static <T, K> C0194c<K, T> createWith(K k, int i, C0193b<?, K, T> c0193b, boolean z) {
            return new C0194c<>(k, new C0195d(i, c0193b, k, z));
        }

        public void onComplete() {
            this.f1237c.onComplete();
        }

        public void onError(Throwable th) {
            this.f1237c.onError(th);
        }

        public void onNext(T t) {
            this.f1237c.onNext(t);
        }

        @Override // p000.m86
        public void subscribeActual(ycg<? super T> ycgVar) {
            this.f1237c.subscribe(ycgVar);
        }
    }

    /* JADX INFO: renamed from: ae6$d */
    public static final class C0195d<T, K> extends sv0<T> implements zjd<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* JADX INFO: renamed from: L */
        public boolean f1241L;

        /* JADX INFO: renamed from: M */
        public int f1242M;

        /* JADX INFO: renamed from: a */
        public final K f1243a;

        /* JADX INFO: renamed from: b */
        public final rzf<T> f1244b;

        /* JADX INFO: renamed from: c */
        public final C0193b<?, K, T> f1245c;

        /* JADX INFO: renamed from: d */
        public final boolean f1246d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f1248f;

        /* JADX INFO: renamed from: m */
        public Throwable f1249m;

        /* JADX INFO: renamed from: e */
        public final AtomicLong f1247e = new AtomicLong();

        /* JADX INFO: renamed from: C */
        public final AtomicBoolean f1238C = new AtomicBoolean();

        /* JADX INFO: renamed from: F */
        public final AtomicReference<ycg<? super T>> f1239F = new AtomicReference<>();

        /* JADX INFO: renamed from: H */
        public final AtomicBoolean f1240H = new AtomicBoolean();

        public C0195d(int i, C0193b<?, K, T> c0193b, K k, boolean z) {
            this.f1244b = new rzf<>(i);
            this.f1245c = c0193b;
            this.f1243a = k;
            this.f1246d = z;
        }

        /* JADX INFO: renamed from: a */
        public boolean m441a(boolean z, boolean z2, ycg<? super T> ycgVar, boolean z3, long j) {
            if (this.f1238C.get()) {
                while (this.f1244b.poll() != null) {
                    j++;
                }
                if (j != 0) {
                    this.f1245c.f1222F.request(j);
                }
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f1249m;
                if (th != null) {
                    ycgVar.onError(th);
                } else {
                    ycgVar.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f1249m;
            if (th2 != null) {
                this.f1244b.clear();
                ycgVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            ycgVar.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m442b() {
            Throwable th;
            rzf<T> rzfVar = this.f1244b;
            ycg<? super T> ycgVar = this.f1239F.get();
            int iAddAndGet = 1;
            while (true) {
                if (ycgVar != null) {
                    if (this.f1238C.get()) {
                        return;
                    }
                    boolean z = this.f1248f;
                    if (z && !this.f1246d && (th = this.f1249m) != null) {
                        rzfVar.clear();
                        ycgVar.onError(th);
                        return;
                    }
                    ycgVar.onNext(null);
                    if (z) {
                        Throwable th2 = this.f1249m;
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
                    ycgVar = this.f1239F.get();
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m443c() {
            rzf<T> rzfVar = this.f1244b;
            boolean z = this.f1246d;
            ycg<? super T> ycgVar = this.f1239F.get();
            int iAddAndGet = 1;
            while (true) {
                if (ycgVar != null) {
                    long j = this.f1247e.get();
                    long j2 = 0;
                    while (true) {
                        if (j2 == j) {
                            break;
                        }
                        boolean z2 = this.f1248f;
                        T tPoll = rzfVar.poll();
                        boolean z3 = tPoll == null;
                        long j3 = j2;
                        if (m441a(z2, z3, ycgVar, z, j2)) {
                            return;
                        }
                        if (z3) {
                            j2 = j3;
                            break;
                        } else {
                            ycgVar.onNext(tPoll);
                            j2 = j3 + 1;
                        }
                    }
                    if (j2 == j) {
                        long j4 = j2;
                        if (m441a(this.f1248f, rzfVar.isEmpty(), ycgVar, z, j2)) {
                            return;
                        } else {
                            j2 = j4;
                        }
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            this.f1247e.addAndGet(-j2);
                        }
                        this.f1245c.f1222F.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (ycgVar == null) {
                    ycgVar = this.f1239F.get();
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f1238C.compareAndSet(false, true)) {
                this.f1245c.cancel(this.f1243a);
                drain();
            }
        }

        @Override // p000.ajf
        public void clear() {
            rzf<T> rzfVar = this.f1244b;
            while (rzfVar.poll() != null) {
                this.f1242M++;
            }
            m444d();
        }

        /* JADX INFO: renamed from: d */
        public void m444d() {
            int i = this.f1242M;
            if (i != 0) {
                this.f1242M = 0;
                this.f1245c.f1222F.request(i);
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f1241L) {
                m442b();
            } else {
                m443c();
            }
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            if (!this.f1244b.isEmpty()) {
                return false;
            }
            m444d();
            return true;
        }

        public void onComplete() {
            this.f1248f = true;
            drain();
        }

        public void onError(Throwable th) {
            this.f1249m = th;
            this.f1248f = true;
            drain();
        }

        public void onNext(T t) {
            this.f1244b.offer(t);
            drain();
        }

        @Override // p000.ajf
        @cib
        public T poll() {
            T tPoll = this.f1244b.poll();
            if (tPoll != null) {
                this.f1242M++;
                return tPoll;
            }
            m444d();
            return null;
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f1247e, j);
                drain();
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f1241L = true;
            return 2;
        }

        @Override // p000.zjd
        public void subscribe(ycg<? super T> ycgVar) {
            if (!this.f1240H.compareAndSet(false, true)) {
                x05.error(new IllegalStateException("Only one Subscriber allowed!"), ycgVar);
                return;
            }
            ycgVar.onSubscribe(this);
            this.f1239F.lazySet(ycgVar);
            drain();
        }
    }

    public ae6(m86<T> m86Var, py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, int i, boolean z, py6<? super tu2<Object>, ? extends Map<K, Object>> py6Var3) {
        super(m86Var);
        this.f1214c = py6Var;
        this.f1215d = py6Var2;
        this.f1216e = i;
        this.f1217f = z;
        this.f1218m = py6Var3;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super sb7<K, V>> ycgVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> mapApply;
        try {
            if (this.f1218m == null) {
                mapApply = new ConcurrentHashMap<>();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                mapApply = this.f1218m.apply(new C0192a(concurrentLinkedQueue));
            }
            this.f52360b.subscribe((lj6) new C0193b(ycgVar, this.f1214c, this.f1215d, this.f1216e, this.f1217f, mapApply, concurrentLinkedQueue));
        } catch (Exception e) {
            n75.throwIfFatal(e);
            ycgVar.onSubscribe(yz4.INSTANCE);
            ycgVar.onError(e);
        }
    }
}
