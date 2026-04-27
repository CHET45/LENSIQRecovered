package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class j4h implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f49528a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f49529b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f49530c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f49531d;

    /* JADX INFO: renamed from: e */
    @efb
    public final View f49532e;

    private j4h(@efb LinearLayout rootView, @efb ImageView ivBack, @efb RelativeLayout llContent, @efb TextView tvTitle, @efb View viewLine) {
        this.f49528a = rootView;
        this.f49529b = ivBack;
        this.f49530c = llContent;
        this.f49531d = tvTitle;
        this.f49532e = viewLine;
    }

    @efb
    public static j4h bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.iv_back;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.ll_content;
            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = C2558R.id.tv_title;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.view_line))) != null) {
                    return new j4h((LinearLayout) rootView, imageView, relativeLayout, textView, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static j4h inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static j4h inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.toolbar_layout_voice_note, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f49528a;
    }
}
