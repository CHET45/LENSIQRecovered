package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class gbc implements oz8 {

    /* JADX INFO: renamed from: c */
    public static final int f39312c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final dcc f39313a;

    /* JADX INFO: renamed from: b */
    public final int f39314b;

    public gbc(@yfb dcc dccVar, int i) {
        this.f39313a = dccVar;
        this.f39314b = i;
    }

    @Override // p000.oz8
    public int getFirstPlacedIndex() {
        return Math.max(0, this.f39313a.getFirstVisiblePage$foundation_release() - this.f39314b);
    }

    @Override // p000.oz8
    public boolean getHasVisibleItems() {
        return !this.f39313a.getLayoutInfo().getVisiblePagesInfo().isEmpty();
    }

    @Override // p000.oz8
    public int getItemCount() {
        return this.f39313a.getPageCount();
    }

    @Override // p000.oz8
    public int getLastPlacedIndex() {
        return Math.min(getItemCount() - 1, ((bbc) v82.last((List) this.f39313a.getLayoutInfo().getVisiblePagesInfo())).getIndex() + this.f39314b);
    }

    @Override // p000.oz8
    public void remeasure() {
        byd remeasurement$foundation_release = this.f39313a.getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }
}
