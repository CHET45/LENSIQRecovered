package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class hb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f43066a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f43067b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f43068c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f43069d;

    private hb4(@efb FrameLayout rootView, @efb TextView tvCancel, @efb TextView tvDelete, @efb TextView tvEdit) {
        this.f43066a = rootView;
        this.f43067b = tvCancel;
        this.f43068c = tvDelete;
        this.f43069d = tvEdit;
    }

    @efb
    public static hb4 bind(@efb View rootView) {
        int i = C2531R.id.tvCancel;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2531R.id.tv_delete;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2531R.id.tv_edit;
                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView3 != null) {
                    return new hb4((FrameLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static hb4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static hb4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_main_menu, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f43066a;
    }
}
