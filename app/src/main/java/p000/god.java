package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0901d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import p000.j8i;

/* JADX INFO: loaded from: classes4.dex */
public abstract class god<T, VB extends j8i> extends jr0<T, C6448a<VB>> {

    /* JADX INFO: renamed from: god$a */
    public static final class C6448a<VB extends j8i> extends BaseViewHolder {

        /* JADX INFO: renamed from: a */
        @yfb
        public final VB f40666a;

        /* JADX WARN: Illegal instructions before constructor call */
        public C6448a(@yfb VB vb) {
            md8.checkParameterIsNotNull(vb, "viewBinding");
            View root = vb.getRoot();
            md8.checkExpressionValueIsNotNull(root, "viewBinding.root");
            super(root);
            this.f40666a = vb;
        }

        @yfb
        public final VB getViewBinding() {
            return this.f40666a;
        }
    }

    @yfb
    public abstract VB onCreateViewBinding(@yfb LayoutInflater layoutInflater, @yfb ViewGroup viewGroup, int i);

    @Override // p000.jr0
    @yfb
    public C6448a<VB> onCreateViewHolder(@yfb ViewGroup viewGroup, int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        md8.checkExpressionValueIsNotNull(layoutInflaterFrom, "LayoutInflater.from(parent.context)");
        return new C6448a<>(onCreateViewBinding(layoutInflaterFrom, viewGroup, i));
    }
}
