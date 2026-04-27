package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.trans.C4035R;

/* JADX INFO: renamed from: jb */
/* JADX INFO: loaded from: classes6.dex */
public final class C7828jb implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f50141a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f50142b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f50143c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RecyclerView f50144d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f50145e;

    private C7828jb(@efb ConstraintLayout rootView, @efb ImageView ivBack, @efb LinearLayout llTitle, @efb RecyclerView rvLanguage, @efb TextView tvTitle) {
        this.f50141a = rootView;
        this.f50142b = ivBack;
        this.f50143c = llTitle;
        this.f50144d = rvLanguage;
        this.f50145e = tvTitle;
    }

    @efb
    public static C7828jb bind(@efb View rootView) {
        int i = C4035R.id.iv_back;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C4035R.id.ll_title;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C4035R.id.rv_language;
                RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                if (recyclerView != null) {
                    i = C4035R.id.tv_title;
                    TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView != null) {
                        return new C7828jb((ConstraintLayout) rootView, imageView, linearLayout, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C7828jb inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C7828jb inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.activity_language_download, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f50141a;
    }
}
