package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import p000.C9041lz;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,81:1\n151#2,3:82\n33#2,4:85\n154#2,2:89\n38#2:91\n156#2:92\n151#2,3:93\n33#2,4:96\n154#2,2:100\n38#2:102\n156#2:103\n151#2,3:104\n33#2,4:107\n154#2,2:111\n38#2:113\n156#2:114\n256#2,3:115\n33#2,4:118\n259#2,2:122\n38#2:124\n261#2:125\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n45#1:82,3\n45#1:85,4\n45#1:89,2\n45#1:91\n45#1:92\n49#1:93,3\n49#1:96,4\n49#1:100,2\n49#1:102\n49#1:103\n52#1:104,3\n52#1:107,4\n52#1:111,2\n52#1:113\n52#1:114\n74#1:115,3\n74#1:118,4\n74#1:122,2\n74#1:124\n74#1:125\n*E\n"})
public final class fn8 {
    private static final void collectRangeTransitions(List<? extends C9041lz.c<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C9041lz.c<?> cVar = list.get(i);
                sortedSet.add(Integer.valueOf(cVar.getStart()));
                sortedSet.add(Integer.valueOf(cVar.getEnd()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final C9041lz transform(@yfb C9041lz c9041lz, @yfb kz6<? super String, ? super Integer, ? super Integer, String> kz6Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeSet treeSetSortedSetOf = v6f.sortedSetOf(0, Integer.valueOf(c9041lz.getText().length()));
        collectRangeTransitions(c9041lz.getSpanStylesOrNull$ui_text_release(), treeSetSortedSetOf);
        collectRangeTransitions(c9041lz.getParagraphStylesOrNull$ui_text_release(), treeSetSortedSetOf);
        collectRangeTransitions(c9041lz.getAnnotations$ui_text_release(), treeSetSortedSetOf);
        jvd.C8121h c8121h = new jvd.C8121h();
        c8121h.f52110a = "";
        Map mapMutableMapOf = xt9.mutableMapOf(vkh.m24050to(0, 0));
        v82.windowed$default(treeSetSortedSetOf, 2, 0, false, new C5894a(c8121h, kz6Var, c9041lz, mapMutableMapOf), 6, null);
        List<C9041lz.c<swf>> spanStylesOrNull$ui_text_release = c9041lz.getSpanStylesOrNull$ui_text_release();
        ArrayList arrayList3 = null;
        if (spanStylesOrNull$ui_text_release != null) {
            arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i = 0; i < size; i++) {
                C9041lz.c<swf> cVar = spanStylesOrNull$ui_text_release.get(i);
                swf item = cVar.getItem();
                Object obj = mapMutableMapOf.get(Integer.valueOf(cVar.getStart()));
                md8.checkNotNull(obj);
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = mapMutableMapOf.get(Integer.valueOf(cVar.getEnd()));
                md8.checkNotNull(obj2);
                arrayList.add(new C9041lz.c(item, iIntValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        List<C9041lz.c<kdc>> paragraphStylesOrNull$ui_text_release = c9041lz.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release != null) {
            arrayList2 = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
            int size2 = paragraphStylesOrNull$ui_text_release.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C9041lz.c<kdc> cVar2 = paragraphStylesOrNull$ui_text_release.get(i2);
                kdc item2 = cVar2.getItem();
                Object obj3 = mapMutableMapOf.get(Integer.valueOf(cVar2.getStart()));
                md8.checkNotNull(obj3);
                int iIntValue2 = ((Number) obj3).intValue();
                Object obj4 = mapMutableMapOf.get(Integer.valueOf(cVar2.getEnd()));
                md8.checkNotNull(obj4);
                arrayList2.add(new C9041lz.c(item2, iIntValue2, ((Number) obj4).intValue()));
            }
        } else {
            arrayList2 = null;
        }
        List<C9041lz.c<? extends Object>> annotations$ui_text_release = c9041lz.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList3 = new ArrayList(annotations$ui_text_release.size());
            int size3 = annotations$ui_text_release.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C9041lz.c<? extends Object> cVar3 = annotations$ui_text_release.get(i3);
                Object item3 = cVar3.getItem();
                Object obj5 = mapMutableMapOf.get(Integer.valueOf(cVar3.getStart()));
                md8.checkNotNull(obj5);
                int iIntValue3 = ((Number) obj5).intValue();
                Object obj6 = mapMutableMapOf.get(Integer.valueOf(cVar3.getEnd()));
                md8.checkNotNull(obj6);
                arrayList3.add(new C9041lz.c(item3, iIntValue3, ((Number) obj6).intValue()));
            }
        }
        return new C9041lz((String) c8121h.f52110a, arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: fn8$a */
    public static final class C5894a extends tt8 implements qy6<List<? extends Integer>, Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<String> f37148a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<String, Integer, Integer, String> f37149b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C9041lz f37150c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Map<Integer, Integer> f37151d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5894a(jvd.C8121h<String> c8121h, kz6<? super String, ? super Integer, ? super Integer, String> kz6Var, C9041lz c9041lz, Map<Integer, Integer> map) {
            super(1);
            this.f37148a = c8121h;
            this.f37149b = kz6Var;
            this.f37150c = c9041lz;
            this.f37151d = map;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
        @gib
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Integer invoke2(@yfb List<Integer> list) {
            int iIntValue = list.get(0).intValue();
            int iIntValue2 = list.get(1).intValue();
            this.f37148a.f52110a = this.f37148a.f52110a + this.f37149b.invoke(this.f37150c.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
            return this.f37151d.put(Integer.valueOf(iIntValue2), Integer.valueOf(this.f37148a.f52110a.length()));
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }
    }
}
