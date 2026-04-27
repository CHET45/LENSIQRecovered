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
public final class nx1 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f65938C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f65939F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f65940H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f65941L;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f65942a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f65943b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f65944c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f65945d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f65946e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f65947f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f65948m;

    private nx1(@efb RelativeLayout rootView, @efb ImageView ivSelect, @efb LinearLayout llDeepSeek, @efb LinearLayout llItemAi, @efb ImageView receiveImgVoice, @efb ImageView receiveImgVoiceBtn, @efb LinearLayout receiveItemBottom, @efb LinearLayout receiveItemOne, @efb TextView receiveTvName1, @efb TextView receiveTvName2, @efb TextView translateText) {
        this.f65942a = rootView;
        this.f65943b = ivSelect;
        this.f65944c = llDeepSeek;
        this.f65945d = llItemAi;
        this.f65946e = receiveImgVoice;
        this.f65947f = receiveImgVoiceBtn;
        this.f65948m = receiveItemBottom;
        this.f65938C = receiveItemOne;
        this.f65939F = receiveTvName1;
        this.f65940H = receiveTvName2;
        this.f65941L = translateText;
    }

    @efb
    public static nx1 bind(@efb View rootView) {
        int i = C2558R.id.iv_select;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.ll_deep_seek;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C2558R.id.ll_item_ai;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null) {
                    i = C2558R.id.receive_img_voice;
                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = C2558R.id.receive_img_voice_btn;
                        ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView3 != null) {
                            i = C2558R.id.receive_item_bottom;
                            LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout3 != null) {
                                i = C2558R.id.receive_item_one;
                                LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                if (linearLayout4 != null) {
                                    i = C2558R.id.receive_tv_name1;
                                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView != null) {
                                        i = C2558R.id.receive_tv_name2;
                                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView2 != null) {
                                            i = C2558R.id.translate_text;
                                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView3 != null) {
                                                return new nx1((RelativeLayout) rootView, imageView, linearLayout, linearLayout2, imageView2, imageView3, linearLayout3, linearLayout4, textView, textView2, textView3);
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
    public static nx1 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static nx1 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.chat_item_two, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f65942a;
    }
}
