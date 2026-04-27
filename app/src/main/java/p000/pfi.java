package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class pfi implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f70666C;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f70667a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f70668b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f70669c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f70670d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f70671e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f70672f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f70673m;

    private pfi(@efb ConstraintLayout constraintLayout, @efb EditText editText, @efb ImageView imageView, @efb ImageView imageView2, @efb RelativeLayout relativeLayout, @efb TextView textView, @efb TextView textView2, @efb TextView textView3) {
        this.f70667a = constraintLayout;
        this.f70668b = editText;
        this.f70669c = imageView;
        this.f70670d = imageView2;
        this.f70671e = relativeLayout;
        this.f70672f = textView;
        this.f70673m = textView2;
        this.f70666C = textView3;
    }

    @efb
    public static pfi bind(@efb View view) {
        int i = C4297R.id.et_title;
        EditText editText = (EditText) view.findViewById(i);
        if (editText != null) {
            i = C4297R.id.iv_bar;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = C4297R.id.iv_delete;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = C4297R.id.rl_title;
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                    if (relativeLayout != null) {
                        i = C4297R.id.tv_cancel;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            i = C4297R.id.tv_sure;
                            TextView textView2 = (TextView) view.findViewById(i);
                            if (textView2 != null) {
                                i = C4297R.id.tv_title;
                                TextView textView3 = (TextView) view.findViewById(i);
                                if (textView3 != null) {
                                    return new pfi((ConstraintLayout) view, editText, imageView, imageView2, relativeLayout, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static pfi inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static pfi inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.voice_notes_save_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f70667a;
    }
}
