package p000;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: qd */
/* JADX INFO: loaded from: classes4.dex */
public final class C11432qd implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ConstraintLayout f73991C;

    /* JADX INFO: renamed from: F */
    @efb
    public final FrameLayout f73992F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f73993H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f73994L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f73995M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f73996M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f73997N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextureView f73998Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f73999V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final RecyclerView f74000X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final View f74001Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f74002Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final TextureView f74003Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f74004a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f74005b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f74006c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f74007d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f74008e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f74009f;

    /* JADX INFO: renamed from: m */
    @efb
    public final Chronometer f74010m;

    private C11432qd(@efb ConstraintLayout rootView, @efb TextView btnFromTrans, @efb ImageView btnHangup, @efb ImageView btnMic, @efb ImageView btnSound, @efb TextView btnToTrans, @efb Chronometer chTime, @efb ConstraintLayout clTop, @efb FrameLayout flCameraOtherperviewTip, @efb ImageView ivBack, @efb ImageView ivCamera, @efb ImageView ivCameraPerview, @efb ImageView ivExchange, @efb TextureView otherPreviewView, @efb RecyclerView rvMessagelist, @efb View touchView, @efb TextView tvCameraPerviewTip, @efb TextView tvTipNetwork, @efb TextView tvWaitingTip, @efb TextureView userPreviewView) {
        this.f74004a = rootView;
        this.f74005b = btnFromTrans;
        this.f74006c = btnHangup;
        this.f74007d = btnMic;
        this.f74008e = btnSound;
        this.f74009f = btnToTrans;
        this.f74010m = chTime;
        this.f73991C = clTop;
        this.f73992F = flCameraOtherperviewTip;
        this.f73993H = ivBack;
        this.f73994L = ivCamera;
        this.f73995M = ivCameraPerview;
        this.f73997N = ivExchange;
        this.f73998Q = otherPreviewView;
        this.f74000X = rvMessagelist;
        this.f74001Y = touchView;
        this.f74002Z = tvCameraPerviewTip;
        this.f73996M1 = tvTipNetwork;
        this.f73999V1 = tvWaitingTip;
        this.f74003Z1 = userPreviewView;
    }

    @efb
    public static C11432qd bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.btn_from_trans;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.btn_hangup;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2558R.id.btn_mic;
                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = C2558R.id.btn_sound;
                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = C2558R.id.btn_to_trans;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C2558R.id.ch_time;
                            Chronometer chronometer = (Chronometer) l8i.findChildViewById(rootView, i);
                            if (chronometer != null) {
                                i = C2558R.id.cl_top;
                                ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
                                if (constraintLayout != null) {
                                    i = C2558R.id.fl_camera_otherperview_tip;
                                    FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                                    if (frameLayout != null) {
                                        i = C2558R.id.iv_back;
                                        ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                        if (imageView4 != null) {
                                            i = C2558R.id.iv_camera;
                                            ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                            if (imageView5 != null) {
                                                i = C2558R.id.iv_camera_perview;
                                                ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView6 != null) {
                                                    i = C2558R.id.iv_exchange;
                                                    ImageView imageView7 = (ImageView) l8i.findChildViewById(rootView, i);
                                                    if (imageView7 != null) {
                                                        i = C2558R.id.other_previewView;
                                                        TextureView textureView = (TextureView) l8i.findChildViewById(rootView, i);
                                                        if (textureView != null) {
                                                            i = C2558R.id.rv_messagelist;
                                                            RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                            if (recyclerView != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.touch_view))) != null) {
                                                                i = C2558R.id.tv_camera_perview_tip;
                                                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView3 != null) {
                                                                    i = C2558R.id.tv_tip_network;
                                                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView4 != null) {
                                                                        i = C2558R.id.tv_waiting_tip;
                                                                        TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                        if (textView5 != null) {
                                                                            i = C2558R.id.user_previewView;
                                                                            TextureView textureView2 = (TextureView) l8i.findChildViewById(rootView, i);
                                                                            if (textureView2 != null) {
                                                                                return new C11432qd((ConstraintLayout) rootView, textView, imageView, imageView2, imageView3, textView2, chronometer, constraintLayout, frameLayout, imageView4, imageView5, imageView6, imageView7, textureView, recyclerView, viewFindChildViewById, textView3, textView4, textView5, textureView2);
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
    public static C11432qd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C11432qd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_video_chat, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f74004a;
    }
}
