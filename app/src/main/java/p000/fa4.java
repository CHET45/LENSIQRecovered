package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class fa4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final View f35898C;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f35899a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f35900b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f35901c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f35902d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f35903e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f35904f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f35905m;

    private fa4(@efb LinearLayout rootView, @efb TextView btnCancel, @efb TextView btnDelete, @efb LinearLayout dialogClearTextBottomLayout, @efb LinearLayout dialogClearTextContainerLayout, @efb LinearLayout dialogClearTextMainLayout, @efb TextView dialogClearTextTitleTv, @efb View dialogClearTextVerticalDivide) {
        this.f35899a = rootView;
        this.f35900b = btnCancel;
        this.f35901c = btnDelete;
        this.f35902d = dialogClearTextBottomLayout;
        this.f35903e = dialogClearTextContainerLayout;
        this.f35904f = dialogClearTextMainLayout;
        this.f35905m = dialogClearTextTitleTv;
        this.f35898C = dialogClearTextVerticalDivide;
    }

    @efb
    public static fa4 bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.btn_cancel;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.btn_delete;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.dialog_clear_text_bottom_layout;
                LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = C2558R.id.dialog_clear_text_container_layout;
                    LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout2 != null) {
                        i = C2558R.id.dialog_clear_text_main_layout;
                        LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout3 != null) {
                            i = C2558R.id.dialog_clear_text_title_tv;
                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView3 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.dialog_clear_text_vertical_divide))) != null) {
                                return new fa4((LinearLayout) rootView, textView, textView2, linearLayout, linearLayout2, linearLayout3, textView3, viewFindChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static fa4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static fa4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_alarm_delete, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f35899a;
    }
}
