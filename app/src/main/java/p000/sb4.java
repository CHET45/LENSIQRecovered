package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class sb4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f81108a;

    /* JADX INFO: renamed from: b */
    @efb
    public final View f81109b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f81110c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f81111d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f81112e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f81113f;

    private sb4(@efb FrameLayout frameLayout, @efb View view, @efb LinearLayout linearLayout, @efb TextView textView, @efb TextView textView2, @efb TextView textView3) {
        this.f81108a = frameLayout;
        this.f81109b = view;
        this.f81110c = linearLayout;
        this.f81111d = textView;
        this.f81112e = textView2;
        this.f81113f = textView3;
    }

    @efb
    public static sb4 bind(@efb View view) {
        int i = C4297R.id.dialog_clear_text_vertical_divide;
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            i = C4297R.id.dialog_text_bottom_layout;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = C4297R.id.tv_cancel;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = C4297R.id.tv_record_title;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = C4297R.id.tv_sure;
                        TextView textView3 = (TextView) view.findViewById(i);
                        if (textView3 != null) {
                            return new sb4((FrameLayout) view, viewFindViewById, linearLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static sb4 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static sb4 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.dialog_record2_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f81108a;
    }
}
