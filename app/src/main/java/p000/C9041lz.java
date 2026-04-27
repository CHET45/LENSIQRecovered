package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p000.b79;

/* JADX INFO: renamed from: lz */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1269:1\n1045#2:1270\n33#3,6:1271\n235#3,3:1278\n33#3,4:1281\n238#3,2:1285\n38#3:1287\n240#3:1288\n101#3,2:1289\n33#3,6:1291\n103#3:1297\n235#3,3:1298\n33#3,4:1301\n238#3,2:1305\n38#3:1307\n240#3:1308\n235#3,3:1309\n33#3,4:1312\n238#3,2:1316\n38#3:1318\n240#3:1319\n235#3,3:1320\n33#3,4:1323\n238#3,2:1327\n38#3:1329\n240#3:1330\n235#3,3:1331\n33#3,4:1334\n238#3,2:1338\n38#3:1340\n240#3:1341\n101#3,2:1342\n33#3,6:1344\n103#3:1350\n1#4:1277\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n87#1:1270\n87#1:1271,6\n160#1:1278,3\n160#1:1281,4\n160#1:1285,2\n160#1:1287\n160#1:1288\n168#1:1289,2\n168#1:1291,6\n168#1:1297\n183#1:1298,3\n183#1:1301,4\n183#1:1305,2\n183#1:1307\n183#1:1308\n198#1:1309,3\n198#1:1312,4\n198#1:1316,2\n198#1:1318\n198#1:1319\n215#1:1320,3\n215#1:1323,4\n215#1:1327,2\n215#1:1329\n215#1:1330\n230#1:1331,3\n230#1:1334,4\n230#1:1338,2\n230#1:1340\n230#1:1341\n238#1:1342,2\n238#1:1344,6\n238#1:1350\n*E\n"})
@vw7
public final class C9041lz implements CharSequence {

    /* JADX INFO: renamed from: f */
    public static final int f59278f = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f59280a;

    /* JADX INFO: renamed from: b */
    @gib
    public final List<c<swf>> f59281b;

    /* JADX INFO: renamed from: c */
    @gib
    public final List<c<kdc>> f59282c;

    /* JADX INFO: renamed from: d */
    @gib
    public final List<c<? extends Object>> f59283d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final b f59277e = new b(null);

    /* JADX INFO: renamed from: m */
    @yfb
    public static final dme<C9041lz, ?> f59279m = gme.getAnnotatedStringSaver();

