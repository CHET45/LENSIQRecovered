package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public final class pwh implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final ProgressBar f72396C;

    /* JADX INFO: renamed from: F */
    @efb
    public final Button f72397F;

    /* JADX INFO: renamed from: H */
    @efb
    public final TextView f72398H;

    /* JADX INFO: renamed from: a */
    @efb
    public final RelativeLayout f72399a;

    /* JADX INFO: renamed from: b */
    @efb
    public final TextView f72400b;

    /* JADX INFO: renamed from: c */
    @efb
    public final LinearLayout f72401c;

    /* JADX INFO: renamed from: d */
    @efb
    public final LinearLayout f72402d;

    /* JADX INFO: renamed from: e */
    @efb
    public final ImageView f72403e;

    /* JADX INFO: renamed from: f */
    @efb
    public final View f72404f;

    /* JADX INFO: renamed from: m */
    @efb
    public final Button f72405m;

    private pwh(@efb RelativeLayout rootView, @efb TextView appName, @efb LinearLayout buttonForceLayout, @efb LinearLayout buttonLayout, @efb ImageView cancelBtn, @efb View dividerLine, @efb Button okBtn, @efb ProgressBar progressBar, @efb Button updateBtn, @efb TextView updateVersionMsg) {
        this.f72399a = rootView;
        this.f72400b = appName;
        this.f72401c = buttonForceLayout;
        this.f72402d = buttonLayout;
        this.f72403e = cancelBtn;
        this.f72404f = dividerLine;
        this.f72405m = okBtn;
        this.f72396C = progressBar;
        this.f72397F = updateBtn;
        this.f72398H = updateVersionMsg;
    }

    @efb
    public static pwh bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2531R.id.app_name;
        TextView textView = (TextView) l8i.findChildViewById(rootView, i);
        if (textView != null) {
            i = C2531R.id.button_force_layout;
            LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
            if (linearLayout != null) {
                i = C2531R.id.button_layout;
                LinearLayout linearLayout2 = (LinearLayout) l8i.findChildViewById(rootView, i);
                if (linearLayout2 != null) {
                    i = C2531R.id.cancel_btn;
                    ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
                    if (imageView != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2531R.id.divider_line))) != null) {
                        i = C2531R.id.ok_btn;
                        Button button = (Button) l8i.findChildViewById(rootView, i);
                        if (button != null) {
                            i = C2531R.id.progressBar;
                            ProgressBar progressBar = (ProgressBar) l8i.findChildViewById(rootView, i);
                            if (progressBar != null) {
                                i = C2531R.id.update_btn;
                                Button button2 = (Button) l8i.findChildViewById(rootView, i);
                                if (button2 != null) {
                                    i = C2531R.id.update_version_msg;
                                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                    if (textView2 != null) {
                                        return new pwh((RelativeLayout) rootView, textView, linearLayout, linearLayout2, imageView, viewFindChildViewById, button, progressBar, button2, textView2);
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
    public static pwh inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static pwh inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2531R.layout.update_version_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public RelativeLayout getRoot() {
        return this.f72399a;
    }
}
