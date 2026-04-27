package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class cd9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f16290a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ProgressBar f16291b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f16292c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f16293d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f16294e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f16295f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f16296m;

    private cd9(@efb RelativeLayout rootView, @efb ProgressBar progressbarLoading, @efb RelativeLayout rlRootView, @efb TextView tvAgain, @efb TextView tvLoadingHint, @efb TextView tvNoDataHint, @efb TextView tvNoNetHint) {
        this.f16290a = rootView;
        this.f16291b = progressbarLoading;
        this.f16292c = rlRootView;
        this.f16293d = tvAgain;
        this.f16294e = tvLoadingHint;
        this.f16295f = tvNoDataHint;
        this.f16296m = tvNoNetHint;
    }

    @efb
    public static cd9 bind(@efb View rootView) {
        int i = C2531R.id.progressbar_loading;
        ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
        if (progressBar != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = C2531R.id.tv_again;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2531R.id.tv_loading_hint;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = C2531R.id.tv_no_data_hint;
                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = C2531R.id.tv_no_net_hint;
                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            return new cd9(relativeLayout, progressBar, relativeLayout, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static cd9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static cd9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.loading_view_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f16290a;
    }
}
