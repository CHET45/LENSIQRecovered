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
public final class uf8 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f87876C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f87877F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f87878H;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f87879a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f87880b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f87881c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f87882d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f87883e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f87884f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f87885m;

    private uf8(@efb RelativeLayout rootView, @efb ImageView imgLoadPoint, @efb ImageView imgVoice, @efb ImageView imgVoiceBtn, @efb LinearLayout itemBottom, @efb LinearLayout itemOne, @efb LinearLayout itemTwo, @efb ImageView ivSelect, @efb TextView time, @efb TextView tvName) {
        this.f87879a = rootView;
        this.f87880b = imgLoadPoint;
        this.f87881c = imgVoice;
        this.f87882d = imgVoiceBtn;
        this.f87883e = itemBottom;
        this.f87884f = itemOne;
        this.f87885m = itemTwo;
        this.f87876C = ivSelect;
        this.f87877F = time;
        this.f87878H = tvName;
    }

    @efb
    public static uf8 bind(@efb View rootView) {
        int i = C2558R.id.img_load_point;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.img_voice;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2558R.id.img_voice_btn;
                ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView3 != null) {
                    i = C2558R.id.item_bottom;
                    LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                    if (linearLayout != null) {
                        i = C2558R.id.item_one;
                        LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout2 != null) {
                            i = C2558R.id.item_two;
                            LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout3 != null) {
                                i = C2558R.id.iv_select;
                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView4 != null) {
                                    i = C2558R.id.time;
                                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView != null) {
                                        i = C2558R.id.tv_name;
                                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView2 != null) {
                                            return new uf8((RelativeLayout) rootView, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, imageView4, textView, textView2);
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
    public static uf8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static uf8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_chat_user_content, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f87879a;
    }
}
