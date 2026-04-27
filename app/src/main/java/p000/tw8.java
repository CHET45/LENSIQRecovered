package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.view.photo.DefaultTimeBar;
import com.watchfun.callvideo.C4008R;

/* JADX INFO: loaded from: classes4.dex */
public final class tw8 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final FrameLayout f86170C;

    /* JADX INFO: renamed from: a */
    @efb
    public final FrameLayout f86171a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f86172b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f86173c;

    /* JADX INFO: renamed from: d */
    @efb
    public final DefaultTimeBar f86174d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f86175e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f86176f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f86177m;

    private tw8(@efb FrameLayout rootView, @efb TextView exoDuration, @efb TextView exoPosition, @efb DefaultTimeBar exoProgress, @efb ImageView ivDelete, @efb ImageView ivMute, @efb ImageView ivVideoPlay, @efb FrameLayout layoutPlayerControlView) {
        this.f86171a = rootView;
        this.f86172b = exoDuration;
        this.f86173c = exoPosition;
        this.f86174d = exoProgress;
        this.f86175e = ivDelete;
        this.f86176f = ivMute;
        this.f86177m = ivVideoPlay;
        this.f86170C = layoutPlayerControlView;
    }

    @efb
    public static tw8 bind(@efb View rootView) {
        int i = C2558R.id.exo_duration;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.exo_position;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C4008R.id.exo_progress;
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) l8i.findChildViewById(rootView, i);
                if (defaultTimeBar != null) {
                    i = C2558R.id.iv_delete;
                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = C2558R.id.iv_mute;
                        ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView2 != null) {
                            i = C2558R.id.iv_video_play;
                            ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView3 != null) {
                                FrameLayout frameLayout = (FrameLayout) rootView;
                                return new tw8(frameLayout, textView, textView2, defaultTimeBar, imageView, imageView2, imageView3, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static tw8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static tw8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.layout_player_control_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public FrameLayout getRoot() {
        return this.f86171a;
    }
}
