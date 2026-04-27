package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: f9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5678f9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f35714C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f35715F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f35716H;

    /* JADX INFO: renamed from: L */
    @efb
    public final EditText f35717L;

    /* JADX INFO: renamed from: M */
    @efb
    public final RelativeLayout f35718M;

    /* JADX INFO: renamed from: N */
    @efb
    public final RelativeLayout f35719N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f35720Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f35721X;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f35722a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f35723b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f35724c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f35725d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f35726e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f35727f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f35728m;

    private C5678f9(@efb RelativeLayout rootView, @efb ImageView btnCopy, @efb ImageView btnDelete, @efb TextView btnFromTrans, @efb ImageView btnSound, @efb ImageView btnTextTrans, @efb TextView btnToTrans, @efb ImageView imgExchange, @efb ImageView ivBackBtn, @efb LinearLayout llOriginText, @efb EditText text, @efb RelativeLayout title, @efb RelativeLayout titleLayout, @efb TextView tvTitle, @efb TextView tvTranslate) {
        this.f35722a = rootView;
        this.f35723b = btnCopy;
        this.f35724c = btnDelete;
        this.f35725d = btnFromTrans;
        this.f35726e = btnSound;
        this.f35727f = btnTextTrans;
        this.f35728m = btnToTrans;
        this.f35714C = imgExchange;
        this.f35715F = ivBackBtn;
        this.f35716H = llOriginText;
        this.f35717L = text;
        this.f35718M = title;
        this.f35719N = titleLayout;
        this.f35720Q = tvTitle;
        this.f35721X = tvTranslate;
    }

    @efb
    public static C5678f9 bind(@efb View rootView) {
        int i = C2558R.id.btn_copy;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.btn_delete;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2558R.id.btn_from_trans;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.btn_sound;
                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = C2558R.id.btn_text_trans;
                        ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView4 != null) {
                            i = C2558R.id.btn_to_trans;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = C2558R.id.img_exchange;
                                ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView5 != null) {
                                    i = C2558R.id.iv_back_btn;
                                    ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView6 != null) {
                                        i = C2558R.id.ll_origin_text;
                                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout != null) {
                                            i = C2558R.id.text;
                                            EditText editText = (EditText) l8i.findChildViewById(rootView, i);
                                            if (editText != null) {
                                                i = C2558R.id.title;
                                                RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                if (relativeLayout != null) {
                                                    i = C2558R.id.title_layout;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                    if (relativeLayout2 != null) {
                                                        i = C2558R.id.tv_title;
                                                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView3 != null) {
                                                            i = C2558R.id.tv_translate;
                                                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                            if (textView4 != null) {
                                                                return new C5678f9((RelativeLayout) rootView, imageView, imageView2, textView, imageView3, imageView4, textView2, imageView5, imageView6, linearLayout, editText, relativeLayout, relativeLayout2, textView3, textView4);
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
    public static C5678f9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C5678f9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_ai_text_trans, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f35722a;
    }
}
