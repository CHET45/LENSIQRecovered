package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class cb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f16170a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f16171b;

    private cb4(@efb RelativeLayout rootView, @efb ImageView ivLoading) {
        this.f16170a = rootView;
        this.f16171b = ivLoading;
    }

    @efb
    public static cb4 bind(@efb View rootView) {
        int i = C2531R.id.iv_loading;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            return new cb4((RelativeLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static cb4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static cb4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_loading, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f16170a;
    }
}
