package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;

/* JADX INFO: renamed from: vb */
/* JADX INFO: loaded from: classes4.dex */
public final class C13984vb implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f90529a;

    /* JADX INFO: renamed from: b */
    @efb
    public final DecoratedBarcodeView f90530b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f90531c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f90532d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f90533e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f90534f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f90535m;

    private C13984vb(@efb FrameLayout rootView, @efb DecoratedBarcodeView dbvCustom, @efb ImageView ivBack, @efb RelativeLayout llContent, @efb RelativeLayout titleLayout, @efb TextView tvTitle, @efb TextView zxingCapture) {
        this.f90529a = rootView;
        this.f90530b = dbvCustom;
        this.f90531c = ivBack;
        this.f90532d = llContent;
        this.f90533e = titleLayout;
        this.f90534f = tvTitle;
        this.f90535m = zxingCapture;
    }

    @efb
    public static C13984vb bind(@efb View rootView) {
        int i = C2558R.id.dbv_custom;
        DecoratedBarcodeView decoratedBarcodeView = (DecoratedBarcodeView) l8i.findChildViewById(rootView, i);
        if (decoratedBarcodeView != null) {
            i = C2558R.id.iv_back;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2558R.id.ll_content;
                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                if (relativeLayout != null) {
                    i = C2558R.id.title_layout;
                    RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                    if (relativeLayout2 != null) {
                        i = C2558R.id.tv_title;
                        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = C2558R.id.zxing_capture;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                return new C13984vb((FrameLayout) rootView, decoratedBarcodeView, imageView, relativeLayout, relativeLayout2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C13984vb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C13984vb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_qr, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f90529a;
    }
}
