package p000;

import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p000.tf5.AbstractC13009b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class tf5<VH extends AbstractC13009b> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: c */
    public static final int f84497c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f84498d = 2;

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f84499a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b */
    public final List<Integer> f84500b = new ArrayList();

    /* JADX INFO: renamed from: tf5$a */
    public class C13008a extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f84501a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager.SpanSizeLookup f84502b;

        public C13008a(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.f84501a = gridLayoutManager;
            this.f84502b = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            if (tf5.this.isParentItem(i)) {
                return this.f84501a.getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f84502b;
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i);
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: tf5$b */
    public static abstract class AbstractC13009b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public tf5 f84504a;

        public AbstractC13009b(@efb View view, tf5 tf5Var) {
            super(view);
            this.f84504a = tf5Var;
        }

        public final int childItemPosition() {
            if (isParentItem()) {
                throw new IllegalStateException("This item is not a child item.");
            }
            return this.f84504a.childItemPosition(getAdapterPosition());
        }

        public final boolean isParentExpanded() {
            return this.f84504a.isExpanded(parentItemPosition());
        }

        public final boolean isParentItem() {
            return this.f84504a.isParentItem(getAdapterPosition());
        }

        public final int parentItemPosition() {
            return this.f84504a.parentItemPosition(getAdapterPosition());
        }
    }

    private void checkViewType(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(String.format(Locale.US, "The value [%d] is reserved, please replace it with other values.", Integer.valueOf(i)));
        }
    }

    private int positionFromChildPosition(int i, int i2) {
        int iParentItemCount = parentItemCount();
        int iChildItemCount = 0;
        for (int i3 = 0; i3 < iParentItemCount; i3++) {
            iChildItemCount++;
            if (i == i3) {
                if (i2 < childItemCount(i)) {
                    return (iChildItemCount + (i2 + 1)) - 1;
                }
                throw new IllegalStateException("The child position is invalid: " + i2);
            }
            if (isExpanded(i3)) {
                iChildItemCount += childItemCount(i3);
            }
        }
        throw new IllegalStateException("The parent position is invalid: " + i);
    }

    private int positionFromParentPosition(int i) {
        int iParentItemCount = parentItemCount();
        int i2 = 0;
        for (int i3 = 0; i3 < iParentItemCount; i3++) {
            int iChildItemCount = i2 + 1;
            if (i == i3) {
                return i2;
            }
            if (isExpanded(i3)) {
                iChildItemCount += childItemCount(i3);
            }
            i2 = iChildItemCount;
        }
        throw new IllegalStateException("The parent position is invalid: " + i);
    }

    public abstract void bindChildHolder(@efb VH vh, int i, int i2);

    public void bindChildHolder(@efb VH vh, int i, int i2, @efb List<Object> list) {
        bindChildHolder(vh, i, i2);
    }

    public abstract void bindParentHolder(@efb VH vh, int i);

    public void bindParentHolder(@efb VH vh, int i, @efb List<Object> list) {
        bindParentHolder(vh, i);
    }

    public abstract int childItemCount(int i);

    public final int childItemPosition(int i) {
        int iChildItemCount;
        int iParentItemCount = parentItemCount();
        int iChildItemCount2 = 0;
        for (int i2 = 0; i2 < iParentItemCount; i2++) {
            iChildItemCount2++;
            if (isExpanded(i2) && i < (iChildItemCount2 = iChildItemCount2 + (iChildItemCount = childItemCount(i2)))) {
                return iChildItemCount - (iChildItemCount2 - i);
            }
        }
        throw new IllegalStateException("The adapter position is invalid: " + i);
    }

    public int childItemViewType(int i, int i2) {
        return 2;
    }

    public final void collapseParent(int i) {
        if (isExpanded(i)) {
            this.f84499a.append(i, false);
            notifyItemRangeRemoved(positionFromParentPosition(i) + 1, childItemCount(i));
        }
    }

    public abstract VH createChildHolder(@efb ViewGroup viewGroup, int i);

    public abstract VH createParentHolder(@efb ViewGroup viewGroup, int i);

    public final void expandParent(int i) {
        if (isExpanded(i)) {
            return;
        }
        this.f84499a.append(i, true);
        notifyItemRangeInserted(positionFromParentPosition(i) + 1, childItemCount(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int iParentItemCount = parentItemCount();
        for (int i = 0; i < iParentItemCount; i++) {
            if (isExpanded(i)) {
                iParentItemCount += childItemCount(i);
            }
        }
        return iParentItemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int iParentItemPosition = parentItemPosition(i);
        if (!isParentItem(i)) {
            int iChildItemViewType = childItemViewType(iParentItemPosition, childItemPosition(i));
            checkViewType(iChildItemViewType);
            return iChildItemViewType;
        }
        int iParentItemViewType = parentItemViewType(iParentItemPosition);
        checkViewType(iParentItemViewType);
        if (!this.f84500b.contains(Integer.valueOf(iParentItemViewType))) {
            this.f84500b.add(Integer.valueOf(iParentItemViewType));
        }
        return iParentItemViewType;
    }

    public final boolean isExpanded(int i) {
        return this.f84499a.get(i, false);
    }

    public final boolean isParentItem(int i) {
        int iParentItemCount = parentItemCount();
        int iChildItemCount = 0;
        for (int i2 = 0; i2 < iParentItemCount; i2++) {
            if (iChildItemCount == i) {
                return true;
            }
            iChildItemCount++;
            if (isExpanded(i2)) {
                iChildItemCount += childItemCount(i2);
            }
        }
        return false;
    }

    public final void notifyChildChanged(int i, int i2) {
        notifyItemChanged(positionFromChildPosition(i, i2));
    }

    public final void notifyChildInserted(int i, int i2) {
        notifyItemInserted(positionFromChildPosition(i, i2));
    }

    public final void notifyChildRemoved(int i, int i2) {
        notifyItemRemoved(positionFromChildPosition(i, i2));
    }

    public final void notifyParentChanged(int i) {
        notifyItemChanged(positionFromParentPosition(i));
    }

    public final void notifyParentInserted(int i) {
        notifyItemInserted(positionFromParentPosition(i));
    }

    public final void notifyParentRemoved(int i) {
        notifyItemRemoved(positionFromParentPosition(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@efb RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new C13008a(gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    public abstract int parentItemCount();

    public final int parentItemPosition(int i) {
        int iChildItemCount = 0;
        for (int i2 = 0; i2 < parentItemCount(); i2++) {
            iChildItemCount++;
            if (isExpanded(i2)) {
                iChildItemCount += childItemCount(i2);
            }
            if (i < iChildItemCount) {
                return i2;
            }
        }
        throw new IllegalStateException("The adapter position is not a parent type: " + i);
    }

    public int parentItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@efb RecyclerView.ViewHolder viewHolder, int i, @efb List list) {
        onBindViewHolder((AbstractC13009b) viewHolder, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public final VH onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        return this.f84500b.contains(Integer.valueOf(i)) ? (VH) createParentHolder(viewGroup, i) : (VH) createChildHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@efb VH vh) {
        if (isParentItem(vh.getAdapterPosition())) {
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
        }
    }

    public final void onBindViewHolder(@efb VH vh, int i, @efb List<Object> list) {
        int iParentItemPosition = parentItemPosition(i);
        if (isParentItem(i)) {
            bindParentHolder(vh, iParentItemPosition, list);
        } else {
            bindChildHolder(vh, iParentItemPosition, childItemPosition(i), list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final void onBindViewHolder(@efb VH vh, int i) {
    }
}
