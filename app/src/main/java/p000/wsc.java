package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class wsc implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f95330a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f95331b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f95332c;

    /* JADX INFO: renamed from: d */
    @efb
    public final CheckBox f95333d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f95334e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f95335f;

    private wsc(@efb LinearLayout rootView, @efb LinearLayout imgCancel, @efb ImageView imgTransView, @efb CheckBox showCheckbox, @efb TextView textTip, @efb TextView txtTip) {
        this.f95330a = rootView;
        this.f95331b = imgCancel;
        this.f95332c = imgTransView;
        this.f95333d = showCheckbox;
        this.f95334e = textTip;
        this.f95335f = txtTip;
    }

    @efb
    public static wsc bind(@efb View rootView) {
        int i = C2531R.id.img_cancel;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2531R.id.img_trans_view;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2531R.id.show_checkbox;
                CheckBox checkBox = (CheckBox) l8i.findChildViewById(rootView, i);
                if (checkBox != null) {
                    i = C2531R.id.text_tip;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2531R.id.txt_tip;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new wsc((LinearLayout) rootView, linearLayout, imageView, checkBox, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static wsc inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static wsc inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.phone_ear_show_tip, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f95330a;
    }
}
