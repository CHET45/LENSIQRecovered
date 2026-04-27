package p000;

import androidx.compose.p002ui.layout.C0753f;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,167:1\n151#2,3:168\n33#2,4:171\n154#2,2:175\n38#2:177\n156#2:178\n151#2,3:179\n33#2,4:182\n154#2,2:186\n38#2:188\n156#2:189\n151#2,3:190\n33#2,4:193\n154#2,2:197\n38#2:199\n156#2:200\n151#2,3:201\n33#2,4:204\n154#2,2:208\n38#2:210\n156#2:211\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n106#1:168,3\n106#1:171,4\n106#1:175,2\n106#1:177\n106#1:178\n124#1:179,3\n124#1:182,4\n124#1:186,2\n124#1:188\n124#1:189\n141#1:190,3\n141#1:193,4\n141#1:197,2\n141#1:199\n141#1:200\n158#1:201,3\n158#1:204,4\n158#1:208,2\n158#1:210\n158#1:211\n*E\n"})
public interface uba {

    /* JADX INFO: renamed from: uba$a */
    public static final class C13460a {
        @Deprecated
        public static int maxIntrinsicHeight(@yfb uba ubaVar, @yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
            return uba.super.maxIntrinsicHeight(gd8Var, list, i);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@yfb uba ubaVar, @yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
            return uba.super.maxIntrinsicWidth(gd8Var, list, i);
        }

        @Deprecated
        public static int minIntrinsicHeight(@yfb uba ubaVar, @yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
            return uba.super.minIntrinsicHeight(gd8Var, list, i);
        }

        @Deprecated
        public static int minIntrinsicWidth(@yfb uba ubaVar, @yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
            return uba.super.minIntrinsicWidth(gd8Var, list, i);
        }
    }

    default int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dw3(list.get(i2), hd8.Max, kd8.Height));
        }
        return mo27228measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), arrayList, nu2.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dw3(list.get(i2), hd8.Max, kd8.Width));
        }
        return mo27228measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), arrayList, nu2.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j);

    default int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dw3(list.get(i2), hd8.Min, kd8.Height));
        }
        return mo27228measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), arrayList, nu2.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dw3(list.get(i2), hd8.Min, kd8.Width));
        }
        return mo27228measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), arrayList, nu2.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }
}
