package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class xc3 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f97502a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f97503b;

    private xc3(@efb LinearLayout rootView, @efb TextView tabText) {
        this.f97502a = rootView;
        this.f97503b = tabText;
    }

    @efb
    public static xc3 bind(@efb View rootView) {
        int i = C2531R.id.tab_text;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            return new xc3((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static xc3 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static xc3 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.custom_dialog_tab, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f97502a;
    }
}
