package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.toolbar.ToolBar;

/* JADX INFO: renamed from: cd */
/* JADX INFO: loaded from: classes4.dex */
public final class C2274cd implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f16260a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f16261b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f16262c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f16263d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ToolBar f16264e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f16265f;

    private C2274cd(@efb LinearLayout rootView, @efb TextView logOff, @efb TextView logOut, @efb TextView privacyAgreement, @efb ToolBar titleBar, @efb TextView tvUserAgreement) {
        this.f16260a = rootView;
        this.f16261b = logOff;
        this.f16262c = logOut;
        this.f16263d = privacyAgreement;
        this.f16264e = titleBar;
        this.f16265f = tvUserAgreement;
    }

    @efb
    public static C2274cd bind(@efb View rootView) {
        int i = C2531R.id.log_off;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2531R.id.log_out;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2531R.id.privacy_agreement;
                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = C2531R.id.title_bar;
                    ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                    if (toolBar != null) {
                        i = C2531R.id.tv_user_agreement;
                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            return new C2274cd((LinearLayout) rootView, textView, textView2, textView3, toolBar, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C2274cd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C2274cd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_setting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f16260a;
    }
}
