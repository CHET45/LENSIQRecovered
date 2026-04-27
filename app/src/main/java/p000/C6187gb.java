package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.watchfun.callvideo.C4008R;

/* JADX INFO: renamed from: gb */
/* JADX INFO: loaded from: classes6.dex */
public final class C6187gb implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f39169C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ImageView f39170F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f39171H;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f39172a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f39173b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f39174c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f39175d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f39176e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ConstraintLayout f39177f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f39178m;

    private C6187gb(@efb ConstraintLayout constraintLayout, @efb ImageView imageView, @efb TextView textView, @efb ImageView imageView2, @efb TextView textView2, @efb ConstraintLayout constraintLayout2, @efb ImageView imageView3, @efb ImageView imageView4, @efb ImageView imageView5, @efb TextView textView3) {
        this.f39172a = constraintLayout;
        this.f39173b = imageView;
        this.f39174c = textView;
        this.f39175d = imageView2;
        this.f39176e = textView2;
        this.f39177f = constraintLayout2;
        this.f39178m = imageView3;
        this.f39169C = imageView4;
        this.f39170F = imageView5;
        this.f39171H = textView3;
    }

    @efb
    public static C6187gb bind(@efb View view) {
        int i = C4008R.id.btn_answer;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C4008R.id.btn_from_trans;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C4008R.id.btn_hangup;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = C4008R.id.btn_to_trans;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = C4008R.id.cl_top;
                        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                        if (constraintLayout != null) {
                            i = C4008R.id.iv_back;
                            ImageView imageView3 = (ImageView) view.findViewById(i);
                            if (imageView3 != null) {
                                i = C4008R.id.iv_camera;
                                ImageView imageView4 = (ImageView) view.findViewById(i);
                                if (imageView4 != null) {
                                    i = C4008R.id.iv_exchange;
                                    ImageView imageView5 = (ImageView) view.findViewById(i);
                                    if (imageView5 != null) {
                                        i = C4008R.id.tv_waiting_tip;
                                        TextView textView3 = (TextView) view.findViewById(i);
                                        if (textView3 != null) {
                                            return new C6187gb((ConstraintLayout) view, imageView, textView, imageView2, textView2, constraintLayout, imageView3, imageView4, imageView5, textView3);
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
    public static C6187gb inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C6187gb inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4008R.layout.activity_invite_chat, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f39172a;
    }
}
