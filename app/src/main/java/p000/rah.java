package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class rah implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f77613a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f77614b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f77615c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f77616d;

    private rah(@efb LinearLayout rootView, @efb ImageView transImg, @efb LinearLayout transImgLayout, @efb TextView transModel) {
        this.f77613a = rootView;
        this.f77614b = transImg;
        this.f77615c = transImgLayout;
        this.f77616d = transModel;
    }

    @efb
    public static rah bind(@efb View rootView) {
        int i = C2558R.id.trans_img;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            int i2 = C2558R.id.trans_model;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i2);
            if (textView != null) {
                return new rah(linearLayout, imageView, linearLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static rah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static rah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.trans_item_tool, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f77613a;
    }
}
