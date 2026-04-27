package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.trans.C4035R;

/* JADX INFO: renamed from: fd */
/* JADX INFO: loaded from: classes6.dex */
public final class C5724fd implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f36152a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f36153b;

    private C5724fd(@efb RelativeLayout rootView, @efb TextView click) {
        this.f36152a = rootView;
        this.f36153b = click;
    }

    @efb
    public static C5724fd bind(@efb View rootView) {
        int i = C4035R.id.click;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            return new C5724fd((RelativeLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C5724fd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C5724fd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_test, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f36152a;
    }
}
