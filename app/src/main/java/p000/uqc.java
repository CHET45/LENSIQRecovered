package p000;

import java.util.Map;
import java.util.Set;
import p000.nih;
import p000.qrc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
@e0g(parameters = 0)
public class uqc<K, V> extends AbstractC11273q2<K, V> implements qrc<K, V> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final nih<K, V> f88811d;

    /* JADX INFO: renamed from: e */
    public final int f88812e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C13656a f88809f = new C13656a(null);

    /* JADX INFO: renamed from: m */
    public static final int f88810m = 8;

    /* JADX INFO: renamed from: C */
    @yfb
    public static final uqc f88808C = new uqc(nih.f64689e.getEMPTY$runtime_release(), 0);

    /* JADX INFO: renamed from: uqc$a */
    public static final class C13656a {
        public /* synthetic */ C13656a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final <K, V> uqc<K, V> emptyOf$runtime_release() {
            uqc<K, V> uqcVar = uqc.f88808C;
            md8.checkNotNull(uqcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return uqcVar;
        }

        private C13656a() {
        }
    }

    public uqc(@yfb nih<K, V> nihVar, int i) {
        this.f88811d = nihVar;
        this.f88812e = i;
    }

    private final ey7<Map.Entry<K, V>> createEntries() {
        return new frc(this);
    }

    @Override // java.util.Map, p000.qrc
    @yfb
    public qrc<K, V> clear() {
        return f88809f.emptyOf$runtime_release();
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    public boolean containsKey(K k) {
        return this.f88811d.containsKey(k != null ? k.hashCode() : 0, k, 0);
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    public final /* bridge */ ey7<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    @gib
    public V get(K k) {
        return this.f88811d.get(k != null ? k.hashCode() : 0, k, 0);
    }

    @Override // p000.AbstractC11273q2, p000.px7
    @yfb
    public ey7<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @yfb
    public final nih<K, V> getNode$runtime_release() {
        return this.f88811d;
    }

    @Override // p000.AbstractC11273q2
    public int getSize() {
        return this.f88812e;
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

    @Override // p000.qrc, p000.qqc
    @yfb
    public wqc<K, V> builder() {
        return new wqc<>(this);
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
        return new hrc(this);
    }

    @Override // p000.AbstractC11273q2, p000.px7
    @yfb
    public bx7<V> getValues() {
        return new jrc(this);
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    @yfb
    public uqc<K, V> put(K k, V v) {
        nih.C9898b<K, V> c9898bPut = this.f88811d.put(k != null ? k.hashCode() : 0, k, v, 0);
        return c9898bPut == null ? this : new uqc<>(c9898bPut.getNode(), size() + c9898bPut.getSizeDelta());
    }

    @Override // p000.AbstractC11273q2, java.util.Map
    @yfb
    public uqc<K, V> remove(K k) {
        nih<K, V> nihVarRemove = this.f88811d.remove(k != null ? k.hashCode() : 0, k, 0);
        if (this.f88811d == nihVarRemove) {
            return this;
        }
        if (nihVarRemove == null) {
            return f88809f.emptyOf$runtime_release();
        }
        return new uqc<>(nihVarRemove, size() - 1);
    }

    @Override // java.util.Map, p000.qrc
    @yfb
    public uqc<K, V> remove(K k, V v) {
        nih<K, V> nihVarRemove = this.f88811d.remove(k != null ? k.hashCode() : 0, k, v, 0);
        if (this.f88811d == nihVarRemove) {
            return this;
        }
        if (nihVarRemove == null) {
            return f88809f.emptyOf$runtime_release();
        }
        return new uqc<>(nihVarRemove, size() - 1);
    }
}
