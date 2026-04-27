package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class mc4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f60544a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ProgressBar f60545b;

    private mc4(@efb ConstraintLayout rootView, @efb ProgressBar pbWaiting) {
        this.f60544a = rootView;
        this.f60545b = pbWaiting;
    }

    @efb
    public static mc4 bind(@efb View rootView) {
        int i = C2531R.id.pb_waiting;
        ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
        if (progressBar != null) {
            return new mc4((ConstraintLayout) rootView, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static mc4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static mc4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_waiting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f60544a;
    }
}
