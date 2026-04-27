package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.watchfun.voicenotes.C4297R;
import com.watchfun.voicenotes.widget.AiVoiceNoteLoadingView;
import com.watchfun.voicenotes.widget.toolbar.ToolBar;

/* JADX INFO: renamed from: g9 */
/* JADX INFO: loaded from: classes7.dex */
public final class C6169g9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f39018a;

    /* JADX INFO: renamed from: b */
    @efb
    public final AiVoiceNoteLoadingView f39019b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ProgressBar f39020c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ToolBar f39021d;

    /* JADX INFO: renamed from: e */
    @efb
    public final FrameLayout f39022e;

    private C6169g9(@efb RelativeLayout relativeLayout, @efb AiVoiceNoteLoadingView aiVoiceNoteLoadingView, @efb ProgressBar progressBar, @efb ToolBar toolBar, @efb FrameLayout frameLayout) {
        this.f39018a = relativeLayout;
        this.f39019b = aiVoiceNoteLoadingView;
        this.f39020c = progressBar;
        this.f39021d = toolBar;
        this.f39022e = frameLayout;
    }

    @efb
    public static C6169g9 bind(@efb View view) {
        int i = C4297R.id.loadingView;
        AiVoiceNoteLoadingView aiVoiceNoteLoadingView = (AiVoiceNoteLoadingView) view.findViewById(i);
        if (aiVoiceNoteLoadingView != null) {
            i = C4297R.id.progress_bar;
            ProgressBar progressBar = (ProgressBar) view.findViewById(i);
            if (progressBar != null) {
                i = C4297R.id.title_bar;
                ToolBar toolBar = (ToolBar) view.findViewById(i);
                if (toolBar != null) {
                    i = C4297R.id.webViewContainer;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                    if (frameLayout != null) {
                        return new C6169g9((RelativeLayout) view, aiVoiceNoteLoadingView, progressBar, toolBar, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C6169g9 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C6169g9 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_ai_voice_note_statement, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f39018a;
    }
}
