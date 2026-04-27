package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ca */
/* JADX INFO: loaded from: classes4.dex */
public final class C2246ca implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f16051a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f16052b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ToolBar f16053c;

    private C2246ca(@efb ConstraintLayout rootView, @efb RecyclerView rvDeviceList, @efb ToolBar toolbar) {
        this.f16051a = rootView;
        this.f16052b = rvDeviceList;
        this.f16053c = toolbar;
    }

    @efb
    public static C2246ca bind(@efb View rootView) {
        int i = C2558R.id.rv_device_list;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C2558R.id.toolbar;
            ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
            if (toolBar != null) {
                return new C2246ca((ConstraintLayout) rootView, recyclerView, toolBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C2246ca inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C2246ca inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_device_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f16051a;
    }
}
