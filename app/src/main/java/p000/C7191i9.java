package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.transphoto.C4282R;

/* JADX INFO: renamed from: i9 */
/* JADX INFO: loaded from: classes7.dex */
public final class C7191i9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f46080a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f46081b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f46082c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f46083d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f46084e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f46085f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f46086m;

    private C7191i9(@efb RelativeLayout relativeLayout, @efb ImageView imageView, @efb ImageView imageView2, @efb ImageView imageView3, @efb RelativeLayout relativeLayout2, @efb TextView textView, @efb TextView textView2) {
        this.f46080a = relativeLayout;
        this.f46081b = imageView;
        this.f46082c = imageView2;
        this.f46083d = imageView3;
        this.f46084e = relativeLayout2;
        this.f46085f = textView;
        this.f46086m = textView2;
    }

    @efb
    public static C7191i9 bind(@efb View view) {
        int i = C4282R.id.fr_back;
        ImageView imageView = (ImageView) l8i.findChildViewById(view, i);
        if (imageView != null) {
            i = C4282R.id.iv_copy_original;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C4282R.id.iv_copy_translate;
                ImageView imageView3 = (ImageView) l8i.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = C4282R.id.rl_title;
                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = C4282R.id.tv_original;
                        TextView textView = (TextView) l8i.findChildViewById(view, i);
                        if (textView != null) {
                            i = C4282R.id.tv_translate;
                            TextView textView2 = (TextView) l8i.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C7191i9((RelativeLayout) view, imageView, imageView2, imageView3, relativeLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @efb
    public static C7191i9 inflate(@efb LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @efb
    public static C7191i9 inflate(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C4282R.layout.activity_bilingual_trans, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f46080a;
    }
}
