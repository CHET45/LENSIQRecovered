package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1334:1\n243#1:1340\n1009#2:1335\n1008#2:1336\n1007#2:1338\n1009#2:1341\n1008#2:1342\n1007#2:1344\n114#3:1337\n107#3:1339\n114#3:1343\n107#3:1345\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n246#1:1340\n243#1:1335\n243#1:1336\n243#1:1338\n246#1:1341\n246#1:1342\n246#1:1344\n243#1:1337\n243#1:1339\n246#1:1343\n246#1:1345\n*E\n"})
@e0g(parameters = 0)
public final class k29 {

    /* JADX INFO: renamed from: s */
    public static final int f52456s = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z29 f52457a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<Integer> f52458b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final c29 f52459c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final x29 f52460d;

    /* JADX INFO: renamed from: e */
    public final long f52461e;

    /* JADX INFO: renamed from: f */
    public final boolean f52462f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final zz8 f52463g;

    /* JADX INFO: renamed from: h */
    public final int f52464h;

    /* JADX INFO: renamed from: i */
    public final long f52465i;

    /* JADX INFO: renamed from: j */
    public final int f52466j;

    /* JADX INFO: renamed from: k */
    public final int f52467k;

    /* JADX INFO: renamed from: l */
    public final boolean f52468l;

    /* JADX INFO: renamed from: m */
    public final int f52469m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final x13 f52470n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final s97 f52471o;

    /* JADX INFO: renamed from: p */
    @yfb
    public final n29 f52472p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final i29 f52473q;

    /* JADX INFO: renamed from: r */
    public final int f52474r;

    /* JADX INFO: renamed from: k29$a */
    public static final class C8176a extends n29 {
        public C8176a(boolean z, c29 c29Var, zz8 zz8Var, x29 x29Var) {
            super(z, c29Var, zz8Var, x29Var);
        }

        @Override // p000.n29
        @yfb
        /* JADX INFO: renamed from: createItem-pitSLOA, reason: not valid java name */
        public q29 mo30636createItempitSLOA(int i, int i2, int i3, @yfb Object obj, @gib Object obj2, @yfb List<? extends AbstractC0767t> list, long j) {
            return new q29(i, obj, list, k29.this.isVertical(), k29.this.getMainAxisSpacing(), i2, i3, k29.this.getBeforeContentPadding(), k29.this.getAfterContentPadding(), obj2, k29.this.getState().getItemAnimator$foundation_release(), j, null);
        }
    }

    public /* synthetic */ k29(z29 z29Var, List list, c29 c29Var, x29 x29Var, long j, boolean z, zz8 zz8Var, int i, long j2, int i2, int i3, boolean z2, int i4, x13 x13Var, s97 s97Var, jt3 jt3Var) {
        this(z29Var, list, c29Var, x29Var, j, z, zz8Var, i, j2, i2, i3, z2, i4, x13Var, s97Var);
    }

    public final int getAfterContentPadding() {
        return this.f52467k;
    }

    public final int getBeforeContentPadding() {
        return this.f52466j;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m30631getConstraintsmsEJaDk() {
        return this.f52461e;
    }

    /* JADX INFO: renamed from: getContentOffset-nOcc-ac, reason: not valid java name */
    public final long m30632getContentOffsetnOccac() {
        return this.f52465i;
    }

    @yfb
    public final x13 getCoroutineScope() {
        return this.f52470n;
    }

    @yfb
    public final s97 getGraphicsContext() {
        return this.f52471o;
    }

    @yfb
    public final c29 getItemProvider() {
        return this.f52459c;
    }

    public final int getLaneCount() {
        return this.f52474r;
    }

    @yfb
    public final i29 getLaneInfo() {
        return this.f52473q;
    }

    /* JADX INFO: renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m30633getLaneInfoSZVOQXA(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (i - i2 != 1) {
            return -2;
        }
        return i2;
    }

    public final int getMainAxisAvailableSize() {
        return this.f52464h;
    }

    public final int getMainAxisSpacing() {
        return this.f52469m;
    }

    @yfb
    public final zz8 getMeasureScope() {
        return this.f52463g;
    }

    @yfb
    public final n29 getMeasuredItemProvider() {
        return this.f52472p;
    }

    @yfb
    public final List<Integer> getPinnedItems() {
        return this.f52458b;
    }

    @yfb
    public final x29 getResolvedSlots() {
        return this.f52460d;
    }

    public final boolean getReverseLayout() {
        return this.f52468l;
    }

    /* JADX INFO: renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m30634getSpanRangelOCCd4c(@yfb c29 c29Var, int i, int i2) {
        boolean zIsFullSpan = c29Var.getSpanProvider().isFullSpan(i);
        int i3 = zIsFullSpan ? this.f52474r : 1;
        if (zIsFullSpan) {
            i2 = 0;
        }
        return rwf.m32226constructorimpl(i2, i3);
    }

    @yfb
    public final z29 getState() {
        return this.f52457a;
    }

    public final boolean isFullSpan(@yfb c29 c29Var, int i) {
        return c29Var.getSpanProvider().isFullSpan(i);
    }

    /* JADX INFO: renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m30635isFullSpanSZVOQXA(long j) {
        return ((int) (4294967295L & j)) - ((int) (j >> 32)) != 1;
    }

    public final boolean isVertical() {
        return this.f52462f;
    }

    private k29(z29 z29Var, List<Integer> list, c29 c29Var, x29 x29Var, long j, boolean z, zz8 zz8Var, int i, long j2, int i2, int i3, boolean z2, int i4, x13 x13Var, s97 s97Var) {
        this.f52457a = z29Var;
        this.f52458b = list;
        this.f52459c = c29Var;
        this.f52460d = x29Var;
        this.f52461e = j;
        this.f52462f = z;
        this.f52463g = zz8Var;
        this.f52464h = i;
        this.f52465i = j2;
        this.f52466j = i2;
        this.f52467k = i3;
        this.f52468l = z2;
        this.f52469m = i4;
        this.f52470n = x13Var;
        this.f52471o = s97Var;
        this.f52472p = new C8176a(z, c29Var, zz8Var, x29Var);
        this.f52473q = z29Var.getLaneInfo$foundation_release();
        this.f52474r = x29Var.getSizes().length;
    }
}
