package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n33#1,6:239\n33#1,6:245\n33#1,6:251\n33#1,6:257\n33#1,4:263\n38#1:274\n33#1,4:275\n38#1:280\n64#1,6:281\n361#2,7:267\n1#3:279\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:239,6\n84#1:245,6\n94#1:251,6\n111#1:257,6\n122#1:263,4\n122#1:274\n213#1:275,4\n213#1:280\n233#1:281,6\n124#1:267,7\n*E\n"})
public final class v99 {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t, qy6<? super T, ? extends CharSequence> qy6Var) throws IOException {
        if (qy6Var != null) {
            appendable.append(qy6Var.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    public static final <T> boolean fastAll(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!qy6Var.invoke(list.get(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (qy6Var.invoke(list.get(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public static final <T> List<T> fastFilterIndexed(@yfb List<? extends T> list, @yfb gz6<? super Integer, ? super T, Boolean> gz6Var) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (gz6Var.invoke(Integer.valueOf(i), t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> void fastForEach(@yfb List<? extends T> list, @yfb qy6<? super T, bth> qy6Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qy6Var.invoke(list.get(i));
        }
    }

    public static final <T> void fastForEachIndexed(@yfb List<? extends T> list, @yfb gz6<? super Integer, ? super T, bth> gz6Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gz6Var.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    @yfb
    public static final <T, K> Map<K, List<T>> fastGroupBy(@yfb List<? extends T> list, @yfb qy6<? super T, ? extends K> qy6Var) {
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            K kInvoke = qy6Var.invoke(t);
            Object arrayList = map.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(kInvoke, arrayList);
            }
            ((ArrayList) arrayList).add(t);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6<? super T, ? extends CharSequence> qy6Var) throws IOException {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            appendElement(a, t, qy6Var);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @yfb
    public static final <T> String fastJoinToString(@yfb List<? extends T> list, @yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super T, ? extends CharSequence> qy6Var) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, qy6Var)).toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return fastJoinToString(list, charSequence, charSequence5, charSequence6, i3, charSequence7, qy6Var);
    }

    @yfb
    public static final <T, R> List<R> fastMap(@yfb List<? extends T> list, @yfb qy6<? super T, ? extends R> qy6Var) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(qy6Var.invoke(list.get(i)));
        }
        return arrayList;
    }

    @yfb
    public static final <T, R> List<R> fastMapNotNull(@yfb List<? extends T> list, @yfb qy6<? super T, ? extends R> qy6Var) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            R rInvoke = qy6Var.invoke(list.get(i));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @yfb
    public static final <T> Set<T> fastToSet(@yfb List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(list.get(i));
        }
        return hashSet;
    }
}
