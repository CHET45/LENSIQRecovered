package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.permissionx.guolindev.C3877R;

/* JADX INFO: loaded from: classes6.dex */
public final class vpc implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f91934a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f91935b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Button f91936c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f91937d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f91938e;

    /* JADX INFO: renamed from: f */
    @efb
    public final Button f91939f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f91940m;

    private vpc(@efb LinearLayout linearLayout, @efb TextView textView, @efb Button button, @efb LinearLayout linearLayout2, @efb LinearLayout linearLayout3, @efb Button button2, @efb LinearLayout linearLayout4) {
        this.f91934a = linearLayout;
        this.f91935b = textView;
        this.f91936c = button;
        this.f91937d = linearLayout2;
        this.f91938e = linearLayout3;
        this.f91939f = button2;
        this.f91940m = linearLayout4;
    }

    @efb
    public static vpc bind(@efb View view) {
        int i = C3877R.id.messageText;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C3877R.id.negativeBtn;
            Button button = (Button) view.findViewById(i);
            if (button != null) {
                i = C3877R.id.negativeLayout;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                if (linearLayout != null) {
                    i = C3877R.id.permissionsLayout;
                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                    if (linearLayout2 != null) {
                        i = C3877R.id.positiveBtn;
                        Button button2 = (Button) view.findViewById(i);
                        if (button2 != null) {
                            i = C3877R.id.positiveLayout;
                            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                            if (linearLayout3 != null) {
                                return new vpc((LinearLayout) view, textView, button, linearLayout, linearLayout2, button2, linearLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static vpc inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static vpc inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C3877R.layout.permissionx_default_dialog_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f91934a;
    }
}
