package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class tve implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f86107a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f86108b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f86109c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f86110d;

    private tve(@efb RelativeLayout rootView, @efb ImageView checkbox, @efb TextView title, @efb TextView titleTip) {
        this.f86107a = rootView;
        this.f86108b = checkbox;
        this.f86109c = title;
        this.f86110d = titleTip;
    }

    @efb
    public static tve bind(@efb View rootView) {
        int i = C2531R.id.checkbox;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2531R.id.title;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2531R.id.title_tip;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new tve((RelativeLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static tve inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static tve inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.select_language_list_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f86107a;
    }
}
