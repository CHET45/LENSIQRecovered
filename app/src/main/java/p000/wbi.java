package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class wbi implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f93916a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f93917b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f93918c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f93919d;

    private wbi(@efb ConstraintLayout rootView, @efb TextView tvTopbarLeft, @efb TextView tvTopbarRight, @efb TextView tvTopbarTitle) {
        this.f93916a = rootView;
        this.f93917b = tvTopbarLeft;
        this.f93918c = tvTopbarRight;
        this.f93919d = tvTopbarTitle;
    }

    @efb
    public static wbi bind(@efb View rootView) {
        int i = C2531R.id.tv_topbar_left;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2531R.id.tv_topbar_right;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2531R.id.tv_topbar_title;
                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView3 != null) {
                    return new wbi((ConstraintLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static wbi inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static wbi inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.view_topbar, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f93916a;
    }
}
