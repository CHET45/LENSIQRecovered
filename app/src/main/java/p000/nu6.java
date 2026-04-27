package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.common.widget.CircleProgressView;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.view.photo.AdvancedPhotoView;

/* JADX INFO: loaded from: classes4.dex */
public final class nu6 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final LinearLayout f65695C;

    /* JADX INFO: renamed from: F */
    @efb
    public final LinearLayout f65696F;

    /* JADX INFO: renamed from: H */
    @efb
    public final AdvancedPhotoView f65697H;

    /* JADX INFO: renamed from: L */
    @efb
    public final CircleProgressView f65698L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f65699M;

    /* JADX INFO: renamed from: N */
    @efb
    public final ViewStub f65700N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final ViewStub f65701Q;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f65702a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f65703b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f65704c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f65705d;

    /* JADX INFO: renamed from: e */
    @efb
    public final FrameLayout f65706e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f65707f;

    /* JADX INFO: renamed from: m */
    @efb
    public final ImageView f65708m;

    private nu6(@efb ConstraintLayout rootView, @efb LinearLayout btnImgDelete, @efb ImageView btnImgDownload, @efb LinearLayout btnImgEdit, @efb FrameLayout flThumbnail, @efb ImageView ivBack, @efb ImageView ivThumbnailBg, @efb LinearLayout llImageControl, @efb LinearLayout llTop, @efb AdvancedPhotoView photoView, @efb CircleProgressView progress, @efb TextView tvImageTitle, @efb ViewStub vsOperation, @efb ViewStub vsPhoto) {
        this.f65702a = rootView;
        this.f65703b = btnImgDelete;
        this.f65704c = btnImgDownload;
        this.f65705d = btnImgEdit;
        this.f65706e = flThumbnail;
        this.f65707f = ivBack;
        this.f65708m = ivThumbnailBg;
        this.f65695C = llImageControl;
        this.f65696F = llTop;
        this.f65697H = photoView;
        this.f65698L = progress;
        this.f65699M = tvImageTitle;
        this.f65700N = vsOperation;
        this.f65701Q = vsPhoto;
    }

    @efb
    public static nu6 bind(@efb View rootView) {
        int i = C2558R.id.btn_img_delete;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.btn_img_download;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                i = C2558R.id.btn_img_edit;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null) {
                    i = C2558R.id.fl_thumbnail;
                    FrameLayout frameLayout = (FrameLayout) l8i.findChildViewById(rootView, i);
                    if (frameLayout != null) {
                        i = C2558R.id.iv_back;
                        ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView2 != null) {
                            i = C2558R.id.iv_thumbnail_bg;
                            ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                            if (imageView3 != null) {
                                i = C2558R.id.ll_image_control;
                                LinearLayout linearLayout3 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                if (linearLayout3 != null) {
                                    i = C2558R.id.ll_top;
                                    LinearLayout linearLayout4 = (LinearLayout) l8i.findChildViewById(rootView, i);
                                    if (linearLayout4 != null) {
                                        i = C2558R.id.photo_view;
                                        AdvancedPhotoView advancedPhotoView = (AdvancedPhotoView) l8i.findChildViewById(rootView, i);
                                        if (advancedPhotoView != null) {
                                            i = C2558R.id.progress;
                                            CircleProgressView circleProgressView = (CircleProgressView) l8i.findChildViewById(rootView, i);
                                            if (circleProgressView != null) {
                                                i = C2558R.id.tv_image_title;
                                                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView != null) {
                                                    i = C2558R.id.vs_operation;
                                                    ViewStub viewStub = (ViewStub) l8i.findChildViewById(rootView, i);
                                                    if (viewStub != null) {
                                                        i = C2558R.id.vs_photo;
                                                        ViewStub viewStub2 = (ViewStub) l8i.findChildViewById(rootView, i);
                                                        if (viewStub2 != null) {
                                                            return new nu6((ConstraintLayout) rootView, linearLayout, imageView, linearLayout2, frameLayout, imageView2, imageView3, linearLayout3, linearLayout4, advancedPhotoView, circleProgressView, textView, viewStub, viewStub2);
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
    public static nu6 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static nu6 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.fragment_image, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f65702a;
    }
}
