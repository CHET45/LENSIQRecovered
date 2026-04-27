package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class wf8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f94090a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f94091b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f94092c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f94093d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f94094e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f94095f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f94096m;

    private wf8(@efb RelativeLayout rootView, @efb LinearLayout btnReconnect, @efb ImageView ivPoint, @efb ImageView ivReconnectAnim, @efb ImageView ivSelectBg, @efb TextView tvConnectState, @efb TextView tvDeviceName) {
        this.f94090a = rootView;
        this.f94091b = btnReconnect;
        this.f94092c = ivPoint;
        this.f94093d = ivReconnectAnim;
        this.f94094e = ivSelectBg;
        this.f94095f = tvConnectState;
        this.f94096m = tvDeviceName;
    }

    @efb
    public static wf8 bind(@efb View rootView) {
        int i = C2558R.id.btn_reconnect;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.iv_point;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2558R.id.iv_reconnect_anim;
                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = C2558R.id.iv_select_bg;
                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = C2558R.id.tv_connect_state;
                        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = C2558R.id.tv_device_name;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                return new wf8((RelativeLayout) rootView, linearLayout, imageView, imageView2, imageView3, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static wf8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static wf8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_device_history_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f94090a;
    }
}
