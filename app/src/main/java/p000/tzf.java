package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0901d;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class tzf implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final View f86442a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f86443b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f86444c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f86445d;

    private tzf(@efb View rootView, @efb ImageView srlClassicsArrow, @efb ImageView srlClassicsProgress, @efb TextView srlClassicsTitle) {
        this.f86442a = rootView;
        this.f86443b = srlClassicsArrow;
        this.f86444c = srlClassicsProgress;
        this.f86445d = srlClassicsTitle;
    }

    @efb
    public static tzf bind(@efb View rootView) {
        int i = C2558R.id.srl_classics_arrow;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.srl_classics_progress;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2558R.id.srl_classics_title;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    return new tzf(rootView, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static tzf inflate(@efb LayoutInflater inflater, @efb ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(C0901d.f6975V1);
        }
        inflater.inflate(C2558R.layout.srl_classics_footer, parent);
        return bind(parent);
    }

    @Override // p000.j8i
    @efb
    public View getRoot() {
        return this.f86442a;
    }
}
