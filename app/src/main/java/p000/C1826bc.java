package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.watchfun.voicenotes.C4297R;
import pl.droidsonroids.gif.GifImageView;

/* JADX INFO: renamed from: bc */
/* JADX INFO: loaded from: classes7.dex */
public final class C1826bc implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f13279C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f13280F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f13281H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f13282L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f13283M;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f13284a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f13285b;

    /* JADX INFO: renamed from: c */
    @efb
    public final EditText f13286c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f13287d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f13288e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ScrollView f13289f;

    /* JADX INFO: renamed from: m */
    @efb
    public final GifImageView f13290m;

    private C1826bc(@efb RelativeLayout relativeLayout, @efb EditText editText, @efb EditText editText2, @efb ImageView imageView, @efb RelativeLayout relativeLayout2, @efb ScrollView scrollView, @efb GifImageView gifImageView, @efb TextView textView, @efb TextView textView2, @efb TextView textView3, @efb TextView textView4, @efb TextView textView5) {
        this.f13284a = relativeLayout;
        this.f13285b = editText;
        this.f13286c = editText2;
        this.f13287d = imageView;
        this.f13288e = relativeLayout2;
        this.f13289f = scrollView;
        this.f13290m = gifImageView;
        this.f13279C = textView;
        this.f13280F = textView2;
        this.f13281H = textView3;
        this.f13282L = textView4;
        this.f13283M = textView5;
    }

    @efb
    public static C1826bc bind(@efb View view) {
        int i = C4297R.id.edit_current_index;
        EditText editText = (EditText) view.findViewById(i);
        if (editText != null) {
            i = C4297R.id.edt_title;
            EditText editText2 = (EditText) view.findViewById(i);
            if (editText2 != null) {
                i = C4297R.id.iv_play;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = C4297R.id.rl_title;
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                    if (relativeLayout != null) {
                        i = C4297R.id.scroll_view;
                        ScrollView scrollView = (ScrollView) view.findViewById(i);
                        if (scrollView != null) {
                            i = C4297R.id.sv_wave;
                            GifImageView gifImageView = (GifImageView) view.findViewById(i);
                            if (gifImageView != null) {
                                i = C4297R.id.tv_cancel;
                                TextView textView = (TextView) view.findViewById(i);
                                if (textView != null) {
                                    i = C4297R.id.tv_current_time;
                                    TextView textView2 = (TextView) view.findViewById(i);
                                    if (textView2 != null) {
                                        i = C4297R.id.tv_current_total;
                                        TextView textView3 = (TextView) view.findViewById(i);
                                        if (textView3 != null) {
                                            i = C4297R.id.tv_date;
                                            TextView textView4 = (TextView) view.findViewById(i);
                                            if (textView4 != null) {
                                                i = C4297R.id.tv_save;
                                                TextView textView5 = (TextView) view.findViewById(i);
                                                if (textView5 != null) {
                                                    return new C1826bc((RelativeLayout) view, editText, editText2, imageView, relativeLayout, scrollView, gifImageView, textView, textView2, textView3, textView4, textView5);
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
    public static C1826bc inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C1826bc inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_record_edit_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f13284a;
    }
}
