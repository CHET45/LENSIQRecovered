package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class zw8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f106187a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f106188b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f106189c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ProgressBar f106190d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f106191e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f106192f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f106193m;

    private zw8(@efb ConstraintLayout constraintLayout, @efb ImageView imageView, @efb LinearLayout linearLayout, @efb ProgressBar progressBar, @efb TextView textView, @efb TextView textView2, @efb TextView textView3) {
        this.f106187a = constraintLayout;
        this.f106188b = imageView;
        this.f106189c = linearLayout;
        this.f106190d = progressBar;
        this.f106191e = textView;
        this.f106192f = textView2;
        this.f106193m = textView3;
    }

    @efb
    public static zw8 bind(@efb View view) {
        int i = C4297R.id.iv_qa;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C4297R.id.ll_top_limit_time;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = C4297R.id.seekbar;
                ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                if (progressBar != null) {
                    i = C4297R.id.tv_ai_time;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        i = C4297R.id.tv_ai_trans_time;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = C4297R.id.tv_ble_name;
                            TextView textView3 = (TextView) view.findViewById(i);
                            if (textView3 != null) {
                                return new zw8((ConstraintLayout) view, imageView, linearLayout, progressBar, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static zw8 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static zw8 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.layout_voice_note_limit_time, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f106187a;
    }
}
