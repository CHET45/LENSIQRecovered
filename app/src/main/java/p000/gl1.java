package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.AbstractC7697j0;
import p000.gd9;
import p000.yya;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@gd7(emulated = true)
public final class gl1<K, V> {

    /* JADX INFO: renamed from: q */
    public static final int f40094q = 16;

    /* JADX INFO: renamed from: r */
    public static final int f40095r = 4;

    /* JADX INFO: renamed from: s */
    public static final int f40096s = 0;

    /* JADX INFO: renamed from: t */
    public static final int f40097t = 0;

    /* JADX INFO: renamed from: u */
    public static final lfg<? extends AbstractC7697j0.b> f40098u = pfg.ofInstance(new C6368a());

    /* JADX INFO: renamed from: v */
    public static final om1 f40099v = new om1(0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: w */
    public static final lfg<AbstractC7697j0.b> f40100w = new C6369b();

    /* JADX INFO: renamed from: x */
    public static final qzg f40101x = new C6370c();

    /* JADX INFO: renamed from: y */
    public static final int f40102y = -1;

    /* JADX INFO: renamed from: f */
    @wx1
    public iki<? super K, ? super V> f40108f;

    /* JADX INFO: renamed from: g */
    @wx1
    public gd9.EnumC6250t f40109g;

    /* JADX INFO: renamed from: h */
    @wx1
    public gd9.EnumC6250t f40110h;

    /* JADX INFO: renamed from: l */
    @wx1
    public r45<Object> f40114l;

    /* JADX INFO: renamed from: m */
    @wx1
    public r45<Object> f40115m;

    /* JADX INFO: renamed from: n */
    @wx1
    public azd<? super K, ? super V> f40116n;

    /* JADX INFO: renamed from: o */
    @wx1
    public qzg f40117o;

    /* JADX INFO: renamed from: a */
    public boolean f40103a = true;

    /* JADX INFO: renamed from: b */
    public int f40104b = -1;

    /* JADX INFO: renamed from: c */
    public int f40105c = -1;

    /* JADX INFO: renamed from: d */
    public long f40106d = -1;

    /* JADX INFO: renamed from: e */
    public long f40107e = -1;

    /* JADX INFO: renamed from: i */
    public long f40111i = -1;

    /* JADX INFO: renamed from: j */
    public long f40112j = -1;

    /* JADX INFO: renamed from: k */
    public long f40113k = -1;

    /* JADX INFO: renamed from: p */
    public lfg<? extends AbstractC7697j0.b> f40118p = f40098u;

    /* JADX INFO: renamed from: gl1$a */
    public class C6368a implements AbstractC7697j0.b {
        @Override // p000.AbstractC7697j0.b
        public void recordEviction() {
        }

        @Override // p000.AbstractC7697j0.b
        public void recordHits(int count) {
        }

        @Override // p000.AbstractC7697j0.b
        public void recordLoadException(long loadTime) {
        }

        @Override // p000.AbstractC7697j0.b
        public void recordLoadSuccess(long loadTime) {
        }

        @Override // p000.AbstractC7697j0.b
        public void recordMisses(int count) {
        }

        @Override // p000.AbstractC7697j0.b
        public om1 snapshot() {
            return gl1.f40099v;
        }
    }

    /* JADX INFO: renamed from: gl1$b */
    public class C6369b implements lfg<AbstractC7697j0.b> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.lfg
        public AbstractC7697j0.b get() {
            return new AbstractC7697j0.a();
        }
    }

    /* JADX INFO: renamed from: gl1$c */
    public class C6370c extends qzg {
        @Override // p000.qzg
        public long read() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: gl1$d */
    public static final class C6371d {

        /* JADX INFO: renamed from: a */
        public static final Logger f40119a = Logger.getLogger(gl1.class.getName());

        private C6371d() {
        }
    }

    /* JADX INFO: renamed from: gl1$e */
    public enum EnumC6372e implements azd<Object, Object> {
        INSTANCE;

        @Override // p000.azd
        public void onRemoval(ezd<Object, Object> notification) {
        }
    }

    /* JADX INFO: renamed from: gl1$f */
    public enum EnumC6373f implements iki<Object, Object> {
        INSTANCE;

        @Override // p000.iki
        public int weigh(Object key, Object value) {
            return 1;
        }
    }

    private gl1() {
    }

