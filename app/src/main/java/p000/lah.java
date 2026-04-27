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
public final class lah implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f56997C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f56998F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f56999H;

    /* JADX INFO: renamed from: L */
    @efb
    public final RelativeLayout f57000L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f57001M;

    /* JADX INFO: renamed from: N */
    @efb
    public final View f57002N;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f57003a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f57004b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f57005c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f57006d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f57007e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f57008f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f57009m;

    private lah(@efb RelativeLayout rootView, @efb ImageView imgPhone, @efb ImageView imgPolygon, @efb LinearLayout itemOne, @efb ImageView ivSelect, @efb TextView phoneTransValue, @efb TextView phoneValue, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f57003a = rootView;
        this.f57004b = imgPhone;
        this.f57005c = imgPolygon;
        this.f57006d = itemOne;
        this.f57007e = ivSelect;
        this.f57008f = phoneTransValue;
        this.f57009m = phoneValue;
        this.f56997C = receiveImgVoice;
        this.f56998F = receiveImgVoiceBtn;
        this.f56999H = receiveItemBottom;
        this.f57000L = rootLayout;
        this.f57001M = translateText;
        this.f57002N = viewLine;
    }

    @efb
    public static lah bind(@efb View rootView) {
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
                                                return new lah(relativeLayout, imageView, imageView2, linearLayout, imageView3, textView, textView2, imageView4, imageView5, linearLayout2, relativeLayout, textView3, viewFindChildViewById);
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
    public static lah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static lah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_item_left0, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f57003a;
    }
}
