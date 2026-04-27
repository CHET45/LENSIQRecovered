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
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.widget.BottomEditView;

/* JADX INFO: renamed from: md */
/* JADX INFO: loaded from: classes6.dex */
public final class C9289md implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f60583C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f60584F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f60585H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f60586L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f60587M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final ImageView f60588M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f60589N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f60590Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final RelativeLayout f60591V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f60592X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final ImageView f60593Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final FrameLayout f60594Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final RelativeLayout f60595Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f60596a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final RelativeLayout f60597a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final BottomEditView f60598b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final RecyclerView f60599b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f60600c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final RecyclerView f60601c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f60602d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final TextView f60603d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f60604e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final TextView f60605e2;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f60606f;

    /* JADX INFO: renamed from: f2 */
    @efb
    public final View f60607f2;

    /* JADX INFO: renamed from: g2 */
    @efb
    public final LinearLayout f60608g2;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f60609m;

    private C9289md(@efb RelativeLayout rootView, @efb BottomEditView bottomEditView, @efb TextView btnFromTrans, @efb LinearLayout btnStart, @efb LinearLayout btnStartLayout, @efb TextView btnToTrans, @efb LinearLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView imageViews, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBack, @efb ImageView ivBroadcast, @efb ImageView ivMask, @efb ImageView ivStart, @efb FrameLayout layoutTranslated, @efb ImageView receiveImgVoiceBtn, @efb RelativeLayout rlBottom, @efb RelativeLayout rlOperator, @efb RelativeLayout rlTitle, @efb RecyclerView rvSource, @efb RecyclerView rvTranslated, @efb TextView tvSay, @efb TextView txtVoiceValue, @efb View viewBottom, @efb LinearLayout voiceView) {
        this.f60596a = rootView;
        this.f60598b = bottomEditView;
        this.f60600c = btnFromTrans;
        this.f60602d = btnStart;
        this.f60604e = btnStartLayout;
        this.f60606f = btnToTrans;
        this.f60609m = contentRoot;
        this.f60583C = emptyView;
        this.f60584F = imageViews;
        this.f60585H = imgExchange;
        this.f60586L = imgTransView;
        this.f60587M = imgVoice;
        this.f60589N = ivBack;
        this.f60590Q = ivBroadcast;
        this.f60592X = ivMask;
        this.f60593Y = ivStart;
        this.f60594Z = layoutTranslated;
        this.f60588M1 = receiveImgVoiceBtn;
        this.f60591V1 = rlBottom;
        this.f60595Z1 = rlOperator;
        this.f60597a2 = rlTitle;
        this.f60599b2 = rvSource;
        this.f60601c2 = rvTranslated;
        this.f60603d2 = tvSay;
        this.f60605e2 = txtVoiceValue;
        this.f60607f2 = viewBottom;
        this.f60608g2 = voiceView;
    }

    @efb
    public static C9289md bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C4035R.id.bottomEditView;
        BottomEditView bottomEditView = (BottomEditView) l8i.findChildViewById(rootView, i);
        if (bottomEditView != null) {
            i = C4035R.id.btn_from_trans;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C4035R.id.btn_start;
                LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = C4035R.id.btn_start_layout;
                    LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout2 != null) {
                        i = C4035R.id.btn_to_trans;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C4035R.id.content_root;
                            LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout3 != null) {
                                i = C4035R.id.empty_view;
                                LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                if (linearLayout4 != null) {
                                    i = C4035R.id.imageViews;
                                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView != null) {
                                        i = C4035R.id.img_exchange;
                                        ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                        if (imageView2 != null) {
                                            i = C4035R.id.img_trans_view;
                                            ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                            if (imageView3 != null) {
                                                i = C4035R.id.img_voice;
                                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView4 != null) {
                                                    i = C4035R.id.iv_back;
                                                    ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                                    if (imageView5 != null) {
                                                        i = C4035R.id.iv_broadcast;
                                                        ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                                        if (imageView6 != null) {
                                                            i = C4035R.id.iv_mask;
                                                            ImageView imageView7 = (ImageView) l8i.findChildViewById(rootView, i);
                                                            if (imageView7 != null) {
                                                                i = C4035R.id.iv_start;
                                                                ImageView imageView8 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                if (imageView8 != null) {
                                                                    i = C4035R.id.layout_translated;
                                                                    FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                                                                    if (frameLayout != null) {
                                                                        i = C4035R.id.receive_img_voice_btn;
                                                                        ImageView imageView9 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                        if (imageView9 != null) {
                                                                            i = C4035R.id.rl_bottom;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                            if (relativeLayout != null) {
                                                                                i = C4035R.id.rl_operator;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                if (relativeLayout2 != null) {
                                                                                    i = C4035R.id.rl_title;
                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                    if (relativeLayout3 != null) {
                                                                                        i = C4035R.id.rv_source;
                                                                                        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                                        if (recyclerView != null) {
                                                                                            i = C4035R.id.rv_translated;
                                                                                            RecyclerView recyclerView2 = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                                            if (recyclerView2 != null) {
                                                                                                i = C4035R.id.tv_say;
                                                                                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                if (textView3 != null) {
                                                                                                    i = C4035R.id.txt_voice_value;
                                                                                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                    if (textView4 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C4035R.id.view_bottom))) != null) {
                                                                                                        i = C4035R.id.voice_view;
                                                                                                        LinearLayout linearLayout5 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                                        if (linearLayout5 != null) {
                                                                                                            return new C9289md((RelativeLayout) rootView, bottomEditView, textView, linearLayout, linearLayout2, textView2, linearLayout3, linearLayout4, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, frameLayout, imageView9, relativeLayout, relativeLayout2, relativeLayout3, recyclerView, recyclerView2, textView3, textView4, viewFindChildViewById, linearLayout5);
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
    public static C9289md inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C9289md inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_translation_machine, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f60596a;
    }
}
