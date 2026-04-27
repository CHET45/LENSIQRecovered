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
import androidx.core.widget.NestedScrollView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class ju6 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final RelativeLayout f51919C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f51920F;

    /* JADX INFO: renamed from: H */
    @efb
    public final NestedScrollView f51921H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f51922L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f51923M;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f51924N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final VideoView f51925Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final FrameLayout f51926X;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f51927a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f51928b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RelativeLayout f51929c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f51930d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f51931e;

    /* JADX INFO: renamed from: f */
    @efb
    public final RelativeLayout f51932f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f51933m;

    private ju6(@efb LinearLayout rootView, @efb ImageView gif, @efb RelativeLayout gifLayout, @efb TextView guidText, @efb TextView jump, @efb RelativeLayout jumpLayout, @efb TextView jumpTip, @efb RelativeLayout methodLayout, @efb TextView methodTip, @efb NestedScrollView scrollView, @efb LinearLayout tabLayout, @efb TextView tip, @efb ImageView videoStart, @efb VideoView videoView, @efb FrameLayout videoViewLayout) {
        this.f51927a = rootView;
        this.f51928b = gif;
        this.f51929c = gifLayout;
        this.f51930d = guidText;
        this.f51931e = jump;
        this.f51932f = jumpLayout;
        this.f51933m = jumpTip;
        this.f51919C = methodLayout;
        this.f51920F = methodTip;
        this.f51921H = scrollView;
        this.f51922L = tabLayout;
        this.f51923M = tip;
        this.f51924N = videoStart;
        this.f51925Q = videoView;
        this.f51926X = videoViewLayout;
    }

    @efb
    public static ju6 bind(@efb View rootView) {
        int i = C2558R.id.gif;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.gif_layout;
            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = C2558R.id.guid_text;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.jump;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = C2558R.id.jump_layout;
                        RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                        if (relativeLayout2 != null) {
                            i = C2558R.id.jump_tip;
                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                i = C2558R.id.method_layout;
                                RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                if (relativeLayout3 != null) {
                                    i = C2558R.id.method_tip;
                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView4 != null) {
                                        i = C2558R.id.scrollView;
                                        NestedScrollView nestedScrollView = (NestedScrollView) l8i.findChildViewById(rootView, i);
                                        if (nestedScrollView != null) {
                                            i = C2558R.id.tab_layout;
                                            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout != null) {
                                                i = C2558R.id.tip;
                                                TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView5 != null) {
                                                    i = C2558R.id.video_start;
                                                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                                    if (imageView2 != null) {
                                                        i = C2558R.id.video_view;
                                                        VideoView videoView = (VideoView) l8i.findChildViewById(rootView, i);
                                                        if (videoView != null) {
                                                            i = C2558R.id.video_view_layout;
                                                            FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                                                            if (frameLayout != null) {
                                                                return new ju6((LinearLayout) rootView, imageView, relativeLayout, textView, textView2, relativeLayout2, textView3, relativeLayout3, textView4, nestedScrollView, linearLayout, textView5, imageView2, videoView, frameLayout);
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
    public static ju6 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ju6 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.fragment_common, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f51927a;
    }
}
