package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class ja4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final View f50065C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f50066F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f50067H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f50068L;

    /* JADX INFO: renamed from: a */
    @efb
    public final CardView f50069a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f50070b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f50071c;

    /* JADX INFO: renamed from: d */
    @efb
    public final View f50072d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f50073e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f50074f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f50075m;

    private ja4(@efb CardView rootView, @efb LinearLayout dialogInputTextContainerLayout, @efb LinearLayout dialogInputTextEditLayout, @efb View dialogInputTextHorizontalDivide, @efb LinearLayout dialogInputTextMainLayout, @efb TextView dialogInputTextTipTv, @efb TextView dialogInputTextTitleTv, @efb View dialogInputTextVerticalDivide, @efb LinearLayout dialogTextBottomLayout, @efb TextView dialogTextLeftTv, @efb TextView dialogTextRightTv) {
        this.f50069a = rootView;
        this.f50070b = dialogInputTextContainerLayout;
        this.f50071c = dialogInputTextEditLayout;
        this.f50072d = dialogInputTextHorizontalDivide;
        this.f50073e = dialogInputTextMainLayout;
        this.f50074f = dialogInputTextTipTv;
        this.f50075m = dialogInputTextTitleTv;
        this.f50065C = dialogInputTextVerticalDivide;
        this.f50066F = dialogTextBottomLayout;
        this.f50067H = dialogTextLeftTv;
        this.f50068L = dialogTextRightTv;
    }

    @efb
    public static ja4 bind(@efb View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C2558R.id.dialog_input_text_container_layout;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.dialog_input_text_edit_layout;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.dialog_input_text_horizontal_divide))) != null) {
                i = C2558R.id.dialog_input_text_main_layout;
                LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout3 != null) {
                    i = C2558R.id.dialog_input_text_tip_tv;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2558R.id.dialog_input_text_title_tv;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null && (viewFindChildViewById2 = l8i.findChildViewById(rootView, (i = C2558R.id.dialog_input_text_vertical_divide))) != null) {
                            i = C2558R.id.dialog_text_bottom_layout;
                            LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout4 != null) {
                                i = C2558R.id.dialog_text_left_tv;
                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    i = C2558R.id.dialog_text_right_tv;
                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView4 != null) {
                                        return new ja4((CardView) rootView, linearLayout, linearLayout2, viewFindChildViewById, linearLayout3, textView, textView2, viewFindChildViewById2, linearLayout4, textView3, textView4);
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
    public static ja4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ja4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_binding_device, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public CardView getRoot() {
        return this.f50069a;
    }
}
