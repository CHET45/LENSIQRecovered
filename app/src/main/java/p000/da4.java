package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class da4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f28904a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ProgressBar f28905b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f28906c;

    private da4(@efb RelativeLayout relativeLayout, @efb ProgressBar progressBar, @efb TextView textView) {
        this.f28904a = relativeLayout;
        this.f28905b = progressBar;
        this.f28906c = textView;
    }

    @efb
    public static da4 bind(@efb View view) {
        int i = C4297R.id.progressbar_loading;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            i = C4297R.id.tv_tips;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                return new da4((RelativeLayout) view, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static da4 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static da4 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.dialog_ai_voice_note_custom_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f28904a;
    }
}
