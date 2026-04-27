package p000;

import androidx.compose.foundation.lazy.layout.InterfaceC0660b;
import java.util.List;
import p000.yy8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
@e0g(parameters = 0)
public abstract class my8 {

    /* JADX INFO: renamed from: g */
    public static final int f62785g = 8;

    /* JADX INFO: renamed from: a */
    public final boolean f62786a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final uy8 f62787b;

    /* JADX INFO: renamed from: c */
    public final int f62788c;

    /* JADX INFO: renamed from: d */
    public final int f62789d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final ky8 f62790e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final yy8 f62791f;

    public my8(boolean z, @yfb uy8 uy8Var, int i, int i2, @yfb ky8 ky8Var, @yfb yy8 yy8Var) {
        this.f62786a = z;
        this.f62787b = uy8Var;
        this.f62788c = i;
        this.f62789d = i2;
        this.f62790e = ky8Var;
        this.f62791f = yy8Var;
    }

    /* JADX INFO: renamed from: childConstraints-JhjzzOo$foundation_release, reason: not valid java name */
    public final long m31092childConstraintsJhjzzOo$foundation_release(int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = this.f62787b.getSizes()[i];
        } else {
            int i4 = (i2 + i) - 1;
            i3 = (this.f62787b.getPositions()[i4] + this.f62787b.getSizes()[i4]) - this.f62787b.getPositions()[i];
        }
        int iCoerceAtLeast = kpd.coerceAtLeast(i3, 0);
        return this.f62786a ? ku2.f55323b.m30775fixedWidthOenEA2s(iCoerceAtLeast) : ku2.f55323b.m30774fixedHeightOenEA2s(iCoerceAtLeast);
    }

    @yfb
    public abstract ly8 createLine(int i, @yfb iy8[] iy8VarArr, @yfb List<ib7> list, int i2);

    @yfb
    public final ly8 getAndMeasure(int i) {
        yy8.C15886c lineConfiguration = this.f62791f.getLineConfiguration(i);
        int size = lineConfiguration.getSpans().size();
        int i2 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.f62788c) ? 0 : this.f62789d;
        iy8[] iy8VarArr = new iy8[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int iM30186getCurrentLineSpanimpl = ib7.m30186getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i4).m30189unboximpl());
            iy8 iy8VarM30797getAndMeasurem8Kt_7k = this.f62790e.m30797getAndMeasurem8Kt_7k(lineConfiguration.getFirstItemIndex() + i4, m31092childConstraintsJhjzzOo$foundation_release(i3, iM30186getCurrentLineSpanimpl), i3, iM30186getCurrentLineSpanimpl, i2);
            i3 += iM30186getCurrentLineSpanimpl;
            bth bthVar = bth.f14751a;
            iy8VarArr[i4] = iy8VarM30797getAndMeasurem8Kt_7k;
        }
        return createLine(i, iy8VarArr, lineConfiguration.getSpans(), i2);
    }

    @yfb
    public final InterfaceC0660b getKeyIndexMap() {
        return this.f62790e.getKeyIndexMap();
    }

    public final int spanOf(int i) {
        yy8 yy8Var = this.f62791f;
        return yy8Var.spanOf(i, yy8Var.getSlotsPerLine());
    }
}
