package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class lc4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f57180a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f57181b;

    private lc4(@efb ConstraintLayout rootView, @efb ImageView pbWaiting) {
        this.f57180a = rootView;
        this.f57181b = pbWaiting;
    }

    @efb
    public static lc4 bind(@efb View rootView) {
        int i = C2558R.id.pb_waiting;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            return new lc4((ConstraintLayout) rootView, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static lc4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static lc4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_waiting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f57180a;
    }
}
