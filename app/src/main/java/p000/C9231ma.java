package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: ma */
/* JADX INFO: loaded from: classes4.dex */
public final class C9231ma implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ProgressBar f60304C;

    /* JADX INFO: renamed from: F */
    @efb
    public final ScrollView f60305F;

    /* JADX INFO: renamed from: H */
    @efb
    public final RelativeLayout f60306H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f60307L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f60308M;

    /* JADX INFO: renamed from: M1 */
    @efb
    public final TextView f60309M1;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f60310N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f60311Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f60312X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f60313Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f60314Z;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f60315a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f60316b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ConstraintLayout f60317c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f60318d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f60319e;

    /* JADX INFO: renamed from: f */
    @efb
    public final LinearLayout f60320f;

    /* JADX INFO: renamed from: m */
    @efb
    public final LinearLayout f60321m;

    private C9231ma(@efb ConstraintLayout rootView, @efb TextView btnUpdate, @efb ConstraintLayout clUploadLayout, @efb ImageView imageGlassesOta, @efb ImageView ivBack, @efb LinearLayout llUpdateSuccess, @efb LinearLayout llVersion, @efb ProgressBar progressBar, @efb ScrollView svUpdateContent, @efb RelativeLayout toolbar, @efb TextView tvNewVersion, @efb TextView tvProgress, @efb TextView tvSize, @efb TextView tvTip, @efb TextView tvTitle, @efb TextView tvUpdateContent, @efb TextView tvUpdateTip, @efb TextView tvVersion) {
        this.f60315a = rootView;
        this.f60316b = btnUpdate;
        this.f60317c = clUploadLayout;
        this.f60318d = imageGlassesOta;
        this.f60319e = ivBack;
        this.f60320f = llUpdateSuccess;
        this.f60321m = llVersion;
        this.f60304C = progressBar;
        this.f60305F = svUpdateContent;
        this.f60306H = toolbar;
        this.f60307L = tvNewVersion;
        this.f60308M = tvProgress;
        this.f60310N = tvSize;
        this.f60311Q = tvTip;
        this.f60312X = tvTitle;
        this.f60313Y = tvUpdateContent;
        this.f60314Z = tvUpdateTip;
        this.f60309M1 = tvVersion;
    }

    @efb
    public static C9231ma bind(@efb View rootView) {
        int i = C2558R.id.btn_update;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.cl_upload_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) l8i.findChildViewById(rootView, i);
            if (constraintLayout != null) {
                i = C2558R.id.image_glasses_ota;
                ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = C2558R.id.iv_back;
                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = C2558R.id.ll_update_success;
                        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                        if (linearLayout != null) {
                            i = C2558R.id.ll_version;
                            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                            if (linearLayout2 != null) {
                                i = C2558R.id.progressBar;
                                ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
                                if (progressBar != null) {
                                    i = C2558R.id.sv_update_content;
                                    ScrollView scrollView = (ScrollView) l8i.findChildViewById(rootView, i);
                                    if (scrollView != null) {
                                        i = C2558R.id.toolbar;
                                        RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                                        if (relativeLayout != null) {
                                            i = C2558R.id.tv_new_version;
                                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView2 != null) {
                                                i = C2558R.id.tv_progress;
                                                TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView3 != null) {
                                                    i = C2558R.id.tv_size;
                                                    TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView4 != null) {
                                                        i = C2558R.id.tv_tip;
                                                        TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView5 != null) {
                                                            i = C2558R.id.tv_title;
                                                            TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                            if (textView6 != null) {
                                                                i = C2558R.id.tv_update_content;
                                                                TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView7 != null) {
                                                                    i = C2558R.id.tv_update_tip;
                                                                    TextView textView8 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView8 != null) {
                                                                        i = C2558R.id.tv_version;
                                                                        TextView textView9 = (TextView) l8i.findChildViewById(rootView, i);
                                                                        if (textView9 != null) {
                                                                            return new C9231ma((ConstraintLayout) rootView, textView, constraintLayout, imageView, imageView2, linearLayout, linearLayout2, progressBar, scrollView, relativeLayout, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C9231ma inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C9231ma inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_ota, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f60315a;
    }
}
