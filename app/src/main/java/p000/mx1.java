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
public final class mx1 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f62585C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f62586F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f62587H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f62588L;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f62589a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f62590b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f62591c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f62592d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f62593e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f62594f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f62595m;

    private mx1(@efb RelativeLayout relativeLayout, @efb ImageView imageView, @efb LinearLayout linearLayout, @efb LinearLayout linearLayout2, @efb ImageView imageView2, @efb ImageView imageView3, @efb LinearLayout linearLayout3, @efb LinearLayout linearLayout4, @efb TextView textView, @efb TextView textView2, @efb TextView textView3) {
        this.f62589a = relativeLayout;
        this.f62590b = imageView;
        this.f62591c = linearLayout;
        this.f62592d = linearLayout2;
        this.f62593e = imageView2;
        this.f62594f = imageView3;
        this.f62595m = linearLayout3;
        this.f62585C = linearLayout4;
        this.f62586F = textView;
        this.f62587H = textView2;
        this.f62588L = textView3;
    }

    @efb
    public static mx1 bind(@efb View view) {
        int i = C3993R.id.iv_select;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C3993R.id.ll_deep_seek;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = C3993R.id.ll_item_ai;
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                if (linearLayout2 != null) {
                    i = C3993R.id.receive_img_voice;
                    ImageView imageView2 = (ImageView) view.findViewById(i);
                    if (imageView2 != null) {
                        i = C3993R.id.receive_img_voice_btn;
                        ImageView imageView3 = (ImageView) view.findViewById(i);
                        if (imageView3 != null) {
                            i = C3993R.id.receive_item_bottom;
                            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                            if (linearLayout3 != null) {
                                i = C3993R.id.receive_item_one;
                                LinearLayout linearLayout4 = (LinearLayout) view.findViewById(i);
                                if (linearLayout4 != null) {
                                    i = C3993R.id.receive_tv_name1;
                                    TextView textView = (TextView) view.findViewById(i);
                                    if (textView != null) {
                                        i = C3993R.id.receive_tv_name2;
                                        TextView textView2 = (TextView) view.findViewById(i);
                                        if (textView2 != null) {
                                            i = C3993R.id.translate_text;
                                            TextView textView3 = (TextView) view.findViewById(i);
                                            if (textView3 != null) {
                                                return new mx1((RelativeLayout) view, imageView, linearLayout, linearLayout2, imageView2, imageView3, linearLayout3, linearLayout4, textView, textView2, textView3);
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
    public static mx1 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static mx1 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C3993R.layout.chat_item_two, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f62589a;
    }
}
