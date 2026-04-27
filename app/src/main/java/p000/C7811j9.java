package p000;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: j9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7811j9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f49942a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f49943b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextureView f49944c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ToolBar f49945d;

    private C7811j9(@efb RelativeLayout rootView, @efb ImageView btnCamera, @efb TextureView textureView, @efb ToolBar toolbar) {
        this.f49942a = rootView;
        this.f49943b = btnCamera;
        this.f49944c = textureView;
        this.f49945d = toolbar;
    }

    @efb
    public static C7811j9 bind(@efb View rootView) {
        int i = C2558R.id.btn_camera;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.textureView;
            TextureView textureView = (TextureView) l8i.findChildViewById(rootView, i);
            if (textureView != null) {
                i = C2558R.id.toolbar;
                ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
                if (toolBar != null) {
                    return new C7811j9((RelativeLayout) rootView, imageView, textureView, toolBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C7811j9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C7811j9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_camera_preview, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f49942a;
    }
}
