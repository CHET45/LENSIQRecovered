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
public final class pah implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f70180C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f70181F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f70182H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f70183L;

    /* JADX INFO: renamed from: M */
    @efb
    public final RelativeLayout f70184M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f70185N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final View f70186Q;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f70187a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f70188b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f70189c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f70190d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f70191e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f70192f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f70193m;

    private pah(@efb RelativeLayout rootView, @efb LinearLayout hearLayout, @efb ImageView imgPhone, @efb ImageView imgPolygon, @efb LinearLayout itemOne, @efb ImageView ivSelect, @efb TextView phoneTransValue, @efb TextView phoneValue, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f70187a = rootView;
        this.f70188b = hearLayout;
        this.f70189c = imgPhone;
        this.f70190d = imgPolygon;
        this.f70191e = itemOne;
        this.f70192f = ivSelect;
        this.f70193m = phoneTransValue;
        this.f70180C = phoneValue;
        this.f70181F = receiveImgVoice;
        this.f70182H = receiveImgVoiceBtn;
        this.f70183L = receiveItemBottom;
        this.f70184M = rootLayout;
        this.f70185N = translateText;
        this.f70186Q = viewLine;
    }

    @efb
    public static pah bind(@efb View rootView) {
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
                                                    return new pah(relativeLayout, linearLayout, imageView, imageView2, linearLayout2, imageView3, textView, textView2, imageView4, imageView5, linearLayout3, relativeLayout, textView3, viewFindChildViewById);
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
    public static pah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static pah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.trans_item_phone, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f70187a;
    }
}
