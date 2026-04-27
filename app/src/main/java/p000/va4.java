package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class va4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f90458a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f90459b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RecyclerView f90460c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f90461d;

    private va4(@efb ConstraintLayout rootView, @efb ImageView ivClose, @efb RecyclerView rvDeviceList, @efb TextView tvTitle) {
        this.f90458a = rootView;
        this.f90459b = ivClose;
        this.f90460c = rvDeviceList;
        this.f90461d = tvTitle;
    }

    @efb
    public static va4 bind(@efb View rootView) {
        int i = C2558R.id.iv_close;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.rv_device_list;
            RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
            if (recyclerView != null) {
                i = C2558R.id.tv_title;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    return new va4((ConstraintLayout) rootView, imageView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static va4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static va4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_device_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f90458a;
    }
}
