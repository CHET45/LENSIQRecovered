package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class wp5 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f95010a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f95011b;

    private wp5(@efb RelativeLayout rootView, @efb TextView title) {
        this.f95010a = rootView;
        this.f95011b = title;
    }

    @efb
    public static wp5 bind(@efb View rootView) {
        int i = C2558R.id.title;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            return new wp5((RelativeLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static wp5 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static wp5 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.feedback_select_list_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f95010a;
    }
}
