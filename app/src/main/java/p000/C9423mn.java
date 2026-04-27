package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import p000.jvd;
import p000.p7e;

/* JADX INFO: renamed from: mn */
/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class C9423mn {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C9423mn f61530a = new C9423mn();

    /* JADX INFO: renamed from: mn$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final f78 f61531a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final List<Integer> f61532b;

        public a(@yfb f78 f78Var, @yfb List<Integer> list) {
            md8.checkNotNullParameter(f78Var, "resultRange");
            md8.checkNotNullParameter(list, "resultIndices");
            this.f61531a = f78Var;
            this.f61532b = list;
        }

        @yfb
        public final List<Integer> getResultIndices() {
            return this.f61532b;
        }

        @yfb
        public final f78 getResultRange() {
            return this.f61531a;
        }
    }

    /* JADX INFO: renamed from: mn$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f61533a;

        /* JADX INFO: renamed from: b */
        public final int f61534b;

        public b(@yfb String str, int i) {
            md8.checkNotNullParameter(str, "name");
            this.f61533a = str;
            this.f61534b = i;
        }

        public static /* synthetic */ b copy$default(b bVar, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = bVar.f61533a;
            }
            if ((i2 & 2) != 0) {
                i = bVar.f61534b;
            }
            return bVar.copy(str, i);
        }

        @yfb
        public final String component1() {
            return this.f61533a;
        }

        public final int component2() {
            return this.f61534b;
        }

        @yfb
        public final b copy(@yfb String str, int i) {
            md8.checkNotNullParameter(str, "name");
            return new b(str, i);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return md8.areEqual(this.f61533a, bVar.f61533a) && this.f61534b == bVar.f61534b;
        }

        public final int getIndex() {
            return this.f61534b;
        }

        @yfb
        public final String getName() {
            return this.f61533a;
        }

        public int hashCode() {
            return (this.f61533a.hashCode() * 31) + Integer.hashCode(this.f61534b);
        }

        @yfb
        public String toString() {
            return "ResultColumn(name=" + this.f61533a + ", index=" + this.f61534b + ')';
        }
    }

    /* JADX INFO: renamed from: mn$c */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: d */
        @yfb
        public static final a f61535d = new a(null);

        /* JADX INFO: renamed from: e */
        @yfb
        public static final c f61536e = new c(l82.emptyList(), Integer.MAX_VALUE, Integer.MAX_VALUE);

        /* JADX INFO: renamed from: a */
        @yfb
        public final List<a> f61537a;

        /* JADX INFO: renamed from: b */
        public final int f61538b;

        /* JADX INFO: renamed from: c */
        public final int f61539c;

        /* JADX INFO: renamed from: mn$c$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final c build(@yfb List<a> list) {
                md8.checkNotNullParameter(list, "matches");
                List<a> list2 = list;
                int i = 0;
                int last = 0;
                for (a aVar : list2) {
                    last += ((aVar.getResultRange().getLast() - aVar.getResultRange().getFirst()) + 1) - aVar.getResultIndices().size();
                }
                Iterator<T> it = list2.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int first = ((a) it.next()).getResultRange().getFirst();
                while (it.hasNext()) {
                    int first2 = ((a) it.next()).getResultRange().getFirst();
                    if (first > first2) {
                        first = first2;
                    }
                }
                Iterator<T> it2 = list2.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int last2 = ((a) it2.next()).getResultRange().getLast();
                while (it2.hasNext()) {
                    int last3 = ((a) it2.next()).getResultRange().getLast();
                    if (last2 < last3) {
                        last2 = last3;
                    }
                }
                Iterable f78Var = new f78(first, last2);
                if (!(f78Var instanceof Collection) || !((Collection) f78Var).isEmpty()) {
                    Iterator it3 = f78Var.iterator();
                    int i2 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((o68) it3).nextInt();
                        Iterator<T> it4 = list2.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((a) it4.next()).getResultRange().contains(iNextInt)) {
                                i3++;
                            }
                            if (i3 > 1) {
                                i2++;
                                if (i2 < 0) {
                                    l82.throwCountOverflow();
                                }
                            }
                        }
                    }
                    i = i2;
                }
                return new c(list, last, i);
            }

            @yfb
            public final c getNO_SOLUTION() {
                return c.f61536e;
            }

            private a() {
            }
        }

        public c(@yfb List<a> list, int i, int i2) {
            md8.checkNotNullParameter(list, "matches");
            this.f61537a = list;
            this.f61538b = i;
            this.f61539c = i2;
        }

        public final int getCoverageOffset() {
            return this.f61538b;
        }

        @yfb
        public final List<a> getMatches() {
            return this.f61537a;
        }

        public final int getOverlaps() {
            return this.f61539c;
        }

        @Override // java.lang.Comparable
        public int compareTo(@yfb c cVar) {
            md8.checkNotNullParameter(cVar, "other");
            int iCompare = md8.compare(this.f61539c, cVar.f61539c);
            return iCompare != 0 ? iCompare : md8.compare(this.f61538b, cVar.f61538b);
        }
    }

    /* JADX INFO: renamed from: mn$d */
    public static final class d extends tt8 implements kz6<Integer, Integer, List<? extends b>, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String[] f61540a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<List<a>> f61541b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f61542c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String[] strArr, List<? extends List<a>> list, int i) {
            super(3);
            this.f61540a = strArr;
            this.f61541b = list;
            this.f61542c = i;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(Integer num, Integer num2, List<? extends b> list) {
            invoke(num.intValue(), num2.intValue(), (List<b>) list);
            return bth.f14751a;
        }

        public final void invoke(int i, int i2, @yfb List<b> list) {
            Object next;
            md8.checkNotNullParameter(list, "resultColumnsSublist");
            String[] strArr = this.f61540a;
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (md8.areEqual(str, ((b) next).component1())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                b bVar = (b) next;
                if (bVar == null) {
                    return;
                }
                arrayList.add(Integer.valueOf(bVar.getIndex()));
            }
            this.f61541b.get(this.f61542c).add(new a(new f78(i, i2 - 1), arrayList));
        }
    }

    /* JADX INFO: renamed from: mn$e */
    public static final class e extends tt8 implements qy6<List<? extends Integer>, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<List<a>> f61543a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f61544b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends List<a>> list, int i) {
            super(1);
            this.f61543a = list;
            this.f61544b = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(List<? extends Integer> list) {
            invoke2((List<Integer>) list);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb List<Integer> list) {
            md8.checkNotNullParameter(list, "indices");
            List<Integer> list2 = list;
            Iterator<T> it = list2.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int iIntValue = ((Number) it.next()).intValue();
            while (it.hasNext()) {
                int iIntValue2 = ((Number) it.next()).intValue();
                if (iIntValue > iIntValue2) {
                    iIntValue = iIntValue2;
                }
            }
            Iterator<T> it2 = list2.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int iIntValue3 = ((Number) it2.next()).intValue();
            while (it2.hasNext()) {
                int iIntValue4 = ((Number) it2.next()).intValue();
                if (iIntValue3 < iIntValue4) {
                    iIntValue3 = iIntValue4;
                }
            }
            this.f61543a.get(this.f61544b).add(new a(new f78(iIntValue, iIntValue3), list));
        }
    }

    /* JADX INFO: renamed from: mn$f */
    public static final class f extends tt8 implements qy6<List<? extends a>, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<c> f61545a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(jvd.C8121h<c> c8121h) {
            super(1);
            this.f61545a = c8121h;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(List<? extends a> list) {
            invoke2((List<a>) list);
            return bth.f14751a;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, mn$c] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb List<a> list) {
            md8.checkNotNullParameter(list, "it");
            ?? Build = c.f61535d.build(list);
            if (Build.compareTo(this.f61545a.f52110a) < 0) {
                this.f61545a.f52110a = Build;
            }
        }
    }

    private C9423mn() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17443a(C9423mn c9423mn, List list, List list2, int i, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        c9423mn.dfs(list, list2, i, qy6Var);
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i, qy6<? super List<? extends T>, bth> qy6Var) {
        if (i == list.size()) {
            qy6Var.invoke(v82.toList(list2));
            return;
        }
        Iterator<T> it = list.get(i).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            f61530a.dfs(list, list2, i + 1, qy6Var);
            q82.removeLast(list2);
        }
    }

    private final void rabinKarpSearch(List<b> list, String[] strArr, kz6<? super Integer, ? super Integer, ? super List<b>, bth> kz6Var) {
        int i = 0;
        int iHashCode = 0;
        for (String str : strArr) {
            iHashCode += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((b) it.next()).getName().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                kz6Var.invoke(Integer.valueOf(i), Integer.valueOf(length), list.subList(i, length));
            }
            int i2 = i + 1;
            int i3 = length + 1;
            if (i3 > list.size()) {
                return;
            }
            iHashCode2 = (iHashCode2 - list.get(i).getName().hashCode()) + list.get(length).getName().hashCode();
            i = i2;
            length = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, mn$c] */
    @do8
    @yfb
    public static final int[][] resolve(@yfb String[] strArr, @yfb String[][] strArr2) {
        md8.checkNotNullParameter(strArr, "resultColumns");
        md8.checkNotNullParameter(strArr2, "mappings");
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String strSubstring = strArr[i2];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale locale = Locale.US;
            md8.checkNotNullExpressionValue(locale, "US");
            String lowerCase = strSubstring.toLowerCase(locale);
            md8.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            strArr[i2] = lowerCase;
        }
        int length2 = strArr2.length;
        for (int i3 = 0; i3 < length2; i3++) {
            int length3 = strArr2[i3].length;
            for (int i4 = 0; i4 < length3; i4++) {
                String[] strArr3 = strArr2[i3];
                String str = strArr3[i4];
                Locale locale2 = Locale.US;
                md8.checkNotNullExpressionValue(locale2, "US");
                String lowerCase2 = str.toLowerCase(locale2);
                md8.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr3[i4] = lowerCase2;
            }
        }
        Set setCreateSetBuilder = v6f.createSetBuilder();
        for (String[] strArr4 : strArr2) {
            q82.addAll(setCreateSetBuilder, strArr4);
        }
        Set setBuild = v6f.build(setCreateSetBuilder);
        List listCreateListBuilder = k82.createListBuilder();
        int length4 = strArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length4) {
            String str2 = strArr[i5];
            int i7 = i6 + 1;
            if (setBuild.contains(str2)) {
                listCreateListBuilder.add(new b(str2, i6));
            }
            i5++;
            i6 = i7;
        }
        List<b> listBuild = k82.build(listCreateListBuilder);
        int length5 = strArr2.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i8 = 0; i8 < length5; i8++) {
            arrayList.add(new ArrayList());
        }
        int length6 = strArr2.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length6) {
            String[] strArr5 = strArr2[i9];
            int i11 = i10 + 1;
            f61530a.rabinKarpSearch(listBuild, strArr5, new d(strArr5, arrayList, i10));
            if (((List) arrayList.get(i10)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr5.length);
                int length7 = strArr5.length;
                for (int i12 = i; i12 < length7; i12++) {
                    String str3 = strArr5[i12];
                    List listCreateListBuilder2 = k82.createListBuilder();
                    for (b bVar : listBuild) {
                        if (md8.areEqual(str3, bVar.getName())) {
                            listCreateListBuilder2.add(Integer.valueOf(bVar.getIndex()));
                        }
                    }
                    List listBuild2 = k82.build(listCreateListBuilder2);
                    if (listBuild2.isEmpty()) {
                        throw new IllegalStateException(("Column " + str3 + " not found in result").toString());
                    }
                    arrayList2.add(listBuild2);
                }
                m17443a(f61530a, arrayList2, null, 0, new e(arrayList, i10), 6, null);
            }
            i9++;
            i10 = i11;
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings");
                }
            }
        }
        jvd.C8121h c8121h = new jvd.C8121h();
        c8121h.f52110a = c.f61535d.getNO_SOLUTION();
        m17443a(f61530a, arrayList, null, 0, new f(c8121h), 6, null);
        List<a> matches = ((c) c8121h.f52110a).getMatches();
        ArrayList arrayList3 = new ArrayList(m82.collectionSizeOrDefault(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList3.add(v82.toIntArray(((a) it2.next()).getResultIndices()));
        }
        Object[] array = arrayList3.toArray(new int[0][]);
        md8.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (int[][]) array;
    }
}
