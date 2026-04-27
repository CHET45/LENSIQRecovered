package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.aichat.C3993R;
import com.watchfun.transcommon.widget.BottomEditView;

/* JADX INFO: loaded from: classes6.dex */
public final class iu6 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f48472C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f48473F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f48474H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f48475L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f48476M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final ImageView f48477M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f48478N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final LinearLayout f48479Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final LinearLayout f48480V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f48481X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final ImageView f48482Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final ImageView f48483Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final LinearLayout f48484Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f48485a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final LinearLayout f48486a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f48487b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final LinearLayout f48488b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final BottomEditView f48489c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final TextView f48490c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f48491d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final TextView f48492d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f48493e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final TextView f48494e2;

    /* JADX INFO: renamed from: f */
    @efb
    public final EditText f48495f;

    /* JADX INFO: renamed from: f2 */
    @efb
    public final TextView f48496f2;

    /* JADX INFO: renamed from: g2 */
    @efb
    public final TextView f48497g2;

    /* JADX INFO: renamed from: h2 */
    @efb
    public final View f48498h2;

    /* JADX INFO: renamed from: i2 */
    @efb
    public final LinearLayout f48499i2;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f48500m;

    private iu6(@efb RelativeLayout relativeLayout, @efb RecyclerView recyclerView, @efb BottomEditView bottomEditView, @efb LinearLayout linearLayout, @efb RelativeLayout relativeLayout2, @efb EditText editText, @efb TextView textView, @efb TextView textView2, @efb LinearLayout linearLayout2, @efb ImageView imageView, @efb LinearLayout linearLayout3, @efb ImageView imageView2, @efb TextView textView3, @efb LinearLayout linearLayout4, @efb ImageView imageView3, @efb ImageView imageView4, @efb ImageView imageView5, @efb ImageView imageView6, @efb LinearLayout linearLayout5, @efb LinearLayout linearLayout6, @efb LinearLayout linearLayout7, @efb LinearLayout linearLayout8, @efb TextView textView4, @efb TextView textView5, @efb TextView textView6, @efb TextView textView7, @efb TextView textView8, @efb View view, @efb LinearLayout linearLayout9) {
        this.f48485a = relativeLayout;
        this.f48487b = recyclerView;
        this.f48489c = bottomEditView;
        this.f48491d = linearLayout;
        this.f48493e = relativeLayout2;
        this.f48495f = editText;
        this.f48500m = textView;
        this.f48472C = textView2;
        this.f48473F = linearLayout2;
        this.f48474H = imageView;
        this.f48475L = linearLayout3;
        this.f48476M = imageView2;
        this.f48478N = textView3;
        this.f48479Q = linearLayout4;
        this.f48481X = imageView3;
        this.f48482Y = imageView4;
        this.f48483Z = imageView5;
        this.f48477M1 = imageView6;
        this.f48480V1 = linearLayout5;
        this.f48484Z1 = linearLayout6;
        this.f48486a2 = linearLayout7;
        this.f48488b2 = linearLayout8;
        this.f48490c2 = textView4;
        this.f48492d2 = textView5;
        this.f48494e2 = textView6;
        this.f48496f2 = textView7;
        this.f48497g2 = textView8;
        this.f48498h2 = view;
        this.f48499i2 = linearLayout9;
    }

    @efb
    public static iu6 bind(@efb View view) {
        View viewFindViewById;
        int i = C3993R.id.ai_rc;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
        if (recyclerView != null) {
            i = C3993R.id.bottomEditView;
            BottomEditView bottomEditView = (BottomEditView) view.findViewById(i);
            if (bottomEditView != null) {
                i = C3993R.id.bottom_view;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                if (linearLayout != null) {
                    i = C3993R.id.bottom_view_layout;
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                    if (relativeLayout != null) {
                        i = C3993R.id.btn_et;
                        EditText editText = (EditText) view.findViewById(i);
                        if (editText != null) {
                            i = C3993R.id.btn_from_trans;
                            TextView textView = (TextView) view.findViewById(i);
                            if (textView != null) {
                                i = C3993R.id.btn_record_send;
                                TextView textView2 = (TextView) view.findViewById(i);
                                if (textView2 != null) {
                                    i = C3993R.id.content_root;
                                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                                    if (linearLayout2 != null) {
                                        i = C3993R.id.empty_icon;
                                        ImageView imageView = (ImageView) view.findViewById(i);
                                        if (imageView != null) {
                                            i = C3993R.id.ic_et_send;
                                            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                                            if (linearLayout3 != null) {
                                                i = C3993R.id.ic_record_send;
                                                ImageView imageView2 = (ImageView) view.findViewById(i);
                                                if (imageView2 != null) {
                                                    i = C3993R.id.ic_send;
                                                    TextView textView3 = (TextView) view.findViewById(i);
                                                    if (textView3 != null) {
                                                        i = C3993R.id.ic_send_view;
                                                        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(i);
                                                        if (linearLayout4 != null) {
                                                            i = C3993R.id.img_arrow;
                                                            ImageView imageView3 = (ImageView) view.findViewById(i);
                                                            if (imageView3 != null) {
                                                                i = C3993R.id.img_trans_voice;
                                                                ImageView imageView4 = (ImageView) view.findViewById(i);
                                                                if (imageView4 != null) {
                                                                    i = C3993R.id.img_voice;
                                                                    ImageView imageView5 = (ImageView) view.findViewById(i);
                                                                    if (imageView5 != null) {
                                                                        i = C3993R.id.iv_back;
                                                                        ImageView imageView6 = (ImageView) view.findViewById(i);
                                                                        if (imageView6 != null) {
                                                                            i = C3993R.id.ll_ai_model;
                                                                            LinearLayout linearLayout5 = (LinearLayout) view.findViewById(i);
                                                                            if (linearLayout5 != null) {
                                                                                i = C3993R.id.ll_empty;
                                                                                LinearLayout linearLayout6 = (LinearLayout) view.findViewById(i);
                                                                                if (linearLayout6 != null) {
                                                                                    i = C3993R.id.ll_online_search;
                                                                                    LinearLayout linearLayout7 = (LinearLayout) view.findViewById(i);
                                                                                    if (linearLayout7 != null) {
                                                                                        i = C3993R.id.ll_record_send;
                                                                                        LinearLayout linearLayout8 = (LinearLayout) view.findViewById(i);
                                                                                        if (linearLayout8 != null) {
                                                                                            i = C3993R.id.tv_ai_model;
                                                                                            TextView textView4 = (TextView) view.findViewById(i);
                                                                                            if (textView4 != null) {
                                                                                                i = C3993R.id.tv_edit;
                                                                                                TextView textView5 = (TextView) view.findViewById(i);
                                                                                                if (textView5 != null) {
                                                                                                    i = C3993R.id.tv_empty;
                                                                                                    TextView textView6 = (TextView) view.findViewById(i);
                                                                                                    if (textView6 != null) {
                                                                                                        i = C3993R.id.tv_title;
                                                                                                        TextView textView7 = (TextView) view.findViewById(i);
                                                                                                        if (textView7 != null) {
                                                                                                            i = C3993R.id.txt_voice_value;
                                                                                                            TextView textView8 = (TextView) view.findViewById(i);
                                                                                                            if (textView8 != null && (viewFindViewById = view.findViewById((i = C3993R.id.view_lines))) != null) {
                                                                                                                i = C3993R.id.voice_view;
                                                                                                                LinearLayout linearLayout9 = (LinearLayout) view.findViewById(i);
                                                                                                                if (linearLayout9 != null) {
                                                                                                                    return new iu6((RelativeLayout) view, recyclerView, bottomEditView, linearLayout, relativeLayout, editText, textView, textView2, linearLayout2, imageView, linearLayout3, imageView2, textView3, linearLayout4, imageView3, imageView4, imageView5, imageView6, linearLayout5, linearLayout6, linearLayout7, linearLayout8, textView4, textView5, textView6, textView7, textView8, viewFindViewById, linearLayout9);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static iu6 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static iu6 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C3993R.layout.fragment_chat_ai, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f48485a;
    }
}
