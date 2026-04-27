package p000;

import androidx.compose.foundation.lazy.layout.InterfaceC0660b;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1334:1\n1007#2:1335\n1009#2:1337\n1008#2:1338\n1007#2:1340\n107#3:1336\n114#3:1339\n107#3:1341\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n1130#1:1335\n1131#1:1337\n1131#1:1338\n1131#1:1340\n1130#1:1336\n1131#1:1339\n1131#1:1341\n*E\n"})
@e0g(parameters = 0)
public abstract class n29 implements c09<q29> {

    /* JADX INFO: renamed from: e */
    public static final int f63056e = 8;

    /* JADX INFO: renamed from: a */
    public final boolean f63057a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final c29 f63058b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final zz8 f63059c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final x29 f63060d;

    public n29(boolean z, @yfb c29 c29Var, @yfb zz8 zz8Var, @yfb x29 x29Var) {
        this.f63057a = z;
        this.f63058b = c29Var;
        this.f63059c = zz8Var;
        this.f63060d = x29Var;
    }

    /* JADX INFO: renamed from: childConstraints-JhjzzOo, reason: not valid java name */
    private final long m31116childConstraintsJhjzzOo(int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = this.f63060d.getSizes()[i];
        } else {
            int i4 = this.f63060d.getPositions()[i];
            int i5 = (i + i2) - 1;
            i3 = (this.f63060d.getPositions()[i5] + this.f63060d.getSizes()[i5]) - i4;
        }
        return this.f63057a ? ku2.f55323b.m30775fixedWidthOenEA2s(i3) : ku2.f55323b.m30774fixedHeightOenEA2s(i3);
    }

    @yfb
    /* JADX INFO: renamed from: createItem-pitSLOA */
    public abstract q29 mo30636createItempitSLOA(int i, int i2, int i3, @yfb Object obj, @gib Object obj2, @yfb List<? extends AbstractC0767t> list, long j);

    @yfb
    /* JADX INFO: renamed from: getAndMeasure-jy6DScQ, reason: not valid java name */
    public final q29 m31117getAndMeasurejy6DScQ(int i, long j) {
        Object key = this.f63058b.getKey(i);
        Object contentType = this.f63058b.getContentType(i);
        int length = this.f63060d.getSizes().length;
        int i2 = (int) (j >> 32);
        int iCoerceAtMost = kpd.coerceAtMost(i2, length - 1);
        int iCoerceAtMost2 = kpd.coerceAtMost(((int) (j & 4294967295L)) - i2, length - iCoerceAtMost);
        long jM31116childConstraintsJhjzzOo = m31116childConstraintsJhjzzOo(iCoerceAtMost, iCoerceAtMost2);
        return mo30636createItempitSLOA(i, iCoerceAtMost, iCoerceAtMost2, key, contentType, this.f63059c.mo27165measure0kLqBqw(i, jM31116childConstraintsJhjzzOo), jM31116childConstraintsJhjzzOo);
    }

    @yfb
    public final InterfaceC0660b getKeyIndexMap() {
        return this.f63058b.getKeyIndexMap();
    }

    @Override // p000.c09
    @yfb
    /* JADX INFO: renamed from: getAndMeasure--hBUhpc */
    public q29 mo28187getAndMeasurehBUhpc(int i, int i2, int i3, long j) {
        return mo30636createItempitSLOA(i, i2, i3, this.f63058b.getKey(i), this.f63058b.getContentType(i), this.f63059c.mo27165measure0kLqBqw(i, j), j);
    }
}
