package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0901d;
import com.chad.library.C2501R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

/* JADX INFO: loaded from: classes4.dex */
public final class oif extends ur0 {
    @Override // p000.ur0
    @yfb
    public View getLoadComplete(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        return baseViewHolder.getView(C2501R.id.load_more_load_complete_view);
    }

    @Override // p000.ur0
    @yfb
    public View getLoadEndView(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        return baseViewHolder.getView(C2501R.id.load_more_load_end_view);
    }

    @Override // p000.ur0
    @yfb
    public View getLoadFailView(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        return baseViewHolder.getView(C2501R.id.load_more_load_fail_view);
    }

    @Override // p000.ur0
    @yfb
    public View getLoadingView(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        return baseViewHolder.getView(C2501R.id.load_more_loading_view);
    }

    @Override // p000.ur0
    @yfb
    public View getRootView(@yfb ViewGroup viewGroup) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        return C9350mh.getItemView(viewGroup, C2501R.layout.brvah_quick_view_load_more);
    }
}
