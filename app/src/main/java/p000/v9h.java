package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class v9h implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f90404C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f90405F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f90406H;

    /* JADX INFO: renamed from: L */
    @efb
    public final RelativeLayout f90407L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f90408M;

    /* JADX INFO: renamed from: N */
    @efb
    public final View f90409N;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f90410a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f90411b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f90412c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f90413d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f90414e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f90415f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f90416m;

    private v9h(@efb RelativeLayout rootView, @efb ImageView imgPhone, @efb ImageView imgPolygon, @efb LinearLayout itemOne, @efb ImageView ivSelect, @efb TextView phoneTransValue, @efb TextView phoneValue, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f90410a = rootView;
        this.f90411b = imgPhone;
        this.f90412c = imgPolygon;
        this.f90413d = itemOne;
        this.f90414e = ivSelect;
        this.f90415f = phoneTransValue;
        this.f90416m = phoneValue;
        this.f90404C = receiveImgVoice;
        this.f90405F = receiveImgVoiceBtn;
        this.f90406H = receiveItemBottom;
        this.f90407L = rootLayout;
        this.f90408M = translateText;
        this.f90409N = viewLine;
    }

    @efb
    public static v9h bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C4035R.id.img_phone;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C4035R.id.img_polygon;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C4035R.id.item_one;
                LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = C4035R.id.iv_select;
                    ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = C4035R.id.phone_trans_value;
                        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = C4035R.id.phone_value;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = C4035R.id.receive_img_voice;
                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView4 != null) {
                                    i = C4035R.id.receive_img_voice_btn;
                                    ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView5 != null) {
                                        i = C4035R.id.receive_item_bottom;
                                        LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                        if (linearLayout2 != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                            i = C4035R.id.translate_text;
                                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView3 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C4035R.id.view_line))) != null) {
                                                return new v9h(relativeLayout, imageView, imageView2, linearLayout, imageView3, textView, textView2, imageView4, imageView5, linearLayout2, relativeLayout, textView3, viewFindChildViewById);
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
    public static v9h inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static v9h inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_freely_item_left, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f90410a;
    }
}
