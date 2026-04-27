package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class mb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f60437a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f60438b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f60439c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f60440d;

    private mb4(@efb LinearLayout rootView, @efb Button btnAgree, @efb TextView tvTip, @efb TextView tvTipContent) {
        this.f60437a = rootView;
        this.f60438b = btnAgree;
        this.f60439c = tvTip;
        this.f60440d = tvTipContent;
    }

    @efb
    public static mb4 bind(@efb View rootView) {
        int i = C2531R.id.btn_agree;
        Button button = (Button) l8i.findChildViewById(rootView, i);
        if (button != null) {
            i = C2531R.id.tv_tip;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2531R.id.tv_tip_content;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new mb4((LinearLayout) rootView, button, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static mb4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static mb4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_ota_tip, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f60437a;
    }
}
