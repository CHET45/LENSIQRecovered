package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class fb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f36002a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f36003b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f36004c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f36005d;

    private fb4(@efb FrameLayout rootView, @efb TextView tvCancel, @efb TextView tvDelete, @efb TextView tvEdit) {
        this.f36002a = rootView;
        this.f36003b = tvCancel;
        this.f36004c = tvDelete;
        this.f36005d = tvEdit;
    }

    @efb
    public static fb4 bind(@efb View rootView) {
        int i = C2558R.id.tvCancel;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.tv_delete;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.tv_edit;
                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView3 != null) {
                    return new fb4((FrameLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static fb4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static fb4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_main_menu, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f36002a;
    }
}
