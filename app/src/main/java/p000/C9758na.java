package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: na */
/* JADX INFO: loaded from: classes4.dex */
public final class C9758na implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f63769a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f63770b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ToolBar f63771c;

    private C9758na(@efb LinearLayout rootView, @efb ImageView ivImg, @efb ToolBar toolbar) {
        this.f63769a = rootView;
        this.f63770b = ivImg;
        this.f63771c = toolbar;
    }

    @efb
    public static C9758na bind(@efb View rootView) {
        int i = C2558R.id.iv_img;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.toolbar;
            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
            if (toolBar != null) {
                return new C9758na((LinearLayout) rootView, imageView, toolBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C9758na inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C9758na inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_phone_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f63769a;
    }
}