    /* JADX INFO: renamed from: lz$a */
    @dwf({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1269:1\n33#2,6:1270\n33#2,6:1276\n33#2,6:1282\n33#2,6:1288\n33#2,6:1294\n33#2,6:1300\n151#2,3:1307\n33#2,4:1310\n154#2,2:1314\n38#2:1316\n156#2:1317\n151#2,3:1318\n33#2,4:1321\n154#2,2:1325\n38#2:1327\n156#2:1328\n151#2,3:1329\n33#2,4:1332\n154#2,2:1336\n38#2:1338\n156#2:1339\n1#3:1306\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n435#1:1270,6\n438#1:1276,6\n442#1:1282,6\n462#1:1288,6\n465#1:1294,6\n469#1:1300,6\n741#1:1307,3\n741#1:1310,4\n741#1:1314,2\n741#1:1316\n741#1:1317\n744#1:1318,3\n744#1:1321,4\n744#1:1325,2\n744#1:1327\n744#1:1328\n747#1:1329,3\n747#1:1332,4\n747#1:1336,2\n747#1:1338\n747#1:1339\n*E\n"})
    @e0g(parameters = 0)
    public static final class a implements Appendable {

        /* JADX INFO: renamed from: f */
        public static final int f59284f = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final StringBuilder f59285a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final List<C16479a<swf>> f59286b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final List<C16479a<kdc>> f59287c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final List<C16479a<? extends Object>> f59288d;

        /* JADX INFO: renamed from: e */
        @yfb
        public final List<C16479a<? extends Object>> f59289e;

        public a() {
            this(0, 1, null);
        }

        public final void addLink(@yfb b79.C1771b c1771b, int i, int i2) {
            this.f59288d.add(new C16479a<>(c1771b, i, i2, null, 8, null));
        }

        public final void addStringAnnotation(@yfb String str, @yfb String str2, int i, int i2) {
            this.f59288d.add(new C16479a<>(str2, i, i2, str));
        }

        public final void addStyle(@yfb swf swfVar, int i, int i2) {
            this.f59286b.add(new C16479a<>(swfVar, i, i2, null, 8, null));
        }

        @th5
        public final void addTtsAnnotation(@yfb skh skhVar, int i, int i2) {
            this.f59288d.add(new C16479a<>(skhVar, i, i2, null, 8, null));
        }

        @q64(message = "Use LinkAnnotation API for links instead", replaceWith = @i2e(expression = "addLink(, start, end)", imports = {}))
        @th5
        public final void addUrlAnnotation(@yfb eyh eyhVar, int i, int i2) {
            this.f59288d.add(new C16479a<>(eyhVar, i, i2, null, 8, null));
        }

        public final int getLength() {
            return this.f59285a.length();
        }

        public final void pop() {
            if (this.f59289e.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            this.f59289e.remove(r0.size() - 1).setEnd(this.f59285a.length());
        }

        public final int pushLink(@yfb b79 b79Var) {
            C16479a<? extends Object> c16479a = new C16479a<>(b79Var, this.f59285a.length(), 0, null, 12, null);
            this.f59289e.add(c16479a);
            this.f59288d.add(c16479a);
            return this.f59289e.size() - 1;
        }

        public final int pushStringAnnotation(@yfb String str, @yfb String str2) {
            C16479a<? extends Object> c16479a = new C16479a<>(str2, this.f59285a.length(), 0, str, 4, null);
            this.f59289e.add(c16479a);
            this.f59288d.add(c16479a);
            return this.f59289e.size() - 1;
        }

        public final int pushStyle(@yfb swf swfVar) {
            C16479a<swf> c16479a = new C16479a<>(swfVar, this.f59285a.length(), 0, null, 12, null);
            this.f59289e.add(c16479a);
            this.f59286b.add(c16479a);
            return this.f59289e.size() - 1;
        }

        public final int pushTtsAnnotation(@yfb skh skhVar) {
            C16479a<? extends Object> c16479a = new C16479a<>(skhVar, this.f59285a.length(), 0, null, 12, null);
            this.f59289e.add(c16479a);
            this.f59288d.add(c16479a);
            return this.f59289e.size() - 1;
        }

        @q64(message = "Use LinkAnnotation API for links instead", replaceWith = @i2e(expression = "pushLink(, start, end)", imports = {}))
        @th5
        public final int pushUrlAnnotation(@yfb eyh eyhVar) {
            C16479a<? extends Object> c16479a = new C16479a<>(eyhVar, this.f59285a.length(), 0, null, 12, null);
            this.f59289e.add(c16479a);
            this.f59288d.add(c16479a);
            return this.f59289e.size() - 1;
        }

        @yfb
        public final C9041lz toAnnotatedString() {
            String string = this.f59285a.toString();
            List<C16479a<swf>> list = this.f59286b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).toRange(this.f59285a.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<C16479a<kdc>> list2 = this.f59287c;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(list2.get(i2).toRange(this.f59285a.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List<C16479a<? extends Object>> list3 = this.f59288d;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList3.add(list3.get(i3).toRange(this.f59285a.length()));
            }
            return new C9041lz(string, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }

        public a(int i) {
            this.f59285a = new StringBuilder(i);
            this.f59286b = new ArrayList();
            this.f59287c = new ArrayList();
            this.f59288d = new ArrayList();
            this.f59289e = new ArrayList();
        }

        public final void addLink(@yfb b79.C1770a c1770a, int i, int i2) {
            this.f59288d.add(new C16479a<>(c1770a, i, i2, null, 8, null));
        }

        public final void addStyle(@yfb kdc kdcVar, int i, int i2) {
            this.f59287c.add(new C16479a<>(kdcVar, i, i2, null, 8, null));
        }

        public final void append(@yfb String str) {
            this.f59285a.append(str);
        }

        /* JADX INFO: renamed from: lz$a$a, reason: collision with other inner class name */
        @dwf({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1269:1\n1#2:1270\n*E\n"})
        public static final class C16479a<T> {

            /* JADX INFO: renamed from: a */
            public final T f59290a;

            /* JADX INFO: renamed from: b */
            public final int f59291b;

            /* JADX INFO: renamed from: c */
            public int f59292c;

            /* JADX INFO: renamed from: d */
            @yfb
            public final String f59293d;

            public C16479a(T t, int i, int i2, @yfb String str) {
                this.f59290a = t;
                this.f59291b = i;
                this.f59292c = i2;
                this.f59293d = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C16479a copy$default(C16479a c16479a, Object obj, int i, int i2, String str, int i3, Object obj2) {
                if ((i3 & 1) != 0) {
                    obj = c16479a.f59290a;
                }
                if ((i3 & 2) != 0) {
                    i = c16479a.f59291b;
                }
                if ((i3 & 4) != 0) {
                    i2 = c16479a.f59292c;
                }
                if ((i3 & 8) != 0) {
                    str = c16479a.f59293d;
                }
                return c16479a.copy(obj, i, i2, str);
            }

            public static /* synthetic */ c toRange$default(C16479a c16479a, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return c16479a.toRange(i);
            }

            public final T component1() {
                return this.f59290a;
            }

            public final int component2() {
                return this.f59291b;
            }

            public final int component3() {
                return this.f59292c;
            }

            @yfb
            public final String component4() {
                return this.f59293d;
            }

            @yfb
            public final C16479a<T> copy(T t, int i, int i2, @yfb String str) {
                return new C16479a<>(t, i, i2, str);
            }

            public boolean equals(@gib Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C16479a)) {
                    return false;
                }
                C16479a c16479a = (C16479a) obj;
                return md8.areEqual(this.f59290a, c16479a.f59290a) && this.f59291b == c16479a.f59291b && this.f59292c == c16479a.f59292c && md8.areEqual(this.f59293d, c16479a.f59293d);
            }

            public final int getEnd() {
                return this.f59292c;
            }

            public final T getItem() {
                return this.f59290a;
            }

            public final int getStart() {
                return this.f59291b;
            }

            @yfb
            public final String getTag() {
                return this.f59293d;
            }

            public int hashCode() {
                T t = this.f59290a;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.f59291b)) * 31) + Integer.hashCode(this.f59292c)) * 31) + this.f59293d.hashCode();
            }

            public final void setEnd(int i) {
                this.f59292c = i;
            }

            @yfb
            public final c<T> toRange(int i) {
                int i2 = this.f59292c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    return new c<>(this.f59290a, this.f59291b, i, this.f59293d);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            @yfb
            public String toString() {
                return "MutableRange(item=" + this.f59290a + ", start=" + this.f59291b + ", end=" + this.f59292c + ", tag=" + this.f59293d + ')';
            }

            public /* synthetic */ C16479a(Object obj, int i, int i2, String str, int i3, jt3 jt3Var) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        public final void pop(int i) {
            if (i < this.f59289e.size()) {
                while (this.f59289e.size() - 1 >= i) {
                    pop();
                }
            } else {
                throw new IllegalStateException((i + " should be less than " + this.f59289e.size()).toString());
            }
        }

        public final int pushStyle(@yfb kdc kdcVar) {
            C16479a<kdc> c16479a = new C16479a<>(kdcVar, this.f59285a.length(), 0, null, 12, null);
            this.f59289e.add(c16479a);
            this.f59287c.add(c16479a);
            return this.f59289e.size() - 1;
        }

        @Override // java.lang.Appendable
        @yfb
        public a append(@gib CharSequence charSequence) {
            if (charSequence instanceof C9041lz) {
                append((C9041lz) charSequence);
            } else {
                this.f59285a.append(charSequence);
            }
            return this;
        }

        public /* synthetic */ a(int i, int i2, jt3 jt3Var) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        public a(@yfb String str) {
            this(0, 1, null);
            append(str);
        }

        @Override // java.lang.Appendable
        @yfb
        public a append(@gib CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof C9041lz) {
                append((C9041lz) charSequence, i, i2);
            } else {
                this.f59285a.append(charSequence, i, i2);
            }
            return this;
        }

        public a(@yfb C9041lz c9041lz) {
            this(0, 1, null);
            append(c9041lz);
        }

        @Override // java.lang.Appendable
        @yfb
        public a append(char c) {
            this.f59285a.append(c);
            return this;
        }

        public final void append(@yfb C9041lz c9041lz) {
            int length = this.f59285a.length();
            this.f59285a.append(c9041lz.getText());
            List<c<swf>> spanStylesOrNull$ui_text_release = c9041lz.getSpanStylesOrNull$ui_text_release();
            if (spanStylesOrNull$ui_text_release != null) {
                int size = spanStylesOrNull$ui_text_release.size();
                for (int i = 0; i < size; i++) {
                    c<swf> cVar = spanStylesOrNull$ui_text_release.get(i);
                    addStyle(cVar.getItem(), cVar.getStart() + length, cVar.getEnd() + length);
                }
            }
            List<c<kdc>> paragraphStylesOrNull$ui_text_release = c9041lz.getParagraphStylesOrNull$ui_text_release();
            if (paragraphStylesOrNull$ui_text_release != null) {
                int size2 = paragraphStylesOrNull$ui_text_release.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c<kdc> cVar2 = paragraphStylesOrNull$ui_text_release.get(i2);
                    addStyle(cVar2.getItem(), cVar2.getStart() + length, cVar2.getEnd() + length);
                }
            }
            List<c<? extends Object>> annotations$ui_text_release = c9041lz.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size3 = annotations$ui_text_release.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    c<? extends Object> cVar3 = annotations$ui_text_release.get(i3);
                    this.f59288d.add(new C16479a<>(cVar3.getItem(), cVar3.getStart() + length, cVar3.getEnd() + length, cVar3.getTag()));
                }
            }
        }

