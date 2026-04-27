package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class wb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f93871a;

    /* JADX INFO: renamed from: b */
    @efb
    public final View f93872b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f93873c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f93874d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f93875e;

    private wb4(@efb FrameLayout rootView, @efb View dialogClearTextVerticalDivide, @efb LinearLayout dialogTextBottomLayout, @efb TextView tvCancel, @efb TextView tvSure) {
        this.f93871a = rootView;
        this.f93872b = dialogClearTextVerticalDivide;
        this.f93873c = dialogTextBottomLayout;
        this.f93874d = tvCancel;
        this.f93875e = tvSure;
    }

    @efb
    public static wb4 bind(@efb View rootView) {
        int i = C2558R.id.dialog_clear_text_vertical_divide;
        View viewFindChildViewById = l8i.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            i = C2558R.id.dialog_text_bottom_layout;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C2558R.id.tv_cancel;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.tv_sure;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        return new wb4((FrameLayout) rootView, viewFindChildViewById, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static wb4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static wb4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_record_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f93871a;
    }
}
