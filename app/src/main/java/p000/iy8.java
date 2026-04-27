package p000;

import androidx.compose.foundation.lazy.layout.C0659a;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n229#1:240\n229#1:241\n229#1:243\n33#2,6:234\n1#3:242\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n169#1:240\n173#1:241\n204#1:243\n79#1:234,6\n*E\n"})
@e0g(parameters = 0)
public final class iy8 implements xx8, b09 {

    /* JADX INFO: renamed from: C */
    public static final int f48867C = 8;

    /* JADX INFO: renamed from: A */
    public int f48868A;

    /* JADX INFO: renamed from: B */
    public boolean f48869B;

    /* JADX INFO: renamed from: d */
    public final int f48870d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Object f48871e;

    /* JADX INFO: renamed from: f */
    public final boolean f48872f;

    /* JADX INFO: renamed from: g */
    public final int f48873g;

    /* JADX INFO: renamed from: h */
    public final boolean f48874h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final ov8 f48875i;

    /* JADX INFO: renamed from: j */
    public final int f48876j;

    /* JADX INFO: renamed from: k */
    public final int f48877k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final List<AbstractC0767t> f48878l;

    /* JADX INFO: renamed from: m */
    public final long f48879m;

    /* JADX INFO: renamed from: n */
    @gib
    public final Object f48880n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final LazyLayoutItemAnimator<iy8> f48881o;

    /* JADX INFO: renamed from: p */
    public final long f48882p;

    /* JADX INFO: renamed from: q */
    public final int f48883q;

    /* JADX INFO: renamed from: r */
    public final int f48884r;

    /* JADX INFO: renamed from: s */
    public final int f48885s;

    /* JADX INFO: renamed from: t */
    public final int f48886t;

    /* JADX INFO: renamed from: u */
    public int f48887u;

    /* JADX INFO: renamed from: v */
    public int f48888v;

    /* JADX INFO: renamed from: w */
    public int f48889w;

    /* JADX INFO: renamed from: x */
    public final long f48890x;

    /* JADX INFO: renamed from: y */
    public long f48891y;

    /* JADX INFO: renamed from: z */
    public int f48892z;

