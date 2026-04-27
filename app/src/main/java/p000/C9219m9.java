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

/* JADX INFO: renamed from: m9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9219m9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f60200C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f60201F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f60202H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f60203L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f60204M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f60205M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f60206N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final RelativeLayout f60207Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f60208V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final RelativeLayout f60209X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final RelativeLayout f60210Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f60211Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final LinearLayout f60212Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f60213a;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f60214b;

    /* JADX INFO: renamed from: c */
    @efb
    public final BottomEditView f60215c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f60216d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f60217e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f60218f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f60219m;

    private C9219m9(@efb RelativeLayout rootView, @efb RecyclerView aiDemoRc, @efb BottomEditView bottomEditView, @efb TextView btnFromTrans, @efb LinearLayout btnStart, @efb TextView btnToTrans, @efb LinearLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView imageViews, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBackBtn, @efb RelativeLayout rlBottom, @efb RelativeLayout title, @efb RelativeLayout titleLayout, @efb TextView tvTip, @efb TextView tvTitle, @efb TextView txtVoiceValue, @efb LinearLayout voiceView) {
        this.f60213a = rootView;
        this.f60214b = aiDemoRc;
        this.f60215c = bottomEditView;
        this.f60216d = btnFromTrans;
        this.f60217e = btnStart;
        this.f60218f = btnToTrans;
        this.f60219m = contentRoot;
        this.f60200C = emptyView;
        this.f60201F = imageViews;
        this.f60202H = imgExchange;
        this.f60203L = imgTransView;
        this.f60204M = imgVoice;
        this.f60206N = ivBackBtn;
        this.f60207Q = rlBottom;
        this.f60209X = title;
        this.f60210Y = titleLayout;
        this.f60211Z = tvTip;
        this.f60205M1 = tvTitle;
        this.f60208V1 = txtVoiceValue;
        this.f60212Z1 = voiceView;
    }

    @efb
    public static C9219m9 bind(@efb View rootView) {
        int i = C2558R.id.ai_demo_rc;
        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
        if (recyclerView != null) {
            i = C2558R.id.bottomEditView;
            BottomEditView bottomEditView = (BottomEditView) l8i.findChildViewById(rootView, i);
            if (bottomEditView != null) {
                i = C2558R.id.btn_from_trans;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.btn_start;
                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout != null) {
                        i = C2558R.id.btn_to_trans;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C2558R.id.content_root;
                            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout2 != null) {
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
                                                                    i = C2558R.id.tv_tip;
                                                                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView3 != null) {
                                                                        i = C2558R.id.tv_title;
                                                                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                        if (textView4 != null) {
                                                                            i = C2558R.id.txt_voice_value;
                                                                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                            if (textView5 != null) {
                                                                                i = C2558R.id.voice_view;
                                                                                LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                if (linearLayout4 != null) {
                                                                                    return new C9219m9((RelativeLayout) rootView, recyclerView, bottomEditView, textView, linearLayout, textView2, linearLayout2, linearLayout3, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, relativeLayout2, relativeLayout3, textView3, textView4, textView5, linearLayout4);
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
    public static C9219m9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C9219m9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_chat_freedom, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f60213a;
    }
}
