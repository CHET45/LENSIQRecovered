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
public final class hah implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f43024C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f43025F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f43026H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f43027L;

    /* JADX INFO: renamed from: M */
    @efb
    public final RelativeLayout f43028M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f43029N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final View f43030Q;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f43031a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f43032b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f43033c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f43034d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f43035e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f43036f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f43037m;

    private hah(@efb RelativeLayout rootView, @efb TextView earTransValue, @efb TextView earValue, @efb ImageView imgEar, @efb ImageView imgPolygon, @efb LinearLayout itemEar, @efb ImageView ivSelect, @efb LinearLayout layoutTest, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f43031a = rootView;
        this.f43032b = earTransValue;
        this.f43033c = earValue;
        this.f43034d = imgEar;
        this.f43035e = imgPolygon;
        this.f43036f = itemEar;
        this.f43037m = ivSelect;
        this.f43024C = layoutTest;
        this.f43025F = receiveImgVoice;
        this.f43026H = receiveImgVoiceBtn;
        this.f43027L = receiveItemBottom;
        this.f43028M = rootLayout;
        this.f43029N = translateText;
        this.f43030Q = viewLine;
    }

    @efb
    public static hah bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.ear_trans_value;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.ear_value;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C2558R.id.img_ear;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2558R.id.img_polygon;
                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = C2558R.id.item_ear;
                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout != null) {
                            i = C2558R.id.iv_select;
                            ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView3 != null) {
                                i = C2558R.id.layout_test;
                                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                if (linearLayout2 != null) {
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
                                                    return new hah(relativeLayout, textView, textView2, imageView, imageView2, linearLayout, imageView3, linearLayout2, imageView4, imageView5, linearLayout3, relativeLayout, textView3, viewFindChildViewById);
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
    public static hah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static hah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.trans_item_ear, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f43031a;
    }
}
