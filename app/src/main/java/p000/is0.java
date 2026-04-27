package p000;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0901d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import p000.q2b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class is0<T extends q2b, VH extends BaseViewHolder> extends mt0<T, VH> {

    /* JADX INFO: renamed from: H */
    public final fx8 f48115H;

    /* JADX INFO: renamed from: is0$a */
    public static final class C7581a extends tt8 implements ny6<SparseIntArray> {

        /* JADX INFO: renamed from: a */
        public static final C7581a f48116a = new C7581a();

        public C7581a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final SparseIntArray invoke() {
            return new SparseIntArray();
        }
    }

    public is0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final SparseIntArray getLayouts() {
        return (SparseIntArray) this.f48115H.getValue();
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: i */
    public int mo13358i(int i) {
        return getData().get(i).getItemType();
    }

    @Override // p000.mt0
    @yfb
    /* JADX INFO: renamed from: k */
    public VH mo13359k(@yfb ViewGroup viewGroup, int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        int i2 = getLayouts().get(i);
        if (i2 != 0) {
            return m17548f(viewGroup, i2);
        }
        throw new IllegalArgumentException(("ViewType: " + i + " found layoutResId，please use addItemType() first!").toString());
    }

    /* JADX INFO: renamed from: s */
    public final void m13360s(int i, @uw8 int i2) {
        getLayouts().put(i, i2);
    }

    public /* synthetic */ is0(List list, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : list);
    }

    public is0(@gib List<T> list) {
        super(0, list);
        this.f48115H = hz8.lazy(g39.f38327c, (ny6) C7581a.f48116a);
    }
}
