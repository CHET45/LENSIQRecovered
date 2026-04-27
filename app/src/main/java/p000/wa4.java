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
public final class wa4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f93801a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f93802b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f93803c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f93804d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f93805e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f93806f;

    private wa4(@efb FrameLayout frameLayout, @efb EditText editText, @efb ImageView imageView, @efb TextView textView, @efb TextView textView2, @efb TextView textView3) {
        this.f93801a = frameLayout;
        this.f93802b = editText;
        this.f93803c = imageView;
        this.f93804d = textView;
        this.f93805e = textView2;
        this.f93806f = textView3;
    }

    @efb
    public static wa4 bind(@efb View view) {
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
                            return new wa4((FrameLayout) view, editText, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static wa4 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static wa4 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.dialog_edit_record_layout2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f93801a;
    }
}
