package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: db */
/* JADX INFO: loaded from: classes4.dex */
public final class C4719db implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f29152C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f29153F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f29154H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f29155L;

    /* JADX INFO: renamed from: M */
    @efb
    public final RelativeLayout f29156M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final RelativeLayout f29157M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f29158N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f29159Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f29160X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f29161Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final VideoView f29162Z;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f29163a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f29164b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f29165c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f29166d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f29167e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f29168f;

    /* JADX INFO: renamed from: m */
    @efb
    public final FrameLayout f29169m;

    private C4719db(@efb ConstraintLayout rootView, @efb ImageView btnClose, @efb TextView btnFinish, @efb TextView btnJumpCur, @efb TextView btnSeeAgain, @efb TextView btnStart, @efb FrameLayout flImg, @efb ImageView ivFinishAnim, @efb ImageView ivImg, @efb LinearLayout llDeviceDetecting, @efb LinearLayout llLayoutFinish, @efb RelativeLayout rlTop, @efb TextView tvGuideTip, @efb TextView tvGuideTip2, @efb TextView tvGuideTitle, @efb TextView videoStart, @efb VideoView videoView, @efb RelativeLayout videoViewLayout) {
        this.f29163a = rootView;
        this.f29164b = btnClose;
        this.f29165c = btnFinish;
        this.f29166d = btnJumpCur;
        this.f29167e = btnSeeAgain;
        this.f29168f = btnStart;
        this.f29169m = flImg;
        this.f29152C = ivFinishAnim;
        this.f29153F = ivImg;
        this.f29154H = llDeviceDetecting;
        this.f29155L = llLayoutFinish;
        this.f29156M = rlTop;
        this.f29158N = tvGuideTip;
        this.f29159Q = tvGuideTip2;
        this.f29160X = tvGuideTitle;
        this.f29161Y = videoStart;
        this.f29162Z = videoView;
        this.f29157M1 = videoViewLayout;
    }

    @efb
    public static C4719db bind(@efb View rootView) {
        int i = C2558R.id.btn_close;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.btn_finish;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2558R.id.btn_jump_cur;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = C2558R.id.btn_see_again;
                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = C2558R.id.btn_start;
                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            i = C2558R.id.fl_img;
                            FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                            if (frameLayout != null) {
                                i = C2558R.id.iv_finish_anim;
                                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView2 != null) {
                                    i = C2558R.id.iv_img;
                                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView3 != null) {
                                        i = C2558R.id.ll_device_detecting;
                                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout != null) {
                                            i = C2558R.id.ll_layout_finish;
                                            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout2 != null) {
                                                i = C2558R.id.rl_top;
                                                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                if (relativeLayout != null) {
                                                    i = C2558R.id.tv_guide_tip;
                                                    TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView5 != null) {
                                                        i = C2558R.id.tv_guide_tip2;
                                                        TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView6 != null) {
                                                            i = C2558R.id.tv_guide_title;
                                                            TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                            if (textView7 != null) {
                                                                i = C2558R.id.video_start;
                                                                TextView textView8 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView8 != null) {
                                                                    i = C2558R.id.video_view;
                                                                    VideoView videoView = (VideoView) l8i.findChildViewById(rootView, i);
                                                                    if (videoView != null) {
                                                                        i = C2558R.id.video_view_layout;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                        if (relativeLayout2 != null) {
                                                                            return new C4719db((ConstraintLayout) rootView, imageView, textView, textView2, textView3, textView4, frameLayout, imageView2, imageView3, linearLayout, linearLayout2, relativeLayout, textView5, textView6, textView7, textView8, videoView, relativeLayout2);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C4719db inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C4719db inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_glasses_guide, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f29163a;
    }
}
