package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class nb4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f63885C;

    /* JADX INFO: renamed from: F */
    @efb
    public final View f63886F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f63887H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f63888L;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f63889a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f63890b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f63891c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f63892d;

    /* JADX INFO: renamed from: e */
    @efb
    public final View f63893e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f63894f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f63895m;

    private nb4(@efb LinearLayout linearLayout, @efb TextView textView, @efb LinearLayout linearLayout2, @efb LinearLayout linearLayout3, @efb View view, @efb LinearLayout linearLayout4, @efb TextView textView2, @efb TextView textView3, @efb View view2, @efb TextView textView4, @efb LinearLayout linearLayout5) {
        this.f63889a = linearLayout;
        this.f63890b = textView;
        this.f63891c = linearLayout2;
        this.f63892d = linearLayout3;
        this.f63893e = view;
        this.f63894f = linearLayout4;
        this.f63895m = textView2;
        this.f63885C = textView3;
        this.f63886F = view2;
        this.f63887H = textView4;
        this.f63888L = linearLayout5;
    }

    @efb
    public static nb4 bind(@efb View view) {
        View viewFindViewById;
        View viewFindViewById2;
        int i = C4297R.id.dialog_allow_text_right_tv;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4297R.id.dialog_clear_text_container_layout;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = C4297R.id.dialog_clear_text_edit_layout;
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                if (linearLayout2 != null && (viewFindViewById = view.findViewById((i = C4297R.id.dialog_clear_text_horizontal_divide))) != null) {
                    i = C4297R.id.dialog_clear_text_main_layout;
                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                    if (linearLayout3 != null) {
                        i = C4297R.id.dialog_clear_text_tip_tv;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = C4297R.id.dialog_clear_text_title_tv;
                            TextView textView3 = (TextView) view.findViewById(i);
                            if (textView3 != null && (viewFindViewById2 = view.findViewById((i = C4297R.id.dialog_clear_text_vertical_divide))) != null) {
                                i = C4297R.id.dialog_refuse_text_left_tv;
                                TextView textView4 = (TextView) view.findViewById(i);
                                if (textView4 != null) {
                                    i = C4297R.id.dialog_text_bottom_layout;
                                    LinearLayout linearLayout4 = (LinearLayout) view.findViewById(i);
                                    if (linearLayout4 != null) {
                                        return new nb4((LinearLayout) view, textView, linearLayout, linearLayout2, viewFindViewById, linearLayout3, textView2, textView3, viewFindViewById2, textView4, linearLayout4);
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
    public static nb4 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static nb4 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.dialog_permission_explanation2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f63889a;
    }
}
