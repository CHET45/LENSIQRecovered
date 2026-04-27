package p000;

import java.util.ArrayList;
import java.util.List;
import p000.qjc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,419:1\n338#1,7:420\n338#1,7:427\n338#1,7:434\n338#1,7:441\n338#1,7:448\n338#1,7:455\n338#1,7:462\n338#1,7:469\n338#1,7:476\n338#1,7:483\n338#1,7:490\n338#1,7:497\n338#1,7:504\n338#1,7:511\n338#1,7:518\n338#1,7:525\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n158#1:420,7\n167#1:427,7\n171#1:434,7\n180#1:441,7\n189#1:448,7\n198#1:455,7\n207#1:462,7\n223#1:469,7\n234#1:476,7\n248#1:483,7\n262#1:490,7\n276#1:497,7\n285#1:504,7\n294#1:511,7\n303#1:518,7\n315#1:525,7\n*E\n"})
public final class sjc {

    /* JADX INFO: renamed from: A */
    public static final int f82008A = 4;

    /* JADX INFO: renamed from: B */
    public static final int f82009B = 2;

    /* JADX INFO: renamed from: C */
    public static final int f82010C = 7;

    /* JADX INFO: renamed from: a */
    public static final char f82011a = 'z';

    /* JADX INFO: renamed from: b */
    public static final char f82012b = 'Z';

    /* JADX INFO: renamed from: c */
    public static final char f82013c = 'm';

    /* JADX INFO: renamed from: d */
    public static final char f82014d = 'M';

    /* JADX INFO: renamed from: e */
    public static final char f82015e = 'l';

    /* JADX INFO: renamed from: f */
    public static final char f82016f = 'L';

    /* JADX INFO: renamed from: g */
    public static final char f82017g = 'h';

    /* JADX INFO: renamed from: h */
    public static final char f82018h = 'H';

    /* JADX INFO: renamed from: i */
    public static final char f82019i = 'v';

    /* JADX INFO: renamed from: j */
    public static final char f82020j = 'V';

    /* JADX INFO: renamed from: k */
    public static final char f82021k = 'c';

    /* JADX INFO: renamed from: l */
    public static final char f82022l = 'C';

    /* JADX INFO: renamed from: m */
    public static final char f82023m = 's';

    /* JADX INFO: renamed from: n */
    public static final char f82024n = 'S';

    /* JADX INFO: renamed from: o */
    public static final char f82025o = 'q';

    /* JADX INFO: renamed from: p */
    public static final char f82026p = 'Q';

    /* JADX INFO: renamed from: q */
    public static final char f82027q = 't';

    /* JADX INFO: renamed from: r */
    public static final char f82028r = 'T';

    /* JADX INFO: renamed from: s */
    public static final char f82029s = 'a';

    /* JADX INFO: renamed from: t */
    public static final char f82030t = 'A';

    /* JADX INFO: renamed from: u */
    public static final int f82031u = 2;

    /* JADX INFO: renamed from: v */
    public static final int f82032v = 2;

    /* JADX INFO: renamed from: w */
    public static final int f82033w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f82034x = 1;

    /* JADX INFO: renamed from: y */
    public static final int f82035y = 6;

    /* JADX INFO: renamed from: z */
    public static final int f82036z = 4;

