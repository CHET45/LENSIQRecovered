package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class ax8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f12104a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f12105b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f12106c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ProgressBar f12107d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f12108e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f12109f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f12110m;

    private ax8(@efb ConstraintLayout rootView, @efb ImageView ivQa, @efb LinearLayout llTopLimitTime, @efb ProgressBar seekbar, @efb TextView tvAiTime, @efb TextView tvAiTransTime, @efb TextView tvBleName) {
        this.f12104a = rootView;
        this.f12105b = ivQa;
        this.f12106c = llTopLimitTime;
        this.f12107d = seekbar;
        this.f12108e = tvAiTime;
        this.f12109f = tvAiTransTime;
        this.f12110m = tvBleName;
    }

    @efb
    public static ax8 bind(@efb View rootView) {
        int i = C2558R.id.iv_qa;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.ll_top_limit_time;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C2558R.id.seekbar;
                ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
                if (progressBar != null) {
                    i = C2558R.id.tv_ai_time;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = C2558R.id.tv_ai_trans_time;
                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = C2558R.id.tv_ble_name;
                            TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView3 != null) {
                                return new ax8((ConstraintLayout) rootView, imageView, linearLayout, progressBar, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ax8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ax8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.layout_voice_note_limit_time, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f12104a;
    }
}
