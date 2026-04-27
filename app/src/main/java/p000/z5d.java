package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class z5d implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f104244a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f104245b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Button f104246c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f104247d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f104248e;

    private z5d(@efb LinearLayout rootView, @efb Button btnAgree, @efb Button btnDisagree, @efb TextView tvPrivacyContent, @efb TextView tvPrivacyTip) {
        this.f104244a = rootView;
        this.f104245b = btnAgree;
        this.f104246c = btnDisagree;
        this.f104247d = tvPrivacyContent;
        this.f104248e = tvPrivacyTip;
    }

    @efb
    public static z5d bind(@efb View rootView) {
        int i = C2531R.id.btn_agree;
        Button button = (Button) l8i.findChildViewById(rootView, i);
        if (button != null) {
            i = C2531R.id.btn_disagree;
            Button button2 = (Button) l8i.findChildViewById(rootView, i);
            if (button2 != null) {
                i = C2531R.id.tv_privacy_content;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2531R.id.tv_privacy_tip;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        return new z5d((LinearLayout) rootView, button, button2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static z5d inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static z5d inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.ppw_privacy, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f104244a;
    }
}
