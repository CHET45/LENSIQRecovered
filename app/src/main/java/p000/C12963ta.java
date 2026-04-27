package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ta */
/* JADX INFO: loaded from: classes4.dex */
public final class C12963ta implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f84062a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f84063b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f84064c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f84065d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ToolBar f84066e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f84067f;

    private C12963ta(@efb LinearLayout rootView, @efb TextView logOff, @efb TextView logOut, @efb TextView privacyAgreement, @efb ToolBar titleBar, @efb TextView tvUserAgreement) {
        this.f84062a = rootView;
        this.f84063b = logOff;
        this.f84064c = logOut;
        this.f84065d = privacyAgreement;
        this.f84066e = titleBar;
        this.f84067f = tvUserAgreement;
    }

    @efb
    public static C12963ta bind(@efb View rootView) {
        int i = C2558R.id.log_off;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.log_out;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.privacy_agreement;
                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = C2558R.id.title_bar;
                    ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                    if (toolBar != null) {
                        i = C2558R.id.tv_user_agreement;
                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            return new C12963ta((LinearLayout) rootView, textView, textView2, textView3, toolBar, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C12963ta inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C12963ta inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_setting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f84062a;
    }
}
