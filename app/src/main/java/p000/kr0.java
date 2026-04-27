package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.bottomnav.FunLottieAnimationView;

/* JADX INFO: loaded from: classes4.dex */
public final class kr0 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f55079a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f55080b;

    /* JADX INFO: renamed from: c */
    @efb
    public final FunLottieAnimationView f55081c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f55082d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f55083e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f55084f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f55085m;

    private kr0(@efb LinearLayout rootView, @efb ImageView ivIcon, @efb FunLottieAnimationView lottieView, @efb TextView tvMsg, @efb TextView tvPoint, @efb TextView tvText, @efb TextView tvUnredNum) {
        this.f55079a = rootView;
        this.f55080b = ivIcon;
        this.f55081c = lottieView;
        this.f55082d = tvMsg;
        this.f55083e = tvPoint;
        this.f55084f = tvText;
        this.f55085m = tvUnredNum;
    }

    @efb
    public static kr0 bind(@efb View rootView) {
        int i = C2531R.id.iv_icon;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2531R.id.lottieView;
            FunLottieAnimationView funLottieAnimationView = (FunLottieAnimationView) l8i.findChildViewById(rootView, i);
            if (funLottieAnimationView != null) {
                i = C2531R.id.tv_msg;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2531R.id.tv_point;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = C2531R.id.tv_text;
                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = C2531R.id.tv_unred_num;
                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                return new kr0((LinearLayout) rootView, imageView, funLottieAnimationView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static kr0 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static kr0 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.base_item_bottom_bar, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f55079a;
    }
}
