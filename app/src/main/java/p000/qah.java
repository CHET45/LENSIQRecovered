package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class qah implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f73769a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f73770b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f73771c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f73772d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f73773e;

    private qah(@efb RelativeLayout rootView, @efb ImageView imgTransPhone, @efb RelativeLayout transImgLayout, @efb TextView transMode, @efb TextView transModeTip) {
        this.f73769a = rootView;
        this.f73770b = imgTransPhone;
        this.f73771c = transImgLayout;
        this.f73772d = transMode;
        this.f73773e = transModeTip;
    }

    @efb
    public static qah bind(@efb View rootView) {
        int i = C4035R.id.img_trans_phone;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = C4035R.id.trans_mode;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C4035R.id.trans_mode_tip;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new qah(relativeLayout, imageView, relativeLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static qah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static qah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_item_tool, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f73769a;
    }
}
