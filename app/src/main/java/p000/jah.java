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
public final class jah implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f50129C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f50130F;

    /* JADX INFO: renamed from: H */
    @efb
    public final RelativeLayout f50131H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f50132L;

    /* JADX INFO: renamed from: M */
    @efb
    public final View f50133M;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f50134a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f50135b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f50136c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f50137d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f50138e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f50139f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f50140m;

    private jah(@efb RelativeLayout rootView, @efb ImageView imgPolygon, @efb LinearLayout itemOne, @efb ImageView ivSelect, @efb TextView phoneTransValue, @efb TextView phoneValue, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f50134a = rootView;
        this.f50135b = imgPolygon;
        this.f50136c = itemOne;
        this.f50137d = ivSelect;
        this.f50138e = phoneTransValue;
        this.f50139f = phoneValue;
        this.f50140m = receiveImgVoice;
        this.f50129C = receiveImgVoiceBtn;
        this.f50130F = receiveItemBottom;
        this.f50131H = rootLayout;
        this.f50132L = translateText;
        this.f50133M = viewLine;
    }

    @efb
    public static jah bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C4035R.id.img_polygon;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C4035R.id.item_one;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C4035R.id.iv_select;
                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = C4035R.id.phone_trans_value;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C4035R.id.phone_value;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C4035R.id.receive_img_voice;
                            ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView3 != null) {
                                i = C4035R.id.receive_img_voice_btn;
                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView4 != null) {
                                    i = C4035R.id.receive_item_bottom;
                                    LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout2 != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                        i = C4035R.id.translate_text;
                                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView3 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C4035R.id.view_line))) != null) {
                                            return new jah(relativeLayout, imageView, linearLayout, imageView2, textView, textView2, imageView3, imageView4, linearLayout2, relativeLayout, textView3, viewFindChildViewById);
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
    public static jah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static jah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_item_facetoface_left, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f50134a;
    }
}
