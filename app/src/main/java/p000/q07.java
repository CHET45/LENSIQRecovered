package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class q07 {

    /* JADX INFO: renamed from: a */
    public static final py6<Object, Object> f72639a = new C11237x();

    /* JADX INFO: renamed from: b */
    public static final Runnable f72640b = new RunnableC11231r();

    /* JADX INFO: renamed from: c */
    public static final InterfaceC7178i8 f72641c = new C11228o();

    /* JADX INFO: renamed from: d */
    public static final tu2<Object> f72642d = new C11229p();

    /* JADX INFO: renamed from: e */
    public static final tu2<Throwable> f72643e = new C11233t();

    /* JADX INFO: renamed from: f */
    public static final tu2<Throwable> f72644f = new C11216h0();

    /* JADX INFO: renamed from: g */
    public static final yk9 f72645g = new C11230q();

    /* JADX INFO: renamed from: h */
    public static final m8d<Object> f72646h = new C11226m0();

    /* JADX INFO: renamed from: i */
    public static final m8d<Object> f72647i = new C11234u();

    /* JADX INFO: renamed from: j */
    public static final Callable<Object> f72648j = new CallableC11214g0();

    /* JADX INFO: renamed from: k */
    public static final Comparator<Object> f72649k = new C11206c0();

    /* JADX INFO: renamed from: l */
    public static final tu2<fdg> f72650l = new C11202a0();

    /* JADX INFO: renamed from: q07$a */
    public static final class C11201a<T> implements tu2<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7178i8 f72651a;

        public C11201a(InterfaceC7178i8 interfaceC7178i8) {
            this.f72651a = interfaceC7178i8;
        }

        @Override // p000.tu2
        public void accept(T t) throws Exception {
            this.f72651a.run();
        }
    }

    /* JADX INFO: renamed from: q07$a0 */
    public static final class C11202a0 implements tu2<fdg> {
        @Override // p000.tu2
        public void accept(fdg fdgVar) throws Exception {
            fdgVar.request(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: q07$b */
    public static final class C11203b<T1, T2, R> implements py6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final j11<? super T1, ? super T2, ? extends R> f72652a;

        public C11203b(j11<? super T1, ? super T2, ? extends R> j11Var) {
            this.f72652a = j11Var;
        }

        @Override // p000.py6
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f72652a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* JADX INFO: renamed from: q07$b0 */
    public enum EnumC11204b0 implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX INFO: renamed from: q07$c */
    public static final class C11205c<T1, T2, T3, R> implements py6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final iz6<T1, T2, T3, R> f72655a;

        public C11205c(iz6<T1, T2, T3, R> iz6Var) {
            this.f72655a = iz6Var;
        }

        @Override // p000.py6
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f72655a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* JADX INFO: renamed from: q07$c0 */
    public static final class C11206c0 implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX INFO: renamed from: q07$d */
    public static final class C11207d<T1, T2, T3, T4, R> implements py6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final mz6<T1, T2, T3, T4, R> f72656a;

        public C11207d(mz6<T1, T2, T3, T4, R> mz6Var) {
            this.f72656a = mz6Var;
        }

        @Override // p000.py6
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.f72656a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3]);
        }
    }

    /* JADX INFO: renamed from: q07$d0 */
    public static final class C11208d0<T> implements InterfaceC7178i8 {

        /* JADX INFO: renamed from: a */
        public final tu2<? super kgb<T>> f72657a;

        public C11208d0(tu2<? super kgb<T>> tu2Var) {
            this.f72657a = tu2Var;
        }

        @Override // p000.InterfaceC7178i8
        public void run() throws Exception {
            this.f72657a.accept(kgb.createOnComplete());
        }
    }

    /* JADX INFO: renamed from: q07$e */
    public static final class C11209e<T1, T2, T3, T4, T5, R> implements py6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final sz6<T1, T2, T3, T4, T5, R> f72658a;

        public C11209e(sz6<T1, T2, T3, T4, T5, R> sz6Var) {
            this.f72658a = sz6Var;
        }

        @Override // p000.py6
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.f72658a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4]);
        }
    }

    /* JADX INFO: renamed from: q07$e0 */
    public static final class C11210e0<T> implements tu2<Throwable> {

        /* JADX INFO: renamed from: a */
        public final tu2<? super kgb<T>> f72659a;

        public C11210e0(tu2<? super kgb<T>> tu2Var) {
            this.f72659a = tu2Var;
        }

        @Override // p000.tu2
        public void accept(Throwable th) throws Exception {
            this.f72659a.accept(kgb.createOnError(th));
        }
    }

    /* JADX INFO: renamed from: q07$f */
    public static final class C11211f<T1, T2, T3, T4, T5, T6, R> implements py6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final vz6<T1, T2, T3, T4, T5, T6, R> f72660a;

        public C11211f(vz6<T1, T2, T3, T4, T5, T6, R> vz6Var) {
            this.f72660a = vz6Var;
        }

        @Override // p000.py6
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.f72660a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5]);
        }
    }

    /* JADX INFO: renamed from: q07$f0 */
    public static final class C11212f0<T> implements tu2<T> {

        /* JADX INFO: renamed from: a */
        public final tu2<? super kgb<T>> f72661a;

        public C11212f0(tu2<? super kgb<T>> tu2Var) {
            this.f72661a = tu2Var;
        }

        @Override // p000.tu2
        public void accept(T t) throws Exception {
            this.f72661a.accept(kgb.createOnNext(t));
        }
    }

    /* JADX INFO: renamed from: q07$g */
    public static final class C11213g<T1, T2, T3, T4, T5, T6, T7, R> implements py6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final yz6<T1, T2, T3, T4, T5, T6, T7, R> f72662a;

        public C11213g(yz6<T1, T2, T3, T4, T5, T6, T7, R> yz6Var) {
            this.f72662a = yz6Var;
        }

        @Override // p000.py6
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return this.f72662a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6]);
        }
    }

    /* JADX INFO: renamed from: q07$g0 */
    public static final class CallableC11214g0 implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* JADX INFO: renamed from: q07$h */
    public static final class C11215h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements py6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final b07<T1, T2, T3, T4, T5, T6, T7, T8, R> f72663a;

        public C11215h(b07<T1, T2, T3, T4, T5, T6, T7, T8, R> b07Var) {
            this.f72663a = b07Var;
        }

        @Override // p000.py6
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.f72663a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7]);
        }
    }

    /* JADX INFO: renamed from: q07$h0 */
    public static final class C11216h0 implements tu2<Throwable> {
        @Override // p000.tu2
        public void accept(Throwable th) {
            pfe.onError(new q2c(th));
        }
    }

    /* JADX INFO: renamed from: q07$i */
    public static final class C11217i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements py6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final e07<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f72664a;

        public C11217i(e07<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> e07Var) {
            this.f72664a = e07Var;
        }

        @Override // p000.py6
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return this.f72664a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7], (T9) objArr[8]);
        }
    }

    /* JADX INFO: renamed from: q07$i0 */
    public static final class C11218i0<T> implements py6<T, i1h<T>> {

        /* JADX INFO: renamed from: a */
        public final TimeUnit f72665a;

        /* JADX INFO: renamed from: b */
        public final voe f72666b;

        public C11218i0(TimeUnit timeUnit, voe voeVar) {
            this.f72665a = timeUnit;
            this.f72666b = voeVar;
        }

        @Override // p000.py6
        public i1h<T> apply(T t) throws Exception {
            return new i1h<>(t, this.f72666b.now(this.f72665a), this.f72665a);
        }
    }

    /* JADX INFO: renamed from: q07$j */
    public static final class CallableC11219j<T> implements Callable<List<T>> {

        /* JADX INFO: renamed from: a */
        public final int f72667a;

        public CallableC11219j(int i) {
            this.f72667a = i;
        }

        @Override // java.util.concurrent.Callable
        public List<T> call() throws Exception {
            return new ArrayList(this.f72667a);
        }
    }

    /* JADX INFO: renamed from: q07$j0 */
    public static final class C11220j0<K, T> implements f11<Map<K, T>, T> {

        /* JADX INFO: renamed from: a */
        public final py6<? super T, ? extends K> f72668a;

        public C11220j0(py6<? super T, ? extends K> py6Var) {
            this.f72668a = py6Var;
        }

        @Override // p000.f11
        public void accept(Map<K, T> map, T t) throws Exception {
            map.put(this.f72668a.apply(t), t);
        }
    }

    /* JADX INFO: renamed from: q07$k */
    public static final class C11221k<T> implements m8d<T> {

        /* JADX INFO: renamed from: a */
        public final eb1 f72669a;

        public C11221k(eb1 eb1Var) {
            this.f72669a = eb1Var;
        }

        @Override // p000.m8d
        public boolean test(T t) throws Exception {
            return !this.f72669a.getAsBoolean();
        }
    }

    /* JADX INFO: renamed from: q07$k0 */
    public static final class C11222k0<K, V, T> implements f11<Map<K, V>, T> {

        /* JADX INFO: renamed from: a */
        public final py6<? super T, ? extends V> f72670a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends K> f72671b;

        public C11222k0(py6<? super T, ? extends V> py6Var, py6<? super T, ? extends K> py6Var2) {
            this.f72670a = py6Var;
            this.f72671b = py6Var2;
        }

        @Override // p000.f11
        public void accept(Map<K, V> map, T t) throws Exception {
            map.put(this.f72671b.apply(t), this.f72670a.apply(t));
        }
    }

    /* JADX INFO: renamed from: q07$l */
    public static class C11223l implements tu2<fdg> {

        /* JADX INFO: renamed from: a */
        public final int f72672a;

        public C11223l(int i) {
            this.f72672a = i;
        }

        @Override // p000.tu2
        public void accept(fdg fdgVar) throws Exception {
            fdgVar.request(this.f72672a);
        }
    }

    /* JADX INFO: renamed from: q07$l0 */
    public static final class C11224l0<K, V, T> implements f11<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a */
        public final py6<? super K, ? extends Collection<? super V>> f72673a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends V> f72674b;

        /* JADX INFO: renamed from: c */
        public final py6<? super T, ? extends K> f72675c;

        public C11224l0(py6<? super K, ? extends Collection<? super V>> py6Var, py6<? super T, ? extends V> py6Var2, py6<? super T, ? extends K> py6Var3) {
            this.f72673a = py6Var;
            this.f72674b = py6Var2;
            this.f72675c = py6Var3;
        }

        @Override // p000.f11
        public void accept(Map<K, Collection<V>> map, T t) throws Exception {
            K kApply = this.f72675c.apply(t);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f72673a.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.f72674b.apply(t));
        }
    }

    /* JADX INFO: renamed from: q07$m */
    public static final class C11225m<T, U> implements py6<T, U> {

        /* JADX INFO: renamed from: a */
        public final Class<U> f72676a;

        public C11225m(Class<U> cls) {
            this.f72676a = cls;
        }

        @Override // p000.py6
        public U apply(T t) throws Exception {
            return this.f72676a.cast(t);
        }
    }

    /* JADX INFO: renamed from: q07$m0 */
    public static final class C11226m0 implements m8d<Object> {
        @Override // p000.m8d
        public boolean test(Object obj) {
            return true;
        }
    }

    /* JADX INFO: renamed from: q07$n */
    public static final class C11227n<T, U> implements m8d<T> {

        /* JADX INFO: renamed from: a */
        public final Class<U> f72677a;

        public C11227n(Class<U> cls) {
            this.f72677a = cls;
        }

        @Override // p000.m8d
        public boolean test(T t) throws Exception {
            return this.f72677a.isInstance(t);
        }
    }

    /* JADX INFO: renamed from: q07$o */
    public static final class C11228o implements InterfaceC7178i8 {
        @Override // p000.InterfaceC7178i8
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* JADX INFO: renamed from: q07$p */
    public static final class C11229p implements tu2<Object> {
        @Override // p000.tu2
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* JADX INFO: renamed from: q07$q */
    public static final class C11230q implements yk9 {
        @Override // p000.yk9
        public void accept(long j) {
        }
    }

    /* JADX INFO: renamed from: q07$r */
    public static final class RunnableC11231r implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* JADX INFO: renamed from: q07$s */
    public static final class C11232s<T> implements m8d<T> {

        /* JADX INFO: renamed from: a */
        public final T f72678a;

        public C11232s(T t) {
            this.f72678a = t;
        }

        @Override // p000.m8d
        public boolean test(T t) throws Exception {
            return xjb.equals(t, this.f72678a);
        }
    }

    /* JADX INFO: renamed from: q07$t */
    public static final class C11233t implements tu2<Throwable> {
        @Override // p000.tu2
        public void accept(Throwable th) {
            pfe.onError(th);
        }
    }

    /* JADX INFO: renamed from: q07$u */
    public static final class C11234u implements m8d<Object> {
        @Override // p000.m8d
        public boolean test(Object obj) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q07$v */
    public static final class C11235v implements InterfaceC7178i8 {

        /* JADX INFO: renamed from: a */
        public final Future<?> f72679a;

        public C11235v(Future<?> future) {
            this.f72679a = future;
        }

        @Override // p000.InterfaceC7178i8
        public void run() throws Exception {
            this.f72679a.get();
        }
    }

    /* JADX INFO: renamed from: q07$w */
    public enum EnumC11236w implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    /* JADX INFO: renamed from: q07$x */
    public static final class C11237x implements py6<Object, Object> {
        @Override // p000.py6
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* JADX INFO: renamed from: q07$y */
    public static final class CallableC11238y<T, U> implements Callable<U>, py6<T, U> {

        /* JADX INFO: renamed from: a */
        public final U f72682a;

        public CallableC11238y(U u) {
            this.f72682a = u;
        }

        @Override // p000.py6
        public U apply(T t) throws Exception {
            return this.f72682a;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f72682a;
        }
    }

    /* JADX INFO: renamed from: q07$z */
    public static final class C11239z<T> implements py6<List<T>, List<T>> {

        /* JADX INFO: renamed from: a */
        public final Comparator<? super T> f72683a;

        public C11239z(Comparator<? super T> comparator) {
            this.f72683a = comparator;
        }

        @Override // p000.py6
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f72683a);
            return list;
        }
    }

    private q07() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> tu2<T> actionConsumer(InterfaceC7178i8 interfaceC7178i8) {
        return new C11201a(interfaceC7178i8);
    }

    public static <T> m8d<T> alwaysFalse() {
        return (m8d<T>) f72647i;
    }

    public static <T> m8d<T> alwaysTrue() {
        return (m8d<T>) f72646h;
    }

    public static <T> tu2<T> boundedConsumer(int i) {
        return new C11223l(i);
    }

    public static <T, U> py6<T, U> castFunction(Class<U> cls) {
        return new C11225m(cls);
    }

    public static <T> Callable<List<T>> createArrayList(int i) {
        return new CallableC11219j(i);
    }

    public static <T> Callable<Set<T>> createHashSet() {
        return EnumC11236w.INSTANCE;
    }

    public static <T> tu2<T> emptyConsumer() {
        return (tu2<T>) f72642d;
    }

    public static <T> m8d<T> equalsWith(T t) {
        return new C11232s(t);
    }

    public static InterfaceC7178i8 futureAction(Future<?> future) {
        return new C11235v(future);
    }

    public static <T> py6<T, T> identity() {
        return (py6<T, T>) f72639a;
    }

    public static <T, U> m8d<T> isInstanceOf(Class<U> cls) {
        return new C11227n(cls);
    }

    public static <T> Callable<T> justCallable(T t) {
        return new CallableC11238y(t);
    }

    public static <T, U> py6<T, U> justFunction(U u) {
        return new CallableC11238y(u);
    }

    public static <T> py6<List<T>, List<T>> listSorter(Comparator<? super T> comparator) {
        return new C11239z(comparator);
    }

    public static <T> Comparator<T> naturalComparator() {
        return EnumC11204b0.INSTANCE;
    }

    public static <T> Comparator<T> naturalOrder() {
        return (Comparator<T>) f72649k;
    }

    public static <T> InterfaceC7178i8 notificationOnComplete(tu2<? super kgb<T>> tu2Var) {
        return new C11208d0(tu2Var);
    }

    public static <T> tu2<Throwable> notificationOnError(tu2<? super kgb<T>> tu2Var) {
        return new C11210e0(tu2Var);
    }

    public static <T> tu2<T> notificationOnNext(tu2<? super kgb<T>> tu2Var) {
        return new C11212f0(tu2Var);
    }

    public static <T> Callable<T> nullSupplier() {
        return (Callable<T>) f72648j;
    }

    public static <T> m8d<T> predicateReverseFor(eb1 eb1Var) {
        return new C11221k(eb1Var);
    }

    public static <T> py6<T, i1h<T>> timestampWith(TimeUnit timeUnit, voe voeVar) {
        return new C11218i0(timeUnit, voeVar);
    }

    public static <T1, T2, R> py6<Object[], R> toFunction(j11<? super T1, ? super T2, ? extends R> j11Var) {
        xjb.requireNonNull(j11Var, "f is null");
        return new C11203b(j11Var);
    }

    public static <T, K> f11<Map<K, T>, T> toMapKeySelector(py6<? super T, ? extends K> py6Var) {
        return new C11220j0(py6Var);
    }

    public static <T, K, V> f11<Map<K, V>, T> toMapKeyValueSelector(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2) {
        return new C11222k0(py6Var2, py6Var);
    }

    public static <T, K, V> f11<Map<K, Collection<V>>, T> toMultimapKeyValueSelector(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, py6<? super K, ? extends Collection<? super V>> py6Var3) {
        return new C11224l0(py6Var3, py6Var2, py6Var);
    }

    public static <T1, T2, T3, R> py6<Object[], R> toFunction(iz6<T1, T2, T3, R> iz6Var) {
        xjb.requireNonNull(iz6Var, "f is null");
        return new C11205c(iz6Var);
    }

    public static <T1, T2, T3, T4, R> py6<Object[], R> toFunction(mz6<T1, T2, T3, T4, R> mz6Var) {
        xjb.requireNonNull(mz6Var, "f is null");
        return new C11207d(mz6Var);
    }

    public static <T1, T2, T3, T4, T5, R> py6<Object[], R> toFunction(sz6<T1, T2, T3, T4, T5, R> sz6Var) {
        xjb.requireNonNull(sz6Var, "f is null");
        return new C11209e(sz6Var);
    }

    public static <T1, T2, T3, T4, T5, T6, R> py6<Object[], R> toFunction(vz6<T1, T2, T3, T4, T5, T6, R> vz6Var) {
        xjb.requireNonNull(vz6Var, "f is null");
        return new C11211f(vz6Var);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> py6<Object[], R> toFunction(yz6<T1, T2, T3, T4, T5, T6, T7, R> yz6Var) {
        xjb.requireNonNull(yz6Var, "f is null");
        return new C11213g(yz6Var);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> py6<Object[], R> toFunction(b07<T1, T2, T3, T4, T5, T6, T7, T8, R> b07Var) {
        xjb.requireNonNull(b07Var, "f is null");
        return new C11215h(b07Var);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> py6<Object[], R> toFunction(e07<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> e07Var) {
        xjb.requireNonNull(e07Var, "f is null");
        return new C11217i(e07Var);
    }
}
