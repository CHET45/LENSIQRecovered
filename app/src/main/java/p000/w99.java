package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nListUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n1#1,86:1\n33#1,6:87\n*S KotlinDebug\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n55#1:87,6\n*E\n"})
public final class w99 {
    public static final <T> void fastForEach(@yfb List<? extends T> list, @yfb qy6<? super T, bth> qy6Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qy6Var.invoke(list.get(i));
        }
    }

    @yfb
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@yfb List<? extends T> list, @yfb C c, @yfb qy6<? super T, ? extends R> qy6Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(qy6Var.invoke(list.get(i)));
        }
        return c;
    }

    @yfb
    public static final <T, R> List<R> fastZipWithNext(@yfb List<? extends T> list, @yfb gz6<? super T, ? super T, ? extends R> gz6Var) {
        if (list.size() == 0 || list.size() == 1) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        InterfaceC0000a interfaceC0000a = list.get(0);
        int lastIndex = l82.getLastIndex(list);
        while (i < lastIndex) {
            i++;
            T t = list.get(i);
            arrayList.add(gz6Var.invoke(interfaceC0000a, t));
            interfaceC0000a = t;
        }
        return arrayList;
    }
}
