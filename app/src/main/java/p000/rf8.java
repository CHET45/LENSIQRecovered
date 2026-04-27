package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public final class rf8 implements j8i {

    /* JADX INFO: renamed from: a */
    @efb
    public final ConstraintLayout f78152a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f78153b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f78154c;

    /* JADX INFO: renamed from: d */
    @efb
    public final TextView f78155d;

    /* JADX INFO: renamed from: e */
    @efb
    public final TextView f78156e;

    /* JADX INFO: renamed from: f */
    @efb
    public final TextView f78157f;

    private rf8(@efb ConstraintLayout rootView, @efb ImageView btnMore, @efb ImageView swItemAlarm, @efb TextView tvItemAlarmDes, @efb TextView tvItemAlarmOutOfDate, @efb TextView tvItemAlarmTime) {
        this.f78152a = rootView;
        this.f78153b = btnMore;
        this.f78154c = swItemAlarm;
        this.f78155d = tvItemAlarmDes;
        this.f78156e = tvItemAlarmOutOfDate;
        this.f78157f = tvItemAlarmTime;
    }

    @efb
    public static rf8 bind(@efb View rootView) {
        int i = C2558R.id.btn_more;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.sw_item_alarm;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2558R.id.tv_item_alarm_des;
                TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                if (textView != null) {
                    i = C2558R.id.tv_item_alarm_out_of_date;
                    TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = C2558R.id.tv_item_alarm_time;
                        TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            return new rf8((ConstraintLayout) rootView, imageView, imageView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @efb
    public static rf8 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static rf8 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.item_alarm, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public ConstraintLayout getRoot() {
        return this.f78152a;
    }
}
