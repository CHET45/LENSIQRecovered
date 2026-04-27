package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n37#3,2:192\n1797#4,3:194\n*S KotlinDebug\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n74#1:192,2\n160#1:194,3\n*E\n"})
public final class hyc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final f0f[] f45262a = new f0f[0];

    @yfb
    public static final Set<String> cachedSerialNames(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        if (f0fVar instanceof xm1) {
            return ((xm1) f0fVar).getSerialNames();
        }
        HashSet hashSet = new HashSet(f0fVar.getElementsCount());
        int elementsCount = f0fVar.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            hashSet.add(f0fVar.getElementName(i));
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    @yjd
    public static final <T> t74<T> cast(@yfb t74<?> t74Var) {
        md8.checkNotNullParameter(t74Var, "<this>");
        return t74Var;
    }

    @yfb
    public static final f0f[] compactArray(@gib List<? extends f0f> list) {
        f0f[] f0fVarArr;
        List<? extends f0f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (f0fVarArr = (f0f[]) list.toArray(new f0f[0])) == null) ? f45262a : f0fVarArr;
    }

    public static final <T, K> int elementsHashCodeBy(@yfb Iterable<? extends T> iterable, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            int i = iHashCode * 31;
            K kInvoke = qy6Var.invoke(it.next());
            iHashCode = i + (kInvoke != null ? kInvoke.hashCode() : 0);
        }
        return iHashCode;
    }

    @yfb
    public static final oo8<Object> kclass(@yfb mp8 mp8Var) {
        md8.checkNotNullParameter(mp8Var, "<this>");
        ro8 classifier = mp8Var.getClassifier();
        if (classifier instanceof oo8) {
            return (oo8) classifier;
        }
        if (!(classifier instanceof op8)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + a18.f100c);
    }

    @yfb
    public static final String notRegisteredMessage(@yfb oo8<?> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        String simpleName = oo8Var.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return notRegisteredMessage(simpleName);
    }

    @yfb
    public static final Void serializerNotRegistered(@yfb oo8<?> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        throw new d1f(notRegisteredMessage(oo8Var));
    }

    @yfb
    public static final mp8 typeOrThrow(@yfb pp8 pp8Var) {
        md8.checkNotNullParameter(pp8Var, "<this>");
        mp8 type = pp8Var.getType();
        if (type != null) {
            return type;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + pp8Var.getType()).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    @yjd
    public static final <T> lp8<T> cast(@yfb lp8<?> lp8Var) {
        md8.checkNotNullParameter(lp8Var, "<this>");
        return lp8Var;
    }

    @yfb
    public static final String notRegisteredMessage(@yfb String str) {
        md8.checkNotNullParameter(str, "className");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    @yjd
    public static final <T> e1f<T> cast(@yfb e1f<?> e1fVar) {
        md8.checkNotNullParameter(e1fVar, "<this>");
        return e1fVar;
    }
}
