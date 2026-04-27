package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class cee implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f16387C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f16388F;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f16389a;

    /* JADX INFO: renamed from: b */
    @efb
    public final View f16390b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f16391c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f16392d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f16393e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f16394f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f16395m;

    private cee(@efb ConstraintLayout rootView, @efb View divider, @efb LinearLayout llLeft, @efb LinearLayout llRight, @efb TextView tvName, @efb TextView tvProgress, @efb TextView tvRedownload, @efb TextView tvSize, @efb TextView tvStatus) {
        this.f16389a = rootView;
        this.f16390b = divider;
        this.f16391c = llLeft;
        this.f16392d = llRight;
        this.f16393e = tvName;
        this.f16394f = tvProgress;
        this.f16395m = tvRedownload;
        this.f16387C = tvSize;
        this.f16388F = tvStatus;
    }

    @efb
    public static cee bind(@efb View rootView) {
        int i = C4035R.id.divider;
        View viewFindChildViewById = l8i.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            i = C4035R.id.ll_left;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C4035R.id.ll_right;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null) {
                    i = C4035R.id.tv_name;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C4035R.id.tv_progress;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C4035R.id.tv_redownload;
                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                i = C4035R.id.tv_size;
                                TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView4 != null) {
                                    i = C4035R.id.tv_status;
                                    TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView5 != null) {
                                        return new cee((ConstraintLayout) rootView, viewFindChildViewById, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static cee inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static cee inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.rv_language_download, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f16389a;
    }
}
