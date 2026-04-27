package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.widget.CircleProgressView;
import com.eyevue.common.widget.SimplePercentageView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class jg8 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ImageView f50481C;

    /* JADX INFO: renamed from: F */
    @efb
    public final TextView f50482F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f50483H;

    /* JADX INFO: renamed from: L */
    @efb
    public final SimplePercentageView f50484L;

    /* JADX INFO: renamed from: M */
    @efb
    public final ImageView f50485M;

    /* JADX INFO: renamed from: N */
    @efb
    public final RelativeLayout f50486N;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f50487a;

    /* JADX INFO: renamed from: b */
    @efb
    public final CardView f50488b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ConstraintLayout f50489c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f50490d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f50491e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f50492f;

    /* JADX INFO: renamed from: m */
    @efb
    public final CircleProgressView f50493m;

    private jg8(@efb ConstraintLayout rootView, @efb CardView cardView, @efb ConstraintLayout clFilter, @efb ImageView imageView, @efb ImageView ivThumbnailBg, @efb ImageView ivThumbnailState, @efb CircleProgressView progress, @efb ImageView selectionIndicator, @efb TextView tvPercent, @efb TextView tvVideoDuration, @efb SimplePercentageView vPercent, @efb ImageView videoIndicator, @efb RelativeLayout videoLayout) {
        this.f50487a = rootView;
        this.f50488b = cardView;
        this.f50489c = clFilter;
        this.f50490d = imageView;
        this.f50491e = ivThumbnailBg;
        this.f50492f = ivThumbnailState;
        this.f50493m = progress;
        this.f50481C = selectionIndicator;
        this.f50482F = tvPercent;
        this.f50483H = tvVideoDuration;
        this.f50484L = vPercent;
        this.f50485M = videoIndicator;
        this.f50486N = videoLayout;
    }

    @efb
    public static jg8 bind(@efb View rootView) {
        int i = C2558R.id.cardView;
        CardView cardView = (CardView) l8i.findChildViewById(rootView, i);
        if (cardView != null) {
            i = C2558R.id.cl_filter;
            ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
            if (constraintLayout != null) {
                i = C2558R.id.imageView;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2558R.id.iv_thumbnail_bg;
                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = C2558R.id.iv_thumbnail_state;
                        ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView3 != null) {
                            i = C2558R.id.progress;
                            CircleProgressView circleProgressView = (CircleProgressView) l8i.findChildViewById(rootView, i);
                            if (circleProgressView != null) {
                                i = C2558R.id.selectionIndicator;
                                ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                                if (imageView4 != null) {
                                    i = C2558R.id.tv_percent;
                                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView != null) {
                                        i = C2558R.id.tv_video_duration;
                                        TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                        if (textView2 != null) {
                                            i = C2558R.id.v_percent;
                                            SimplePercentageView simplePercentageView = (SimplePercentageView) l8i.findChildViewById(rootView, i);
                                            if (simplePercentageView != null) {
                                                i = C2558R.id.videoIndicator;
                                                ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                                if (imageView5 != null) {
                                                    i = C2558R.id.videoLayout;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                                    if (relativeLayout != null) {
                                                        return new jg8((ConstraintLayout) rootView, cardView, constraintLayout, imageView, imageView2, imageView3, circleProgressView, imageView4, textView, textView2, simplePercentageView, imageView5, relativeLayout);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static jg8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static jg8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_photo, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f50487a;
    }
}
