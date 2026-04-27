package p000;

import androidx.compose.foundation.lazy.layout.InterfaceC0660b;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class d19 implements c09<b19> {

    /* JADX INFO: renamed from: d */
    public static final int f28219d = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final u09 f28220a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final zz8 f28221b;

    /* JADX INFO: renamed from: c */
    public final long f28222c;

    @ah5
    public /* synthetic */ d19(long j, boolean z, u09 u09Var, zz8 zz8Var, jt3 jt3Var) {
        this(j, z, u09Var, zz8Var);
    }

    /* JADX INFO: renamed from: getAndMeasure-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ b19 m28564getAndMeasure0kLqBqw$default(d19 d19Var, int i, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i2 & 2) != 0) {
            j = d19Var.f28222c;
        }
        return d19Var.m28566getAndMeasure0kLqBqw(i, j);
    }

    @yfb
    /* JADX INFO: renamed from: createItem-X9ElhV4, reason: not valid java name */
    public abstract b19 mo28565createItemX9ElhV4(int i, @yfb Object obj, @gib Object obj2, @yfb List<? extends AbstractC0767t> list, long j);

    @yfb
    /* JADX INFO: renamed from: getAndMeasure-0kLqBqw, reason: not valid java name */
    public final b19 m28566getAndMeasure0kLqBqw(int i, long j) {
        return mo28565createItemX9ElhV4(i, this.f28220a.getKey(i), this.f28220a.getContentType(i), this.f28221b.mo27165measure0kLqBqw(i, j), j);
    }

    /* JADX INFO: renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m28567getChildConstraintsmsEJaDk() {
        return this.f28222c;
    }

    @yfb
    public final InterfaceC0660b getKeyIndexMap() {
        return this.f28220a.getKeyIndexMap();
    }

    private d19(long j, boolean z, u09 u09Var, zz8 zz8Var) {
        this.f28220a = u09Var;
        this.f28221b = zz8Var;
        this.f28222c = nu2.Constraints$default(0, z ? ku2.m30763getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : ku2.m30762getMaxHeightimpl(j), 5, null);
    }

    @Override // p000.c09
    @yfb
    /* JADX INFO: renamed from: getAndMeasure--hBUhpc */
    public b19 mo28187getAndMeasurehBUhpc(int i, int i2, int i3, long j) {
        return m28566getAndMeasure0kLqBqw(i, j);
    }
}
