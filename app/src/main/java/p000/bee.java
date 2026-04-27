package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class bee implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f13559a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f13560b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f13561c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f13562d;

    private bee(@efb LinearLayout rootView, @efb LinearLayout llItem, @efb TextView tvDeviceMac, @efb TextView tvDeviceName) {
        this.f13559a = rootView;
        this.f13560b = llItem;
        this.f13561c = tvDeviceMac;
        this.f13562d = tvDeviceName;
    }

    @efb
    public static bee bind(@efb View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = C2558R.id.tv_device_mac;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.tv_device_name;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                return new bee(linearLayout, linearLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static bee inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static bee inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.rv_item_scan_device, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f13559a;
    }
}
