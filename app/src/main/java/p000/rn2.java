package p000;

import java.util.Map;
import p000.pqc;
import p000.qqc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class rn2 {
    public static final <T> boolean contains(@yfb qqc qqcVar, @yfb kn2<T> kn2Var) {
        md8.checkNotNull(kn2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return qqcVar.containsKey(kn2Var);
    }

    @yfb
    public static final qqc mutate(@yfb qqc qqcVar, @yfb qy6<? super Map<kn2<Object>, l2i<Object>>, bth> qy6Var) {
        qqc.InterfaceC11587a interfaceC11587aBuilder = qqcVar.builder();
        qy6Var.invoke(interfaceC11587aBuilder);
        return interfaceC11587aBuilder.build();
    }

    public static final <T> T read(@yfb qqc qqcVar, @yfb kn2<T> kn2Var) {
        md8.checkNotNull(kn2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        l2i defaultValueHolder$runtime_release = qqcVar.get((Object) kn2Var);
        if (defaultValueHolder$runtime_release == null) {
            defaultValueHolder$runtime_release = kn2Var.getDefaultValueHolder$runtime_release();
        }
        return (T) defaultValueHolder$runtime_release.readValue(qqcVar);
    }

    @yfb
    public static final qqc updateCompositionMap(@yfb did<?>[] didVarArr, @yfb qqc qqcVar, @yfb qqc qqcVar2) {
        pqc.C11073a c11073aBuilder = rqc.persistentCompositionLocalHashMapOf().builder();
        for (did<?> didVar : didVarArr) {
            kn2<?> compositionLocal = didVar.getCompositionLocal();
            md8.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            zhd zhdVar = (zhd) compositionLocal;
            if (didVar.getCanOverride() || !contains(qqcVar, zhdVar)) {
                l2i l2iVar = (l2i) qqcVar2.get((Object) zhdVar);
                md8.checkNotNull(didVar, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                c11073aBuilder.put(zhdVar, zhdVar.updatedStateOf$runtime_release(didVar, l2iVar));
            }
        }
        return c11073aBuilder.build();
    }

    public static /* synthetic */ qqc updateCompositionMap$default(did[] didVarArr, qqc qqcVar, qqc qqcVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            qqcVar2 = rqc.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(didVarArr, qqcVar, qqcVar2);
    }
}
