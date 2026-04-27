package p000;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

/* JADX INFO: loaded from: classes4.dex */
public class sr0 implements lc9 {

    /* JADX INFO: renamed from: a */
    public q3c f82664a;

    /* JADX INFO: renamed from: b */
    public boolean f82665b;

    /* JADX INFO: renamed from: c */
    @yfb
    public oc9 f82666c;

    /* JADX INFO: renamed from: d */
    public boolean f82667d;

    /* JADX INFO: renamed from: e */
    @yfb
    public ur0 f82668e;

    /* JADX INFO: renamed from: f */
    public boolean f82669f;

    /* JADX INFO: renamed from: g */
    public boolean f82670g;

    /* JADX INFO: renamed from: h */
    public boolean f82671h;

    /* JADX INFO: renamed from: i */
    public int f82672i;

    /* JADX INFO: renamed from: j */
    public boolean f82673j;

    /* JADX INFO: renamed from: k */
    public final mt0<?, ?> f82674k;

    /* JADX INFO: renamed from: sr0$a */
    public static final class RunnableC12754a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecyclerView.LayoutManager f82676b;

        public RunnableC12754a(RecyclerView.LayoutManager layoutManager) {
            this.f82676b = layoutManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (sr0.this.isFullScreen((LinearLayoutManager) this.f82676b)) {
                sr0.this.f82665b = true;
            }
        }
    }

    /* JADX INFO: renamed from: sr0$b */
    public static final class RunnableC12755b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecyclerView.LayoutManager f82678b;

        public RunnableC12755b(RecyclerView.LayoutManager layoutManager) {
            this.f82678b = layoutManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int[] iArr = new int[((StaggeredGridLayoutManager) this.f82678b).getSpanCount()];
            ((StaggeredGridLayoutManager) this.f82678b).findLastCompletelyVisibleItemPositions(iArr);
            if (sr0.this.getTheBiggestNumber(iArr) + 1 != sr0.this.f82674k.getItemCount()) {
                sr0.this.f82665b = true;
            }
        }
    }

    /* JADX INFO: renamed from: sr0$c */
    public static final class RunnableC12756c implements Runnable {
        public RunnableC12756c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q3c q3cVar = sr0.this.f82664a;
            if (q3cVar != null) {
                q3cVar.onLoadMore();
            }
        }
    }

    /* JADX INFO: renamed from: sr0$d */
    public static final class ViewOnClickListenerC12757d implements View.OnClickListener {
        public ViewOnClickListenerC12757d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (sr0.this.getLoadMoreStatus() == oc9.Fail) {
                sr0.this.loadMoreToLoading();
                return;
            }
            if (sr0.this.getLoadMoreStatus() == oc9.Complete) {
                sr0.this.loadMoreToLoading();
            } else if (sr0.this.getEnableLoadMoreEndClick() && sr0.this.getLoadMoreStatus() == oc9.End) {
                sr0.this.loadMoreToLoading();
            }
        }
    }

    public sr0(@yfb mt0<?, ?> mt0Var) {
        md8.checkParameterIsNotNull(mt0Var, "baseQuickAdapter");
        this.f82674k = mt0Var;
        this.f82665b = true;
        this.f82666c = oc9.Complete;
        this.f82668e = nc9.getDefLoadMoreView();
        this.f82670g = true;
        this.f82671h = true;
        this.f82672i = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTheBiggestNumber(int[] iArr) {
        int i = -1;
        if (iArr != null && iArr.length != 0) {
            for (int i2 : iArr) {
                if (i2 > i) {
                    i = i2;
                }
            }
        }
        return i;
    }

    private final void invokeLoadMoreListener() {
        this.f82666c = oc9.Loading;
        RecyclerView mRecyclerView$com_github_CymChad_brvah = this.f82674k.getMRecyclerView$com_github_CymChad_brvah();
        if (mRecyclerView$com_github_CymChad_brvah != null) {
            mRecyclerView$com_github_CymChad_brvah.post(new RunnableC12756c());
            return;
        }
        q3c q3cVar = this.f82664a;
        if (q3cVar != null) {
            q3cVar.onLoadMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFullScreen(LinearLayoutManager linearLayoutManager) {
        return (linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1 == this.f82674k.getItemCount() && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) ? false : true;
    }

    public static /* synthetic */ void loadMoreEnd$default(sr0 sr0Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreEnd");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        sr0Var.loadMoreEnd(z);
    }

    public final void autoLoadMore$com_github_CymChad_brvah(int i) {
        oc9 oc9Var;
        if (this.f82670g && hasLoadMoreView() && i >= this.f82674k.getItemCount() - this.f82672i && (oc9Var = this.f82666c) == oc9.Complete && oc9Var != oc9.Loading && this.f82665b) {
            invokeLoadMoreListener();
        }
    }

    public final void checkDisableLoadMoreIfNotFullPage() {
        RecyclerView.LayoutManager layoutManager;
        if (this.f82671h) {
            return;
        }
        this.f82665b = false;
        RecyclerView mRecyclerView$com_github_CymChad_brvah = this.f82674k.getMRecyclerView$com_github_CymChad_brvah();
        if (mRecyclerView$com_github_CymChad_brvah == null || (layoutManager = mRecyclerView$com_github_CymChad_brvah.getLayoutManager()) == null) {
            return;
        }
        md8.checkExpressionValueIsNotNull(layoutManager, "recyclerView.layoutManager ?: return");
        if (layoutManager instanceof LinearLayoutManager) {
            mRecyclerView$com_github_CymChad_brvah.postDelayed(new RunnableC12754a(layoutManager), 50L);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            mRecyclerView$com_github_CymChad_brvah.postDelayed(new RunnableC12755b(layoutManager), 50L);
        }
    }

    public final boolean getEnableLoadMoreEndClick() {
        return this.f82669f;
    }

    @yfb
    public final oc9 getLoadMoreStatus() {
        return this.f82666c;
    }

    @yfb
    public final ur0 getLoadMoreView() {
        return this.f82668e;
    }

    public final int getLoadMoreViewPosition() {
        if (this.f82674k.hasEmptyView()) {
            return -1;
        }
        mt0<?, ?> mt0Var = this.f82674k;
        return mt0Var.getHeaderLayoutCount() + mt0Var.getData().size() + mt0Var.getFooterLayoutCount();
    }

    public final int getPreLoadNumber() {
        return this.f82672i;
    }

    public final boolean hasLoadMoreView() {
        if (this.f82664a == null || !this.f82673j) {
            return false;
        }
        if (this.f82666c == oc9.End && this.f82667d) {
            return false;
        }
        return !this.f82674k.getData().isEmpty();
    }

    public final boolean isAutoLoadMore() {
        return this.f82670g;
    }

    public final boolean isEnableLoadMore() {
        return this.f82673j;
    }

    public final boolean isEnableLoadMoreIfNotFullPage() {
        return this.f82671h;
    }

    public final boolean isLoadEndMoreGone() {
        return this.f82667d;
    }

    public final boolean isLoading() {
        return this.f82666c == oc9.Loading;
    }

    public final void loadMoreComplete() {
        if (hasLoadMoreView()) {
            this.f82666c = oc9.Complete;
            this.f82674k.notifyItemChanged(getLoadMoreViewPosition());
            checkDisableLoadMoreIfNotFullPage();
        }
    }

    @yn8
    public final void loadMoreEnd() {
        loadMoreEnd$default(this, false, 1, null);
    }

    public final void loadMoreFail() {
        if (hasLoadMoreView()) {
            this.f82666c = oc9.Fail;
            this.f82674k.notifyItemChanged(getLoadMoreViewPosition());
        }
    }

    public final void loadMoreToLoading() {
        oc9 oc9Var = this.f82666c;
        oc9 oc9Var2 = oc9.Loading;
        if (oc9Var == oc9Var2) {
            return;
        }
        this.f82666c = oc9Var2;
        this.f82674k.notifyItemChanged(getLoadMoreViewPosition());
        invokeLoadMoreListener();
    }

    public final void reset$com_github_CymChad_brvah() {
        if (this.f82664a != null) {
            setEnableLoadMore(true);
            this.f82666c = oc9.Complete;
        }
    }

    public final void setAutoLoadMore(boolean z) {
        this.f82670g = z;
    }

    public final void setEnableLoadMore(boolean z) {
        boolean zHasLoadMoreView = hasLoadMoreView();
        this.f82673j = z;
        boolean zHasLoadMoreView2 = hasLoadMoreView();
        if (zHasLoadMoreView) {
            if (zHasLoadMoreView2) {
                return;
            }
            this.f82674k.notifyItemRemoved(getLoadMoreViewPosition());
        } else if (zHasLoadMoreView2) {
            this.f82666c = oc9.Complete;
            this.f82674k.notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public final void setEnableLoadMoreEndClick(boolean z) {
        this.f82669f = z;
    }

    public final void setEnableLoadMoreIfNotFullPage(boolean z) {
        this.f82671h = z;
    }

    public final void setLoadMoreView(@yfb ur0 ur0Var) {
        md8.checkParameterIsNotNull(ur0Var, "<set-?>");
        this.f82668e = ur0Var;
    }

    @Override // p000.lc9
    public void setOnLoadMoreListener(@gib q3c q3cVar) {
        this.f82664a = q3cVar;
        setEnableLoadMore(true);
    }

    public final void setPreLoadNumber(int i) {
        if (i > 1) {
            this.f82672i = i;
        }
    }

    public final void setupViewHolder$com_github_CymChad_brvah(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "viewHolder");
        baseViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC12757d());
    }

    @yn8
    public final void loadMoreEnd(boolean z) {
        if (hasLoadMoreView()) {
            this.f82667d = z;
            this.f82666c = oc9.End;
            if (z) {
                this.f82674k.notifyItemRemoved(getLoadMoreViewPosition());
            } else {
                this.f82674k.notifyItemChanged(getLoadMoreViewPosition());
            }
        }
    }
}
