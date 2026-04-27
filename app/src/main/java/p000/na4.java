package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class na4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final CardView f63781a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f63782b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f63783c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f63784d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f63785e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f63786f;

    private na4(@efb CardView rootView, @efb LinearLayout dialogInputTextContainerLayout, @efb LinearLayout dialogInputTextEditLayout, @efb LinearLayout dialogInputTextMainLayout, @efb TextView dialogInputTextTipTv, @efb TextView dialogInputTextTitleTv) {
        this.f63781a = rootView;
        this.f63782b = dialogInputTextContainerLayout;
        this.f63783c = dialogInputTextEditLayout;
        this.f63784d = dialogInputTextMainLayout;
        this.f63785e = dialogInputTextTipTv;
        this.f63786f = dialogInputTextTitleTv;
    }

    @efb
    public static na4 bind(@efb View rootView) {
        int i = C2558R.id.dialog_input_text_container_layout;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.dialog_input_text_edit_layout;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = C2558R.id.dialog_input_text_main_layout;
                LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout3 != null) {
                    i = C2558R.id.dialog_input_text_tip_tv;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2558R.id.dialog_input_text_title_tv;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new na4((CardView) rootView, linearLayout, linearLayout2, linearLayout3, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static na4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static na4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_calendar_permission, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public CardView getRoot() {
        return this.f63781a;
    }
}
