package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public class e5d {

    /* JADX INFO: renamed from: a */
    public RecyclerView f31853a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f31854b;

    /* JADX INFO: renamed from: c */
    public boolean f31855c = false;

    /* JADX INFO: renamed from: d */
    public boolean f31856d;

    /* JADX INFO: renamed from: e5d$a */
    public class C5125a extends RecyclerView.OnScrollListener {
        public C5125a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@efb RecyclerView recyclerView, int newState) {
            Log.i("aa", "newState=" + newState);
            if (newState == 0) {
                e5d e5dVar = e5d.this;
                e5dVar.syncPositionFrom(e5dVar.f31853a, e5d.this.f31854b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@efb RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            if (e5d.this.f31856d) {
                e5d e5dVar = e5d.this;
                e5dVar.syncPositionFrom(e5dVar.f31853a, e5d.this.f31854b);
            }
        }
    }

    /* JADX INFO: renamed from: e5d$b */
    public class C5126b extends RecyclerView.OnScrollListener {
        public C5126b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@efb RecyclerView recyclerView, int newState) {
            if (newState == 0) {
                e5d e5dVar = e5d.this;
                e5dVar.syncPositionFrom(e5dVar.f31854b, e5d.this.f31853a);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@efb RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            if (e5d.this.f31856d) {
                return;
            }
            e5d e5dVar = e5d.this;
            e5dVar.syncPositionFrom(e5dVar.f31854b, e5d.this.f31853a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncPositionFrom(RecyclerView source, RecyclerView target) {
        this.f31855c = true;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) source.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        ((LinearLayoutManager) target.getLayoutManager()).scrollToPositionWithOffset(iFindFirstVisibleItemPosition, viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0);
        this.f31855c = false;
    }

    public boolean isTopView() {
        return this.f31856d;
    }

    public void setTopView(boolean topView) {
        this.f31856d = topView;
    }

    public void syncPositions(RecyclerView rv1, RecyclerView rv2) {
        this.f31853a = rv1;
        this.f31854b = rv2;
        rv1.addOnScrollListener(new C5125a());
        this.f31854b.addOnScrollListener(new C5126b());
    }
}
