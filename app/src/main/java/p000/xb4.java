package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class xb4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f97408C;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f97409a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f97410b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f97411c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f97412d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f97413e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f97414f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f97415m;

    private xb4(@efb ConstraintLayout rootView, @efb EditText etTitle, @efb ImageView ivBar, @efb ImageView ivDelete, @efb RelativeLayout rlTitle, @efb TextView tvCancel, @efb TextView tvLanguageTitle, @efb TextView tvSure) {
        this.f97409a = rootView;
        this.f97410b = etTitle;
        this.f97411c = ivBar;
        this.f97412d = ivDelete;
        this.f97413e = rlTitle;
        this.f97414f = tvCancel;
        this.f97415m = tvLanguageTitle;
        this.f97408C = tvSure;
    }

    @efb
    public static xb4 bind(@efb View rootView) {
        int i = C4035R.id.et_title;
        EditText editText = (EditText) l8i.findChildViewById(rootView, i);
        if (editText != null) {
            i = C4035R.id.iv_bar;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C4035R.id.iv_delete;
                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = C4035R.id.rl_title;
                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                    if (relativeLayout != null) {
                        i = C4035R.id.tv_cancel;
                        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = C4035R.id.tv_language_title;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = C4035R.id.tv_sure;
                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    return new xb4((ConstraintLayout) rootView, editText, imageView, imageView2, relativeLayout, textView, textView2, textView3);
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
    public static xb4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static xb4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.dialog_record_rename, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f97409a;
    }
}
