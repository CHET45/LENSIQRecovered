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
import com.watchfun.voicenotes.widget.CustomSeekBar;
import pl.droidsonroids.gif.GifImageView;

/* JADX INFO: renamed from: rb */
/* JADX INFO: loaded from: classes7.dex */
public final class C11987rb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ScrollView f77621C;

    /* JADX INFO: renamed from: F */
    @efb
    public final CustomSeekBar f77622F;

    /* JADX INFO: renamed from: H */
    @efb
    public final GifImageView f77623H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f77624L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f77625M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f77626N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f77627Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f77628X;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f77629a;

    /* JADX INFO: renamed from: b */
    @efb
    public final EditText f77630b;

    /* JADX INFO: renamed from: c */
    @efb
    public final EditText f77631c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f77632d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f77633e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f77634f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f77635m;

    private C11987rb(@efb RelativeLayout relativeLayout, @efb EditText editText, @efb EditText editText2, @efb ImageView imageView, @efb ImageView imageView2, @efb ImageView imageView3, @efb RelativeLayout relativeLayout2, @efb ScrollView scrollView, @efb CustomSeekBar customSeekBar, @efb GifImageView gifImageView, @efb TextView textView, @efb TextView textView2, @efb TextView textView3, @efb TextView textView4, @efb TextView textView5) {
        this.f77629a = relativeLayout;
        this.f77630b = editText;
        this.f77631c = editText2;
        this.f77632d = imageView;
        this.f77633e = imageView2;
        this.f77634f = imageView3;
        this.f77635m = relativeLayout2;
        this.f77621C = scrollView;
        this.f77622F = customSeekBar;
        this.f77623H = gifImageView;
        this.f77624L = textView;
        this.f77625M = textView2;
        this.f77626N = textView3;
        this.f77627Q = textView4;
        this.f77628X = textView5;
    }

    @efb
    public static C11987rb bind(@efb View view) {
        int i = C4297R.id.edit_current_index;
        EditText editText = (EditText) view.findViewById(i);
        if (editText != null) {
            i = C4297R.id.edt_title;
            EditText editText2 = (EditText) view.findViewById(i);
            if (editText2 != null) {
                i = C4297R.id.iv_after;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = C4297R.id.iv_before;
                    ImageView imageView2 = (ImageView) view.findViewById(i);
                    if (imageView2 != null) {
                        i = C4297R.id.iv_play;
                        ImageView imageView3 = (ImageView) view.findViewById(i);
                        if (imageView3 != null) {
                            i = C4297R.id.rl_title;
                            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                            if (relativeLayout != null) {
                                i = C4297R.id.scroll_view;
                                ScrollView scrollView = (ScrollView) view.findViewById(i);
                                if (scrollView != null) {
                                    i = C4297R.id.seek_bar;
                                    CustomSeekBar customSeekBar = (CustomSeekBar) view.findViewById(i);
                                    if (customSeekBar != null) {
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
                                                                return new C11987rb((RelativeLayout) view, editText, editText2, imageView, imageView2, imageView3, relativeLayout, scrollView, customSeekBar, gifImageView, textView, textView2, textView3, textView4, textView5);
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
    public static C11987rb inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C11987rb inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.activity_note_record_edit_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f77629a;
    }
}
