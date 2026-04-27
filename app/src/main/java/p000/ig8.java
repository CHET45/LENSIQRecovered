package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public final class ig8 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final TextView f46785C;

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f46786a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Button f46787b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Group f46788c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f46789d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f46790e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f46791f;

    /* JADX INFO: renamed from: m */
    @efb
    public final TextView f46792m;

    private ig8(@efb ConstraintLayout rootView, @efb Button btnDownload, @efb Group groupStatus, @efb TextView tvName, @efb TextView tvProgress, @efb TextView tvRedownload, @efb TextView tvSize, @efb TextView tvStatus) {
        this.f46786a = rootView;
        this.f46787b = btnDownload;
        this.f46788c = groupStatus;
        this.f46789d = tvName;
        this.f46790e = tvProgress;
        this.f46791f = tvRedownload;
        this.f46792m = tvSize;
        this.f46785C = tvStatus;
    }

    @efb
    public static ig8 bind(@efb View rootView) {
        int i = C4035R.id.btn_download;
        Button button = (Button) l8i.findChildViewById(rootView, i);
        if (button != null) {
            i = C4035R.id.group_status;
            Group group = (Group) l8i.findChildViewById(rootView, i);
            if (group != null) {
                i = C4035R.id.tv_name;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C4035R.id.tv_progress;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = C4035R.id.tv_redownload;
                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = C4035R.id.tv_size;
                            TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                i = C4035R.id.tv_status;
                                TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                if (textView5 != null) {
                                    return new ig8((ConstraintLayout) rootView, button, group, textView, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ig8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ig8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C4035R.layout.item_offline_language_pack, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f46786a;
    }
}
