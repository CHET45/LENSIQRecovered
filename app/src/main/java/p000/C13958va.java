package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.eyevue.common.widget.LoadingView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: va */
/* JADX INFO: loaded from: classes4.dex */
public final class C13958va implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f90421a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LoadingView f90422b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ProgressBar f90423c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ToolBar f90424d;

    /* JADX INFO: renamed from: e */
    @efb
    public final FrameLayout f90425e;

    private C13958va(@efb RelativeLayout rootView, @efb LoadingView loadingView, @efb ProgressBar progressBar, @efb ToolBar titleBar, @efb FrameLayout webViewContainer) {
        this.f90421a = rootView;
        this.f90422b = loadingView;
        this.f90423c = progressBar;
        this.f90424d = titleBar;
        this.f90425e = webViewContainer;
    }

    @efb
    public static C13958va bind(@efb View rootView) {
        int i = C2558R.id.loadingView;
        LoadingView loadingView = (LoadingView) l8i.findChildViewById(rootView, i);
        if (loadingView != null) {
            i = C2558R.id.progress_bar;
            ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
            if (progressBar != null) {
                i = C2558R.id.title_bar;
                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                if (toolBar != null) {
                    i = C2558R.id.webViewContainer;
                    FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                    if (frameLayout != null) {
                        return new C13958va((RelativeLayout) rootView, loadingView, progressBar, toolBar, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C13958va inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C13958va inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_statement, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f90421a;
    }
}
