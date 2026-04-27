package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class vbi implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f90570a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f90571b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f90572c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f90573d;

    private vbi(@efb ConstraintLayout rootView, @efb TextView tvTopbarLeft, @efb TextView tvTopbarRight, @efb TextView tvTopbarTitle) {
        this.f90570a = rootView;
        this.f90571b = tvTopbarLeft;
        this.f90572c = tvTopbarRight;
        this.f90573d = tvTopbarTitle;
    }

    @efb
    public static vbi bind(@efb View rootView) {
        int i = C2558R.id.tv_topbar_left;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.tv_topbar_right;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.tv_topbar_title;
                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView3 != null) {
                    return new vbi((ConstraintLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static vbi inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static vbi inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.view_topbar, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f90570a;
    }
}
