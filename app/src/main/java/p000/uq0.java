package p000;

import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import p000.y8i;

/* JADX INFO: loaded from: classes4.dex */
public class uq0<BD extends y8i> extends BaseViewHolder {

    /* JADX INFO: renamed from: a */
    @gib
    public final BD f88738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(@yfb View view) {
        super(view);
        md8.checkParameterIsNotNull(view, "view");
        this.f88738a = (BD) kf3.bind(view);
    }

    @gib
    public final BD getDataBinding() {
        return this.f88738a;
    }
}
