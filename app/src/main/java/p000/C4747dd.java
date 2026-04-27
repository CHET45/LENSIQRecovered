package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.eyevue.common.C2531R;

/* JADX INFO: renamed from: dd */
/* JADX INFO: loaded from: classes4.dex */
public final class C4747dd implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f29366a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f29367b;

    private C4747dd(@efb RelativeLayout rootView, @efb ImageView splashName) {
        this.f29366a = rootView;
        this.f29367b = splashName;
    }

    @efb
    public static C4747dd bind(@efb View rootView) {
        int i = C2531R.id.splash_name;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            return new C4747dd((RelativeLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C4747dd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C4747dd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.activity_splash, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f29366a;
    }
}
