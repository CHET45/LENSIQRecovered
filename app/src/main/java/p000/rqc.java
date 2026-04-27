package p000;

import p000.qqc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistentCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n+ 2 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n*L\n1#1,85:1\n82#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n*L\n84#1:86\n*E\n"})
public final class rqc {
    @yfb
    public static final pqc persistentCompositionLocalHashMapOf() {
        return pqc.f71652F.getEmpty();
    }

    @yfb
    public static final qqc persistentCompositionLocalHashMapOf(@yfb scc<? extends kn2<Object>, ? extends l2i<Object>>... sccVarArr) {
        qqc.InterfaceC11587a interfaceC11587aBuilder = pqc.f71652F.getEmpty().builder();
        xt9.putAll(interfaceC11587aBuilder, sccVarArr);
        return interfaceC11587aBuilder.build();
    }
}