    public /* synthetic */ iy8(int i, Object obj, boolean z, int i2, int i3, boolean z2, ov8 ov8Var, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7, jt3 jt3Var) {
        this(i, obj, z, i2, i3, z2, ov8Var, i4, i5, list, j, obj2, lazyLayoutItemAnimator, j2, i6, i7);
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m30414copy4Tuh3kE(long j, qy6<? super Integer, Integer> qy6Var) {
        int iM27201getXimpl = isVertical() ? a78.m27201getXimpl(j) : qy6Var.invoke(Integer.valueOf(a78.m27201getXimpl(j))).intValue();
        boolean zIsVertical = isVertical();
        int iM27202getYimpl = a78.m27202getYimpl(j);
        if (zIsVertical) {
            iM27202getYimpl = qy6Var.invoke(Integer.valueOf(iM27202getYimpl)).intValue();
        }
        return b78.IntOffset(iM27201getXimpl, iM27202getYimpl);
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m30415getMainAxisgyyYBs(long j) {
        return isVertical() ? a78.m27202getYimpl(j) : a78.m27201getXimpl(j);
    }

    public final void applyScrollDelta(int i) {
        if (getNonScrollableItem()) {
            return;
        }
        long jMo30416getOffsetnOccac = mo30416getOffsetnOccac();
        int iM27201getXimpl = isVertical() ? a78.m27201getXimpl(jMo30416getOffsetnOccac) : a78.m27201getXimpl(jMo30416getOffsetnOccac) + i;
        boolean zIsVertical = isVertical();
        int iM27202getYimpl = a78.m27202getYimpl(jMo30416getOffsetnOccac);
        if (zIsVertical) {
            iM27202getYimpl += i;
        }
        this.f48891y = b78.IntOffset(iM27201getXimpl, iM27202getYimpl);
        int placeablesCount = getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            C0659a animation = this.f48881o.getAnimation(getKey(), i2);
            if (animation != null) {
                long jM27480getRawOffsetnOccac = animation.m27480getRawOffsetnOccac();
                int iM27201getXimpl2 = isVertical() ? a78.m27201getXimpl(jM27480getRawOffsetnOccac) : Integer.valueOf(a78.m27201getXimpl(jM27480getRawOffsetnOccac) + i).intValue();
                boolean zIsVertical2 = isVertical();
                int iM27202getYimpl2 = a78.m27202getYimpl(jM27480getRawOffsetnOccac);
                if (zIsVertical2) {
                    iM27202getYimpl2 += i;
                }
                animation.m27483setRawOffsetgyyYBs(b78.IntOffset(iM27201getXimpl2, iM27202getYimpl2));
            }
        }
    }

    @Override // p000.xx8
    public int getColumn() {
        return this.f48868A;
    }

    @Override // p000.b09
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo27921getConstraintsmsEJaDk() {
        return this.f48882p;
    }

    @Override // p000.xx8
    @gib
    public Object getContentType() {
        return this.f48880n;
    }

    public final int getCrossAxisSize() {
        return this.f48873g;
    }

    @Override // p000.xx8, p000.b09
    public int getIndex() {
        return this.f48870d;
    }

    @Override // p000.xx8, p000.b09
    @yfb
    public Object getKey() {
        return this.f48871e;
    }

    @Override // p000.b09
    public int getLane() {
        return this.f48883q;
    }

    public final int getMainAxisSize() {
        return this.f48885s;
    }

    @Override // p000.b09
    public int getMainAxisSizeWithSpacings() {
        return this.f48886t;
    }

    @Override // p000.b09
    public boolean getNonScrollableItem() {
        return this.f48869B;
    }

    @Override // p000.b09
    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    public long mo27922getOffsetBjo55l4(int i) {
        return mo30416getOffsetnOccac();
    }

    @Override // p000.xx8
    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public long mo30416getOffsetnOccac() {
        return this.f48891y;
    }

    @Override // p000.b09
    @gib
    public Object getParentData(int i) {
        return this.f48878l.get(i).getParentData();
    }

    @Override // p000.b09
    public int getPlaceablesCount() {
        return this.f48878l.size();
    }

    @Override // p000.xx8
    public int getRow() {
        return this.f48892z;
    }

    @Override // p000.xx8
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public long mo30417getSizeYbymL2g() {
        return this.f48890x;
    }

    @Override // p000.b09
    public int getSpan() {
        return this.f48884r;
    }

    @Override // p000.b09
    public boolean isVertical() {
        return this.f48872f;
    }

    public final void place(@yfb AbstractC0767t.a aVar) {
        u97 layer;
        if (this.f48887u == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            AbstractC0767t abstractC0767t = this.f48878l.get(i);
            int mainAxisSize = this.f48888v - getMainAxisSize(abstractC0767t);
            int i2 = this.f48889w;
            long jMo30416getOffsetnOccac = mo30416getOffsetnOccac();
            C0659a animation = this.f48881o.getAnimation(getKey(), i);
            if (animation != null) {
                long jM27205plusqkQi6aY = a78.m27205plusqkQi6aY(jMo30416getOffsetnOccac, animation.m27479getPlacementDeltanOccac());
                if ((m30415getMainAxisgyyYBs(jMo30416getOffsetnOccac) <= mainAxisSize && m30415getMainAxisgyyYBs(jM27205plusqkQi6aY) <= mainAxisSize) || (m30415getMainAxisgyyYBs(jMo30416getOffsetnOccac) >= i2 && m30415getMainAxisgyyYBs(jM27205plusqkQi6aY) >= i2)) {
                    animation.cancelPlacementAnimation();
                }
                layer = animation.getLayer();
                jMo30416getOffsetnOccac = jM27205plusqkQi6aY;
            } else {
                layer = null;
            }
            if (this.f48874h) {
                jMo30416getOffsetnOccac = b78.IntOffset(isVertical() ? a78.m27201getXimpl(jMo30416getOffsetnOccac) : (this.f48887u - a78.m27201getXimpl(jMo30416getOffsetnOccac)) - getMainAxisSize(abstractC0767t), isVertical() ? (this.f48887u - a78.m27202getYimpl(jMo30416getOffsetnOccac)) - getMainAxisSize(abstractC0767t) : a78.m27202getYimpl(jMo30416getOffsetnOccac));
            }
            long jM27205plusqkQi6aY2 = a78.m27205plusqkQi6aY(jMo30416getOffsetnOccac, this.f48879m);
            if (animation != null) {
                animation.m27481setFinalOffsetgyyYBs(jM27205plusqkQi6aY2);
            }
            if (isVertical()) {
                if (layer != null) {
                    AbstractC0767t.a.m27716placeWithLayeraW9wM$default(aVar, abstractC0767t, jM27205plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
                } else {
                    AbstractC0767t.a.m27715placeWithLayeraW9wM$default(aVar, abstractC0767t, jM27205plusqkQi6aY2, 0.0f, (qy6) null, 6, (Object) null);
                }
            } else if (layer != null) {
                AbstractC0767t.a.m27714placeRelativeWithLayeraW9wM$default(aVar, abstractC0767t, jM27205plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                AbstractC0767t.a.m27713placeRelativeWithLayeraW9wM$default(aVar, abstractC0767t, jM27205plusqkQi6aY2, 0.0f, (qy6) null, 6, (Object) null);
            }
        }
    }

    @Override // p000.b09
    public void position(int i, int i2, int i3, int i4) {
        position(i, i2, i3, i4, -1, -1);
    }

    @Override // p000.b09
    public void setNonScrollableItem(boolean z) {
        this.f48869B = z;
    }

    public final void updateMainAxisLayoutSize(int i) {
        this.f48887u = i;
        this.f48889w = i + this.f48877k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private iy8(int i, Object obj, boolean z, int i2, int i3, boolean z2, ov8 ov8Var, int i4, int i5, List<? extends AbstractC0767t> list, long j, Object obj2, LazyLayoutItemAnimator<iy8> lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.f48870d = i;
        this.f48871e = obj;
        this.f48872f = z;
        this.f48873g = i2;
        this.f48874h = z2;
        this.f48875i = ov8Var;
        this.f48876j = i4;
        this.f48877k = i5;
        this.f48878l = list;
        this.f48879m = j;
        this.f48880n = obj2;
        this.f48881o = lazyLayoutItemAnimator;
        this.f48882p = j2;
        this.f48883q = i6;
        this.f48884r = i7;
        this.f48887u = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC0767t abstractC0767t = (AbstractC0767t) list.get(i8);
            iMax = Math.max(iMax, isVertical() ? abstractC0767t.getHeight() : abstractC0767t.getWidth());
        }
        this.f48885s = iMax;
        this.f48886t = kpd.coerceAtLeast(iMax + i3, 0);
        this.f48890x = isVertical() ? s78.IntSize(this.f48873g, iMax) : s78.IntSize(iMax, this.f48873g);
        this.f48891y = a78.f545b.m27211getZeronOccac();
        this.f48892z = -1;
        this.f48868A = -1;
    }

    private final int getMainAxisSize(AbstractC0767t abstractC0767t) {
        return isVertical() ? abstractC0767t.getHeight() : abstractC0767t.getWidth();
    }

    public final void position(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f48887u = isVertical() ? i4 : i3;
        if (!isVertical()) {
            i3 = i4;
        }
        if (isVertical() && this.f48875i == ov8.Rtl) {
            i2 = (i3 - i2) - this.f48873g;
        }
        this.f48891y = isVertical() ? b78.IntOffset(i2, i) : b78.IntOffset(i, i2);
        this.f48892z = i5;
        this.f48868A = i6;
        this.f48888v = -this.f48876j;
        this.f48889w = this.f48887u + this.f48877k;
    }
}
