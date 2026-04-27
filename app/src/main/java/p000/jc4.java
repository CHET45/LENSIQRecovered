package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class jc4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f50286a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f50287b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f50288c;

    private jc4(@efb LinearLayout rootView, @efb RecyclerView rvSettingList, @efb TextView tvTitle) {
        this.f50286a = rootView;
        this.f50287b = rvSettingList;
        this.f50288c = tvTitle;
    }

    @efb
    public static jc4 bind(@efb View rootView) {
        int i = C2558R.id.rv_setting_list;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C2558R.id.tv_title;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                return new jc4((LinearLayout) rootView, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static jc4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static jc4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_video_setting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f50286a;
    }
}
