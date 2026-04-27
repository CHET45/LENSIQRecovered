package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16038z9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f104426a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f104427b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f104428c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ToolBar f104429d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f104430e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f104431f;

    private C16038z9(@efb FrameLayout rootView, @efb LinearLayout llAllowBackendOperation, @efb LinearLayout llBatteryOptimization, @efb ToolBar titleBar, @efb TextView tvAllowBackendOperation, @efb TextView tvBatteryOptimization) {
        this.f104426a = rootView;
        this.f104427b = llAllowBackendOperation;
        this.f104428c = llBatteryOptimization;
        this.f104429d = titleBar;
        this.f104430e = tvAllowBackendOperation;
        this.f104431f = tvBatteryOptimization;
    }

    @efb
    public static C16038z9 bind(@efb View rootView) {
        int i = C2558R.id.ll_allow_backend_operation;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.ll_battery_optimization;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = C2558R.id.title_bar;
                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                if (toolBar != null) {
                    i = C2558R.id.tv_allow_backend_operation;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2558R.id.tv_battery_optimization;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new C16038z9((FrameLayout) rootView, linearLayout, linearLayout2, toolBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C16038z9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C16038z9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_battery_permissions, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f104426a;
    }
}
