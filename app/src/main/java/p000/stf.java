package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class stf {
    @yfb
    @hk2
    public static final <T extends R, R> i2g<R> collectAsState(@yfb y56<? extends T> y56Var, R r, @gib e13 e13Var, @gib zl2 zl2Var, int i, int i2) {
        return vtf.collectAsState(y56Var, r, e13Var, zl2Var, i, i2);
    }

    @yfb
    public static final f7b<a74> derivedStateObservers() {
        return ttf.derivedStateObservers();
    }

    @yfb
    @k2g
    public static final <T> i2g<T> derivedStateOf(@yfb ny6<? extends T> ny6Var) {
        return ttf.derivedStateOf(ny6Var);
    }

    public static final <T> T getValue(@yfb i2g<? extends T> i2gVar, @gib Object obj, @yfb hp8<?> hp8Var) {
        return (T) xtf.getValue(i2gVar, obj, hp8Var);
    }

    @yfb
    @k2g
    public static final <T> ytf<T> mutableStateListOf() {
        return xtf.mutableStateListOf();
    }

    @yfb
    @k2g
    public static final <K, V> auf<K, V> mutableStateMapOf() {
        return xtf.mutableStateMapOf();
    }

    @yfb
    @k2g
    public static final <T> z6b<T> mutableStateOf(T t, @yfb qtf<T> qtfVar) {
        return xtf.mutableStateOf(t, qtfVar);
    }

    @yfb
    public static final <T> qtf<T> neverEqualPolicy() {
        return wtf.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(@yfb a74 a74Var, @yfb ny6<? extends R> ny6Var) {
        ttf.observeDerivedStateRecalculations(a74Var, ny6Var);
    }

    @yfb
    @hk2
    public static final <T> i2g<T> produceState(T t, @yfb gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        return utf.produceState(t, gz6Var, zl2Var, i);
    }

    @yfb
    public static final <T> qtf<T> referentialEqualityPolicy() {
        return wtf.referentialEqualityPolicy();
    }

    @yfb
    @hk2
    public static final <T> i2g<T> rememberUpdatedState(T t, @gib zl2 zl2Var, int i) {
        return xtf.rememberUpdatedState(t, zl2Var, i);
    }

    public static final <T> void setValue(@yfb z6b<T> z6bVar, @gib Object obj, @yfb hp8<?> hp8Var, T t) {
        xtf.setValue(z6bVar, obj, hp8Var, t);
    }

    @yfb
    public static final <T> y56<T> snapshotFlow(@yfb ny6<? extends T> ny6Var) {
        return vtf.snapshotFlow(ny6Var);
    }

    @yfb
    public static final <T> qtf<T> structuralEqualityPolicy() {
        return wtf.structuralEqualityPolicy();
    }

    @yfb
    public static final <T> ytf<T> toMutableStateList(@yfb Collection<? extends T> collection) {
        return xtf.toMutableStateList(collection);
    }

    @yfb
    public static final <K, V> auf<K, V> toMutableStateMap(@yfb Iterable<? extends scc<? extends K, ? extends V>> iterable) {
        return xtf.toMutableStateMap(iterable);
    }

    @yfb
    @hk2
    public static final <T> i2g<T> collectAsState(@yfb l2g<? extends T> l2gVar, @gib e13 e13Var, @gib zl2 zl2Var, int i, int i2) {
        return vtf.collectAsState(l2gVar, e13Var, zl2Var, i, i2);
    }

    @yfb
    @k2g
    public static final <T> i2g<T> derivedStateOf(@yfb qtf<T> qtfVar, @yfb ny6<? extends T> ny6Var) {
        return ttf.derivedStateOf(qtfVar, ny6Var);
    }

    @yfb
    @k2g
    public static final <T> ytf<T> mutableStateListOf(@yfb T... tArr) {
        return xtf.mutableStateListOf(tArr);
    }

    @yfb
    @k2g
    public static final <K, V> auf<K, V> mutableStateMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        return xtf.mutableStateMapOf(sccVarArr);
    }

    @yfb
    @hk2
    public static final <T> i2g<T> produceState(T t, @gib Object obj, @yfb gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        return utf.produceState(t, obj, gz6Var, zl2Var, i);
    }

    @yfb
    @hk2
    public static final <T> i2g<T> produceState(T t, @gib Object obj, @gib Object obj2, @yfb gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        return utf.produceState(t, obj, obj2, gz6Var, zl2Var, i);
    }

    @yfb
    @hk2
    public static final <T> i2g<T> produceState(T t, @gib Object obj, @gib Object obj2, @gib Object obj3, @yfb gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        return utf.produceState(t, obj, obj2, obj3, gz6Var, zl2Var, i);
    }

    @yfb
    @hk2
    public static final <T> i2g<T> produceState(T t, @yfb Object[] objArr, @yfb gz6<? super sdd<T>, ? super zy2<? super bth>, ? extends Object> gz6Var, @gib zl2 zl2Var, int i) {
        return utf.produceState((Object) t, objArr, (gz6) gz6Var, zl2Var, i);
    }
}
