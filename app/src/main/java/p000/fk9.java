package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class fk9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f36945a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f36946b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Button f36947c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f36948d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f36949e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f36950f;

    private fk9(@efb LinearLayout rootView, @efb Button btnAgree, @efb Button btnDisagree, @efb LinearLayout btnLayout, @efb TextView tvContent, @efb TextView tvTitleTip) {
        this.f36945a = rootView;
        this.f36946b = btnAgree;
        this.f36947c = btnDisagree;
        this.f36948d = btnLayout;
        this.f36949e = tvContent;
        this.f36950f = tvTitleTip;
    }

    @efb
    public static fk9 bind(@efb View rootView) {
        int i = C2558R.id.btn_agree;
        Button button = (Button) l8i.findChildViewById(rootView, i);
        if (button != null) {
            i = C2558R.id.btn_disagree;
            Button button2 = (Button) l8i.findChildViewById(rootView, i);
            if (button2 != null) {
                i = C2558R.id.btn_layout;
                LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = C2558R.id.tv_content;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2558R.id.tv_title_tip;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new fk9((LinearLayout) rootView, button, button2, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static fk9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static fk9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.logout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f36945a;
    }
}
