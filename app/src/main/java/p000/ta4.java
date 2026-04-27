package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class ta4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ProgressBar f84072C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f84073F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f84074H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f84075L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f84076M;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f84077a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f84078b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f84079c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f84080d;

    /* JADX INFO: renamed from: e */
    @efb
    public final View f84081e;

    /* JADX INFO: renamed from: f */
    @efb
    public final View f84082f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f84083m;

    private ta4(@efb LinearLayout linearLayout, @efb LinearLayout linearLayout2, @efb RelativeLayout relativeLayout, @efb LinearLayout linearLayout3, @efb View view, @efb View view2, @efb LinearLayout linearLayout4, @efb ProgressBar progressBar, @efb TextView textView, @efb TextView textView2, @efb TextView textView3, @efb TextView textView4) {
        this.f84077a = linearLayout;
        this.f84078b = linearLayout2;
        this.f84079c = relativeLayout;
        this.f84080d = linearLayout3;
        this.f84081e = view;
        this.f84082f = view2;
        this.f84083m = linearLayout4;
        this.f84072C = progressBar;
        this.f84073F = textView;
        this.f84074H = textView2;
        this.f84075L = textView3;
        this.f84076M = textView4;
    }

    @efb
    public static ta4 bind(@efb View view) {
        View viewFindViewById;
        View viewFindViewById2;
        int i = C4297R.id.content_parent;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            i = C4297R.id.dialog_content_container;
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
            if (relativeLayout != null) {
                i = C4297R.id.dialog_notify_ll;
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                if (linearLayout2 != null && (viewFindViewById = view.findViewById((i = C4297R.id.divider_id))) != null && (viewFindViewById2 = view.findViewById((i = C4297R.id.line_id))) != null) {
                    i = C4297R.id.ll_dialog_container;
                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                    if (linearLayout3 != null) {
                        i = C4297R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                        if (progressBar != null) {
                            i = C4297R.id.tv_content;
                            TextView textView = (TextView) view.findViewById(i);
                            if (textView != null) {
                                i = C4297R.id.tv_left;
                                TextView textView2 = (TextView) view.findViewById(i);
                                if (textView2 != null) {
                                    i = C4297R.id.tv_right;
                                    TextView textView3 = (TextView) view.findViewById(i);
                                    if (textView3 != null) {
                                        i = C4297R.id.tv_title;
                                        TextView textView4 = (TextView) view.findViewById(i);
                                        if (textView4 != null) {
                                            return new ta4((LinearLayout) view, linearLayout, relativeLayout, linearLayout2, viewFindViewById, viewFindViewById2, linearLayout3, progressBar, textView, textView2, textView3, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static ta4 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static ta4 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.dialog_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f84077a;
    }
}
