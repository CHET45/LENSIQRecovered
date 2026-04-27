package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;
import com.watchfun.transcommon.widget.BottomEditView;

/* JADX INFO: renamed from: e9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5194e9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f32142C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f32143F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f32144H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f32145L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f32146M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final RelativeLayout f32147M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f32148N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f32149Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f32150V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f32151X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final RelativeLayout f32152Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final RelativeLayout f32153Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final TextView f32154Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f32155a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final TextView f32156a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f32157b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final LinearLayout f32158b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final BottomEditView f32159c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f32160d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f32161e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f32162f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f32163m;

    private C5194e9(@efb RelativeLayout rootView, @efb RecyclerView aiDemoRc, @efb BottomEditView bottomEditView, @efb TextView btnEarSend, @efb ImageView btnEdit, @efb TextView btnFromTrans, @efb TextView btnPhoneVoice, @efb TextView btnToTrans, @efb LinearLayout buttomView, @efb LinearLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBackBtn, @efb RelativeLayout rlBottom, @efb RelativeLayout title, @efb RelativeLayout titleLayout, @efb TextView tvTitle, @efb TextView txtEmptyTransTip, @efb TextView txtVoiceValue, @efb LinearLayout voiceView) {
        this.f32155a = rootView;
        this.f32157b = aiDemoRc;
        this.f32159c = bottomEditView;
        this.f32160d = btnEarSend;
        this.f32161e = btnEdit;
        this.f32162f = btnFromTrans;
        this.f32163m = btnPhoneVoice;
        this.f32142C = btnToTrans;
        this.f32143F = buttomView;
        this.f32144H = contentRoot;
        this.f32145L = emptyView;
        this.f32146M = imgExchange;
        this.f32148N = imgTransView;
        this.f32149Q = imgVoice;
        this.f32151X = ivBackBtn;
        this.f32152Y = rlBottom;
        this.f32153Z = title;
        this.f32147M1 = titleLayout;
        this.f32150V1 = tvTitle;
        this.f32154Z1 = txtEmptyTransTip;
        this.f32156a2 = txtVoiceValue;
        this.f32158b2 = voiceView;
    }

    @efb
    public static C5194e9 bind(@efb View rootView) {
        int i = C2558R.id.ai_demo_rc;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C2558R.id.bottomEditView;
            BottomEditView bottomEditView = (BottomEditView) l8i.findChildViewById(rootView, i);
            if (bottomEditView != null) {
                i = C2558R.id.btn_ear_send;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.btn_edit;
                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = C2558R.id.btn_from_trans;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C2558R.id.btn_phone_voice;
                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                i = C2558R.id.btn_to_trans;
                                TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView4 != null) {
                                    i = C2558R.id.buttom_view;
                                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout != null) {
                                        i = C2558R.id.content_root;
                                        LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout2 != null) {
                                            i = C2558R.id.empty_view;
                                            LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout3 != null) {
                                                i = C2558R.id.img_exchange;
                                                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView2 != null) {
                                                    i = C2558R.id.img_trans_view;
                                                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                                    if (imageView3 != null) {
                                                        i = C2558R.id.img_voice;
                                                        ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                                        if (imageView4 != null) {
                                                            i = C2558R.id.iv_back_btn;
                                                            ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                                            if (imageView5 != null) {
                                                                i = C2558R.id.rl_bottom;
                                                                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                if (relativeLayout != null) {
                                                                    i = C2558R.id.title;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                    if (relativeLayout2 != null) {
                                                                        i = C2558R.id.title_layout;
                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                        if (relativeLayout3 != null) {
                                                                            i = C2558R.id.tv_title;
                                                                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                            if (textView5 != null) {
                                                                                i = C2558R.id.txt_empty_trans_tip;
                                                                                TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                if (textView6 != null) {
                                                                                    i = C2558R.id.txt_voice_value;
                                                                                    TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                    if (textView7 != null) {
                                                                                        i = C2558R.id.voice_view;
                                                                                        LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                        if (linearLayout4 != null) {
                                                                                            return new C5194e9((RelativeLayout) rootView, recyclerView, bottomEditView, textView, imageView, textView2, textView3, textView4, linearLayout, linearLayout2, linearLayout3, imageView2, imageView3, imageView4, imageView5, relativeLayout, relativeLayout2, relativeLayout3, textView5, textView6, textView7, linearLayout4);
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
    public static C5194e9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C5194e9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_ai_tarns_eyevue, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f32155a;
    }
}
