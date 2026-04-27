package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class owh implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ProgressBar f69116C;

    /* JADX INFO: renamed from: F */
    @efb
    public final Button f69117F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f69118H;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f69119a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f69120b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f69121c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f69122d;

    /* JADX INFO: renamed from: e */
    @efb
    public final Button f69123e;

    /* JADX INFO: renamed from: f */
    @efb
    public final View f69124f;

    /* JADX INFO: renamed from: m */
    @efb
    public final Button f69125m;

    private owh(@efb RelativeLayout rootView, @efb TextView appName, @efb LinearLayout buttonForceLayout, @efb LinearLayout buttonLayout, @efb Button cancelBtn, @efb View dividerLine, @efb Button okBtn, @efb ProgressBar progressBar, @efb Button updateBtn, @efb TextView updateVersionMsg) {
        this.f69119a = rootView;
        this.f69120b = appName;
        this.f69121c = buttonForceLayout;
        this.f69122d = buttonLayout;
        this.f69123e = cancelBtn;
        this.f69124f = dividerLine;
        this.f69125m = okBtn;
        this.f69116C = progressBar;
        this.f69117F = updateBtn;
        this.f69118H = updateVersionMsg;
    }

    @efb
    public static owh bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.app_name;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2558R.id.button_force_layout;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C2558R.id.button_layout;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null) {
                    i = C2558R.id.cancel_btn;
                    Button button = (Button) l8i.findChildViewById(rootView, i);
                    if (button != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.divider_line))) != null) {
                        i = C2558R.id.ok_btn;
                        Button button2 = (Button) l8i.findChildViewById(rootView, i);
                        if (button2 != null) {
                            i = C2558R.id.progressBar;
                            ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
                            if (progressBar != null) {
                                i = C2558R.id.update_btn;
                                Button button3 = (Button) l8i.findChildViewById(rootView, i);
                                if (button3 != null) {
                                    i = C2558R.id.update_version_msg;
                                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView2 != null) {
                                        return new owh((RelativeLayout) rootView, textView, linearLayout, linearLayout2, button, viewFindChildViewById, button2, progressBar, button3, textView2);
                                    }
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
    public static owh inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static owh inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.update_version_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f69119a;
    }
}
