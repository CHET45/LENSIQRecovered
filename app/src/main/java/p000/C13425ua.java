package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ua */
/* JADX INFO: loaded from: classes4.dex */
public final class C13425ua implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f87245a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f87246b;

    private C13425ua(@efb RelativeLayout rootView, @efb ImageView ivLogo) {
        this.f87245a = rootView;
        this.f87246b = ivLogo;
    }

    @efb
    public static C13425ua bind(@efb View rootView) {
        int i = C2558R.id.iv_logo;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            return new C13425ua((RelativeLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C13425ua inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C13425ua inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_splash, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f87245a;
    }
}
