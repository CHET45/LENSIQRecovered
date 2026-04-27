package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class ub4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f87365a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f87366b;

    private ub4(@efb FrameLayout rootView, @efb TextView tvSure) {
        this.f87365a = rootView;
        this.f87366b = tvSure;
    }

    @efb
    public static ub4 bind(@efb View rootView) {
        int i = C2558R.id.tv_sure;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            return new ub4((FrameLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ub4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ub4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_record_hint_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f87365a;
    }
}
