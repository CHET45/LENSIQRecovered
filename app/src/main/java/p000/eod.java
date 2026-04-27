package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0901d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import p000.y8i;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eod<T, DB extends y8i> extends jr0<T, C5416a<DB>> {

    /* JADX INFO: renamed from: eod$a */
    public static final class C5416a<DB extends y8i> extends BaseViewHolder {

        /* JADX INFO: renamed from: a */
        @yfb
        public final DB f33729a;

        /* JADX WARN: Illegal instructions before constructor call */
        public C5416a(@yfb DB db) {
            md8.checkParameterIsNotNull(db, "dataBinding");
            View root = db.getRoot();
            md8.checkExpressionValueIsNotNull(root, "dataBinding.root");
            super(root);
            this.f33729a = db;
        }

        @yfb
        public final DB getDataBinding() {
            return this.f33729a;
        }
    }

    @yfb
    public abstract DB onCreateDataBinding(@yfb LayoutInflater layoutInflater, @yfb ViewGroup viewGroup, int i);

    @Override // p000.jr0
    @yfb
    public C5416a<DB> onCreateViewHolder(@yfb ViewGroup viewGroup, int i) {
        md8.checkParameterIsNotNull(viewGroup, C0901d.f6975V1);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        md8.checkExpressionValueIsNotNull(layoutInflaterFrom, "LayoutInflater.from(parent.context)");
        return new C5416a<>(onCreateDataBinding(layoutInflaterFrom, viewGroup, i));
    }
}
