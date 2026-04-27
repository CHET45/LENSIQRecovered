package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;
import pl.droidsonroids.gif.GifImageView;

/* JADX INFO: renamed from: xb */
/* JADX INFO: loaded from: classes7.dex */
public final class C15021xb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f97392C;

    /* JADX INFO: renamed from: F */
    @efb
    public final RelativeLayout f97393F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ScrollView f97394H;

    /* JADX INFO: renamed from: L */
    @efb
    public final GifImageView f97395L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f97396M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f97397N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f97398Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f97399X;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f97400a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f97401b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f97402c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f97403d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f97404e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f97405f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f97406m;

    private C15021xb(@efb RelativeLayout relativeLayout, @efb TextView textView, @efb TextView textView2, @efb ImageView imageView, @efb LinearLayout linearLayout, @efb TextView textView3, @efb TextView textView4, @efb ImageView imageView2, @efb RelativeLayout relativeLayout2, @efb ScrollView scrollView, @efb GifImageView gifImageView, @efb TextView textView5, @efb TextView textView6, @efb TextView textView7, @efb TextView textView8) {
        this.f97400a = relativeLayout;
        this.f97401b = textView;
        this.f97402c = textView2;
        this.f97403d = imageView;
        this.f97404e = linearLayout;
        this.f97405f = textView3;
        this.f97406m = textView4;
        this.f97392C = imageView2;
        this.f97393F = relativeLayout2;
        this.f97394H = scrollView;
        this.f97395L = gifImageView;
        this.f97396M = textView5;
        this.f97397N = textView6;
        this.f97398Q = textView7;
        this.f97399X = textView8;
    }

    @efb
    public static C15021xb bind(@efb View view) {
        int i = C4297R.id.edt_lang;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4297R.id.edt_title;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = C4297R.id.fr_back;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = C4297R.id.fr_control;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                    if (linearLayout != null) {
                        i = C4297R.id.iv_finish;
                        TextView textView3 = (TextView) view.findViewById(i);
                        if (textView3 != null) {
                            i = C4297R.id.iv_record;
                            TextView textView4 = (TextView) view.findViewById(i);
                            if (textView4 != null) {
                                i = C4297R.id.iv_record_status;
                                ImageView imageView2 = (ImageView) view.findViewById(i);
                                if (imageView2 != null) {
                                    i = C4297R.id.rl_title;
                                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                                    if (relativeLayout != null) {
                                        i = C4297R.id.scroll_view;
                                        ScrollView scrollView = (ScrollView) view.findViewById(i);
                                        if (scrollView != null) {
                                            i = C4297R.id.sv_wave;
                                            GifImageView gifImageView = (GifImageView) view.findViewById(i);
                                            if (gifImageView != null) {
                                                i = C4297R.id.tv_current_index;
                                                TextView textView5 = (TextView) view.findViewById(i);
                                                if (textView5 != null) {
                                                    i = C4297R.id.tv_date;
                                                    TextView textView6 = (TextView) view.findViewById(i);
                                                    if (textView6 != null) {
                                                        i = C4297R.id.tv_record_time;
                                                        TextView textView7 = (TextView) view.findViewById(i);
                                                        if (textView7 != null) {
                                                            i = C4297R.id.tv_tip_network;
                                                            TextView textView8 = (TextView) view.findViewById(i);
                                                            if (textView8 != null) {
                                                                return new C15021xb((RelativeLayout) view, textView, textView2, imageView, linearLayout, textView3, textView4, imageView2, relativeLayout, scrollView, gifImageView, textView5, textView6, textView7, textView8);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C15021xb inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C15021xb inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_record, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f97400a;
    }
}
