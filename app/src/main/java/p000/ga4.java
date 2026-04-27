package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class ga4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f39121a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f39122b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f39123c;

    private ga4(@efb LinearLayout rootView, @efb TextView btnCopy, @efb TextView btnDelete) {
        this.f39121a = rootView;
        this.f39122b = btnCopy;
        this.f39123c = btnDelete;
    }

    @efb
    public static ga4 bind(@efb View rootView) {
        int i = C2558R.id.btn_copy;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.btn_delete;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                return new ga4((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ga4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ga4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_alarm_more, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f39121a;
    }
}
