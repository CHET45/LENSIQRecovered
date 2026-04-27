package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class ha4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f42996a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f42997b;

    private ha4(@efb LinearLayout rootView, @efb RecyclerView rvRepeatSetting) {
        this.f42996a = rootView;
        this.f42997b = rvRepeatSetting;
    }

    @efb
    public static ha4 bind(@efb View rootView) {
        int i = C2558R.id.rv_repeat_setting;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            return new ha4((LinearLayout) rootView, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ha4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ha4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_alarm_repeat_setting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f42996a;
    }
}
