package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class g4h implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f38774a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f38775b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f38776c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f38777d;

    /* JADX INFO: renamed from: e */
    @efb
    public final View f38778e;

    private g4h(@efb LinearLayout rootView, @efb ImageView ivBack, @efb RelativeLayout llContent, @efb TextView tvTitle, @efb View viewLine) {
        this.f38774a = rootView;
        this.f38775b = ivBack;
        this.f38776c = llContent;
        this.f38777d = tvTitle;
        this.f38778e = viewLine;
    }

    @efb
    public static g4h bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2531R.id.iv_back;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2531R.id.ll_content;
            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = C2531R.id.tv_title;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2531R.id.view_line))) != null) {
                    return new g4h((LinearLayout) rootView, imageView, relativeLayout, textView, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static g4h inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static g4h inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.toolbar_eyevue_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f38774a;
    }
}
