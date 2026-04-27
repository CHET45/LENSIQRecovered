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
public final class y9h implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f100882C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f100883F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f100884H;

    /* JADX INFO: renamed from: L */
    @efb
    public final LinearLayout f100885L;

    /* JADX INFO: renamed from: M */
    @efb
    public final RelativeLayout f100886M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f100887N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final View f100888Q;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f100889a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f100890b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f100891c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f100892d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f100893e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f100894f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f100895m;

    private y9h(@efb RelativeLayout rootView, @efb TextView earTransValue, @efb TextView earValue, @efb ImageView imgEar, @efb ImageView imgPolygon, @efb LinearLayout itemEar, @efb ImageView ivSelect, @efb LinearLayout layoutTest, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f100889a = rootView;
        this.f100890b = earTransValue;
        this.f100891c = earValue;
        this.f100892d = imgEar;
        this.f100893e = imgPolygon;
        this.f100894f = itemEar;
        this.f100895m = ivSelect;
        this.f100882C = layoutTest;
        this.f100883F = receiveImgVoice;
        this.f100884H = receiveImgVoiceBtn;
        this.f100885L = receiveItemBottom;
        this.f100886M = rootLayout;
        this.f100887N = translateText;
        this.f100888Q = viewLine;
    }

    @efb
    public static y9h bind(@efb View rootView) {
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
                                                    return new y9h(relativeLayout, textView, textView2, imageView, imageView2, linearLayout, imageView3, linearLayout2, imageView4, imageView5, linearLayout3, relativeLayout, textView3, viewFindChildViewById);
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
    public static y9h inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static y9h inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.trans_freely_item_right, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f100889a;
    }
}
