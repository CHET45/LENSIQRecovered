package p000;

import androidx.compose.foundation.lazy.layout.C0659a;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1334:1\n1321#1:1356\n1323#1:1357\n1321#1:1358\n1323#1:1360\n1323#1:1361\n317#2,8:1335\n317#2,8:1343\n69#2,4:1352\n74#2:1359\n1#3:1351\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1263#1:1356\n1283#1:1357\n1284#1:1358\n1311#1:1360\n1315#1:1361\n1200#1:1335,8\n1206#1:1343,8\n1262#1:1352,4\n1262#1:1359\n*E\n"})
@e0g(parameters = 0)
public final class q29 implements b29, b09 {

    /* JADX INFO: renamed from: y */
    public static final int f73051y = 8;

    /* JADX INFO: renamed from: d */
    public final int f73052d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Object f73053e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final List<AbstractC0767t> f73054f;

    /* JADX INFO: renamed from: g */
    public final boolean f73055g;

    /* JADX INFO: renamed from: h */
    public final int f73056h;

    /* JADX INFO: renamed from: i */
    public final int f73057i;

    /* JADX INFO: renamed from: j */
    public final int f73058j;

    /* JADX INFO: renamed from: k */
    public final int f73059k;

    /* JADX INFO: renamed from: l */
    @gib
    public final Object f73060l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final LazyLayoutItemAnimator<q29> f73061m;

    /* JADX INFO: renamed from: n */
    public final long f73062n;

    /* JADX INFO: renamed from: o */
    public boolean f73063o;

    /* JADX INFO: renamed from: p */
    public final int f73064p;

    /* JADX INFO: renamed from: q */
    public final int f73065q;

    /* JADX INFO: renamed from: r */
    public final int f73066r;

    /* JADX INFO: renamed from: s */
    public int f73067s;

    /* JADX INFO: renamed from: t */
    public int f73068t;

    /* JADX INFO: renamed from: u */
    public int f73069u;

    /* JADX INFO: renamed from: v */
    public boolean f73070v;

    /* JADX INFO: renamed from: w */
    public final long f73071w;

    /* JADX INFO: renamed from: x */
    public long f73072x;