        public final void append(@yfb C9041lz c9041lz, int i, int i2) {
            int length = this.f59285a.length();
            this.f59285a.append((CharSequence) c9041lz.getText(), i, i2);
            List localSpanStyles = C9611mz.getLocalSpanStyles(c9041lz, i, i2);
            if (localSpanStyles != null) {
                int size = localSpanStyles.size();
                for (int i3 = 0; i3 < size; i3++) {
                    c cVar = (c) localSpanStyles.get(i3);
                    addStyle((swf) cVar.getItem(), cVar.getStart() + length, cVar.getEnd() + length);
                }
            }
            List localParagraphStyles = C9611mz.getLocalParagraphStyles(c9041lz, i, i2);
            if (localParagraphStyles != null) {
                int size2 = localParagraphStyles.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    c cVar2 = (c) localParagraphStyles.get(i4);
                    addStyle((kdc) cVar2.getItem(), cVar2.getStart() + length, cVar2.getEnd() + length);
                }
            }
            List localAnnotations = C9611mz.getLocalAnnotations(c9041lz, i, i2);
            if (localAnnotations != null) {
                int size3 = localAnnotations.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    c cVar3 = (c) localAnnotations.get(i5);
                    this.f59288d.add(new C16479a<>(cVar3.getItem(), cVar3.getStart() + length, cVar3.getEnd() + length, cVar3.getTag()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: lz$b */
    public static final class b {
        public /* synthetic */ b(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<C9041lz, ?> getSaver() {
            return C9041lz.f59279m;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: lz$d */
    @dwf({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n1#1,328:1\n87#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return md2.compareValues(Integer.valueOf(((c) t).getStart()), Integer.valueOf(((c) t2).getStart()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9041lz(@yfb String str, @gib List<c<swf>> list, @gib List<c<kdc>> list2, @gib List<? extends c<? extends Object>> list3) {
        List listSortedWith;
        this.f59280a = str;
        this.f59281b = list;
        this.f59282c = list2;
        this.f59283d = list3;
        if (list2 == null || (listSortedWith = v82.sortedWith(list2, new d())) == null) {
            return;
        }
        int size = listSortedWith.size();
        int end = -1;
        for (int i = 0; i < size; i++) {
            c cVar = (c) listSortedWith.get(i);
            if (cVar.getStart() < end) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (cVar.getEnd() > this.f59280a.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + cVar.getStart() + ", " + cVar.getEnd() + ") is out of boundary").toString());
            }
            end = cVar.getEnd();
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9041lz)) {
            return false;
        }
        C9041lz c9041lz = (C9041lz) obj;
        return md8.areEqual(this.f59280a, c9041lz.f59280a) && md8.areEqual(this.f59281b, c9041lz.f59281b) && md8.areEqual(this.f59282c, c9041lz.f59282c) && md8.areEqual(this.f59283d, c9041lz.f59283d);
    }

    public char get(int i) {
        return this.f59280a.charAt(i);
    }

    @gib
    public final List<c<? extends Object>> getAnnotations$ui_text_release() {
        return this.f59283d;
    }

    public int getLength() {
        return this.f59280a.length();
    }

    @yfb
    public final List<c<b79>> getLinkAnnotations(int i, int i2) {
        List listEmptyList;
        List<c<? extends Object>> list = this.f59283d;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c<? extends Object> cVar = list.get(i3);
                c<? extends Object> cVar2 = cVar;
                if ((cVar2.getItem() instanceof b79) && C9611mz.intersect(i, i2, cVar2.getStart(), cVar2.getEnd())) {
                    listEmptyList.add(cVar);
                }
            }
        } else {
            listEmptyList = l82.emptyList();
        }
        md8.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listEmptyList;
    }

    @yfb
    public final List<c<kdc>> getParagraphStyles() {
        List<c<kdc>> list = this.f59282c;
        return list == null ? l82.emptyList() : list;
    }

    @gib
    public final List<c<kdc>> getParagraphStylesOrNull$ui_text_release() {
        return this.f59282c;
    }

    @yfb
    public final List<c<swf>> getSpanStyles() {
        List<c<swf>> list = this.f59281b;
        return list == null ? l82.emptyList() : list;
    }

    @gib
    public final List<c<swf>> getSpanStylesOrNull$ui_text_release() {
        return this.f59281b;
    }

    @yfb
    public final List<c<String>> getStringAnnotations(@yfb String str, int i, int i2) {
        List listEmptyList;
        List<c<? extends Object>> list = this.f59283d;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c<? extends Object> cVar = list.get(i3);
                c<? extends Object> cVar2 = cVar;
                if ((cVar2.getItem() instanceof String) && md8.areEqual(str, cVar2.getTag()) && C9611mz.intersect(i, i2, cVar2.getStart(), cVar2.getEnd())) {
                    listEmptyList.add(cVar);
                }
            }
        } else {
            listEmptyList = l82.emptyList();
        }
        md8.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listEmptyList;
    }

