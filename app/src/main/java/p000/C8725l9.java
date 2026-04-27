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

/* JADX INFO: renamed from: l9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C8725l9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f56857C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f56858F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f56859H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f56860L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f56861M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f56862M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f56863N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final RelativeLayout f56864Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f56865V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final RelativeLayout f56866X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final RelativeLayout f56867Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f56868Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final LinearLayout f56869Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f56870a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f56871b;

    /* JADX INFO: renamed from: c */
    @efb
    public final BottomEditView f56872c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f56873d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f56874e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f56875f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f56876m;

    private C8725l9(@efb RelativeLayout rootView, @efb RecyclerView aiDemoRc, @efb BottomEditView bottomEditView, @efb TextView btnFromTrans, @efb LinearLayout btnStart, @efb TextView btnToTrans, @efb LinearLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView imageViews, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBackBtn, @efb RelativeLayout rlBottom, @efb RelativeLayout title, @efb RelativeLayout titleLayout, @efb TextView tvTip, @efb TextView tvTitle, @efb TextView txtVoiceValue, @efb LinearLayout voiceView) {
        this.f56870a = rootView;
        this.f56871b = aiDemoRc;
        this.f56872c = bottomEditView;
        this.f56873d = btnFromTrans;
        this.f56874e = btnStart;
        this.f56875f = btnToTrans;
        this.f56876m = contentRoot;
        this.f56857C = emptyView;
        this.f56858F = imageViews;
        this.f56859H = imgExchange;
        this.f56860L = imgTransView;
        this.f56861M = imgVoice;
        this.f56863N = ivBackBtn;
        this.f56864Q = rlBottom;
        this.f56866X = title;
        this.f56867Y = titleLayout;
        this.f56868Z = tvTip;
        this.f56862M1 = tvTitle;
        this.f56865V1 = txtVoiceValue;
        this.f56869Z1 = voiceView;
    }

    @efb
    public static C8725l9 bind(@efb View rootView) {
        int i = C4035R.id.ai_demo_rc;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C4035R.id.bottomEditView;
            BottomEditView bottomEditView = (BottomEditView) l8i.findChildViewById(rootView, i);
            if (bottomEditView != null) {
                i = C4035R.id.btn_from_trans;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C4035R.id.btn_start;
                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout != null) {
                        i = C4035R.id.btn_to_trans;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C4035R.id.content_root;
                            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout2 != null) {
                                i = C4035R.id.empty_view;
                                LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                if (linearLayout3 != null) {
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
                                                    i = C4035R.id.iv_back_btn;
                                                    ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                                    if (imageView5 != null) {
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
                                                                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView3 != null) {
                                                                        i = C4035R.id.tv_title;
                                                                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                        if (textView4 != null) {
                                                                            i = C4035R.id.txt_voice_value;
                                                                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                            if (textView5 != null) {
                                                                                i = C4035R.id.voice_view;
                                                                                LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                if (linearLayout4 != null) {
                                                                                    return new C8725l9((RelativeLayout) rootView, recyclerView, bottomEditView, textView, linearLayout, textView2, linearLayout2, linearLayout3, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, relativeLayout2, relativeLayout3, textView3, textView4, textView5, linearLayout4);
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
    public static C8725l9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C8725l9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_chat_freedom, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f56870a;
    }
}
