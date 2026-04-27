package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.glassapp.C2558R;
import com.haibin.calendarview.CalendarView;

/* JADX INFO: renamed from: x9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14994x9 implements j8i {

    /* JADX INFO: renamed from: C */
    @efb
    public final CalendarView f97215C;

    /* JADX INFO: renamed from: F */
    @efb
    public final EditText f97216F;

    /* JADX INFO: renamed from: H */
    @efb
    public final ImageView f97217H;

    /* JADX INFO: renamed from: L */
    @efb
    public final TextView f97218L;

    /* JADX INFO: renamed from: M */
    @efb
    public final TextView f97219M;

    /* JADX INFO: renamed from: N */
    @efb
    public final TextView f97220N;

    /* JADX INFO: renamed from: Q */
    @efb
    public final TextView f97221Q;

    /* JADX INFO: renamed from: X */
    @efb
    public final TextView f97222X;

    /* JADX INFO: renamed from: Y */
    @efb
    public final TextView f97223Y;

    /* JADX INFO: renamed from: Z */
    @efb
    public final TextView f97224Z;

    /* JADX INFO: renamed from: a */
    @efb
    public final LinearLayout f97225a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ImageView f97226b;

    /* JADX INFO: renamed from: c */
    @efb
    public final ImageView f97227c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ImageView f97228d;

    /* JADX INFO: renamed from: e */
    @efb
    public final RelativeLayout f97229e;

    /* JADX INFO: renamed from: f */
    @efb
    public final ImageView f97230f;

    /* JADX INFO: renamed from: m */
    @efb
    public final RelativeLayout f97231m;

    private C14994x9(@efb LinearLayout rootView, @efb ImageView btnCancel, @efb ImageView btnConfirm, @efb ImageView btnLeft, @efb RelativeLayout btnRepeat, @efb ImageView btnRight, @efb RelativeLayout btnTime, @efb CalendarView calendarView, @efb EditText etRemarks, @efb ImageView swSyncCalendar, @efb TextView tvDate, @efb TextView tvRemarksTip, @efb TextView tvRepeat, @efb TextView tvRepeatTip, @efb TextView tvTime, @efb TextView tvTimeTip, @efb TextView tvTitle) {
        this.f97225a = rootView;
        this.f97226b = btnCancel;
        this.f97227c = btnConfirm;
        this.f97228d = btnLeft;
        this.f97229e = btnRepeat;
        this.f97230f = btnRight;
        this.f97231m = btnTime;
        this.f97215C = calendarView;
        this.f97216F = etRemarks;
        this.f97217H = swSyncCalendar;
        this.f97218L = tvDate;
        this.f97219M = tvRemarksTip;
        this.f97220N = tvRepeat;
        this.f97221Q = tvRepeatTip;
        this.f97222X = tvTime;
        this.f97223Y = tvTimeTip;
        this.f97224Z = tvTitle;
    }

    @efb
    public static C14994x9 bind(@efb View rootView) {
        int i = C2558R.id.btn_cancel;
        ImageView imageView = (ImageView) l8i.findChildViewById(rootView, i);
        if (imageView != null) {
            i = C2558R.id.btn_confirm;
            ImageView imageView2 = (ImageView) l8i.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = C2558R.id.btn_left;
                ImageView imageView3 = (ImageView) l8i.findChildViewById(rootView, i);
                if (imageView3 != null) {
                    i = C2558R.id.btn_repeat;
                    RelativeLayout relativeLayout = (RelativeLayout) l8i.findChildViewById(rootView, i);
                    if (relativeLayout != null) {
                        i = C2558R.id.btn_right;
                        ImageView imageView4 = (ImageView) l8i.findChildViewById(rootView, i);
                        if (imageView4 != null) {
                            i = C2558R.id.btn_time;
                            RelativeLayout relativeLayout2 = (RelativeLayout) l8i.findChildViewById(rootView, i);
                            if (relativeLayout2 != null) {
                                i = C2558R.id.calendar_view;
                                CalendarView calendarView = (CalendarView) l8i.findChildViewById(rootView, i);
                                if (calendarView != null) {
                                    i = C2558R.id.et_remarks;
                                    EditText editText = (EditText) l8i.findChildViewById(rootView, i);
                                    if (editText != null) {
                                        i = C2558R.id.sw_sync_calendar;
                                        ImageView imageView5 = (ImageView) l8i.findChildViewById(rootView, i);
                                        if (imageView5 != null) {
                                            i = C2558R.id.tv_date;
                                            TextView textView = (TextView) l8i.findChildViewById(rootView, i);
                                            if (textView != null) {
                                                i = C2558R.id.tv_remarks_tip;
                                                TextView textView2 = (TextView) l8i.findChildViewById(rootView, i);
                                                if (textView2 != null) {
                                                    i = C2558R.id.tv_repeat;
                                                    TextView textView3 = (TextView) l8i.findChildViewById(rootView, i);
                                                    if (textView3 != null) {
                                                        i = C2558R.id.tv_repeat_tip;
                                                        TextView textView4 = (TextView) l8i.findChildViewById(rootView, i);
                                                        if (textView4 != null) {
                                                            i = C2558R.id.tv_time;
                                                            TextView textView5 = (TextView) l8i.findChildViewById(rootView, i);
                                                            if (textView5 != null) {
                                                                i = C2558R.id.tv_time_tip;
                                                                TextView textView6 = (TextView) l8i.findChildViewById(rootView, i);
                                                                if (textView6 != null) {
                                                                    i = C2558R.id.tv_title;
                                                                    TextView textView7 = (TextView) l8i.findChildViewById(rootView, i);
                                                                    if (textView7 != null) {
                                                                        return new C14994x9((LinearLayout) rootView, imageView, imageView2, imageView3, relativeLayout, imageView4, relativeLayout2, calendarView, editText, imageView5, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static C14994x9 inflate(@efb LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @efb
    public static C14994x9 inflate(@efb LayoutInflater inflater, @hib ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(C2558R.layout.activity_eyevue_alarm_setting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p000.j8i
    @efb
    public LinearLayout getRoot() {
        return this.f97225a;
    }
}
