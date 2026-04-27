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

/* JADX INFO: renamed from: o9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10257o9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f66800C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f66801F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f66802H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f66803L;

    /* JADX INFO: renamed from: M */
    @efb
    public final LinearLayout f66804M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final ImageView f66805M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final LinearLayout f66806N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f66807Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final ImageView f66808V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f66809X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final ImageView f66810Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final ImageView f66811Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final RelativeLayout f66812Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f66813a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final RelativeLayout f66814a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f66815b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final RelativeLayout f66816b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final BottomEditView f66817c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final TextView f66818c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f66819d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final TextView f66820d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f66821e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final TextView f66822e2;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f66823f;

    /* JADX INFO: renamed from: f2 */
    @efb
    public final LinearLayout f66824f2;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f66825m;

    private C10257o9(@efb RelativeLayout rootView, @efb RecyclerView aiDemoRc, @efb BottomEditView bottomEditView, @efb TextView btnEarSend, @efb ImageView btnEdit, @efb TextView btnFromTrans, @efb LinearLayout btnPhoneLayout, @efb TextView btnPhoneVoice, @efb LinearLayout btnRightLayout, @efb TextView btnToTrans, @efb LinearLayout buttomView, @efb LinearLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView imageView, @efb ImageView imageViews, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBackBtn, @efb RelativeLayout rlBottom, @efb RelativeLayout title, @efb RelativeLayout titleLayout, @efb TextView tvTip, @efb TextView tvTitle, @efb TextView txtVoiceValue, @efb LinearLayout voiceView) {
        this.f66813a = rootView;
        this.f66815b = aiDemoRc;
        this.f66817c = bottomEditView;
        this.f66819d = btnEarSend;
        this.f66821e = btnEdit;
        this.f66823f = btnFromTrans;
        this.f66825m = btnPhoneLayout;
        this.f66800C = btnPhoneVoice;
        this.f66801F = btnRightLayout;
        this.f66802H = btnToTrans;
        this.f66803L = buttomView;
        this.f66804M = contentRoot;
        this.f66806N = emptyView;
        this.f66807Q = imageView;
        this.f66809X = imageViews;
        this.f66810Y = imgExchange;
        this.f66811Z = imgTransView;
        this.f66805M1 = imgVoice;
        this.f66808V1 = ivBackBtn;
        this.f66812Z1 = rlBottom;
        this.f66814a2 = title;
        this.f66816b2 = titleLayout;
        this.f66818c2 = tvTip;
        this.f66820d2 = tvTitle;
        this.f66822e2 = txtVoiceValue;
        this.f66824f2 = voiceView;
    }

    @efb
    public static C10257o9 bind(@efb View rootView) {
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
                            i = C2558R.id.btn_phone_layout;
                            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout != null) {
                                i = C2558R.id.btn_phone_voice;
                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    i = C2558R.id.btn_right_layout;
                                    LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout2 != null) {
                                        i = C2558R.id.btn_to_trans;
                                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView4 != null) {
                                            i = C2558R.id.buttom_view;
                                            LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout3 != null) {
                                                i = C2558R.id.content_root;
                                                LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                if (linearLayout4 != null) {
                                                    i = C2558R.id.empty_view;
                                                    LinearLayout linearLayout5 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                    if (linearLayout5 != null) {
                                                        i = C2558R.id.imageView;
                                                        ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                                        if (imageView2 != null) {
                                                            i = C2558R.id.imageViews;
                                                            ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                                            if (imageView3 != null) {
                                                                i = C2558R.id.img_exchange;
                                                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                if (imageView4 != null) {
                                                                    i = C2558R.id.img_trans_view;
                                                                    ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                    if (imageView5 != null) {
                                                                        i = C2558R.id.img_voice;
                                                                        ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                        if (imageView6 != null) {
                                                                            i = C2558R.id.iv_back_btn;
                                                                            ImageView imageView7 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                            if (imageView7 != null) {
                                                                                i = C2558R.id.rl_bottom;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                if (relativeLayout != null) {
                                                                                    i = C2558R.id.title;
                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                    if (relativeLayout2 != null) {
                                                                                        i = C2558R.id.title_layout;
                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                        if (relativeLayout3 != null) {
                                                                                            i = C2558R.id.tv_tip;
                                                                                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                            if (textView5 != null) {
                                                                                                i = C2558R.id.tv_title;
                                                                                                TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                if (textView6 != null) {
                                                                                                    i = C2558R.id.txt_voice_value;
                                                                                                    TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                    if (textView7 != null) {
                                                                                                        i = C2558R.id.voice_view;
                                                                                                        LinearLayout linearLayout6 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                                        if (linearLayout6 != null) {
                                                                                                            return new C10257o9((RelativeLayout) rootView, recyclerView, bottomEditView, textView, imageView, textView2, linearLayout, textView3, linearLayout2, textView4, linearLayout3, linearLayout4, linearLayout5, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, relativeLayout, relativeLayout2, relativeLayout3, textView5, textView6, textView7, linearLayout6);
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
    public static C10257o9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C10257o9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_chat_freely_eyevue, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f66813a;
    }
}
