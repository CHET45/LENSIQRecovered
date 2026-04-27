package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;
import com.watchfun.transphoto.widget.TouchImageView;

/* JADX INFO: renamed from: ub */
/* JADX INFO: loaded from: classes4.dex */
public final class C13441ub implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f87339C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f87340F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f87341H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f87342L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f87343M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final ImageView f87344M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f87345N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TouchImageView f87346Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final View f87347V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f87348X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final ImageView f87349Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final ImageView f87350Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final View f87351Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f87352a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final RecyclerView f87353a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final ConstraintLayout f87354b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final RecyclerView f87355b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final ConstraintLayout f87356c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final TextView f87357c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final ConstraintLayout f87358d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final TextView f87359d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final ConstraintLayout f87360e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final TextView f87361e2;

    /* JADX INFO: renamed from: f */
    @efb
    public final ConstraintLayout f87362f;

    /* JADX INFO: renamed from: m */
    @efb
    public final FrameLayout f87363m;

    private C13441ub(@efb ConstraintLayout rootView, @efb ConstraintLayout clBottom, @efb ConstraintLayout clDown, @efb ConstraintLayout clHome, @efb ConstraintLayout clLine, @efb ConstraintLayout clUp, @efb FrameLayout frBack, @efb ImageView ivAlbum, @efb ImageView ivCancel, @efb ImageView ivConfirm, @efb ImageView ivDown, @efb ImageView ivExchange, @efb ImageView ivExchangeUp, @efb TouchImageView ivPhoto, @efb ImageView ivReset, @efb ImageView ivScanAnim, @efb ImageView ivTakePhoto, @efb ImageView ivUp, @efb View line, @efb View line2, @efb RecyclerView rvLanguage, @efb RecyclerView rvLeftLanguage, @efb TextView tvChooselang, @efb TextView tvFrom, @efb TextView tvTo) {
        this.f87352a = rootView;
        this.f87354b = clBottom;
        this.f87356c = clDown;
        this.f87358d = clHome;
        this.f87360e = clLine;
        this.f87362f = clUp;
        this.f87363m = frBack;
        this.f87339C = ivAlbum;
        this.f87340F = ivCancel;
        this.f87341H = ivConfirm;
        this.f87342L = ivDown;
        this.f87343M = ivExchange;
        this.f87345N = ivExchangeUp;
        this.f87346Q = ivPhoto;
        this.f87348X = ivReset;
        this.f87349Y = ivScanAnim;
        this.f87350Z = ivTakePhoto;
        this.f87344M1 = ivUp;
        this.f87347V1 = line;
        this.f87351Z1 = line2;
        this.f87353a2 = rvLanguage;
        this.f87355b2 = rvLeftLanguage;
        this.f87357c2 = tvChooselang;
        this.f87359d2 = tvFrom;
        this.f87361e2 = tvTo;
    }

    @efb
    public static C13441ub bind(@efb View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C2558R.id.cl_bottom;
        ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
        if (constraintLayout != null) {
            i = C2558R.id.cl_down;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) l8i.findChildViewById(rootView, i);
            if (constraintLayout2 != null) {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) rootView;
                i = C2558R.id.cl_line;
                ConstraintLayout constraintLayout4 = (ConstraintLayout) l8i.findChildViewById(rootView, i);
                if (constraintLayout4 != null) {
                    i = C2558R.id.cl_up;
                    ConstraintLayout constraintLayout5 = (ConstraintLayout) l8i.findChildViewById(rootView, i);
                    if (constraintLayout5 != null) {
                        i = C2558R.id.fr_back;
                        FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                        if (frameLayout != null) {
                            i = C2558R.id.iv_album;
                            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView != null) {
                                i = C2558R.id.iv_cancel;
                                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView2 != null) {
                                    i = C2558R.id.iv_confirm;
                                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView3 != null) {
                                        i = C2558R.id.iv_down;
                                        ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                        if (imageView4 != null) {
                                            i = C2558R.id.iv_exchange;
                                            ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                            if (imageView5 != null) {
                                                i = C2558R.id.iv_exchange_up;
                                                ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView6 != null) {
                                                    i = C2558R.id.iv_photo;
                                                    TouchImageView touchImageView = (TouchImageView) l8i.findChildViewById(rootView, i);
                                                    if (touchImageView != null) {
                                                        i = C2558R.id.iv_reset;
                                                        ImageView imageView7 = (ImageView) l8i.findChildViewById(rootView, i);
                                                        if (imageView7 != null) {
                                                            i = C2558R.id.iv_scan_anim;
                                                            ImageView imageView8 = (ImageView) l8i.findChildViewById(rootView, i);
                                                            if (imageView8 != null) {
                                                                i = C2558R.id.iv_takePhoto;
                                                                ImageView imageView9 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                if (imageView9 != null) {
                                                                    i = C2558R.id.iv_up;
                                                                    ImageView imageView10 = (ImageView) l8i.findChildViewById(rootView, i);
                                                                    if (imageView10 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.line))) != null && (viewFindChildViewById2 = l8i.findChildViewById(rootView, (i = C2558R.id.line_2))) != null) {
                                                                        i = C2558R.id.rv_language;
                                                                        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                        if (recyclerView != null) {
                                                                            i = C2558R.id.rv_left_language;
                                                                            RecyclerView recyclerView2 = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                                            if (recyclerView2 != null) {
                                                                                i = C2558R.id.tv_chooselang;
                                                                                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                                                                if (textView != null) {
                                                                                    i = C2558R.id.tv_from;
                                                                                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                    if (textView2 != null) {
                                                                                        i = C2558R.id.tv_to;
                                                                                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                        if (textView3 != null) {
                                                                                            return new C13441ub(constraintLayout3, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, touchImageView, imageView7, imageView8, imageView9, imageView10, viewFindChildViewById, viewFindChildViewById2, recyclerView, recyclerView2, textView, textView2, textView3);
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
    public static C13441ub inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C13441ub inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_photo_trans, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f87352a;
    }
}
