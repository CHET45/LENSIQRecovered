package p000;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ch4 extends View {

    /* JADX INFO: renamed from: b */
    public static final int f16525b = 1;

    /* JADX INFO: renamed from: a */
    public int f16526a;

    public ch4(Context context) {
        this(context, 1);
    }

    public void setBgColor(int i) {
        setBackgroundColor(i);
    }

    public ch4(Context context, int i) {
        this(context, i, 1);
    }

    public ch4(Context context, int i, int i2) {
        super(context);
        this.f16526a = i;
        setBackgroundColor(wz1.f95826k);
        if (this.f16526a == 1) {
            setLayoutParams(new LinearLayout.LayoutParams(i2, -1));
        } else {
            setLayoutParams(new LinearLayout.LayoutParams(-1, i2));
        }
    }
}
