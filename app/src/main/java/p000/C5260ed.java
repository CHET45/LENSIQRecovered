package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.LoadingView;
import com.eyevue.common.widget.toolbar.ToolBar;

/* JADX INFO: renamed from: ed */
/* JADX INFO: loaded from: classes4.dex */
public final class C5260ed implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f32657a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LoadingView f32658b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ProgressBar f32659c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ToolBar f32660d;

    /* JADX INFO: renamed from: e */
    @efb
    public final FrameLayout f32661e;

    private C5260ed(@efb RelativeLayout rootView, @efb LoadingView loadingView, @efb ProgressBar progressBar, @efb ToolBar titleBar, @efb FrameLayout webViewContainer) {
        this.f32657a = rootView;
        this.f32658b = loadingView;
        this.f32659c = progressBar;
        this.f32660d = titleBar;
        this.f32661e = webViewContainer;
    }

    @efb
    public static C5260ed bind(@efb View rootView) {
        int i = C2531R.id.loadingView;
        LoadingView loadingView = (LoadingView) l8i.findChildViewById(rootView, i);
        if (loadingView != null) {
            i = C2531R.id.progress_bar;
            ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
            if (progressBar != null) {
                i = C2531R.id.title_bar;
                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                if (toolBar != null) {
                    i = C2531R.id.webViewContainer;
                    FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                    if (frameLayout != null) {
                        return new C5260ed((RelativeLayout) rootView, loadingView, progressBar, toolBar, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C5260ed inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C5260ed inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_statement, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f32657a;
    }
}
