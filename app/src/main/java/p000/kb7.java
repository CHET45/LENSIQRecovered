package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C2473f;

/* JADX INFO: loaded from: classes4.dex */
public class kb7 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a */
    public final int f53533a;

    /* JADX INFO: renamed from: b */
    public final int f53534b;

    /* JADX INFO: renamed from: c */
    public final boolean f53535c;

    public kb7(int spanCount, int spacing, boolean includeEdge) {
        this.f53533a = spanCount;
        this.f53534b = spacing;
        this.f53535c = includeEdge;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int spanSize = ((GridLayoutManager) parent.getLayoutManager()).getSpanSizeLookup().getSpanSize(childAdapterPosition);
        int i = this.f53533a;
        int i2 = childAdapterPosition % i;
        if (!this.f53535c) {
            if (spanSize == 2) {
                int i3 = this.f53534b;
                outRect.left = (i2 * i3) / i;
                outRect.right = i3 - (((i2 + 1) * i3) / i);
            } else {
                int i4 = this.f53534b;
                outRect.left = (i2 * i4) / i;
                outRect.right = i4 - (((i2 + 1) * i4) / i);
            }
            if (childAdapterPosition >= i) {
                outRect.top = this.f53534b;
                return;
            }
            return;
        }
        if (spanSize == 2) {
            int i5 = this.f53534b;
            outRect.left = i5 - ((i2 * i5) / i);
            outRect.right = ((i2 + 1) * i5) / i;
            outRect.top = i5;
            outRect.bottom = i5;
            C2473f.m4168e("ltttt首个item", outRect.left + "::" + outRect.right + "::" + outRect.top + "::" + outRect.bottom);
            return;
        }
        int i6 = this.f53534b;
        outRect.left = (i2 * i6) / i;
        outRect.right = i6 - (((i2 + 1) * i6) / i);
        outRect.top = i6;
        outRect.bottom = i6;
        C2473f.m4168e("ltttt", outRect.left + "::" + outRect.right + "::" + outRect.top + "::" + outRect.bottom);
    }
}
