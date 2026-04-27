package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: wa */
/* JADX INFO: loaded from: classes4.dex */
public final class C14524wa implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f93785a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f93786b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ToolBar f93787c;

    private C14524wa(@efb LinearLayout rootView, @efb RecyclerView rvSelectTheme, @efb ToolBar titleBar) {
        this.f93785a = rootView;
        this.f93786b = rvSelectTheme;
        this.f93787c = titleBar;
    }

    @efb
    public static C14524wa bind(@efb View rootView) {
        int i = C2558R.id.rv_select_theme;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C2558R.id.title_bar;
            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
            if (toolBar != null) {
                return new C14524wa((LinearLayout) rootView, recyclerView, toolBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C14524wa inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C14524wa inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_theme, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f93785a;
    }
}
