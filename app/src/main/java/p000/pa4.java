package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class pa4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f70145a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f70146b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f70147c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f70148d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f70149e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f70150f;

    private pa4(@efb FrameLayout frameLayout, @efb EditText editText, @efb ImageView imageView, @efb TextView textView, @efb TextView textView2, @efb TextView textView3) {
        this.f70145a = frameLayout;
        this.f70146b = editText;
        this.f70147c = imageView;
        this.f70148d = textView;
        this.f70149e = textView2;
        this.f70150f = textView3;
    }

    @efb
    public static pa4 bind(@efb View view) {
        int i = C4297R.id.edt_title;
        EditText editText = (EditText) view.findViewById(i);
        if (editText != null) {
            i = C4297R.id.iv_delete;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = C4297R.id.tv_cancel;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = C4297R.id.tv_sure;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = C4297R.id.tv_title_tip;
                        TextView textView3 = (TextView) view.findViewById(i);
                        if (textView3 != null) {
                            return new pa4((FrameLayout) view, editText, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static pa4 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static pa4 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.dialog_center_edit_record, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f70145a;
    }
}