    @yfb
    public final String getText() {
        return this.f59280a;
    }

    @yfb
    public final List<c<skh>> getTtsAnnotations(int i, int i2) {
        List listEmptyList;
        List<c<? extends Object>> list = this.f59283d;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c<? extends Object> cVar = list.get(i3);
                c<? extends Object> cVar2 = cVar;
                if ((cVar2.getItem() instanceof skh) && C9611mz.intersect(i, i2, cVar2.getStart(), cVar2.getEnd())) {
                    listEmptyList.add(cVar);
                }
            }
        } else {
            listEmptyList = l82.emptyList();
        }
        md8.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listEmptyList;
    }

    @yfb
    @q64(message = "Use LinkAnnotation API instead", replaceWith = @i2e(expression = "getLinkAnnotations(start, end)", imports = {}))
    @th5
    public final List<c<eyh>> getUrlAnnotations(int i, int i2) {
        List listEmptyList;
        List<c<? extends Object>> list = this.f59283d;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c<? extends Object> cVar = list.get(i3);
                c<? extends Object> cVar2 = cVar;
                if ((cVar2.getItem() instanceof eyh) && C9611mz.intersect(i, i2, cVar2.getStart(), cVar2.getEnd())) {
                    listEmptyList.add(cVar);
                }
            }
        } else {
            listEmptyList = l82.emptyList();
        }
        md8.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listEmptyList;
    }

    public final boolean hasEqualAnnotations(@yfb C9041lz c9041lz) {
        return md8.areEqual(this.f59283d, c9041lz.f59283d);
    }

    public final boolean hasLinkAnnotations(int i, int i2) {
        List<c<? extends Object>> list = this.f59283d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            c<? extends Object> cVar = list.get(i3);
            if ((cVar.getItem() instanceof b79) && C9611mz.intersect(i, i2, cVar.getStart(), cVar.getEnd())) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasStringAnnotations(@yfb String str, int i, int i2) {
        List<c<? extends Object>> list = this.f59283d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            c<? extends Object> cVar = list.get(i3);
            if ((cVar.getItem() instanceof String) && md8.areEqual(str, cVar.getTag()) && C9611mz.intersect(i, i2, cVar.getStart(), cVar.getEnd())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f59280a.hashCode() * 31;
        List<c<swf>> list = this.f59281b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<c<kdc>> list2 = this.f59282c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<c<? extends Object>> list3 = this.f59283d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    @f0g
    @yfb
    public final C9041lz plus(@yfb C9041lz c9041lz) {
        a aVar = new a(this);
        aVar.append(c9041lz);
        return aVar.toAnnotatedString();
    }

    @yfb
    /* JADX INFO: renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final C9041lz m30925subSequence5zctL8(long j) {
        return subSequence(jvg.m30591getMinimpl(j), jvg.m30590getMaximpl(j));
    }

    @Override // java.lang.CharSequence
    @yfb
    public String toString() {
        return this.f59280a;
    }

    @Override // java.lang.CharSequence
    @yfb
    public C9041lz subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0 && i2 == this.f59280a.length()) {
                return this;
            }
            String strSubstring = this.f59280a.substring(i, i2);
            md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C9041lz(strSubstring, C9611mz.filterRanges(this.f59281b, i, i2), C9611mz.filterRanges(this.f59282c, i, i2), C9611mz.filterRanges(this.f59283d, i, i2));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
    }

    /* JADX INFO: renamed from: lz$c */
    @dwf({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1269:1\n1#2:1270\n*E\n"})
    @vw7
    public static final class c<T> {

        /* JADX INFO: renamed from: e */
        public static final int f59294e = 0;

        /* JADX INFO: renamed from: a */
        public final T f59295a;

        /* JADX INFO: renamed from: b */
        public final int f59296b;

        /* JADX INFO: renamed from: c */
        public final int f59297c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final String f59298d;

        public c(T t, int i, int i2, @yfb String str) {
            this.f59295a = t;
            this.f59296b = i;
            this.f59297c = i2;
            this.f59298d = str;
            if (i > i2) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c copy$default(c cVar, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = cVar.f59295a;
            }
            if ((i3 & 2) != 0) {
                i = cVar.f59296b;
            }
            if ((i3 & 4) != 0) {
                i2 = cVar.f59297c;
            }
            if ((i3 & 8) != 0) {
                str = cVar.f59298d;
            }
            return cVar.copy(obj, i, i2, str);
        }

        public final T component1() {
            return this.f59295a;
        }

        public final int component2() {
            return this.f59296b;
        }

        public final int component3() {
            return this.f59297c;
        }

        @yfb
        public final String component4() {
            return this.f59298d;
        }

        @yfb
        public final c<T> copy(T t, int i, int i2, @yfb String str) {
            return new c<>(t, i, i2, str);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return md8.areEqual(this.f59295a, cVar.f59295a) && this.f59296b == cVar.f59296b && this.f59297c == cVar.f59297c && md8.areEqual(this.f59298d, cVar.f59298d);
        }

        public final int getEnd() {
            return this.f59297c;
        }

        public final T getItem() {
            return this.f59295a;
        }

        public final int getStart() {
            return this.f59296b;
        }

        @yfb
        public final String getTag() {
            return this.f59298d;
        }

        public int hashCode() {
            T t = this.f59295a;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.f59296b)) * 31) + Integer.hashCode(this.f59297c)) * 31) + this.f59298d.hashCode();
        }

        @yfb
        public String toString() {
            return "Range(item=" + this.f59295a + ", start=" + this.f59296b + ", end=" + this.f59297c + ", tag=" + this.f59298d + ')';
        }

        public c(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    @yfb
    public final List<c<String>> getStringAnnotations(int i, int i2) {
        List listEmptyList;
        List<c<? extends Object>> list = this.f59283d;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c<? extends Object> cVar = list.get(i3);
                c<? extends Object> cVar2 = cVar;
                if ((cVar2.getItem() instanceof String) && C9611mz.intersect(i, i2, cVar2.getStart(), cVar2.getEnd())) {
                    listEmptyList.add(cVar);
                }
            }
        } else {
            listEmptyList = l82.emptyList();
        }
        md8.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listEmptyList;
    }

    public /* synthetic */ C9041lz(String str, List list, List list2, List list3, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }

    public /* synthetic */ C9041lz(String str, List list, List list2, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? l82.emptyList() : list, (i & 4) != 0 ? l82.emptyList() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9041lz(@yfb String str, @yfb List<c<swf>> list, @yfb List<c<kdc>> list2) {
        List<c<swf>> list3 = list;
        List<c<kdc>> list4 = list2;
        this(str, list3.isEmpty() ? null : list3, list4.isEmpty() ? null : list4, null);
    }
}
