package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: mh */
/* JADX INFO: loaded from: classes4.dex */
public final class C9350mh {
    @yfb
    public static final View getItemView(@yfb ViewGroup viewGroup, @uw8 int i) {
        md8.checkParameterIsNotNull(viewGroup, "$this$getItemView");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        md8.checkExpressionValueIsNotNull(viewInflate, "LayoutInflater.from(this…layoutResId, this, false)");
        return viewInflate;
    }
}
