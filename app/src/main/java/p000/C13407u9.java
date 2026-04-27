package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: u9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13407u9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f87084a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f87085b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f87086c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ToolBar f87087d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f87088e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f87089f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f87090m;

    private C13407u9(@efb FrameLayout rootView, @efb TextView aboutDevice, @efb TextView privacyAgreement, @efb ToolBar titleBar, @efb TextView tvAppName, @efb TextView tvCompanyName, @efb TextView tvUserAgreement) {
        this.f87084a = rootView;
        this.f87085b = aboutDevice;
        this.f87086c = privacyAgreement;
        this.f87087d = titleBar;
        this.f87088e = tvAppName;
        this.f87089f = tvCompanyName;
        this.f87090m = tvUserAgreement;
    }

    @efb
    public static C13407u9 bind(@efb View rootView) {
        int i = C2558R.id.about_device;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.privacy_agreement;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.title_bar;
                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                if (toolBar != null) {
                    i = C2558R.id.tv_app_name;
                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = C2558R.id.tv_company_name;
                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            i = C2558R.id.tv_user_agreement;
                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView5 != null) {
                                return new C13407u9((FrameLayout) rootView, textView, textView2, toolBar, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C13407u9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C13407u9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_about, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f87084a;
    }
}
