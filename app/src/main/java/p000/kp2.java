package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n72#2,2:220\n1#3:222\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n*L\n142#1:220,2\n142#1:222\n*E\n"})
public final class kp2<T> implements y1f<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<oo8<?>, lp8<T>> f54882a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ConcurrentHashMap<Class<?>, vl1<T>> f54883b;

    /* JADX WARN: Multi-variable type inference failed */
    public kp2(@yfb qy6<? super oo8<?>, ? extends lp8<T>> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "compute");
        this.f54882a = qy6Var;
        this.f54883b = new ConcurrentHashMap<>();
    }

    @Override // p000.y1f
    @gib
    public lp8<T> get(@yfb oo8<Object> oo8Var) {
        vl1<T> vl1VarPutIfAbsent;
        md8.checkNotNullParameter(oo8Var, "key");
        ConcurrentHashMap<Class<?>, vl1<T>> concurrentHashMap = this.f54883b;
        Class<?> javaClass = hn8.getJavaClass((oo8) oo8Var);
        vl1<T> vl1Var = concurrentHashMap.get(javaClass);
        if (vl1Var == null && (vl1VarPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (vl1Var = new vl1<>(this.f54882a.invoke(oo8Var))))) != null) {
            vl1Var = vl1VarPutIfAbsent;
        }
        return vl1Var.f91555a;
    }

    @Override // p000.y1f
    public boolean isStored(@yfb oo8<?> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "key");
        return this.f54883b.containsKey(hn8.getJavaClass((oo8) oo8Var));
    }
}
