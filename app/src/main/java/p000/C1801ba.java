package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ba */
/* JADX INFO: loaded from: classes4.dex */
public final class C1801ba implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ToolBar f13092C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f13093F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f13094H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f13095L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f13096M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f13097N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f13098Q;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f13099a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f13100b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f13101c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f13102d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f13103e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f13104f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f13105m;

    private C1801ba(@efb RelativeLayout rootView, @efb LinearLayout llBtVersion, @efb LinearLayout llDeviceModel, @efb LinearLayout llDeviceName, @efb LinearLayout llDeviceSd, @efb LinearLayout llDeviceVersion, @efb LinearLayout llIspVersion, @efb ToolBar toolbar, @efb TextView tvBtVersion, @efb TextView tvDeviceModel, @efb TextView tvDeviceName, @efb TextView tvDeviceSd, @efb TextView tvDeviceVersion, @efb TextView tvIspVersion) {
        this.f13099a = rootView;
        this.f13100b = llBtVersion;
        this.f13101c = llDeviceModel;
        this.f13102d = llDeviceName;
        this.f13103e = llDeviceSd;
        this.f13104f = llDeviceVersion;
        this.f13105m = llIspVersion;
        this.f13092C = toolbar;
        this.f13093F = tvBtVersion;
        this.f13094H = tvDeviceModel;
        this.f13095L = tvDeviceName;
        this.f13096M = tvDeviceSd;
        this.f13097N = tvDeviceVersion;
        this.f13098Q = tvIspVersion;
    }

    @efb
    public static C1801ba bind(@efb View rootView) {
        int i = C2558R.id.ll_bt_version;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.ll_device_model;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = C2558R.id.ll_device_name;
                LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout3 != null) {
                    i = C2558R.id.ll_device_sd;
                    LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout4 != null) {
                        i = C2558R.id.ll_device_version;
                        LinearLayout linearLayout5 = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout5 != null) {
                            i = C2558R.id.ll_isp_version;
                            LinearLayout linearLayout6 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout6 != null) {
                                i = C2558R.id.toolbar;
                                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                                if (toolBar != null) {
                                    i = C2558R.id.tv_bt_version;
                                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView != null) {
                                        i = C2558R.id.tv_device_model;
                                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView2 != null) {
                                            i = C2558R.id.tv_device_name;
                                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView3 != null) {
                                                i = C2558R.id.tv_device_sd;
                                                TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView4 != null) {
                                                    i = C2558R.id.tv_device_version;
                                                    TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView5 != null) {
                                                        i = C2558R.id.tv_isp_version;
                                                        TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView6 != null) {
                                                            return new C1801ba((RelativeLayout) rootView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, toolBar, textView, textView2, textView3, textView4, textView5, textView6);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C1801ba inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C1801ba inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_device_about, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f13099a;
    }
}
