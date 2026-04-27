package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class tx8 implements oz8 {

    /* JADX INFO: renamed from: b */
    public static final int f86258b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final az8 f86259a;

    public tx8(@yfb az8 az8Var) {
        this.f86259a = az8Var;
    }

    @Override // p000.oz8
    public int getFirstPlacedIndex() {
        return this.f86259a.getFirstVisibleItemIndex();
    }

    @Override // p000.oz8
    public boolean getHasVisibleItems() {
        return !this.f86259a.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // p000.oz8
    public int getItemCount() {
        return this.f86259a.getLayoutInfo().getTotalItemsCount();
    }

    @Override // p000.oz8
    public int getLastPlacedIndex() {
        return ((xx8) v82.last((List) this.f86259a.getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    @yfb
    public final az8 getState() {
        return this.f86259a;
    }

    @Override // p000.oz8
    public void remeasure() {
        byd remeasurement$foundation_release = this.f86259a.getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }
}
