package p000;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0901d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xq0<T, VH extends BaseViewHolder> extends mt0<T, VH> {

    /* JADX INFO: renamed from: H */
    public js0<T> f98893H;

    public xq0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @gib
    public final js0<T> getMultiTypeDelegate() {
        return this.f98893H;
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: i */
    public int mo13358i(int i) {
        js0<T> multiTypeDelegate = getMultiTypeDelegate();
        if (multiTypeDelegate != null) {
            return multiTypeDelegate.getItemType(getData(), i);
        }
        throw new IllegalStateException("Please use setMultiTypeDelegate first!");
    }

    @Override // p000.mt0
    @yfb
    /* JADX INFO: renamed from: k */
    public VH mo13359k(@yfb ViewGroup viewGroup, int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        js0<T> multiTypeDelegate = getMultiTypeDelegate();
        if (multiTypeDelegate != null) {
            return m17548f(viewGroup, multiTypeDelegate.getLayoutId(i));
        }
        throw new IllegalStateException("Please use setMultiTypeDelegate first!");
    }

    public final void setMultiTypeDelegate(@yfb js0<T> js0Var) {
        md8.checkParameterIsNotNull(js0Var, "multiTypeDelegate");
        this.f98893H = js0Var;
    }

    public /* synthetic */ xq0(List list, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : list);
    }

    public xq0(@gib List<T> list) {
        super(0, list);
    }
}
