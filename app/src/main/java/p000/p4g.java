package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class p4g implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final View f69644a;

    /* JADX INFO: renamed from: b */
    @efb
    public final View f69645b;

    private p4g(@efb View rootView, @efb View statusBarHeight) {
        this.f69644a = rootView;
        this.f69645b = statusBarHeight;
    }

    @efb
    public static p4g bind(@efb View rootView) {
        if (rootView != null) {
            return new p4g(rootView, rootView);
        }
        throw new NullPointerException("rootView");
    }

    @efb
    public static p4g inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // p000.j8i
    @efb
    public View getRoot() {
        return this.f69644a;
    }

    @efb
    public static p4g inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.status_bar_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
