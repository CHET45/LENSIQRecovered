package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class hc4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f43123a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f43124b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Button f43125c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f43126d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f43127e;

    private hc4(@efb LinearLayout rootView, @efb Button btnAgree, @efb Button btnDisagree, @efb TextView tvTip, @efb TextView tvTipContent) {
        this.f43123a = rootView;
        this.f43124b = btnAgree;
        this.f43125c = btnDisagree;
        this.f43126d = tvTip;
        this.f43127e = tvTipContent;
    }

    @efb
    public static hc4 bind(@efb View rootView) {
        int i = C2531R.id.btn_agree;
        Button button = (Button) l8i.findChildViewById(rootView, i);
        if (button != null) {
            i = C2531R.id.btn_disagree;
            Button button2 = (Button) l8i.findChildViewById(rootView, i);
            if (button2 != null) {
                i = C2531R.id.tv_tip;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2531R.id.tv_tip_content;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        return new hc4((LinearLayout) rootView, button, button2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static hc4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static hc4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_removebond, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f43123a;
    }
}
