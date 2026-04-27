package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class sa4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ProgressBar f81029C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f81030F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f81031H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f81032L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f81033M;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f81034a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f81035b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f81036c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f81037d;

    /* JADX INFO: renamed from: e */
    @efb
    public final View f81038e;

    /* JADX INFO: renamed from: f */
    @efb
    public final View f81039f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f81040m;

    private sa4(@efb LinearLayout rootView, @efb LinearLayout contentParent, @efb RelativeLayout dialogContentContainer, @efb LinearLayout dialogNotifyLl, @efb View dividerId, @efb View lineId, @efb LinearLayout llDialogContainer, @efb ProgressBar progressBar, @efb TextView tvContent, @efb TextView tvLeft, @efb TextView tvRight, @efb TextView tvTitle) {
        this.f81034a = rootView;
        this.f81035b = contentParent;
        this.f81036c = dialogContentContainer;
        this.f81037d = dialogNotifyLl;
        this.f81038e = dividerId;
        this.f81039f = lineId;
        this.f81040m = llDialogContainer;
        this.f81029C = progressBar;
        this.f81030F = tvContent;
        this.f81031H = tvLeft;
        this.f81032L = tvRight;
        this.f81033M = tvTitle;
    }

    @efb
    public static sa4 bind(@efb View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C2558R.id.content_parent;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.dialog_content_container;
            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = C2558R.id.dialog_notify_ll;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.divider_id))) != null && (viewFindChildViewById2 = l8i.findChildViewById(rootView, (i = C2558R.id.line_id))) != null) {
                    i = C2558R.id.ll_dialog_container;
                    LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout3 != null) {
                        i = C2558R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
                        if (progressBar != null) {
                            i = C2558R.id.tv_content;
                            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView != null) {
                                i = C2558R.id.tv_left;
                                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView2 != null) {
                                    i = C2558R.id.tv_right;
                                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView3 != null) {
                                        i = C2558R.id.tv_title;
                                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView4 != null) {
                                            return new sa4((LinearLayout) rootView, linearLayout, relativeLayout, linearLayout2, viewFindChildViewById, viewFindChildViewById2, linearLayout3, progressBar, textView, textView2, textView3, textView4);
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
    public static sa4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static sa4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_container, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f81034a;
    }
}
