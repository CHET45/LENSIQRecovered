package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class ma4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final CardView f60330a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f60331b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f60332c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f60333d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f60334e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f60335f;

    private ma4(@efb CardView rootView, @efb LinearLayout dialogInputTextContainerLayout, @efb LinearLayout dialogInputTextEditLayout, @efb LinearLayout dialogInputTextMainLayout, @efb TextView dialogInputTextTipTv, @efb TextView dialogInputTextTitleTv) {
        this.f60330a = rootView;
        this.f60331b = dialogInputTextContainerLayout;
        this.f60332c = dialogInputTextEditLayout;
        this.f60333d = dialogInputTextMainLayout;
        this.f60334e = dialogInputTextTipTv;
        this.f60335f = dialogInputTextTitleTv;
    }

    @efb
    public static ma4 bind(@efb View rootView) {
        int i = C2531R.id.dialog_input_text_container_layout;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2531R.id.dialog_input_text_edit_layout;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = C2531R.id.dialog_input_text_main_layout;
                LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout3 != null) {
                    i = C2531R.id.dialog_input_text_tip_tv;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2531R.id.dialog_input_text_title_tv;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            return new ma4((CardView) rootView, linearLayout, linearLayout2, linearLayout3, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ma4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ma4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_bluetooth_permission, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public CardView getRoot() {
        return this.f60330a;
    }
}
