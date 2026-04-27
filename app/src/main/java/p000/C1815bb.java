package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: bb */
/* JADX INFO: loaded from: classes4.dex */
public final class C1815bb implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f13201a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f13202b;

    private C1815bb(@efb RelativeLayout rootView, @efb ImageView fullScreenImageView) {
        this.f13201a = rootView;
        this.f13202b = fullScreenImageView;
    }

    @efb
    public static C1815bb bind(@efb View rootView) {
        int i = C2558R.id.fullScreenImageView;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            return new C1815bb((RelativeLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C1815bb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C1815bb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_full_screen_image, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f13201a;
    }
}
