package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: renamed from: gl */
/* JADX INFO: loaded from: classes7.dex */
public final class C6365gl implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f40069a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ProgressBar f40070b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f40071c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f40072d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f40073e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f40074f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f40075m;

    private C6365gl(@efb RelativeLayout relativeLayout, @efb ProgressBar progressBar, @efb RelativeLayout relativeLayout2, @efb TextView textView, @efb TextView textView2, @efb TextView textView3, @efb TextView textView4) {
        this.f40069a = relativeLayout;
        this.f40070b = progressBar;
        this.f40071c = relativeLayout2;
        this.f40072d = textView;
        this.f40073e = textView2;
        this.f40074f = textView3;
        this.f40075m = textView4;
    }

    @efb
    public static C6365gl bind(@efb View view) {
        int i = C4297R.id.progressbar_loading;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = C4297R.id.tv_again;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C4297R.id.tv_loading_hint;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    i = C4297R.id.tv_no_data_hint;
                    TextView textView3 = (TextView) view.findViewById(i);
                    if (textView3 != null) {
                        i = C4297R.id.tv_no_net_hint;
                        TextView textView4 = (TextView) view.findViewById(i);
                        if (textView4 != null) {
                            return new C6365gl(relativeLayout, progressBar, relativeLayout, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C6365gl inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C6365gl inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.ai_voice_note_loading_view_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f40069a;
    }
}
