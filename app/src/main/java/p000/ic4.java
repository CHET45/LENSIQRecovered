package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class ic4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f46479a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f46480b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f46481c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f46482d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f46483e;

    private ic4(@efb RelativeLayout rootView, @efb TextView tvCancel, @efb TextView tvContent, @efb TextView tvSubmit, @efb TextView tvTitle) {
        this.f46479a = rootView;
        this.f46480b = tvCancel;
        this.f46481c = tvContent;
        this.f46482d = tvSubmit;
        this.f46483e = tvTitle;
    }

    @efb
    public static ic4 bind(@efb View rootView) {
        int i = C2531R.id.tv_cancel;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2531R.id.tv_content;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2531R.id.tv_submit;
                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = C2531R.id.tv_title;
                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView4 != null) {
                        return new ic4((RelativeLayout) rootView, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ic4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ic4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_text_tips, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f46479a;
    }
}
