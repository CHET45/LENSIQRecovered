package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class p09 implements oz8 {

    /* JADX INFO: renamed from: c */
    public static final int f69336c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final m19 f69337a;

    /* JADX INFO: renamed from: b */
    public final int f69338b;

    public p09(@yfb m19 m19Var, int i) {
        this.f69337a = m19Var;
        this.f69338b = i;
    }

    public final int getBeyondBoundsItemCount() {
        return this.f69338b;
    }

    @Override // p000.oz8
    public int getFirstPlacedIndex() {
        return Math.max(0, this.f69337a.getFirstVisibleItemIndex() - this.f69338b);
    }

    @Override // p000.oz8
    public boolean getHasVisibleItems() {
        return !this.f69337a.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // p000.oz8
    public int getItemCount() {
        return this.f69337a.getLayoutInfo().getTotalItemsCount();
    }

    @Override // p000.oz8
    public int getLastPlacedIndex() {
        return Math.min(getItemCount() - 1, ((t09) v82.last((List) this.f69337a.getLayoutInfo().getVisibleItemsInfo())).getIndex() + this.f69338b);
    }

    @yfb
    public final m19 getState() {
        return this.f69337a;
    }

    @Override // p000.oz8
    public void remeasure() {
        byd remeasurement$foundation_release = this.f69337a.getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }
}
