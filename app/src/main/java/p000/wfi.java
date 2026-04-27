package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class wfi implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f94124C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f94125F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f94126H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f94127L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f94128M;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f94129a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RelativeLayout f94130b;

    /* JADX INFO: renamed from: c */
    @efb
    public final EditText f94131c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f94132d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f94133e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f94134f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f94135m;

    private wfi(@efb ConstraintLayout rootView, @efb RelativeLayout btnLanguage, @efb EditText etTitle, @efb ImageView ivBar, @efb ImageView ivDelete, @efb ImageView ivLanguageNext, @efb RelativeLayout rlTitle, @efb TextView tvCancel, @efb TextView tvLanguage, @efb TextView tvLanguageTitle, @efb TextView tvSure, @efb TextView tvTitle) {
        this.f94129a = rootView;
        this.f94130b = btnLanguage;
        this.f94131c = etTitle;
        this.f94132d = ivBar;
        this.f94133e = ivDelete;
        this.f94134f = ivLanguageNext;
        this.f94135m = rlTitle;
        this.f94124C = tvCancel;
        this.f94125F = tvLanguage;
        this.f94126H = tvLanguageTitle;
        this.f94127L = tvSure;
        this.f94128M = tvTitle;
    }

    @efb
    public static wfi bind(@efb View rootView) {
        int i = C2531R.id.btn_language;
        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
        if (relativeLayout != null) {
            i = C2531R.id.et_title;
            EditText editText = (EditText) l8i.findChildViewById(rootView, i);
            if (editText != null) {
                i = C2531R.id.iv_bar;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2531R.id.iv_delete;
                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = C2531R.id.iv_language_next;
                        ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView3 != null) {
                            i = C2531R.id.rl_title;
                            RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                            if (relativeLayout2 != null) {
                                i = C2531R.id.tv_cancel;
                                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView != null) {
                                    i = C2531R.id.tv_language;
                                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView2 != null) {
                                        i = C2531R.id.tv_language_title;
                                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView3 != null) {
                                            i = C2531R.id.tv_sure;
                                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView4 != null) {
                                                i = C2531R.id.tv_title;
                                                TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView5 != null) {
                                                    return new wfi((ConstraintLayout) rootView, relativeLayout, editText, imageView, imageView2, imageView3, relativeLayout2, textView, textView2, textView3, textView4, textView5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static wfi inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static wfi inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.voice_notes_start_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f94129a;
    }
}
