package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class w19 implements oz8 {

    /* JADX INFO: renamed from: b */
    public static final int f93078b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z29 f93079a;

    public w19(@yfb z29 z29Var) {
        this.f93079a = z29Var;
    }

    @Override // p000.oz8
    public int getFirstPlacedIndex() {
        return this.f93079a.getFirstVisibleItemIndex();
    }

    @Override // p000.oz8
    public boolean getHasVisibleItems() {
        return !this.f93079a.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // p000.oz8
    public int getItemCount() {
        return this.f93079a.getLayoutInfo().getTotalItemsCount();
    }

    @Override // p000.oz8
    public int getLastPlacedIndex() {
        return ((b29) v82.last((List) this.f93079a.getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    @yfb
    public final z29 getState() {
        return this.f93079a;
    }

    @Override // p000.oz8
    public void remeasure() {
        byd remeasurement$foundation_release = this.f93079a.getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }
}
