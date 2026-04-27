package p000;

import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public class ne3 {

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, C9806h>> f64093b = new ft9().weakKeys().makeMap();

    /* JADX INFO: renamed from: c */
    public static final Logger f64094c = Logger.getLogger(ne3.class.getName());

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<ArrayList<C9806h>> f64095d = new C9799a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC9808j f64096a;

    /* JADX INFO: renamed from: ne3$a */
    public class C9799a extends ThreadLocal<ArrayList<C9806h>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<C9806h> initialValue() {
            return eb9.newArrayListWithCapacity(3);
        }
    }

    /* JADX INFO: renamed from: ne3$b */
    public interface InterfaceC9800b {
        C9806h getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    /* JADX INFO: renamed from: ne3$c */
    public final class C9801c extends ReentrantLock implements InterfaceC9800b {

        /* JADX INFO: renamed from: a */
        public final C9806h f64097a;

        public /* synthetic */ C9801c(ne3 ne3Var, C9806h c9806h, boolean z, C9799a c9799a) {
            this(c9806h, z);
        }

        @Override // p000.ne3.InterfaceC9800b
        public C9806h getLockGraphNode() {
            return this.f64097a;
        }

        @Override // p000.ne3.InterfaceC9800b
        public boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            ne3.this.aboutToAcquire(this);
            try {
                super.lock();
            } finally {
                ne3.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            ne3.this.aboutToAcquire(this);
            try {
                super.lockInterruptibly();
            } finally {
                ne3.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            ne3.this.aboutToAcquire(this);
            try {
                return super.tryLock();
            } finally {
                ne3.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                ne3.lockStateChanged(this);
            }
        }

        private C9801c(C9806h lockGraphNode, boolean fair) {
            super(fair);
            this.f64097a = (C9806h) v7d.checkNotNull(lockGraphNode);
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
            ne3.this.aboutToAcquire(this);
            try {
                return super.tryLock(timeout, unit);
            } finally {
                ne3.lockStateChanged(this);
            }
        }
    }

    /* JADX INFO: renamed from: ne3$e */
    public final class C9803e extends ReentrantReadWriteLock implements InterfaceC9800b {

        /* JADX INFO: renamed from: a */
        public final C9802d f64101a;

        /* JADX INFO: renamed from: b */
        public final C9804f f64102b;

        /* JADX INFO: renamed from: c */
        public final C9806h f64103c;

        public /* synthetic */ C9803e(ne3 ne3Var, C9806h c9806h, boolean z, C9799a c9799a) {
            this(ne3Var, c9806h, z);
        }

        @Override // p000.ne3.InterfaceC9800b
        public C9806h getLockGraphNode() {
            return this.f64103c;
        }

        @Override // p000.ne3.InterfaceC9800b
        public boolean isAcquiredByCurrentThread() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        private C9803e(final ne3 this$0, C9806h lockGraphNode, boolean fair) {
            super(fair);
            this.f64101a = this$0.new C9802d(this);
            this.f64102b = this$0.new C9804f(this);
            this.f64103c = (C9806h) v7d.checkNotNull(lockGraphNode);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.f64101a;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.f64102b;
        }
    }

    /* JADX INFO: renamed from: ne3$g */
    public static class C9805g extends IllegalStateException {

        /* JADX INFO: renamed from: a */
        public static final StackTraceElement[] f64106a = new StackTraceElement[0];

        /* JADX INFO: renamed from: b */
        public static final dy7<String> f64107b = dy7.m9578of(ne3.class.getName(), C9805g.class.getName(), C9806h.class.getName());

        public C9805g(C9806h node1, C9806h node2) {
            super(node1.m17870c() + " -> " + node2.m17870c());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                if (C9810l.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(f64106a);
                    return;
                } else {
                    if (!f64107b.contains(stackTrace[i].getClassName())) {
                        setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ne3$h */
    public static class C9806h {

        /* JADX INFO: renamed from: a */
        public final Map<C9806h, C9805g> f64108a = new ft9().weakKeys().makeMap();

        /* JADX INFO: renamed from: b */
        public final Map<C9806h, C9809k> f64109b = new ft9().weakKeys().makeMap();

        /* JADX INFO: renamed from: c */
        public final String f64110c;

        public C9806h(String lockName) {
            this.f64110c = (String) v7d.checkNotNull(lockName);
        }

        @wx1
        private C9805g findPathTo(C9806h node, Set<C9806h> seen) {
            if (!seen.add(this)) {
                return null;
            }
            C9805g c9805g = this.f64108a.get(node);
            if (c9805g != null) {
                return c9805g;
            }
            for (Map.Entry<C9806h, C9805g> entry : this.f64108a.entrySet()) {
                C9806h key = entry.getKey();
                C9805g c9805gFindPathTo = key.findPathTo(node, seen);
                if (c9805gFindPathTo != null) {
                    C9805g c9805g2 = new C9805g(key, this);
                    c9805g2.setStackTrace(entry.getValue().getStackTrace());
                    c9805g2.initCause(c9805gFindPathTo);
                    return c9805g2;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public void m17868a(InterfaceC9808j policy, C9806h acquiredLock) {
            v7d.checkState(this != acquiredLock, "Attempted to acquire multiple locks with the same rank %s", acquiredLock.m17870c());
            if (this.f64108a.containsKey(acquiredLock)) {
                return;
            }
            C9809k c9809k = this.f64109b.get(acquiredLock);
            C9799a c9799a = null;
            if (c9809k != null) {
                policy.handlePotentialDeadlock(new C9809k(acquiredLock, this, c9809k.getConflictingStackTrace(), c9799a));
                return;
            }
            C9805g c9805gFindPathTo = acquiredLock.findPathTo(this, t6f.newIdentityHashSet());
            if (c9805gFindPathTo == null) {
                this.f64108a.put(acquiredLock, new C9805g(acquiredLock, this));
                return;
            }
            C9809k c9809k2 = new C9809k(acquiredLock, this, c9805gFindPathTo, c9799a);
            this.f64109b.put(acquiredLock, c9809k2);
            policy.handlePotentialDeadlock(c9809k2);
        }

        /* JADX INFO: renamed from: b */
        public void m17869b(InterfaceC9808j policy, List<C9806h> acquiredLocks) {
            Iterator<C9806h> it = acquiredLocks.iterator();
            while (it.hasNext()) {
                m17868a(policy, it.next());
            }
        }

        /* JADX INFO: renamed from: c */
        public String m17870c() {
            return this.f64110c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ne3$i */
    public static abstract class EnumC9807i implements InterfaceC9808j {

        /* JADX INFO: renamed from: a */
        public static final EnumC9807i f64111a = new a("THROW", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC9807i f64112b = new b("WARN", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC9807i f64113c = new c("DISABLED", 2);

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ EnumC9807i[] f64114d = $values();

        /* JADX INFO: renamed from: ne3$i$a */
        public enum a extends EnumC9807i {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.ne3.InterfaceC9808j
            public void handlePotentialDeadlock(C9809k e) {
                throw e;
            }
        }

        /* JADX INFO: renamed from: ne3$i$b */
        public enum b extends EnumC9807i {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.ne3.InterfaceC9808j
            public void handlePotentialDeadlock(C9809k e) {
                ne3.f64094c.log(Level.SEVERE, "Detected potential deadlock", (Throwable) e);
            }
        }

        /* JADX INFO: renamed from: ne3$i$c */
        public enum c extends EnumC9807i {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.ne3.InterfaceC9808j
            public void handlePotentialDeadlock(C9809k e) {
            }
        }

        private static /* synthetic */ EnumC9807i[] $values() {
            return new EnumC9807i[]{f64111a, f64112b, f64113c};
        }

        private EnumC9807i(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC9807i valueOf(String name) {
            return (EnumC9807i) Enum.valueOf(EnumC9807i.class, name);
        }

        public static EnumC9807i[] values() {
            return (EnumC9807i[]) f64114d.clone();
        }

        public /* synthetic */ EnumC9807i(String str, int i, C9799a c9799a) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: ne3$j */
    public interface InterfaceC9808j {
        void handlePotentialDeadlock(C9809k exception);
    }

    /* JADX INFO: renamed from: ne3$k */
    public static final class C9809k extends C9805g {

        /* JADX INFO: renamed from: c */
        public final C9805g f64115c;

        public /* synthetic */ C9809k(C9806h c9806h, C9806h c9806h2, C9805g c9805g, C9799a c9799a) {
            this(c9806h, c9806h2, c9805g);
        }

        public C9805g getConflictingStackTrace() {
            return this.f64115c;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable cause = this.f64115c; cause != null; cause = cause.getCause()) {
                sb.append(", ");
                sb.append(cause.getMessage());
            }
            return sb.toString();
        }

        private C9809k(C9806h node1, C9806h node2, C9805g conflictingStackTrace) {
            super(node1, node2);
            this.f64115c = conflictingStackTrace;
            initCause(conflictingStackTrace);
        }
    }

    /* JADX INFO: renamed from: ne3$l */
    public static final class C9810l<E extends Enum<E>> extends ne3 {

        /* JADX INFO: renamed from: e */
        public final Map<E, C9806h> f64116e;

        @gdi
        public C9810l(InterfaceC9808j policy, Map<E, C9806h> lockGraphNodes) {
            super(policy, null);
            this.f64116e = lockGraphNodes;
        }

        public ReentrantLock newReentrantLock(E rank) {
            return newReentrantLock((Enum) rank, false);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E rank) {
            return newReentrantReadWriteLock((Enum) rank, false);
        }

        public ReentrantLock newReentrantLock(E rank, boolean fair) {
            if (this.f64096a == EnumC9807i.f64113c) {
                return new ReentrantLock(fair);
            }
            C9806h c9806h = this.f64116e.get(rank);
            Objects.requireNonNull(c9806h);
            return new C9801c(this, c9806h, fair, null);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(E rank, boolean fair) {
            if (this.f64096a == EnumC9807i.f64113c) {
                return new ReentrantReadWriteLock(fair);
            }
            C9806h c9806h = this.f64116e.get(rank);
            Objects.requireNonNull(c9806h);
            return new C9803e(this, c9806h, fair, null);
        }
    }

    public /* synthetic */ ne3(InterfaceC9808j interfaceC9808j, C9799a c9799a) {
        this(interfaceC9808j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aboutToAcquire(InterfaceC9800b lock) {
        if (lock.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList<C9806h> arrayList = f64095d.get();
        C9806h lockGraphNode = lock.getLockGraphNode();
        lockGraphNode.m17869b(this.f64096a, arrayList);
        arrayList.add(lockGraphNode);
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public static <E extends Enum<E>> Map<E, C9806h> m17866d(Class<E> clazz) {
        EnumMap enumMapNewEnumMap = tt9.newEnumMap(clazz);
        E[] enumConstants = clazz.getEnumConstants();
        int length = enumConstants.length;
        ArrayList arrayListNewArrayListWithCapacity = eb9.newArrayListWithCapacity(length);
        int i = 0;
        for (E e : enumConstants) {
            C9806h c9806h = new C9806h(getLockName(e));
            arrayListNewArrayListWithCapacity.add(c9806h);
            enumMapNewEnumMap.put(e, c9806h);
        }
        for (int i2 = 1; i2 < length; i2++) {
            ((C9806h) arrayListNewArrayListWithCapacity.get(i2)).m17869b(EnumC9807i.f64111a, arrayListNewArrayListWithCapacity.subList(0, i2));
        }
        while (i < length - 1) {
            i++;
            ((C9806h) arrayListNewArrayListWithCapacity.get(i)).m17869b(EnumC9807i.f64113c, arrayListNewArrayListWithCapacity.subList(i, length));
        }
        return Collections.unmodifiableMap(enumMapNewEnumMap);
    }

    private static String getLockName(Enum<?> rank) {
        return rank.getDeclaringClass().getSimpleName() + "." + rank.name();
    }

    private static <E extends Enum<E>> Map<? extends E, C9806h> getOrCreateNodes(Class<E> clazz) {
        ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, C9806h>> concurrentMap = f64093b;
        Map<? extends E, C9806h> map = (Map) concurrentMap.get(clazz);
        if (map != null) {
            return map;
        }
        Map<? extends Enum<?>, C9806h> mapM17866d = m17866d(clazz);
        return (Map) yya.firstNonNull(concurrentMap.putIfAbsent(clazz, mapM17866d), mapM17866d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lockStateChanged(InterfaceC9800b lock) {
        if (lock.isAcquiredByCurrentThread()) {
            return;
        }
        ArrayList<C9806h> arrayList = f64095d.get();
        C9806h lockGraphNode = lock.getLockGraphNode();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == lockGraphNode) {
                arrayList.remove(size);
                return;
            }
        }
    }

    public static ne3 newInstance(InterfaceC9808j policy) {
        return new ne3(policy);
    }

    public static <E extends Enum<E>> C9810l<E> newInstanceWithExplicitOrdering(Class<E> enumClass, InterfaceC9808j policy) {
        v7d.checkNotNull(enumClass);
        v7d.checkNotNull(policy);
        return new C9810l<>(policy, getOrCreateNodes(enumClass));
    }

    public ReentrantLock newReentrantLock(String lockName) {
        return newReentrantLock(lockName, false);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String lockName) {
        return newReentrantReadWriteLock(lockName, false);
    }

    private ne3(InterfaceC9808j policy) {
        this.f64096a = (InterfaceC9808j) v7d.checkNotNull(policy);
    }

    public ReentrantLock newReentrantLock(String lockName, boolean fair) {
        return this.f64096a == EnumC9807i.f64113c ? new ReentrantLock(fair) : new C9801c(this, new C9806h(lockName), fair, null);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String lockName, boolean fair) {
        return this.f64096a == EnumC9807i.f64113c ? new ReentrantReadWriteLock(fair) : new C9803e(this, new C9806h(lockName), fair, null);
    }

    /* JADX INFO: renamed from: ne3$d */
    public class C9802d extends ReentrantReadWriteLock.ReadLock {

        /* JADX INFO: renamed from: a */
        @Weak
        public final C9803e f64099a;

        public C9802d(C9803e readWriteLock) {
            super(readWriteLock);
            this.f64099a = readWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            ne3.this.aboutToAcquire(this.f64099a);
            try {
                super.lock();
            } finally {
                ne3.lockStateChanged(this.f64099a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            ne3.this.aboutToAcquire(this.f64099a);
            try {
                super.lockInterruptibly();
            } finally {
                ne3.lockStateChanged(this.f64099a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            ne3.this.aboutToAcquire(this.f64099a);
            try {
                return super.tryLock();
            } finally {
                ne3.lockStateChanged(this.f64099a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                ne3.lockStateChanged(this.f64099a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
            ne3.this.aboutToAcquire(this.f64099a);
            try {
                return super.tryLock(timeout, unit);
            } finally {
                ne3.lockStateChanged(this.f64099a);
            }
        }
    }

    /* JADX INFO: renamed from: ne3$f */
    public class C9804f extends ReentrantReadWriteLock.WriteLock {

        /* JADX INFO: renamed from: a */
        @Weak
        public final C9803e f64104a;

        public C9804f(C9803e readWriteLock) {
            super(readWriteLock);
            this.f64104a = readWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            ne3.this.aboutToAcquire(this.f64104a);
            try {
                super.lock();
            } finally {
                ne3.lockStateChanged(this.f64104a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            ne3.this.aboutToAcquire(this.f64104a);
            try {
                super.lockInterruptibly();
            } finally {
                ne3.lockStateChanged(this.f64104a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            ne3.this.aboutToAcquire(this.f64104a);
            try {
                return super.tryLock();
            } finally {
                ne3.lockStateChanged(this.f64104a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                ne3.lockStateChanged(this.f64104a);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException {
            ne3.this.aboutToAcquire(this.f64104a);
            try {
                return super.tryLock(timeout, unit);
            } finally {
                ne3.lockStateChanged(this.f64104a);
            }
        }
    }
}
