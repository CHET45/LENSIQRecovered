package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: c9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2240c9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f15995a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f15996b;

    /* JADX INFO: renamed from: c */
    @efb
    public final EditText f15997c;

    /* JADX INFO: renamed from: d */
    @efb
    public final RecyclerView f15998d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f15999e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f16000f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f16001m;

    private C2240c9(@efb LinearLayout rootView, @efb ImageView ivBack, @efb EditText searchEdit, @efb RecyclerView selectTransRc, @efb RelativeLayout title, @efb TextView tvNum, @efb TextView tvTitle) {
        this.f15995a = rootView;
        this.f15996b = ivBack;
        this.f15997c = searchEdit;
        this.f15998d = selectTransRc;
        this.f15999e = title;
        this.f16000f = tvNum;
        this.f16001m = tvTitle;
    }

    @efb
    public static C2240c9 bind(@efb View rootView) {
        int i = C2558R.id.iv_back;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.search_edit;
            EditText editText = (EditText) l8i.findChildViewById(rootView, i);
            if (editText != null) {
                i = C2558R.id.select_trans_rc;
                RecyclerView recyclerView = (RecyclerView) l8i.findChildViewById(rootView, i);
                if (recyclerView != null) {
                    i = C2558R.id.title;
                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                    if (relativeLayout != null) {
                        i = C2558R.id.tv_num;
                        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = C2558R.id.tv_title;
                            TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                return new C2240c9((LinearLayout) rootView, imageView, editText, recyclerView, relativeLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C2240c9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C2240c9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_ai_select_tarns, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f15995a;
    }
}
