package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class zbh implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f104734a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f104735b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f104736c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f104737d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f104738e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f104739f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f104740m;

    private zbh(@efb LinearLayout rootView, @efb LinearLayout llLanguage, @efb TextView tvCurrentLanguage, @efb TextView tvSourceLanguage, @efb TextView tvSourceText, @efb TextView tvTransLanguage, @efb TextView tvTransText) {
        this.f104734a = rootView;
        this.f104735b = llLanguage;
        this.f104736c = tvCurrentLanguage;
        this.f104737d = tvSourceLanguage;
        this.f104738e = tvSourceText;
        this.f104739f = tvTransLanguage;
        this.f104740m = tvTransText;
    }

    @efb
    public static zbh bind(@efb View rootView) {
        int i = C4035R.id.ll_language;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C4035R.id.tv_current_language;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C4035R.id.tv_source_language;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = C4035R.id.tv_source_text;
                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = C4035R.id.tv_trans_language;
                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            i = C4035R.id.tv_trans_text;
                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView5 != null) {
                                return new zbh((LinearLayout) rootView, linearLayout, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static zbh inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static zbh inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_machine_record_detail_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f104734a;
    }
}
