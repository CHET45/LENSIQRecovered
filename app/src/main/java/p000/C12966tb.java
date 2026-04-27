package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.transphoto.C4282R;
import com.watchfun.transphoto.widget.TouchImageView;

/* JADX INFO: renamed from: tb */
/* JADX INFO: loaded from: classes7.dex */
public final class C12966tb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f84109C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f84110F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f84111H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ImageView f84112L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f84113M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final ImageView f84114M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f84115N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TouchImageView f84116Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final View f84117V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f84118X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final ImageView f84119Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final ImageView f84120Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final RecyclerView f84121Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f84122a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final RecyclerView f84123a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final ConstraintLayout f84124b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final TextView f84125b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final ConstraintLayout f84126c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final TextView f84127c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final ConstraintLayout f84128d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final TextView f84129d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final ConstraintLayout f84130e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ConstraintLayout f84131f;

    /* JADX INFO: renamed from: m */
    @efb
    public final FrameLayout f84132m;

    private C12966tb(@efb ConstraintLayout constraintLayout, @efb ConstraintLayout constraintLayout2, @efb ConstraintLayout constraintLayout3, @efb ConstraintLayout constraintLayout4, @efb ConstraintLayout constraintLayout5, @efb ConstraintLayout constraintLayout6, @efb FrameLayout frameLayout, @efb ImageView imageView, @efb ImageView imageView2, @efb ImageView imageView3, @efb ImageView imageView4, @efb ImageView imageView5, @efb ImageView imageView6, @efb TouchImageView touchImageView, @efb ImageView imageView7, @efb ImageView imageView8, @efb ImageView imageView9, @efb ImageView imageView10, @efb View view, @efb RecyclerView recyclerView, @efb RecyclerView recyclerView2, @efb TextView textView, @efb TextView textView2, @efb TextView textView3) {
        this.f84122a = constraintLayout;
        this.f84124b = constraintLayout2;
        this.f84126c = constraintLayout3;
        this.f84128d = constraintLayout4;
        this.f84130e = constraintLayout5;
        this.f84131f = constraintLayout6;
        this.f84132m = frameLayout;
        this.f84109C = imageView;
        this.f84110F = imageView2;
        this.f84111H = imageView3;
        this.f84112L = imageView4;
        this.f84113M = imageView5;
        this.f84115N = imageView6;
        this.f84116Q = touchImageView;
        this.f84118X = imageView7;
        this.f84119Y = imageView8;
        this.f84120Z = imageView9;
        this.f84114M1 = imageView10;
        this.f84117V1 = view;
        this.f84121Z1 = recyclerView;
        this.f84123a2 = recyclerView2;
        this.f84125b2 = textView;
        this.f84127c2 = textView2;
        this.f84129d2 = textView3;
    }

    @efb
    public static C12966tb bind(@efb View view) {
        View viewFindChildViewById;
        int i = C4282R.id.cl_bottom;
        ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C4282R.id.cl_down;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) l8i.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                i = C4282R.id.cl_line;
                ConstraintLayout constraintLayout4 = (ConstraintLayout) l8i.findChildViewById(view, i);
                if (constraintLayout4 != null) {
                    i = C4282R.id.cl_up;
                    ConstraintLayout constraintLayout5 = (ConstraintLayout) l8i.findChildViewById(view, i);
                    if (constraintLayout5 != null) {
                        i = C4282R.id.fr_back;
                        FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = C4282R.id.iv_album;
                            ImageView imageView = (ImageView) l8i.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C4282R.id.iv_cancel;
                                ImageView imageView2 = (ImageView) l8i.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = C4282R.id.iv_confirm;
                                    ImageView imageView3 = (ImageView) l8i.findChildViewById(view, i);
                                    if (imageView3 != null) {
                                        i = C4282R.id.iv_down;
                                        ImageView imageView4 = (ImageView) l8i.findChildViewById(view, i);
                                        if (imageView4 != null) {
                                            i = C4282R.id.iv_exchange;
                                            ImageView imageView5 = (ImageView) l8i.findChildViewById(view, i);
                                            if (imageView5 != null) {
                                                i = C4282R.id.iv_exchange_up;
                                                ImageView imageView6 = (ImageView) l8i.findChildViewById(view, i);
                                                if (imageView6 != null) {
                                                    i = C4282R.id.iv_photo;
                                                    TouchImageView touchImageView = (TouchImageView) l8i.findChildViewById(view, i);
                                                    if (touchImageView != null) {
                                                        i = C4282R.id.iv_reset;
                                                        ImageView imageView7 = (ImageView) l8i.findChildViewById(view, i);
                                                        if (imageView7 != null) {
                                                            i = C4282R.id.iv_scan_anim;
                                                            ImageView imageView8 = (ImageView) l8i.findChildViewById(view, i);
                                                            if (imageView8 != null) {
                                                                i = C4282R.id.iv_takePhoto;
                                                                ImageView imageView9 = (ImageView) l8i.findChildViewById(view, i);
                                                                if (imageView9 != null) {
                                                                    i = C4282R.id.iv_up;
                                                                    ImageView imageView10 = (ImageView) l8i.findChildViewById(view, i);
                                                                    if (imageView10 != null && (viewFindChildViewById = l8i.findChildViewById(view, (i = C4282R.id.line))) != null) {
                                                                        i = C4282R.id.rv_language;
                                                                        RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(view, i);
                                                                        if (recyclerView != null) {
                                                                            i = C4282R.id.rv_left_language;
                                                                            RecyclerView recyclerView2 = (RecyclerView) l8i.findChildViewById(view, i);
                                                                            if (recyclerView2 != null) {
                                                                                i = C4282R.id.tv_chooselang;
                                                                                TextView textView = (TextView) l8i.findChildViewById(view, i);
                                                                                if (textView != null) {
                                                                                    i = C4282R.id.tv_from;
                                                                                    TextView textView2 = (TextView) l8i.findChildViewById(view, i);
                                                                                    if (textView2 != null) {
                                                                                        i = C4282R.id.tv_to;
                                                                                        TextView textView3 = (TextView) l8i.findChildViewById(view, i);
                                                                                        if (textView3 != null) {
                                                                                            return new C12966tb(constraintLayout3, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, touchImageView, imageView7, imageView8, imageView9, imageView10, viewFindChildViewById, recyclerView, recyclerView2, textView, textView2, textView3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C12966tb inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C12966tb inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4282R.layout.activity_photo_trans, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f84122a;
    }
}
