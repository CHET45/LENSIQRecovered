package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class ea4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f32315a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ProgressBar f32316b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f32317c;

    private ea4(@efb RelativeLayout rootView, @efb ProgressBar progressbarLoading, @efb TextView tvTips) {
        this.f32315a = rootView;
        this.f32316b = progressbarLoading;
        this.f32317c = tvTips;
    }

    @efb
    public static ea4 bind(@efb View rootView) {
        int i = C2531R.id.progressbar_loading;
        ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
        if (progressBar != null) {
            i = C2531R.id.tv_tips;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                return new ea4((RelativeLayout) rootView, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ea4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ea4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.dialog_ai_voice_note_custom_loading, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f32315a;
    }
}
