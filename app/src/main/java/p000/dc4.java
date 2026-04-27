package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class dc4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f29269a;

    /* JADX INFO: renamed from: b */
    @efb
    public final View f29270b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f29271c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f29272d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f29273e;

    private dc4(@efb FrameLayout rootView, @efb View dialogClearTextVerticalDivide, @efb LinearLayout dialogTextBottomLayout, @efb TextView tvCancel, @efb TextView tvSure) {
        this.f29269a = rootView;
        this.f29270b = dialogClearTextVerticalDivide;
        this.f29271c = dialogTextBottomLayout;
        this.f29272d = tvCancel;
        this.f29273e = tvSure;
    }

    @efb
    public static dc4 bind(@efb View rootView) {
        int i = C4035R.id.dialog_clear_text_vertical_divide;
        View viewFindChildViewById = l8i.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            i = C4035R.id.dialog_text_bottom_layout;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C4035R.id.tv_cancel;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C4035R.id.tv_sure;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        return new dc4((FrameLayout) rootView, viewFindChildViewById, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static dc4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static dc4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.dialog_record_stop, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f29269a;
    }
}
