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
import com.watchfun.callvideo.C4008R;

/* JADX INFO: renamed from: pd */
/* JADX INFO: loaded from: classes6.dex */
public final class C10914pd implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ConstraintLayout f70403C;

    /* JADX INFO: renamed from: F */
    @efb
    public final FrameLayout f70404F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f70405H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f70406L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f70407M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f70408M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f70409N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextureView f70410Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f70411V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final RecyclerView f70412X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final View f70413Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f70414Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final TextureView f70415Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f70416a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f70417b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f70418c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f70419d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f70420e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f70421f;

    /* JADX INFO: renamed from: m */
    @efb
    public final Chronometer f70422m;

    private C10914pd(@efb ConstraintLayout constraintLayout, @efb TextView textView, @efb ImageView imageView, @efb ImageView imageView2, @efb ImageView imageView3, @efb TextView textView2, @efb Chronometer chronometer, @efb ConstraintLayout constraintLayout2, @efb FrameLayout frameLayout, @efb ImageView imageView4, @efb ImageView imageView5, @efb ImageView imageView6, @efb ImageView imageView7, @efb TextureView textureView, @efb RecyclerView recyclerView, @efb View view, @efb TextView textView3, @efb TextView textView4, @efb TextView textView5, @efb TextureView textureView2) {
        this.f70416a = constraintLayout;
        this.f70417b = textView;
        this.f70418c = imageView;
        this.f70419d = imageView2;
        this.f70420e = imageView3;
        this.f70421f = textView2;
        this.f70422m = chronometer;
        this.f70403C = constraintLayout2;
        this.f70404F = frameLayout;
        this.f70405H = imageView4;
        this.f70406L = imageView5;
        this.f70407M = imageView6;
        this.f70409N = imageView7;
        this.f70410Q = textureView;
        this.f70412X = recyclerView;
        this.f70413Y = view;
        this.f70414Z = textView3;
        this.f70408M1 = textView4;
        this.f70411V1 = textView5;
        this.f70415Z1 = textureView2;
    }

    @efb
    public static C10914pd bind(@efb View view) {
        View viewFindViewById;
        int i = C4008R.id.btn_from_trans;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4008R.id.btn_hangup;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = C4008R.id.btn_mic;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = C4008R.id.btn_sound;
                    ImageView imageView3 = (ImageView) view.findViewById(i);
                    if (imageView3 != null) {
                        i = C4008R.id.btn_to_trans;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = C4008R.id.ch_time;
                            Chronometer chronometer = (Chronometer) view.findViewById(i);
                            if (chronometer != null) {
                                i = C4008R.id.cl_top;
                                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                                if (constraintLayout != null) {
                                    i = C4008R.id.fl_camera_otherperview_tip;
                                    FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                                    if (frameLayout != null) {
                                        i = C4008R.id.iv_back;
                                        ImageView imageView4 = (ImageView) view.findViewById(i);
                                        if (imageView4 != null) {
                                            i = C4008R.id.iv_camera;
                                            ImageView imageView5 = (ImageView) view.findViewById(i);
                                            if (imageView5 != null) {
                                                i = C4008R.id.iv_camera_perview;
                                                ImageView imageView6 = (ImageView) view.findViewById(i);
                                                if (imageView6 != null) {
                                                    i = C4008R.id.iv_exchange;
                                                    ImageView imageView7 = (ImageView) view.findViewById(i);
                                                    if (imageView7 != null) {
                                                        i = C4008R.id.other_previewView;
                                                        TextureView textureView = (TextureView) view.findViewById(i);
                                                        if (textureView != null) {
                                                            i = C4008R.id.rv_messagelist;
                                                            RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                                                            if (recyclerView != null && (viewFindViewById = view.findViewById((i = C4008R.id.touch_view))) != null) {
                                                                i = C4008R.id.tv_camera_perview_tip;
                                                                TextView textView3 = (TextView) view.findViewById(i);
                                                                if (textView3 != null) {
                                                                    i = C4008R.id.tv_tip_network;
                                                                    TextView textView4 = (TextView) view.findViewById(i);
                                                                    if (textView4 != null) {
                                                                        i = C4008R.id.tv_waiting_tip;
                                                                        TextView textView5 = (TextView) view.findViewById(i);
                                                                        if (textView5 != null) {
                                                                            i = C4008R.id.user_previewView;
                                                                            TextureView textureView2 = (TextureView) view.findViewById(i);
                                                                            if (textureView2 != null) {
                                                                                return new C10914pd((ConstraintLayout) view, textView, imageView, imageView2, imageView3, textView2, chronometer, constraintLayout, frameLayout, imageView4, imageView5, imageView6, imageView7, textureView, recyclerView, viewFindViewById, textView3, textView4, textView5, textureView2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C10914pd inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C10914pd inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4008R.layout.activity_video_chat, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f70416a;
    }
}
