package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class f5d {

    /* JADX INFO: renamed from: a */
    public RecyclerView f35380a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f35381b;

    /* JADX INFO: renamed from: c */
    public boolean f35382c = false;

    /* JADX INFO: renamed from: d */
    public boolean f35383d;

    /* JADX INFO: renamed from: f5d$a */
    public class C5601a extends RecyclerView.OnScrollListener {
        public C5601a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@efb RecyclerView recyclerView, int newState) {
            Log.i("aa", "newState=" + newState);
            if (newState == 0) {
                f5d f5dVar = f5d.this;
                f5dVar.syncPositionFrom(f5dVar.f35380a, f5d.this.f35381b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@efb RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            if (f5d.this.f35383d) {
                f5d f5dVar = f5d.this;
                f5dVar.syncPositionFrom(f5dVar.f35380a, f5d.this.f35381b);
            }
        }
    }

    /* JADX INFO: renamed from: f5d$b */
    public class C5602b extends RecyclerView.OnScrollListener {
        public C5602b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@efb RecyclerView recyclerView, int newState) {
            if (newState == 0) {
                f5d f5dVar = f5d.this;
                f5dVar.syncPositionFrom(f5dVar.f35381b, f5d.this.f35380a);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@efb RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            if (f5d.this.f35383d) {
                return;
            }
            f5d f5dVar = f5d.this;
            f5dVar.syncPositionFrom(f5dVar.f35381b, f5d.this.f35380a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncPositionFrom(RecyclerView source, RecyclerView target) {
        this.f35382c = true;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) source.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        ((LinearLayoutManager) target.getLayoutManager()).scrollToPositionWithOffset(iFindFirstVisibleItemPosition, viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0);
        this.f35382c = false;
    }

    public boolean isTopView() {
        return this.f35383d;
    }

    public void setTopView(boolean topView) {
        this.f35383d = topView;
    }

    public void syncPositions(RecyclerView rv1, RecyclerView rv2) {
        this.f35380a = rv1;
        this.f35381b = rv2;
        rv1.addOnScrollListener(new C5601a());
        this.f35381b.addOnScrollListener(new C5602b());
    }
}
