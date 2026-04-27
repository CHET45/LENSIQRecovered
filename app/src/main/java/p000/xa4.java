package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class xa4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f97345a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f97346b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f97347c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f97348d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f97349e;

    private xa4(@efb FrameLayout rootView, @efb EditText edtTitle, @efb ImageView ivDelete, @efb TextView tvCancel, @efb TextView tvSure) {
        this.f97345a = rootView;
        this.f97346b = edtTitle;
        this.f97347c = ivDelete;
        this.f97348d = tvCancel;
        this.f97349e = tvSure;
    }

    @efb
    public static xa4 bind(@efb View rootView) {
        int i = C2558R.id.edt_title;
        EditText editText = (EditText) l8i.findChildViewById(rootView, i);
        if (editText != null) {
            i = C2558R.id.iv_delete;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2558R.id.tv_cancel;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.tv_sure;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        return new xa4((FrameLayout) rootView, editText, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static xa4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static xa4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_edit_record_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f97345a;
    }
}
