package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class v3b<K0, V0> {

    /* JADX INFO: renamed from: a */
    public static final int f89831a = 8;

    /* JADX INFO: renamed from: v3b$a */
    public class C13841a extends AbstractC13851k<Object> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89832b;

        public C13841a(final int val$expectedKeys) {
            this.f89832b = val$expectedKeys;
        }

        @Override // p000.v3b.AbstractC13851k
        /* JADX INFO: renamed from: a */
        public <K, V> Map<K, Collection<V>> mo23765a() {
            return swc.m22271d(this.f89832b);
        }
    }

    /* JADX INFO: renamed from: v3b$b */
    public class C13842b extends AbstractC13851k<Object> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89833b;

        public C13842b(final int val$expectedKeys) {
            this.f89833b = val$expectedKeys;
        }

        @Override // p000.v3b.AbstractC13851k
        /* JADX INFO: renamed from: a */
        public <K, V> Map<K, Collection<V>> mo23765a() {
            return swc.m22273f(this.f89833b);
        }
    }

    /* JADX INFO: renamed from: v3b$c */
    public class C13843c extends AbstractC13851k<K0> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator f89834b;

        public C13843c(final Comparator val$comparator) {
            this.f89834b = val$comparator;
        }

        @Override // p000.v3b.AbstractC13851k
        /* JADX INFO: renamed from: a */
        public <K extends K0, V> Map<K, Collection<V>> mo23765a() {
            return new TreeMap(this.f89834b);
        }
    }

    /* JADX INFO: renamed from: v3b$d */
    public class C13844d extends AbstractC13851k<K0> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Class f89835b;

        public C13844d(final Class val$keyClass) {
            this.f89835b = val$keyClass;
        }

        @Override // p000.v3b.AbstractC13851k
        /* JADX INFO: renamed from: a */
        public <K extends K0, V> Map<K, Collection<V>> mo23765a() {
            return new EnumMap(this.f89835b);
        }
    }

    /* JADX INFO: renamed from: v3b$e */
    public static final class C13845e<V> implements lfg<List<V>>, Serializable {

        /* JADX INFO: renamed from: a */
        public final int f89836a;

        public C13845e(int expectedValuesPerKey) {
            this.f89836a = s72.m21765b(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // p000.lfg
        public List<V> get() {
            return new ArrayList(this.f89836a);
        }
    }

    /* JADX INFO: renamed from: v3b$f */
    public static final class C13846f<V extends Enum<V>> implements lfg<Set<V>>, Serializable {

        /* JADX INFO: renamed from: a */
        public final Class<V> f89837a;

        public C13846f(Class<V> clazz) {
            this.f89837a = (Class) v7d.checkNotNull(clazz);
        }

        @Override // p000.lfg
        public Set<V> get() {
            return EnumSet.noneOf(this.f89837a);
        }
    }

    /* JADX INFO: renamed from: v3b$g */
    public static final class C13847g<V> implements lfg<Set<V>>, Serializable {

        /* JADX INFO: renamed from: a */
        public final int f89838a;

        public C13847g(int expectedValuesPerKey) {
            this.f89838a = s72.m21765b(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // p000.lfg
        public Set<V> get() {
            return swc.m22272e(this.f89838a);
        }
    }

    /* JADX INFO: renamed from: v3b$h */
    public static final class C13848h<V> implements lfg<Set<V>>, Serializable {

        /* JADX INFO: renamed from: a */
        public final int f89839a;

        public C13848h(int expectedValuesPerKey) {
            this.f89839a = s72.m21765b(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // p000.lfg
        public Set<V> get() {
            return swc.m22274g(this.f89839a);
        }
    }

    /* JADX INFO: renamed from: v3b$i */
    public enum EnumC13849i implements lfg<List<?>> {
        INSTANCE;

        public static <V> lfg<List<V>> instance() {
            return INSTANCE;
        }

        @Override // p000.lfg
        public List<?> get() {
            return new LinkedList();
        }
    }

    /* JADX INFO: renamed from: v3b$k */
    public static abstract class AbstractC13851k<K0> {

        /* JADX INFO: renamed from: a */
        public static final int f89842a = 2;

        /* JADX INFO: renamed from: v3b$k$a */
        public class a extends AbstractC13850j<K0, Object> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f89843b;

            public a(final int val$expectedValuesPerKey) {
                this.f89843b = val$expectedValuesPerKey;
            }

            @Override // p000.v3b.AbstractC13850j, p000.v3b
            public <K extends K0, V> j99<K, V> build() {
                return x3b.newListMultimap(AbstractC13851k.this.mo23765a(), new C13845e(this.f89843b));
            }
        }

        /* JADX INFO: renamed from: v3b$k$b */
        public class b extends AbstractC13850j<K0, Object> {
            public b() {
            }

            @Override // p000.v3b.AbstractC13850j, p000.v3b
            public <K extends K0, V> j99<K, V> build() {
                return x3b.newListMultimap(AbstractC13851k.this.mo23765a(), EnumC13849i.instance());
            }
        }

        /* JADX INFO: renamed from: v3b$k$c */
        public class c extends AbstractC13852l<K0, Object> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f89846b;

            public c(final int val$expectedValuesPerKey) {
                this.f89846b = val$expectedValuesPerKey;
            }

            @Override // p000.v3b.AbstractC13852l, p000.v3b
            public <K extends K0, V> p6f<K, V> build() {
                return x3b.newSetMultimap(AbstractC13851k.this.mo23765a(), new C13847g(this.f89846b));
            }
        }

        /* JADX INFO: renamed from: v3b$k$d */
        public class d extends AbstractC13852l<K0, Object> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f89848b;

            public d(final int val$expectedValuesPerKey) {
                this.f89848b = val$expectedValuesPerKey;
            }

            @Override // p000.v3b.AbstractC13852l, p000.v3b
            public <K extends K0, V> p6f<K, V> build() {
                return x3b.newSetMultimap(AbstractC13851k.this.mo23765a(), new C13848h(this.f89848b));
            }
        }

        /* JADX INFO: renamed from: v3b$k$f */
        public class f extends AbstractC13852l<K0, V0> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Class f89852b;

            public f(final Class val$valueClass) {
                this.f89852b = val$valueClass;
            }

            @Override // p000.v3b.AbstractC13852l, p000.v3b
            public <K extends K0, V extends V0> p6f<K, V> build() {
                return x3b.newSetMultimap(AbstractC13851k.this.mo23765a(), new C13846f(this.f89852b));
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo23765a();

        public AbstractC13850j<K0, Object> arrayListValues() {
            return arrayListValues(2);
        }

        public <V0 extends Enum<V0>> AbstractC13852l<K0, V0> enumSetValues(Class<V0> valueClass) {
            v7d.checkNotNull(valueClass, "valueClass");
            return new f(valueClass);
        }

        public AbstractC13852l<K0, Object> hashSetValues() {
            return hashSetValues(2);
        }

        public AbstractC13852l<K0, Object> linkedHashSetValues() {
            return linkedHashSetValues(2);
        }

        public AbstractC13850j<K0, Object> linkedListValues() {
            return new b();
        }

        public AbstractC13853m<K0, Comparable> treeSetValues() {
            return treeSetValues(s7c.natural());
        }

        /* JADX INFO: renamed from: v3b$k$e */
        public class e extends AbstractC13853m<K0, V0> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Comparator f89850b;

            public e(final Comparator val$comparator) {
                this.f89850b = val$comparator;
            }

            @Override // p000.v3b.AbstractC13853m, p000.v3b.AbstractC13852l, p000.v3b
            public <K extends K0, V extends V0> rvf<K, V> build() {
                return x3b.newSortedSetMultimap(AbstractC13851k.this.mo23765a(), new C13854n(this.f89850b));
            }
        }

        public AbstractC13850j<K0, Object> arrayListValues(int expectedValuesPerKey) {
            s72.m21765b(expectedValuesPerKey, "expectedValuesPerKey");
            return new a(expectedValuesPerKey);
        }

        public AbstractC13852l<K0, Object> hashSetValues(int expectedValuesPerKey) {
            s72.m21765b(expectedValuesPerKey, "expectedValuesPerKey");
            return new c(expectedValuesPerKey);
        }

        public AbstractC13852l<K0, Object> linkedHashSetValues(int expectedValuesPerKey) {
            s72.m21765b(expectedValuesPerKey, "expectedValuesPerKey");
            return new d(expectedValuesPerKey);
        }

        public <V0> AbstractC13853m<K0, V0> treeSetValues(Comparator<V0> comparator) {
            v7d.checkNotNull(comparator, "comparator");
            return new e(comparator);
        }
    }

    /* JADX INFO: renamed from: v3b$n */
    public static final class C13854n<V> implements lfg<SortedSet<V>>, Serializable {

        /* JADX INFO: renamed from: a */
        public final Comparator<? super V> f89854a;

        public C13854n(Comparator<? super V> comparator) {
            this.f89854a = (Comparator) v7d.checkNotNull(comparator);
        }

        @Override // p000.lfg
        public SortedSet<V> get() {
            return new TreeSet(this.f89854a);
        }
    }

    public /* synthetic */ v3b(C13841a c13841a) {
        this();
    }

    public static <K0 extends Enum<K0>> AbstractC13851k<K0> enumKeys(Class<K0> keyClass) {
        v7d.checkNotNull(keyClass);
        return new C13844d(keyClass);
    }

    public static AbstractC13851k<Object> hashKeys() {
        return hashKeys(8);
    }

    public static AbstractC13851k<Object> linkedHashKeys() {
        return linkedHashKeys(8);
    }

    public static AbstractC13851k<Comparable> treeKeys() {
        return treeKeys(s7c.natural());
    }

    public abstract <K extends K0, V extends V0> u3b<K, V> build();

    public <K extends K0, V extends V0> u3b<K, V> build(u3b<? extends K, ? extends V> multimap) {
        u3b<K, V> u3bVarBuild = build();
        u3bVarBuild.putAll(multimap);
        return u3bVarBuild;
    }

    /* JADX INFO: renamed from: v3b$j */
    public static abstract class AbstractC13850j<K0, V0> extends v3b<K0, V0> {
        public AbstractC13850j() {
            super(null);
        }

        @Override // p000.v3b
        public abstract <K extends K0, V extends V0> j99<K, V> build();

        @Override // p000.v3b
        public <K extends K0, V extends V0> j99<K, V> build(u3b<? extends K, ? extends V> multimap) {
            return (j99) super.build((u3b) multimap);
        }
    }

    /* JADX INFO: renamed from: v3b$l */
    public static abstract class AbstractC13852l<K0, V0> extends v3b<K0, V0> {
        public AbstractC13852l() {
            super(null);
        }

        @Override // p000.v3b
        public abstract <K extends K0, V extends V0> p6f<K, V> build();

        @Override // p000.v3b
        public <K extends K0, V extends V0> p6f<K, V> build(u3b<? extends K, ? extends V> multimap) {
            return (p6f) super.build((u3b) multimap);
        }
    }

    private v3b() {
    }

    public static AbstractC13851k<Object> hashKeys(int expectedKeys) {
        s72.m21765b(expectedKeys, "expectedKeys");
        return new C13841a(expectedKeys);
    }

    public static AbstractC13851k<Object> linkedHashKeys(int expectedKeys) {
        s72.m21765b(expectedKeys, "expectedKeys");
        return new C13842b(expectedKeys);
    }

    public static <K0> AbstractC13851k<K0> treeKeys(Comparator<K0> comparator) {
        v7d.checkNotNull(comparator);
        return new C13843c(comparator);
    }

    /* JADX INFO: renamed from: v3b$m */
    public static abstract class AbstractC13853m<K0, V0> extends AbstractC13852l<K0, V0> {
        @Override // p000.v3b.AbstractC13852l, p000.v3b
        public abstract <K extends K0, V extends V0> rvf<K, V> build();

        @Override // p000.v3b.AbstractC13852l, p000.v3b
        public <K extends K0, V extends V0> rvf<K, V> build(u3b<? extends K, ? extends V> multimap) {
            return (rvf) super.build((u3b) multimap);
        }
    }
}
