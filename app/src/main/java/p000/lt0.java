package p000;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0901d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lt0<T> extends mt0<T, BaseViewHolder> {

    /* JADX INFO: renamed from: H */
    public final fx8 f58656H;

    /* JADX INFO: renamed from: lt0$a */
    public static final class ViewOnClickListenerC8959a implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f58658b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ lr0 f58659c;

        public ViewOnClickListenerC8959a(BaseViewHolder baseViewHolder, lr0 lr0Var) {
            this.f58658b = baseViewHolder;
            this.f58659c = lr0Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = this.f58658b.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            int headerLayoutCount = adapterPosition - lt0.this.getHeaderLayoutCount();
            lr0 lr0Var = this.f58659c;
            BaseViewHolder baseViewHolder = this.f58658b;
            md8.checkExpressionValueIsNotNull(view, "v");
            lr0Var.onChildClick(baseViewHolder, view, lt0.this.getData().get(headerLayoutCount), headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: lt0$b */
    public static final class ViewOnLongClickListenerC8960b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f58661b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ lr0 f58662c;

        public ViewOnLongClickListenerC8960b(BaseViewHolder baseViewHolder, lr0 lr0Var) {
            this.f58661b = baseViewHolder;
            this.f58662c = lr0Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            int adapterPosition = this.f58661b.getAdapterPosition();
            if (adapterPosition == -1) {
                return false;
            }
            int headerLayoutCount = adapterPosition - lt0.this.getHeaderLayoutCount();
            lr0 lr0Var = this.f58662c;
            BaseViewHolder baseViewHolder = this.f58661b;
            md8.checkExpressionValueIsNotNull(view, "v");
            return lr0Var.onChildLongClick(baseViewHolder, view, lt0.this.getData().get(headerLayoutCount), headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: lt0$c */
    public static final class ViewOnClickListenerC8961c implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f58664b;

        public ViewOnClickListenerC8961c(BaseViewHolder baseViewHolder) {
            this.f58664b = baseViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = this.f58664b.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            int headerLayoutCount = adapterPosition - lt0.this.getHeaderLayoutCount();
            lr0 lr0Var = (lr0) lt0.this.getMItemProviders().get(this.f58664b.getItemViewType());
            BaseViewHolder baseViewHolder = this.f58664b;
            md8.checkExpressionValueIsNotNull(view, "it");
            lr0Var.onClick(baseViewHolder, view, lt0.this.getData().get(headerLayoutCount), headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: lt0$d */
    public static final class ViewOnLongClickListenerC8962d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f58666b;

        public ViewOnLongClickListenerC8962d(BaseViewHolder baseViewHolder) {
            this.f58666b = baseViewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            int adapterPosition = this.f58666b.getAdapterPosition();
            if (adapterPosition == -1) {
                return false;
            }
            int headerLayoutCount = adapterPosition - lt0.this.getHeaderLayoutCount();
            lr0 lr0Var = (lr0) lt0.this.getMItemProviders().get(this.f58666b.getItemViewType());
            BaseViewHolder baseViewHolder = this.f58666b;
            md8.checkExpressionValueIsNotNull(view, "it");
            return lr0Var.onLongClick(baseViewHolder, view, lt0.this.getData().get(headerLayoutCount), headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: lt0$e */
    public static final class C8963e extends tt8 implements ny6<SparseArray<lr0<T>>> {

        /* JADX INFO: renamed from: a */
        public static final C8963e f58667a = new C8963e();

        public C8963e() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final SparseArray<lr0<T>> invoke() {
            return new SparseArray<>();
        }
    }

    public lt0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseArray<lr0<T>> getMItemProviders() {
        return (SparseArray) this.f58656H.getValue();
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: a */
    public void mo16342a(@yfb BaseViewHolder baseViewHolder, int i) {
        md8.checkParameterIsNotNull(baseViewHolder, "viewHolder");
        super.mo16342a(baseViewHolder, i);
        m16345t(baseViewHolder);
        m16344s(baseViewHolder, i);
    }

    public void addItemProvider(@yfb lr0<T> lr0Var) {
        md8.checkParameterIsNotNull(lr0Var, "provider");
        lr0Var.setAdapter$com_github_CymChad_brvah(this);
        getMItemProviders().put(lr0Var.getItemViewType(), lr0Var);
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: c */
    public void mo2536c(@yfb BaseViewHolder baseViewHolder, T t) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        lr0<T> lr0VarM16346u = m16346u(baseViewHolder.getItemViewType());
        if (lr0VarM16346u == null) {
            md8.throwNpe();
        }
        lr0VarM16346u.convert(baseViewHolder, t);
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: d */
    public void mo16343d(@yfb BaseViewHolder baseViewHolder, T t, @yfb List<? extends Object> list) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        md8.checkParameterIsNotNull(list, "payloads");
        lr0<T> lr0VarM16346u = m16346u(baseViewHolder.getItemViewType());
        if (lr0VarM16346u == null) {
            md8.throwNpe();
        }
        lr0VarM16346u.convert(baseViewHolder, t, list);
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: i */
    public int mo13358i(int i) {
        return m16347v(getData(), i);
    }

    @Override // p000.mt0
    @yfb
    /* JADX INFO: renamed from: k */
    public BaseViewHolder mo13359k(@yfb ViewGroup viewGroup, int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        lr0<T> lr0VarM16346u = m16346u(i);
        if (lr0VarM16346u == null) {
            throw new IllegalStateException(("ViewType: " + i + " no such provider found，please use addItemProvider() first!").toString());
        }
        Context context = viewGroup.getContext();
        md8.checkExpressionValueIsNotNull(context, "parent.context");
        lr0VarM16346u.setContext(context);
        BaseViewHolder baseViewHolderOnCreateViewHolder = lr0VarM16346u.onCreateViewHolder(viewGroup, i);
        lr0VarM16346u.onViewHolderCreated(baseViewHolderOnCreateViewHolder, i);
        return baseViewHolderOnCreateViewHolder;
    }

    /* JADX INFO: renamed from: s */
    public void m16344s(@yfb BaseViewHolder baseViewHolder, int i) {
        lr0<T> lr0VarM16346u;
        md8.checkParameterIsNotNull(baseViewHolder, "viewHolder");
        if (getOnItemChildClickListener() == null) {
            lr0<T> lr0VarM16346u2 = m16346u(i);
            if (lr0VarM16346u2 == null) {
                return;
            }
            Iterator<T> it = lr0VarM16346u2.getChildClickViewIds().iterator();
            while (it.hasNext()) {
                View viewFindViewById = baseViewHolder.itemView.findViewById(((Number) it.next()).intValue());
                if (viewFindViewById != null) {
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    viewFindViewById.setOnClickListener(new ViewOnClickListenerC8959a(baseViewHolder, lr0VarM16346u2));
                }
            }
        }
        if (getOnItemChildLongClickListener() != null || (lr0VarM16346u = m16346u(i)) == null) {
            return;
        }
        Iterator<T> it2 = lr0VarM16346u.getChildLongClickViewIds().iterator();
        while (it2.hasNext()) {
            View viewFindViewById2 = baseViewHolder.itemView.findViewById(((Number) it2.next()).intValue());
            if (viewFindViewById2 != null) {
                if (!viewFindViewById2.isLongClickable()) {
                    viewFindViewById2.setLongClickable(true);
                }
                viewFindViewById2.setOnLongClickListener(new ViewOnLongClickListenerC8960b(baseViewHolder, lr0VarM16346u));
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m16345t(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "viewHolder");
        if (getOnItemClickListener() == null) {
            baseViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC8961c(baseViewHolder));
        }
        if (getOnItemLongClickListener() == null) {
            baseViewHolder.itemView.setOnLongClickListener(new ViewOnLongClickListenerC8962d(baseViewHolder));
        }
    }

    @gib
    /* JADX INFO: renamed from: u */
    public lr0<T> m16346u(int i) {
        return getMItemProviders().get(i);
    }

    /* JADX INFO: renamed from: v */
    public abstract int m16347v(@yfb List<? extends T> list, int i);

    public /* synthetic */ lt0(List list, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : list);
    }

    @Override // p000.mt0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        super.onViewAttachedToWindow(baseViewHolder);
        lr0<T> lr0VarM16346u = m16346u(baseViewHolder.getItemViewType());
        if (lr0VarM16346u != null) {
            lr0VarM16346u.onViewAttachedToWindow(baseViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
        super.onViewDetachedFromWindow(baseViewHolder);
        lr0<T> lr0VarM16346u = m16346u(baseViewHolder.getItemViewType());
        if (lr0VarM16346u != null) {
            lr0VarM16346u.onViewDetachedFromWindow(baseViewHolder);
        }
    }

    public lt0(@gib List<T> list) {
        super(0, list);
        this.f58656H = hz8.lazy(g39.f38327c, (ny6) C8963e.f58667a);
    }
}
