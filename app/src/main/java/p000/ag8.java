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
public final class ag8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f1397a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f1398b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f1399c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f1400d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f1401e;

    private ag8(@efb LinearLayout rootView, @efb ImageView ivYuantu, @efb LinearLayout llYuantu, @efb RelativeLayout rlYuantuCheck, @efb TextView tvYuantuCheck) {
        this.f1397a = rootView;
        this.f1398b = ivYuantu;
        this.f1399c = llYuantu;
        this.f1400d = rlYuantuCheck;
        this.f1401e = tvYuantuCheck;
    }

    @efb
    public static ag8 bind(@efb View rootView) {
        int i = C2558R.id.iv_yuantu;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.ll_yuantu;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C2558R.id.rl_yuantu_check;
                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                if (relativeLayout != null) {
                    i = C2558R.id.tv_yuantu_check;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        return new ag8((LinearLayout) rootView, imageView, linearLayout, relativeLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ag8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ag8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_image_stylefilter, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f1397a;
    }
}
