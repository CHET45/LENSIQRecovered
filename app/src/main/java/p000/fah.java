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
public final class fah implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f35954C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f35955F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f35956H;

    /* JADX INFO: renamed from: L */
    @efb
    public final RelativeLayout f35957L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f35958M;

    /* JADX INFO: renamed from: N */
    @efb
    public final View f35959N;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f35960a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f35961b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f35962c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f35963d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f35964e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f35965f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f35966m;

    private fah(@efb RelativeLayout rootView, @efb TextView earTransValue, @efb TextView earValue, @efb ImageView imgEar, @efb ImageView imgPolygon, @efb LinearLayout itemEar, @efb ImageView ivSelect, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f35960a = rootView;
        this.f35961b = earTransValue;
        this.f35962c = earValue;
        this.f35963d = imgEar;
        this.f35964e = imgPolygon;
        this.f35965f = itemEar;
        this.f35966m = ivSelect;
        this.f35954C = receiveImgVoice;
        this.f35955F = receiveImgVoiceBtn;
        this.f35956H = receiveItemBottom;
        this.f35957L = rootLayout;
        this.f35958M = translateText;
        this.f35959N = viewLine;
    }

    @efb
    public static fah bind(@efb View rootView) {
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
                                                return new fah(relativeLayout, textView, textView2, imageView, imageView2, linearLayout, imageView3, imageView4, imageView5, linearLayout2, relativeLayout, textView3, viewFindChildViewById);
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
    public static fah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static fah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_item_ear0, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f35960a;
    }
}
