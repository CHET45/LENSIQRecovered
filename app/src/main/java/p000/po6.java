package p000;

import java.util.ArrayList;
import java.util.List;
import p000.jp6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n102#1,34:190\n102#1,34:235\n108#1,28:280\n108#1,28:319\n235#2,3:167\n33#2,4:170\n238#2,2:174\n38#2:176\n240#2:177\n235#2,3:178\n33#2,4:181\n238#2,2:185\n38#2:187\n240#2:188\n235#2,3:224\n33#2,4:227\n238#2,2:231\n38#2:233\n240#2:234\n235#2,3:269\n33#2,4:272\n238#2,2:276\n38#2:278\n240#2:279\n235#2,3:308\n33#2,4:311\n238#2,2:315\n38#2:317\n240#2:318\n235#2,3:347\n33#2,4:350\n238#2,2:354\n38#2:356\n240#2:357\n235#2,3:358\n33#2,4:361\n238#2,2:365\n38#2:367\n240#2:368\n235#2,3:369\n33#2,4:372\n238#2,2:376\n38#2:378\n240#2:379\n1#3:189\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:190,34\n71#1:235,34\n80#1:280,28\n87#1:319,28\n49#1:167,3\n49#1:170,4\n49#1:174,2\n49#1:176\n49#1:177\n57#1:178,3\n57#1:181,4\n57#1:185,2\n57#1:187\n57#1:188\n65#1:224,3\n65#1:227,4\n65#1:231,2\n65#1:233\n65#1:234\n71#1:269,3\n71#1:272,4\n71#1:276,2\n71#1:278\n71#1:279\n80#1:308,3\n80#1:311,4\n80#1:315,2\n80#1:317\n80#1:318\n87#1:347,3\n87#1:350,4\n87#1:354,2\n87#1:356\n87#1:357\n135#1:358,3\n135#1:361,4\n135#1:365,2\n135#1:367\n135#1:368\n135#1:369,3\n135#1:372,4\n135#1:376,2\n135#1:378\n135#1:379\n*E\n"})
@e0g(parameters = 1)
public final class po6 {

