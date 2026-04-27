package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.voicenotes.C4297R;
import pl.droidsonroids.gif.GifImageView;

/* JADX INFO: renamed from: dc */
/* JADX INFO: loaded from: classes7.dex */
public final class C4731dc implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f29244C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f29245F;

    /* JADX INFO: renamed from: H */
    @efb
    public final LinearLayout f29246H;

    /* JADX INFO: renamed from: L */
    @efb
    public final RelativeLayout f29247L;

    /* JADX INFO: renamed from: M */
    @efb
    public final RecyclerView f29248M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f29249M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final GifImageView f29250N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f29251Q;

    /* JADX INFO: renamed from: V1 */
    @efb
    public final TextView f29252V1;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f29253X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f29254Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f29255Z;

    /* JADX INFO: renamed from: Z1 */
    @efb
    public final TextView f29256Z1;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f29257a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f29258b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f29259c;

    /* JADX INFO: renamed from: d */
    @efb
    public final FrameLayout f29260d;

    /* JADX INFO: renamed from: e */
    @efb
    public final LinearLayout f29261e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f29262f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f29263m;

    private C4731dc(@efb RelativeLayout relativeLayout, @efb TextView textView, @efb TextView textView2, @efb FrameLayout frameLayout, @efb LinearLayout linearLayout, @efb ImageView imageView, @efb ImageView imageView2, @efb ImageView imageView3, @efb LinearLayout linearLayout2, @efb LinearLayout linearLayout3, @efb RelativeLayout relativeLayout2, @efb RecyclerView recyclerView, @efb GifImageView gifImageView, @efb TextView textView3, @efb TextView textView4, @efb TextView textView5, @efb TextView textView6, @efb TextView textView7, @efb TextView textView8, @efb TextView textView9) {
        this.f29257a = relativeLayout;
        this.f29258b = textView;
        this.f29259c = textView2;
        this.f29260d = frameLayout;
        this.f29261e = linearLayout;
        this.f29262f = imageView;
        this.f29263m = imageView2;
        this.f29244C = imageView3;
        this.f29245F = linearLayout2;
        this.f29246H = linearLayout3;
        this.f29247L = relativeLayout2;
        this.f29248M = recyclerView;
        this.f29250N = gifImageView;
        this.f29251Q = textView3;
        this.f29253X = textView4;
        this.f29254Y = textView5;
        this.f29255Z = textView6;
        this.f29249M1 = textView7;
        this.f29252V1 = textView8;
        this.f29256Z1 = textView9;
    }

    @efb
    public static C4731dc bind(@efb View view) {
        int i = C4297R.id.edt_lang;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C4297R.id.edt_title;
            TextView textView2 = (TextView) view.findViewById(i);
            if (textView2 != null) {
                i = C4297R.id.fr_back;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                if (frameLayout != null) {
                    i = C4297R.id.fr_control;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                    if (linearLayout != null) {
                        i = C4297R.id.iv_finish;
                        ImageView imageView = (ImageView) view.findViewById(i);
                        if (imageView != null) {
                            i = C4297R.id.iv_record;
                            ImageView imageView2 = (ImageView) view.findViewById(i);
                            if (imageView2 != null) {
                                i = C4297R.id.iv_record_status;
                                ImageView imageView3 = (ImageView) view.findViewById(i);
                                if (imageView3 != null) {
                                    i = C4297R.id.ll_bottom;
                                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(i);
                                    if (linearLayout2 != null) {
                                        i = C4297R.id.ll_content;
                                        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(i);
                                        if (linearLayout3 != null) {
                                            i = C4297R.id.rl_title;
                                            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                                            if (relativeLayout != null) {
                                                i = C4297R.id.rv_record;
                                                RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                                                if (recyclerView != null) {
                                                    i = C4297R.id.sv_wave;
                                                    GifImageView gifImageView = (GifImageView) view.findViewById(i);
                                                    if (gifImageView != null) {
                                                        i = C4297R.id.tv_current_index;
                                                        TextView textView3 = (TextView) view.findViewById(i);
                                                        if (textView3 != null) {
                                                            i = C4297R.id.tv_date;
                                                            TextView textView4 = (TextView) view.findViewById(i);
                                                            if (textView4 != null) {
                                                                i = C4297R.id.tv_record_status;
                                                                TextView textView5 = (TextView) view.findViewById(i);
                                                                if (textView5 != null) {
                                                                    i = C4297R.id.tv_record_time;
                                                                    TextView textView6 = (TextView) view.findViewById(i);
                                                                    if (textView6 != null) {
                                                                        i = C4297R.id.tv_start_tip;
                                                                        TextView textView7 = (TextView) view.findViewById(i);
                                                                        if (textView7 != null) {
                                                                            i = C4297R.id.tv_tip_network;
                                                                            TextView textView8 = (TextView) view.findViewById(i);
                                                                            if (textView8 != null) {
                                                                                i = C4297R.id.tv_title;
                                                                                TextView textView9 = (TextView) view.findViewById(i);
                                                                                if (textView9 != null) {
                                                                                    return new C4731dc((RelativeLayout) view, textView, textView2, frameLayout, linearLayout, imageView, imageView2, imageView3, linearLayout2, linearLayout3, relativeLayout, recyclerView, gifImageView, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C4731dc inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C4731dc inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_record_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f29257a;
    }
}
