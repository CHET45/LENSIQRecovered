package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class vf8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f90869a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f90870b;

    /* JADX INFO: renamed from: c */
    @efb
    public final CardView f90871c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f90872d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f90873e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f90874f;

    private vf8(@efb RelativeLayout rootView, @efb ImageView imgLoadPoint, @efb CardView itemOne, @efb LinearLayout itemTwo, @efb ImageView ivImg, @efb ImageView ivSelect) {
        this.f90869a = rootView;
        this.f90870b = imgLoadPoint;
        this.f90871c = itemOne;
        this.f90872d = itemTwo;
        this.f90873e = ivImg;
        this.f90874f = ivSelect;
    }

    @efb
    public static vf8 bind(@efb View rootView) {
        int i = C2558R.id.img_load_point;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.item_one;
            CardView cardView = (CardView) l8i.findChildViewById(rootView, i);
            if (cardView != null) {
                i = C2558R.id.item_two;
                LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = C2558R.id.iv_img;
                    ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        i = C2558R.id.iv_select;
                        ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView3 != null) {
                            return new vf8((RelativeLayout) rootView, imageView, cardView, linearLayout, imageView2, imageView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static vf8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static vf8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_chat_user_imgae, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f90869a;
    }
}
