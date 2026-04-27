package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class pg8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f70705a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f70706b;

    private pg8(@efb LinearLayout rootView, @efb ImageView itemImage) {
        this.f70705a = rootView;
        this.f70706b = itemImage;
    }

    @efb
    public static pg8 bind(@efb View rootView) {
        int i = C2531R.id.item_image;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            return new pg8((LinearLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static pg8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static pg8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.item_vp, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f70705a;
    }
}