    public /* synthetic */ q29(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j, jt3 jt3Var) {
        this(i, obj, list, z, i2, i3, i4, i5, i6, obj2, lazyLayoutItemAnimator, j);
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m31891copy4Tuh3kE(long j, qy6<? super Integer, Integer> qy6Var) {
        int iM27201getXimpl = isVertical() ? a78.m27201getXimpl(j) : qy6Var.invoke(Integer.valueOf(a78.m27201getXimpl(j))).intValue();
        boolean zIsVertical = isVertical();
        int iM27202getYimpl = a78.m27202getYimpl(j);
        if (zIsVertical) {
            iM27202getYimpl = qy6Var.invoke(Integer.valueOf(iM27202getYimpl)).intValue();
        }
        return b78.IntOffset(iM27201getXimpl, iM27202getYimpl);
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m31892getMainAxisgyyYBs(long j) {
        return isVertical() ? a78.m27202getYimpl(j) : a78.m27201getXimpl(j);
    }

    public final void applyScrollDelta(int i) {
        if (getNonScrollableItem()) {
            return;
        }
        long jMo27944getOffsetnOccac = mo27944getOffsetnOccac();
        int iM27201getXimpl = isVertical() ? a78.m27201getXimpl(jMo27944getOffsetnOccac) : a78.m27201getXimpl(jMo27944getOffsetnOccac) + i;
        boolean zIsVertical = isVertical();
        int iM27202getYimpl = a78.m27202getYimpl(jMo27944getOffsetnOccac);
        if (zIsVertical) {
            iM27202getYimpl += i;
        }
        this.f73072x = b78.IntOffset(iM27201getXimpl, iM27202getYimpl);
        int placeablesCount = getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            C0659a animation = this.f73061m.getAnimation(getKey(), i2);
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

    @Override // p000.b09
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo27921getConstraintsmsEJaDk() {
        return this.f73062n;
    }

    @Override // p000.b29
    @gib
    public Object getContentType() {
        return this.f73060l;
    }

    public final int getCrossAxisSize() {
        return this.f73066r;
    }

    @Override // p000.b29, p000.b09
    public int getIndex() {
        return this.f73052d;
    }

    @Override // p000.b29, p000.b09
    @yfb
    public Object getKey() {
        return this.f73053e;
    }

    @Override // p000.b29, p000.b09
    public int getLane() {
        return this.f73056h;
    }

    public final int getMainAxisOffset() {
        return !isVertical() ? a78.m27201getXimpl(mo27944getOffsetnOccac()) : a78.m27202getYimpl(mo27944getOffsetnOccac());
    }

    public final int getMainAxisSize() {
        return this.f73064p;
    }

    @Override // p000.b09
    public int getMainAxisSizeWithSpacings() {
        return this.f73065q;
    }

    @Override // p000.b09
    public boolean getNonScrollableItem() {
        return this.f73070v;
    }

    @Override // p000.b09
    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    public long mo27922getOffsetBjo55l4(int i) {
        return mo27944getOffsetnOccac();
    }

    @Override // p000.b29
    /* JADX INFO: renamed from: getOffset-nOcc-ac */
    public long mo27944getOffsetnOccac() {
        return this.f73072x;
    }

    @Override // p000.b09
    @gib
    public Object getParentData(int i) {
        return this.f73054f.get(i).getParentData();
    }

    @Override // p000.b09
    public int getPlaceablesCount() {
        return this.f73054f.size();
    }

    @Override // p000.b29
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo27945getSizeYbymL2g() {
        return this.f73071w;
    }

    @Override // p000.b09
    public int getSpan() {
        return this.f73057i;
    }

    @Override // p000.b09
    public boolean isVertical() {
        return this.f73055g;
    }

    public final boolean isVisible() {
        return this.f73063o;
    }

    public final void place(@yfb AbstractC0767t.a aVar, @yfb k29 k29Var) {
        u97 layer;
        if (this.f73067s == -1) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List<AbstractC0767t> list = this.f73054f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC0767t abstractC0767t = list.get(i);
            int height = this.f73068t - (isVertical() ? abstractC0767t.getHeight() : abstractC0767t.getWidth());
            int i2 = this.f73069u;
            long jMo27944getOffsetnOccac = mo27944getOffsetnOccac();
            C0659a animation = this.f73061m.getAnimation(getKey(), i);
            if (animation != null) {
                long jM27205plusqkQi6aY = a78.m27205plusqkQi6aY(jMo27944getOffsetnOccac, animation.m27479getPlacementDeltanOccac());
                if ((m31892getMainAxisgyyYBs(jMo27944getOffsetnOccac) <= height && m31892getMainAxisgyyYBs(jM27205plusqkQi6aY) <= height) || (m31892getMainAxisgyyYBs(jMo27944getOffsetnOccac) >= i2 && m31892getMainAxisgyyYBs(jM27205plusqkQi6aY) >= i2)) {
                    animation.cancelPlacementAnimation();
                }
                layer = animation.getLayer();
                jMo27944getOffsetnOccac = jM27205plusqkQi6aY;
            } else {
                layer = null;
            }
            if (k29Var.getReverseLayout()) {
                jMo27944getOffsetnOccac = b78.IntOffset(isVertical() ? a78.m27201getXimpl(jMo27944getOffsetnOccac) : (this.f73067s - a78.m27201getXimpl(jMo27944getOffsetnOccac)) - (isVertical() ? abstractC0767t.getHeight() : abstractC0767t.getWidth()), isVertical() ? (this.f73067s - a78.m27202getYimpl(jMo27944getOffsetnOccac)) - (isVertical() ? abstractC0767t.getHeight() : abstractC0767t.getWidth()) : a78.m27202getYimpl(jMo27944getOffsetnOccac));
            }
            long jM27205plusqkQi6aY2 = a78.m27205plusqkQi6aY(jMo27944getOffsetnOccac, k29Var.m30632getContentOffsetnOccac());
            if (animation != null) {
                animation.m27481setFinalOffsetgyyYBs(jM27205plusqkQi6aY2);
            }
            if (layer != null) {
                AbstractC0767t.a.m27714placeRelativeWithLayeraW9wM$default(aVar, abstractC0767t, jM27205plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                AbstractC0767t.a.m27713placeRelativeWithLayeraW9wM$default(aVar, abstractC0767t, jM27205plusqkQi6aY2, 0.0f, (qy6) null, 6, (Object) null);
            }
        }
    }

    public final void position(int i, int i2, int i3) {
        this.f73067s = i3;
        this.f73068t = -this.f73058j;
        this.f73069u = i3 + this.f73059k;
        this.f73072x = isVertical() ? b78.IntOffset(i2, i) : b78.IntOffset(i, i2);
    }

    @Override // p000.b09
    public void setNonScrollableItem(boolean z) {
        this.f73070v = z;
    }

    public final void setVisible(boolean z) {
        this.f73063o = z;
    }

    @yfb
    public String toString() {
        return super.toString();
    }

    public final void updateMainAxisLayoutSize(int i) {
        this.f73067s = i;
        this.f73069u = i + this.f73059k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q29(int i, Object obj, List<? extends AbstractC0767t> list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, LazyLayoutItemAnimator<q29> lazyLayoutItemAnimator, long j) {
        Integer numValueOf;
        this.f73052d = i;
        this.f73053e = obj;
        this.f73054f = list;
        this.f73055g = z;
        this.f73056h = i3;
        this.f73057i = i4;
        this.f73058j = i5;
        this.f73059k = i6;
        this.f73060l = obj2;
        this.f73061m = lazyLayoutItemAnimator;
        this.f73062n = j;
        int i7 = 1;
        this.f73063o = true;
        Integer num = null;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            AbstractC0767t abstractC0767t = (AbstractC0767t) list.get(0);
            numValueOf = Integer.valueOf(isVertical() ? abstractC0767t.getHeight() : abstractC0767t.getWidth());
            int lastIndex = l82.getLastIndex(list);
            if (1 <= lastIndex) {
                int i8 = 1;
                while (true) {
                    AbstractC0767t abstractC0767t2 = (AbstractC0767t) list.get(i8);
                    Integer numValueOf2 = Integer.valueOf(isVertical() ? abstractC0767t2.getHeight() : abstractC0767t2.getWidth());
                    numValueOf = numValueOf2.compareTo(numValueOf) > 0 ? numValueOf2 : numValueOf;
                    if (i8 == lastIndex) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        this.f73064p = iIntValue;
        this.f73065q = kpd.coerceAtLeast(iIntValue + i2, 0);
        List<AbstractC0767t> list2 = this.f73054f;
        if (!list2.isEmpty()) {
            AbstractC0767t abstractC0767t3 = list2.get(0);
            Integer numValueOf3 = Integer.valueOf(isVertical() ? abstractC0767t3.getWidth() : abstractC0767t3.getHeight());
            int lastIndex2 = l82.getLastIndex(list2);
            if (1 <= lastIndex2) {
                while (true) {
                    AbstractC0767t abstractC0767t4 = list2.get(i7);
                    Integer numValueOf4 = Integer.valueOf(isVertical() ? abstractC0767t4.getWidth() : abstractC0767t4.getHeight());
                    numValueOf3 = numValueOf4.compareTo(numValueOf3) > 0 ? numValueOf4 : numValueOf3;
                    if (i7 == lastIndex2) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            num = numValueOf3;
        }
        int iIntValue2 = num != null ? num.intValue() : 0;
        this.f73066r = iIntValue2;
        this.f73067s = -1;
        this.f73071w = isVertical() ? s78.IntSize(iIntValue2, this.f73064p) : s78.IntSize(this.f73064p, iIntValue2);
        this.f73072x = a78.f545b.m27211getZeronOccac();
    }

    private final int getMainAxisSize(AbstractC0767t abstractC0767t) {
        return isVertical() ? abstractC0767t.getHeight() : abstractC0767t.getWidth();
    }

    @Override // p000.b09
    public void position(int i, int i2, int i3, int i4) {
        if (isVertical()) {
            i3 = i4;
        }
        position(i, i2, i3);
    }
}
