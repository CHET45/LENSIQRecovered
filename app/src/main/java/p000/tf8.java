package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class tf8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f84524a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f84525b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f84526c;

    private tf8(@efb RelativeLayout rootView, @efb ImageView ivItemRepeatSelected, @efb TextView tvItemRepeatType) {
        this.f84524a = rootView;
        this.f84525b = ivItemRepeatSelected;
        this.f84526c = tvItemRepeatType;
    }

    @efb
    public static tf8 bind(@efb View rootView) {
        int i = C2558R.id.iv_item_repeat_selected;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.tv_item_repeat_type;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                return new tf8((RelativeLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static tf8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static tf8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_alarm_repeat, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f84524a;
    }
}
