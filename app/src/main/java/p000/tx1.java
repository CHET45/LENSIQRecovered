package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class tx1 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f86239C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f86240F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f86241H;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f86242a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f86243b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f86244c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f86245d;

    /* JADX INFO: renamed from: e */
    @efb
    public final View f86246e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f86247f;

    /* JADX INFO: renamed from: m */
    @efb
    public final View f86248m;

    private tx1(@efb LinearLayout rootView, @efb LinearLayout dialogClearTextBottomLayout, @efb LinearLayout dialogClearTextContainerLayout, @efb LinearLayout dialogClearTextEditLayout, @efb View dialogClearTextHorizontalDivide, @efb LinearLayout dialogClearTextMainLayout, @efb View dialogClearTextVerticalDivide, @efb TextView dialogLeftTv, @efb TextView dialogRightTv, @efb TextView dialogTipTv) {
        this.f86242a = rootView;
        this.f86243b = dialogClearTextBottomLayout;
        this.f86244c = dialogClearTextContainerLayout;
        this.f86245d = dialogClearTextEditLayout;
        this.f86246e = dialogClearTextHorizontalDivide;
        this.f86247f = dialogClearTextMainLayout;
        this.f86248m = dialogClearTextVerticalDivide;
        this.f86239C = dialogLeftTv;
        this.f86240F = dialogRightTv;
        this.f86241H = dialogTipTv;
    }

    @efb
    public static tx1 bind(@efb View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C2531R.id.dialog_clear_text_bottom_layout;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2531R.id.dialog_clear_text_container_layout;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = C2531R.id.dialog_clear_text_edit_layout;
                LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout3 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2531R.id.dialog_clear_text_horizontal_divide))) != null) {
                    i = C2531R.id.dialog_clear_text_main_layout;
                    LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout4 != null && (viewFindChildViewById2 = l8i.findChildViewById(rootView, (i = C2531R.id.dialog_clear_text_vertical_divide))) != null) {
                        i = C2531R.id.dialog_left_tv;
                        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = C2531R.id.dialog_right_tv;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = C2531R.id.dialog_tip_tv;
                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    return new tx1((LinearLayout) rootView, linearLayout, linearLayout2, linearLayout3, viewFindChildViewById, linearLayout4, viewFindChildViewById2, textView, textView2, textView3);
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
    public static tx1 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static tx1 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.check_device_name_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f86242a;
    }
}
