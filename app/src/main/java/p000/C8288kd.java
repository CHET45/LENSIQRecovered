package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.callvideo.C4008R;

/* JADX INFO: renamed from: kd */
/* JADX INFO: loaded from: classes6.dex */
public final class C8288kd implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final FrameLayout f53621C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f53622F;

    /* JADX INFO: renamed from: H */
    @efb
    public final RelativeLayout f53623H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f53624L;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f53625a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f53626b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f53627c;

    /* JADX INFO: renamed from: d */
    @efb
    public final FrameLayout f53628d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f53629e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f53630f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f53631m;

    private C8288kd(@efb LinearLayout linearLayout, @efb LinearLayout linearLayout2, @efb LinearLayout linearLayout3, @efb FrameLayout frameLayout, @efb TextView textView, @efb TextView textView2, @efb TextView textView3, @efb FrameLayout frameLayout2, @efb ImageView imageView, @efb RelativeLayout relativeLayout, @efb TextView textView4) {
        this.f53625a = linearLayout;
        this.f53626b = linearLayout2;
        this.f53627c = linearLayout3;
        this.f53628d = frameLayout;
        this.f53629e = textView;
        this.f53630f = textView2;
        this.f53631m = textView3;
        this.f53621C = frameLayout2;
        this.f53622F = imageView;
        this.f53623H = relativeLayout;
        this.f53624L = textView4;
    }

    @efb
    public static C8288kd bind(@efb View view) {
        int i = C4008R.id.bg_audio;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            i = C4008R.id.bg_video;
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
            if (linearLayout2 != null) {
                i = C4008R.id.btn_audio;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                if (frameLayout != null) {
                    i = C4008R.id.btn_from_trans;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        i = C4008R.id.btn_start;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = C4008R.id.btn_to_trans;
                            TextView textView3 = (TextView) view.findViewById(i);
                            if (textView3 != null) {
                                i = C4008R.id.btn_video;
                                FrameLayout frameLayout2 = (FrameLayout) view.findViewById(i);
                                if (frameLayout2 != null) {
                                    i = C4008R.id.iv_back;
                                    ImageView imageView = (ImageView) view.findViewById(i);
                                    if (imageView != null) {
                                        i = C4008R.id.ll_content;
                                        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                                        if (relativeLayout != null) {
                                            i = C4008R.id.tv_title;
                                            TextView textView4 = (TextView) view.findViewById(i);
                                            if (textView4 != null) {
                                                return new C8288kd((LinearLayout) view, linearLayout, linearLayout2, frameLayout, textView, textView2, textView3, frameLayout2, imageView, relativeLayout, textView4);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C8288kd inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C8288kd inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4008R.layout.activity_trans_video_audio, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f53625a;
    }
}
