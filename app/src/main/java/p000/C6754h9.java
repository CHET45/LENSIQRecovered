package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: renamed from: h9 */
/* JADX INFO: loaded from: classes7.dex */
public final class C6754h9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f42932C;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f42933a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f42934b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Button f42935c;

    /* JADX INFO: renamed from: d */
    @efb
    public final Button f42936d;

    /* JADX INFO: renamed from: e */
    @efb
    public final FrameLayout f42937e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f42938f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f42939m;

    private C6754h9(@efb RelativeLayout relativeLayout, @efb Button button, @efb Button button2, @efb Button button3, @efb FrameLayout frameLayout, @efb LinearLayout linearLayout, @efb RelativeLayout relativeLayout2, @efb TextView textView) {
        this.f42933a = relativeLayout;
        this.f42934b = button;
        this.f42935c = button2;
        this.f42936d = button3;
        this.f42937e = frameLayout;
        this.f42938f = linearLayout;
        this.f42939m = relativeLayout2;
        this.f42932C = textView;
    }

    @efb
    public static C6754h9 bind(@efb View view) {
        int i = C4297R.id.btn_ai_voice_note;
        Button button = (Button) view.findViewById(i);
        if (button != null) {
            i = C4297R.id.btn_voice_note;
            Button button2 = (Button) view.findViewById(i);
            if (button2 != null) {
                i = C4297R.id.btn_voice_note_ch;
                Button button3 = (Button) view.findViewById(i);
                if (button3 != null) {
                    i = C4297R.id.fr_back;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                    if (frameLayout != null) {
                        i = C4297R.id.ll_content;
                        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                        if (linearLayout != null) {
                            i = C4297R.id.rl_title;
                            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                            if (relativeLayout != null) {
                                i = C4297R.id.tv_title;
                                TextView textView = (TextView) view.findViewById(i);
                                if (textView != null) {
                                    return new C6754h9((RelativeLayout) view, button, button2, button3, frameLayout, linearLayout, relativeLayout, textView);
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
    public static C6754h9 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C6754h9 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_ai_voice_note_test, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f42933a;
    }
}
