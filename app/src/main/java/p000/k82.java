package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public class k82 {
    @jjf(version = "1.3")
    @yfb
    @yjd
    public static <E> List<E> build(@yfb List<E> list) {
        md8.checkNotNullParameter(list, "builder");
        return ((h89) list).build();
    }

    @jjf(version = "1.3")
    @t28
    @yjd
    private static final <E> List<E> buildListInternal(qy6<? super List<E>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        List listCreateListBuilder = createListBuilder();
        qy6Var.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    @jjf(version = "1.3")
    @t28
    @yjd
    private static final int checkCountOverflow(int i) {
        if (i < 0) {
            if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                throw new ArithmeticException("Count overflow has happened.");
            }
            l82.throwCountOverflow();
        }
        return i;
    }

    @jjf(version = "1.3")
    @t28
    @yjd
    private static final int checkIndexOverflow(int i) {
        if (i < 0) {
            if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            l82.throwIndexOverflow();
        }
        return i;
    }

    @t28
    private static final Object[] collectionToArray(Collection<?> collection) {
        md8.checkNotNullParameter(collection, "collection");
        return f82.toArray(collection);
    }

    @yfb
    public static final <T> Object[] copyToArrayOfAny(@yfb T[] tArr, boolean z) {
        md8.checkNotNullParameter(tArr, "<this>");
        if (z && md8.areEqual(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @jjf(version = "1.3")
    @yfb
    @yjd
    public static <E> List<E> createListBuilder() {
        return new h89(0, 1, null);
    }

    @yfb
    public static <T> List<T> listOf(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        md8.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @jjf(version = "1.2")
    @yfb
    public static <T> List<T> shuffled(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        List<T> mutableList = v82.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    @yfb
    public static <T> T[] terminateCollectionToArray(int i, @yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }

    @t28
    private static final <T> List<T> toList(Enumeration<T> enumeration) {
        md8.checkNotNullParameter(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        md8.checkNotNullExpressionValue(list, "list(...)");
        return list;
    }

    @jjf(version = "1.3")
    @t28
    @yjd
    private static final <E> List<E> buildListInternal(int i, qy6<? super List<E>, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        List listCreateListBuilder = createListBuilder(i);
        qy6Var.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    @t28
    private static final <T> T[] collectionToArray(Collection<?> collection, T[] tArr) {
        md8.checkNotNullParameter(collection, "collection");
        md8.checkNotNullParameter(tArr, "array");
        return (T[]) f82.toArray(collection, tArr);
    }

    @jjf(version = "1.3")
    @yfb
    @yjd
    public static <E> List<E> createListBuilder(int i) {
        return new h89(i);
    }

    @jjf(version = "1.2")
    @yfb
    public static final <T> List<T> shuffled(@yfb Iterable<? extends T> iterable, @yfb Random random) {
        md8.checkNotNullParameter(iterable, "<this>");
        md8.checkNotNullParameter(random, "random");
        List<T> mutableList = v82.toMutableList(iterable);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }
}
