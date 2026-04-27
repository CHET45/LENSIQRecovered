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

/* JADX INFO: renamed from: d9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4671d9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f28772C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f28773F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f28774H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f28775L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f28776M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f28777M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f28778N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f28779Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f28780V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final RelativeLayout f28781X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final RelativeLayout f28782Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final RelativeLayout f28783Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final TextView f28784Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f28785a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final LinearLayout f28786a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f28787b;

    /* JADX INFO: renamed from: c */
    @efb
    public final BottomEditView f28788c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f28789d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f28790e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f28791f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f28792m;

    private C4671d9(@efb RelativeLayout rootView, @efb RecyclerView aiDemoRc, @efb BottomEditView bottomEditView, @efb TextView btnEarSend, @efb TextView btnFromTrans, @efb TextView btnPhoneVoice, @efb TextView btnToTrans, @efb LinearLayout buttomView, @efb LinearLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBackBtn, @efb RelativeLayout rlBottom, @efb RelativeLayout title, @efb RelativeLayout titleLayout, @efb TextView tvTitle, @efb TextView txtEmptyTransTip, @efb TextView txtVoiceValue, @efb LinearLayout voiceView) {
        this.f28785a = rootView;
        this.f28787b = aiDemoRc;
        this.f28788c = bottomEditView;
        this.f28789d = btnEarSend;
        this.f28790e = btnFromTrans;
        this.f28791f = btnPhoneVoice;
        this.f28792m = btnToTrans;
        this.f28772C = buttomView;
        this.f28773F = contentRoot;
        this.f28774H = emptyView;
        this.f28775L = imgExchange;
        this.f28776M = imgTransView;
        this.f28778N = imgVoice;
        this.f28779Q = ivBackBtn;
        this.f28781X = rlBottom;
        this.f28782Y = title;
        this.f28783Z = titleLayout;
        this.f28777M1 = tvTitle;
        this.f28780V1 = txtEmptyTransTip;
        this.f28784Z1 = txtVoiceValue;
        this.f28786a2 = voiceView;
    }

    @efb
    public static C4671d9 bind(@efb View rootView) {
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
                        i = C4035R.id.btn_phone_voice;
                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = C4035R.id.btn_to_trans;
                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                i = C4035R.id.buttom_view;
                                LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                if (linearLayout != null) {
                                    i = C4035R.id.content_root;
                                    LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout2 != null) {
                                        i = C4035R.id.empty_view;
                                        LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout3 != null) {
                                            i = C4035R.id.img_exchange;
                                            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                                            if (imageView != null) {
                                                i = C4035R.id.img_trans_view;
                                                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView2 != null) {
                                                    i = C4035R.id.img_voice;
                                                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                                    if (imageView3 != null) {
                                                        i = C4035R.id.iv_back_btn;
                                                        ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                                        if (imageView4 != null) {
                                                            i = C4035R.id.rl_bottom;
                                                            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                            if (relativeLayout != null) {
                                                                i = C4035R.id.title;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                if (relativeLayout2 != null) {
                                                                    i = C4035R.id.title_layout;
                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                    if (relativeLayout3 != null) {
                                                                        i = C4035R.id.tv_title;
                                                                        TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                        if (textView5 != null) {
                                                                            i = C4035R.id.txt_empty_trans_tip;
                                                                            TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                            if (textView6 != null) {
                                                                                i = C4035R.id.txt_voice_value;
                                                                                TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                if (textView7 != null) {
                                                                                    i = C4035R.id.voice_view;
                                                                                    LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                    if (linearLayout4 != null) {
                                                                                        return new C4671d9((RelativeLayout) rootView, recyclerView, bottomEditView, textView, textView2, textView3, textView4, linearLayout, linearLayout2, linearLayout3, imageView, imageView2, imageView3, imageView4, relativeLayout, relativeLayout2, relativeLayout3, textView5, textView6, textView7, linearLayout4);
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
    public static C4671d9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C4671d9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_ai_tarns, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f28785a;
    }
}
