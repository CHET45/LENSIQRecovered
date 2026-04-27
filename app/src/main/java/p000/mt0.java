package p000;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.C0901d;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import p000.au0;
import p000.me1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mt0<T, VH extends BaseViewHolder> extends RecyclerView.Adapter<VH> implements au0, rr0 {

    /* JADX INFO: renamed from: C */
    public static final int f62013C = 268435729;

    /* JADX INFO: renamed from: D */
    public static final int f62014D = 268436002;

    /* JADX INFO: renamed from: E */
    public static final int f62015E = 268436275;

    /* JADX INFO: renamed from: F */
    public static final int f62016F = 268436821;

    /* JADX INFO: renamed from: G */
    public static final C9508b f62017G = new C9508b(null);

    /* JADX INFO: renamed from: A */
    public final LinkedHashSet<Integer> f62018A;

    /* JADX INFO: renamed from: B */
    public final int f62019B;

    /* JADX INFO: renamed from: a */
    @yfb
    public List<T> f62020a;

    /* JADX INFO: renamed from: b */
    public boolean f62021b;

    /* JADX INFO: renamed from: c */
    public boolean f62022c;

    /* JADX INFO: renamed from: d */
    public boolean f62023d;

    /* JADX INFO: renamed from: e */
    public boolean f62024e;

    /* JADX INFO: renamed from: f */
    public boolean f62025f;

    /* JADX INFO: renamed from: g */
    public boolean f62026g;

    /* JADX INFO: renamed from: h */
    public boolean f62027h;

    /* JADX INFO: renamed from: i */
    @gib
    public hq0 f62028i;

    /* JADX INFO: renamed from: j */
    public le1<T> f62029j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f62030k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f62031l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f62032m;

    /* JADX INFO: renamed from: n */
    public int f62033n;

    /* JADX INFO: renamed from: o */
    public lb7 f62034o;

    /* JADX INFO: renamed from: p */
    public g3c f62035p;

    /* JADX INFO: renamed from: q */
    public j3c f62036q;

    /* JADX INFO: renamed from: r */
    public d3c f62037r;

    /* JADX INFO: renamed from: s */
    public e3c f62038s;

    /* JADX INFO: renamed from: t */
    public qu0 f62039t;

    /* JADX INFO: renamed from: u */
    public ar0 f62040u;

    /* JADX INFO: renamed from: v */
    @gib
    public sr0 f62041v;

    /* JADX INFO: renamed from: w */
    @yfb
    public Context f62042w;

    /* JADX INFO: renamed from: x */
    @yfb
    public WeakReference<RecyclerView> f62043x;

    /* JADX INFO: renamed from: y */
    @gib
    public RecyclerView f62044y;

    /* JADX INFO: renamed from: z */
    public final LinkedHashSet<Integer> f62045z;

    /* JADX INFO: renamed from: mt0$a */
    public enum EnumC9507a {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    /* JADX INFO: renamed from: mt0$b */
    public static final class C9508b {
        private C9508b() {
        }

        public /* synthetic */ C9508b(jt3 jt3Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: mt0$c */
    public static final class ViewOnClickListenerC9509c implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f62053b;

        public ViewOnClickListenerC9509c(BaseViewHolder baseViewHolder) {
            this.f62053b = baseViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = this.f62053b.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            int headerLayoutCount = adapterPosition - mt0.this.getHeaderLayoutCount();
            mt0 mt0Var = mt0.this;
            md8.checkExpressionValueIsNotNull(view, "v");
            mt0Var.m17555p(view, headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: mt0$d */
    public static final class ViewOnLongClickListenerC9510d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f62055b;

        public ViewOnLongClickListenerC9510d(BaseViewHolder baseViewHolder) {
            this.f62055b = baseViewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            int adapterPosition = this.f62055b.getAdapterPosition();
            if (adapterPosition == -1) {
                return false;
            }
            int headerLayoutCount = adapterPosition - mt0.this.getHeaderLayoutCount();
            mt0 mt0Var = mt0.this;
            md8.checkExpressionValueIsNotNull(view, "v");
            return mt0Var.m17556q(view, headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: mt0$e */
    public static final class ViewOnClickListenerC9511e implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f62057b;

        public ViewOnClickListenerC9511e(BaseViewHolder baseViewHolder) {
            this.f62057b = baseViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = this.f62057b.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            int headerLayoutCount = adapterPosition - mt0.this.getHeaderLayoutCount();
            mt0 mt0Var = mt0.this;
            md8.checkExpressionValueIsNotNull(view, "v");
            mt0Var.m17553n(view, headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: mt0$f */
    public static final class ViewOnLongClickListenerC9512f implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f62059b;

        public ViewOnLongClickListenerC9512f(BaseViewHolder baseViewHolder) {
            this.f62059b = baseViewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            int adapterPosition = this.f62059b.getAdapterPosition();
            if (adapterPosition == -1) {
                return false;
            }
            int headerLayoutCount = adapterPosition - mt0.this.getHeaderLayoutCount();
            mt0 mt0Var = mt0.this;
            md8.checkExpressionValueIsNotNull(view, "v");
            return mt0Var.m17554o(view, headerLayoutCount);
        }
    }

    /* JADX INFO: renamed from: mt0$g */
    public static final class C9513g extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecyclerView.LayoutManager f62061b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GridLayoutManager.SpanSizeLookup f62062c;

        public C9513g(RecyclerView.LayoutManager layoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.f62061b = layoutManager;
            this.f62062c = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            int itemViewType = mt0.this.getItemViewType(i);
            if (itemViewType == 268435729 && mt0.this.getHeaderViewAsFlow()) {
                return 1;
            }
            if (itemViewType == 268436275 && mt0.this.getFooterViewAsFlow()) {
                return 1;
            }
            if (mt0.this.f62034o == null) {
                return mt0.this.mo10228j(itemViewType) ? ((GridLayoutManager) this.f62061b).getSpanCount() : this.f62062c.getSpanSize(i);
            }
            if (mt0.this.mo10228j(itemViewType)) {
                return ((GridLayoutManager) this.f62061b).getSpanCount();
            }
            lb7 lb7Var = mt0.this.f62034o;
            if (lb7Var == null) {
                md8.throwNpe();
            }
            return lb7Var.getSpanSize((GridLayoutManager) this.f62061b, itemViewType, i - mt0.this.getHeaderLayoutCount());
        }
    }

    @yn8
    public mt0(@uw8 int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ FrameLayout access$getMEmptyLayout$p(mt0 mt0Var) {
        FrameLayout frameLayout = mt0Var.f62032m;
        if (frameLayout == null) {
            md8.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ LinearLayout access$getMFooterLayout$p(mt0 mt0Var) {
        LinearLayout linearLayout = mt0Var.f62031l;
        if (linearLayout == null) {
            md8.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        return linearLayout;
    }

    public static final /* synthetic */ LinearLayout access$getMHeaderLayout$p(mt0 mt0Var) {
        LinearLayout linearLayout = mt0Var.f62030k;
        if (linearLayout == null) {
            md8.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        return linearLayout;
    }

    private final void addAnimation(RecyclerView.ViewHolder viewHolder) {
        if (this.f62026g) {
            if (!this.f62027h || viewHolder.getLayoutPosition() > this.f62033n) {
                hq0 c7513in = this.f62028i;
                if (c7513in == null) {
                    c7513in = new C7513in(0.0f, 1, null);
                }
                View view = viewHolder.itemView;
                md8.checkExpressionValueIsNotNull(view, "holder.itemView");
                for (Animator animator : c7513in.animators(view)) {
                    m17557r(animator, viewHolder.getLayoutPosition());
                }
                this.f62033n = viewHolder.getLayoutPosition();
            }
        }
    }

    public static /* synthetic */ int addFooterView$default(mt0 mt0Var, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return mt0Var.addFooterView(view, i, i2);
    }

    public static /* synthetic */ int addHeaderView$default(mt0 mt0Var, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return mt0Var.addHeaderView(view, i, i2);
    }

    private final void checkModule() {
        if (this instanceof mc9) {
            this.f62041v = addLoadMoreModule(this);
        }
        if (this instanceof bwh) {
            this.f62039t = addUpFetchModule(this);
        }
        if (this instanceof vo4) {
            this.f62040u = addDraggableModule(this);
        }
    }

    private final VH createBaseGenericKInstance(Class<?> cls, View view) {
        try {
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(View.class);
                md8.checkExpressionValueIsNotNull(declaredConstructor, "z.getDeclaredConstructor(View::class.java)");
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(view);
                if (objNewInstance != null) {
                    return (VH) objNewInstance;
                }
                throw new mlh("null cannot be cast to non-null type VH");
            }
            Constructor<?> declaredConstructor2 = cls.getDeclaredConstructor(getClass(), View.class);
            md8.checkExpressionValueIsNotNull(declaredConstructor2, "z.getDeclaredConstructor…aClass, View::class.java)");
            declaredConstructor2.setAccessible(true);
            Object objNewInstance2 = declaredConstructor2.newInstance(this, view);
            if (objNewInstance2 != null) {
                return (VH) objNewInstance2;
            }
            throw new mlh("null cannot be cast to non-null type VH");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private final Class<?> getInstancedGenericKClass(Class<?> cls) {
        try {
            Type genericSuperclass = cls.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                return null;
            }
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            md8.checkExpressionValueIsNotNull(actualTypeArguments, "type.actualTypeArguments");
            for (Type type : actualTypeArguments) {
                if (type instanceof Class) {
                    if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                        return (Class) type;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    md8.checkExpressionValueIsNotNull(rawType, "temp.rawType");
                    if ((rawType instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) rawType)) {
                        return (Class) rawType;
                    }
                } else {
                    continue;
                }
            }
            return null;
        } catch (TypeNotPresentException e) {
            e.printStackTrace();
            return null;
        } catch (GenericSignatureFormatError e2) {
            e2.printStackTrace();
            return null;
        } catch (MalformedParameterizedTypeException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ int setFooterView$default(mt0 mt0Var, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFooterView");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return mt0Var.setFooterView(view, i, i2);
    }

    public static /* synthetic */ int setHeaderView$default(mt0 mt0Var, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderView");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return mt0Var.setHeaderView(view, i, i2);
    }

    @q64(message = "Please use recyclerView", replaceWith = @i2e(expression = "recyclerView", imports = {}))
    public static /* synthetic */ void weakRecyclerView$annotations() {
    }

    /* JADX INFO: renamed from: a */
    public void mo16342a(@yfb VH vh, int i) {
        md8.checkParameterIsNotNull(vh, "viewHolder");
        if (this.f62035p != null) {
            vh.itemView.setOnClickListener(new ViewOnClickListenerC9509c(vh));
        }
        if (this.f62036q != null) {
            vh.itemView.setOnLongClickListener(new ViewOnLongClickListenerC9510d(vh));
        }
        if (this.f62037r != null) {
            for (Integer num : getChildClickViewIds()) {
                View view = vh.itemView;
                md8.checkExpressionValueIsNotNull(num, "id");
                View viewFindViewById = view.findViewById(num.intValue());
                if (viewFindViewById != null) {
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    viewFindViewById.setOnClickListener(new ViewOnClickListenerC9511e(vh));
                }
            }
        }
        if (this.f62038s != null) {
            for (Integer num2 : getChildLongClickViewIds()) {
                View view2 = vh.itemView;
                md8.checkExpressionValueIsNotNull(num2, "id");
                View viewFindViewById2 = view2.findViewById(num2.intValue());
                if (viewFindViewById2 != null) {
                    if (!viewFindViewById2.isLongClickable()) {
                        viewFindViewById2.setLongClickable(true);
                    }
                    viewFindViewById2.setOnLongClickListener(new ViewOnLongClickListenerC9512f(vh));
                }
            }
        }
    }

    public final void addChildClickViewIds(@yfb @kr7 int... iArr) {
        md8.checkParameterIsNotNull(iArr, "viewIds");
        for (int i : iArr) {
            this.f62045z.add(Integer.valueOf(i));
        }
    }

    public final void addChildLongClickViewIds(@yfb @kr7 int... iArr) {
        md8.checkParameterIsNotNull(iArr, "viewIds");
        for (int i : iArr) {
            this.f62018A.add(Integer.valueOf(i));
        }
    }

    public void addData(@h78(from = 0) int i, T t) {
        this.f62020a.add(i, t);
        notifyItemInserted(i + getHeaderLayoutCount());
        m17546b(1);
    }

    @Override // p000.au0
    @yfb
    public ar0 addDraggableModule(@yfb mt0<?, ?> mt0Var) {
        md8.checkParameterIsNotNull(mt0Var, "baseQuickAdapter");
        return au0.C1609a.addDraggableModule(this, mt0Var);
    }

    @yn8
    public final int addFooterView(@yfb View view) {
        return addFooterView$default(this, view, 0, 0, 6, null);
    }

    @yn8
    public final int addHeaderView(@yfb View view) {
        return addHeaderView$default(this, view, 0, 0, 6, null);
    }

    @Override // p000.au0
    @yfb
    public sr0 addLoadMoreModule(@yfb mt0<?, ?> mt0Var) {
        md8.checkParameterIsNotNull(mt0Var, "baseQuickAdapter");
        return au0.C1609a.addLoadMoreModule(this, mt0Var);
    }

    @Override // p000.au0
    @yfb
    public qu0 addUpFetchModule(@yfb mt0<?, ?> mt0Var) {
        md8.checkParameterIsNotNull(mt0Var, "baseQuickAdapter");
        return au0.C1609a.addUpFetchModule(this, mt0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m17546b(int i) {
        if (this.f62020a.size() == i) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo2536c(@yfb VH vh, T t);

    /* JADX INFO: renamed from: d */
    public void mo16343d(@yfb VH vh, T t, @yfb List<? extends Object> list) {
        md8.checkParameterIsNotNull(vh, "holder");
        md8.checkParameterIsNotNull(list, "payloads");
    }

    @yfb
    /* JADX INFO: renamed from: e */
    public VH m17547e(@yfb View view) {
        md8.checkParameterIsNotNull(view, "view");
        Class<?> instancedGenericKClass = null;
        for (Class<?> superclass = getClass(); instancedGenericKClass == null && superclass != null; superclass = superclass.getSuperclass()) {
            instancedGenericKClass = getInstancedGenericKClass(superclass);
        }
        VH vh = instancedGenericKClass == null ? (VH) new BaseViewHolder(view) : (VH) createBaseGenericKInstance(instancedGenericKClass, view);
        return vh != null ? vh : (VH) new BaseViewHolder(view);
    }

    @yfb
    /* JADX INFO: renamed from: f */
    public VH m17548f(@yfb ViewGroup viewGroup, @uw8 int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        return (VH) m17547e(C9350mh.getItemView(viewGroup, i));
    }

    @yfb
    /* JADX INFO: renamed from: g */
    public final Context m17549g() {
        Context context = this.f62042w;
        if (context == null) {
            md8.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    @gib
    public final hq0 getAdapterAnimation() {
        return this.f62028i;
    }

    public final boolean getAnimationEnable() {
        return this.f62026g;
    }

    @yfb
    public final LinkedHashSet<Integer> getChildClickViewIds() {
        return this.f62045z;
    }

    @yfb
    public final LinkedHashSet<Integer> getChildLongClickViewIds() {
        return this.f62018A;
    }

    @yfb
    public final List<T> getData() {
        return this.f62020a;
    }

    @yfb
    @q64(message = "User getDiffer()", replaceWith = @i2e(expression = "getDiffer()", imports = {}))
    public final le1<T> getDiffHelper() {
        return getDiffer();
    }

    @yfb
    public final le1<T> getDiffer() {
        le1<T> le1Var = this.f62029j;
        if (le1Var == null) {
            throw new IllegalStateException("Please use setDiffCallback() or setDiffConfig() first!");
        }
        if (le1Var == null) {
            md8.throwNpe();
        }
        return le1Var;
    }

    @yfb
    public final ar0 getDraggableModule() {
        ar0 ar0Var = this.f62040u;
        if (ar0Var == null) {
            throw new IllegalStateException("Please first implements DraggableModule");
        }
        if (ar0Var == null) {
            md8.throwNpe();
        }
        return ar0Var;
    }

    @gib
    public final FrameLayout getEmptyLayout() {
        FrameLayout frameLayout = this.f62032m;
        if (frameLayout == null) {
            return null;
        }
        if (frameLayout != null) {
            return frameLayout;
        }
        md8.throwUninitializedPropertyAccessException("mEmptyLayout");
        return frameLayout;
    }

    @gib
    public final LinearLayout getFooterLayout() {
        LinearLayout linearLayout = this.f62031l;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        md8.throwUninitializedPropertyAccessException("mFooterLayout");
        return linearLayout;
    }

    public final int getFooterLayoutCount() {
        return hasFooterLayout() ? 1 : 0;
    }

    public final boolean getFooterViewAsFlow() {
        return this.f62025f;
    }

    public final int getFooterViewPosition() {
        if (!hasEmptyView()) {
            return getHeaderLayoutCount() + this.f62020a.size();
        }
        int i = (this.f62021b && hasHeaderLayout()) ? 2 : 1;
        if (this.f62022c) {
            return i;
        }
        return -1;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.f62022c;
    }

    @gib
    public final LinearLayout getHeaderLayout() {
        LinearLayout linearLayout = this.f62030k;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        md8.throwUninitializedPropertyAccessException("mHeaderLayout");
        return linearLayout;
    }

    public final int getHeaderLayoutCount() {
        return hasHeaderLayout() ? 1 : 0;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.f62024e;
    }

    public final int getHeaderViewPosition() {
        return (!hasEmptyView() || this.f62021b) ? 0 : -1;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.f62021b;
    }

    public T getItem(@h78(from = 0) int i) {
        return this.f62020a.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (!hasEmptyView()) {
            sr0 sr0Var = this.f62041v;
            return getHeaderLayoutCount() + m17550h() + getFooterLayoutCount() + ((sr0Var == null || !sr0Var.hasLoadMoreView()) ? 0 : 1);
        }
        if (this.f62021b && hasHeaderLayout()) {
            i = 2;
        }
        return (this.f62022c && hasFooterLayout()) ? i + 1 : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @gib
    public T getItemOrNull(@h78(from = 0) int i) {
        return (T) v82.getOrNull(this.f62020a, i);
    }

    public int getItemPosition(@gib T t) {
        if (t == null || this.f62020a.isEmpty()) {
            return -1;
        }
        return this.f62020a.indexOf(t);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (hasEmptyView()) {
            boolean z = this.f62021b && hasHeaderLayout();
            if (i != 0) {
                return i != 1 ? f62015E : f62015E;
            }
            if (z) {
                return f62013C;
            }
            return f62016F;
        }
        boolean zHasHeaderLayout = hasHeaderLayout();
        if (zHasHeaderLayout && i == 0) {
            return f62013C;
        }
        if (zHasHeaderLayout) {
            i--;
        }
        int size = this.f62020a.size();
        return i < size ? mo13358i(i) : i - size < hasFooterLayout() ? f62015E : f62014D;
    }

    @yfb
    public final sr0 getLoadMoreModule() {
        sr0 sr0Var = this.f62041v;
        if (sr0Var == null) {
            throw new IllegalStateException("Please first implements LoadMoreModule");
        }
        if (sr0Var == null) {
            md8.throwNpe();
        }
        return sr0Var;
    }

    @gib
    public final sr0 getMLoadMoreModule$com_github_CymChad_brvah() {
        return this.f62041v;
    }

    @gib
    public final RecyclerView getMRecyclerView$com_github_CymChad_brvah() {
        return this.f62044y;
    }

    @gib
    public final d3c getOnItemChildClickListener() {
        return this.f62037r;
    }

    @gib
    public final e3c getOnItemChildLongClickListener() {
        return this.f62038s;
    }

    @gib
    public final g3c getOnItemClickListener() {
        return this.f62035p;
    }

    @gib
    public final j3c getOnItemLongClickListener() {
        return this.f62036q;
    }

    @yfb
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f62044y;
        if (recyclerView == null) {
            throw new IllegalStateException("Please get it after onAttachedToRecyclerView()");
        }
        if (recyclerView == null) {
            md8.throwNpe();
        }
        return recyclerView;
    }

    @yfb
    public final qu0 getUpFetchModule() {
        qu0 qu0Var = this.f62039t;
        if (qu0Var == null) {
            throw new IllegalStateException("Please first implements UpFetchModule");
        }
        if (qu0Var == null) {
            md8.throwNpe();
        }
        return qu0Var;
    }

    @gib
    public final View getViewByPosition(int i, @kr7 int i2) {
        BaseViewHolder baseViewHolder;
        RecyclerView recyclerView = this.f62044y;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(i)) == null) {
            return null;
        }
        return baseViewHolder.getViewOrNull(i2);
    }

    @yfb
    public final WeakReference<RecyclerView> getWeakRecyclerView() {
        WeakReference<RecyclerView> weakReference = this.f62043x;
        if (weakReference == null) {
            md8.throwUninitializedPropertyAccessException("weakRecyclerView");
        }
        return weakReference;
    }

    /* JADX INFO: renamed from: h */
    public int m17550h() {
        return this.f62020a.size();
    }

    public final boolean hasEmptyView() {
        FrameLayout frameLayout = this.f62032m;
        if (frameLayout != null) {
            if (frameLayout == null) {
                md8.throwUninitializedPropertyAccessException("mEmptyLayout");
            }
            if (frameLayout.getChildCount() != 0 && this.f62023d) {
                return this.f62020a.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final boolean hasFooterLayout() {
        LinearLayout linearLayout = this.f62031l;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            md8.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        return linearLayout.getChildCount() > 0;
    }

    public final boolean hasHeaderLayout() {
        LinearLayout linearLayout = this.f62030k;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            md8.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        return linearLayout.getChildCount() > 0;
    }

    /* JADX INFO: renamed from: i */
    public int mo13358i(int i) {
        return super.getItemViewType(i);
    }

    public final boolean isAnimationFirstOnly() {
        return this.f62027h;
    }

    public final boolean isUseEmpty() {
        return this.f62023d;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo10228j(int i) {
        return i == 268436821 || i == 268435729 || i == 268436275 || i == 268436002;
    }

    @yfb
    /* JADX INFO: renamed from: k */
    public VH mo13359k(@yfb ViewGroup viewGroup, int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        return (VH) m17548f(viewGroup, this.f62019B);
    }

    /* JADX INFO: renamed from: l */
    public void m17551l(@yfb VH vh, int i) {
        md8.checkParameterIsNotNull(vh, "viewHolder");
    }

    /* JADX INFO: renamed from: m */
    public void m17552m(@yfb RecyclerView.ViewHolder viewHolder) {
        md8.checkParameterIsNotNull(viewHolder, "holder");
        View view = viewHolder.itemView;
        md8.checkExpressionValueIsNotNull(view, "holder.itemView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m17553n(@yfb View view, int i) {
        md8.checkParameterIsNotNull(view, "v");
        d3c d3cVar = this.f62037r;
        if (d3cVar != null) {
            d3cVar.onItemChildClick(this, view, i);
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m17554o(@yfb View view, int i) {
        md8.checkParameterIsNotNull(view, "v");
        e3c e3cVar = this.f62038s;
        if (e3cVar != null) {
            return e3cVar.onItemChildLongClick(this, view, i);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@yfb RecyclerView recyclerView) {
        md8.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f62043x = new WeakReference<>(recyclerView);
        this.f62044y = recyclerView;
        Context context = recyclerView.getContext();
        md8.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.f62042w = context;
        ar0 ar0Var = this.f62040u;
        if (ar0Var != null) {
            ar0Var.attachToRecyclerView(recyclerView);
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new C9513g(layoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@yfb RecyclerView recyclerView) {
        md8.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f62044y = null;
    }

    /* JADX INFO: renamed from: p */
    public void m17555p(@yfb View view, int i) {
        md8.checkParameterIsNotNull(view, "v");
        g3c g3cVar = this.f62035p;
        if (g3cVar != null) {
            g3cVar.onItemClick(this, view, i);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m17556q(@yfb View view, int i) {
        md8.checkParameterIsNotNull(view, "v");
        j3c j3cVar = this.f62036q;
        if (j3cVar != null) {
            return j3cVar.onItemLongClick(this, view, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public void m17557r(@yfb Animator animator, int i) {
        md8.checkParameterIsNotNull(animator, "anim");
        animator.start();
    }

    @q64(message = "Please use removeAt()", replaceWith = @i2e(expression = "removeAt(position)", imports = {}))
    public void remove(@h78(from = 0) int i) {
        removeAt(i);
    }

    public final void removeAllFooterView() {
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.f62031l;
            if (linearLayout == null) {
                md8.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            linearLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final void removeAllHeaderView() {
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.f62030k;
            if (linearLayout == null) {
                md8.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            linearLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public void removeAt(@h78(from = 0) int i) {
        if (i >= this.f62020a.size()) {
            return;
        }
        this.f62020a.remove(i);
        int headerLayoutCount = i + getHeaderLayoutCount();
        notifyItemRemoved(headerLayoutCount);
        m17546b(0);
        notifyItemRangeChanged(headerLayoutCount, this.f62020a.size() - headerLayoutCount);
    }

    public final void removeEmptyView() {
        FrameLayout frameLayout = this.f62032m;
        if (frameLayout != null) {
            if (frameLayout == null) {
                md8.throwUninitializedPropertyAccessException("mEmptyLayout");
            }
            frameLayout.removeAllViews();
        }
    }

    public final void removeFooterView(@yfb View view) {
        int footerViewPosition;
        md8.checkParameterIsNotNull(view, "footer");
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.f62031l;
            if (linearLayout == null) {
                md8.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            linearLayout.removeView(view);
            LinearLayout linearLayout2 = this.f62031l;
            if (linearLayout2 == null) {
                md8.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            if (linearLayout2.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(footerViewPosition);
        }
    }

    public final void removeHeaderView(@yfb View view) {
        int headerViewPosition;
        md8.checkParameterIsNotNull(view, "header");
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.f62030k;
            if (linearLayout == null) {
                md8.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            linearLayout.removeView(view);
            LinearLayout linearLayout2 = this.f62030k;
            if (linearLayout2 == null) {
                md8.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            if (linearLayout2.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(headerViewPosition);
        }
    }

    @q64(message = "Please use setData()", replaceWith = @i2e(expression = "setData(newData)", imports = {}))
    public void replaceData(@yfb Collection<? extends T> collection) {
        md8.checkParameterIsNotNull(collection, "newData");
        setList(collection);
    }

    public final void setAdapterAnimation(@gib hq0 hq0Var) {
        this.f62026g = true;
        this.f62028i = hq0Var;
    }

    public final void setAnimationEnable(boolean z) {
        this.f62026g = z;
    }

    public final void setAnimationFirstOnly(boolean z) {
        this.f62027h = z;
    }

    public final void setAnimationWithDefault(@yfb EnumC9507a enumC9507a) {
        hq0 c7513in;
        md8.checkParameterIsNotNull(enumC9507a, "animationType");
        int i = nt0.f65553a[enumC9507a.ordinal()];
        if (i == 1) {
            c7513in = new C7513in(0.0f, 1, null);
        } else if (i == 2) {
            c7513in = new sme(0.0f, 1, null);
        } else if (i == 3) {
            c7513in = new tqf();
        } else if (i == 4) {
            c7513in = new uqf();
        } else {
            if (i != 5) {
                throw new ceb();
            }
            c7513in = new vqf();
        }
        setAdapterAnimation(c7513in);
    }

    public void setData(@h78(from = 0) int i, T t) {
        if (i >= this.f62020a.size()) {
            return;
        }
        this.f62020a.set(i, t);
        notifyItemChanged(i + getHeaderLayoutCount());
    }

    public final void setData$com_github_CymChad_brvah(@yfb List<T> list) {
        md8.checkParameterIsNotNull(list, "<set-?>");
        this.f62020a = list;
    }

    public final void setDiffCallback(@yfb DiffUtil.ItemCallback<T> itemCallback) {
        md8.checkParameterIsNotNull(itemCallback, "diffCallback");
        setDiffConfig(new me1.C9325a(itemCallback).build());
    }

    public final void setDiffConfig(@yfb me1<T> me1Var) {
        md8.checkParameterIsNotNull(me1Var, "config");
        this.f62029j = new le1<>(this, me1Var);
    }

    public void setDiffNewData(@gib List<T> list) {
        if (hasEmptyView()) {
            setNewInstance(list);
            return;
        }
        le1<T> le1Var = this.f62029j;
        if (le1Var != null) {
            le1.submitList$default(le1Var, list, null, 2, null);
        }
    }

    public final void setEmptyView(@yfb View view) {
        boolean z;
        md8.checkParameterIsNotNull(view, "emptyView");
        int itemCount = getItemCount();
        if (this.f62032m == null) {
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            this.f62032m = frameLayout;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            frameLayout.setLayoutParams(layoutParams != null ? new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height) : new ViewGroup.LayoutParams(-1, -1));
            z = true;
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout frameLayout2 = this.f62032m;
                if (frameLayout2 == null) {
                    md8.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                layoutParams3.width = layoutParams2.width;
                layoutParams3.height = layoutParams2.height;
                FrameLayout frameLayout3 = this.f62032m;
                if (frameLayout3 == null) {
                    md8.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                frameLayout3.setLayoutParams(layoutParams3);
            }
            z = false;
        }
        FrameLayout frameLayout4 = this.f62032m;
        if (frameLayout4 == null) {
            md8.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        frameLayout4.removeAllViews();
        FrameLayout frameLayout5 = this.f62032m;
        if (frameLayout5 == null) {
            md8.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        frameLayout5.addView(view);
        this.f62023d = true;
        if (z && hasEmptyView()) {
            int i = (this.f62021b && hasHeaderLayout()) ? 1 : 0;
            if (getItemCount() > itemCount) {
                notifyItemInserted(i);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    @yn8
    public final int setFooterView(@yfb View view) {
        return setFooterView$default(this, view, 0, 0, 6, null);
    }

    public final void setFooterViewAsFlow(boolean z) {
        this.f62025f = z;
    }

    public final void setFooterWithEmptyEnable(boolean z) {
        this.f62022c = z;
    }

    @Override // p000.rr0
    public void setGridSpanSizeLookup(@gib lb7 lb7Var) {
        this.f62034o = lb7Var;
    }

    @yn8
    public final int setHeaderView(@yfb View view) {
        return setHeaderView$default(this, view, 0, 0, 6, null);
    }

    public final void setHeaderViewAsFlow(boolean z) {
        this.f62024e = z;
    }

    public final void setHeaderWithEmptyEnable(boolean z) {
        this.f62021b = z;
    }

    public void setList(@gib Collection<? extends T> collection) {
        List<T> list = this.f62020a;
        if (collection != list) {
            list.clear();
            if (collection != null && !collection.isEmpty()) {
                this.f62020a.addAll(collection);
            }
        } else if (collection == null || collection.isEmpty()) {
            this.f62020a.clear();
        } else {
            ArrayList arrayList = new ArrayList(collection);
            this.f62020a.clear();
            this.f62020a.addAll(arrayList);
        }
        sr0 sr0Var = this.f62041v;
        if (sr0Var != null) {
            sr0Var.reset$com_github_CymChad_brvah();
        }
        this.f62033n = -1;
        notifyDataSetChanged();
        sr0 sr0Var2 = this.f62041v;
        if (sr0Var2 != null) {
            sr0Var2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public final void setMLoadMoreModule$com_github_CymChad_brvah(@gib sr0 sr0Var) {
        this.f62041v = sr0Var;
    }

    public final void setMRecyclerView$com_github_CymChad_brvah(@gib RecyclerView recyclerView) {
        this.f62044y = recyclerView;
    }

    @q64(message = "Please use setNewInstance(), This method will be removed in the next version", replaceWith = @i2e(expression = "setNewInstance(data)", imports = {}))
    public void setNewData(@gib List<T> list) {
        setNewInstance(list);
    }

    public void setNewInstance(@gib List<T> list) {
        if (list == this.f62020a) {
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f62020a = list;
        sr0 sr0Var = this.f62041v;
        if (sr0Var != null) {
            sr0Var.reset$com_github_CymChad_brvah();
        }
        this.f62033n = -1;
        notifyDataSetChanged();
        sr0 sr0Var2 = this.f62041v;
        if (sr0Var2 != null) {
            sr0Var2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    @Override // p000.rr0
    public void setOnItemChildClickListener(@gib d3c d3cVar) {
        this.f62037r = d3cVar;
    }

    @Override // p000.rr0
    public void setOnItemChildLongClickListener(@gib e3c e3cVar) {
        this.f62038s = e3cVar;
    }

    @Override // p000.rr0
    public void setOnItemClickListener(@gib g3c g3cVar) {
        this.f62035p = g3cVar;
    }

    @Override // p000.rr0
    public void setOnItemLongClickListener(@gib j3c j3cVar) {
        this.f62036q = j3cVar;
    }

    public final void setRecyclerView(@yfb RecyclerView recyclerView) {
        md8.checkParameterIsNotNull(recyclerView, "value");
        this.f62044y = recyclerView;
    }

    public final void setUseEmpty(boolean z) {
        this.f62023d = z;
    }

    public final void setWeakRecyclerView(@yfb WeakReference<RecyclerView> weakReference) {
        md8.checkParameterIsNotNull(weakReference, "<set-?>");
        this.f62043x = weakReference;
    }

    public /* synthetic */ mt0(int i, List list, int i2, jt3 jt3Var) {
        this(i, (i2 & 2) != 0 ? null : list);
    }

    @yn8
    public final int addFooterView(@yfb View view, int i) {
        return addFooterView$default(this, view, i, 0, 4, null);
    }

    @yn8
    public final int addHeaderView(@yfb View view, int i) {
        return addHeaderView$default(this, view, i, 0, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((BaseViewHolder) viewHolder, i, (List<Object>) list);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @yfb
    public VH onCreateViewHolder(@yfb ViewGroup viewGroup, int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        switch (i) {
            case f62013C /* 268435729 */:
                LinearLayout linearLayout = this.f62030k;
                if (linearLayout == null) {
                    md8.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                ViewParent parent = linearLayout.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    LinearLayout linearLayout2 = this.f62030k;
                    if (linearLayout2 == null) {
                        md8.throwUninitializedPropertyAccessException("mHeaderLayout");
                    }
                    viewGroup2.removeView(linearLayout2);
                }
                LinearLayout linearLayout3 = this.f62030k;
                if (linearLayout3 == null) {
                    md8.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                return (VH) m17547e(linearLayout3);
            case f62014D /* 268436002 */:
                sr0 sr0Var = this.f62041v;
                if (sr0Var == null) {
                    md8.throwNpe();
                }
                VH vh = (VH) m17547e(sr0Var.getLoadMoreView().getRootView(viewGroup));
                sr0 sr0Var2 = this.f62041v;
                if (sr0Var2 == null) {
                    md8.throwNpe();
                }
                sr0Var2.setupViewHolder$com_github_CymChad_brvah(vh);
                return vh;
            case f62015E /* 268436275 */:
                LinearLayout linearLayout4 = this.f62031l;
                if (linearLayout4 == null) {
                    md8.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                ViewParent parent2 = linearLayout4.getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent2;
                    LinearLayout linearLayout5 = this.f62031l;
                    if (linearLayout5 == null) {
                        md8.throwUninitializedPropertyAccessException("mFooterLayout");
                    }
                    viewGroup3.removeView(linearLayout5);
                }
                LinearLayout linearLayout6 = this.f62031l;
                if (linearLayout6 == null) {
                    md8.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                return (VH) m17547e(linearLayout6);
            case f62016F /* 268436821 */:
                FrameLayout frameLayout = this.f62032m;
                if (frameLayout == null) {
                    md8.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                ViewParent parent3 = frameLayout.getParent();
                if (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent3;
                    FrameLayout frameLayout2 = this.f62032m;
                    if (frameLayout2 == null) {
                        md8.throwUninitializedPropertyAccessException("mEmptyLayout");
                    }
                    viewGroup4.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.f62032m;
                if (frameLayout3 == null) {
                    md8.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                return (VH) m17547e(frameLayout3);
            default:
                VH vh2 = (VH) mo13359k(viewGroup, i);
                mo16342a(vh2, i);
                ar0 ar0Var = this.f62040u;
                if (ar0Var != null) {
                    ar0Var.initView$com_github_CymChad_brvah(vh2);
                }
                m17551l(vh2, i);
                return vh2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@yfb VH vh) {
        md8.checkParameterIsNotNull(vh, "holder");
        super.onViewAttachedToWindow(vh);
        if (mo10228j(vh.getItemViewType())) {
            m17552m(vh);
        } else {
            addAnimation(vh);
        }
    }

    public void remove(T t) {
        int iIndexOf = this.f62020a.indexOf(t);
        if (iIndexOf == -1) {
            return;
        }
        removeAt(iIndexOf);
    }

    @yn8
    public final int setFooterView(@yfb View view, int i) {
        return setFooterView$default(this, view, i, 0, 4, null);
    }

    @yn8
    public final int setHeaderView(@yfb View view, int i) {
        return setHeaderView$default(this, view, i, 0, 4, null);
    }

    @yn8
    public mt0(@uw8 int i, @gib List<T> list) {
        this.f62019B = i;
        this.f62020a = list == null ? new ArrayList<>() : list;
        this.f62023d = true;
        this.f62027h = true;
        this.f62033n = -1;
        checkModule();
        this.f62045z = new LinkedHashSet<>();
        this.f62018A = new LinkedHashSet<>();
    }

    @yn8
    public final int addFooterView(@yfb View view, int i, int i2) {
        int footerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        md8.checkParameterIsNotNull(view, "view");
        if (this.f62031l == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.f62031l = linearLayout;
            linearLayout.setOrientation(i2);
            LinearLayout linearLayout2 = this.f62031l;
            if (linearLayout2 == null) {
                md8.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            if (i2 == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout2.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout3 = this.f62031l;
        if (linearLayout3 == null) {
            md8.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        int childCount = linearLayout3.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        LinearLayout linearLayout4 = this.f62031l;
        if (linearLayout4 == null) {
            md8.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        linearLayout4.addView(view, i);
        LinearLayout linearLayout5 = this.f62031l;
        if (linearLayout5 == null) {
            md8.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        if (linearLayout5.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return i;
    }

    @yn8
    public final int addHeaderView(@yfb View view, int i, int i2) {
        int headerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        md8.checkParameterIsNotNull(view, "view");
        if (this.f62030k == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.f62030k = linearLayout;
            linearLayout.setOrientation(i2);
            LinearLayout linearLayout2 = this.f62030k;
            if (linearLayout2 == null) {
                md8.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            if (i2 == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout2.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout3 = this.f62030k;
        if (linearLayout3 == null) {
            md8.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        int childCount = linearLayout3.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        LinearLayout linearLayout4 = this.f62030k;
        if (linearLayout4 == null) {
            md8.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        linearLayout4.addView(view, i);
        LinearLayout linearLayout5 = this.f62030k;
        if (linearLayout5 == null) {
            md8.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        if (linearLayout5.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@yfb VH vh, int i) {
        md8.checkParameterIsNotNull(vh, "holder");
        qu0 qu0Var = this.f62039t;
        if (qu0Var != null) {
            qu0Var.autoUpFetch$com_github_CymChad_brvah(i);
        }
        sr0 sr0Var = this.f62041v;
        if (sr0Var != null) {
            sr0Var.autoLoadMore$com_github_CymChad_brvah(i);
        }
        switch (vh.getItemViewType()) {
            case f62013C /* 268435729 */:
            case f62015E /* 268436275 */:
            case f62016F /* 268436821 */:
                break;
            case f62014D /* 268436002 */:
                sr0 sr0Var2 = this.f62041v;
                if (sr0Var2 != null) {
                    sr0Var2.getLoadMoreView().convert(vh, i, sr0Var2.getLoadMoreStatus());
                }
                break;
            default:
                mo2536c(vh, getItem(i - getHeaderLayoutCount()));
                break;
        }
    }

    @yn8
    public final int setFooterView(@yfb View view, int i, int i2) {
        md8.checkParameterIsNotNull(view, "view");
        LinearLayout linearLayout = this.f62031l;
        if (linearLayout != null) {
            if (linearLayout == null) {
                md8.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            if (linearLayout.getChildCount() > i) {
                LinearLayout linearLayout2 = this.f62031l;
                if (linearLayout2 == null) {
                    md8.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                linearLayout2.removeViewAt(i);
                LinearLayout linearLayout3 = this.f62031l;
                if (linearLayout3 == null) {
                    md8.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                linearLayout3.addView(view, i);
                return i;
            }
        }
        return addFooterView(view, i, i2);
    }

    @yn8
    public final int setHeaderView(@yfb View view, int i, int i2) {
        md8.checkParameterIsNotNull(view, "view");
        LinearLayout linearLayout = this.f62030k;
        if (linearLayout != null) {
            if (linearLayout == null) {
                md8.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            if (linearLayout.getChildCount() > i) {
                LinearLayout linearLayout2 = this.f62030k;
                if (linearLayout2 == null) {
                    md8.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                linearLayout2.removeViewAt(i);
                LinearLayout linearLayout3 = this.f62030k;
                if (linearLayout3 == null) {
                    md8.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                linearLayout3.addView(view, i);
                return i;
            }
        }
        return addHeaderView(view, i, i2);
    }

    public void addData(@efb T t) {
        this.f62020a.add(t);
        notifyItemInserted(this.f62020a.size() + getHeaderLayoutCount());
        m17546b(1);
    }

    public void setDiffNewData(@efb @yfb DiffUtil.DiffResult diffResult, @yfb List<T> list) {
        md8.checkParameterIsNotNull(diffResult, "diffResult");
        md8.checkParameterIsNotNull(list, "list");
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            diffResult.dispatchUpdatesTo(new ne1(this));
            this.f62020a = list;
        }
    }

    public void addData(@h78(from = 0) int i, @yfb Collection<? extends T> collection) {
        md8.checkParameterIsNotNull(collection, "newData");
        this.f62020a.addAll(i, collection);
        notifyItemRangeInserted(i + getHeaderLayoutCount(), collection.size());
        m17546b(collection.size());
    }

    public void onBindViewHolder(@yfb VH vh, int i, @yfb List<Object> list) {
        md8.checkParameterIsNotNull(vh, "holder");
        md8.checkParameterIsNotNull(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder((BaseViewHolder) vh, i);
        }
        qu0 qu0Var = this.f62039t;
        if (qu0Var != null) {
            qu0Var.autoUpFetch$com_github_CymChad_brvah(i);
        }
        sr0 sr0Var = this.f62041v;
        if (sr0Var != null) {
            sr0Var.autoLoadMore$com_github_CymChad_brvah(i);
        }
        switch (vh.getItemViewType()) {
            case f62013C /* 268435729 */:
            case f62015E /* 268436275 */:
            case f62016F /* 268436821 */:
                break;
            case f62014D /* 268436002 */:
                sr0 sr0Var2 = this.f62041v;
                if (sr0Var2 != null) {
                    sr0Var2.getLoadMoreView().convert(vh, i, sr0Var2.getLoadMoreStatus());
                }
                break;
            default:
                mo16343d(vh, getItem(i - getHeaderLayoutCount()), list);
                break;
        }
    }

    public void addData(@efb @yfb Collection<? extends T> collection) {
        md8.checkParameterIsNotNull(collection, "newData");
        this.f62020a.addAll(collection);
        notifyItemRangeInserted((this.f62020a.size() - collection.size()) + getHeaderLayoutCount(), collection.size());
        m17546b(collection.size());
    }

    public final void setEmptyView(int i) {
        RecyclerView recyclerView = this.f62044y;
        if (recyclerView != null) {
            View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(i, (ViewGroup) recyclerView, false);
            md8.checkExpressionValueIsNotNull(viewInflate, "view");
            setEmptyView(viewInflate);
        }
    }
}
