package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class bd9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f13435a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ProgressBar f13436b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f13437c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f13438d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f13439e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f13440f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f13441m;

    private bd9(@efb RelativeLayout rootView, @efb ProgressBar progressbarLoading, @efb RelativeLayout rlRootView, @efb TextView tvAgain, @efb TextView tvLoadingHint, @efb TextView tvNoDataHint, @efb TextView tvNoNetHint) {
        this.f13435a = rootView;
        this.f13436b = progressbarLoading;
        this.f13437c = rlRootView;
        this.f13438d = tvAgain;
        this.f13439e = tvLoadingHint;
        this.f13440f = tvNoDataHint;
        this.f13441m = tvNoNetHint;
    }

    @efb
    public static bd9 bind(@efb View rootView) {
        int i = C2558R.id.progressbar_loading;
        ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
        if (progressBar != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = C2558R.id.tv_again;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2558R.id.tv_loading_hint;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = C2558R.id.tv_no_data_hint;
                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = C2558R.id.tv_no_net_hint;
                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            return new bd9(relativeLayout, progressBar, relativeLayout, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static bd9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static bd9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.loading_view_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f13435a;
    }
}
