package p000;

import androidx.compose.foundation.lazy.layout.InterfaceC0660b;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridMeasuredItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
@e0g(parameters = 1)
public abstract class ky8 implements c09<iy8> {

    /* JADX INFO: renamed from: d */
    public static final int f55634d = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final yx8 f55635a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final zz8 f55636b;

    /* JADX INFO: renamed from: c */
    public final int f55637c;

    @ah5
    public ky8(@yfb yx8 yx8Var, @yfb zz8 zz8Var, int i) {
        this.f55635a = yx8Var;
        this.f55636b = zz8Var;
        this.f55637c = i;
    }

    @yfb
    /* JADX INFO: renamed from: createItem-O3s9Psw */
    public abstract iy8 mo28876createItemO3s9Psw(int i, @yfb Object obj, @gib Object obj2, int i2, int i3, @yfb List<? extends AbstractC0767t> list, long j, int i4, int i5);

    @yfb
    /* JADX INFO: renamed from: getAndMeasure-m8Kt_7k, reason: not valid java name */
    public final iy8 m30797getAndMeasurem8Kt_7k(int i, long j, int i2, int i3, int i4) {
        int iM30764getMinHeightimpl;
        Object key = this.f55635a.getKey(i);
        Object contentType = this.f55635a.getContentType(i);
        List<AbstractC0767t> listMo27165measure0kLqBqw = this.f55636b.mo27165measure0kLqBqw(i, j);
        if (ku2.m30761getHasFixedWidthimpl(j)) {
            iM30764getMinHeightimpl = ku2.m30765getMinWidthimpl(j);
        } else {
            if (!ku2.m30760getHasFixedHeightimpl(j)) {
                throw new IllegalArgumentException("does not have fixed height");
            }
            iM30764getMinHeightimpl = ku2.m30764getMinHeightimpl(j);
        }
        return mo28876createItemO3s9Psw(i, key, contentType, iM30764getMinHeightimpl, i4, listMo27165measure0kLqBqw, j, i2, i3);
    }

    @yfb
    public final InterfaceC0660b getKeyIndexMap() {
        return this.f55635a.getKeyIndexMap();
    }

    @Override // p000.c09
    @yfb
    /* JADX INFO: renamed from: getAndMeasure--hBUhpc */
    public iy8 mo28187getAndMeasurehBUhpc(int i, int i2, int i3, long j) {
        return m30797getAndMeasurem8Kt_7k(i, j, i2, i3, this.f55637c);
    }
}
