package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.gt9;
import p000.yya;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
@yg8
public final class ft9 {

    /* JADX INFO: renamed from: g */
    public static final int f37676g = 16;

    /* JADX INFO: renamed from: h */
    public static final int f37677h = 4;

    /* JADX INFO: renamed from: i */
    public static final int f37678i = -1;

    /* JADX INFO: renamed from: a */
    public boolean f37679a;

    /* JADX INFO: renamed from: b */
    public int f37680b = -1;

    /* JADX INFO: renamed from: c */
    public int f37681c = -1;

    /* JADX INFO: renamed from: d */
    @wx1
    public gt9.EnumC6521q f37682d;

    /* JADX INFO: renamed from: e */
    @wx1
    public gt9.EnumC6521q f37683e;

    /* JADX INFO: renamed from: f */
    @wx1
    public r45<Object> f37684f;

    /* JADX INFO: renamed from: ft9$a */
    public enum EnumC5962a {
        VALUE
    }

    /* JADX INFO: renamed from: a */
    public int m11151a() {
        int i = this.f37681c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public int m11152b() {
        int i = this.f37680b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public r45<Object> m11153c() {
        return (r45) yya.firstNonNull(this.f37684f, m11154d().mo11946a());
    }

    @op1
    public ft9 concurrencyLevel(int concurrencyLevel) {
        int i = this.f37681c;
        v7d.checkState(i == -1, "concurrency level was already set to %s", i);
        v7d.checkArgument(concurrencyLevel > 0);
        this.f37681c = concurrencyLevel;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public gt9.EnumC6521q m11154d() {
        return (gt9.EnumC6521q) yya.firstNonNull(this.f37682d, gt9.EnumC6521q.f41031a);
    }

    /* JADX INFO: renamed from: e */
    public gt9.EnumC6521q m11155e() {
        return (gt9.EnumC6521q) yya.firstNonNull(this.f37683e, gt9.EnumC6521q.f41031a);
    }

    @op1
    @jd7
    /* JADX INFO: renamed from: f */
    public ft9 m11156f(r45<Object> equivalence) {
        r45<Object> r45Var = this.f37684f;
        v7d.checkState(r45Var == null, "key equivalence was already set to %s", r45Var);
        this.f37684f = (r45) v7d.checkNotNull(equivalence);
        this.f37679a = true;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public ft9 m11157g(gt9.EnumC6521q strength) {
        gt9.EnumC6521q enumC6521q = this.f37682d;
        v7d.checkState(enumC6521q == null, "Key strength was already set to %s", enumC6521q);
        this.f37682d = (gt9.EnumC6521q) v7d.checkNotNull(strength);
        if (strength != gt9.EnumC6521q.f41031a) {
            this.f37679a = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public ft9 m11158h(gt9.EnumC6521q strength) {
        gt9.EnumC6521q enumC6521q = this.f37683e;
        v7d.checkState(enumC6521q == null, "Value strength was already set to %s", enumC6521q);
        this.f37683e = (gt9.EnumC6521q) v7d.checkNotNull(strength);
        if (strength != gt9.EnumC6521q.f41031a) {
            this.f37679a = true;
        }
        return this;
    }

    @op1
    public ft9 initialCapacity(int initialCapacity) {
        int i = this.f37680b;
        v7d.checkState(i == -1, "initial capacity was already set to %s", i);
        v7d.checkArgument(initialCapacity >= 0);
        this.f37680b = initialCapacity;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
        return !this.f37679a ? new ConcurrentHashMap(m11152b(), 0.75f, m11151a()) : gt9.m11862c(this);
    }

    public String toString() {
        yya.C15889b stringHelper = yya.toStringHelper(this);
        int i = this.f37680b;
        if (i != -1) {
            stringHelper.add("initialCapacity", i);
        }
        int i2 = this.f37681c;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", i2);
        }
        gt9.EnumC6521q enumC6521q = this.f37682d;
        if (enumC6521q != null) {
            stringHelper.add("keyStrength", i80.toLowerCase(enumC6521q.toString()));
        }
        gt9.EnumC6521q enumC6521q2 = this.f37683e;
        if (enumC6521q2 != null) {
            stringHelper.add("valueStrength", i80.toLowerCase(enumC6521q2.toString()));
        }
        if (this.f37684f != null) {
            stringHelper.addValue("keyEquivalence");
        }
        return stringHelper.toString();
    }

    @op1
    @jd7
    public ft9 weakKeys() {
        return m11157g(gt9.EnumC6521q.f41032b);
    }

    @op1
    @jd7
    public ft9 weakValues() {
        return m11158h(gt9.EnumC6521q.f41032b);
    }
}
