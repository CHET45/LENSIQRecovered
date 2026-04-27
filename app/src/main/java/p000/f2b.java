package p000;

import androidx.compose.p002ui.layout.C0753f;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nMultiContentMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,240:1\n151#2,3:241\n33#2,4:244\n154#2:248\n151#2,3:249\n33#2,4:252\n154#2,2:256\n38#2:258\n156#2:259\n155#2:260\n38#2:261\n156#2:262\n151#2,3:263\n33#2,4:266\n154#2:270\n151#2,3:271\n33#2,4:274\n154#2,2:278\n38#2:280\n156#2:281\n155#2:282\n38#2:283\n156#2:284\n151#2,3:285\n33#2,4:288\n154#2:292\n151#2,3:293\n33#2,4:296\n154#2,2:300\n38#2:302\n156#2:303\n155#2:304\n38#2:305\n156#2:306\n151#2,3:307\n33#2,4:310\n154#2:314\n151#2,3:315\n33#2,4:318\n154#2,2:322\n38#2:324\n156#2:325\n155#2:326\n38#2:327\n156#2:328\n*S KotlinDebug\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n*L\n112#1:241,3\n112#1:244,4\n112#1:248\n113#1:249,3\n113#1:252,4\n113#1:256,2\n113#1:258\n113#1:259\n112#1:260\n112#1:261\n112#1:262\n137#1:263,3\n137#1:266,4\n137#1:270\n138#1:271,3\n138#1:274,4\n138#1:278,2\n138#1:280\n138#1:281\n137#1:282\n137#1:283\n137#1:284\n161#1:285,3\n161#1:288,4\n161#1:292\n162#1:293,3\n162#1:296,4\n162#1:300,2\n162#1:302\n162#1:303\n161#1:304\n161#1:305\n161#1:306\n185#1:307,3\n185#1:310,4\n185#1:314\n186#1:315,3\n186#1:318,4\n186#1:322,2\n186#1:324\n186#1:325\n185#1:326\n185#1:327\n185#1:328\n*E\n"})
public interface f2b {
    default int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends List<? extends ed8>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<? extends ed8> list2 = list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new dw3(list2.get(i3), hd8.Max, kd8.Height));
            }
            arrayList.add(arrayList2);
        }
        return mo27453measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), arrayList, nu2.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends List<? extends ed8>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<? extends ed8> list2 = list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new dw3(list2.get(i3), hd8.Max, kd8.Width));
            }
            arrayList.add(arrayList2);
        }
        return mo27453measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), arrayList, nu2.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    vba mo27453measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends List<? extends rba>> list, long j);

    default int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends List<? extends ed8>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<? extends ed8> list2 = list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new dw3(list2.get(i3), hd8.Min, kd8.Height));
            }
            arrayList.add(arrayList2);
        }
        return mo27453measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), arrayList, nu2.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends List<? extends ed8>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<? extends ed8> list2 = list.get(i2);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new dw3(list2.get(i3), hd8.Min, kd8.Width));
            }
            arrayList.add(arrayList2);
        }
        return mo27453measure3p2s80s(new C0753f(gd8Var, gd8Var.getLayoutDirection()), arrayList, nu2.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }
}
