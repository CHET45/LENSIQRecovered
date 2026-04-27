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

/* JADX INFO: renamed from: od */
/* JADX INFO: loaded from: classes6.dex */
public final class C10317od implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f67269C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f67270F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f67271H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f67272L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f67273M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f67274M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f67275N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f67276Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f67277V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final RelativeLayout f67278X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final RelativeLayout f67279Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f67280Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final LinearLayout f67281Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f67282a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f67283b;

    /* JADX INFO: renamed from: c */
    @efb
    public final BottomEditView f67284c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f67285d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f67286e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f67287f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f67288m;

    private C10317od(@efb RelativeLayout rootView, @efb RecyclerView aiDemoRc, @efb BottomEditView bottomEditView, @efb TextView btnFromTrans, @efb TextView btnLeftVoice, @efb TextView btnRightVoice, @efb TextView btnToTrans, @efb LinearLayout buttomView, @efb LinearLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBackBtn, @efb RelativeLayout title, @efb RelativeLayout titleLayout, @efb TextView tvTip, @efb TextView tvTitle, @efb TextView txtVoiceValue, @efb LinearLayout voiceView) {
        this.f67282a = rootView;
        this.f67283b = aiDemoRc;
        this.f67284c = bottomEditView;
        this.f67285d = btnFromTrans;
        this.f67286e = btnLeftVoice;
        this.f67287f = btnRightVoice;
        this.f67288m = btnToTrans;
        this.f67269C = buttomView;
        this.f67270F = contentRoot;
        this.f67271H = emptyView;
        this.f67272L = imgExchange;
        this.f67273M = imgTransView;
        this.f67275N = imgVoice;
        this.f67276Q = ivBackBtn;
        this.f67278X = title;
        this.f67279Y = titleLayout;
        this.f67280Z = tvTip;
        this.f67274M1 = tvTitle;
        this.f67277V1 = txtVoiceValue;
        this.f67281Z1 = voiceView;
    }

    @efb
    public static C10317od bind(@efb View rootView) {
        int i = C4035R.id.ai_demo_rc;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C4035R.id.bottomEditView;
            BottomEditView bottomEditView = (BottomEditView) l8i.findChildViewById(rootView, i);
            if (bottomEditView != null) {
                i = C4035R.id.btn_from_trans;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C4035R.id.btn_left_voice;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = C4035R.id.btn_right_voice;
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
                                                            i = C4035R.id.title;
                                                            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                            if (relativeLayout != null) {
                                                                i = C4035R.id.title_layout;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                if (relativeLayout2 != null) {
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
                                                                                LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                if (linearLayout4 != null) {
                                                                                    return new C10317od((RelativeLayout) rootView, recyclerView, bottomEditView, textView, textView2, textView3, textView4, linearLayout, linearLayout2, linearLayout3, imageView, imageView2, imageView3, imageView4, relativeLayout, relativeLayout2, textView5, textView6, textView7, linearLayout4);
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
    public static C10317od inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C10317od inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_two_ear_tarns, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f67282a;
    }
}
