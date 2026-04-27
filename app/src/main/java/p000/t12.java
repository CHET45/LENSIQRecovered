package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n1#3:234\n212#4:225\n213#4:230\n214#4:233\n1557#5:226\n1628#5,3:227\n72#6,2:231\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n128#1:220,3\n128#1:224\n128#1:223\n129#1:234\n129#1:225\n129#1:230\n129#1:233\n129#1:226\n129#1:227,3\n129#1:231,2\n*E\n"})
public final class t12<T> implements ngc<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final gz6<oo8<Object>, List<? extends mp8>, lp8<T>> f83339a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final u12<mgc<T>> f83340b;

    /* JADX INFO: renamed from: t12$a */
    @dwf({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n1#1,89:1\n128#2:90\n*E\n"})
    public static final class C12844a implements ny6<T> {
        @Override // p000.ny6
        public final T invoke() {
            return (T) new mgc();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t12(@yfb gz6<? super oo8<Object>, ? super List<? extends mp8>, ? extends lp8<T>> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "compute");
        this.f83339a = gz6Var;
        this.f83340b = new u12<>();
    }

    @Override // p000.ngc
    @yfb
    /* JADX INFO: renamed from: get-gIAlu-s */
    public Object mo30879getgIAlus(@yfb oo8<Object> oo8Var, @yfb List<? extends mp8> list) {
        Object objM32723constructorimpl;
        md8.checkNotNullParameter(oo8Var, "key");
        md8.checkNotNullParameter(list, "types");
        Object obj = this.f83340b.get(hn8.getJavaClass((oo8) oo8Var));
        md8.checkNotNullExpressionValue(obj, "get(...)");
        x6b x6bVar = (x6b) obj;
        T t = x6bVar.f96896a.get();
        if (t == null) {
            t = (T) x6bVar.getOrSetWithLock(new C12844a());
        }
        mgc mgcVar = t;
        List<? extends mp8> list2 = list;
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new qp8((mp8) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = mgcVar.f60969a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                v7e.C13927a c13927a = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(this.f83339a.invoke(oo8Var, list));
            } catch (Throwable th) {
                v7e.C13927a c13927a2 = v7e.f90266b;
                objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
            }
            v7e v7eVarM32722boximpl = v7e.m32722boximpl(objM32723constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, v7eVarM32722boximpl);
            obj2 = objPutIfAbsent == null ? v7eVarM32722boximpl : objPutIfAbsent;
        }
        md8.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((v7e) obj2).m32732unboximpl();
    }
}