    public static final void addPathNodes(char c, @yfb ArrayList<qjc> arrayList, @yfb float[] fArr, int i) {
        if (c == 'z' || c == 'Z') {
            arrayList.add(qjc.C11498b.f74634c);
            return;
        }
        if (c == 'm') {
            pathRelativeMoveNodeFromArgs(arrayList, fArr, i);
            return;
        }
        if (c == 'M') {
            pathMoveNodeFromArgs(arrayList, fArr, i);
            return;
        }
        int i2 = 0;
        if (c == 'l') {
            int i3 = i - 2;
            while (i2 <= i3) {
                arrayList.add(new qjc.C11509m(fArr[i2], fArr[i2 + 1]));
                i2 += 2;
            }
            return;
        }
        if (c == 'L') {
            int i4 = i - 2;
            while (i2 <= i4) {
                arrayList.add(new qjc.C11501e(fArr[i2], fArr[i2 + 1]));
                i2 += 2;
            }
            return;
        }
        if (c == 'h') {
            int i5 = i - 1;
            while (i2 <= i5) {
                arrayList.add(new qjc.C11508l(fArr[i2]));
                i2++;
            }
            return;
        }
        if (c == 'H') {
            int i6 = i - 1;
            while (i2 <= i6) {
                arrayList.add(new qjc.C11500d(fArr[i2]));
                i2++;
            }
            return;
        }
        if (c == 'v') {
            int i7 = i - 1;
            while (i2 <= i7) {
                arrayList.add(new qjc.C11514r(fArr[i2]));
                i2++;
            }
            return;
        }
        if (c == 'V') {
            int i8 = i - 1;
            while (i2 <= i8) {
                arrayList.add(new qjc.C11515s(fArr[i2]));
                i2++;
            }
            return;
        }
        if (c == 'c') {
            int i9 = i - 6;
            while (i2 <= i9) {
                arrayList.add(new qjc.C11507k(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                i2 += 6;
            }
            return;
        }
        if (c == 'C') {
            int i10 = i - 6;
            while (i2 <= i10) {
                arrayList.add(new qjc.C11499c(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                i2 += 6;
            }
            return;
        }
        if (c == 's') {
            int i11 = i - 4;
            while (i2 <= i11) {
                arrayList.add(new qjc.C11512p(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                i2 += 4;
            }
            return;
        }
        if (c == 'S') {
            int i12 = i - 4;
            while (i2 <= i12) {
                arrayList.add(new qjc.C11504h(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                i2 += 4;
            }
            return;
        }
        if (c == 'q') {
            int i13 = i - 4;
            while (i2 <= i13) {
                arrayList.add(new qjc.C11511o(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                i2 += 4;
            }
            return;
        }
        if (c == 'Q') {
            int i14 = i - 4;
            while (i2 <= i14) {
                arrayList.add(new qjc.C11503g(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                i2 += 4;
            }
            return;
        }
        if (c == 't') {
            int i15 = i - 2;
            while (i2 <= i15) {
                arrayList.add(new qjc.C11513q(fArr[i2], fArr[i2 + 1]));
                i2 += 2;
            }
            return;
        }
        if (c == 'T') {
            int i16 = i - 2;
            while (i2 <= i16) {
                arrayList.add(new qjc.C11505i(fArr[i2], fArr[i2 + 1]));
                i2 += 2;
            }
            return;
        }
        if (c == 'a') {
            int i17 = i - 7;
            for (int i18 = 0; i18 <= i17; i18 += 7) {
                arrayList.add(new qjc.C11506j(fArr[i18], fArr[i18 + 1], fArr[i18 + 2], Float.compare(fArr[i18 + 3], 0.0f) != 0, Float.compare(fArr[i18 + 4], 0.0f) != 0, fArr[i18 + 5], fArr[i18 + 6]));
            }
            return;
        }
        if (c != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c);
        }
        int i19 = i - 7;
        for (int i20 = 0; i20 <= i19; i20 += 7) {
            arrayList.add(new qjc.C11497a(fArr[i20], fArr[i20 + 1], fArr[i20 + 2], Float.compare(fArr[i20 + 3], 0.0f) != 0, Float.compare(fArr[i20 + 4], 0.0f) != 0, fArr[i20 + 5], fArr[i20 + 6]));
        }
    }

    private static final void pathMoveNodeFromArgs(List<qjc> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new qjc.C11502f(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new qjc.C11501e(fArr[i3], fArr[i3 + 1]));
            }
        }
    }

    private static final void pathNodesFromArgs(List<qjc> list, float[] fArr, int i, int i2, gz6<? super float[], ? super Integer, ? extends qjc> gz6Var) {
        int i3 = i - i2;
        int i4 = 0;
        while (i4 <= i3) {
            list.add(gz6Var.invoke(fArr, Integer.valueOf(i4)));
            i4 += i2;
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<qjc> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new qjc.C11510n(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new qjc.C11509m(fArr[i3], fArr[i3 + 1]));
            }
        }
    }
}
