package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class sf8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f81656a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f81657b;

    private sf8(@efb LinearLayout rootView, @efb TextView tvAlarmDate) {
        this.f81656a = rootView;
        this.f81657b = tvAlarmDate;
    }

    @efb
    public static sf8 bind(@efb View rootView) {
        int i = C2558R.id.tv_alarm_date;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            return new sf8((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static sf8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static sf8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_alarm_date_hear, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f81656a;
    }
}
