package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class rx6 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f80061a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f80062b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f80063c;

    private rx6(@efb RelativeLayout rootView, @efb TextView btnFirstAddDevice, @efb ImageView ivAddAnim) {
        this.f80061a = rootView;
        this.f80062b = btnFirstAddDevice;
        this.f80063c = ivAddAnim;
    }

    @efb
    public static rx6 bind(@efb View rootView) {
        int i = C2558R.id.btn_first_add_device;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.iv_add_anim;
            ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView != null) {
                return new rx6((RelativeLayout) rootView, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static rx6 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static rx6 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.frgament_eyevue_none, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f80061a;
    }
}
