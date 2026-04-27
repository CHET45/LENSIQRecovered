package p000;

import java.util.ArrayList;
import java.util.List;
import p000.wc8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
@e0g(parameters = 0)
public final class yy8 {

    /* JADX INFO: renamed from: j */
    public static final int f103325j = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final wx8 f103326a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ArrayList<C15884a> f103327b;

    /* JADX INFO: renamed from: c */
    public int f103328c;

    /* JADX INFO: renamed from: d */
    public int f103329d;

    /* JADX INFO: renamed from: e */
    public int f103330e;

    /* JADX INFO: renamed from: f */
    public int f103331f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final List<Integer> f103332g;

    /* JADX INFO: renamed from: h */
    @yfb
    public List<ib7> f103333h;

    /* JADX INFO: renamed from: i */
    public int f103334i;

    /* JADX INFO: renamed from: yy8$b */
    public static final class C15885b implements dy8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C15885b f103337a = new C15885b();

        /* JADX INFO: renamed from: b */
        public static int f103338b;

        /* JADX INFO: renamed from: c */
        public static int f103339c;

        private C15885b() {
        }

        @Override // p000.dy8
        public int getMaxCurrentLineSpan() {
            return f103338b;
        }

        @Override // p000.dy8
        public int getMaxLineSpan() {
            return f103339c;
        }

        public void setMaxCurrentLineSpan(int i) {
            f103338b = i;
        }

        public void setMaxLineSpan(int i) {
            f103339c = i;
        }
    }

    /* JADX INFO: renamed from: yy8$c */
    @e0g(parameters = 0)
    public static final class C15886c {

        /* JADX INFO: renamed from: c */
        public static final int f103340c = 8;

        /* JADX INFO: renamed from: a */
        public final int f103341a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final List<ib7> f103342b;

        public C15886c(int i, @yfb List<ib7> list) {
            this.f103341a = i;
            this.f103342b = list;
        }

        public final int getFirstItemIndex() {
            return this.f103341a;
        }

        @yfb
        public final List<ib7> getSpans() {
            return this.f103342b;
        }
    }

    /* JADX INFO: renamed from: yy8$d */
    public static final class C15887d extends tt8 implements qy6<C15884a, Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f103343a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15887d(int i) {
            super(1);
            this.f103343a = i;
        }

        @Override // p000.qy6
        @yfb
        public final Integer invoke(@yfb C15884a c15884a) {
            return Integer.valueOf(c15884a.getFirstItemIndex() - this.f103343a);
        }
    }

    public yy8(@yfb wx8 wx8Var) {
        this.f103326a = wx8Var;
        ArrayList<C15884a> arrayList = new ArrayList<>();
        int i = 0;
        arrayList.add(new C15884a(i, i, 2, null));
        this.f103327b = arrayList;
        this.f103331f = -1;
        this.f103332g = new ArrayList();
        this.f103333h = l82.emptyList();
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((((double) getTotalSize()) * 1.0d) / ((double) this.f103334i))) + 1;
    }

    private final List<ib7> getDefaultSpans(int i) {
        if (i == this.f103333h.size()) {
            return this.f103333h;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(ib7.m30182boximpl(xy8.GridItemSpan(1)));
        }
        this.f103333h = arrayList;
        return arrayList;
    }

    private final void invalidateCache() {
        this.f103327b.clear();
        int i = 0;
        this.f103327b.add(new C15884a(i, i, 2, null));
        this.f103328c = 0;
        this.f103329d = 0;
        this.f103330e = 0;
        this.f103331f = -1;
        this.f103332g.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.yy8.C15886c getLineConfiguration(int r11) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yy8.getLineConfiguration(int):yy8$c");
    }

    public final int getLineIndexOfItem(int i) {
        int i2 = 0;
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (i >= getTotalSize()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if (!this.f103326a.getHasCustomSpans$foundation_release()) {
            return i / this.f103334i;
        }
        int iBinarySearch$default = l82.binarySearch$default(this.f103327b, 0, 0, new C15887d(i), 3, (Object) null);
        int i3 = 2;
        if (iBinarySearch$default < 0) {
            iBinarySearch$default = (-iBinarySearch$default) - 2;
        }
        int bucketSize = getBucketSize() * iBinarySearch$default;
        int firstItemIndex = this.f103327b.get(iBinarySearch$default).getFirstItemIndex();
        if (firstItemIndex > i) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i4 = 0;
        while (firstItemIndex < i) {
            int i5 = firstItemIndex + 1;
            int iSpanOf = spanOf(firstItemIndex, this.f103334i - i4);
            i4 += iSpanOf;
            int i6 = this.f103334i;
            if (i4 >= i6) {
                if (i4 == i6) {
                    bucketSize++;
                    i4 = 0;
                } else {
                    bucketSize++;
                    i4 = iSpanOf;
                }
            }
            if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.f103327b.size()) {
                this.f103327b.add(new C15884a(i5 - (i4 > 0 ? 1 : 0), i2, i3, null));
            }
            firstItemIndex = i5;
        }
        return i4 + spanOf(i, this.f103334i - i4) > this.f103334i ? bucketSize + 1 : bucketSize;
    }

    public final int getSlotsPerLine() {
        return this.f103334i;
    }

    public final int getTotalSize() {
        return this.f103326a.getIntervals().getSize();
    }

    public final void setSlotsPerLine(int i) {
        if (i != this.f103334i) {
            this.f103334i = i;
            invalidateCache();
        }
    }

    public final int spanOf(int i, int i2) {
        C15885b c15885b = C15885b.f103337a;
        c15885b.setMaxCurrentLineSpan(i2);
        c15885b.setMaxLineSpan(this.f103334i);
        wc8.C14548a<vx8> c14548a = this.f103326a.getIntervals().get(i);
        return ib7.m30186getCurrentLineSpanimpl(c14548a.getValue().getSpan().invoke(c15885b, Integer.valueOf(i - c14548a.getStartIndex())).m30189unboximpl());
    }

    /* JADX INFO: renamed from: yy8$a */
    public static final class C15884a {

        /* JADX INFO: renamed from: a */
        public final int f103335a;

        /* JADX INFO: renamed from: b */
        public final int f103336b;

        public C15884a(int i, int i2) {
            this.f103335a = i;
            this.f103336b = i2;
        }

        public final int getFirstItemIndex() {
            return this.f103335a;
        }

        public final int getFirstItemKnownSpan() {
            return this.f103336b;
        }

        public /* synthetic */ C15884a(int i, int i2, int i3, jt3 jt3Var) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }
    }
}
