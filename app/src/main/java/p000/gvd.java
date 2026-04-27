package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.eyevue.common.C2531R;
import com.eyevue.common.widget.loadmore.BaseRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class gvd implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final BaseRecyclerView f41482a;

    /* JADX INFO: renamed from: b */
    @efb
    public final BaseRecyclerView f41483b;

    private gvd(@efb BaseRecyclerView rootView, @efb BaseRecyclerView recyclerView) {
        this.f41482a = rootView;
        this.f41483b = recyclerView;
    }

    @efb
    public static gvd bind(@efb View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        BaseRecyclerView baseRecyclerView = (BaseRecyclerView) rootView;
        return new gvd(baseRecyclerView, baseRecyclerView);
    }

    @efb
    public static gvd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static gvd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.recycler, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public BaseRecyclerView getRoot() {
        return this.f41482a;
    }
}
