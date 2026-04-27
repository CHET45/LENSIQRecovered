package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1557#2:220\n1628#2,3:221\n72#3,2:224\n1#4:226\n1#4:227\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n*L\n212#1:220\n212#1:221,3\n213#1:224,2\n213#1:227\n*E\n"})
public final class mgc<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ConcurrentHashMap<List<qp8>, v7e<lp8<T>>> f60969a = new ConcurrentHashMap<>();

    @yfb
    /* JADX INFO: renamed from: computeIfAbsent-gIAlu-s, reason: not valid java name */
    public final Object m30995computeIfAbsentgIAlus(@yfb List<? extends mp8> list, @yfb ny6<? extends lp8<T>> ny6Var) {
        Object objM32723constructorimpl;
        md8.checkNotNullParameter(list, "types");
        md8.checkNotNullParameter(ny6Var, "producer");
        List<? extends mp8> list2 = list;
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new qp8((mp8) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = this.f60969a;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                v7e.C13927a c13927a = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(ny6Var.invoke());
            } catch (Throwable th) {
                v7e.C13927a c13927a2 = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
            }
            v7e v7eVarM32722boximpl = v7e.m32722boximpl(objM32723constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, v7eVarM32722boximpl);
            obj = objPutIfAbsent == null ? v7eVarM32722boximpl : objPutIfAbsent;
        }
        md8.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((v7e) obj).m32732unboximpl();
    }
}
