package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: gd */
/* JADX INFO: loaded from: classes4.dex */
public final class C6218gd implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f39366C;

    /* JADX INFO: renamed from: F */
    @efb
    public final RelativeLayout f39367F;

    /* JADX INFO: renamed from: H */
    @efb
    public final RelativeLayout f39368H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f39369L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ConstraintLayout f39370M;

    /* JADX INFO: renamed from: N */
    @efb
    public final RelativeLayout f39371N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final RelativeLayout f39372Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f39373X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final EditText f39374Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final EditText f39375Z;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f39376a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f39377b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f39378c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f39379d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f39380e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f39381f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f39382m;

    private C6218gd(@efb RelativeLayout rootView, @efb TextView btnFromTrans, @efb TextView btnToTrans, @efb ImageView frBack, @efb ImageView imgExchange, @efb ImageView ivCopy, @efb ImageView ivTrans, @efb ImageView ivVoice, @efb RelativeLayout llContent, @efb RelativeLayout llSource, @efb LinearLayout llTransBottom, @efb ConstraintLayout llTranslated, @efb RelativeLayout rlTitle, @efb RelativeLayout titleLayout, @efb TextView tvDel, @efb EditText tvSource, @efb EditText tvTrans) {
        this.f39376a = rootView;
        this.f39377b = btnFromTrans;
        this.f39378c = btnToTrans;
        this.f39379d = frBack;
        this.f39380e = imgExchange;
        this.f39381f = ivCopy;
        this.f39382m = ivTrans;
        this.f39366C = ivVoice;
        this.f39367F = llContent;
        this.f39368H = llSource;
        this.f39369L = llTransBottom;
        this.f39370M = llTranslated;
        this.f39371N = rlTitle;
        this.f39372Q = titleLayout;
        this.f39373X = tvDel;
        this.f39374Y = tvSource;
        this.f39375Z = tvTrans;
    }

    @efb
    public static C6218gd bind(@efb View rootView) {
        int i = C2558R.id.btn_from_trans;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.btn_to_trans;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.fr_back;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2558R.id.img_exchange;
                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = C2558R.id.iv_copy;
                        ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView3 != null) {
                            i = C2558R.id.iv_trans;
                            ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView4 != null) {
                                i = C2558R.id.iv_voice;
                                ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView5 != null) {
                                    i = C2558R.id.ll_content;
                                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                    if (relativeLayout != null) {
                                        i = C2558R.id.ll_source;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                        if (relativeLayout2 != null) {
                                            i = C2558R.id.ll_trans_bottom;
                                            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout != null) {
                                                i = C2558R.id.ll_translated;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
                                                if (constraintLayout != null) {
                                                    i = C2558R.id.rl_title;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                    if (relativeLayout3 != null) {
                                                        i = C2558R.id.title_layout;
                                                        RelativeLayout relativeLayout4 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                        if (relativeLayout4 != null) {
                                                            i = C2558R.id.tv_del;
                                                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                            if (textView3 != null) {
                                                                i = C2558R.id.tv_source;
                                                                EditText editText = (EditText) l8i.findChildViewById(rootView, i);
                                                                if (editText != null) {
                                                                    i = C2558R.id.tv_trans;
                                                                    EditText editText2 = (EditText) l8i.findChildViewById(rootView, i);
                                                                    if (editText2 != null) {
                                                                        return new C6218gd((RelativeLayout) rootView, textView, textView2, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, relativeLayout2, linearLayout, constraintLayout, relativeLayout3, relativeLayout4, textView3, editText, editText2);
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
    public static C6218gd inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C6218gd inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_text_translate, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f39376a;
    }
}
