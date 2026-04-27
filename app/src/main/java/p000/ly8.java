package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n13579#2,2:87\n13644#2,3:89\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n46#1:87,2\n68#1:89,3\n*E\n"})
@e0g(parameters = 0)
public final class ly8 {

    /* JADX INFO: renamed from: i */
    public static final int f59202i = 8;

    /* JADX INFO: renamed from: a */
    public final int f59203a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final iy8[] f59204b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final uy8 f59205c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final List<ib7> f59206d;

    /* JADX INFO: renamed from: e */
    public final boolean f59207e;

    /* JADX INFO: renamed from: f */
    public final int f59208f;

    /* JADX INFO: renamed from: g */
    public final int f59209g;

    /* JADX INFO: renamed from: h */
    public final int f59210h;

    public ly8(int i, @yfb iy8[] iy8VarArr, @yfb uy8 uy8Var, @yfb List<ib7> list, boolean z, int i2) {
        this.f59203a = i;
        this.f59204b = iy8VarArr;
        this.f59205c = uy8Var;
        this.f59206d = list;
        this.f59207e = z;
        this.f59208f = i2;
        int iMax = 0;
        for (iy8 iy8Var : iy8VarArr) {
            iMax = Math.max(iMax, iy8Var.getMainAxisSize());
        }
        this.f59209g = iMax;
        this.f59210h = kpd.coerceAtLeast(iMax + this.f59208f, 0);
    }

    public final int getIndex() {
        return this.f59203a;
    }

    @yfb
    public final iy8[] getItems() {
        return this.f59204b;
    }

    public final int getMainAxisSize() {
        return this.f59209g;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.f59210h;
    }

    public final boolean isEmpty() {
        return this.f59204b.length == 0;
    }

    @yfb
    public final iy8[] position(int i, int i2, int i3) {
        iy8[] iy8VarArr = this.f59204b;
        int length = iy8VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            iy8 iy8Var = iy8VarArr[i4];
            int i7 = i5 + 1;
            int iM30186getCurrentLineSpanimpl = ib7.m30186getCurrentLineSpanimpl(this.f59206d.get(i5).m30189unboximpl());
            int i8 = this.f59205c.getPositions()[i6];
            boolean z = this.f59207e;
            iy8Var.position(i, i8, i2, i3, z ? this.f59203a : i6, z ? i6 : this.f59203a);
            bth bthVar = bth.f14751a;
            i6 += iM30186getCurrentLineSpanimpl;
            i4++;
            i5 = i7;
        }
        return this.f59204b;
    }
}
