package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class lu6 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final CardView f58765C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f58766F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f58767H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f58768L;

    /* JADX INFO: renamed from: M */
    @efb
    public final LinearLayout f58769M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f58770M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final RelativeLayout f58771N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final RecyclerView f58772Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f58773V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final RelativeLayout f58774X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final RelativeLayout f58775Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f58776Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final TextView f58777Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f58778a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final TextView f58779a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f58780b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f58781c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f58782d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f58783e;

    /* JADX INFO: renamed from: f */
    @efb
    public final RelativeLayout f58784f;

    /* JADX INFO: renamed from: m */
    @efb
    public final View f58785m;

    private lu6(@efb ConstraintLayout rootView, @efb ImageView btnAiPermission, @efb ImageView btnDuplex, @efb ImageView btnEdit, @efb TextView btnFromTrans, @efb RelativeLayout btnStart, @efb View btnTestPcm, @efb CardView cardStart, @efb ImageView imgArrow, @efb ImageView ivTouchImg, @efb LinearLayout llAiModel, @efb LinearLayout llEmpty, @efb RelativeLayout rlBottom, @efb RecyclerView rlList, @efb RelativeLayout rlTitle, @efb RelativeLayout title, @efb TextView tvAiModel, @efb TextView tvAiTip, @efb TextView tvEmpty, @efb TextView tvStart, @efb TextView tvTitle) {
        this.f58778a = rootView;
        this.f58780b = btnAiPermission;
        this.f58781c = btnDuplex;
        this.f58782d = btnEdit;
        this.f58783e = btnFromTrans;
        this.f58784f = btnStart;
        this.f58785m = btnTestPcm;
        this.f58765C = cardStart;
        this.f58766F = imgArrow;
        this.f58767H = ivTouchImg;
        this.f58768L = llAiModel;
        this.f58769M = llEmpty;
        this.f58771N = rlBottom;
        this.f58772Q = rlList;
        this.f58774X = rlTitle;
        this.f58775Y = title;
        this.f58776Z = tvAiModel;
        this.f58770M1 = tvAiTip;
        this.f58773V1 = tvEmpty;
        this.f58777Z1 = tvStart;
        this.f58779a2 = tvTitle;
    }

    @efb
    public static lu6 bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.btn_ai_permission;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.btn_duplex;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2558R.id.btn_edit;
                ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView3 != null) {
                    i = C2558R.id.btn_from_trans;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2558R.id.btn_start;
                        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                        if (relativeLayout != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.btn_test_pcm))) != null) {
                            i = C2558R.id.card_start;
                            CardView cardView = (CardView) l8i.findChildViewById(rootView, i);
                            if (cardView != null) {
                                i = C2558R.id.img_arrow;
                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView4 != null) {
                                    i = C2558R.id.iv_touch_img;
                                    ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView5 != null) {
                                        i = C2558R.id.ll_ai_model;
                                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout != null) {
                                            i = C2558R.id.ll_empty;
                                            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout2 != null) {
                                                i = C2558R.id.rl_bottom;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                if (relativeLayout2 != null) {
                                                    i = C2558R.id.rl_list;
                                                    RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                                                    if (recyclerView != null) {
                                                        i = C2558R.id.rl_title;
                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                        if (relativeLayout3 != null) {
                                                            i = C2558R.id.title;
                                                            RelativeLayout relativeLayout4 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                            if (relativeLayout4 != null) {
                                                                i = C2558R.id.tv_ai_model;
                                                                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView2 != null) {
                                                                    i = C2558R.id.tv_ai_tip;
                                                                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView3 != null) {
                                                                        i = C2558R.id.tv_empty;
                                                                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                                        if (textView4 != null) {
                                                                            i = C2558R.id.tv_start;
                                                                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                                            if (textView5 != null) {
                                                                                i = C2558R.id.tv_title;
                                                                                TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                                if (textView6 != null) {
                                                                                    return new lu6((ConstraintLayout) rootView, imageView, imageView2, imageView3, textView, relativeLayout, viewFindChildViewById, cardView, imageView4, imageView5, linearLayout, linearLayout2, relativeLayout2, recyclerView, relativeLayout3, relativeLayout4, textView2, textView3, textView4, textView5, textView6);
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
    public static lu6 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static lu6 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.fragment_eyevue_ai, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f58778a;
    }
}
