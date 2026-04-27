package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class pv8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f72211a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f72212b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f72213c;

    private pv8(@efb RelativeLayout rootView, @efb ImageView floatingIcon, @efb RelativeLayout layoutFloating) {
        this.f72211a = rootView;
        this.f72212b = floatingIcon;
        this.f72213c = layoutFloating;
    }

    @efb
    public static pv8 bind(@efb View rootView) {
        int i = C2558R.id.floating_icon;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        return new pv8(relativeLayout, imageView, relativeLayout);
    }

    @efb
    public static pv8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static pv8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.layout_floating_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f72211a;
    }
}
