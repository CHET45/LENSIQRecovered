package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;
import pl.droidsonroids.gif.GifImageView;

/* JADX INFO: renamed from: zb */
/* JADX INFO: loaded from: classes7.dex */
public final class C16061zb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ScrollView f104645C;

    /* JADX INFO: renamed from: F */
    @efb
    public final GifImageView f104646F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f104647H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f104648L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f104649M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f104650N;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f104651a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f104652b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f104653c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f104654d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f104655e;

    /* JADX INFO: renamed from: f */
    @efb
    public final RelativeLayout f104656f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f104657m;

    private C16061zb(@efb RelativeLayout relativeLayout, @efb TextView textView, @efb TextView textView2, @efb ImageView imageView, @efb ImageView imageView2, @efb RelativeLayout relativeLayout2, @efb RelativeLayout relativeLayout3, @efb ScrollView scrollView, @efb GifImageView gifImageView, @efb TextView textView3, @efb TextView textView4, @efb TextView textView5, @efb TextView textView6) {
        this.f104651a = relativeLayout;
        this.f104652b = textView;
        this.f104653c = textView2;
        this.f104654d = imageView;
        this.f104655e = imageView2;
        this.f104656f = relativeLayout2;
        this.f104657m = relativeLayout3;
        this.f104645C = scrollView;
        this.f104646F = gifImageView;
        this.f104647H = textView3;
        this.f104648L = textView4;
        this.f104649M = textView5;
        this.f104650N = textView6;
    }

    @efb
    public static C16061zb bind(@efb View view) {
        int i = C4297R.id.edt_lang;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4297R.id.edt_title;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = C4297R.id.fr_back;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = C4297R.id.iv_play;
                    ImageView imageView2 = (ImageView) view.findViewById(i);
                    if (imageView2 != null) {
                        i = C4297R.id.rl_edit;
                        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                        if (relativeLayout != null) {
                            i = C4297R.id.rl_title;
                            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                            if (relativeLayout2 != null) {
                                i = C4297R.id.scroll_view;
                                ScrollView scrollView = (ScrollView) view.findViewById(i);
                                if (scrollView != null) {
                                    i = C4297R.id.sv_wave;
                                    GifImageView gifImageView = (GifImageView) view.findViewById(i);
                                    if (gifImageView != null) {
                                        i = C4297R.id.tv_current_index;
                                        TextView textView3 = (TextView) view.findViewById(i);
                                        if (textView3 != null) {
                                            i = C4297R.id.tv_current_time;
                                            TextView textView4 = (TextView) view.findViewById(i);
                                            if (textView4 != null) {
                                                i = C4297R.id.tv_current_total;
                                                TextView textView5 = (TextView) view.findViewById(i);
                                                if (textView5 != null) {
                                                    i = C4297R.id.tv_date;
                                                    TextView textView6 = (TextView) view.findViewById(i);
                                                    if (textView6 != null) {
                                                        return new C16061zb((RelativeLayout) view, textView, textView2, imageView, imageView2, relativeLayout, relativeLayout2, scrollView, gifImageView, textView3, textView4, textView5, textView6);
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
    public static C16061zb inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C16061zb inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_record_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f104651a;
    }
}
