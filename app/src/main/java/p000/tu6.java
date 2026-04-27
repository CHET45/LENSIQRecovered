package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.widget.CircleProgressView;
import com.eyevue.glassapp.C2558R;
import com.google.android.exoplayer2.p009ui.PlayerView;

/* JADX INFO: loaded from: classes4.dex */
public final class tu6 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f85953C;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f85954a;

    /* JADX INFO: renamed from: b */
    @efb
    public final FrameLayout f85955b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f85956c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f85957d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f85958e;

    /* JADX INFO: renamed from: f */
    @efb
    public final PlayerView f85959f;

    /* JADX INFO: renamed from: m */
    @efb
    public final CircleProgressView f85960m;

    private tu6(@efb ConstraintLayout rootView, @efb FrameLayout flThumbnail, @efb ImageView ivBack, @efb ImageView ivDownload, @efb ImageView ivThumbnailBg, @efb PlayerView playerView, @efb CircleProgressView progress, @efb TextView tvVideoTitle) {
        this.f85954a = rootView;
        this.f85955b = flThumbnail;
        this.f85956c = ivBack;
        this.f85957d = ivDownload;
        this.f85958e = ivThumbnailBg;
        this.f85959f = playerView;
        this.f85960m = progress;
        this.f85953C = tvVideoTitle;
    }

    @efb
    public static tu6 bind(@efb View rootView) {
        int i = C2558R.id.fl_thumbnail;
        FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = C2558R.id.iv_back;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2558R.id.iv_download;
                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = C2558R.id.iv_thumbnail_bg;
                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = C2558R.id.player_view;
                        PlayerView playerView = (PlayerView) l8i.findChildViewById(rootView, i);
                        if (playerView != null) {
                            i = C2558R.id.progress;
                            CircleProgressView circleProgressView = (CircleProgressView) l8i.findChildViewById(rootView, i);
                            if (circleProgressView != null) {
                                i = C2558R.id.tv_video_title;
                                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView != null) {
                                    return new tu6((ConstraintLayout) rootView, frameLayout, imageView, imageView2, imageView3, playerView, circleProgressView, textView);
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
    public static tu6 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static tu6 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.fragment_video, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f85954a;
    }
}
