package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.toolbar.ToolBar;

/* JADX INFO: renamed from: hd */
/* JADX INFO: loaded from: classes4.dex */
public final class C6801hd implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f43160a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f43161b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ToolBar f43162c;

    private C6801hd(@efb LinearLayout rootView, @efb RecyclerView rvSelectTheme, @efb ToolBar titleBar) {
        this.f43160a = rootView;
        this.f43161b = rvSelectTheme;
        this.f43162c = titleBar;
    }

    @efb
    public static C6801hd bind(@efb View rootView) {
        int i = C2531R.id.rv_select_theme;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C2531R.id.title_bar;
            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
            if (toolBar != null) {
                return new C6801hd((LinearLayout) rootView, recyclerView, toolBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C6801hd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C6801hd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_theme, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f43160a;
    }
}
