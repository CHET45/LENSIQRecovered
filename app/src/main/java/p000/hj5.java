package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.lsc;
import p000.oqc;
import p000.prc;
import p000.qrc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
public final class hj5 {
    @yfb
    @q64(message = "Use persistentHashMapOf instead.", replaceWith = @i2e(expression = "persistentHashMapOf(*pairs)", imports = {}))
    public static final <K, V> qrc<K, V> immutableHashMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        return persistentHashMapOf((scc[]) Arrays.copyOf(sccVarArr, sccVarArr.length));
    }

    @yfb
    @q64(message = "Use persistentHashSetOf instead.", replaceWith = @i2e(expression = "persistentHashSetOf(*elements)", imports = {}))
    public static final <E> lsc<E> immutableHashSetOf(@yfb E... eArr) {
        return persistentHashSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @yfb
    @q64(message = "Use persistentListOf instead.", replaceWith = @i2e(expression = "persistentListOf(*elements)", imports = {}))
    public static final <E> prc<E> immutableListOf(@yfb E... eArr) {
        return persistentListOf(Arrays.copyOf(eArr, eArr.length));
    }

    @yfb
    @q64(message = "Use persistentMapOf instead.", replaceWith = @i2e(expression = "persistentMapOf(*pairs)", imports = {}))
    public static final <K, V> qrc<K, V> immutableMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        return persistentMapOf((scc[]) Arrays.copyOf(sccVarArr, sccVarArr.length));
    }

    @yfb
    @q64(message = "Use persistentSetOf instead.", replaceWith = @i2e(expression = "persistentSetOf(*elements)", imports = {}))
    public static final <E> lsc<E> immutableSetOf(@yfb E... eArr) {
        return persistentSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @yfb
    public static final <E> lsc<E> intersect(@yfb lsc<? extends E> lscVar, @yfb Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return lscVar.retainAll((Collection<? extends Object>) iterable);
        }
        lsc.InterfaceC8954a<? extends E> interfaceC8954aBuilder = lscVar.builder();
        q82.retainAll(interfaceC8954aBuilder, iterable);
        return interfaceC8954aBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <E> oqc<E> minus(@yfb oqc<? extends E> oqcVar, E e) {
        return oqcVar.remove((Object) e);
    }

    @yfb
    public static final <T> lsc<T> mutate(@yfb lsc<? extends T> lscVar, @yfb qy6<? super Set<T>, bth> qy6Var) {
        lsc.InterfaceC8954a<? extends T> interfaceC8954aBuilder = lscVar.builder();
        qy6Var.invoke(interfaceC8954aBuilder);
        return interfaceC8954aBuilder.build();
    }

    @yfb
    public static final <K, V> qrc<K, V> persistentHashMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        uqc<K, V> uqcVarEmptyOf$runtime_release = uqc.f88809f.emptyOf$runtime_release();
        md8.checkNotNull(uqcVarEmptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        qrc.InterfaceC11636a<K, V> interfaceC11636aBuilder = uqcVarEmptyOf$runtime_release.builder();
        xt9.putAll(interfaceC11636aBuilder, sccVarArr);
        return interfaceC11636aBuilder.build();
    }

    @yfb
    public static final <E> lsc<E> persistentHashSetOf(@yfb E... eArr) {
        return lrc.f58544d.emptyOf$runtime_release().addAll((Collection) u70.asList(eArr));
    }

    @yfb
    public static final <E> prc<E> persistentListOf(@yfb E... eArr) {
        return j1i.persistentVectorOf().addAll((Collection) u70.asList(eArr));
    }

    @yfb
    public static final <K, V> qrc<K, V> persistentMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        rrc<K, V> rrcVarEmptyOf$runtime_release = rrc.f79140m.emptyOf$runtime_release();
        md8.checkNotNull(rrcVarEmptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        qrc.InterfaceC11636a<K, V> interfaceC11636aBuilder = rrcVarEmptyOf$runtime_release.builder();
        xt9.putAll(interfaceC11636aBuilder, sccVarArr);
        return interfaceC11636aBuilder.build();
    }

    @yfb
    public static final <E> lsc<E> persistentSetOf(@yfb E... eArr) {
        return hsc.f44728e.emptyOf$runtime_release().addAll((Collection) u70.asList(eArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <E> oqc<E> plus(@yfb oqc<? extends E> oqcVar, E e) {
        return oqcVar.add((Object) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V> qrc<K, V> putAll(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb Map<? extends K, ? extends V> map) {
        md8.checkNotNull(qrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return qrcVar.putAll((Map<? extends Object, ? extends Object>) map);
    }

    @yfb
    public static final <T> jx7<T> toImmutableList(@yfb Iterable<? extends T> iterable) {
        jx7<T> jx7Var = iterable instanceof jx7 ? (jx7) iterable : null;
        return jx7Var == null ? toPersistentList(iterable) : jx7Var;
    }

    @yfb
    public static final <K, V> px7<K, V> toImmutableMap(@yfb Map<K, ? extends V> map) {
        px7<K, V> px7Var = map instanceof px7 ? (px7) map : null;
        if (px7Var != null) {
            return px7Var;
        }
        qrc.InterfaceC11636a interfaceC11636a = map instanceof qrc.InterfaceC11636a ? (qrc.InterfaceC11636a) map : null;
        qrc<K, V> qrcVarBuild = interfaceC11636a != null ? interfaceC11636a.build() : null;
        return qrcVarBuild != null ? qrcVarBuild : persistentMapOf().putAll((Map) map);
    }

    @yfb
    public static final <T> ey7<T> toImmutableSet(@yfb Iterable<? extends T> iterable) {
        ey7<T> ey7Var = iterable instanceof ey7 ? (ey7) iterable : null;
        if (ey7Var != null) {
            return ey7Var;
        }
        lsc.InterfaceC8954a interfaceC8954a = iterable instanceof lsc.InterfaceC8954a ? (lsc.InterfaceC8954a) iterable : null;
        lsc lscVarBuild = interfaceC8954a != null ? interfaceC8954a.build() : null;
        return lscVarBuild != null ? lscVarBuild : plus(persistentSetOf(), (Iterable) iterable);
    }

    @yfb
    public static final <K, V> qrc<K, V> toPersistentHashMap(@yfb Map<K, ? extends V> map) {
        uqc uqcVar = map instanceof uqc ? (uqc) map : null;
        if (uqcVar != null) {
            return uqcVar;
        }
        wqc wqcVar = map instanceof wqc ? (wqc) map : null;
        uqc<K, V> uqcVarBuild = wqcVar != null ? wqcVar.build() : null;
        return uqcVarBuild != null ? uqcVarBuild : uqc.f88809f.emptyOf$runtime_release().putAll((Map) map);
    }

    @yfb
    public static final <T> lsc<T> toPersistentHashSet(@yfb Iterable<? extends T> iterable) {
        lrc lrcVar = iterable instanceof lrc ? (lrc) iterable : null;
        if (lrcVar != null) {
            return lrcVar;
        }
        mrc mrcVar = iterable instanceof mrc ? (mrc) iterable : null;
        lrc lrcVarBuild = mrcVar != null ? mrcVar.build() : null;
        return lrcVarBuild != null ? lrcVarBuild : plus(lrc.f58544d.emptyOf$runtime_release(), (Iterable) iterable);
    }

    @yfb
    public static final <T> prc<T> toPersistentList(@yfb Iterable<? extends T> iterable) {
        prc<T> prcVar = iterable instanceof prc ? (prc) iterable : null;
        if (prcVar != null) {
            return prcVar;
        }
        prc.InterfaceC11080a interfaceC11080a = iterable instanceof prc.InterfaceC11080a ? (prc.InterfaceC11080a) iterable : null;
        prc<T> prcVarBuild = interfaceC11080a != null ? interfaceC11080a.build() : null;
        return prcVarBuild == null ? plus(persistentListOf(), (Iterable) iterable) : prcVarBuild;
    }

    @yfb
    public static final <K, V> qrc<K, V> toPersistentMap(@yfb Map<K, ? extends V> map) {
        rrc rrcVar = map instanceof rrc ? (rrc) map : null;
        if (rrcVar != null) {
            return rrcVar;
        }
        src srcVar = map instanceof src ? (src) map : null;
        qrc<K, V> qrcVarBuild = srcVar != null ? srcVar.build() : null;
        return qrcVarBuild == null ? rrc.f79140m.emptyOf$runtime_release().putAll((Map) map) : qrcVarBuild;
    }

    @yfb
    public static final <T> lsc<T> toPersistentSet(@yfb Iterable<? extends T> iterable) {
        hsc hscVar = iterable instanceof hsc ? (hsc) iterable : null;
        if (hscVar != null) {
            return hscVar;
        }
        isc iscVar = iterable instanceof isc ? (isc) iterable : null;
        lsc<T> lscVarBuild = iscVar != null ? iscVar.build() : null;
        return lscVarBuild == null ? plus(hsc.f44728e.emptyOf$runtime_release(), (Iterable) iterable) : lscVarBuild;
    }

    @yfb
    @q64(message = "Use persistentListOf instead.", replaceWith = @i2e(expression = "persistentListOf()", imports = {}))
    public static final <E> prc<E> immutableListOf() {
        return persistentListOf();
    }

    @yfb
    @q64(message = "Use persistentSetOf instead.", replaceWith = @i2e(expression = "persistentSetOf()", imports = {}))
    public static final <E> lsc<E> immutableSetOf() {
        return persistentSetOf();
    }

    @yfb
    public static final <E> oqc<E> minus(@yfb oqc<? extends E> oqcVar, @yfb Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return oqcVar.removeAll((Collection<? extends Object>) iterable);
        }
        oqc.InterfaceC10501a<? extends E> interfaceC10501aBuilder = oqcVar.builder();
        q82.removeAll(interfaceC10501aBuilder, iterable);
        return interfaceC10501aBuilder.build();
    }

    @yfb
    public static final <T> prc<T> mutate(@yfb prc<? extends T> prcVar, @yfb qy6<? super List<T>, bth> qy6Var) {
        prc.InterfaceC11080a<? extends T> interfaceC11080aBuilder = prcVar.builder();
        qy6Var.invoke(interfaceC11080aBuilder);
        return interfaceC11080aBuilder.build();
    }

    @yfb
    public static final <E> lsc<E> persistentHashSetOf() {
        return lrc.f58544d.emptyOf$runtime_release();
    }

    @yfb
    public static final <E> prc<E> persistentListOf() {
        return j1i.persistentVectorOf();
    }

    @yfb
    public static final <E> lsc<E> persistentSetOf() {
        return hsc.f44728e.emptyOf$runtime_release();
    }

    @yfb
    public static final <E> oqc<E> plus(@yfb oqc<? extends E> oqcVar, @yfb Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return oqcVar.addAll((Collection<? extends Object>) iterable);
        }
        oqc.InterfaceC10501a<? extends E> interfaceC10501aBuilder = oqcVar.builder();
        q82.addAll(interfaceC10501aBuilder, iterable);
        return interfaceC10501aBuilder.build();
    }

    @yfb
    public static final <K, V> qrc<K, V> putAll(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb Iterable<? extends scc<? extends K, ? extends V>> iterable) {
        md8.checkNotNull(qrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        qrc.InterfaceC11636a<? extends K, ? extends V> interfaceC11636aBuilder = qrcVar.builder();
        xt9.putAll(interfaceC11636aBuilder, iterable);
        return interfaceC11636aBuilder.build();
    }

    @yfb
    public static final <E> oqc<E> minus(@yfb oqc<? extends E> oqcVar, @yfb E[] eArr) {
        oqc.InterfaceC10501a<? extends E> interfaceC10501aBuilder = oqcVar.builder();
        q82.removeAll(interfaceC10501aBuilder, eArr);
        return interfaceC10501aBuilder.build();
    }

    @yfb
    public static final <K, V> qrc<K, V> mutate(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb qy6<? super Map<K, V>, bth> qy6Var) {
        md8.checkNotNull(qrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        qrc.InterfaceC11636a<? extends K, ? extends V> interfaceC11636aBuilder = qrcVar.builder();
        qy6Var.invoke(interfaceC11636aBuilder);
        return interfaceC11636aBuilder.build();
    }

    @yfb
    public static final <E> oqc<E> plus(@yfb oqc<? extends E> oqcVar, @yfb E[] eArr) {
        oqc.InterfaceC10501a<? extends E> interfaceC10501aBuilder = oqcVar.builder();
        q82.addAll(interfaceC10501aBuilder, eArr);
        return interfaceC10501aBuilder.build();
    }

    @yfb
    public static final <T> jx7<T> toImmutableList(@yfb vye<? extends T> vyeVar) {
        return toPersistentList(vyeVar);
    }

    @yfb
    public static final <E> oqc<E> minus(@yfb oqc<? extends E> oqcVar, @yfb vye<? extends E> vyeVar) {
        oqc.InterfaceC10501a<? extends E> interfaceC10501aBuilder = oqcVar.builder();
        q82.removeAll(interfaceC10501aBuilder, vyeVar);
        return interfaceC10501aBuilder.build();
    }

    @yfb
    public static final <E> oqc<E> plus(@yfb oqc<? extends E> oqcVar, @yfb vye<? extends E> vyeVar) {
        oqc.InterfaceC10501a<? extends E> interfaceC10501aBuilder = oqcVar.builder();
        q82.addAll(interfaceC10501aBuilder, vyeVar);
        return interfaceC10501aBuilder.build();
    }

    @yfb
    public static final jx7<Character> toImmutableList(@yfb CharSequence charSequence) {
        return toPersistentList(charSequence);
    }

    @yfb
    public static final <T> ey7<T> toImmutableSet(@yfb vye<? extends T> vyeVar) {
        return toPersistentSet(vyeVar);
    }

    @yfb
    public static final <T> lsc<T> toPersistentHashSet(@yfb vye<? extends T> vyeVar) {
        return plus(persistentHashSetOf(), (vye) vyeVar);
    }

    @yfb
    public static final <T> prc<T> toPersistentList(@yfb vye<? extends T> vyeVar) {
        return plus(persistentListOf(), (vye) vyeVar);
    }

    @yfb
    public static final <T> lsc<T> toPersistentSet(@yfb vye<? extends T> vyeVar) {
        return plus(persistentSetOf(), (vye) vyeVar);
    }

    @yfb
    public static final <E> lsc<E> intersect(@yfb oqc<? extends E> oqcVar, @yfb Iterable<? extends E> iterable) {
        return intersect(toPersistentSet(oqcVar), (Iterable) iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <E> prc<E> minus(@yfb prc<? extends E> prcVar, E e) {
        return prcVar.remove((Object) e);
    }

    @yfb
    public static final <K, V> qrc<K, V> persistentHashMapOf() {
        return uqc.f88809f.emptyOf$runtime_release();
    }

    @yfb
    public static final <K, V> qrc<K, V> persistentMapOf() {
        return rrc.f79140m.emptyOf$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <E> prc<E> plus(@yfb prc<? extends E> prcVar, E e) {
        return prcVar.add((Object) e);
    }

    @yfb
    public static final <K, V> qrc<K, V> putAll(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb scc<? extends K, ? extends V>[] sccVarArr) {
        md8.checkNotNull(qrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        qrc.InterfaceC11636a<? extends K, ? extends V> interfaceC11636aBuilder = qrcVar.builder();
        xt9.putAll(interfaceC11636aBuilder, sccVarArr);
        return interfaceC11636aBuilder.build();
    }

    @yfb
    public static final lsc<Character> toImmutableSet(@yfb CharSequence charSequence) {
        return toPersistentSet(charSequence);
    }

    @yfb
    public static final lsc<Character> toPersistentHashSet(@yfb CharSequence charSequence) {
        lsc.InterfaceC8954a interfaceC8954aBuilder = persistentHashSetOf().builder();
        t9g.toCollection(charSequence, interfaceC8954aBuilder);
        return interfaceC8954aBuilder.build();
    }

    @yfb
    public static final prc<Character> toPersistentList(@yfb CharSequence charSequence) {
        prc.InterfaceC11080a interfaceC11080aBuilder = persistentListOf().builder();
        t9g.toCollection(charSequence, interfaceC11080aBuilder);
        return interfaceC11080aBuilder.build();
    }

    @yfb
    public static final lsc<Character> toPersistentSet(@yfb CharSequence charSequence) {
        lsc.InterfaceC8954a interfaceC8954aBuilder = persistentSetOf().builder();
        t9g.toCollection(charSequence, interfaceC8954aBuilder);
        return interfaceC8954aBuilder.build();
    }

    @yfb
    public static final <E> prc<E> minus(@yfb prc<? extends E> prcVar, @yfb Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return prcVar.removeAll((Collection<? extends Object>) iterable);
        }
        prc.InterfaceC11080a<? extends E> interfaceC11080aBuilder = prcVar.builder();
        q82.removeAll(interfaceC11080aBuilder, iterable);
        return interfaceC11080aBuilder.build();
    }

    @yfb
    public static final <E> prc<E> plus(@yfb prc<? extends E> prcVar, @yfb Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return prcVar.addAll((Collection<? extends Object>) iterable);
        }
        prc.InterfaceC11080a<? extends E> interfaceC11080aBuilder = prcVar.builder();
        q82.addAll(interfaceC11080aBuilder, iterable);
        return interfaceC11080aBuilder.build();
    }

    @yfb
    public static final <K, V> qrc<K, V> putAll(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb vye<? extends scc<? extends K, ? extends V>> vyeVar) {
        md8.checkNotNull(qrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        qrc.InterfaceC11636a<? extends K, ? extends V> interfaceC11636aBuilder = qrcVar.builder();
        xt9.putAll(interfaceC11636aBuilder, vyeVar);
        return interfaceC11636aBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <E> lsc<E> minus(@yfb lsc<? extends E> lscVar, E e) {
        return lscVar.remove((Object) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <E> lsc<E> plus(@yfb lsc<? extends E> lscVar, E e) {
        return lscVar.add((Object) e);
    }

    @yfb
    public static final <E> lsc<E> minus(@yfb lsc<? extends E> lscVar, @yfb Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return lscVar.removeAll((Collection<? extends Object>) iterable);
        }
        lsc.InterfaceC8954a<? extends E> interfaceC8954aBuilder = lscVar.builder();
        q82.removeAll(interfaceC8954aBuilder, iterable);
        return interfaceC8954aBuilder.build();
    }

    @yfb
    public static final <E> lsc<E> plus(@yfb lsc<? extends E> lscVar, @yfb Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return lscVar.addAll((Collection<? extends Object>) iterable);
        }
        lsc.InterfaceC8954a<? extends E> interfaceC8954aBuilder = lscVar.builder();
        q82.addAll(interfaceC8954aBuilder, iterable);
        return interfaceC8954aBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <K, V> qrc<K, V> minus(@yfb qrc<? extends K, ? extends V> qrcVar, K k) {
        md8.checkNotNull(qrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return qrcVar.remove((Object) k);
    }

    @yfb
    public static final <K, V> qrc<K, V> plus(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb scc<? extends K, ? extends V> sccVar) {
        md8.checkNotNull(qrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return qrcVar.put((Object) sccVar.getFirst(), (Object) sccVar.getSecond());
    }

    @yfb
    public static final <E> prc<E> minus(@yfb prc<? extends E> prcVar, @yfb E[] eArr) {
        prc.InterfaceC11080a<? extends E> interfaceC11080aBuilder = prcVar.builder();
        q82.removeAll(interfaceC11080aBuilder, eArr);
        return interfaceC11080aBuilder.build();
    }

    @yfb
    public static final <K, V> qrc<K, V> plus(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb Iterable<? extends scc<? extends K, ? extends V>> iterable) {
        return putAll(qrcVar, iterable);
    }

    @yfb
    public static final <K, V> qrc<K, V> plus(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb scc<? extends K, ? extends V>[] sccVarArr) {
        return putAll(qrcVar, sccVarArr);
    }

    @yfb
    public static final <K, V> qrc<K, V> plus(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb vye<? extends scc<? extends K, ? extends V>> vyeVar) {
        return putAll(qrcVar, vyeVar);
    }

    @yfb
    public static final <E> prc<E> minus(@yfb prc<? extends E> prcVar, @yfb vye<? extends E> vyeVar) {
        prc.InterfaceC11080a<? extends E> interfaceC11080aBuilder = prcVar.builder();
        q82.removeAll(interfaceC11080aBuilder, vyeVar);
        return interfaceC11080aBuilder.build();
    }

    @yfb
    public static final <K, V> qrc<K, V> plus(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb Map<? extends K, ? extends V> map) {
        return putAll(qrcVar, map);
    }

    @yfb
    public static final <E> prc<E> plus(@yfb prc<? extends E> prcVar, @yfb E[] eArr) {
        prc.InterfaceC11080a<? extends E> interfaceC11080aBuilder = prcVar.builder();
        q82.addAll(interfaceC11080aBuilder, eArr);
        return interfaceC11080aBuilder.build();
    }

    @yfb
    public static final <E> lsc<E> minus(@yfb lsc<? extends E> lscVar, @yfb E[] eArr) {
        lsc.InterfaceC8954a<? extends E> interfaceC8954aBuilder = lscVar.builder();
        q82.removeAll(interfaceC8954aBuilder, eArr);
        return interfaceC8954aBuilder.build();
    }

    @yfb
    public static final <E> prc<E> plus(@yfb prc<? extends E> prcVar, @yfb vye<? extends E> vyeVar) {
        prc.InterfaceC11080a<? extends E> interfaceC11080aBuilder = prcVar.builder();
        q82.addAll(interfaceC11080aBuilder, vyeVar);
        return interfaceC11080aBuilder.build();
    }

    @yfb
    public static final <E> lsc<E> minus(@yfb lsc<? extends E> lscVar, @yfb vye<? extends E> vyeVar) {
        lsc.InterfaceC8954a<? extends E> interfaceC8954aBuilder = lscVar.builder();
        q82.removeAll(interfaceC8954aBuilder, vyeVar);
        return interfaceC8954aBuilder.build();
    }

    @yfb
    public static final <E> lsc<E> plus(@yfb lsc<? extends E> lscVar, @yfb E[] eArr) {
        lsc.InterfaceC8954a<? extends E> interfaceC8954aBuilder = lscVar.builder();
        q82.addAll(interfaceC8954aBuilder, eArr);
        return interfaceC8954aBuilder.build();
    }

    @yfb
    public static final <K, V> qrc<K, V> minus(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb Iterable<? extends K> iterable) {
        md8.checkNotNull(qrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        qrc.InterfaceC11636a<? extends K, ? extends V> interfaceC11636aBuilder = qrcVar.builder();
        q82.removeAll(interfaceC11636aBuilder.keySet(), iterable);
        return interfaceC11636aBuilder.build();
    }

    @yfb
    public static final <E> lsc<E> plus(@yfb lsc<? extends E> lscVar, @yfb vye<? extends E> vyeVar) {
        lsc.InterfaceC8954a<? extends E> interfaceC8954aBuilder = lscVar.builder();
        q82.addAll(interfaceC8954aBuilder, vyeVar);
        return interfaceC8954aBuilder.build();
    }

    @yfb
    public static final <K, V> qrc<K, V> minus(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb K[] kArr) {
        md8.checkNotNull(qrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        qrc.InterfaceC11636a<? extends K, ? extends V> interfaceC11636aBuilder = qrcVar.builder();
        q82.removeAll(interfaceC11636aBuilder.keySet(), kArr);
        return interfaceC11636aBuilder.build();
    }

    @yfb
    public static final <K, V> qrc<K, V> minus(@yfb qrc<? extends K, ? extends V> qrcVar, @yfb vye<? extends K> vyeVar) {
        md8.checkNotNull(qrcVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        qrc.InterfaceC11636a<? extends K, ? extends V> interfaceC11636aBuilder = qrcVar.builder();
        q82.removeAll(interfaceC11636aBuilder.keySet(), vyeVar);
        return interfaceC11636aBuilder.build();
    }
}
