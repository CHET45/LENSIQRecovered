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

/* JADX INFO: renamed from: n9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C9747n9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f63642C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f63643F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f63644H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f63645L;

    /* JADX INFO: renamed from: M */
    @efb
    public final LinearLayout f63646M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final ImageView f63647M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f63648N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f63649Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final RelativeLayout f63650V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f63651X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final ImageView f63652Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final ImageView f63653Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final RelativeLayout f63654Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f63655a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final RelativeLayout f63656a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f63657b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final TextView f63658b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final BottomEditView f63659c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final TextView f63660c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f63661d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final TextView f63662d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f63663e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final LinearLayout f63664e2;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f63665f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f63666m;

    private C9747n9(@efb RelativeLayout rootView, @efb RecyclerView aiDemoRc, @efb BottomEditView bottomEditView, @efb TextView btnEarSend, @efb TextView btnFromTrans, @efb LinearLayout btnPhoneLayout, @efb TextView btnPhoneVoice, @efb LinearLayout btnRightLayout, @efb TextView btnToTrans, @efb LinearLayout buttomView, @efb LinearLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView imageView, @efb ImageView imageViews, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBackBtn, @efb RelativeLayout rlBottom, @efb RelativeLayout title, @efb RelativeLayout titleLayout, @efb TextView tvTip, @efb TextView tvTitle, @efb TextView txtVoiceValue, @efb LinearLayout voiceView) {
        this.f63655a = rootView;
        this.f63657b = aiDemoRc;
        this.f63659c = bottomEditView;
        this.f63661d = btnEarSend;
        this.f63663e = btnFromTrans;
        this.f63665f = btnPhoneLayout;
        this.f63666m = btnPhoneVoice;
        this.f63642C = btnRightLayout;
        this.f63643F = btnToTrans;
        this.f63644H = buttomView;
        this.f63645L = contentRoot;
        this.f63646M = emptyView;
        this.f63648N = imageView;
        this.f63649Q = imageViews;
        this.f63651X = imgExchange;
        this.f63652Y = imgTransView;
        this.f63653Z = imgVoice;
        this.f63647M1 = ivBackBtn;
        this.f63650V1 = rlBottom;
        this.f63654Z1 = title;
        this.f63656a2 = titleLayout;
        this.f63658b2 = tvTip;
        this.f63660c2 = tvTitle;
        this.f63662d2 = txtVoiceValue;
        this.f63664e2 = voiceView;
    }

    @efb
    public static C9747n9 bind(@efb View rootView) {
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
                                                                                                i = C4035R.id.txt_voice_value;
                                                                                                TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                if (textView7 != null) {
                                                                                                    i = C4035R.id.voice_view;
                                                                                                    LinearLayout linearLayout6 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                                    if (linearLayout6 != null) {
                                                                                                        return new C9747n9((RelativeLayout) rootView, recyclerView, bottomEditView, textView, textView2, linearLayout, textView3, linearLayout2, textView4, linearLayout3, linearLayout4, linearLayout5, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, relativeLayout, relativeLayout2, relativeLayout3, textView5, textView6, textView7, linearLayout6);
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
    public static C9747n9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C9747n9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_chat_freely, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f63655a;
    }
}
