package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class gc4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f39338a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f39339b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Button f39340c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f39341d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f39342e;

    private gc4(@efb LinearLayout rootView, @efb Button btnAgree, @efb Button btnDisagree, @efb TextView tvTip, @efb TextView tvTipContent) {
        this.f39338a = rootView;
        this.f39339b = btnAgree;
        this.f39340c = btnDisagree;
        this.f39341d = tvTip;
        this.f39342e = tvTipContent;
    }

    @efb
    public static gc4 bind(@efb View rootView) {
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
                        return new gc4((LinearLayout) rootView, button, button2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static gc4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static gc4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_recover, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f39338a;
    }
}
