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
public final class fc4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f36073C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f36074F;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f36075a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f36076b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f36077c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f36078d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f36079e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f36080f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f36081m;

    private fc4(@efb ConstraintLayout rootView, @efb EditText etTitle, @efb ImageView ivBar, @efb ImageView ivDelete, @efb RelativeLayout rlTitle, @efb TextView tvCancel, @efb TextView tvSave, @efb TextView tvSure, @efb TextView tvTitle) {
        this.f36075a = rootView;
        this.f36076b = etTitle;
        this.f36077c = ivBar;
        this.f36078d = ivDelete;
        this.f36079e = rlTitle;
        this.f36080f = tvCancel;
        this.f36081m = tvSave;
        this.f36073C = tvSure;
        this.f36074F = tvTitle;
    }

    @efb
    public static fc4 bind(@efb View rootView) {
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
                            i = C4035R.id.tv_save;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = C4035R.id.tv_sure;
                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    i = C4035R.id.tv_title;
                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView4 != null) {
                                        return new fc4((ConstraintLayout) rootView, editText, imageView, imageView2, relativeLayout, textView, textView2, textView3, textView4);
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
    public static fc4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static fc4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.dialog_record_title, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f36075a;
    }
}
