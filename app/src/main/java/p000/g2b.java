package p000;

import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class g2b implements uba {

    /* JADX INFO: renamed from: b */
    public static final int f38298b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final f2b f38299a;

    public g2b(@yfb f2b f2bVar) {
        this.f38299a = f2bVar;
    }

    public static /* synthetic */ g2b copy$default(g2b g2bVar, f2b f2bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f2bVar = g2bVar.f38299a;
        }
        return g2bVar.copy(f2bVar);
    }

    @yfb
    public final f2b component1() {
        return this.f38299a;
    }

    @yfb
    public final g2b copy(@yfb f2b f2bVar) {
        return new g2b(f2bVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2b) && md8.areEqual(this.f38299a, ((g2b) obj).f38299a);
    }

    @yfb
    public final f2b getMeasurePolicy() {
        return this.f38299a;
    }

    public int hashCode() {
        return this.f38299a.hashCode();
    }

    @Override // p000.uba
    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        return this.f38299a.maxIntrinsicHeight(gd8Var, yba.getChildrenOfVirtualChildren(gd8Var), i);
    }

    @Override // p000.uba
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        return this.f38299a.maxIntrinsicWidth(gd8Var, yba.getChildrenOfVirtualChildren(gd8Var), i);
    }

    @Override // p000.uba
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
        return this.f38299a.mo27453measure3p2s80s(interfaceC0761n, yba.getChildrenOfVirtualChildren(interfaceC0761n), j);
    }

    @Override // p000.uba
    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        return this.f38299a.minIntrinsicHeight(gd8Var, yba.getChildrenOfVirtualChildren(gd8Var), i);
    }

    @Override // p000.uba
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
        return this.f38299a.minIntrinsicWidth(gd8Var, yba.getChildrenOfVirtualChildren(gd8Var), i);
    }

    @yfb
    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f38299a + ')';
    }
}
