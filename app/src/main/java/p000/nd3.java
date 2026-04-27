package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class nd3 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f64022a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f64023b;

    private nd3(@efb LinearLayout rootView, @efb TextView tabText) {
        this.f64022a = rootView;
        this.f64023b = tabText;
    }

    @efb
    public static nd3 bind(@efb View rootView) {
        int i = C2558R.id.tab_text;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            return new nd3((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static nd3 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static nd3 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.custom_tab, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f64022a;
    }
}
