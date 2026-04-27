package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;
import com.watchfun.voicenotes.widget.CustomSeekBar;
import pl.droidsonroids.gif.GifImageView;

/* JADX INFO: renamed from: qb */
/* JADX INFO: loaded from: classes7.dex */
public final class C11403qb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f73781C;

    /* JADX INFO: renamed from: F */
    @efb
    public final RelativeLayout f73782F;

    /* JADX INFO: renamed from: H */
    @efb
    public final RelativeLayout f73783H;

    /* JADX INFO: renamed from: L */
    @efb
    public final ScrollView f73784L;

    /* JADX INFO: renamed from: M */
    @efb
    public final CustomSeekBar f73785M;

    /* JADX INFO: renamed from: N */
    @efb
    public final GifImageView f73786N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f73787Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f73788X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f73789Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f73790Z;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f73791a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f73792b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f73793c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f73794d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f73795e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f73796f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f73797m;

    private C11403qb(@efb RelativeLayout relativeLayout, @efb TextView textView, @efb TextView textView2, @efb ImageView imageView, @efb ImageView imageView2, @efb ImageView imageView3, @efb ImageView imageView4, @efb ImageView imageView5, @efb RelativeLayout relativeLayout2, @efb RelativeLayout relativeLayout3, @efb ScrollView scrollView, @efb CustomSeekBar customSeekBar, @efb GifImageView gifImageView, @efb TextView textView3, @efb TextView textView4, @efb TextView textView5, @efb TextView textView6) {
        this.f73791a = relativeLayout;
        this.f73792b = textView;
        this.f73793c = textView2;
        this.f73794d = imageView;
        this.f73795e = imageView2;
        this.f73796f = imageView3;
        this.f73797m = imageView4;
        this.f73781C = imageView5;
        this.f73782F = relativeLayout2;
        this.f73783H = relativeLayout3;
        this.f73784L = scrollView;
        this.f73785M = customSeekBar;
        this.f73786N = gifImageView;
        this.f73787Q = textView3;
        this.f73788X = textView4;
        this.f73789Y = textView5;
        this.f73790Z = textView6;
    }

    @efb
    public static C11403qb bind(@efb View view) {
        int i = C4297R.id.edt_lang;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4297R.id.edt_title;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = C4297R.id.fr_back;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = C4297R.id.iv_after;
                    ImageView imageView2 = (ImageView) view.findViewById(i);
                    if (imageView2 != null) {
                        i = C4297R.id.iv_before;
                        ImageView imageView3 = (ImageView) view.findViewById(i);
                        if (imageView3 != null) {
                            i = C4297R.id.iv_play;
                            ImageView imageView4 = (ImageView) view.findViewById(i);
                            if (imageView4 != null) {
                                i = C4297R.id.iv_share;
                                ImageView imageView5 = (ImageView) view.findViewById(i);
                                if (imageView5 != null) {
                                    i = C4297R.id.rl_edit;
                                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                                    if (relativeLayout != null) {
                                        i = C4297R.id.rl_title;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                                        if (relativeLayout2 != null) {
                                            i = C4297R.id.scroll_view;
                                            ScrollView scrollView = (ScrollView) view.findViewById(i);
                                            if (scrollView != null) {
                                                i = C4297R.id.seek_bar;
                                                CustomSeekBar customSeekBar = (CustomSeekBar) view.findViewById(i);
                                                if (customSeekBar != null) {
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
                                                                        return new C11403qb((RelativeLayout) view, textView, textView2, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, relativeLayout2, scrollView, customSeekBar, gifImageView, textView3, textView4, textView5, textView6);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C11403qb inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C11403qb inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_note_record_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f73791a;
    }
}
