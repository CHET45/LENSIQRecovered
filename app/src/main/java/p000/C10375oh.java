package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yanzhenjie.recyclerview.SwipeMenuLayout;
import com.yanzhenjie.recyclerview.SwipeMenuView;
import com.yanzhenjie.recyclerview.p014x.C4402R;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: renamed from: oh */
/* JADX INFO: loaded from: classes7.dex */
public class C10375oh extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i */
    public static final int f67608i = 100000;

    /* JADX INFO: renamed from: j */
    public static final int f67609j = 200000;

    /* JADX INFO: renamed from: a */
    public mxf<View> f67610a = new mxf<>();

    /* JADX INFO: renamed from: b */
    public mxf<View> f67611b = new mxf<>();

    /* JADX INFO: renamed from: c */
    public RecyclerView.Adapter f67612c;

    /* JADX INFO: renamed from: d */
    public LayoutInflater f67613d;

    /* JADX INFO: renamed from: e */
    public khg f67614e;

    /* JADX INFO: renamed from: f */
    public k3c f67615f;

    /* JADX INFO: renamed from: g */
    public f3c f67616g;

    /* JADX INFO: renamed from: h */
    public i3c f67617h;

    /* JADX INFO: renamed from: oh$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.ViewHolder f67618a;

        public a(RecyclerView.ViewHolder viewHolder) {
            this.f67618a = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10375oh.this.f67616g.onItemClick(view, this.f67618a.getAdapterPosition());
        }
    }

    /* JADX INFO: renamed from: oh$b */
    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.ViewHolder f67620a;

        public b(RecyclerView.ViewHolder viewHolder) {
            this.f67620a = viewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C10375oh.this.f67617h.onItemLongClick(view, this.f67620a.getAdapterPosition());
            return true;
        }
    }

    /* JADX INFO: renamed from: oh$c */
    public class c extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f67622a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ GridLayoutManager.SpanSizeLookup f67623b;

        public c(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.f67622a = gridLayoutManager;
            this.f67623b = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            if (C10375oh.this.isHeaderOrFooter(i)) {
                return this.f67622a.getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f67623b;
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i);
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: oh$d */
    public static class d extends RecyclerView.ViewHolder {
        public d(View view) {
            super(view);
        }
    }

    public C10375oh(Context context, RecyclerView.Adapter adapter) {
        this.f67613d = LayoutInflater.from(context);
        this.f67612c = adapter;
    }

    private int getContentItemCount() {
        return this.f67612c.getItemCount();
    }

    private Class<?> getSupperClass(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        return (superclass == null || superclass.equals(Object.class)) ? cls : getSupperClass(superclass);
    }

    public void addFooterView(View view) {
        this.f67611b.put(getFooterCount() + f67609j, view);
    }

    public void addFooterViewAndNotify(View view) {
        addFooterView(view);
        notifyItemInserted(((getHeaderCount() + getContentItemCount()) + getFooterCount()) - 1);
    }

    public void addHeaderView(View view) {
        this.f67610a.put(getHeaderCount() + 100000, view);
    }

    public void addHeaderViewAndNotify(View view) {
        addHeaderView(view);
        notifyItemInserted(getHeaderCount() - 1);
    }

    /* JADX INFO: renamed from: c */
    public void m18674c(khg khgVar) {
        this.f67614e = khgVar;
    }

    public int getFooterCount() {
        return this.f67611b.size();
    }

    public int getHeaderCount() {
        return this.f67610a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getHeaderCount() + getContentItemCount() + getFooterCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (isHeaderOrFooter(i)) {
            return (-i) - 1;
        }
        return this.f67612c.getItemId(i - getHeaderCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return isHeader(i) ? this.f67610a.keyAt(i) : isFooter(i) ? this.f67611b.keyAt((i - getHeaderCount()) - getContentItemCount()) : this.f67612c.getItemViewType(i - getHeaderCount());
    }

    public RecyclerView.Adapter getOriginAdapter() {
        return this.f67612c;
    }

    public boolean isFooter(int i) {
        return i >= getHeaderCount() + getContentItemCount();
    }

    public boolean isHeader(int i) {
        return i >= 0 && i < getHeaderCount();
    }

    public boolean isHeaderOrFooter(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof d) {
            return true;
        }
        return isHeaderOrFooter(viewHolder.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@efb RecyclerView recyclerView) {
        this.f67612c.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new c(gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@efb RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        View view = this.f67610a.get(i);
        if (view != null) {
            return new d(view);
        }
        View view2 = this.f67611b.get(i);
        if (view2 != null) {
            return new d(view2);
        }
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder = this.f67612c.onCreateViewHolder(viewGroup, i);
        if (this.f67616g != null) {
            viewHolderOnCreateViewHolder.itemView.setOnClickListener(new a(viewHolderOnCreateViewHolder));
        }
        if (this.f67617h != null) {
            viewHolderOnCreateViewHolder.itemView.setOnLongClickListener(new b(viewHolderOnCreateViewHolder));
        }
        if (this.f67614e == null) {
            return viewHolderOnCreateViewHolder;
        }
        View viewInflate = this.f67613d.inflate(C4402R.layout.x_recycler_view_item, viewGroup, false);
        ((ViewGroup) viewInflate.findViewById(C4402R.id.swipe_content)).addView(viewHolderOnCreateViewHolder.itemView);
        try {
            Field declaredField = getSupperClass(viewHolderOnCreateViewHolder.getClass()).getDeclaredField("itemView");
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            declaredField.set(viewHolderOnCreateViewHolder, viewInflate);
        } catch (Exception unused) {
        }
        return viewHolderOnCreateViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@efb RecyclerView recyclerView) {
        this.f67612c.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@efb RecyclerView.ViewHolder viewHolder) {
        if (isHeaderOrFooter(viewHolder)) {
            return false;
        }
        return this.f67612c.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@efb RecyclerView.ViewHolder viewHolder) {
        if (!isHeaderOrFooter(viewHolder)) {
            this.f67612c.onViewAttachedToWindow(viewHolder);
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@efb RecyclerView.ViewHolder viewHolder) {
        if (isHeaderOrFooter(viewHolder)) {
            return;
        }
        this.f67612c.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@efb RecyclerView.ViewHolder viewHolder) {
        if (isHeaderOrFooter(viewHolder)) {
            return;
        }
        this.f67612c.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(@efb RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.registerAdapterDataObserver(adapterDataObserver);
    }

    public void removeFooterViewAndNotify(View view) {
        int iIndexOfValue = this.f67611b.indexOfValue(view);
        if (iIndexOfValue == -1) {
            return;
        }
        this.f67611b.removeAt(iIndexOfValue);
        notifyItemRemoved(getHeaderCount() + getContentItemCount() + iIndexOfValue);
    }

    public void removeHeaderViewAndNotify(View view) {
        int iIndexOfValue = this.f67610a.indexOfValue(view);
        if (iIndexOfValue == -1) {
            return;
        }
        this.f67610a.removeAt(iIndexOfValue);
        notifyItemRemoved(iIndexOfValue);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
    }

    public void setOnItemClickListener(f3c f3cVar) {
        this.f67616g = f3cVar;
    }

    public void setOnItemLongClickListener(i3c i3cVar) {
        this.f67617h = i3cVar;
    }

    public void setOnItemMenuClickListener(k3c k3cVar) {
        this.f67615f = k3cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(@efb RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.unregisterAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@efb RecyclerView.ViewHolder viewHolder, int i, @efb List<Object> list) {
        if (isHeaderOrFooter(viewHolder)) {
            return;
        }
        View view = viewHolder.itemView;
        int headerCount = i - getHeaderCount();
        if ((view instanceof SwipeMenuLayout) && this.f67614e != null) {
            SwipeMenuLayout swipeMenuLayout = (SwipeMenuLayout) view;
            ihg ihgVar = new ihg(swipeMenuLayout);
            ihg ihgVar2 = new ihg(swipeMenuLayout);
            this.f67614e.onCreateMenu(ihgVar, ihgVar2, headerCount);
            SwipeMenuView swipeMenuView = (SwipeMenuView) swipeMenuLayout.getChildAt(0);
            if (ihgVar.hasMenuItems()) {
                swipeMenuView.setOrientation(ihgVar.getOrientation());
                swipeMenuView.createMenu(viewHolder, ihgVar, swipeMenuLayout, 1, this.f67615f);
            } else if (swipeMenuView.getChildCount() > 0) {
                swipeMenuView.removeAllViews();
            }
            SwipeMenuView swipeMenuView2 = (SwipeMenuView) swipeMenuLayout.getChildAt(2);
            if (ihgVar2.hasMenuItems()) {
                swipeMenuView2.setOrientation(ihgVar2.getOrientation());
                swipeMenuView2.createMenu(viewHolder, ihgVar2, swipeMenuLayout, -1, this.f67615f);
            } else if (swipeMenuView2.getChildCount() > 0) {
                swipeMenuView2.removeAllViews();
            }
        }
        this.f67612c.onBindViewHolder(viewHolder, headerCount, list);
    }

    public boolean isHeaderOrFooter(int i) {
        return isHeader(i) || isFooter(i);
    }
}
