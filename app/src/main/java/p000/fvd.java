package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.eyevue.common.widget.loadmore.BaseRecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class fvd implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final BaseRecyclerView f37825a;

    /* JADX INFO: renamed from: b */
    @efb
    public final BaseRecyclerView f37826b;

    private fvd(@efb BaseRecyclerView rootView, @efb BaseRecyclerView recyclerView) {
        this.f37825a = rootView;
        this.f37826b = recyclerView;
    }

    @efb
    public static fvd bind(@efb View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        BaseRecyclerView baseRecyclerView = (BaseRecyclerView) rootView;
        return new fvd(baseRecyclerView, baseRecyclerView);
    }

    @efb
    public static fvd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static fvd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.recycler, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public BaseRecyclerView getRoot() {
        return this.f37825a;
    }
}
