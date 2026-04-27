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
public final class sve implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f83101a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f83102b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f83103c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f83104d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f83105e;

    private sve(@efb RelativeLayout rootView, @efb ImageView checkbox, @efb LinearLayout rlCheckbox, @efb TextView title, @efb TextView titleTip) {
        this.f83101a = rootView;
        this.f83102b = checkbox;
        this.f83103c = rlCheckbox;
        this.f83104d = title;
        this.f83105e = titleTip;
    }

    @efb
    public static sve bind(@efb View rootView) {
        int i = C2558R.id.checkbox;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.rl_checkbox;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C2558R.id.title;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.title_tip;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        return new sve((RelativeLayout) rootView, imageView, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static sve inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static sve inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.select_language_list_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f83101a;
    }
}
