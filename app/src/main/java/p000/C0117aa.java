package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.eyevue.common.widget.BvImageView;
import com.eyevue.common.widget.MyEditText;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: aa */
/* JADX INFO: loaded from: classes4.dex */
public final class C0117aa implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f781C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ToolBar f782F;

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f783a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f784b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f785c;

    /* JADX INFO: renamed from: d */
    @efb
    public final AppCompatButton f786d;

    /* JADX INFO: renamed from: e */
    @efb
    public final MyEditText f787e;

    /* JADX INFO: renamed from: f */
    @efb
    public final BvImageView f788f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f789m;

    private C0117aa(@efb FrameLayout rootView, @efb TextView bindDeviceMac, @efb TextView bindDeviceName, @efb AppCompatButton btnScanCode, @efb MyEditText editBingCode, @efb BvImageView ivBindDeviceIcon, @efb RelativeLayout qrCodeLayout, @efb ImageView scanCode, @efb ToolBar titleBar) {
        this.f783a = rootView;
        this.f784b = bindDeviceMac;
        this.f785c = bindDeviceName;
        this.f786d = btnScanCode;
        this.f787e = editBingCode;
        this.f788f = ivBindDeviceIcon;
        this.f789m = qrCodeLayout;
        this.f781C = scanCode;
        this.f782F = titleBar;
    }

    @efb
    public static C0117aa bind(@efb View rootView) {
        int i = C2558R.id.bind_device_mac;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.bind_device_name;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.btn_scan_code;
                AppCompatButton appCompatButton = (AppCompatButton) l8i.findChildViewById(rootView, i);
                if (appCompatButton != null) {
                    i = C2558R.id.edit_bing_code;
                    MyEditText myEditText = (MyEditText) l8i.findChildViewById(rootView, i);
                    if (myEditText != null) {
                        i = C2558R.id.iv_bind_device_icon;
                        BvImageView bvImageView = (BvImageView) l8i.findChildViewById(rootView, i);
                        if (bvImageView != null) {
                            i = C2558R.id.qr_code_layout;
                            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                            if (relativeLayout != null) {
                                i = C2558R.id.scan_code;
                                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView != null) {
                                    i = C2558R.id.title_bar;
                                    ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                                    if (toolBar != null) {
                                        return new C0117aa((FrameLayout) rootView, textView, textView2, appCompatButton, myEditText, bvImageView, relativeLayout, imageView, toolBar);
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
    public static C0117aa inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C0117aa inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_bind_device, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f783a;
    }
}