    /* JADX INFO: renamed from: a */
    public static final int f71538a = 0;

    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(po6 po6Var, List list, jp6 jp6Var, boolean z, jp6 jp6Var2, jp6 jp6Var3, int i, Object obj) {
        jp6 jp6Var4 = null;
        if ((i & 4) != 0) {
            jp6Var2 = null;
        }
        if ((i & 8) != 0) {
            jp6Var3 = null;
        }
        int size = list.size();
        int i2 = 0;
        jp6 jp6Var5 = null;
        while (true) {
            if (i2 >= size) {
                break;
            }
            jp6 weight = ((xn6) list.get(i2)).getWeight();
            if ((jp6Var2 == null || weight.compareTo(jp6Var2) >= 0) && (jp6Var3 == null || weight.compareTo(jp6Var3) <= 0)) {
                if (weight.compareTo(jp6Var) >= 0) {
                    if (weight.compareTo(jp6Var) <= 0) {
                        jp6Var4 = weight;
                        jp6Var5 = jp6Var4;
                        break;
                    }
                    if (jp6Var5 == null || weight.compareTo(jp6Var5) < 0) {
                        jp6Var5 = weight;
                    }
                } else if (jp6Var4 == null || weight.compareTo(jp6Var4) > 0) {
                    jp6Var4 = weight;
                }
            }
            i2++;
        }
        if (!z ? jp6Var5 != null : jp6Var4 == null) {
            jp6Var4 = jp6Var5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Object obj2 = list.get(i3);
            if (md8.areEqual(((xn6) obj2).getWeight(), jp6Var4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @yfb
    public final List<xn6> filterByClosestWeight$ui_text_release(@yfb List<? extends xn6> list, @yfb jp6 jp6Var, boolean z, @gib jp6 jp6Var2, @gib jp6 jp6Var3) {
        int size = list.size();
        jp6 jp6Var4 = null;
        jp6 jp6Var5 = null;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            jp6 weight = list.get(i).getWeight();
            if ((jp6Var2 == null || weight.compareTo(jp6Var2) >= 0) && (jp6Var3 == null || weight.compareTo(jp6Var3) <= 0)) {
                if (weight.compareTo(jp6Var) >= 0) {
                    if (weight.compareTo(jp6Var) <= 0) {
                        jp6Var4 = weight;
                        jp6Var5 = jp6Var4;
                        break;
                    }
                    if (jp6Var5 == null || weight.compareTo(jp6Var5) < 0) {
                        jp6Var5 = weight;
                    }
                } else if (jp6Var4 == null || weight.compareTo(jp6Var4) > 0) {
                    jp6Var4 = weight;
                }
            }
            i++;
        }
        if (!z ? jp6Var5 != null : jp6Var4 == null) {
            jp6Var4 = jp6Var5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            xn6 xn6Var = list.get(i2);
            if (md8.areEqual(xn6Var.getWeight(), jp6Var4)) {
                arrayList.add(xn6Var);
            }
        }
        return arrayList;
    }

    @yfb
    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<xn6> m31831matchFontRetOiIg(@yfb do6 do6Var, @yfb jp6 jp6Var, int i) {
        if (do6Var instanceof lo6) {
            return m31833matchFontRetOiIg((lo6) do6Var, jp6Var, i);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @yfb
    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<xn6> m31833matchFontRetOiIg(@yfb lo6 lo6Var, @yfb jp6 jp6Var, int i) {
        return m31832matchFontRetOiIg(lo6Var.getFonts(), jp6Var, i);
    }

    @yfb
    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<xn6> m31832matchFontRetOiIg(@yfb List<? extends xn6> list, @yfb jp6 jp6Var, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            xn6 xn6Var = list.get(i3);
            xn6 xn6Var2 = xn6Var;
            if (md8.areEqual(xn6Var2.getWeight(), jp6Var) && fp6.m29575equalsimpl0(xn6Var2.mo30175getStyle_LCdwA(), i)) {
                arrayList.add(xn6Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            xn6 xn6Var3 = list.get(i4);
            if (fp6.m29575equalsimpl0(xn6Var3.mo30175getStyle_LCdwA(), i)) {
                arrayList2.add(xn6Var3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List<? extends xn6> list2 = list;
        jp6.C8003a c8003a = jp6.f51403b;
        jp6 jp6Var2 = null;
        if (jp6Var.compareTo(c8003a.getW400()) < 0) {
            int size3 = list2.size();
            jp6 jp6Var3 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                jp6 weight = list2.get(i5).getWeight();
                if (weight.compareTo(jp6Var) < 0) {
                    if (jp6Var2 == null || weight.compareTo(jp6Var2) > 0) {
                        jp6Var2 = weight;
                    }
                } else {
                    if (weight.compareTo(jp6Var) <= 0) {
                        jp6Var3 = weight;
                        jp6Var2 = jp6Var3;
                        break;
                    }
                    if (jp6Var3 == null || weight.compareTo(jp6Var3) < 0) {
                        jp6Var3 = weight;
                    }
                }
                i5++;
            }
            if (jp6Var2 != null) {
                jp6Var3 = jp6Var2;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i2 < size4) {
                xn6 xn6Var4 = list2.get(i2);
                if (md8.areEqual(xn6Var4.getWeight(), jp6Var3)) {
                    arrayList3.add(xn6Var4);
                }
                i2++;
            }
            return arrayList3;
        }
        if (jp6Var.compareTo(c8003a.getW500()) > 0) {
            int size5 = list2.size();
            jp6 jp6Var4 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    break;
                }
                jp6 weight2 = list2.get(i6).getWeight();
                if (weight2.compareTo(jp6Var) < 0) {
                    if (jp6Var2 == null || weight2.compareTo(jp6Var2) > 0) {
                        jp6Var2 = weight2;
                    }
                } else {
                    if (weight2.compareTo(jp6Var) <= 0) {
                        jp6Var4 = weight2;
                        jp6Var2 = jp6Var4;
                        break;
                    }
                    if (jp6Var4 == null || weight2.compareTo(jp6Var4) < 0) {
                        jp6Var4 = weight2;
                    }
                }
                i6++;
            }
            if (jp6Var4 == null) {
                jp6Var4 = jp6Var2;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i2 < size6) {
                xn6 xn6Var5 = list2.get(i2);
                if (md8.areEqual(xn6Var5.getWeight(), jp6Var4)) {
                    arrayList4.add(xn6Var5);
                }
                i2++;
            }
            return arrayList4;
        }
        jp6 w500 = c8003a.getW500();
        int size7 = list2.size();
        jp6 jp6Var5 = null;
        jp6 jp6Var6 = null;
        int i7 = 0;
        while (true) {
            if (i7 >= size7) {
                break;
            }
            jp6 weight3 = list2.get(i7).getWeight();
            if (w500 == null || weight3.compareTo(w500) <= 0) {
                if (weight3.compareTo(jp6Var) < 0) {
                    if (jp6Var5 == null || weight3.compareTo(jp6Var5) > 0) {
                        jp6Var5 = weight3;
                    }
                } else {
                    if (weight3.compareTo(jp6Var) <= 0) {
                        jp6Var5 = weight3;
                        jp6Var6 = jp6Var5;
                        break;
                    }
                    if (jp6Var6 == null || weight3.compareTo(jp6Var6) < 0) {
                        jp6Var6 = weight3;
                    }
                }
            }
            i7++;
        }
        if (jp6Var6 != null) {
            jp6Var5 = jp6Var6;
        }
        ArrayList arrayList5 = new ArrayList(list2.size());
        int size8 = list2.size();
        for (int i8 = 0; i8 < size8; i8++) {
            xn6 xn6Var6 = list2.get(i8);
            if (md8.areEqual(xn6Var6.getWeight(), jp6Var5)) {
                arrayList5.add(xn6Var6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        jp6 w5002 = jp6.f51403b.getW500();
        int size9 = list2.size();
        jp6 jp6Var7 = null;
        int i9 = 0;
        while (true) {
            if (i9 >= size9) {
                break;
            }
            jp6 weight4 = list2.get(i9).getWeight();
            if (w5002 == null || weight4.compareTo(w5002) >= 0) {
                if (weight4.compareTo(jp6Var) < 0) {
                    if (jp6Var2 == null || weight4.compareTo(jp6Var2) > 0) {
                        jp6Var2 = weight4;
                    }
                } else {
                    if (weight4.compareTo(jp6Var) <= 0) {
                        jp6Var2 = weight4;
                        jp6Var7 = jp6Var2;
                        break;
                    }
                    if (jp6Var7 == null || weight4.compareTo(jp6Var7) < 0) {
                        jp6Var7 = weight4;
                    }
                }
            }
            i9++;
        }
        if (jp6Var7 != null) {
            jp6Var2 = jp6Var7;
        }
        ArrayList arrayList6 = new ArrayList(list2.size());
        int size10 = list2.size();
        while (i2 < size10) {
            xn6 xn6Var7 = list2.get(i2);
            if (md8.areEqual(xn6Var7.getWeight(), jp6Var2)) {
                arrayList6.add(xn6Var7);
            }
            i2++;
        }
        return arrayList6;
    }
}
