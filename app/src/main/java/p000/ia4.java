package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eyevue.common.widget.recyclerwheelpicker.RecyclerWheelPicker;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class ia4 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f46182a;

    /* JADX INFO: renamed from: b */
    @efb
    public final LinearLayout f46183b;

    /* JADX INFO: renamed from: c */
    @efb
    public final TextView f46184c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f46185d;

    /* JADX INFO: renamed from: e */
    @efb
    public final View f46186e;

    /* JADX INFO: renamed from: f */
    @efb
    public final RecyclerWheelPicker f46187f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RecyclerWheelPicker f46188m;

    private ia4(@efb LinearLayout rootView, @efb LinearLayout dialogClearTextBottomLayout, @efb TextView dialogClearTextLeftTv, @efb TextView dialogClearTextRightTv, @efb View dialogClearTextVerticalDivide, @efb RecyclerWheelPicker list0, @efb RecyclerWheelPicker list1) {
        this.f46182a = rootView;
        this.f46183b = dialogClearTextBottomLayout;
        this.f46184c = dialogClearTextLeftTv;
        this.f46185d = dialogClearTextRightTv;
        this.f46186e = dialogClearTextVerticalDivide;
        this.f46187f = list0;
        this.f46188m = list1;
    }

    @efb
    public static ia4 bind(@efb View rootView) {
        View viewFindChildViewById;
        int i = C2558R.id.dialog_clear_text_bottom_layout;
        LinearLayout linearLayout = (LinearLayout) l8i.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = C2558R.id.dialog_clear_text_left_tv;
            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
            if (textView != null) {
                i = C2558R.id.dialog_clear_text_right_tv;
                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                if (textView2 != null && (viewFindChildViewById = l8i.findChildViewById(rootView, (i = C2558R.id.dialog_clear_text_vertical_divide))) != null) {
                    i = C2558R.id.list0;
                    RecyclerWheelPicker recyclerWheelPicker = (RecyclerWheelPicker) l8i.findChildViewById(rootView, i);
                    if (recyclerWheelPicker != null) {
                        i = C2558R.id.list1;
                        RecyclerWheelPicker recyclerWheelPicker2 = (RecyclerWheelPicker) l8i.findChildViewById(rootView, i);
                        if (recyclerWheelPicker2 != null) {
                            return new ia4((LinearLayout) rootView, linearLayout, textView, textView2, viewFindChildViewById, recyclerWheelPicker, recyclerWheelPicker2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static ia4 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static ia4 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_alarm_time_setting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f46182a;
    }
}
