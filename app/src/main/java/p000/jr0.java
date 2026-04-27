package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jr0<T, VH extends BaseViewHolder> {

    /* JADX INFO: renamed from: a */
    public final fx8 f51538a;

    /* JADX INFO: renamed from: b */
    public final fx8 f51539b;

    /* JADX INFO: renamed from: c */
    @gib
    public nq0 f51540c;

    /* JADX INFO: renamed from: d */
    @gib
    public Context f51541d;

    /* JADX INFO: renamed from: jr0$a */
    public static final class C8032a extends tt8 implements ny6<ArrayList<Integer>> {

        /* JADX INFO: renamed from: a */
        public static final C8032a f51542a = new C8032a();

        public C8032a() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final ArrayList<Integer> invoke() {
            return new ArrayList<>();
        }
    }

    /* JADX INFO: renamed from: jr0$b */
    public static final class C8033b extends tt8 implements ny6<ArrayList<Integer>> {

        /* JADX INFO: renamed from: a */
        public static final C8033b f51543a = new C8033b();

        public C8033b() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final ArrayList<Integer> invoke() {
            return new ArrayList<>();
        }
    }

    public jr0() {
        g39 g39Var = g39.f38327c;
        this.f51538a = hz8.lazy(g39Var, (ny6) C8032a.f51542a);
        this.f51539b = hz8.lazy(g39Var, (ny6) C8033b.f51543a);
    }

    private final ArrayList<Integer> getClickViewIds() {
        return (ArrayList) this.f51538a.getValue();
    }

    private final ArrayList<Integer> getLongClickViewIds() {
        return (ArrayList) this.f51539b.getValue();
    }

    public final void addChildClickViewIds(@yfb @kr7 int... iArr) {
        md8.checkParameterIsNotNull(iArr, "ids");
        for (int i : iArr) {
            getClickViewIds().add(Integer.valueOf(i));
        }
    }

    public final void addChildLongClickViewIds(@yfb @kr7 int... iArr) {
        md8.checkParameterIsNotNull(iArr, "ids");
        for (int i : iArr) {
            getLongClickViewIds().add(Integer.valueOf(i));
        }
    }

    public abstract void convert(@yfb VH vh, T t);

    public void convert(@yfb VH vh, T t, @yfb List<? extends Object> list) {
        md8.checkParameterIsNotNull(vh, "holder");
        md8.checkParameterIsNotNull(list, "payloads");
    }

    @yfb
    public final nq0 getAdapter() {
        nq0 nq0Var = this.f51540c;
        if (nq0Var != null) {
            if (nq0Var == null) {
                md8.throwNpe();
            }
            return nq0Var;
        }
        throw new IllegalStateException(("This " + this + " has not been attached to BaseBinderAdapter yet.\n                    You should not call the method before addItemBinder().").toString());
    }

    @yfb
    public final ArrayList<Integer> getChildClickViewIds() {
        return getClickViewIds();
    }

    @yfb
    public final ArrayList<Integer> getChildLongClickViewIds() {
        return getLongClickViewIds();
    }

    @yfb
    public final Context getContext() {
        Context context = this.f51541d;
        if (context != null) {
            if (context == null) {
                md8.throwNpe();
            }
            return context;
        }
        throw new IllegalStateException(("This " + this + " has not been attached to BaseBinderAdapter yet.\n                    You should not call the method before onCreateViewHolder().").toString());
    }

    @yfb
    public final List<Object> getData() {
        return getAdapter().getData();
    }

    @gib
    public final nq0 get_adapter$com_github_CymChad_brvah() {
        return this.f51540c;
    }

    @gib
    public final Context get_context$com_github_CymChad_brvah() {
        return this.f51541d;
    }

    public void onChildClick(@yfb VH vh, @yfb View view, T t, int i) {
        md8.checkParameterIsNotNull(vh, "holder");
        md8.checkParameterIsNotNull(view, "view");
    }

    public boolean onChildLongClick(@yfb VH vh, @yfb View view, T t, int i) {
        md8.checkParameterIsNotNull(vh, "holder");
        md8.checkParameterIsNotNull(view, "view");
        return false;
    }

    public void onClick(@yfb VH vh, @yfb View view, T t, int i) {
        md8.checkParameterIsNotNull(vh, "holder");
        md8.checkParameterIsNotNull(view, "view");
    }

    @yfb
    public abstract VH onCreateViewHolder(@yfb ViewGroup viewGroup, int i);

    public boolean onFailedToRecycleView(@yfb VH vh) {
        md8.checkParameterIsNotNull(vh, "holder");
        return false;
    }

    public boolean onLongClick(@yfb VH vh, @yfb View view, T t, int i) {
        md8.checkParameterIsNotNull(vh, "holder");
        md8.checkParameterIsNotNull(view, "view");
        return false;
    }

    public void onViewAttachedToWindow(@yfb VH vh) {
        md8.checkParameterIsNotNull(vh, "holder");
    }

    public void onViewDetachedFromWindow(@yfb VH vh) {
        md8.checkParameterIsNotNull(vh, "holder");
    }

    public final void set_adapter$com_github_CymChad_brvah(@gib nq0 nq0Var) {
        this.f51540c = nq0Var;
    }

    public final void set_context$com_github_CymChad_brvah(@gib Context context) {
        this.f51541d = context;
    }
}
