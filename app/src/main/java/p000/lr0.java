package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0901d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lr0<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public Context f58492a;

    /* JADX INFO: renamed from: b */
    public WeakReference<lt0<T>> f58493b;

    /* JADX INFO: renamed from: c */
    public final fx8 f58494c;

    /* JADX INFO: renamed from: d */
    public final fx8 f58495d;

    /* JADX INFO: renamed from: lr0$a */
    public static final class C8942a extends tt8 implements ny6<ArrayList<Integer>> {

        /* JADX INFO: renamed from: a */
        public static final C8942a f58496a = new C8942a();

        public C8942a() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final ArrayList<Integer> invoke() {
            return new ArrayList<>();
        }
    }

    /* JADX INFO: renamed from: lr0$b */
    public static final class C8943b extends tt8 implements ny6<ArrayList<Integer>> {

        /* JADX INFO: renamed from: a */
        public static final C8943b f58497a = new C8943b();

        public C8943b() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final ArrayList<Integer> invoke() {
            return new ArrayList<>();
        }
    }

    public lr0() {
        g39 g39Var = g39.f38327c;
        this.f58494c = hz8.lazy(g39Var, (ny6) C8942a.f58496a);
        this.f58495d = hz8.lazy(g39Var, (ny6) C8943b.f58497a);
    }

    private final ArrayList<Integer> getClickViewIds() {
        return (ArrayList) this.f58494c.getValue();
    }

    private final ArrayList<Integer> getLongClickViewIds() {
        return (ArrayList) this.f58495d.getValue();
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

    public abstract void convert(@yfb BaseViewHolder baseViewHolder, T t);

    public void convert(@yfb BaseViewHolder baseViewHolder, T t, @yfb List<? extends Object> list) {
        md8.checkParameterIsNotNull(baseViewHolder, "helper");
        md8.checkParameterIsNotNull(list, "payloads");
    }

    @gib
    public lt0<T> getAdapter() {
        WeakReference<lt0<T>> weakReference = this.f58493b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
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
        Context context = this.f58492a;
        if (context == null) {
            md8.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    public abstract int getItemViewType();

    @uw8
    public abstract int getLayoutId();

    public void onChildClick(@yfb BaseViewHolder baseViewHolder, @yfb View view, T t, int i) {
        md8.checkParameterIsNotNull(baseViewHolder, "helper");
        md8.checkParameterIsNotNull(view, "view");
    }

    public boolean onChildLongClick(@yfb BaseViewHolder baseViewHolder, @yfb View view, T t, int i) {
        md8.checkParameterIsNotNull(baseViewHolder, "helper");
        md8.checkParameterIsNotNull(view, "view");
        return false;
    }

    public void onClick(@yfb BaseViewHolder baseViewHolder, @yfb View view, T t, int i) {
        md8.checkParameterIsNotNull(baseViewHolder, "helper");
        md8.checkParameterIsNotNull(view, "view");
    }

    @yfb
    public BaseViewHolder onCreateViewHolder(@yfb ViewGroup viewGroup, int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        return new BaseViewHolder(C9350mh.getItemView(viewGroup, getLayoutId()));
    }

    public boolean onLongClick(@yfb BaseViewHolder baseViewHolder, @yfb View view, T t, int i) {
        md8.checkParameterIsNotNull(baseViewHolder, "helper");
        md8.checkParameterIsNotNull(view, "view");
        return false;
    }

    public void onViewAttachedToWindow(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
    }

    public void onViewDetachedFromWindow(@yfb BaseViewHolder baseViewHolder) {
        md8.checkParameterIsNotNull(baseViewHolder, "holder");
    }

    public void onViewHolderCreated(@yfb BaseViewHolder baseViewHolder, int i) {
        md8.checkParameterIsNotNull(baseViewHolder, "viewHolder");
    }

    public final void setAdapter$com_github_CymChad_brvah(@yfb lt0<T> lt0Var) {
        md8.checkParameterIsNotNull(lt0Var, "adapter");
        this.f58493b = new WeakReference<>(lt0Var);
    }

    public final void setContext(@yfb Context context) {
        md8.checkParameterIsNotNull(context, "<set-?>");
        this.f58492a = context;
    }
}
