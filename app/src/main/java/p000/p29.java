package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p29 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final int[] f69473a;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final o29 f69474b;

    /* JADX INFO: renamed from: p29$a */
    public static final class C10764a implements vba {

        /* JADX INFO: renamed from: a */
        public final int f69475a;

        /* JADX INFO: renamed from: b */
        public final int f69476b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final Map<AbstractC9938nm, Integer> f69477c = xt9.emptyMap();

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // p000.vba
        @yfb
        public Map<AbstractC9938nm, Integer> getAlignmentLines() {
            return this.f69477c;
        }

        @Override // p000.vba
        public int getHeight() {
            return this.f69476b;
        }

        @Override // p000.vba
        public int getWidth() {
            return this.f69475a;
        }

        @Override // p000.vba
        public void placeChildren() {
        }
    }

    /* JADX INFO: renamed from: p29$b */
    public static final class C10765b extends tt8 implements qy6<b29, Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f69478a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10765b(int i) {
            super(1);
            this.f69478a = i;
        }

        @Override // p000.qy6
        @yfb
        public final Integer invoke(@yfb b29 b29Var) {
            return Integer.valueOf(b29Var.getIndex() - this.f69478a);
        }
    }

    static {
        int[] iArr = new int[0];
        f69473a = iArr;
        f69474b = new o29(iArr, iArr, 0.0f, new C10764a(), false, false, false, new x29(iArr, iArr), new y29(new n5b()), e64.Density$default(1.0f, 0.0f, 2, null), 0, l82.emptyList(), r78.f77324b.m32092getZeroYbymL2g(), 0, 0, 0, 0, 0, y13.CoroutineScope(a05.f2a), null);
    }

    @gib
    public static final b29 findVisibleItem(@yfb j29 j29Var, int i) {
        if (j29Var.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((b29) v82.first((List) j29Var.getVisibleItemsInfo())).getIndex();
        if (i > ((b29) v82.last((List) j29Var.getVisibleItemsInfo())).getIndex() || index > i) {
            return null;
        }
        return (b29) v82.getOrNull(j29Var.getVisibleItemsInfo(), l82.binarySearch$default(j29Var.getVisibleItemsInfo(), 0, 0, new C10765b(i), 3, (Object) null));
    }

    @yfb
    public static final o29 getEmptyLazyStaggeredGridLayoutInfo() {
        return f69474b;
    }

    public static /* synthetic */ void getEmptyLazyStaggeredGridLayoutInfo$annotations() {
    }
}
