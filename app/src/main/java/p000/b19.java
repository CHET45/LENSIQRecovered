package p000;

import androidx.compose.foundation.lazy.layout.C0659a;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n258#1:275\n258#1:277\n33#2,6:263\n69#2,6:269\n1#3:276\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n187#1:275\n231#1:277\n101#1:263,6\n137#1:269,6\n*E\n"})
@e0g(parameters = 0)
public final class b19 implements t09, b09 {

    /* JADX INFO: renamed from: D */
    public static final int f12379D = 8;

    /* JADX INFO: renamed from: A */
    public int f12380A;

    /* JADX INFO: renamed from: B */
    public int f12381B;

    /* JADX INFO: renamed from: C */
    @yfb
    public final int[] f12382C;

    /* JADX INFO: renamed from: d */
    public final int f12383d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final List<AbstractC0767t> f12384e;

    /* JADX INFO: renamed from: f */
    public final boolean f12385f;

    /* JADX INFO: renamed from: g */
    @gib
    public final InterfaceC9407mm.b f12386g;

    /* JADX INFO: renamed from: h */
    @gib
    public final InterfaceC9407mm.c f12387h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final ov8 f12388i;

    /* JADX INFO: renamed from: j */
    public final boolean f12389j;

    /* JADX INFO: renamed from: k */
    public final int f12390k;

    /* JADX INFO: renamed from: l */
    public final int f12391l;

    /* JADX INFO: renamed from: m */
    public final int f12392m;

    /* JADX INFO: renamed from: n */
    public final long f12393n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final Object f12394o;

    /* JADX INFO: renamed from: p */
    @gib
    public final Object f12395p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final LazyLayoutItemAnimator<b19> f12396q;

    /* JADX INFO: renamed from: r */
    public final long f12397r;

    /* JADX INFO: renamed from: s */
    public int f12398s;

    /* JADX INFO: renamed from: t */
    public final int f12399t;

    /* JADX INFO: renamed from: u */
    public final int f12400u;

    /* JADX INFO: renamed from: v */
    public final int f12401v;

    /* JADX INFO: renamed from: w */
    public final int f12402w;

    /* JADX INFO: renamed from: x */
    public final int f12403x;

    /* JADX INFO: renamed from: y */
    public boolean f12404y;

    /* JADX INFO: renamed from: z */
    public int f12405z;

