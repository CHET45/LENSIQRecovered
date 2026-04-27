package p000;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ur0 {
    private final void isVisible(@yfb View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public void convert(@yfb BaseViewHolder baseViewHolder, int i, @yfb oc9 oc9Var) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        md8.checkParameterIsNotNull(oc9Var, "loadMoreStatus");
        int i2 = tr0.f85642a[oc9Var.ordinal()];
        if (i2 == 1) {
            isVisible(getLoadingView(baseViewHolder), false);
            isVisible(getLoadComplete(baseViewHolder), true);
            isVisible(getLoadFailView(baseViewHolder), false);
            isVisible(getLoadEndView(baseViewHolder), false);
            return;
        }
        if (i2 == 2) {
            isVisible(getLoadingView(baseViewHolder), true);
            isVisible(getLoadComplete(baseViewHolder), false);
            isVisible(getLoadFailView(baseViewHolder), false);
            isVisible(getLoadEndView(baseViewHolder), false);
            return;
        }
        if (i2 == 3) {
            isVisible(getLoadingView(baseViewHolder), false);
            isVisible(getLoadComplete(baseViewHolder), false);
            isVisible(getLoadFailView(baseViewHolder), true);
            isVisible(getLoadEndView(baseViewHolder), false);
            return;
        }
        if (i2 != 4) {
            return;
        }
        isVisible(getLoadingView(baseViewHolder), false);
        isVisible(getLoadComplete(baseViewHolder), false);
        isVisible(getLoadFailView(baseViewHolder), false);
        isVisible(getLoadEndView(baseViewHolder), true);
    }

    @yfb
    public abstract View getLoadComplete(@yfb BaseViewHolder baseViewHolder);

    @yfb
    public abstract View getLoadEndView(@yfb BaseViewHolder baseViewHolder);

    @yfb
    public abstract View getLoadFailView(@yfb BaseViewHolder baseViewHolder);

    @yfb
    public abstract View getLoadingView(@yfb BaseViewHolder baseViewHolder);

    @yfb
    public abstract View getRootView(@yfb ViewGroup viewGroup);
}
