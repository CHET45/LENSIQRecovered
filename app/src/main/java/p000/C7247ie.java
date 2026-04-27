package p000;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: ie */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nActual.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,54:1\n6442#2:55\n33#3,6:56\n*S KotlinDebug\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n*L\n38#1:55\n39#1:56,6\n*E\n"})
public final class C7247ie {

    /* JADX INFO: renamed from: ie$a */
    @dwf({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n*L\n1#1,328:1\n38#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return md2.compareValues(((Field) t).getName(), ((Field) t2).getName());
        }
    }

    public static final boolean areObjectsOfSameType(@yfb Object obj, @yfb Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    @yfb
    public static final Object classKeyForObject(@yfb Object obj) {
        return obj.getClass();
    }

    public static final void tryPopulateReflectively(@yfb f58 f58Var, @yfb sxa<?> sxaVar) {
        List listSortedWith = e80.sortedWith(sxaVar.getClass().getDeclaredFields(), new a());
        int size = listSortedWith.size();
        for (int i = 0; i < size; i++) {
            Field field = (Field) listSortedWith.get(i);
            if (!field.getDeclaringClass().isAssignableFrom(sxa.class)) {
                try {
                    field.setAccessible(true);
                    f58Var.getProperties().set(field.getName(), field.get(sxaVar));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
