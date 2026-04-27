package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class ua4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ProgressBar f87279C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f87280F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f87281H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f87282L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f87283M;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f87284a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f87285b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f87286c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f87287d;

    /* JADX INFO: renamed from: e */
    @efb
    public final View f87288e;

    /* JADX INFO: renamed from: f */
    @efb
    public final View f87289f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f87290m;

    private ua4(@efb LinearLayout rootView, @efb LinearLayout contentParent, @efb RelativeLayout dialogContentContainer, @efb LinearLayout dialogNotifyLl, @efb View dividerId, @efb View lineId, @efb LinearLayout llDialogContainer, @efb ProgressBar progressBar, @efb TextView tvContent, @efb TextView tvLeft, @efb TextView tvRight, @efb TextView tvTitle) {
        this.f87284a = rootView;
        this.f87285b = contentParent;
        this.f87286c = dialogContentContainer;
        this.f87287d = dialogNotifyLl;
        this.f87288e = dividerId;
        this.f87289f = lineId;
        this.f87290m = llDialogContainer;
        this.f87279C = progressBar;
        this.f87280F = tvContent;
        this.f87281H = tvLeft;
        this.f87282L = tvRight;
        this.f87283M = tvTitle;
    }

    @efb
    public static ua4 bind(@efb View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C2531R.id.content_parent;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2531R.id.dialog_content_container;
            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = C2531R.id.dialog_notify_ll;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2531R.id.divider_id))) != null && (viewFindChildViewById2 = l8i.findChildViewById(rootView, (i = C2531R.id.line_id))) != null) {
                    i = C2531R.id.ll_dialog_container;
                    LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout3 != null) {
                        i = C2531R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
                        if (progressBar != null) {
                            i = C2531R.id.tv_content;
                            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView != null) {
                                i = C2531R.id.tv_left;
                                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView2 != null) {
                                    i = C2531R.id.tv_right;
                                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView3 != null) {
                                        i = C2531R.id.tv_title;
                                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView4 != null) {
                                            return new ua4((LinearLayout) rootView, linearLayout, relativeLayout, linearLayout2, viewFindChildViewById, viewFindChildViewById2, linearLayout3, progressBar, textView, textView2, textView3, textView4);
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
    public static ua4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ua4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_container, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f87284a;
    }
}
