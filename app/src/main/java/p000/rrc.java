package p000;

import java.util.Map;
import java.util.Set;
import p000.qrc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,135:1\n53#2:136\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n119#1:136\n*E\n"})
@e0g(parameters = 0)
public final class rrc<K, V> extends AbstractC11273q2<K, V> implements qrc<K, V> {

    /* JADX INFO: renamed from: F */
    @yfb
    public static final rrc f79139F;

    /* JADX INFO: renamed from: d */
    @gib
    public final Object f79141d;

    /* JADX INFO: renamed from: e */
    @gib
    public final Object f79142e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final uqc<K, x79<V>> f79143f;

    /* JADX INFO: renamed from: m */
    @yfb
    public static final C12222a f79140m = new C12222a(null);

    /* JADX INFO: renamed from: C */
    public static final int f79138C = 8;

    /* JADX INFO: renamed from: rrc$a */
    public static final class C12222a {
        public /* synthetic */ C12222a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final <K, V> rrc<K, V> emptyOf$runtime_release() {
            rrc<K, V> rrcVar = rrc.f79139F;
            md8.checkNotNull(rrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return rrcVar;
        }

        private C12222a() {
        }
    }

    static {
        b25 b25Var = b25.f12448a;
        f79139F = new rrc(b25Var, b25Var, uqc.f88809f.emptyOf$runtime_release());
    }

    public rrc(@gib Object obj, @gib Object obj2, @yfb uqc<K, x79<V>> uqcVar) {
        this.f79141d = obj;
        this.f79142e = obj2;
        this.f79143f = uqcVar;
    }

    private final ey7<Map.Entry<K, V>> createEntries() {
        return new asc(this);
    }

    @Override // p000.qrc, p000.qqc
    @yfb
    public qrc.InterfaceC11636a<K, V> builder() {
        return new src(this);
    }

    @Override // java.util.Map, p000.qrc
    @yfb
    public qrc<K, V> clear() {
        return f79140m.emptyOf$runtime_release();
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f79143f.containsKey(obj);
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    public final /* bridge */ ey7<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    @gib
    public V get(Object obj) {
        x79<V> x79Var = this.f79143f.get(obj);
        if (x79Var != null) {
            return x79Var.getValue();
        }
        return null;
    }

    @Override // p000.AbstractC11273q2, p000.px7
    @yfb
    public ey7<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @gib
    public final Object getFirstKey$runtime_release() {
        return this.f79141d;
    }

    @yfb
    public final uqc<K, x79<V>> getHashMap$runtime_release() {
        return this.f79143f;
    }

    @gib
    public final Object getLastKey$runtime_release() {
        return this.f79142e;
    }

    @Override // p000.AbstractC11273q2
    public int getSize() {
        return this.f79143f.size();
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    public final /* bridge */ ey7<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map, p000.qrc
    @yfb
    public qrc<K, V> putAll(@yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNull(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        qrc.InterfaceC11636a<K, V> interfaceC11636aBuilder = builder();
        interfaceC11636aBuilder.putAll(map);
        return interfaceC11636aBuilder.build();
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    public final /* bridge */ bx7<V> values() {
        return getValues();
    }

    @Override // p000.AbstractC11273q2, p000.px7
    @yfb
    @yjd
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // p000.AbstractC11273q2, p000.px7
    @yfb
    public ey7<K> getKeys() {
        return new csc(this);
    }

    @Override // p000.AbstractC11273q2, p000.px7
    @yfb
    public bx7<V> getValues() {
        return new fsc(this);
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    @yfb
    public rrc<K, V> put(K k, V v) {
        if (isEmpty()) {
            return new rrc<>(k, k, this.f79143f.put((Object) k, new x79<>(v)));
        }
        x79<V> x79Var = this.f79143f.get(k);
        if (x79Var != null) {
            if (x79Var.getValue() == v) {
                return this;
            }
            return new rrc<>(this.f79141d, this.f79142e, this.f79143f.put((Object) k, x79Var.withValue(v)));
        }
        Object obj = this.f79142e;
        x79<V> x79Var2 = this.f79143f.get((K) obj);
        md8.checkNotNull(x79Var2);
        return new rrc<>(this.f79141d, k, this.f79143f.put((Object) obj, x79Var2.withNext(k)).put((Object) k, new x79<>(v, obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map, uqc] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map, uqc] */
    /* JADX WARN: Type inference failed for: r5v3, types: [uqc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // p000.AbstractC11273q2, java.util.Map
    @yfb
    public rrc<K, V> remove(K k) {
        x79<V> x79Var = this.f79143f.get(k);
        if (x79Var == null) {
            return this;
        }
        uqc<K, x79<V>> uqcVarRemove = this.f79143f.remove((Object) k);
        ?? r5 = uqcVarRemove;
        if (x79Var.getHasPrevious()) {
            Object obj = uqcVarRemove.get(x79Var.getPrevious());
            md8.checkNotNull(obj);
            r5 = (uqc<K, x79<V>>) uqcVarRemove.put(x79Var.getPrevious(), ((x79) obj).withNext(x79Var.getNext()));
        }
        ?? Put = r5;
        if (x79Var.getHasNext()) {
            Object obj2 = r5.get(x79Var.getNext());
            md8.checkNotNull(obj2);
            Put = r5.put(x79Var.getNext(), ((x79) obj2).withPrevious(x79Var.getPrevious()));
        }
        return new rrc<>(!x79Var.getHasPrevious() ? x79Var.getNext() : this.f79141d, !x79Var.getHasNext() ? x79Var.getPrevious() : this.f79142e, Put);
    }

    @Override // java.util.Map, p000.qrc
    @yfb
    public rrc<K, V> remove(K k, V v) {
        x79<V> x79Var = this.f79143f.get(k);
        if (x79Var != null && md8.areEqual(x79Var.getValue(), v)) {
            return remove((Object) k);
        }
        return this;
    }
}
