package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class db4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final CardView f29179a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f29180b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f29181c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f29182d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f29183e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f29184f;

    private db4(@efb CardView rootView, @efb LinearLayout dialogInputTextContainerLayout, @efb LinearLayout dialogInputTextEditLayout, @efb LinearLayout dialogInputTextMainLayout, @efb TextView dialogInputTextTipTv, @efb TextView dialogInputTextTitleTv) {
        this.f29179a = rootView;
        this.f29180b = dialogInputTextContainerLayout;
        this.f29181c = dialogInputTextEditLayout;
        this.f29182d = dialogInputTextMainLayout;
        this.f29183e = dialogInputTextTipTv;
        this.f29184f = dialogInputTextTitleTv;
    }

    @efb
    public static db4 bind(@efb View rootView) {
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
                            return new db4((CardView) rootView, linearLayout, linearLayout2, linearLayout3, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static db4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static db4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_local_permission, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public CardView getRoot() {
        return this.f29179a;
    }
}
