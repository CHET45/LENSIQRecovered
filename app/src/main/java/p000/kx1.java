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
public final class kx1 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f55540C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f55541F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f55542H;

    /* JADX INFO: renamed from: L */
    @efb
    public final RelativeLayout f55543L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f55544M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f55545N;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f55546a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f55547b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f55548c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f55549d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f55550e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f55551f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f55552m;

    private kx1(@efb RelativeLayout rootView, @efb ImageView imgLoadPoint, @efb ImageView imgPolygon, @efb ImageView imgVoice, @efb ImageView imgVoiceBtn, @efb LinearLayout itemBottom, @efb LinearLayout itemOne, @efb ImageView itemPictureRight, @efb LinearLayout itemTwo, @efb ImageView ivSelect, @efb RelativeLayout rlUsertext, @efb TextView time, @efb TextView tvName) {
        this.f55546a = rootView;
        this.f55547b = imgLoadPoint;
        this.f55548c = imgPolygon;
        this.f55549d = imgVoice;
        this.f55550e = imgVoiceBtn;
        this.f55551f = itemBottom;
        this.f55552m = itemOne;
        this.f55540C = itemPictureRight;
        this.f55541F = itemTwo;
        this.f55542H = ivSelect;
        this.f55543L = rlUsertext;
        this.f55544M = time;
        this.f55545N = tvName;
    }

    @efb
    public static kx1 bind(@efb View rootView) {
        int i = C2558R.id.img_load_point;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.img_polygon;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2558R.id.img_voice;
                ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView3 != null) {
                    i = C2558R.id.img_voice_btn;
                    ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView4 != null) {
                        i = C2558R.id.item_bottom;
                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout != null) {
                            i = C2558R.id.item_one;
                            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout2 != null) {
                                i = C2558R.id.item_picture_right;
                                ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView5 != null) {
                                    i = C2558R.id.item_two;
                                    LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout3 != null) {
                                        i = C2558R.id.iv_select;
                                        ImageView imageView6 = (ImageView) l8i.findChildViewById(rootView, i);
                                        if (imageView6 != null) {
                                            i = C2558R.id.rl_usertext;
                                            RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                            if (relativeLayout != null) {
                                                i = C2558R.id.time;
                                                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView != null) {
                                                    i = C2558R.id.tv_name;
                                                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView2 != null) {
                                                        return new kx1((RelativeLayout) rootView, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayout2, imageView5, linearLayout3, imageView6, relativeLayout, textView, textView2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static kx1 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static kx1 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.chat_item_one, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f55546a;
    }
}
