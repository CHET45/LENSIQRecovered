package p000;

import androidx.recyclerview.widget.ListUpdateCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class ne1 implements ListUpdateCallback {

    /* JADX INFO: renamed from: a */
    public final mt0<?, ?> f64088a;

    public ne1(@yfb mt0<?, ?> mt0Var) {
        md8.checkParameterIsNotNull(mt0Var, "mAdapter");
        this.f64088a = mt0Var;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i, int i2, @gib Object obj) {
        mt0<?, ?> mt0Var = this.f64088a;
        mt0Var.notifyItemRangeChanged(i + mt0Var.getHeaderLayoutCount(), i2, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i, int i2) {
        mt0<?, ?> mt0Var = this.f64088a;
        mt0Var.notifyItemRangeInserted(i + mt0Var.getHeaderLayoutCount(), i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i, int i2) {
        mt0<?, ?> mt0Var = this.f64088a;
        mt0Var.notifyItemMoved(i + mt0Var.getHeaderLayoutCount(), i2 + this.f64088a.getHeaderLayoutCount());
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i, int i2) {
        sr0 mLoadMoreModule$com_github_CymChad_brvah = this.f64088a.getMLoadMoreModule$com_github_CymChad_brvah();
        if (mLoadMoreModule$com_github_CymChad_brvah != null && mLoadMoreModule$com_github_CymChad_brvah.hasLoadMoreView() && this.f64088a.getItemCount() == 0) {
            mt0<?, ?> mt0Var = this.f64088a;
            mt0Var.notifyItemRangeRemoved(i + mt0Var.getHeaderLayoutCount(), i2 + 1);
        } else {
            mt0<?, ?> mt0Var2 = this.f64088a;
            mt0Var2.notifyItemRangeRemoved(i + mt0Var2.getHeaderLayoutCount(), i2);
        }
    }
}
