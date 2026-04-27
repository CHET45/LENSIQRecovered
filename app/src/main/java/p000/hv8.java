package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.view.photo.DefaultTimeBar;
import com.watchfun.callvideo.C4008R;

/* JADX INFO: loaded from: classes4.dex */
public final class hv8 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f44933C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ConstraintLayout f44934F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f44935H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f44936L;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f44937a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f44938b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f44939c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f44940d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f44941e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f44942f;

    /* JADX INFO: renamed from: m */
    @efb
    public final DefaultTimeBar f44943m;

    private hv8(@efb ConstraintLayout rootView, @efb ImageView btnDelete, @efb ImageView btnPlayOrPause, @efb TextView exoDuration, @efb ImageView exoFfwd, @efb TextView exoPosition, @efb DefaultTimeBar exoProgress, @efb ImageView exoRew, @efb ConstraintLayout layoutAudioControlView, @efb LinearLayout llControl, @efb LinearLayout llTime) {
        this.f44937a = rootView;
        this.f44938b = btnDelete;
        this.f44939c = btnPlayOrPause;
        this.f44940d = exoDuration;
        this.f44941e = exoFfwd;
        this.f44942f = exoPosition;
        this.f44943m = exoProgress;
        this.f44933C = exoRew;
        this.f44934F = layoutAudioControlView;
        this.f44935H = llControl;
        this.f44936L = llTime;
    }

    @efb
    public static hv8 bind(@efb View rootView) {
        int i = C2558R.id.btn_delete;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.btn_play_or_pause;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2558R.id.exo_duration;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.exo_ffwd;
                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = C2558R.id.exo_position;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C4008R.id.exo_progress;
                            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) l8i.findChildViewById(rootView, i);
                            if (defaultTimeBar != null) {
                                i = C2558R.id.exo_rew;
                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView4 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                                    i = C2558R.id.ll_control;
                                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout != null) {
                                        i = C2558R.id.ll_time;
                                        LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout2 != null) {
                                            return new hv8(constraintLayout, imageView, imageView2, textView, imageView3, textView2, defaultTimeBar, imageView4, constraintLayout, linearLayout, linearLayout2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static hv8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static hv8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.layout_audio_control_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f44937a;
    }
}
