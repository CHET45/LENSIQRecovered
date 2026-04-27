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
public final class mah implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f60357C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f60358F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f60359H;

    /* JADX INFO: renamed from: L */
    @efb
    public final RelativeLayout f60360L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f60361M;

    /* JADX INFO: renamed from: N */
    @efb
    public final View f60362N;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f60363a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f60364b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f60365c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f60366d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f60367e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f60368f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f60369m;

    private mah(@efb RelativeLayout rootView, @efb ImageView imgPhone, @efb ImageView imgPolygon, @efb LinearLayout itemOne, @efb ImageView ivSelect, @efb TextView phoneTransValue, @efb TextView phoneValue, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f60363a = rootView;
        this.f60364b = imgPhone;
        this.f60365c = imgPolygon;
        this.f60366d = itemOne;
        this.f60367e = ivSelect;
        this.f60368f = phoneTransValue;
        this.f60369m = phoneValue;
        this.f60357C = receiveImgVoice;
        this.f60358F = receiveImgVoiceBtn;
        this.f60359H = receiveItemBottom;
        this.f60360L = rootLayout;
        this.f60361M = translateText;
        this.f60362N = viewLine;
    }

    @efb
    public static mah bind(@efb View rootView) {
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
                                                return new mah(relativeLayout, imageView, imageView2, linearLayout, imageView3, textView, textView2, imageView4, imageView5, linearLayout2, relativeLayout, textView3, viewFindChildViewById);
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
    public static mah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static mah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_item_left, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f60363a;
    }
}
