package p000;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0901d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fod<T> extends jr0<T, BaseViewHolder> {
    @uw8
    public abstract int getLayoutId();

    @Override // p000.jr0
    @yfb
    public BaseViewHolder onCreateViewHolder(@yfb ViewGroup viewGroup, int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        return new BaseViewHolder(C9350mh.getItemView(viewGroup, getLayoutId()));
    }
}
