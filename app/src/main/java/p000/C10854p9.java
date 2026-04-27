package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.widget.BottomEditView;

/* JADX INFO: renamed from: p9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C10854p9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f70033C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f70034F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f70035H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f70036L;

    /* JADX INFO: renamed from: M */
    @efb
    public final LinearLayout f70037M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final ImageView f70038M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f70039N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f70040Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final RelativeLayout f70041V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f70042X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final ImageView f70043Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final ImageView f70044Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final RelativeLayout f70045Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f70046a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final RelativeLayout f70047a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f70048b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final TextView f70049b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final BottomEditView f70050c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final TextView f70051c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f70052d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final LinearLayout f70053d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f70054e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f70055f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f70056m;

    private C10854p9(@efb RelativeLayout rootView, @efb RecyclerView aiDemoRc, @efb BottomEditView bottomEditView, @efb TextView btnEarSend, @efb TextView btnFromTrans, @efb LinearLayout btnPhoneLayout, @efb TextView btnPhoneVoice, @efb LinearLayout btnRightLayout, @efb TextView btnToTrans, @efb LinearLayout buttomView, @efb LinearLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView imageView, @efb ImageView imageViews, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBackBtn, @efb RelativeLayout rlBottom, @efb RelativeLayout title, @efb RelativeLayout titleLayout, @efb TextView tvTip, @efb TextView tvTitle, @efb LinearLayout voiceView) {
        this.f70046a = rootView;
        this.f70048b = aiDemoRc;
        this.f70050c = bottomEditView;
        this.f70052d = btnEarSend;
        this.f70054e = btnFromTrans;
        this.f70055f = btnPhoneLayout;
        this.f70056m = btnPhoneVoice;
        this.f70033C = btnRightLayout;
        this.f70034F = btnToTrans;
        this.f70035H = buttomView;
        this.f70036L = contentRoot;
        this.f70037M = emptyView;
        this.f70039N = imageView;
        this.f70040Q = imageViews;
        this.f70042X = imgExchange;
        this.f70043Y = imgTransView;
        this.f70044Z = imgVoice;
        this.f70038M1 = ivBackBtn;
        this.f70041V1 = rlBottom;
        this.f70045Z1 = title;
        this.f70047a2 = titleLayout;
        this.f70049b2 = tvTip;
        this.f70051c2 = tvTitle;
        this.f70053d2 = voiceView;
    }

    @efb
    public static C10854p9 bind(@efb View rootView) {
        int i = C4035R.id.ai_demo_rc;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C4035R.id.bottomEditView;
            BottomEditView bottomEditView = (BottomEditView) l8i.findChildViewById(rootView, i);
            if (bottomEditView != null) {
                i = C4035R.id.btn_ear_send;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C4035R.id.btn_from_trans;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = C4035R.id.btn_phone_layout;
                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout != null) {
                            i = C4035R.id.btn_phone_voice;
                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                i = C4035R.id.btn_right_layout;
                                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                if (linearLayout2 != null) {
                                    i = C4035R.id.btn_to_trans;
                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView4 != null) {
                                        i = C4035R.id.buttom_view;
                                        LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout3 != null) {
                                            i = C4035R.id.content_root;
                                            LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout4 != null) {
                                                i = C4035R.id.empty_view;
                                                LinearLayout linearLayout5 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                if (linearLayout5 != null) {
                                                    i = C4035R.id.imageView;
                                                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                                    if (imageView != null) {
                                                        i = C4035R.id.imageViews;
                                                        ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                                        if (imageView2 != null) {
                                                            i = C4035R.id.img_exchange;
                                                            ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                                            if (imageView3 != null) {
                                                                i = C4035R.id.img_trans_view;
                                                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                if (imageView4 != null) {
                                                                    i = C4035R.id.img_voice;
                                                                    ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                    if (imageView5 != null) {
                                                                        i = C4035R.id.iv_back_btn;
                                                                        ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                        if (imageView6 != null) {
                                                                            i = C4035R.id.rl_bottom;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                            if (relativeLayout != null) {
                                                                                i = C4035R.id.title;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                if (relativeLayout2 != null) {
                                                                                    i = C4035R.id.title_layout;
                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                    if (relativeLayout3 != null) {
                                                                                        i = C4035R.id.tv_tip;
                                                                                        TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                        if (textView5 != null) {
                                                                                            i = C4035R.id.tv_title;
                                                                                            TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                            if (textView6 != null) {
                                                                                                i = C4035R.id.voice_view;
                                                                                                LinearLayout linearLayout6 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                                if (linearLayout6 != null) {
                                                                                                    return new C10854p9((RelativeLayout) rootView, recyclerView, bottomEditView, textView, textView2, linearLayout, textView3, linearLayout2, textView4, linearLayout3, linearLayout4, linearLayout5, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, relativeLayout, relativeLayout2, relativeLayout3, textView5, textView6, linearLayout6);
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
    public static C10854p9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C10854p9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_chat_freely_touch, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f70046a;
    }
}
