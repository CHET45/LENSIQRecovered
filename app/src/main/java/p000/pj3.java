package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.C3146R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class pj3 extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f71065d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f71066e = 4;

    /* JADX INFO: renamed from: a */
    @efb
    public final Calendar f71067a;

    /* JADX INFO: renamed from: b */
    public final int f71068b;

    /* JADX INFO: renamed from: c */
    public final int f71069c;

    public pj3() {
        Calendar calendarM14407p = jzh.m14407p();
        this.f71067a = calendarM14407p;
        this.f71068b = calendarM14407p.getMaximum(7);
        this.f71069c = calendarM14407p.getFirstDayOfWeek();
    }

    private int positionToDayOfWeek(int i) {
        int i2 = i + this.f71069c;
        int i3 = this.f71068b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f71068b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @hib
    @igg({"WrongConstant"})
    public View getView(int i, @hib View view, @efb ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C3146R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f71067a.set(7, positionToDayOfWeek(i));
        textView.setText(this.f71067a.getDisplayName(7, f71066e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C3146R.string.mtrl_picker_day_of_week_column_header), this.f71067a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    @hib
    public Integer getItem(int i) {
        if (i >= this.f71068b) {
            return null;
        }
        return Integer.valueOf(positionToDayOfWeek(i));
    }

    public pj3(int i) {
        Calendar calendarM14407p = jzh.m14407p();
        this.f71067a = calendarM14407p;
        this.f71068b = calendarM14407p.getMaximum(7);
        this.f71069c = i;
    }
}
