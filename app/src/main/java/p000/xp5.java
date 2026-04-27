package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class xp5 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f98859a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f98860b;

    private xp5(@efb RelativeLayout rootView, @efb TextView title) {
        this.f98859a = rootView;
        this.f98860b = title;
    }

    @efb
    public static xp5 bind(@efb View rootView) {
        int i = C2531R.id.title;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            return new xp5((RelativeLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static xp5 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static xp5 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.feedback_select_list_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f98859a;
    }
}
