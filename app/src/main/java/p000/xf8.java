package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class xf8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f97634a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f97635b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f97636c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f97637d;

    private xf8(@efb RelativeLayout rootView, @efb ImageView ivSelectBg, @efb TextView tvDeviceName, @efb TextView tvItemBind) {
        this.f97634a = rootView;
        this.f97635b = ivSelectBg;
        this.f97636c = tvDeviceName;
        this.f97637d = tvItemBind;
    }

    @efb
    public static xf8 bind(@efb View rootView) {
        int i = C2558R.id.iv_select_bg;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.tv_device_name;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2558R.id.tv_item_bind;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new xf8((RelativeLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static xf8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static xf8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_device_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f97634a;
    }
}
