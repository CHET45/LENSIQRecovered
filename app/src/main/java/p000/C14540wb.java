package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: wb */
/* JADX INFO: loaded from: classes4.dex */
public final class C14540wb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f93843C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f93844F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f93845H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f93846L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f93847M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final RelativeLayout f93848M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f93849N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f93850Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final RelativeLayout f93851V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f93852X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final FrameLayout f93853Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final ImageView f93854Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final RelativeLayout f93855Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f93856a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final RecyclerView f93857a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f93858b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final RecyclerView f93859b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f93860c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final TextView f93861c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f93862d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final TextView f93863d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f93864e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final View f93865e2;

    /* JADX INFO: renamed from: f */
    @efb
    public final RelativeLayout f93866f;

    /* JADX INFO: renamed from: f2 */
    @efb
    public final LinearLayout f93867f2;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f93868m;

    private C14540wb(@efb RelativeLayout rootView, @efb TextView btnFromTrans, @efb LinearLayout btnStart, @efb LinearLayout btnStartLayout, @efb TextView btnToTrans, @efb RelativeLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView imageViews, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBack, @efb ImageView ivBroadcast, @efb ImageView ivClearExit, @efb ImageView ivStart, @efb FrameLayout layoutTranslated, @efb ImageView receiveImgVoiceBtn, @efb RelativeLayout rlBottom, @efb RelativeLayout rlOperator, @efb RelativeLayout rlTitle, @efb RecyclerView rvSource, @efb RecyclerView rvTranslated, @efb TextView tvSay, @efb TextView txtVoiceValue, @efb View viewBottom, @efb LinearLayout voiceView) {
        this.f93856a = rootView;
        this.f93858b = btnFromTrans;
        this.f93860c = btnStart;
        this.f93862d = btnStartLayout;
        this.f93864e = btnToTrans;
        this.f93866f = contentRoot;
        this.f93868m = emptyView;
        this.f93843C = imageViews;
        this.f93844F = imgExchange;
        this.f93845H = imgTransView;
        this.f93846L = imgVoice;
        this.f93847M = ivBack;
        this.f93849N = ivBroadcast;
        this.f93850Q = ivClearExit;
        this.f93852X = ivStart;
        this.f93853Y = layoutTranslated;
        this.f93854Z = receiveImgVoiceBtn;
        this.f93848M1 = rlBottom;
        this.f93851V1 = rlOperator;
        this.f93855Z1 = rlTitle;
        this.f93857a2 = rvSource;
        this.f93859b2 = rvTranslated;
        this.f93861c2 = tvSay;
        this.f93863d2 = txtVoiceValue;
        this.f93865e2 = viewBottom;
        this.f93867f2 = voiceView;
    }

    @efb
    public static C14540wb bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.btn_from_trans;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.btn_start;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C2558R.id.btn_start_layout;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null) {
                    i = C2558R.id.btn_to_trans;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = C2558R.id.content_root;
                        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                        if (relativeLayout != null) {
                            i = C2558R.id.empty_view;
                            LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout3 != null) {
                                i = C2558R.id.imageViews;
                                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView != null) {
                                    i = C2558R.id.img_exchange;
                                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView2 != null) {
                                        i = C2558R.id.img_trans_view;
                                        ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                        if (imageView3 != null) {
                                            i = C2558R.id.img_voice;
                                            ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                            if (imageView4 != null) {
                                                i = C2558R.id.iv_back;
                                                ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView5 != null) {
                                                    i = C2558R.id.iv_broadcast;
                                                    ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                                    if (imageView6 != null) {
                                                        i = C2558R.id.iv_clear_exit;
                                                        ImageView imageView7 = (ImageView) l8i.findChildViewById(rootView, i);
                                                        if (imageView7 != null) {
                                                            i = C2558R.id.iv_start;
                                                            ImageView imageView8 = (ImageView) l8i.findChildViewById(rootView, i);
                                                            if (imageView8 != null) {
                                                                i = C2558R.id.layout_translated;
                                                                FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                                                                if (frameLayout != null) {
                                                                    i = C2558R.id.receive_img_voice_btn;
                                                                    ImageView imageView9 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                    if (imageView9 != null) {
                                                                        i = C2558R.id.rl_bottom;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                        if (relativeLayout2 != null) {
                                                                            i = C2558R.id.rl_operator;
                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                            if (relativeLayout3 != null) {
                                                                                i = C2558R.id.rl_title;
                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                if (relativeLayout4 != null) {
                                                                                    i = C2558R.id.rv_source;
                                                                                    RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                                    if (recyclerView != null) {
                                                                                        i = C2558R.id.rv_translated;
                                                                                        RecyclerView recyclerView2 = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                                        if (recyclerView2 != null) {
                                                                                            i = C2558R.id.tv_say;
                                                                                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                            if (textView3 != null) {
                                                                                                i = C2558R.id.txt_voice_value;
                                                                                                TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                if (textView4 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.view_bottom))) != null) {
                                                                                                    i = C2558R.id.voice_view;
                                                                                                    LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                                    if (linearLayout4 != null) {
                                                                                                        return new C14540wb((RelativeLayout) rootView, textView, linearLayout, linearLayout2, textView2, relativeLayout, linearLayout3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, frameLayout, imageView9, relativeLayout2, relativeLayout3, relativeLayout4, recyclerView, recyclerView2, textView3, textView4, viewFindChildViewById, linearLayout4);
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
    public static C14540wb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C14540wb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_real_time_translation, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f93856a;
    }
}
