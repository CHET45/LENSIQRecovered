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
public final class gah implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f39155C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f39156F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f39157H;

    /* JADX INFO: renamed from: L */
    @efb
    public final RelativeLayout f39158L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f39159M;

    /* JADX INFO: renamed from: N */
    @efb
    public final View f39160N;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f39161a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f39162b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f39163c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f39164d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f39165e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f39166f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f39167m;

    private gah(@efb RelativeLayout rootView, @efb TextView earTransValue, @efb TextView earValue, @efb ImageView imgEar, @efb ImageView imgPolygon, @efb LinearLayout itemEar, @efb ImageView ivSelect, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f39161a = rootView;
        this.f39162b = earTransValue;
        this.f39163c = earValue;
        this.f39164d = imgEar;
        this.f39165e = imgPolygon;
        this.f39166f = itemEar;
        this.f39167m = ivSelect;
        this.f39155C = receiveImgVoice;
        this.f39156F = receiveImgVoiceBtn;
        this.f39157H = receiveItemBottom;
        this.f39158L = rootLayout;
        this.f39159M = translateText;
        this.f39160N = viewLine;
    }

    @efb
    public static gah bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C4035R.id.ear_trans_value;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C4035R.id.ear_value;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C4035R.id.img_ear;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C4035R.id.img_polygon;
                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = C4035R.id.item_ear;
                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout != null) {
                            i = C4035R.id.iv_select;
                            ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView3 != null) {
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
                                                return new gah(relativeLayout, textView, textView2, imageView, imageView2, linearLayout, imageView3, imageView4, imageView5, linearLayout2, relativeLayout, textView3, viewFindChildViewById);
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
    public static gah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static gah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_item_ear, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f39161a;
    }
}
