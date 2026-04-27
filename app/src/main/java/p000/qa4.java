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
public final class qa4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f73733a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f73734b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f73735c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f73736d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f73737e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f73738f;

    private qa4(@efb FrameLayout rootView, @efb EditText edtTitle, @efb ImageView ivDelete, @efb TextView tvCancel, @efb TextView tvSure, @efb TextView tvTitleTip) {
        this.f73733a = rootView;
        this.f73734b = edtTitle;
        this.f73735c = ivDelete;
        this.f73736d = tvCancel;
        this.f73737e = tvSure;
        this.f73738f = tvTitleTip;
    }

    @efb
    public static qa4 bind(@efb View rootView) {
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
                        i = C2558R.id.tv_title_tip;
                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            return new qa4((FrameLayout) rootView, editText, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static qa4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static qa4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_center_edit_record, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f73733a;
    }
}
