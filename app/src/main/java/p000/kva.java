package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public class kva extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a */
    public final Drawable f55441a;

    /* JADX INFO: renamed from: b */
    public final int f55442b;

    /* JADX INFO: renamed from: c */
    public final int f55443c;

    public kva(Drawable divider, int leftIndent, int rightIndent) {
        this.f55441a = divider;
        this.f55442b = leftIndent;
        this.f55443c = rightIndent;
    }

    private int dpToPx(Context context, int dp) {
        return (int) (dp * context.getResources().getDisplayMetrics().density);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@efb Rect outRect, @efb View view, @efb RecyclerView parent, @efb RecyclerView.State state) {
        if (parent.getChildAdapterPosition(view) < parent.getAdapter().getItemCount() - 1) {
            outRect.bottom = this.f55441a.getIntrinsicHeight();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@efb Canvas canvas, @efb RecyclerView parent, @efb RecyclerView.State state) {
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        for (int i = 0; i < parent.getChildCount() - 1; i++) {
            View childAt = parent.getChildAt(i);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int iDpToPx = dpToPx(parent.getContext(), this.f55442b) + paddingLeft;
            int iDpToPx2 = width - dpToPx(parent.getContext(), this.f55443c);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            this.f55441a.setBounds(iDpToPx, bottom, iDpToPx2, this.f55441a.getIntrinsicHeight() + bottom);
            this.f55441a.draw(canvas);
        }
    }
}
