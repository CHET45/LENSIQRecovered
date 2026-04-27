package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.C3146R;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: loaded from: classes5.dex */
public final class ln1 {

    /* JADX INFO: renamed from: a */
    @efb
    public final hn1 f58282a;

    /* JADX INFO: renamed from: b */
    @efb
    public final hn1 f58283b;

    /* JADX INFO: renamed from: c */
    @efb
    public final hn1 f58284c;

    /* JADX INFO: renamed from: d */
    @efb
    public final hn1 f58285d;

    /* JADX INFO: renamed from: e */
    @efb
    public final hn1 f58286e;

    /* JADX INFO: renamed from: f */
    @efb
    public final hn1 f58287f;

    /* JADX INFO: renamed from: g */
    @efb
    public final hn1 f58288g;

    /* JADX INFO: renamed from: h */
    @efb
    public final Paint f58289h;

    public ln1(@efb Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(hw9.resolveOrThrow(context, C3146R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C3146R.styleable.MaterialCalendar);
        this.f58282a = hn1.m12496a(context, typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialCalendar_dayStyle, 0));
        this.f58288g = hn1.m12496a(context, typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f58283b = hn1.m12496a(context, typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f58284c = hn1.m12496a(context, typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList = a3a.getColorStateList(context, typedArrayObtainStyledAttributes, C3146R.styleable.MaterialCalendar_rangeFillColor);
        this.f58285d = hn1.m12496a(context, typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialCalendar_yearStyle, 0));
        this.f58286e = hn1.m12496a(context, typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f58287f = hn1.m12496a(context, typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f58289h = paint;
        paint.setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
