package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class w9h implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f93770C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f93771F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f93772H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f93773L;

    /* JADX INFO: renamed from: M */
    @efb
    public final RelativeLayout f93774M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f93775N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final View f93776Q;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f93777a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f93778b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f93779c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f93780d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f93781e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f93782f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f93783m;

    private w9h(@efb RelativeLayout rootView, @efb LinearLayout hearLayout, @efb ImageView imgPhone, @efb ImageView imgPolygon, @efb LinearLayout itemOne, @efb ImageView ivSelect, @efb TextView phoneTransValue, @efb TextView phoneValue, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f93777a = rootView;
        this.f93778b = hearLayout;
        this.f93779c = imgPhone;
        this.f93780d = imgPolygon;
        this.f93781e = itemOne;
        this.f93782f = ivSelect;
        this.f93783m = phoneTransValue;
        this.f93770C = phoneValue;
        this.f93771F = receiveImgVoice;
        this.f93772H = receiveImgVoiceBtn;
        this.f93773L = receiveItemBottom;
        this.f93774M = rootLayout;
        this.f93775N = translateText;
        this.f93776Q = viewLine;
    }

    @efb
    public static w9h bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.hear_layout;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.img_phone;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2558R.id.img_polygon;
                ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = C2558R.id.item_one;
                    LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout2 != null) {
                        i = C2558R.id.iv_select;
                        ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView3 != null) {
                            i = C2558R.id.phone_trans_value;
                            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView != null) {
                                i = C2558R.id.phone_value;
                                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView2 != null) {
                                    i = C2558R.id.receive_img_voice;
                                    ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                    if (imageView4 != null) {
                                        i = C2558R.id.receive_img_voice_btn;
                                        ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                        if (imageView5 != null) {
                                            i = C2558R.id.receive_item_bottom;
                                            LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                            if (linearLayout3 != null) {
                                                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                                i = C2558R.id.translate_text;
                                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView3 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.view_line))) != null) {
                                                    return new w9h(relativeLayout, linearLayout, imageView, imageView2, linearLayout2, imageView3, textView, textView2, imageView4, imageView5, linearLayout3, relativeLayout, textView3, viewFindChildViewById);
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
    public static w9h inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static w9h inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.trans_freely_item_left, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f93777a;
    }
}
