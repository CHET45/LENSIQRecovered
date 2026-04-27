package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class o4g implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final View f66454a;

    /* JADX INFO: renamed from: b */
    @efb
    public final View f66455b;

    private o4g(@efb View rootView, @efb View statusBarHeight) {
        this.f66454a = rootView;
        this.f66455b = statusBarHeight;
    }

    @efb
    public static o4g bind(@efb View rootView) {
        if (rootView != null) {
            return new o4g(rootView, rootView);
        }
        throw new NullPointerException("rootView");
    }

    @efb
    public static o4g inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // p000.j8i
    @efb
    public View getRoot() {
        return this.f66454a;
    }

    @efb
    public static o4g inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.status_bar_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
