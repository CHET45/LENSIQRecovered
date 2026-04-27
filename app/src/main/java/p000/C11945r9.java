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

/* JADX INFO: renamed from: r9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11945r9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f77410C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f77411F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f77412H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f77413L;

    /* JADX INFO: renamed from: M */
    @efb
    public final LinearLayout f77414M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final LinearLayout f77415M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final ImageView f77416N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ImageView f77417Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final LinearLayout f77418V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final ImageView f77419X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final LinearLayout f77420Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final LinearLayout f77421Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final RelativeLayout f77422Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f77423a;

    /* JADX INFO: renamed from: a2 */
    @efb
    public final TextView f77424a2;

    /* JADX INFO: renamed from: b */
    @efb
    public final RecyclerView f77425b;

    /* JADX INFO: renamed from: b2 */
    @efb
    public final TextView f77426b2;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f77427c;

    /* JADX INFO: renamed from: c2 */
    @efb
    public final TextView f77428c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final RelativeLayout f77429d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final TextView f77430d2;

    /* JADX INFO: renamed from: e */
    @efb
    public final EditText f77431e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final View f77432e2;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f77433f;

    /* JADX INFO: renamed from: f2 */
    @efb
    public final LinearLayout f77434f2;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f77435m;

    private C11945r9(@efb LinearLayout linearLayout, @efb RecyclerView recyclerView, @efb LinearLayout linearLayout2, @efb RelativeLayout relativeLayout, @efb EditText editText, @efb TextView textView, @efb TextView textView2, @efb LinearLayout linearLayout3, @efb LinearLayout linearLayout4, @efb ImageView imageView, @efb TextView textView3, @efb LinearLayout linearLayout5, @efb ImageView imageView2, @efb ImageView imageView3, @efb ImageView imageView4, @efb LinearLayout linearLayout6, @efb LinearLayout linearLayout7, @efb LinearLayout linearLayout8, @efb LinearLayout linearLayout9, @efb RelativeLayout relativeLayout2, @efb TextView textView4, @efb TextView textView5, @efb TextView textView6, @efb TextView textView7, @efb View view, @efb LinearLayout linearLayout10) {
        this.f77423a = linearLayout;
        this.f77425b = recyclerView;
        this.f77427c = linearLayout2;
        this.f77429d = relativeLayout;
        this.f77431e = editText;
        this.f77433f = textView;
        this.f77435m = textView2;
        this.f77410C = linearLayout3;
        this.f77411F = linearLayout4;
        this.f77412H = imageView;
        this.f77413L = textView3;
        this.f77414M = linearLayout5;
        this.f77416N = imageView2;
        this.f77417Q = imageView3;
        this.f77419X = imageView4;
        this.f77420Y = linearLayout6;
        this.f77421Z = linearLayout7;
        this.f77415M1 = linearLayout8;
        this.f77418V1 = linearLayout9;
        this.f77422Z1 = relativeLayout2;
        this.f77424a2 = textView4;
        this.f77426b2 = textView5;
        this.f77428c2 = textView6;
        this.f77430d2 = textView7;
        this.f77432e2 = view;
        this.f77434f2 = linearLayout10;
    }

    @efb
    public static C11945r9 bind(@efb View view) {
        View viewFindViewById;
        int i = C3993R.id.ai_rc;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
        if (recyclerView != null) {
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
                                    i = C3993R.id.ic_et_send;
                                    LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                                    if (linearLayout3 != null) {
                                        i = C3993R.id.ic_record_send;
                                        ImageView imageView = (ImageView) view.findViewById(i);
                                        if (imageView != null) {
                                            i = C3993R.id.ic_send;
                                            TextView textView3 = (TextView) view.findViewById(i);
                                            if (textView3 != null) {
                                                i = C3993R.id.ic_send_view;
                                                LinearLayout linearLayout4 = (LinearLayout) view.findViewById(i);
                                                if (linearLayout4 != null) {
                                                    i = C3993R.id.img_arrow;
                                                    ImageView imageView2 = (ImageView) view.findViewById(i);
                                                    if (imageView2 != null) {
                                                        i = C3993R.id.img_voice;
                                                        ImageView imageView3 = (ImageView) view.findViewById(i);
                                                        if (imageView3 != null) {
                                                            i = C3993R.id.iv_back;
                                                            ImageView imageView4 = (ImageView) view.findViewById(i);
                                                            if (imageView4 != null) {
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
                                                                                i = C3993R.id.title;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                                                                                if (relativeLayout2 != null) {
                                                                                    i = C3993R.id.tv_ai_model;
                                                                                    TextView textView4 = (TextView) view.findViewById(i);
                                                                                    if (textView4 != null) {
                                                                                        i = C3993R.id.tv_empty;
                                                                                        TextView textView5 = (TextView) view.findViewById(i);
                                                                                        if (textView5 != null) {
                                                                                            i = C3993R.id.tv_title;
                                                                                            TextView textView6 = (TextView) view.findViewById(i);
                                                                                            if (textView6 != null) {
                                                                                                i = C3993R.id.txt_voice_value;
                                                                                                TextView textView7 = (TextView) view.findViewById(i);
                                                                                                if (textView7 != null && (viewFindViewById = view.findViewById((i = C3993R.id.view_lines))) != null) {
                                                                                                    i = C3993R.id.voice_view;
                                                                                                    LinearLayout linearLayout9 = (LinearLayout) view.findViewById(i);
                                                                                                    if (linearLayout9 != null) {
                                                                                                        return new C11945r9((LinearLayout) view, recyclerView, linearLayout, relativeLayout, editText, textView, textView2, linearLayout2, linearLayout3, imageView, textView3, linearLayout4, imageView2, imageView3, imageView4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, relativeLayout2, textView4, textView5, textView6, textView7, viewFindViewById, linearLayout9);
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
    public static C11945r9 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C11945r9 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C3993R.layout.activity_chatgpt_ai, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f77423a;
    }
}
