package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class eb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f32503a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f32504b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Button f32505c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f32506d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f32507e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f32508f;

    private eb4(@efb LinearLayout rootView, @efb Button btnAgree, @efb Button btnDisagree, @efb LinearLayout btnLayout, @efb TextView tvContent, @efb TextView tvTitleTip) {
        this.f32503a = rootView;
        this.f32504b = btnAgree;
        this.f32505c = btnDisagree;
        this.f32506d = btnLayout;
        this.f32507e = tvContent;
        this.f32508f = tvTitleTip;
    }

    @efb
    public static eb4 bind(@efb View rootView) {
        int i = C2531R.id.btn_agree;
        Button button = (Button) l8i.findChildViewById(rootView, i);
        if (button != null) {
            i = C2531R.id.btn_disagree;
            Button button2 = (Button) l8i.findChildViewById(rootView, i);
            if (button2 != null) {
                i = C2531R.id.btn_layout;
                LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = C2531R.id.tv_content;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2531R.id.tv_title_tip;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new eb4((LinearLayout) rootView, button, button2, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static eb4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static eb4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_logout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f32503a;
    }
}
