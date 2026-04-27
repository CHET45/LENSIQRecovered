package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class ba4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final View f13115C;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f13116a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f13117b;

    /* JADX INFO: renamed from: c */
    @efb
    public final View f13118c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f13119d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f13120e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f13121f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f13122m;

    private ba4(@efb LinearLayout linearLayout, @efb LinearLayout linearLayout2, @efb View view, @efb TextView textView, @efb LinearLayout linearLayout3, @efb TextView textView2, @efb TextView textView3, @efb View view2) {
        this.f13116a = linearLayout;
        this.f13117b = linearLayout2;
        this.f13118c = view;
        this.f13119d = textView;
        this.f13120e = linearLayout3;
        this.f13121f = textView2;
        this.f13122m = textView3;
        this.f13115C = view2;
    }

    @efb
    public static ba4 bind(@efb View view) {
        View viewFindViewById;
        View viewFindViewById2;
        int i = C4297R.id.dialog_clear_text_bottom_layout;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null && (viewFindViewById = view.findViewById((i = C4297R.id.dialog_clear_text_horizontal_divide))) != null) {
            i = C4297R.id.dialog_clear_text_left_tv;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C4297R.id.dialog_clear_text_main_layout;
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                if (linearLayout2 != null) {
                    i = C4297R.id.dialog_clear_text_right_tv;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = C4297R.id.dialog_clear_text_tip_tv;
                        TextView textView3 = (TextView) view.findViewById(i);
                        if (textView3 != null && (viewFindViewById2 = view.findViewById((i = C4297R.id.dialog_clear_text_vertical_divide))) != null) {
                            return new ba4((LinearLayout) view, linearLayout, viewFindViewById, textView, linearLayout2, textView2, textView3, viewFindViewById2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static ba4 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static ba4 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.dialog_ai_voice_note_common, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f13116a;
    }
}
