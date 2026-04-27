package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,400:1\n1188#2:401\n460#3,11:402\n460#3,11:413\n48#3:424\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n367#1:401\n373#1:402,11\n377#1:413,11\n397#1:424\n*E\n"})
public final /* synthetic */ class ttf {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final duf<n78> f85915a = new duf<>();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final duf<f7b<a74>> f85916b = new duf<>();

    @yfb
    public static final f7b<a74> derivedStateObservers() {
        duf<f7b<a74>> dufVar = f85916b;
        f7b<a74> f7bVar = dufVar.get();
        if (f7bVar != null) {
            return f7bVar;
        }
        f7b<a74> f7bVar2 = new f7b<>(new a74[0], 0);
        dufVar.set(f7bVar2);
        return f7bVar2;
    }

    @yfb
    @k2g
    public static final <T> i2g<T> derivedStateOf(@yfb ny6<? extends T> ny6Var) {
        return new y64(ny6Var, null);
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(z64<?> z64Var, ny6<? extends R> ny6Var) {
        f7b<a74> f7bVarDerivedStateObservers = stf.derivedStateObservers();
        int size = f7bVarDerivedStateObservers.getSize();
        int i = 0;
        if (size > 0) {
            a74[] content = f7bVarDerivedStateObservers.getContent();
            int i2 = 0;
            do {
                content[i2].start(z64Var);
                i2++;
            } while (i2 < size);
        }
        try {
            R rInvoke = ny6Var.invoke();
            o28.finallyStart(1);
            int size2 = f7bVarDerivedStateObservers.getSize();
            if (size2 > 0) {
                a74[] content2 = f7bVarDerivedStateObservers.getContent();
                do {
                    content2[i].done(z64Var);
                    i++;
                } while (i < size2);
            }
            o28.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th) {
            o28.finallyStart(1);
            int size3 = f7bVarDerivedStateObservers.getSize();
            if (size3 > 0) {
                a74[] content3 = f7bVarDerivedStateObservers.getContent();
                do {
                    content3[i].done(z64Var);
                    i++;
                } while (i < size3);
            }
            o28.finallyEnd(1);
            throw th;
        }
    }

    public static final <R> void observeDerivedStateRecalculations(@yfb a74 a74Var, @yfb ny6<? extends R> ny6Var) {
        f7b<a74> f7bVarDerivedStateObservers = stf.derivedStateObservers();
        try {
            f7bVarDerivedStateObservers.add(a74Var);
            ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            f7bVarDerivedStateObservers.removeAt(f7bVarDerivedStateObservers.getSize() - 1);
            o28.finallyEnd(1);
        }
    }

    private static final <T> T withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt(qy6<? super n78, ? extends T> qy6Var) {
        n78 n78Var = (n78) f85915a.get();
        if (n78Var == null) {
            n78Var = new n78(0);
            f85915a.set(n78Var);
        }
        return qy6Var.invoke(n78Var);
    }

    @yfb
    @k2g
    public static final <T> i2g<T> derivedStateOf(@yfb qtf<T> qtfVar, @yfb ny6<? extends T> ny6Var) {
        return new y64(ny6Var, qtfVar);
    }
}
