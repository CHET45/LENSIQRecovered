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
public final class kah implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f53470C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f53471F;

    /* JADX INFO: renamed from: H */
    @efb
    public final RelativeLayout f53472H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f53473L;

    /* JADX INFO: renamed from: M */
    @efb
    public final View f53474M;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f53475a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f53476b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f53477c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f53478d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f53479e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f53480f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f53481m;

    private kah(@efb RelativeLayout rootView, @efb TextView earTransValue, @efb TextView earValue, @efb ImageView imgPolygon, @efb LinearLayout itemEar, @efb ImageView ivSelect, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb RelativeLayout rootLayout, @efb TextView translateText, @efb View viewLine) {
        this.f53475a = rootView;
        this.f53476b = earTransValue;
        this.f53477c = earValue;
        this.f53478d = imgPolygon;
        this.f53479e = itemEar;
        this.f53480f = ivSelect;
        this.f53481m = receiveImgVoice;
        this.f53470C = receiveImgVoiceBtn;
        this.f53471F = receiveItemBottom;
        this.f53472H = rootLayout;
        this.f53473L = translateText;
        this.f53474M = viewLine;
    }

    @efb
    public static kah bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C4035R.id.ear_trans_value;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C4035R.id.ear_value;
            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = C4035R.id.img_polygon;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C4035R.id.item_ear;
                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout != null) {
                        i = C4035R.id.iv_select;
                        ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView2 != null) {
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
                                            return new kah(relativeLayout, textView, textView2, imageView, linearLayout, imageView2, imageView3, imageView4, linearLayout2, relativeLayout, textView3, viewFindChildViewById);
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
    public static kah inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static kah inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.trans_item_facetoface_right, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f53475a;
    }
}
