package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class qg8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f74380a;

    /* JADX INFO: renamed from: b */
    @efb
    public final View f74381b;

    private qg8(@efb LinearLayout rootView, @efb View itemPosition) {
        this.f74380a = rootView;
        this.f74381b = itemPosition;
    }

    @efb
    public static qg8 bind(@efb View rootView) {
        int i = C2531R.id.item_position;
        View viewFindChildViewById = l8i.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            return new qg8((LinearLayout) rootView, viewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static qg8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static qg8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.item_vp_position, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f74380a;
    }
}
