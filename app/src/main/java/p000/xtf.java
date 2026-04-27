package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,313:1\n1#2:314\n1223#3,6:315\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n310#1:315,6\n*E\n"})
public final /* synthetic */ class xtf {
    public static final <T> T getValue(@yfb i2g<? extends T> i2gVar, @gib Object obj, @yfb hp8<?> hp8Var) {
        return i2gVar.getValue();
    }

    @yfb
    @k2g
    public static final <T> ytf<T> mutableStateListOf() {
        return new ytf<>();
    }

    @yfb
    @k2g
    public static final <K, V> auf<K, V> mutableStateMapOf() {
        return new auf<>();
    }

    @yfb
    @k2g
    public static final <T> z6b<T> mutableStateOf(T t, @yfb qtf<T> qtfVar) {
        return C1851be.createSnapshotMutableState(t, qtfVar);
    }

    public static /* synthetic */ z6b mutableStateOf$default(Object obj, qtf qtfVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            qtfVar = stf.structuralEqualityPolicy();
        }
        return stf.mutableStateOf(obj, qtfVar);
    }

    @yfb
    @hk2
    public static final <T> i2g<T> rememberUpdatedState(T t, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = mutableStateOf$default(t, null, 2, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        z6b z6bVar = (z6b) objRememberedValue;
        z6bVar.setValue(t);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z6bVar;
    }

    public static final <T> void setValue(@yfb z6b<T> z6bVar, @gib Object obj, @yfb hp8<?> hp8Var, T t) {
        z6bVar.setValue(t);
    }

    @yfb
    public static final <T> ytf<T> toMutableStateList(@yfb Collection<? extends T> collection) {
        ytf<T> ytfVar = new ytf<>();
        ytfVar.addAll(collection);
        return ytfVar;
    }

    @yfb
    public static final <K, V> auf<K, V> toMutableStateMap(@yfb Iterable<? extends scc<? extends K, ? extends V>> iterable) {
        auf<K, V> aufVar = new auf<>();
        aufVar.putAll(xt9.toMap(iterable));
        return aufVar;
    }

    @yfb
    @k2g
    public static final <T> ytf<T> mutableStateListOf(@yfb T... tArr) {
        ytf<T> ytfVar = new ytf<>();
        ytfVar.addAll(e80.toList(tArr));
        return ytfVar;
    }

    @yfb
    @k2g
    public static final <K, V> auf<K, V> mutableStateMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        auf<K, V> aufVar = new auf<>();
        aufVar.putAll(xt9.toMap(sccVarArr));
        return aufVar;
    }
}
