package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.watchfun.voicenotes.C4297R;

/* JADX INFO: loaded from: classes7.dex */
public final class hg8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f43422a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f43423b;

    private hg8(@efb RelativeLayout relativeLayout, @efb ImageView imageView) {
        this.f43422a = relativeLayout;
        this.f43423b = imageView;
    }

    @efb
    public static hg8 bind(@efb View view) {
        int i = C4297R.id.iv_volume;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            return new hg8((RelativeLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static hg8 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static hg8 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4297R.layout.item_meeting_volume_level, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f43422a;
    }
}
