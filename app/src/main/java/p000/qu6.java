package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.exoplayer2.p009ui.PlayerView;

/* JADX INFO: loaded from: classes4.dex */
public final class qu6 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f75773a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f75774b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f75775c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f75776d;

    /* JADX INFO: renamed from: e */
    @efb
    public final PhotoView f75777e;

    /* JADX INFO: renamed from: f */
    @efb
    public final PlayerView f75778f;

    private qu6(@efb ConstraintLayout rootView, @efb LinearLayout btnImgDelete, @efb LinearLayout btnImgDownload, @efb LinearLayout llImageControl, @efb PhotoView photoView, @efb PlayerView playerView) {
        this.f75773a = rootView;
        this.f75774b = btnImgDelete;
        this.f75775c = btnImgDownload;
        this.f75776d = llImageControl;
        this.f75777e = photoView;
        this.f75778f = playerView;
    }

    @efb
    public static qu6 bind(@efb View rootView) {
        int i = C2558R.id.btn_img_delete;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.btn_img_download;
            LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = C2558R.id.ll_image_control;
                LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout3 != null) {
                    i = C2558R.id.photo_view;
                    PhotoView photoView = (PhotoView) l8i.findChildViewById(rootView, i);
                    if (photoView != null) {
                        i = C2558R.id.player_view;
                        PlayerView playerView = (PlayerView) l8i.findChildViewById(rootView, i);
                        if (playerView != null) {
                            return new qu6((ConstraintLayout) rootView, linearLayout, linearLayout2, linearLayout3, photoView, playerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static qu6 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static qu6 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.fragment_preview, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f75773a;
    }
}
