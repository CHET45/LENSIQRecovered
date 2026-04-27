package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.toolbar.ToolBar;

/* JADX INFO: renamed from: ib */
/* JADX INFO: loaded from: classes4.dex */
public final class C7221ib implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f46287a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f46288b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ToolBar f46289c;

    private C7221ib(@efb LinearLayout rootView, @efb RecyclerView rvSelectLanguage, @efb ToolBar titleBar) {
        this.f46287a = rootView;
        this.f46288b = rvSelectLanguage;
        this.f46289c = titleBar;
    }

    @efb
    public static C7221ib bind(@efb View rootView) {
        int i = C2531R.id.rv_select_language;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C2531R.id.title_bar;
            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
            if (toolBar != null) {
                return new C7221ib((LinearLayout) rootView, recyclerView, toolBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C7221ib inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C7221ib inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_language, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f46287a;
    }
}
