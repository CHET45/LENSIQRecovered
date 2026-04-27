package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.aichat.C3993R;

/* JADX INFO: loaded from: classes6.dex */
public final class jx1 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f52152C;

    /* JADX INFO: renamed from: F */
    @efb
    public final RelativeLayout f52153F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f52154H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f52155L;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f52156a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f52157b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f52158c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f52159d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f52160e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f52161f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f52162m;

    private jx1(@efb RelativeLayout relativeLayout, @efb ImageView imageView, @efb ImageView imageView2, @efb ImageView imageView3, @efb LinearLayout linearLayout, @efb LinearLayout linearLayout2, @efb LinearLayout linearLayout3, @efb ImageView imageView4, @efb RelativeLayout relativeLayout2, @efb TextView textView, @efb TextView textView2) {
        this.f52156a = relativeLayout;
        this.f52157b = imageView;
        this.f52158c = imageView2;
        this.f52159d = imageView3;
        this.f52160e = linearLayout;
        this.f52161f = linearLayout2;
        this.f52162m = linearLayout3;
        this.f52152C = imageView4;
        this.f52153F = relativeLayout2;
        this.f52154H = textView;
        this.f52155L = textView2;
    }

    @efb
    public static jx1 bind(@efb View view) {
        int i = C3993R.id.img_load_point;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C3993R.id.img_voice;
            ImageView imageView2 = (ImageView) view.findViewById(i);
            if (imageView2 != null) {
                i = C3993R.id.img_voice_btn;
                ImageView imageView3 = (ImageView) view.findViewById(i);
                if (imageView3 != null) {
                    i = C3993R.id.item_bottom;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                    if (linearLayout != null) {
                        i = C3993R.id.item_one;
                        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                        if (linearLayout2 != null) {
                            i = C3993R.id.item_two;
                            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                            if (linearLayout3 != null) {
                                i = C3993R.id.iv_select;
                                ImageView imageView4 = (ImageView) view.findViewById(i);
                                if (imageView4 != null) {
                                    i = C3993R.id.rl_usertext;
                                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                                    if (relativeLayout != null) {
                                        i = C3993R.id.time;
                                        TextView textView = (TextView) view.findViewById(i);
                                        if (textView != null) {
                                            i = C3993R.id.tv_name;
                                            TextView textView2 = (TextView) view.findViewById(i);
                                            if (textView2 != null) {
                                                return new jx1((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, imageView4, relativeLayout, textView, textView2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static jx1 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static jx1 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C3993R.layout.chat_item_one, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f52156a;
    }
}
