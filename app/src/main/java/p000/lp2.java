package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n72#2,2:220\n72#2,2:229\n1#3:222\n1#3:232\n212#4:223\n213#4:228\n214#4:231\n1557#5:224\n1628#5,3:225\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n*L\n158#1:220,2\n159#1:229,2\n158#1:222\n159#1:232\n159#1:223\n159#1:228\n159#1:231\n159#1:224\n159#1:225,3\n*E\n"})
public final class lp2<T> implements ngc<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final gz6<oo8<Object>, List<? extends mp8>, lp8<T>> f58381a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ConcurrentHashMap<Class<?>, mgc<T>> f58382b;

    /* JADX WARN: Multi-variable type inference failed */
    public lp2(@yfb gz6<? super oo8<Object>, ? super List<? extends mp8>, ? extends lp8<T>> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "compute");
        this.f58381a = gz6Var;
        this.f58382b = new ConcurrentHashMap<>();
    }

    @Override // p000.ngc
    @yfb
    /* JADX INFO: renamed from: get-gIAlu-s, reason: not valid java name */
    public Object mo30879getgIAlus(@yfb oo8<Object> oo8Var, @yfb List<? extends mp8> list) {
        Object objM32723constructorimpl;
        mgc<T> mgcVarPutIfAbsent;
        md8.checkNotNullParameter(oo8Var, "key");
        md8.checkNotNullParameter(list, "types");
        ConcurrentHashMap<Class<?>, mgc<T>> concurrentHashMap = this.f58382b;
        Class<?> javaClass = hn8.getJavaClass((oo8) oo8Var);
        mgc<T> mgcVar = concurrentHashMap.get(javaClass);
        if (mgcVar == null && (mgcVarPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (mgcVar = new mgc<>()))) != null) {
            mgcVar = mgcVarPutIfAbsent;
        }
        mgc<T> mgcVar2 = mgcVar;
        List<? extends mp8> list2 = list;
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new qp8((mp8) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = mgcVar2.f60969a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                v7e.C13927a c13927a = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(this.f58381a.invoke(oo8Var, list));
            } catch (Throwable th) {
                v7e.C13927a c13927a2 = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
            }
            v7e v7eVarM32722boximpl = v7e.m32722boximpl(objM32723constructorimpl);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, v7eVarM32722boximpl);
            obj = objPutIfAbsent == null ? v7eVarM32722boximpl : objPutIfAbsent;
        }
        md8.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((v7e) obj).m32732unboximpl();
    }
}