    private void checkNonLoadingCache() {
        v7d.checkState(this.f40113k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void checkWeightWithWeigher() {
        if (this.f40108f == null) {
            v7d.checkState(this.f40107e == -1, "maximumWeight requires weigher");
        } else if (this.f40103a) {
            v7d.checkState(this.f40107e != -1, "weigher requires maximumWeight");
        } else if (this.f40107e == -1) {
            C6371d.f40119a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    @jd7
    public static gl1<Object, Object> from(hl1 spec) {
        return spec.m12455b().m11741q();
    }

    public static gl1<Object, Object> newBuilder() {
        return new gl1<>();
    }

    /* JADX INFO: renamed from: a */
    public int m11725a() {
        int i = this.f40105c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public long m11726b() {
        long j = this.f40112j;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public <K1 extends K, V1 extends V> ad9<K1, V1> build(jm1<? super K1, V1> loader) {
        checkWeightWithWeigher();
        return new gd9.C6244n(this, loader);
    }

    /* JADX INFO: renamed from: c */
    public long m11727c() {
        long j = this.f40111i;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    @op1
    public gl1<K, V> concurrencyLevel(int concurrencyLevel) {
        int i = this.f40105c;
        v7d.checkState(i == -1, "concurrency level was already set to %s", i);
        v7d.checkArgument(concurrencyLevel > 0);
        this.f40105c = concurrencyLevel;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public int m11728d() {
        int i = this.f40104b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public r45<Object> m11729e() {
        return (r45) yya.firstNonNull(this.f40114l, m11730f().mo11622a());
    }

    @op1
    public gl1<K, V> expireAfterAccess(long duration, TimeUnit unit) {
        long j = this.f40112j;
        v7d.checkState(j == -1, "expireAfterAccess was already set to %s ns", j);
        v7d.checkArgument(duration >= 0, "duration cannot be negative: %s %s", duration, unit);
        this.f40112j = unit.toNanos(duration);
        return this;
    }

    @op1
    public gl1<K, V> expireAfterWrite(long duration, TimeUnit unit) {
        long j = this.f40111i;
        v7d.checkState(j == -1, "expireAfterWrite was already set to %s ns", j);
        v7d.checkArgument(duration >= 0, "duration cannot be negative: %s %s", duration, unit);
        this.f40111i = unit.toNanos(duration);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public gd9.EnumC6250t m11730f() {
        return (gd9.EnumC6250t) yya.firstNonNull(this.f40109g, gd9.EnumC6250t.f39508a);
    }

    /* JADX INFO: renamed from: g */
    public long m11731g() {
        if (this.f40111i == 0 || this.f40112j == 0) {
            return 0L;
        }
        return this.f40108f == null ? this.f40106d : this.f40107e;
    }

    /* JADX INFO: renamed from: h */
    public long m11732h() {
        long j = this.f40113k;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: i */
    public <K1 extends K, V1 extends V> azd<K1, V1> m11733i() {
        return (azd) yya.firstNonNull(this.f40116n, EnumC6372e.INSTANCE);
    }

    @op1
    public gl1<K, V> initialCapacity(int initialCapacity) {
        int i = this.f40104b;
        v7d.checkState(i == -1, "initial capacity was already set to %s", i);
        v7d.checkArgument(initialCapacity >= 0);
        this.f40104b = initialCapacity;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public lfg<? extends AbstractC7697j0.b> m11734j() {
        return this.f40118p;
    }

    /* JADX INFO: renamed from: k */
    public qzg m11735k(boolean recordsTime) {
        qzg qzgVar = this.f40117o;
        return qzgVar != null ? qzgVar : recordsTime ? qzg.systemTicker() : f40101x;
    }

    /* JADX INFO: renamed from: l */
    public r45<Object> m11736l() {
        return (r45) yya.firstNonNull(this.f40115m, m11737m().mo11622a());
    }

    /* JADX INFO: renamed from: m */
    public gd9.EnumC6250t m11737m() {
        return (gd9.EnumC6250t) yya.firstNonNull(this.f40110h, gd9.EnumC6250t.f39508a);
    }

    @op1
    public gl1<K, V> maximumSize(long maximumSize) {
        long j = this.f40106d;
        v7d.checkState(j == -1, "maximum size was already set to %s", j);
        long j2 = this.f40107e;
        v7d.checkState(j2 == -1, "maximum weight was already set to %s", j2);
        v7d.checkState(this.f40108f == null, "maximum size can not be combined with weigher");
        v7d.checkArgument(maximumSize >= 0, "maximum size must not be negative");
        this.f40106d = maximumSize;
        return this;
    }

    @op1
    @jd7
    public gl1<K, V> maximumWeight(long maximumWeight) {
        long j = this.f40107e;
        v7d.checkState(j == -1, "maximum weight was already set to %s", j);
        long j2 = this.f40106d;
        v7d.checkState(j2 == -1, "maximum size was already set to %s", j2);
        v7d.checkArgument(maximumWeight >= 0, "maximum weight must not be negative");
        this.f40107e = maximumWeight;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public <K1 extends K, V1 extends V> iki<K1, V1> m11738n() {
        return (iki) yya.firstNonNull(this.f40108f, EnumC6373f.INSTANCE);
    }

    /* JADX INFO: renamed from: o */
    public boolean m11739o() {
        return this.f40118p == f40100w;
    }

    @op1
    @jd7
    /* JADX INFO: renamed from: p */
    public gl1<K, V> m11740p(r45<Object> equivalence) {
        r45<Object> r45Var = this.f40114l;
        v7d.checkState(r45Var == null, "key equivalence was already set to %s", r45Var);
        this.f40114l = (r45) v7d.checkNotNull(equivalence);
        return this;
    }

    @op1
    @jd7
    /* JADX INFO: renamed from: q */
    public gl1<K, V> m11741q() {
        this.f40103a = false;
        return this;
    }

    @op1
    /* JADX INFO: renamed from: r */
    public gl1<K, V> m11742r(gd9.EnumC6250t strength) {
        gd9.EnumC6250t enumC6250t = this.f40109g;
        v7d.checkState(enumC6250t == null, "Key strength was already set to %s", enumC6250t);
        this.f40109g = (gd9.EnumC6250t) v7d.checkNotNull(strength);
        return this;
    }

    @op1
    public gl1<K, V> recordStats() {
        this.f40118p = f40100w;
        return this;
    }

    @op1
    @jd7
    public gl1<K, V> refreshAfterWrite(long duration, TimeUnit unit) {
        v7d.checkNotNull(unit);
        long j = this.f40113k;
        v7d.checkState(j == -1, "refresh was already set to %s ns", j);
        v7d.checkArgument(duration > 0, "duration must be positive: %s %s", duration, unit);
        this.f40113k = unit.toNanos(duration);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K1 extends K, V1 extends V> gl1<K1, V1> removalListener(azd<? super K1, ? super V1> listener) {
        v7d.checkState(this.f40116n == null);
        this.f40116n = (azd) v7d.checkNotNull(listener);
        return this;
    }

    @op1
    /* JADX INFO: renamed from: s */
    public gl1<K, V> m11743s(gd9.EnumC6250t strength) {
        gd9.EnumC6250t enumC6250t = this.f40110h;
        v7d.checkState(enumC6250t == null, "Value strength was already set to %s", enumC6250t);
        this.f40110h = (gd9.EnumC6250t) v7d.checkNotNull(strength);
        return this;
    }

    @op1
    @jd7
    public gl1<K, V> softValues() {
        return m11743s(gd9.EnumC6250t.f39509b);
    }

    @op1
    @jd7
    /* JADX INFO: renamed from: t */
    public gl1<K, V> m11744t(r45<Object> equivalence) {
        r45<Object> r45Var = this.f40115m;
        v7d.checkState(r45Var == null, "value equivalence was already set to %s", r45Var);
        this.f40115m = (r45) v7d.checkNotNull(equivalence);
        return this;
    }

    @op1
    public gl1<K, V> ticker(qzg ticker) {
        v7d.checkState(this.f40117o == null);
        this.f40117o = (qzg) v7d.checkNotNull(ticker);
        return this;
    }

    public String toString() {
        yya.C15889b stringHelper = yya.toStringHelper(this);
        int i = this.f40104b;
        if (i != -1) {
            stringHelper.add("initialCapacity", i);
        }
        int i2 = this.f40105c;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", i2);
        }
        long j = this.f40106d;
        if (j != -1) {
            stringHelper.add("maximumSize", j);
        }
        long j2 = this.f40107e;
        if (j2 != -1) {
            stringHelper.add("maximumWeight", j2);
        }
        if (this.f40111i != -1) {
            stringHelper.add("expireAfterWrite", this.f40111i + "ns");
        }
        if (this.f40112j != -1) {
            stringHelper.add("expireAfterAccess", this.f40112j + "ns");
        }
        gd9.EnumC6250t enumC6250t = this.f40109g;
        if (enumC6250t != null) {
            stringHelper.add("keyStrength", i80.toLowerCase(enumC6250t.toString()));
        }
        gd9.EnumC6250t enumC6250t2 = this.f40110h;
        if (enumC6250t2 != null) {
            stringHelper.add("valueStrength", i80.toLowerCase(enumC6250t2.toString()));
        }
        if (this.f40114l != null) {
            stringHelper.addValue("keyEquivalence");
        }
        if (this.f40115m != null) {
            stringHelper.addValue("valueEquivalence");
        }
        if (this.f40116n != null) {
            stringHelper.addValue("removalListener");
        }
        return stringHelper.toString();
    }

    @op1
    @jd7
    public gl1<K, V> weakKeys() {
        return m11742r(gd9.EnumC6250t.f39510c);
    }

    @op1
    @jd7
    public gl1<K, V> weakValues() {
        return m11743s(gd9.EnumC6250t.f39510c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @op1
    @jd7
    public <K1 extends K, V1 extends V> gl1<K1, V1> weigher(iki<? super K1, ? super V1> weigher) {
        v7d.checkState(this.f40108f == null);
        if (this.f40103a) {
            long j = this.f40106d;
            v7d.checkState(j == -1, "weigher can not be combined with maximum size (%s provided)", j);
        }
        this.f40108f = (iki) v7d.checkNotNull(weigher);
        return this;
    }

    @jd7
    public static gl1<Object, Object> from(String spec) {
        return from(hl1.parse(spec));
    }

    public <K1 extends K, V1 extends V> el1<K1, V1> build() {
        checkWeightWithWeigher();
        checkNonLoadingCache();
        return new gd9.C6245o(this);
    }
}
