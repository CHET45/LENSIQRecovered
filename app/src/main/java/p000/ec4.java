package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class ec4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f32606a;

    /* JADX INFO: renamed from: b */
    @efb
    public final View f32607b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f32608c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f32609d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f32610e;

    private ec4(@efb FrameLayout frameLayout, @efb View view, @efb LinearLayout linearLayout, @efb TextView textView, @efb TextView textView2) {
        this.f32606a = frameLayout;
        this.f32607b = view;
        this.f32608c = linearLayout;
        this.f32609d = textView;
        this.f32610e = textView2;
    }

    @efb
    public static ec4 bind(@efb View view) {
        int i = C4297R.id.dialog_clear_text_vertical_divide;
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            i = C4297R.id.dialog_text_bottom_layout;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = C4297R.id.tv_cancel;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = C4297R.id.tv_sure;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        return new ec4((FrameLayout) view, viewFindViewById, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static ec4 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static ec4 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.dialog_record_stop_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f32606a;
    }
}
