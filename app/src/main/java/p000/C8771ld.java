package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ld */
/* JADX INFO: loaded from: classes4.dex */
public final class C8771ld implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final FrameLayout f57204C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f57205F;

    /* JADX INFO: renamed from: H */
    @efb
    public final RelativeLayout f57206H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f57207L;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f57208a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f57209b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f57210c;

    /* JADX INFO: renamed from: d */
    @efb
    public final FrameLayout f57211d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f57212e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f57213f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f57214m;

    private C8771ld(@efb LinearLayout rootView, @efb LinearLayout bgAudio, @efb LinearLayout bgVideo, @efb FrameLayout btnAudio, @efb TextView btnFromTrans, @efb TextView btnStart, @efb TextView btnToTrans, @efb FrameLayout btnVideo, @efb ImageView ivBack, @efb RelativeLayout llContent, @efb TextView tvTitle) {
        this.f57208a = rootView;
        this.f57209b = bgAudio;
        this.f57210c = bgVideo;
        this.f57211d = btnAudio;
        this.f57212e = btnFromTrans;
        this.f57213f = btnStart;
        this.f57214m = btnToTrans;
        this.f57204C = btnVideo;
        this.f57205F = ivBack;
        this.f57206H = llContent;
        this.f57207L = tvTitle;
    }

    @efb
    public static C8771ld bind(@efb View rootView) {
        int i = C2558R.id.bg_audio;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.bg_video;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = C2558R.id.btn_audio;
                FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                if (frameLayout != null) {
                    i = C2558R.id.btn_from_trans;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2558R.id.btn_start;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C2558R.id.btn_to_trans;
                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                i = C2558R.id.btn_video;
                                FrameLayout frameLayout2 = (FrameLayout) l8i.findChildViewById(rootView, i);
                                if (frameLayout2 != null) {
                                    i = C2558R.id.iv_back;
                                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView != null) {
                                        i = C2558R.id.ll_content;
                                        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                        if (relativeLayout != null) {
                                            i = C2558R.id.tv_title;
                                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView4 != null) {
                                                return new C8771ld((LinearLayout) rootView, linearLayout, linearLayout2, frameLayout, textView, textView2, textView3, frameLayout2, imageView, relativeLayout, textView4);
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
    public static C8771ld inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C8771ld inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_trans_video_audio, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f57208a;
    }
}
