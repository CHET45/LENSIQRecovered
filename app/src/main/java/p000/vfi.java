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
public final class vfi implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f91019C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f91020F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f91021H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f91022L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f91023M;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f91024a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RelativeLayout f91025b;

    /* JADX INFO: renamed from: c */
    @efb
    public final EditText f91026c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f91027d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f91028e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f91029f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f91030m;

    private vfi(@efb ConstraintLayout constraintLayout, @efb RelativeLayout relativeLayout, @efb EditText editText, @efb ImageView imageView, @efb ImageView imageView2, @efb ImageView imageView3, @efb RelativeLayout relativeLayout2, @efb TextView textView, @efb TextView textView2, @efb TextView textView3, @efb TextView textView4, @efb TextView textView5) {
        this.f91024a = constraintLayout;
        this.f91025b = relativeLayout;
        this.f91026c = editText;
        this.f91027d = imageView;
        this.f91028e = imageView2;
        this.f91029f = imageView3;
        this.f91030m = relativeLayout2;
        this.f91019C = textView;
        this.f91020F = textView2;
        this.f91021H = textView3;
        this.f91022L = textView4;
        this.f91023M = textView5;
    }

    @efb
    public static vfi bind(@efb View view) {
        int i = C4297R.id.btn_language;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
        if (relativeLayout != null) {
            i = C4297R.id.et_title;
            EditText editText = (EditText) view.findViewById(i);
            if (editText != null) {
                i = C4297R.id.iv_bar;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = C4297R.id.iv_delete;
                    ImageView imageView2 = (ImageView) view.findViewById(i);
                    if (imageView2 != null) {
                        i = C4297R.id.iv_language_next;
                        ImageView imageView3 = (ImageView) view.findViewById(i);
                        if (imageView3 != null) {
                            i = C4297R.id.rl_title;
                            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                            if (relativeLayout2 != null) {
                                i = C4297R.id.tv_cancel;
                                TextView textView = (TextView) view.findViewById(i);
                                if (textView != null) {
                                    i = C4297R.id.tv_language;
                                    TextView textView2 = (TextView) view.findViewById(i);
                                    if (textView2 != null) {
                                        i = C4297R.id.tv_language_title;
                                        TextView textView3 = (TextView) view.findViewById(i);
                                        if (textView3 != null) {
                                            i = C4297R.id.tv_sure;
                                            TextView textView4 = (TextView) view.findViewById(i);
                                            if (textView4 != null) {
                                                i = C4297R.id.tv_title;
                                                TextView textView5 = (TextView) view.findViewById(i);
                                                if (textView5 != null) {
                                                    return new vfi((ConstraintLayout) view, relativeLayout, editText, imageView, imageView2, imageView3, relativeLayout2, textView, textView2, textView3, textView4, textView5);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static vfi inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static vfi inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.voice_notes_start_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f91024a;
    }
}
