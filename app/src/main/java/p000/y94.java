package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class y94 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f100828C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f100829F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f100830H;

    /* JADX INFO: renamed from: L */
    @efb
    public final View f100831L;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f100832a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f100833b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f100834c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f100835d;

    /* JADX INFO: renamed from: e */
    @efb
    public final View f100836e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f100837f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f100838m;

    private y94(@efb LinearLayout rootView, @efb LinearLayout dialogClearTextBottomLayout, @efb LinearLayout dialogClearTextContainerLayout, @efb LinearLayout dialogClearTextEditLayout, @efb View dialogClearTextHorizontalDivide, @efb TextView dialogClearTextLeftTv, @efb LinearLayout dialogClearTextMainLayout, @efb TextView dialogClearTextRightTv, @efb TextView dialogClearTextTipTv, @efb TextView dialogClearTextTitleTv, @efb View dialogClearTextVerticalDivide) {
        this.f100832a = rootView;
        this.f100833b = dialogClearTextBottomLayout;
        this.f100834c = dialogClearTextContainerLayout;
        this.f100835d = dialogClearTextEditLayout;
        this.f100836e = dialogClearTextHorizontalDivide;
        this.f100837f = dialogClearTextLeftTv;
        this.f100838m = dialogClearTextMainLayout;
        this.f100828C = dialogClearTextRightTv;
        this.f100829F = dialogClearTextTipTv;
        this.f100830H = dialogClearTextTitleTv;
        this.f100831L = dialogClearTextVerticalDivide;
    }

    @efb
    public static y94 bind(@efb View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C2558R.id.dialog_clear_text_bottom_layout;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.dialog_clear_text_container_layout;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = C2558R.id.dialog_clear_text_edit_layout;
                LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout3 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.dialog_clear_text_horizontal_divide))) != null) {
                    i = C2558R.id.dialog_clear_text_left_tv;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2558R.id.dialog_clear_text_main_layout;
                        LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout4 != null) {
                            i = C2558R.id.dialog_clear_text_right_tv;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = C2558R.id.dialog_clear_text_tip_tv;
                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    i = C2558R.id.dialog_clear_text_title_tv;
                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView4 != null && (viewFindChildViewById2 = l8i.findChildViewById(rootView, (i = C2558R.id.dialog_clear_text_vertical_divide))) != null) {
                                        return new y94((LinearLayout) rootView, linearLayout, linearLayout2, linearLayout3, viewFindChildViewById, textView, linearLayout4, textView2, textView3, textView4, viewFindChildViewById2);
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
    public static y94 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static y94 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_add_device_tip, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f100832a;
    }
}
