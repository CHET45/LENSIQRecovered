package p000;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.C2501R;

/* JADX INFO: loaded from: classes4.dex */
public class go4 extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a */
    public ar0 f40431a;

    /* JADX INFO: renamed from: b */
    public float f40432b = 0.1f;

    /* JADX INFO: renamed from: c */
    public float f40433c = 0.7f;

    /* JADX INFO: renamed from: d */
    public int f40434d = 15;

    /* JADX INFO: renamed from: e */
    public int f40435e = 32;

    public go4(ar0 ar0Var) {
        this.f40431a = ar0Var;
    }

    private boolean isViewCreateByAdapter(@efb RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(@efb RecyclerView recyclerView, @efb RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        if (isViewCreateByAdapter(viewHolder)) {
            return;
        }
        if (viewHolder.itemView.getTag(C2501R.id.BaseQuickAdapter_dragging_support) != null && ((Boolean) viewHolder.itemView.getTag(C2501R.id.BaseQuickAdapter_dragging_support)).booleanValue()) {
            ar0 ar0Var = this.f40431a;
            if (ar0Var != null) {
                ar0Var.onItemDragEnd(viewHolder);
            }
            viewHolder.itemView.setTag(C2501R.id.BaseQuickAdapter_dragging_support, Boolean.FALSE);
        }
        if (viewHolder.itemView.getTag(C2501R.id.BaseQuickAdapter_swiping_support) == null || !((Boolean) viewHolder.itemView.getTag(C2501R.id.BaseQuickAdapter_swiping_support)).booleanValue()) {
            return;
        }
        ar0 ar0Var2 = this.f40431a;
        if (ar0Var2 != null) {
            ar0Var2.onItemSwipeClear(viewHolder);
        }
        viewHolder.itemView.setTag(C2501R.id.BaseQuickAdapter_swiping_support, Boolean.FALSE);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getMoveThreshold(@efb RecyclerView.ViewHolder viewHolder) {
        return this.f40432b;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@efb RecyclerView recyclerView, @efb RecyclerView.ViewHolder viewHolder) {
        return isViewCreateByAdapter(viewHolder) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(this.f40434d, this.f40435e);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(@efb RecyclerView.ViewHolder viewHolder) {
        return this.f40433c;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        ar0 ar0Var = this.f40431a;
        if (ar0Var != null) {
            return ar0Var.isSwipeEnabled();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        ar0 ar0Var = this.f40431a;
        return (ar0Var == null || !ar0Var.isDragEnabled() || this.f40431a.hasToggleView()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDrawOver(@efb Canvas canvas, @efb RecyclerView recyclerView, @efb RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        super.onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, z);
        if (i != 1 || isViewCreateByAdapter(viewHolder)) {
            return;
        }
        View view = viewHolder.itemView;
        canvas.save();
        if (f > 0.0f) {
            canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f, view.getBottom());
            canvas.translate(view.getLeft(), view.getTop());
        } else {
            canvas.clipRect(view.getRight() + f, view.getTop(), view.getRight(), view.getBottom());
            canvas.translate(view.getRight() + f, view.getTop());
        }
        ar0 ar0Var = this.f40431a;
        if (ar0Var != null) {
            ar0Var.onItemSwiping(canvas, viewHolder, f, f2, z);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@efb RecyclerView recyclerView, @efb RecyclerView.ViewHolder viewHolder, @efb RecyclerView.ViewHolder viewHolder2) {
        return viewHolder.getItemViewType() == viewHolder2.getItemViewType();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onMoved(@efb RecyclerView recyclerView, @efb RecyclerView.ViewHolder viewHolder, int i, @efb RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        super.onMoved(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        ar0 ar0Var = this.f40431a;
        if (ar0Var != null) {
            ar0Var.onItemDragMoving(viewHolder, viewHolder2);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        if (i == 2 && !isViewCreateByAdapter(viewHolder)) {
            ar0 ar0Var = this.f40431a;
            if (ar0Var != null) {
                ar0Var.onItemDragStart(viewHolder);
            }
            viewHolder.itemView.setTag(C2501R.id.BaseQuickAdapter_dragging_support, Boolean.TRUE);
        } else if (i == 1 && !isViewCreateByAdapter(viewHolder)) {
            ar0 ar0Var2 = this.f40431a;
            if (ar0Var2 != null) {
                ar0Var2.onItemSwipeStart(viewHolder);
            }
            viewHolder.itemView.setTag(C2501R.id.BaseQuickAdapter_swiping_support, Boolean.TRUE);
        }
        super.onSelectedChanged(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@efb RecyclerView.ViewHolder viewHolder, int i) {
        ar0 ar0Var;
        if (isViewCreateByAdapter(viewHolder) || (ar0Var = this.f40431a) == null) {
            return;
        }
        ar0Var.onItemSwiped(viewHolder);
    }

    public void setDragMoveFlags(int i) {
        this.f40434d = i;
    }

    public void setMoveThreshold(float f) {
        this.f40432b = f;
    }

    public void setSwipeMoveFlags(int i) {
        this.f40435e = i;
    }

    public void setSwipeThreshold(float f) {
        this.f40433c = f;
    }
}
