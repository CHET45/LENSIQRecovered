package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class sah implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f81064a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f81065b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f81066c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f81067d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f81068e;

    /* JADX INFO: renamed from: f */
    @efb
    public final RelativeLayout f81069f;

    private sah(@efb RelativeLayout rootView, @efb LinearLayout btnHorizontalLayout, @efb LinearLayout btnVerticalLayout, @efb ImageView ivHorizontal, @efb ImageView ivVertical, @efb RelativeLayout transImgLayout) {
        this.f81064a = rootView;
        this.f81065b = btnHorizontalLayout;
        this.f81066c = btnVerticalLayout;
        this.f81067d = ivHorizontal;
        this.f81068e = ivVertical;
        this.f81069f = transImgLayout;
    }

    @efb
    public static sah bind(@efb View rootView) {
        int i = C2558R.id.btn_horizontal_layout;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.btn_vertical_layout;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = C2558R.id.iv_horizontal;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2558R.id.iv_vertical;
                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) rootView;
                        return new sah(relativeLayout, linearLayout, linearLayout2, imageView, imageView2, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static sah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static sah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.trans_item_tool_head, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f81064a;
    }
}
