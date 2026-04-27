package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class lb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f57050a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f57051b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Button f57052c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f57053d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f57054e;

    private lb4(@efb LinearLayout rootView, @efb Button btnAgree, @efb Button btnDisagree, @efb TextView tvTip, @efb TextView tvTipContent) {
        this.f57050a = rootView;
        this.f57051b = btnAgree;
        this.f57052c = btnDisagree;
        this.f57053d = tvTip;
        this.f57054e = tvTipContent;
    }

    @efb
    public static lb4 bind(@efb View rootView) {
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
                        return new lb4((LinearLayout) rootView, button, button2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static lb4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static lb4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_ota, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f57050a;
    }
}
