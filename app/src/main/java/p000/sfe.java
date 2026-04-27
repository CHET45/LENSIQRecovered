package p000;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public class sfe extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a */
    public SparseArray<C12560b> f81675a;

    /* JADX INFO: renamed from: sfe$a */
    public static class C12559a {

        /* JADX INFO: renamed from: a */
        public SparseArray<C12560b> f81676a = new SparseArray<>();

        /* JADX INFO: renamed from: a */
        public SparseArray<C12560b> m21928a() {
            return this.f81676a;
        }

        public sfe build() {
            return new sfe(this.f81676a);
        }

        public C12561c type(int type) {
            return new C12561c(type, this);
        }
    }

    /* JADX INFO: renamed from: sfe$b */
    public static class C12560b {

        /* JADX INFO: renamed from: a */
        public int f81677a;

        /* JADX INFO: renamed from: b */
        public int f81678b;

        /* JADX INFO: renamed from: c */
        public boolean f81679c;

        /* JADX INFO: renamed from: d */
        public boolean f81680d;

        public C12560b() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m21929a() {
            return this.f81679c;
        }

        /* JADX INFO: renamed from: b */
        public boolean m21930b() {
            return this.f81680d;
        }

        /* JADX INFO: renamed from: c */
        public int m21931c() {
            return this.f81677a;
        }

        /* JADX INFO: renamed from: d */
        public int m21932d() {
            return this.f81678b;
        }

        /* JADX INFO: renamed from: e */
        public void m21933e(boolean hasLeftRightEdge) {
            this.f81679c = hasLeftRightEdge;
        }

        /* JADX INFO: renamed from: f */
        public void m21934f(boolean hasTopBottomEdge) {
            this.f81680d = hasTopBottomEdge;
        }

        /* JADX INFO: renamed from: g */
        public void m21935g(int leftRightSpace) {
            this.f81677a = leftRightSpace;
        }

        /* JADX INFO: renamed from: h */
        public void m21936h(int topBottomSpace) {
            this.f81678b = topBottomSpace;
        }

        public C12560b(int topBottomSpace, int leftRightSpace, boolean hasTopBottomEdge, boolean hasLeftRightEdge) {
            this.f81677a = leftRightSpace;
            this.f81678b = topBottomSpace;
            this.f81680d = hasTopBottomEdge;
            this.f81679c = hasLeftRightEdge;
        }
    }

    /* JADX INFO: renamed from: sfe$c */
    public static class C12561c {

        /* JADX INFO: renamed from: a */
        public int f81681a;

        /* JADX INFO: renamed from: b */
        public C12560b f81682b = new C12560b();

        /* JADX INFO: renamed from: c */
        public C12559a f81683c;

        public C12561c(int type, C12559a builder) {
            this.f81681a = type;
            this.f81683c = builder;
        }

        public C12559a buildType() {
            this.f81683c.m21928a().put(this.f81681a, this.f81682b);
            return this.f81683c;
        }

        public C12561c hasLeftRightEdge(boolean hasEdge) {
            this.f81682b.m21933e(hasEdge);
            return this;
        }

        public C12561c hasTopBottomEdge(boolean hasEdge) {
            this.f81682b.m21934f(hasEdge);
            return this;
        }

        public C12561c leftRightSpace(int space) {
            this.f81682b.m21935g(space);
            return this;
        }

        public C12561c prop(int leftRightSpace, int topBottomSpace, boolean hasLeftRightEdge, boolean hasTopBottomEdge) {
            this.f81682b.m21935g(leftRightSpace);
            this.f81682b.m21936h(topBottomSpace);
            this.f81682b.m21933e(hasLeftRightEdge);
            this.f81682b.m21934f(hasTopBottomEdge);
            return this;
        }

        public C12561c topBottomSpace(int space) {
            this.f81682b.m21936h(space);
            return this;
        }
    }

    public sfe(SparseArray<C12560b> propMap) {
        this.f81675a = propMap;
    }

    public static C12559a builder() {
        return new C12559a();
    }

    /* JADX INFO: renamed from: a */
    public SparseArray<C12560b> m21927a() {
        return this.f81675a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@efb Rect outRect, @efb View view, @efb RecyclerView parent, @efb RecyclerView.State state) {
        C12560b c12560b;
        int spanIndex;
        int spanSize;
        int orientation;
        int spanCount;
        int iM21932d;
        int iM21932d2;
        int iM21932d3;
        int iM21931c;
        Rect rect;
        int iM21931c2;
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter == null) {
            return;
        }
        int itemViewType = adapter.getItemViewType(childAdapterPosition);
        SparseArray<C12560b> sparseArray = this.f81675a;
        if (sparseArray == null || (c12560b = sparseArray.get(itemViewType)) == null) {
            return;
        }
        int iM21931c3 = 0;
        if (parent.getLayoutManager() instanceof GridLayoutManager) {
            GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
            spanIndex = layoutParams.getSpanIndex();
            spanSize = layoutParams.getSpanSize();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) parent.getLayoutManager();
            spanCount = gridLayoutManager.getSpanCount();
            orientation = gridLayoutManager.getOrientation();
        } else if (parent.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            spanIndex = layoutParams2.getSpanIndex();
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) parent.getLayoutManager();
            spanCount = staggeredGridLayoutManager.getSpanCount();
            spanSize = layoutParams2.isFullSpan() ? spanCount : 1;
            orientation = staggeredGridLayoutManager.getOrientation();
        } else {
            spanIndex = 0;
            spanSize = 1;
            orientation = 1;
            spanCount = 1;
        }
        int i = childAdapterPosition > 0 ? childAdapterPosition - 1 : -1;
        int i2 = childAdapterPosition < adapter.getItemCount() - 1 ? childAdapterPosition + 1 : -1;
        int i3 = childAdapterPosition > spanIndex ? childAdapterPosition - (spanIndex + 1) : -1;
        int i4 = spanCount - spanIndex;
        int i5 = childAdapterPosition < adapter.getItemCount() - i4 ? ((childAdapterPosition + i4) - spanSize) + 1 : -1;
        boolean z = childAdapterPosition == 0 || i == -1 || itemViewType != adapter.getItemViewType(i) || i3 == -1 || itemViewType != adapter.getItemViewType(i3);
        boolean z2 = childAdapterPosition == adapter.getItemCount() - 1 || i2 == -1 || itemViewType != adapter.getItemViewType(i2) || i5 == -1 || itemViewType != adapter.getItemViewType(i5);
        if (orientation == 1) {
            if (c12560b.m21929a()) {
                iM21931c = (c12560b.m21931c() * i4) / spanCount;
                iM21931c2 = (c12560b.m21931c() * ((spanIndex + (spanSize - 1)) + 1)) / spanCount;
            } else {
                iM21931c = (c12560b.m21931c() * spanIndex) / spanCount;
                iM21931c2 = (c12560b.m21931c() * ((spanCount - ((spanIndex + spanSize) - 1)) - 1)) / spanCount;
            }
            iM21932d3 = (z && c12560b.m21930b()) ? c12560b.m21932d() : 0;
            if (!z2 || c12560b.m21930b()) {
                iM21931c3 = c12560b.m21932d();
            }
            rect = outRect;
            int i6 = iM21931c3;
            iM21931c3 = iM21931c2;
            iM21932d2 = i6;
        } else {
            if (c12560b.m21930b()) {
                iM21932d = (c12560b.m21932d() * i4) / spanCount;
                iM21932d2 = (c12560b.m21932d() * ((spanIndex + (spanSize - 1)) + 1)) / spanCount;
            } else {
                iM21932d = (c12560b.m21932d() * spanIndex) / spanCount;
                iM21932d2 = (c12560b.m21932d() * ((spanCount - ((spanIndex + spanSize) - 1)) - 1)) / spanCount;
            }
            iM21932d3 = iM21932d;
            iM21931c = (z && c12560b.m21929a()) ? c12560b.m21931c() : 0;
            if (!z2 || c12560b.m21929a()) {
                iM21931c3 = c12560b.m21931c();
            }
            rect = outRect;
        }
        rect.set(iM21931c, iM21932d3, iM21931c3, iM21932d2);
    }
}
