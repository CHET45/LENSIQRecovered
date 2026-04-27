package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class kc4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f53575a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f53576b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f53577c;

    /* JADX INFO: renamed from: d */
    @efb
    public final View f53578d;

    private kc4(@efb ConstraintLayout rootView, @efb RecyclerView rvVoiceModeList, @efb TextView tvVoiceModeListSure, @efb View viewVoiceModeListLine) {
        this.f53575a = rootView;
        this.f53576b = rvVoiceModeList;
        this.f53577c = tvVoiceModeListSure;
        this.f53578d = viewVoiceModeListLine;
    }

    @efb
    public static kc4 bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.rv_voice_mode_list;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C2558R.id.tv_voice_mode_list_sure;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.view_voice_mode_list_line))) != null) {
                return new kc4((ConstraintLayout) rootView, recyclerView, textView, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static kc4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static kc4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_voice_mode_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f53575a;
    }
}
