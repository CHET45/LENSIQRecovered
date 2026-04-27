package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.widget.BottomEditView;

/* JADX INFO: renamed from: mb */
/* JADX INFO: loaded from: classes6.dex */
public final class C9243mb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final Chronometer f60371C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f60372F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f60373H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f60374L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f60375M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final ImageView f60376M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f60377N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f60378Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final FrameLayout f60379V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f60380X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final ImageView f60381Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final ImageView f60382Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final RelativeLayout f60383Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f60384a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final RecyclerView f60385a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final BottomEditView f60386b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final RecyclerView f60387b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f60388c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final RelativeLayout f60389c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f60390d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final TextView f60391d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f60392e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final TextView f60393e2;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f60394f;

    /* JADX INFO: renamed from: f2 */
    @efb
    public final LinearLayout f60395f2;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f60396m;

    private C9243mb(@efb RelativeLayout rootView, @efb BottomEditView bottomEditView, @efb ImageView btnFlipRvSource, @efb TextView btnFromTrans, @efb LinearLayout btnStart, @efb LinearLayout btnStartLayout, @efb TextView btnToTrans, @efb Chronometer chronometer, @efb LinearLayout contentRoot, @efb LinearLayout emptyView, @efb ImageView icRecord, @efb ImageView imageViews, @efb ImageView imgExchange, @efb ImageView imgTransView, @efb ImageView imgVoice, @efb ImageView ivBackBtn, @efb ImageView ivControlRecord, @efb ImageView ivFinish, @efb FrameLayout layoutTranslated, @efb RelativeLayout rlBottom, @efb RecyclerView rvSource, @efb RecyclerView rvTranslated, @efb RelativeLayout titleLayout, @efb TextView tvButtonHint, @efb TextView txtVoiceValue, @efb LinearLayout voiceView) {
        this.f60384a = rootView;
        this.f60386b = bottomEditView;
        this.f60388c = btnFlipRvSource;
        this.f60390d = btnFromTrans;
        this.f60392e = btnStart;
        this.f60394f = btnStartLayout;
        this.f60396m = btnToTrans;
        this.f60371C = chronometer;
        this.f60372F = contentRoot;
        this.f60373H = emptyView;
        this.f60374L = icRecord;
        this.f60375M = imageViews;
        this.f60377N = imgExchange;
        this.f60378Q = imgTransView;
        this.f60380X = imgVoice;
        this.f60381Y = ivBackBtn;
        this.f60382Z = ivControlRecord;
        this.f60376M1 = ivFinish;
        this.f60379V1 = layoutTranslated;
        this.f60383Z1 = rlBottom;
        this.f60385a2 = rvSource;
        this.f60387b2 = rvTranslated;
        this.f60389c2 = titleLayout;
        this.f60391d2 = tvButtonHint;
        this.f60393e2 = txtVoiceValue;
        this.f60395f2 = voiceView;
    }

    @efb
    public static C9243mb bind(@efb View rootView) {
        int i = C4035R.id.bottomEditView;
        BottomEditView bottomEditView = (BottomEditView) l8i.findChildViewById(rootView, i);
        if (bottomEditView != null) {
            i = C4035R.id.btn_flip_rv_source;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
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
                                i = C4035R.id.chronometer;
                                Chronometer chronometer = (Chronometer) l8i.findChildViewById(rootView, i);
                                if (chronometer != null) {
                                    i = C4035R.id.content_root;
                                    LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout3 != null) {
                                        i = C4035R.id.empty_view;
                                        LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout4 != null) {
                                            i = C4035R.id.ic_record;
                                            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                            if (imageView2 != null) {
                                                i = C4035R.id.imageViews;
                                                ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView3 != null) {
                                                    i = C4035R.id.img_exchange;
                                                    ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                                    if (imageView4 != null) {
                                                        i = C4035R.id.img_trans_view;
                                                        ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                                        if (imageView5 != null) {
                                                            i = C4035R.id.img_voice;
                                                            ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                                            if (imageView6 != null) {
                                                                i = C4035R.id.iv_back_btn;
                                                                ImageView imageView7 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                if (imageView7 != null) {
                                                                    i = C4035R.id.iv_control_record;
                                                                    ImageView imageView8 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                    if (imageView8 != null) {
                                                                        i = C4035R.id.iv_finish;
                                                                        ImageView imageView9 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                        if (imageView9 != null) {
                                                                            i = C4035R.id.layout_translated;
                                                                            FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                                                                            if (frameLayout != null) {
                                                                                i = C4035R.id.rl_bottom;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                if (relativeLayout != null) {
                                                                                    i = C4035R.id.rv_source;
                                                                                    RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                                    if (recyclerView != null) {
                                                                                        i = C4035R.id.rv_translated;
                                                                                        RecyclerView recyclerView2 = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                                        if (recyclerView2 != null) {
                                                                                            i = C4035R.id.title_layout;
                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                                                            if (relativeLayout2 != null) {
                                                                                                i = C4035R.id.tv_button_hint;
                                                                                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                if (textView3 != null) {
                                                                                                    i = C4035R.id.txt_voice_value;
                                                                                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                                    if (textView4 != null) {
                                                                                                        i = C4035R.id.voice_view;
                                                                                                        LinearLayout linearLayout5 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                                                                                        if (linearLayout5 != null) {
                                                                                                            return new C9243mb((RelativeLayout) rootView, bottomEditView, imageView, textView, linearLayout, linearLayout2, textView2, chronometer, linearLayout3, linearLayout4, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, frameLayout, relativeLayout, recyclerView, recyclerView2, relativeLayout2, textView3, textView4, linearLayout5);
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
    public static C9243mb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C9243mb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_lucky_translation_machine, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f60384a;
    }
}
