package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n33#1,6:596\n33#1,6:602\n33#1,6:608\n33#1,6:614\n33#1,6:620\n33#1,6:626\n33#1,6:632\n33#1,6:638\n69#1,6:644\n69#1,4:650\n74#1:655\n33#1,6:656\n33#1,6:662\n33#1,6:668\n33#1,6:674\n33#1,6:680\n1#2:654\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n87#1:596,6\n102#1:602,6\n117#1:608,6\n134#1:614,6\n153#1:620,6\n201#1:626,6\n237#1:632,6\n258#1:638,6\n279#1:644,6\n300#1:650,4\n300#1:655\n418#1:656,6\n464#1:662,6\n510#1:668,6\n526#1:674,6\n545#1:680,6\n*E\n"})
public final class u99 {
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
    public static final <T, K> List<T> fastDistinctBy(@yfb List<? extends T> list, @yfb qy6<? super T, ? extends K> qy6Var) {
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (hashSet.add(qy6Var.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static final <T> List<T> fastFilter(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (qy6Var.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @yfb
    public static final <T> List<T> fastFilterNotNull(@yfb List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirst(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @gib
    public static final <T> T fastFirstOrNull(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @yfb
    public static final <T, R> List<R> fastFlatMap(@yfb List<? extends T> list, @yfb qy6<? super T, ? extends Iterable<? extends R>> qy6Var) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            q82.addAll(arrayList, qy6Var.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(@yfb List<? extends T> list, R r, @yfb gz6<? super R, ? super T, ? extends R> gz6Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r = gz6Var.invoke(r, list.get(i));
        }
        return r;
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

    public static final <T> void fastForEachReversed(@yfb List<? extends T> list, @yfb qy6<? super T, bth> qy6Var) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            qy6Var.invoke(list.get(size));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
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

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @gib
    public static final <T> T fastLastOrNull(@yfb List<? extends T> list, @yfb qy6<? super T, Boolean> qy6Var) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            T t = list.get(size);
            if (qy6Var.invoke(t).booleanValue()) {
                return t;
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
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
    public static final <T, R> List<R> fastMapIndexed(@yfb List<? extends T> list, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(gz6Var.invoke(Integer.valueOf(i), list.get(i)));
        }
        return arrayList;
    }

    @yfb
    public static final <T, R> List<R> fastMapIndexedNotNull(@yfb List<? extends T> list, @yfb gz6<? super Integer, ? super T, ? extends R> gz6Var) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            R rInvoke = gz6Var.invoke(Integer.valueOf(i), list.get(i));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
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
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@yfb List<? extends T> list, @yfb C c, @yfb qy6<? super T, ? extends R> qy6Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(qy6Var.invoke(list.get(i)));
        }
        return c;
    }

    @gib
    public static final <T, R extends Comparable<? super R>> T fastMaxBy(@yfb List<? extends T> list, @yfb qy6<? super T, ? extends R> qy6Var) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        R rInvoke = qy6Var.invoke(t);
        int lastIndex = l82.getLastIndex(list);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = list.get(i);
                R rInvoke2 = qy6Var.invoke(t2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t = t2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (T) t;
    }

    @gib
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(@yfb List<? extends T> list, @yfb qy6<? super T, ? extends R> qy6Var) {
        if (list.isEmpty()) {
            return null;
        }
        R rInvoke = qy6Var.invoke(list.get(0));
        int lastIndex = l82.getLastIndex(list);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = qy6Var.invoke(list.get(i));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return rInvoke;
    }

    @gib
    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(@yfb List<? extends T> list, @yfb qy6<? super T, ? extends R> qy6Var) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        R rInvoke = qy6Var.invoke(t);
        int lastIndex = l82.getLastIndex(list);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t2 = list.get(i);
                R rInvoke2 = qy6Var.invoke(t2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t = t2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return (T) t;
    }

    public static final <S, T extends S> S fastReduce(@yfb List<? extends T> list, @yfb gz6<? super S, ? super T, ? extends S> gz6Var) {
        if (list.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S sInvoke = (Object) v82.first((List) list);
        int lastIndex = l82.getLastIndex(list);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = gz6Var.invoke(sInvoke, list.get(i));
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sInvoke;
    }

    public static final <T> int fastSumBy(@yfb List<? extends T> list, @yfb qy6<? super T, Integer> qy6Var) {
        int size = list.size();
        int iIntValue = 0;
        for (int i = 0; i < size; i++) {
            iIntValue += qy6Var.invoke(list.get(i)).intValue();
        }
        return iIntValue;
    }

    @yfb
    public static final <T, R, V> List<V> fastZip(@yfb List<? extends T> list, @yfb List<? extends R> list2, @yfb gz6<? super T, ? super R, ? extends V> gz6Var) {
        int iMin = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(gz6Var.invoke(list.get(i), list2.get(i)));
        }
        return arrayList;
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