    @ah5
    public /* synthetic */ b19(int i, List list, boolean z, InterfaceC9407mm.b bVar, InterfaceC9407mm.c cVar, ov8 ov8Var, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, jt3 jt3Var) {
        this(i, list, z, bVar, cVar, ov8Var, z2, i2, i3, i4, j, obj, obj2, lazyLayoutItemAnimator, j2);
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m27941copy4Tuh3kE(long j, qy6<? super Integer, Integer> qy6Var) {
        int iM27201getXimpl = isVertical() ? a78.m27201getXimpl(j) : qy6Var.invoke(Integer.valueOf(a78.m27201getXimpl(j))).intValue();
        boolean zIsVertical = isVertical();
        int iM27202getYimpl = a78.m27202getYimpl(j);
        if (zIsVertical) {
            iM27202getYimpl = qy6Var.invoke(Integer.valueOf(iM27202getYimpl)).intValue();
        }
        return b78.IntOffset(iM27201getXimpl, iM27202getYimpl);
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m27942getMainAxisgyyYBs(long j) {
        return isVertical() ? a78.m27202getYimpl(j) : a78.m27201getXimpl(j);
    }

    private final int getMainAxisSize(AbstractC0767t abstractC0767t) {
        return isVertical() ? abstractC0767t.getHeight() : abstractC0767t.getWidth();
    }

    public final void applyScrollDelta(int i, boolean z) {
        if (getNonScrollableItem()) {
            return;
        }
        this.f12398s = getOffset() + i;
        int length = this.f12382C.length;
        for (int i2 = 0; i2 < length; i2++) {
            if ((isVertical() && i2 % 2 == 1) || (!isVertical() && i2 % 2 == 0)) {
                int[] iArr = this.f12382C;
                iArr[i2] = iArr[i2] + i;
            }
        }
        if (z) {
            int placeablesCount = getPlaceablesCount();
            for (int i3 = 0; i3 < placeablesCount; i3++) {
                C0659a animation = this.f12396q.getAnimation(getKey(), i3);
                if (animation != null) {
                    long jM27480getRawOffsetnOccac = animation.m27480getRawOffsetnOccac();
                    int iM27201getXimpl = isVertical() ? a78.m27201getXimpl(jM27480getRawOffsetnOccac) : Integer.valueOf(a78.m27201getXimpl(jM27480getRawOffsetnOccac) + i).intValue();
                    boolean zIsVertical = isVertical();
                    int iM27202getYimpl = a78.m27202getYimpl(jM27480getRawOffsetnOccac);
                    if (zIsVertical) {
                        iM27202getYimpl += i;
                    }
                    animation.m27483setRawOffsetgyyYBs(b78.IntOffset(iM27201getXimpl, iM27202getYimpl));
                }
            }
        }
    }

    @Override // p000.b09
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo27921getConstraintsmsEJaDk() {
        return this.f12397r;
    }

    @Override // p000.t09
    @gib
    public Object getContentType() {
        return this.f12395p;
    }

    public final int getCrossAxisSize() {
        return this.f12403x;
    }

    @Override // p000.t09, p000.b09
    public int getIndex() {
        return this.f12383d;
    }

    @Override // p000.t09, p000.b09
    @yfb
    public Object getKey() {
        return this.f12394o;
    }

    @Override // p000.b09
    public int getLane() {
        return this.f12400u;
    }

    @Override // p000.b09
    public int getMainAxisSizeWithSpacings() {
        return this.f12402w;
    }

    @Override // p000.b09
    public boolean getNonScrollableItem() {
        return this.f12404y;
    }

    @Override // p000.t09
    public int getOffset() {
        return this.f12398s;
    }

    @Override // p000.b09
    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    public long mo27922getOffsetBjo55l4(int i) {
        int[] iArr = this.f12382C;
        int i2 = i * 2;
        return b78.IntOffset(iArr[i2], iArr[i2 + 1]);
    }

    @Override // p000.b09
    @gib
    public Object getParentData(int i) {
        return this.f12384e.get(i).getParentData();
    }

    @Override // p000.b09
    public int getPlaceablesCount() {
        return this.f12384e.size();
    }

    @Override // p000.t09
    public int getSize() {
        return this.f12399t;
    }

    @Override // p000.b09
    public int getSpan() {
        return this.f12401v;
    }

    @Override // p000.b09
    public boolean isVertical() {
        return this.f12385f;
    }

    public final void place(@yfb AbstractC0767t.a aVar, boolean z) {
        u97 layer;
        if (this.f12405z == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            AbstractC0767t abstractC0767t = this.f12384e.get(i);
            int mainAxisSize = this.f12380A - getMainAxisSize(abstractC0767t);
            int i2 = this.f12381B;
            long jMo27922getOffsetBjo55l4 = mo27922getOffsetBjo55l4(i);
            C0659a animation = this.f12396q.getAnimation(getKey(), i);
            if (animation != null) {
                if (z) {
                    animation.m27482setLookaheadOffsetgyyYBs(jMo27922getOffsetBjo55l4);
                } else {
                    if (!a78.m27200equalsimpl0(animation.m27478getLookaheadOffsetnOccac(), C0659a.f4854s.m27484getNotInitializednOccac())) {
                        jMo27922getOffsetBjo55l4 = animation.m27478getLookaheadOffsetnOccac();
                    }
                    long jM27205plusqkQi6aY = a78.m27205plusqkQi6aY(jMo27922getOffsetBjo55l4, animation.m27479getPlacementDeltanOccac());
                    if ((m27942getMainAxisgyyYBs(jMo27922getOffsetBjo55l4) <= mainAxisSize && m27942getMainAxisgyyYBs(jM27205plusqkQi6aY) <= mainAxisSize) || (m27942getMainAxisgyyYBs(jMo27922getOffsetBjo55l4) >= i2 && m27942getMainAxisgyyYBs(jM27205plusqkQi6aY) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo27922getOffsetBjo55l4 = jM27205plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (this.f12389j) {
                jMo27922getOffsetBjo55l4 = b78.IntOffset(isVertical() ? a78.m27201getXimpl(jMo27922getOffsetBjo55l4) : (this.f12405z - a78.m27201getXimpl(jMo27922getOffsetBjo55l4)) - getMainAxisSize(abstractC0767t), isVertical() ? (this.f12405z - a78.m27202getYimpl(jMo27922getOffsetBjo55l4)) - getMainAxisSize(abstractC0767t) : a78.m27202getYimpl(jMo27922getOffsetBjo55l4));
            }
            long jM27205plusqkQi6aY2 = a78.m27205plusqkQi6aY(jMo27922getOffsetBjo55l4, this.f12393n);
            if (!z && animation != null) {
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
        position(i, i3, i4);
    }

    @Override // p000.b09
    public void setNonScrollableItem(boolean z) {
        this.f12404y = z;
    }

    public final void updateMainAxisLayoutSize(int i) {
        this.f12405z = i;
        this.f12381B = i + this.f12391l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b19(int i, List<? extends AbstractC0767t> list, boolean z, InterfaceC9407mm.b bVar, InterfaceC9407mm.c cVar, ov8 ov8Var, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator<b19> lazyLayoutItemAnimator, long j2) {
        this.f12383d = i;
        this.f12384e = list;
        this.f12385f = z;
        this.f12386g = bVar;
        this.f12387h = cVar;
        this.f12388i = ov8Var;
        this.f12389j = z2;
        this.f12390k = i2;
        this.f12391l = i3;
        this.f12392m = i4;
        this.f12393n = j;
        this.f12394o = obj;
        this.f12395p = obj2;
        this.f12396q = lazyLayoutItemAnimator;
        this.f12397r = j2;
        this.f12401v = 1;
        this.f12405z = Integer.MIN_VALUE;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0767t abstractC0767t = (AbstractC0767t) list.get(i5);
            height += isVertical() ? abstractC0767t.getHeight() : abstractC0767t.getWidth();
            iMax = Math.max(iMax, !isVertical() ? abstractC0767t.getHeight() : abstractC0767t.getWidth());
        }
        this.f12399t = height;
        this.f12402w = kpd.coerceAtLeast(getSize() + this.f12392m, 0);
        this.f12403x = iMax;
        this.f12382C = new int[this.f12384e.size() * 2];
    }

    public final void position(int i, int i2, int i3) {
        int width;
        this.f12398s = i;
        this.f12405z = isVertical() ? i3 : i2;
        List<AbstractC0767t> list = this.f12384e;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0767t abstractC0767t = list.get(i4);
            int i5 = i4 * 2;
            if (isVertical()) {
                int[] iArr = this.f12382C;
                InterfaceC9407mm.b bVar = this.f12386g;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i5] = bVar.align(abstractC0767t.getWidth(), i2, this.f12388i);
                this.f12382C[i5 + 1] = i;
                width = abstractC0767t.getHeight();
            } else {
                int[] iArr2 = this.f12382C;
                iArr2[i5] = i;
                int i6 = i5 + 1;
                InterfaceC9407mm.c cVar = this.f12387h;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr2[i6] = cVar.align(abstractC0767t.getHeight(), i3);
                width = abstractC0767t.getWidth();
            }
            i += width;
        }
        this.f12380A = -this.f12390k;
        this.f12381B = this.f12405z + this.f12391l;
    }
}
