package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class dh4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f29635C;

    /* JADX INFO: renamed from: F */
    @efb
    public final View f29636F;

    /* JADX INFO: renamed from: H */
    @efb
    public final View f29637H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f29638L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ProgressBar f29639M;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f29640a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f29641b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f29642c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f29643d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f29644e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f29645f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f29646m;

    private dh4(@efb LinearLayout rootView, @efb LinearLayout contentParent, @efb RelativeLayout dialogContentContainer, @efb TextView dialogLeftBtn, @efb TextView dialogMessage, @efb LinearLayout dialogNotifyLl, @efb TextView dialogRightBtn, @efb TextView dialogTitle, @efb View dividerId, @efb View lineId, @efb LinearLayout llDialogContainer, @efb ProgressBar progressBar) {
        this.f29640a = rootView;
        this.f29641b = contentParent;
        this.f29642c = dialogContentContainer;
        this.f29643d = dialogLeftBtn;
        this.f29644e = dialogMessage;
        this.f29645f = dialogNotifyLl;
        this.f29646m = dialogRightBtn;
        this.f29635C = dialogTitle;
        this.f29636F = dividerId;
        this.f29637H = lineId;
        this.f29638L = llDialogContainer;
        this.f29639M = progressBar;
    }

    @efb
    public static dh4 bind(@efb View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C4035R.id.content_parent;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C4035R.id.dialog_content_container;
            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = C4035R.id.dialog_left_btn;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C4035R.id.dialog_message;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = C4035R.id.dialog_notify_ll;
                        LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout2 != null) {
                            i = C4035R.id.dialog_right_btn;
                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                i = C4035R.id.dialog_title;
                                TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView4 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C4035R.id.divider_id))) != null && (viewFindChildViewById2 = l8i.findChildViewById(rootView, (i = C4035R.id.line_id))) != null) {
                                    i = C4035R.id.ll_dialog_container;
                                    LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout3 != null) {
                                        i = C4035R.id.progressBar;
                                        ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
                                        if (progressBar != null) {
                                            return new dh4((LinearLayout) rootView, linearLayout, relativeLayout, textView, textView2, linearLayout2, textView3, textView4, viewFindChildViewById, viewFindChildViewById2, linearLayout3, progressBar);
                                        }
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
    public static dh4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static dh4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.dlg_easy_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f29640a;
    }
}
