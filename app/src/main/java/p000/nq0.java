package p000;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0901d;
import androidx.recyclerview.widget.DiffUtil;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class nq0 extends mt0<Object, BaseViewHolder> {

    /* JADX INFO: renamed from: H */
    public final HashMap<Class<?>, DiffUtil.ItemCallback<Object>> f65240H;

    /* JADX INFO: renamed from: I */
    public final HashMap<Class<?>, Integer> f65241I;

    /* JADX INFO: renamed from: J */
    public final SparseArray<jr0<Object, ?>> f65242J;

    /* JADX INFO: renamed from: nq0$a */
    public final class C9981a extends DiffUtil.ItemCallback<Object> {
        public C9981a() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @igg({"DiffUtilEquals"})
        public boolean areContentsTheSame(@yfb Object obj, @yfb Object obj2) {
            DiffUtil.ItemCallback itemCallback;
            md8.checkParameterIsNotNull(obj, "oldItem");
            md8.checkParameterIsNotNull(obj2, "newItem");
            if (!md8.areEqual(obj.getClass(), obj2.getClass()) || (itemCallback = (DiffUtil.ItemCallback) nq0.this.f65240H.get(obj.getClass())) == null) {
                return true;
            }
            return itemCallback.areContentsTheSame(obj, obj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@yfb Object obj, @yfb Object obj2) {
            DiffUtil.ItemCallback itemCallback;
            md8.checkParameterIsNotNull(obj, "oldItem");
            md8.checkParameterIsNotNull(obj2, "newItem");
            return (!md8.areEqual(obj.getClass(), obj2.getClass()) || (itemCallback = (DiffUtil.ItemCallback) nq0.this.f65240H.get(obj.getClass())) == null) ? md8.areEqual(obj, obj2) : itemCallback.areItemsTheSame(obj, obj2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @gib
        public Object getChangePayload(@yfb Object obj, @yfb Object obj2) {
            DiffUtil.ItemCallback itemCallback;
            md8.checkParameterIsNotNull(obj, "oldItem");
            md8.checkParameterIsNotNull(obj2, "newItem");
            if (!md8.areEqual(obj.getClass(), obj2.getClass()) || (itemCallback = (DiffUtil.ItemCallback) nq0.this.f65240H.get(obj.getClass())) == null) {
                return null;
            }
            return itemCallback.getChangePayload(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: nq0$b */
    public static final class ViewOnClickListenerC9982b implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f65245b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jr0 f65246c;

        public ViewOnClickListenerC9982b(BaseViewHolder baseViewHolder, jr0 jr0Var) {
            this.f65245b = baseViewHolder;
            this.f65246c = jr0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = this.f65245b.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            int headerLayoutCount = adapterPosition - nq0.this.getHeaderLayoutCount();
            jr0 jr0Var = this.f65246c;
            BaseViewHolder baseViewHolder = this.f65245b;
            md8.checkExpressionValueIsNotNull(view, "v");
            jr0Var.onChildClick(baseViewHolder, view, nq0.this.getData().get(headerLayoutCount), headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: nq0$c */
    public static final class ViewOnLongClickListenerC9983c implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f65248b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jr0 f65249c;

        public ViewOnLongClickListenerC9983c(BaseViewHolder baseViewHolder, jr0 jr0Var) {
            this.f65248b = baseViewHolder;
            this.f65249c = jr0Var;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            int adapterPosition = this.f65248b.getAdapterPosition();
            if (adapterPosition == -1) {
                return false;
            }
            int headerLayoutCount = adapterPosition - nq0.this.getHeaderLayoutCount();
            jr0 jr0Var = this.f65249c;
            BaseViewHolder baseViewHolder = this.f65248b;
            md8.checkExpressionValueIsNotNull(view, "v");
            return jr0Var.onChildLongClick(baseViewHolder, view, nq0.this.getData().get(headerLayoutCount), headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: nq0$d */
    public static final class ViewOnClickListenerC9984d implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f65251b;

        public ViewOnClickListenerC9984d(BaseViewHolder baseViewHolder) {
            this.f65251b = baseViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = this.f65251b.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            int headerLayoutCount = adapterPosition - nq0.this.getHeaderLayoutCount();
            jr0<Object, BaseViewHolder> itemBinder = nq0.this.getItemBinder(this.f65251b.getItemViewType());
            BaseViewHolder baseViewHolder = this.f65251b;
            md8.checkExpressionValueIsNotNull(view, "it");
            itemBinder.onClick(baseViewHolder, view, nq0.this.getData().get(headerLayoutCount), headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: nq0$e */
    public static final class ViewOnLongClickListenerC9985e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f65253b;

        public ViewOnLongClickListenerC9985e(BaseViewHolder baseViewHolder) {
            this.f65253b = baseViewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            int adapterPosition = this.f65253b.getAdapterPosition();
            if (adapterPosition == -1) {
                return false;
            }
            int headerLayoutCount = adapterPosition - nq0.this.getHeaderLayoutCount();
            jr0<Object, BaseViewHolder> itemBinder = nq0.this.getItemBinder(this.f65253b.getItemViewType());
            BaseViewHolder baseViewHolder = this.f65253b;
            md8.checkExpressionValueIsNotNull(view, "it");
            return itemBinder.onLongClick(baseViewHolder, view, nq0.this.getData().get(headerLayoutCount), headerLayoutCount);
        }
    }

    public nq0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ nq0 addItemBinder$default(nq0 nq0Var, Class cls, jr0 jr0Var, DiffUtil.ItemCallback itemCallback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
        }
        if ((i & 4) != 0) {
            itemCallback = null;
        }
        return nq0Var.addItemBinder(cls, jr0Var, itemCallback);
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: a */
    public void mo16342a(@yfb BaseViewHolder baseViewHolder, int i) {
        md8.checkParameterIsNotNull(baseViewHolder, "viewHolder");
        super.mo16342a(baseViewHolder, i);
        m18064t(baseViewHolder);
        m18063s(baseViewHolder, i);
    }

    @yfb
    @yn8
    public final <T> nq0 addItemBinder(@yfb Class<? extends T> cls, @yfb jr0<T, ?> jr0Var) {
        return addItemBinder$default(this, cls, jr0Var, null, 4, null);
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: c */
    public void mo2536c(@yfb BaseViewHolder baseViewHolder, @yfb Object obj) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        md8.checkParameterIsNotNull(obj, "item");
        getItemBinder(baseViewHolder.getItemViewType()).convert(baseViewHolder, obj);
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: d */
    public void mo16343d(@yfb BaseViewHolder baseViewHolder, @yfb Object obj, @yfb List<? extends Object> list) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        md8.checkParameterIsNotNull(obj, "item");
        md8.checkParameterIsNotNull(list, "payloads");
        getItemBinder(baseViewHolder.getItemViewType()).convert(baseViewHolder, obj, list);
    }

    @yfb
    public jr0<Object, BaseViewHolder> getItemBinder(int i) {
        jr0<Object, BaseViewHolder> jr0Var = (jr0) this.f65242J.get(i);
        if (jr0Var != null) {
            return jr0Var;
        }
        throw new IllegalStateException(("getItemBinder: viewType '" + i + "' no such Binder found，please use addItemBinder() first!").toString());
    }

    @gib
    public jr0<Object, BaseViewHolder> getItemBinderOrNull(int i) {
        jr0<Object, BaseViewHolder> jr0Var = (jr0) this.f65242J.get(i);
        if (jr0Var == null) {
            return null;
        }
        return jr0Var;
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: i */
    public int mo13358i(int i) {
        return m18065u(getData().get(i).getClass());
    }

    @Override // p000.mt0
    @yfb
    /* JADX INFO: renamed from: k */
    public BaseViewHolder mo13359k(@yfb ViewGroup viewGroup, int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        jr0<Object, BaseViewHolder> itemBinder = getItemBinder(i);
        itemBinder.set_context$com_github_CymChad_brvah(m17549g());
        return itemBinder.onCreateViewHolder(viewGroup, i);
    }

    /* JADX INFO: renamed from: s */
    public void m18063s(@yfb BaseViewHolder baseViewHolder, int i) {
        md8.checkParameterIsNotNull(baseViewHolder, "viewHolder");
        if (getOnItemChildClickListener() == null) {
            jr0<Object, BaseViewHolder> itemBinder = getItemBinder(i);
            Iterator<T> it = itemBinder.getChildClickViewIds().iterator();
            while (it.hasNext()) {
                View viewFindViewById = baseViewHolder.itemView.findViewById(((Number) it.next()).intValue());
                if (viewFindViewById != null) {
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    viewFindViewById.setOnClickListener(new ViewOnClickListenerC9982b(baseViewHolder, itemBinder));
                }
            }
        }
        if (getOnItemChildLongClickListener() == null) {
            jr0<Object, BaseViewHolder> itemBinder2 = getItemBinder(i);
            Iterator<T> it2 = itemBinder2.getChildLongClickViewIds().iterator();
            while (it2.hasNext()) {
                View viewFindViewById2 = baseViewHolder.itemView.findViewById(((Number) it2.next()).intValue());
                if (viewFindViewById2 != null) {
                    if (!viewFindViewById2.isLongClickable()) {
                        viewFindViewById2.setLongClickable(true);
                    }
                    viewFindViewById2.setOnLongClickListener(new ViewOnLongClickListenerC9983c(baseViewHolder, itemBinder2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m18064t(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "viewHolder");
        if (getOnItemClickListener() == null) {
            baseViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC9984d(baseViewHolder));
        }
        if (getOnItemLongClickListener() == null) {
            baseViewHolder.itemView.setOnLongClickListener(new ViewOnLongClickListenerC9985e(baseViewHolder));
        }
    }

    /* JADX INFO: renamed from: u */
    public final int m18065u(@yfb Class<?> cls) {
        md8.checkParameterIsNotNull(cls, "clazz");
        Integer num = this.f65241I.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("findViewType: ViewType: " + cls + " Not Find!").toString());
    }

    public nq0(@gib List<Object> list) {
        super(0, list);
        this.f65240H = new HashMap<>();
        this.f65241I = new HashMap<>();
        this.f65242J = new SparseArray<>();
        setDiffCallback(new C9981a());
    }

    @yfb
    @yn8
    public final <T> nq0 addItemBinder(@yfb Class<? extends T> cls, @yfb jr0<T, ?> jr0Var, @gib DiffUtil.ItemCallback<T> itemCallback) {
        md8.checkParameterIsNotNull(cls, "clazz");
        md8.checkParameterIsNotNull(jr0Var, "baseItemBinder");
        int size = this.f65241I.size() + 1;
        this.f65241I.put(cls, Integer.valueOf(size));
        this.f65242J.append(size, jr0Var);
        jr0Var.set_adapter$com_github_CymChad_brvah(this);
        if (itemCallback != null) {
            this.f65240H.put(cls, itemCallback);
        }
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        jr0<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(baseViewHolder.getItemViewType());
        if (itemBinderOrNull != null) {
            return itemBinderOrNull.onFailedToRecycleView(baseViewHolder);
        }
        return false;
    }

    @Override // p000.mt0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        super.onViewAttachedToWindow(baseViewHolder);
        jr0<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(baseViewHolder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewAttachedToWindow(baseViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        super.onViewDetachedFromWindow(baseViewHolder);
        jr0<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(baseViewHolder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewDetachedFromWindow(baseViewHolder);
        }
    }

    public static /* synthetic */ nq0 addItemBinder$default(nq0 nq0Var, jr0 jr0Var, DiffUtil.ItemCallback itemCallback, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                itemCallback = null;
            }
            md8.checkParameterIsNotNull(jr0Var, "baseItemBinder");
            md8.reifiedOperationMarker(4, "T");
            nq0Var.addItemBinder(Object.class, jr0Var, itemCallback);
            return nq0Var;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
    }

    public /* synthetic */ nq0(List list, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : list);
    }

    @yfb
    public final /* synthetic */ <T> nq0 addItemBinder(@yfb jr0<T, ?> jr0Var, @gib DiffUtil.ItemCallback<T> itemCallback) {
        md8.checkParameterIsNotNull(jr0Var, "baseItemBinder");
        md8.reifiedOperationMarker(4, "T");
        addItemBinder(Object.class, jr0Var, itemCallback);
        return this;
    }
}
