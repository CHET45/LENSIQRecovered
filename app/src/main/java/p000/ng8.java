package p000;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class ng8 extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a */
    public m3c f64464a;

    /* JADX INFO: renamed from: b */
    public l3c f64465b;

    /* JADX INFO: renamed from: c */
    public n3c f64466c;

    /* JADX INFO: renamed from: d */
    public boolean f64467d;

    /* JADX INFO: renamed from: e */
    public boolean f64468e;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        n3c n3cVar = this.f64466c;
        if (n3cVar != null) {
            n3cVar.onSelectedChanged(viewHolder, 0);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        m3c m3cVar = this.f64464a;
        if (m3cVar != null) {
            return ItemTouchHelper.Callback.makeMovementFlags(m3cVar.onDragFlags(recyclerView, viewHolder), this.f64464a.onSwipeFlags(recyclerView, viewHolder));
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        return layoutManager instanceof GridLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? ItemTouchHelper.Callback.makeMovementFlags(15, 3) : ItemTouchHelper.Callback.makeMovementFlags(15, 12) : layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? ItemTouchHelper.Callback.makeMovementFlags(12, 3) : ItemTouchHelper.Callback.makeMovementFlags(3, 12) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
    }

    public l3c getOnItemMoveListener() {
        return this.f64465b;
    }

    public m3c getOnItemMovementListener() {
        return this.f64464a;
    }

    public n3c getOnItemStateChangedListener() {
        return this.f64466c;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return this.f64467d;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return this.f64468e;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        float fAbs;
        int width;
        if (i == 1) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            float f3 = 1.0f;
            if (layoutManager instanceof LinearLayoutManager) {
                int orientation = ((LinearLayoutManager) layoutManager).getOrientation();
                if (orientation == 0) {
                    fAbs = Math.abs(f2);
                    width = viewHolder.itemView.getHeight();
                } else if (orientation == 1) {
                    fAbs = Math.abs(f);
                    width = viewHolder.itemView.getWidth();
                }
                f3 = 1.0f - (fAbs / width);
            }
            viewHolder.itemView.setAlpha(f3);
        }
        super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        l3c l3cVar = this.f64465b;
        if (l3cVar != null) {
            return l3cVar.onItemMove(viewHolder, viewHolder2);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        super.onSelectedChanged(viewHolder, i);
        n3c n3cVar = this.f64466c;
        if (n3cVar == null || i == 0) {
            return;
        }
        n3cVar.onSelectedChanged(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        l3c l3cVar = this.f64465b;
        if (l3cVar != null) {
            l3cVar.onItemDismiss(viewHolder);
        }
    }

    public void setItemViewSwipeEnabled(boolean z) {
        this.f64467d = z;
    }

    public void setLongPressDragEnabled(boolean z) {
        this.f64468e = z;
    }

    public void setOnItemMoveListener(l3c l3cVar) {
        this.f64465b = l3cVar;
    }

    public void setOnItemMovementListener(m3c m3cVar) {
        this.f64464a = m3cVar;
    }

    public void setOnItemStateChangedListener(n3c n3cVar) {
        this.f64466c = n3cVar;
    }
}
