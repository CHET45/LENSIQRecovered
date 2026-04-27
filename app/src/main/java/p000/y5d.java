package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class y5d implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f100432a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f100433b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Button f100434c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f100435d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f100436e;

    private y5d(@efb LinearLayout rootView, @efb Button btnAgree, @efb Button btnDisagree, @efb TextView tvPrivacyContent, @efb TextView tvPrivacyTip) {
        this.f100432a = rootView;
        this.f100433b = btnAgree;
        this.f100434c = btnDisagree;
        this.f100435d = tvPrivacyContent;
        this.f100436e = tvPrivacyTip;
    }

    @efb
    public static y5d bind(@efb View rootView) {
        int i = C2558R.id.btn_agree;
        Button button = (Button) l8i.findChildViewById(rootView, i);
        if (button != null) {
            i = C2558R.id.btn_disagree;
            Button button2 = (Button) l8i.findChildViewById(rootView, i);
            if (button2 != null) {
                i = C2558R.id.tv_privacy_content;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.tv_privacy_tip;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        return new y5d((LinearLayout) rootView, button, button2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static y5d inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static y5d inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.ppw_privacy, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f100432a;
    }
}
