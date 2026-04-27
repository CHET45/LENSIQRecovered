package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.widget.toolbar.ToolBar;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: renamed from: y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15567y9 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f100807a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ToolBar f100808b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f100809c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f100810d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f100811e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f100812f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f100813m;

    private C15567y9(@efb LinearLayout rootView, @efb ToolBar toolbar, @efb TextView tvHuawei, @efb TextView tvOppo, @efb TextView tvSamsung, @efb TextView tvVivo, @efb TextView tvXiaomi) {
        this.f100807a = rootView;
        this.f100808b = toolbar;
        this.f100809c = tvHuawei;
        this.f100810d = tvOppo;
        this.f100811e = tvSamsung;
        this.f100812f = tvVivo;
        this.f100813m = tvXiaomi;
    }

    @efb
    public static C15567y9 bind(@efb View rootView) {
        int i = C2558R.id.toolbar;
        ToolBar toolBar = (ToolBar) l8i.findChildViewById(rootView, i);
        if (toolBar != null) {
            i = C2558R.id.tv_huawei;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2558R.id.tv_oppo;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = C2558R.id.tv_samsung;
                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = C2558R.id.tv_vivo;
                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView4 != null) {
                            i = C2558R.id.tv_xiaomi;
                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView5 != null) {
                                return new C15567y9((LinearLayout) rootView, toolBar, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static C15567y9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C15567y9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_back_phone_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f100807a;
    }
}
