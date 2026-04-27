package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public class t70 extends s70 {
    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @xn8(name = "contentDeepEquals")
    @yjd
    public static final <T> boolean contentDeepEquals(@gib T[] tArr, @gib T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            Object[] objArr = tArr[i];
            Object[] objArr2 = tArr2[i];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!contentDeepEquals(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof hoh) && (objArr2 instanceof hoh)) {
                    if (!foh.m28966contentEqualskV0jMPg(((hoh) objArr).m30097unboximpl(), ((hoh) objArr2).m30097unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof jqh) && (objArr2 instanceof jqh)) {
                    if (!foh.m28964contentEqualsFGO6Aew(((jqh) objArr).m30560unboximpl(), ((jqh) objArr2).m30560unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof fph) && (objArr2 instanceof fph)) {
                    if (!foh.m28965contentEqualsKJPZfPQ(((fph) objArr).m29599unboximpl(), ((fph) objArr2).m29599unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof pph) && (objArr2 instanceof pph)) {
                    if (!foh.m28967contentEqualslec5QzE(((pph) objArr).m31852unboximpl(), ((pph) objArr2).m31852unboximpl())) {
                        return false;
                    }
                } else if (!md8.areEqual(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @jjf(version = "1.3")
    @xn8(name = "contentDeepToString")
    @yjd
    @yfb
    public static final <T> String contentDeepToString(@gib T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((kpd.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new ArrayList());
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append(C4584d2.f28242k);
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb, list);
                bth bthVar = bth.f14751a;
            } else if (objArr instanceof byte[]) {
                String string = Arrays.toString((byte[]) objArr);
                md8.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(string);
            } else if (objArr instanceof short[]) {
                String string2 = Arrays.toString((short[]) objArr);
                md8.checkNotNullExpressionValue(string2, "toString(...)");
                sb.append(string2);
            } else if (objArr instanceof int[]) {
                String string3 = Arrays.toString((int[]) objArr);
                md8.checkNotNullExpressionValue(string3, "toString(...)");
                sb.append(string3);
            } else if (objArr instanceof long[]) {
                String string4 = Arrays.toString((long[]) objArr);
                md8.checkNotNullExpressionValue(string4, "toString(...)");
                sb.append(string4);
            } else if (objArr instanceof float[]) {
                String string5 = Arrays.toString((float[]) objArr);
                md8.checkNotNullExpressionValue(string5, "toString(...)");
                sb.append(string5);
            } else if (objArr instanceof double[]) {
                String string6 = Arrays.toString((double[]) objArr);
                md8.checkNotNullExpressionValue(string6, "toString(...)");
                sb.append(string6);
            } else if (objArr instanceof char[]) {
                String string7 = Arrays.toString((char[]) objArr);
                md8.checkNotNullExpressionValue(string7, "toString(...)");
                sb.append(string7);
            } else if (objArr instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) objArr);
                md8.checkNotNullExpressionValue(string8, "toString(...)");
                sb.append(string8);
            } else if (objArr instanceof hoh) {
                sb.append(foh.m28972contentToString2csIQuQ(((hoh) objArr).m30097unboximpl()));
            } else if (objArr instanceof jqh) {
                sb.append(foh.m28974contentToStringd6D3K8(((jqh) objArr).m30560unboximpl()));
            } else if (objArr instanceof fph) {
                sb.append(foh.m28973contentToStringXUkPCBk(((fph) objArr).m29599unboximpl()));
            } else if (objArr instanceof pph) {
                sb.append(foh.m28975contentToStringuLth9ew(((pph) objArr).m31852unboximpl()));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(C4584d2.f28243l);
        list.remove(l82.getLastIndex(list));
    }

    @yfb
    public static final <T> List<T> flatten(@yfb T[][] tArr) {
        md8.checkNotNullParameter(tArr, "<this>");
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length);
        for (T[] tArr3 : tArr) {
            q82.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lny6<+TR;>;)TR; */
    @jjf(version = "1.3")
    @t28
    private static final Object ifEmpty(Object[] objArr, ny6 ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        return objArr.length == 0 ? ny6Var.invoke() : objArr;
    }

    @jjf(version = "1.3")
    @t28
    private static final boolean isNullOrEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    @yfb
    public static final <T, R> scc<List<T>, List<R>> unzip(@yfb scc<? extends T, ? extends R>[] sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "<this>");
        ArrayList arrayList = new ArrayList(sccVarArr.length);
        ArrayList arrayList2 = new ArrayList(sccVarArr.length);
        for (scc<? extends T, ? extends R> sccVar : sccVarArr) {
            arrayList.add(sccVar.getFirst());
            arrayList2.add(sccVar.getSecond());
        }
        return vkh.m24050to(arrayList, arrayList2);
    }
}
