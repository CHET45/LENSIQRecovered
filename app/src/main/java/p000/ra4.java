package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class ra4 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f77548C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f77549F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f77550H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f77551L;

    /* JADX INFO: renamed from: M */
    @efb
    public final LinearLayout f77552M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f77553M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final LinearLayout f77554N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final RelativeLayout f77555Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f77556V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final CardView f77557X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final RelativeLayout f77558Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final RecyclerView f77559Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final TextView f77560Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f77561a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final TextView f77562a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f77563b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final TextView f77564b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final ConstraintLayout f77565c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final TextView f77566c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final ConstraintLayout f77567d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final TextView f77568d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f77569e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final TextView f77570e2;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f77571f;

    /* JADX INFO: renamed from: f2 */
    @efb
    public final ImageView f77572f2;

    /* JADX INFO: renamed from: g2 */
    @efb
    public final VideoView f77573g2;

    /* JADX INFO: renamed from: h2 */
    @efb
    public final RelativeLayout f77574h2;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f77575m;

    private ra4(@efb ConstraintLayout rootView, @efb TextView btnNext, @efb ConstraintLayout clGuide, @efb ConstraintLayout clNoFind, @efb ImageView ivClose, @efb ImageView ivConnectAnim, @efb ImageView ivGuideImg, @efb ImageView ivIgnore, @efb ImageView ivNotfind, @efb ImageView ivSearchAnim, @efb LinearLayout llConnectSuccess, @efb LinearLayout llConnecting, @efb LinearLayout llSearch, @efb RelativeLayout rlConnectFail, @efb CardView rlGuideVideo, @efb RelativeLayout rlIgnore, @efb RecyclerView rvDeviceList, @efb TextView tvCancel, @efb TextView tvFailSolution, @efb TextView tvGuideDesc, @efb TextView tvIgnore, @efb TextView tvNoFind, @efb TextView tvRetry, @efb TextView tvTitle, @efb TextView tvTosetting, @efb ImageView videoStart, @efb VideoView videoView, @efb RelativeLayout videoViewLayout) {
        this.f77561a = rootView;
        this.f77563b = btnNext;
        this.f77565c = clGuide;
        this.f77567d = clNoFind;
        this.f77569e = ivClose;
        this.f77571f = ivConnectAnim;
        this.f77575m = ivGuideImg;
        this.f77548C = ivIgnore;
        this.f77549F = ivNotfind;
        this.f77550H = ivSearchAnim;
        this.f77551L = llConnectSuccess;
        this.f77552M = llConnecting;
        this.f77554N = llSearch;
        this.f77555Q = rlConnectFail;
        this.f77557X = rlGuideVideo;
        this.f77558Y = rlIgnore;
        this.f77559Z = rvDeviceList;
        this.f77553M1 = tvCancel;
        this.f77556V1 = tvFailSolution;
        this.f77560Z1 = tvGuideDesc;
        this.f77562a2 = tvIgnore;
        this.f77564b2 = tvNoFind;
        this.f77566c2 = tvRetry;
        this.f77568d2 = tvTitle;
        this.f77570e2 = tvTosetting;
        this.f77572f2 = videoStart;
        this.f77573g2 = videoView;
        this.f77574h2 = videoViewLayout;
    }

    @efb
    public static ra4 bind(@efb View rootView) {
        int i = C2558R.id.btn_next;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.cl_guide;
            ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
            if (constraintLayout != null) {
                i = C2558R.id.cl_no_find;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) l8i.findChildViewById(rootView, i);
                if (constraintLayout2 != null) {
                    i = C2558R.id.iv_close;
                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = C2558R.id.iv_connect_anim;
                        ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView2 != null) {
                            i = C2558R.id.iv_guide_img;
                            ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView3 != null) {
                                i = C2558R.id.iv_ignore;
                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView4 != null) {
                                    i = C2558R.id.iv_notfind;
                                    ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView5 != null) {
                                        i = C2558R.id.iv_search_anim;
                                        ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                        if (imageView6 != null) {
                                            i = C2558R.id.ll_connect_success;
                                            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout != null) {
                                                i = C2558R.id.ll_connecting;
                                                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                if (linearLayout2 != null) {
                                                    i = C2558R.id.ll_search;
                                                    LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                    if (linearLayout3 != null) {
                                                        i = C2558R.id.rl_connect_fail;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                        if (relativeLayout != null) {
                                                            i = C2558R.id.rl_guide_video;
                                                            CardView cardView = (CardView) l8i.findChildViewById(rootView, i);
                                                            if (cardView != null) {
                                                                i = C2558R.id.rl_ignore;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                if (relativeLayout2 != null) {
                                                                    i = C2558R.id.rv_device_list;
                                                                    RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                    if (recyclerView != null) {
                                                                        i = C2558R.id.tv_cancel;
                                                                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                                                        if (textView2 != null) {
                                                                            i = C2558R.id.tv_fail_solution;
                                                                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                            if (textView3 != null) {
                                                                                i = C2558R.id.tv_guide_desc;
                                                                                TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                if (textView4 != null) {
                                                                                    i = C2558R.id.tv_ignore;
                                                                                    TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                    if (textView5 != null) {
                                                                                        i = C2558R.id.tv_no_find;
                                                                                        TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                        if (textView6 != null) {
                                                                                            i = C2558R.id.tv_retry;
                                                                                            TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                            if (textView7 != null) {
                                                                                                i = C2558R.id.tv_title;
                                                                                                TextView textView8 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                if (textView8 != null) {
                                                                                                    i = C2558R.id.tv_tosetting;
                                                                                                    TextView textView9 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                    if (textView9 != null) {
                                                                                                        i = C2558R.id.video_start;
                                                                                                        ImageView imageView7 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                                                        if (imageView7 != null) {
                                                                                                            i = C2558R.id.video_view;
                                                                                                            VideoView videoView = (VideoView) l8i.findChildViewById(rootView, i);
                                                                                                            if (videoView != null) {
                                                                                                                i = C2558R.id.video_view_layout;
                                                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                                                if (relativeLayout3 != null) {
                                                                                                                    return new ra4((ConstraintLayout) rootView, textView, constraintLayout, constraintLayout2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, linearLayout3, relativeLayout, cardView, relativeLayout2, recyclerView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, imageView7, videoView, relativeLayout3);
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
    public static ra4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ra4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_connect_guide, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f77561a;
    }
}
