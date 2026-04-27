package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class yf8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f101401a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f101402b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f101403c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f101404d;

    private yf8(@efb RelativeLayout rootView, @efb ImageView ivSettingSelectState, @efb TextView tvHotTip, @efb TextView tvSettingName) {
        this.f101401a = rootView;
        this.f101402b = ivSettingSelectState;
        this.f101403c = tvHotTip;
        this.f101404d = tvSettingName;
    }

    @efb
    public static yf8 bind(@efb View rootView) {
        int i = C2558R.id.iv_setting_select_state;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.tv_hot_tip;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2558R.id.tv_setting_name;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new yf8((RelativeLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static yf8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static yf8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_device_setting_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f101401a;
    }
}
