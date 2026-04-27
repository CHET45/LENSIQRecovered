package p000;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.C2501R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public class ar0 implements uo4 {

    /* JADX INFO: renamed from: l */
    public static final int f11628l = 0;

    /* JADX INFO: renamed from: m */
    public static final C1568a f11629m = new C1568a(null);

    /* JADX INFO: renamed from: a */
    public boolean f11630a;

    /* JADX INFO: renamed from: b */
    public boolean f11631b;

    /* JADX INFO: renamed from: c */
    public int f11632c;

    /* JADX INFO: renamed from: d */
    @yfb
    public ItemTouchHelper f11633d;

    /* JADX INFO: renamed from: e */
    @yfb
    public go4 f11634e;

    /* JADX INFO: renamed from: f */
    @gib
    public View.OnTouchListener f11635f;

    /* JADX INFO: renamed from: g */
    @gib
    public View.OnLongClickListener f11636g;

    /* JADX INFO: renamed from: h */
    @gib
    public h3c f11637h;

    /* JADX INFO: renamed from: i */
    @gib
    public o3c f11638i;

    /* JADX INFO: renamed from: j */
    public boolean f11639j;

    /* JADX INFO: renamed from: k */
    public final mt0<?, ?> f11640k;

    /* JADX INFO: renamed from: ar0$a */
    public static final class C1568a {
        private C1568a() {
        }

        public /* synthetic */ C1568a(jt3 jt3Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: ar0$b */
    public static final class ViewOnLongClickListenerC1569b implements View.OnLongClickListener {
        public ViewOnLongClickListenerC1569b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            if (!ar0.this.isDragEnabled()) {
                return true;
            }
            ItemTouchHelper itemTouchHelper = ar0.this.getItemTouchHelper();
            Object tag = view.getTag(C2501R.id.BaseQuickAdapter_viewholder_support);
            if (tag == null) {
                throw new mlh("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
            }
            itemTouchHelper.startDrag((RecyclerView.ViewHolder) tag);
            return true;
        }
    }

    /* JADX INFO: renamed from: ar0$c */
    public static final class ViewOnTouchListenerC1570c implements View.OnTouchListener {
        public ViewOnTouchListenerC1570c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            md8.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() != 0 || ar0.this.isDragOnLongPressEnabled()) {
                return false;
            }
            if (ar0.this.isDragEnabled()) {
                ItemTouchHelper itemTouchHelper = ar0.this.getItemTouchHelper();
                Object tag = view.getTag(C2501R.id.BaseQuickAdapter_viewholder_support);
                if (tag == null) {
                    throw new mlh("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
                }
                itemTouchHelper.startDrag((RecyclerView.ViewHolder) tag);
            }
            return true;
        }
    }

    public ar0(@yfb mt0<?, ?> mt0Var) {
        md8.checkParameterIsNotNull(mt0Var, "baseQuickAdapter");
        this.f11640k = mt0Var;
        initItemTouch();
        this.f11639j = true;
    }

    private final boolean inRange(int i) {
        return i >= 0 && i < this.f11640k.getData().size();
    }

    private final void initItemTouch() {
        go4 go4Var = new go4(this);
        this.f11634e = go4Var;
        this.f11633d = new ItemTouchHelper(go4Var);
    }

    @gib
    /* JADX INFO: renamed from: a */
    public final h3c m2539a() {
        return this.f11637h;
    }

    public final void attachToRecyclerView(@yfb RecyclerView recyclerView) {
        md8.checkParameterIsNotNull(recyclerView, "recyclerView");
        ItemTouchHelper itemTouchHelper = this.f11633d;
        if (itemTouchHelper == null) {
            md8.throwUninitializedPropertyAccessException("itemTouchHelper");
        }
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }

    @gib
    /* JADX INFO: renamed from: b */
    public final o3c m2540b() {
        return this.f11638i;
    }

    @gib
    /* JADX INFO: renamed from: c */
    public final View.OnLongClickListener m2541c() {
        return this.f11636g;
    }

    @gib
    /* JADX INFO: renamed from: d */
    public final View.OnTouchListener m2542d() {
        return this.f11635f;
    }

    /* JADX INFO: renamed from: e */
    public final int m2543e(@yfb RecyclerView.ViewHolder viewHolder) {
        md8.checkParameterIsNotNull(viewHolder, "viewHolder");
        return viewHolder.getAdapterPosition() - this.f11640k.getHeaderLayoutCount();
    }

    @yfb
    public final ItemTouchHelper getItemTouchHelper() {
        ItemTouchHelper itemTouchHelper = this.f11633d;
        if (itemTouchHelper == null) {
            md8.throwUninitializedPropertyAccessException("itemTouchHelper");
        }
        return itemTouchHelper;
    }

    @yfb
    public final go4 getItemTouchHelperCallback() {
        go4 go4Var = this.f11634e;
        if (go4Var == null) {
            md8.throwUninitializedPropertyAccessException("itemTouchHelperCallback");
        }
        return go4Var;
    }

    public final int getToggleViewId() {
        return this.f11632c;
    }

    public boolean hasToggleView() {
        return this.f11632c != 0;
    }

    public final void initView$com_github_CymChad_brvah(@yfb BaseViewHolder baseViewHolder) {
        View viewFindViewById;
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        if (this.f11630a && hasToggleView() && (viewFindViewById = baseViewHolder.itemView.findViewById(this.f11632c)) != null) {
            viewFindViewById.setTag(C2501R.id.BaseQuickAdapter_viewholder_support, baseViewHolder);
            if (isDragOnLongPressEnabled()) {
                viewFindViewById.setOnLongClickListener(this.f11636g);
            } else {
                viewFindViewById.setOnTouchListener(this.f11635f);
            }
        }
    }

    public final boolean isDragEnabled() {
        return this.f11630a;
    }

    public boolean isDragOnLongPressEnabled() {
        return this.f11639j;
    }

    public final boolean isSwipeEnabled() {
        return this.f11631b;
    }

    public void onItemDragEnd(@yfb RecyclerView.ViewHolder viewHolder) {
        md8.checkParameterIsNotNull(viewHolder, "viewHolder");
        h3c h3cVar = this.f11637h;
        if (h3cVar != null) {
            h3cVar.onItemDragEnd(viewHolder, m2543e(viewHolder));
        }
    }

    public void onItemDragMoving(@yfb RecyclerView.ViewHolder viewHolder, @yfb RecyclerView.ViewHolder viewHolder2) {
        md8.checkParameterIsNotNull(viewHolder, "source");
        md8.checkParameterIsNotNull(viewHolder2, "target");
        int iM2543e = m2543e(viewHolder);
        int iM2543e2 = m2543e(viewHolder2);
        if (inRange(iM2543e) && inRange(iM2543e2)) {
            if (iM2543e < iM2543e2) {
                int i = iM2543e;
                while (i < iM2543e2) {
                    int i2 = i + 1;
                    Collections.swap(this.f11640k.getData(), i, i2);
                    i = i2;
                }
            } else {
                int i3 = iM2543e2 + 1;
                if (iM2543e >= i3) {
                    int i4 = iM2543e;
                    while (true) {
                        Collections.swap(this.f11640k.getData(), i4, i4 - 1);
                        if (i4 == i3) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
            }
            this.f11640k.notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        }
        h3c h3cVar = this.f11637h;
        if (h3cVar != null) {
            h3cVar.onItemDragMoving(viewHolder, iM2543e, viewHolder2, iM2543e2);
        }
    }

    public void onItemDragStart(@yfb RecyclerView.ViewHolder viewHolder) {
        md8.checkParameterIsNotNull(viewHolder, "viewHolder");
        h3c h3cVar = this.f11637h;
        if (h3cVar != null) {
            h3cVar.onItemDragStart(viewHolder, m2543e(viewHolder));
        }
    }

    public void onItemSwipeClear(@yfb RecyclerView.ViewHolder viewHolder) {
        o3c o3cVar;
        md8.checkParameterIsNotNull(viewHolder, "viewHolder");
        if (!this.f11631b || (o3cVar = this.f11638i) == null) {
            return;
        }
        o3cVar.clearView(viewHolder, m2543e(viewHolder));
    }

    public void onItemSwipeStart(@yfb RecyclerView.ViewHolder viewHolder) {
        o3c o3cVar;
        md8.checkParameterIsNotNull(viewHolder, "viewHolder");
        if (!this.f11631b || (o3cVar = this.f11638i) == null) {
            return;
        }
        o3cVar.onItemSwipeStart(viewHolder, m2543e(viewHolder));
    }

    public void onItemSwiped(@yfb RecyclerView.ViewHolder viewHolder) {
        o3c o3cVar;
        md8.checkParameterIsNotNull(viewHolder, "viewHolder");
        int iM2543e = m2543e(viewHolder);
        if (inRange(iM2543e)) {
            this.f11640k.getData().remove(iM2543e);
            this.f11640k.notifyItemRemoved(viewHolder.getAdapterPosition());
            if (!this.f11631b || (o3cVar = this.f11638i) == null) {
                return;
            }
            o3cVar.onItemSwiped(viewHolder, iM2543e);
        }
    }

    public void onItemSwiping(@gib Canvas canvas, @gib RecyclerView.ViewHolder viewHolder, float f, float f2, boolean z) {
        o3c o3cVar;
        if (!this.f11631b || (o3cVar = this.f11638i) == null) {
            return;
        }
        o3cVar.onItemSwipeMoving(canvas, viewHolder, f, f2, z);
    }

    public final void setDragEnabled(boolean z) {
        this.f11630a = z;
    }

    public void setDragOnLongPressEnabled(boolean z) {
        this.f11639j = z;
        if (z) {
            this.f11635f = null;
            this.f11636g = new ViewOnLongClickListenerC1569b();
        } else {
            this.f11635f = new ViewOnTouchListenerC1570c();
            this.f11636g = null;
        }
    }

    public final void setItemTouchHelper(@yfb ItemTouchHelper itemTouchHelper) {
        md8.checkParameterIsNotNull(itemTouchHelper, "<set-?>");
        this.f11633d = itemTouchHelper;
    }

    public final void setItemTouchHelperCallback(@yfb go4 go4Var) {
        md8.checkParameterIsNotNull(go4Var, "<set-?>");
        this.f11634e = go4Var;
    }

    public final void setMOnItemDragListener(@gib h3c h3cVar) {
        this.f11637h = h3cVar;
    }

    public final void setMOnItemSwipeListener(@gib o3c o3cVar) {
        this.f11638i = o3cVar;
    }

    public final void setMOnToggleViewLongClickListener(@gib View.OnLongClickListener onLongClickListener) {
        this.f11636g = onLongClickListener;
    }

    public final void setMOnToggleViewTouchListener(@gib View.OnTouchListener onTouchListener) {
        this.f11635f = onTouchListener;
    }

    @Override // p000.uo4
    public void setOnItemDragListener(@gib h3c h3cVar) {
        this.f11637h = h3cVar;
    }

    @Override // p000.uo4
    public void setOnItemSwipeListener(@gib o3c o3cVar) {
        this.f11638i = o3cVar;
    }

    public final void setSwipeEnabled(boolean z) {
        this.f11631b = z;
    }

    public final void setToggleViewId(int i) {
        this.f11632c = i;
    }
}
