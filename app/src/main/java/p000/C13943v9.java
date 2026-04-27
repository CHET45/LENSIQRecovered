package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: v9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13943v9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f90351a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f90352b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f90353c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ConstraintLayout f90354d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f90355e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ToolBar f90356f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f90357m;

    private C13943v9(@efb ConstraintLayout rootView, @efb TextView btnResearch, @efb ImageView ivImg, @efb ConstraintLayout llLayoutNoFind, @efb LinearLayout llLayoutSearch, @efb ToolBar toolbar, @efb TextView tvNoFind) {
        this.f90351a = rootView;
        this.f90352b = btnResearch;
        this.f90353c = ivImg;
        this.f90354d = llLayoutNoFind;
        this.f90355e = llLayoutSearch;
        this.f90356f = toolbar;
        this.f90357m = tvNoFind;
    }

    @efb
    public static C13943v9 bind(@efb View rootView) {
        int i = C2558R.id.btn_research;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.iv_img;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2558R.id.ll_layout_no_find;
                ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
                if (constraintLayout != null) {
                    i = C2558R.id.ll_layout_search;
                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout != null) {
                        i = C2558R.id.toolbar;
                        ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                        if (toolBar != null) {
                            i = C2558R.id.tv_no_find;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                return new C13943v9((ConstraintLayout) rootView, textView, imageView, constraintLayout, linearLayout, toolBar, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C13943v9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C13943v9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_add_device, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f90351a;
    }
}
