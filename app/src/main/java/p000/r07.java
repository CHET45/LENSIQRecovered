package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class r07 {

    /* JADX INFO: renamed from: a */
    public static final sy6<Object, Object> f76637a = new C11833x();

    /* JADX INFO: renamed from: b */
    public static final Runnable f76638b = new RunnableC11827r();

    /* JADX INFO: renamed from: c */
    public static final InterfaceC7776j8 f76639c = new C11824o();

    /* JADX INFO: renamed from: d */
    public static final uu2<Object> f76640d = new C11825p();

    /* JADX INFO: renamed from: e */
    public static final uu2<Throwable> f76641e = new C11829t();

    /* JADX INFO: renamed from: f */
    public static final uu2<Throwable> f76642f = new C11811g0();

    /* JADX INFO: renamed from: g */
    public static final xk9 f76643g = new C11826q();

    /* JADX INFO: renamed from: h */
    public static final n8d<Object> f76644h = new C11821l0();

    /* JADX INFO: renamed from: i */
    public static final n8d<Object> f76645i = new C11830u();

    /* JADX INFO: renamed from: j */
    public static final nfg<Object> f76646j = new C11809f0();

    /* JADX INFO: renamed from: k */
    public static final uu2<fdg> f76647k = new C11799a0();

    /* JADX INFO: renamed from: r07$a */
    public static final class C11798a<T> implements uu2<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7776j8 f76648a;

        public C11798a(InterfaceC7776j8 action) {
            this.f76648a = action;
        }

        @Override // p000.uu2
        public void accept(T t) throws Throwable {
            this.f76648a.run();
        }
    }

    /* JADX INFO: renamed from: r07$a0 */
    public static final class C11799a0 implements uu2<fdg> {
        @Override // p000.uu2
        public void accept(fdg t) {
            t.request(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: r07$b */
    public static final class C11800b<T1, T2, R> implements sy6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final i11<? super T1, ? super T2, ? extends R> f76649a;

        public C11800b(i11<? super T1, ? super T2, ? extends R> f) {
            this.f76649a = f;
        }

        @Override // p000.sy6
        public R apply(Object[] a) throws Throwable {
            if (a.length == 2) {
                return this.f76649a.apply(a[0], a[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + a.length);
        }
    }

    /* JADX INFO: renamed from: r07$b0 */
    public enum EnumC11801b0 implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object o1, Object o2) {
            return ((Comparable) o1).compareTo(o2);
        }
    }

    /* JADX INFO: renamed from: r07$c */
    public static final class C11802c<T1, T2, T3, R> implements sy6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final jz6<T1, T2, T3, R> f76652a;

        public C11802c(jz6<T1, T2, T3, R> f) {
            this.f76652a = f;
        }

        @Override // p000.sy6
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length == 3) {
                return this.f76652a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* JADX INFO: renamed from: r07$c0 */
    public static final class C11803c0<T> implements InterfaceC7776j8 {

        /* JADX INFO: renamed from: a */
        public final uu2<? super jgb<T>> f76653a;

        public C11803c0(uu2<? super jgb<T>> onNotification) {
            this.f76653a = onNotification;
        }

        @Override // p000.InterfaceC7776j8
        public void run() throws Throwable {
            this.f76653a.accept(jgb.createOnComplete());
        }
    }

    /* JADX INFO: renamed from: r07$d */
    public static final class C11804d<T1, T2, T3, T4, R> implements sy6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final nz6<T1, T2, T3, T4, R> f76654a;

        public C11804d(nz6<T1, T2, T3, T4, R> f) {
            this.f76654a = f;
        }

        @Override // p000.sy6
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.f76654a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3]);
        }
    }

    /* JADX INFO: renamed from: r07$d0 */
    public static final class C11805d0<T> implements uu2<Throwable> {

        /* JADX INFO: renamed from: a */
        public final uu2<? super jgb<T>> f76655a;

        public C11805d0(uu2<? super jgb<T>> onNotification) {
            this.f76655a = onNotification;
        }

        @Override // p000.uu2
        public void accept(Throwable v) throws Throwable {
            this.f76655a.accept(jgb.createOnError(v));
        }
    }

    /* JADX INFO: renamed from: r07$e */
    public static final class C11806e<T1, T2, T3, T4, T5, R> implements sy6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final qz6<T1, T2, T3, T4, T5, R> f76656a;

        public C11806e(qz6<T1, T2, T3, T4, T5, R> f) {
            this.f76656a = f;
        }

        @Override // p000.sy6
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.f76656a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4]);
        }
    }

    /* JADX INFO: renamed from: r07$e0 */
    public static final class C11807e0<T> implements uu2<T> {

        /* JADX INFO: renamed from: a */
        public final uu2<? super jgb<T>> f76657a;

        public C11807e0(uu2<? super jgb<T>> onNotification) {
            this.f76657a = onNotification;
        }

        @Override // p000.uu2
        public void accept(T v) throws Throwable {
            this.f76657a.accept(jgb.createOnNext(v));
        }
    }

    /* JADX INFO: renamed from: r07$f */
    public static final class C11808f<T1, T2, T3, T4, T5, T6, R> implements sy6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final tz6<T1, T2, T3, T4, T5, T6, R> f76658a;

        public C11808f(tz6<T1, T2, T3, T4, T5, T6, R> f) {
            this.f76658a = f;
        }

        @Override // p000.sy6
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.f76658a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5]);
        }
    }

    /* JADX INFO: renamed from: r07$f0 */
    public static final class C11809f0 implements nfg<Object> {
        @Override // p000.nfg
        public Object get() {
            return null;
        }
    }

    /* JADX INFO: renamed from: r07$g */
    public static final class C11810g<T1, T2, T3, T4, T5, T6, T7, R> implements sy6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final wz6<T1, T2, T3, T4, T5, T6, T7, R> f76659a;

        public C11810g(wz6<T1, T2, T3, T4, T5, T6, T7, R> f) {
            this.f76659a = f;
        }

        @Override // p000.sy6
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return this.f76659a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6]);
        }
    }

    /* JADX INFO: renamed from: r07$g0 */
    public static final class C11811g0 implements uu2<Throwable> {
        @Override // p000.uu2
        public void accept(Throwable error) {
            ofe.onError(new p2c(error));
        }
    }

    /* JADX INFO: renamed from: r07$h */
    public static final class C11812h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements sy6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final zz6<T1, T2, T3, T4, T5, T6, T7, T8, R> f76660a;

        public C11812h(zz6<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
            this.f76660a = f;
        }

        @Override // p000.sy6
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.f76660a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7]);
        }
    }

    /* JADX INFO: renamed from: r07$h0 */
    public static final class C11813h0<T> implements sy6<T, j1h<T>> {

        /* JADX INFO: renamed from: a */
        public final TimeUnit f76661a;

        /* JADX INFO: renamed from: b */
        public final woe f76662b;

        public C11813h0(TimeUnit unit, woe scheduler) {
            this.f76661a = unit;
            this.f76662b = scheduler;
        }

        @Override // p000.sy6
        public j1h<T> apply(T t) {
            return new j1h<>(t, this.f76662b.now(this.f76661a), this.f76661a);
        }
    }

    /* JADX INFO: renamed from: r07$i */
    public static final class C11814i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements sy6<Object[], R> {

        /* JADX INFO: renamed from: a */
        public final c07<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f76663a;

        public C11814i(c07<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
            this.f76663a = f;
        }

        @Override // p000.sy6
        public R apply(Object[] objArr) throws Throwable {
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return this.f76663a.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7], (T9) objArr[8]);
        }
    }

    /* JADX INFO: renamed from: r07$i0 */
    public static final class C11815i0<K, T> implements e11<Map<K, T>, T> {

        /* JADX INFO: renamed from: a */
        public final sy6<? super T, ? extends K> f76664a;

        public C11815i0(sy6<? super T, ? extends K> keySelector) {
            this.f76664a = keySelector;
        }

        @Override // p000.e11
        public void accept(Map<K, T> m, T t) throws Throwable {
            m.put(this.f76664a.apply(t), t);
        }
    }

    /* JADX INFO: renamed from: r07$j */
    public static final class C11816j<T> implements nfg<List<T>> {

        /* JADX INFO: renamed from: a */
        public final int f76665a;

        public C11816j(int capacity) {
            this.f76665a = capacity;
        }

        @Override // p000.nfg
        public List<T> get() {
            return new ArrayList(this.f76665a);
        }
    }

    /* JADX INFO: renamed from: r07$j0 */
    public static final class C11817j0<K, V, T> implements e11<Map<K, V>, T> {

        /* JADX INFO: renamed from: a */
        public final sy6<? super T, ? extends V> f76666a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends K> f76667b;

        public C11817j0(sy6<? super T, ? extends V> valueSelector, sy6<? super T, ? extends K> keySelector) {
            this.f76666a = valueSelector;
            this.f76667b = keySelector;
        }

        @Override // p000.e11
        public void accept(Map<K, V> m, T t) throws Throwable {
            m.put(this.f76667b.apply(t), this.f76666a.apply(t));
        }
    }

    /* JADX INFO: renamed from: r07$k */
    public static final class C11818k<T> implements n8d<T> {

        /* JADX INFO: renamed from: a */
        public final cb1 f76668a;

        public C11818k(cb1 supplier) {
            this.f76668a = supplier;
        }

        @Override // p000.n8d
        public boolean test(T t) throws Throwable {
            return !this.f76668a.getAsBoolean();
        }
    }

    /* JADX INFO: renamed from: r07$k0 */
    public static final class C11819k0<K, V, T> implements e11<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a */
        public final sy6<? super K, ? extends Collection<? super V>> f76669a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends V> f76670b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super T, ? extends K> f76671c;

        public C11819k0(sy6<? super K, ? extends Collection<? super V>> collectionFactory, sy6<? super T, ? extends V> valueSelector, sy6<? super T, ? extends K> keySelector) {
            this.f76669a = collectionFactory;
            this.f76670b = valueSelector;
            this.f76671c = keySelector;
        }

        @Override // p000.e11
        public void accept(Map<K, Collection<V>> m, T t) throws Throwable {
            K kApply = this.f76671c.apply(t);
            Collection<? super V> collectionApply = (Collection) m.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f76669a.apply(kApply);
                m.put(kApply, collectionApply);
            }
            collectionApply.add(this.f76670b.apply(t));
        }
    }

    /* JADX INFO: renamed from: r07$l */
    public static class C11820l implements uu2<fdg> {

        /* JADX INFO: renamed from: a */
        public final int f76672a;

        public C11820l(int bufferSize) {
            this.f76672a = bufferSize;
        }

        @Override // p000.uu2
        public void accept(fdg s) {
            s.request(this.f76672a);
        }
    }

    /* JADX INFO: renamed from: r07$l0 */
    public static final class C11821l0 implements n8d<Object> {
        @Override // p000.n8d
        public boolean test(Object o) {
            return true;
        }
    }

    /* JADX INFO: renamed from: r07$m */
    public static final class C11822m<T, U> implements sy6<T, U> {

        /* JADX INFO: renamed from: a */
        public final Class<U> f76673a;

        public C11822m(Class<U> clazz) {
            this.f76673a = clazz;
        }

        @Override // p000.sy6
        public U apply(T t) {
            return this.f76673a.cast(t);
        }
    }

    /* JADX INFO: renamed from: r07$n */
    public static final class C11823n<T, U> implements n8d<T> {

        /* JADX INFO: renamed from: a */
        public final Class<U> f76674a;

        public C11823n(Class<U> clazz) {
            this.f76674a = clazz;
        }

        @Override // p000.n8d
        public boolean test(T t) {
            return this.f76674a.isInstance(t);
        }
    }

    /* JADX INFO: renamed from: r07$o */
    public static final class C11824o implements InterfaceC7776j8 {
        @Override // p000.InterfaceC7776j8
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* JADX INFO: renamed from: r07$p */
    public static final class C11825p implements uu2<Object> {
        @Override // p000.uu2
        public void accept(Object v) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* JADX INFO: renamed from: r07$q */
    public static final class C11826q implements xk9 {
        @Override // p000.xk9
        public void accept(long v) {
        }
    }

    /* JADX INFO: renamed from: r07$r */
    public static final class RunnableC11827r implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* JADX INFO: renamed from: r07$s */
    public static final class C11828s<T> implements n8d<T> {

        /* JADX INFO: renamed from: a */
        public final T f76675a;

        public C11828s(T value) {
            this.f76675a = value;
        }

        @Override // p000.n8d
        public boolean test(T t) {
            return Objects.equals(t, this.f76675a);
        }
    }

    /* JADX INFO: renamed from: r07$t */
    public static final class C11829t implements uu2<Throwable> {
        @Override // p000.uu2
        public void accept(Throwable error) {
            ofe.onError(error);
        }
    }

    /* JADX INFO: renamed from: r07$u */
    public static final class C11830u implements n8d<Object> {
        @Override // p000.n8d
        public boolean test(Object o) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r07$v */
    public static final class C11831v implements InterfaceC7776j8 {

        /* JADX INFO: renamed from: a */
        public final Future<?> f76676a;

        public C11831v(Future<?> future) {
            this.f76676a = future;
        }

        @Override // p000.InterfaceC7776j8
        public void run() throws Exception {
            this.f76676a.get();
        }
    }

    /* JADX INFO: renamed from: r07$w */
    public enum EnumC11832w implements nfg<Set<Object>> {
        INSTANCE;

        @Override // p000.nfg
        public Set<Object> get() {
            return new HashSet();
        }
    }

    /* JADX INFO: renamed from: r07$x */
    public static final class C11833x implements sy6<Object, Object> {
        @Override // p000.sy6
        public Object apply(Object v) {
            return v;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* JADX INFO: renamed from: r07$y */
    public static final class CallableC11834y<T, U> implements Callable<U>, nfg<U>, sy6<T, U> {

        /* JADX INFO: renamed from: a */
        public final U f76679a;

        public CallableC11834y(U value) {
            this.f76679a = value;
        }

        @Override // p000.sy6
        public U apply(T t) {
            return this.f76679a;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.f76679a;
        }

        @Override // p000.nfg
        public U get() {
            return this.f76679a;
        }
    }

    /* JADX INFO: renamed from: r07$z */
    public static final class C11835z<T> implements sy6<List<T>, List<T>> {

        /* JADX INFO: renamed from: a */
        public final Comparator<? super T> f76680a;

        public C11835z(Comparator<? super T> comparator) {
            this.f76680a = comparator;
        }

        @Override // p000.sy6
        public List<T> apply(List<T> v) {
            Collections.sort(v, this.f76680a);
            return v;
        }
    }

    private r07() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> uu2<T> actionConsumer(InterfaceC7776j8 action) {
        return new C11798a(action);
    }

    @cfb
    public static <T> n8d<T> alwaysFalse() {
        return (n8d<T>) f76645i;
    }

    @cfb
    public static <T> n8d<T> alwaysTrue() {
        return (n8d<T>) f76644h;
    }

    public static <T> uu2<T> boundedConsumer(int bufferSize) {
        return new C11820l(bufferSize);
    }

    @cfb
    public static <T, U> sy6<T, U> castFunction(@cfb Class<U> target) {
        return new C11822m(target);
    }

    public static <T> nfg<List<T>> createArrayList(int capacity) {
        return new C11816j(capacity);
    }

    public static <T> nfg<Set<T>> createHashSet() {
        return EnumC11832w.INSTANCE;
    }

    public static <T> uu2<T> emptyConsumer() {
        return (uu2<T>) f76640d;
    }

    public static <T> n8d<T> equalsWith(T value) {
        return new C11828s(value);
    }

    @cfb
    public static InterfaceC7776j8 futureAction(@cfb Future<?> future) {
        return new C11831v(future);
    }

    @cfb
    public static <T> sy6<T, T> identity() {
        return (sy6<T, T>) f76637a;
    }

    public static <T, U> n8d<T> isInstanceOf(Class<U> clazz) {
        return new C11823n(clazz);
    }

    @cfb
    public static <T> Callable<T> justCallable(@cfb T value) {
        return new CallableC11834y(value);
    }

    @cfb
    public static <T, U> sy6<T, U> justFunction(@cfb U value) {
        return new CallableC11834y(value);
    }

    @cfb
    public static <T> nfg<T> justSupplier(@cfb T value) {
        return new CallableC11834y(value);
    }

    public static <T> sy6<List<T>, List<T>> listSorter(final Comparator<? super T> comparator) {
        return new C11835z(comparator);
    }

    public static <T> Comparator<T> naturalComparator() {
        return EnumC11801b0.INSTANCE;
    }

    public static <T> InterfaceC7776j8 notificationOnComplete(uu2<? super jgb<T>> onNotification) {
        return new C11803c0(onNotification);
    }

    public static <T> uu2<Throwable> notificationOnError(uu2<? super jgb<T>> onNotification) {
        return new C11805d0(onNotification);
    }

    public static <T> uu2<T> notificationOnNext(uu2<? super jgb<T>> onNotification) {
        return new C11807e0(onNotification);
    }

    @cfb
    public static <T> nfg<T> nullSupplier() {
        return (nfg<T>) f76646j;
    }

    public static <T> n8d<T> predicateReverseFor(cb1 supplier) {
        return new C11818k(supplier);
    }

    public static <T> sy6<T, j1h<T>> timestampWith(TimeUnit unit, woe scheduler) {
        return new C11813h0(unit, scheduler);
    }

    @cfb
    public static <T1, T2, R> sy6<Object[], R> toFunction(@cfb i11<? super T1, ? super T2, ? extends R> f) {
        return new C11800b(f);
    }

    public static <T, K> e11<Map<K, T>, T> toMapKeySelector(final sy6<? super T, ? extends K> keySelector) {
        return new C11815i0(keySelector);
    }

    public static <T, K, V> e11<Map<K, V>, T> toMapKeyValueSelector(final sy6<? super T, ? extends K> keySelector, final sy6<? super T, ? extends V> valueSelector) {
        return new C11817j0(valueSelector, keySelector);
    }

    public static <T, K, V> e11<Map<K, Collection<V>>, T> toMultimapKeyValueSelector(final sy6<? super T, ? extends K> keySelector, final sy6<? super T, ? extends V> valueSelector, final sy6<? super K, ? extends Collection<? super V>> collectionFactory) {
        return new C11819k0(collectionFactory, valueSelector, keySelector);
    }

    @cfb
    public static <T1, T2, T3, R> sy6<Object[], R> toFunction(@cfb jz6<T1, T2, T3, R> f) {
        return new C11802c(f);
    }

    @cfb
    public static <T1, T2, T3, T4, R> sy6<Object[], R> toFunction(@cfb nz6<T1, T2, T3, T4, R> f) {
        return new C11804d(f);
    }

    @cfb
    public static <T1, T2, T3, T4, T5, R> sy6<Object[], R> toFunction(@cfb qz6<T1, T2, T3, T4, T5, R> f) {
        return new C11806e(f);
    }

    @cfb
    public static <T1, T2, T3, T4, T5, T6, R> sy6<Object[], R> toFunction(@cfb tz6<T1, T2, T3, T4, T5, T6, R> f) {
        return new C11808f(f);
    }

    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, R> sy6<Object[], R> toFunction(@cfb wz6<T1, T2, T3, T4, T5, T6, T7, R> f) {
        return new C11810g(f);
    }

    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> sy6<Object[], R> toFunction(@cfb zz6<T1, T2, T3, T4, T5, T6, T7, T8, R> f) {
        return new C11812h(f);
    }

    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> sy6<Object[], R> toFunction(@cfb c07<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f) {
        return new C11814i(f);
    }
}
