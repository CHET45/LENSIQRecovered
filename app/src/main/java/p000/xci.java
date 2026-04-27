package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.view.photo.AdvancedPhotoView;
import com.eyevue.glassapp.view.photo.CropOverlayView;

/* JADX INFO: loaded from: classes4.dex */
public final class xci implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f97531a;

    /* JADX INFO: renamed from: b */
    @efb
    public final CropOverlayView f97532b;

    /* JADX INFO: renamed from: c */
    @efb
    public final AdvancedPhotoView f97533c;

    /* JADX INFO: renamed from: d */
    @efb
    public final AdvancedPhotoView f97534d;

    private xci(@efb ConstraintLayout rootView, @efb CropOverlayView covPhotoView, @efb AdvancedPhotoView filterPhotoView, @efb AdvancedPhotoView originPhotoView) {
        this.f97531a = rootView;
        this.f97532b = covPhotoView;
        this.f97533c = filterPhotoView;
        this.f97534d = originPhotoView;
    }

    @efb
    public static xci bind(@efb View rootView) {
        int i = C2558R.id.cov_photo_view;
        CropOverlayView cropOverlayView = (CropOverlayView) l8i.findChildViewById(rootView, i);
        if (cropOverlayView != null) {
            i = C2558R.id.filter_photo_view;
            AdvancedPhotoView advancedPhotoView = (AdvancedPhotoView) l8i.findChildViewById(rootView, i);
            if (advancedPhotoView != null) {
                i = C2558R.id.origin_photo_view;
                AdvancedPhotoView advancedPhotoView2 = (AdvancedPhotoView) l8i.findChildViewById(rootView, i);
                if (advancedPhotoView2 != null) {
                    return new xci((ConstraintLayout) rootView, cropOverlayView, advancedPhotoView, advancedPhotoView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static xci inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static xci inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.viewstub_fm_image_item1, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f97531a;
    }
}
