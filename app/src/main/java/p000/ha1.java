package p000;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.params.DialogParams;
import com.mylhyl.circledialog.params.ProgressParams;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes6.dex */
public final class ha1 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public DialogParams f42972a;

    /* JADX INFO: renamed from: b */
    public ProgressParams f42973b;

    /* JADX INFO: renamed from: c */
    public i2c f42974c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f42975d;

    /* JADX INFO: renamed from: e */
    public TextView f42976e;

    /* JADX INFO: renamed from: f */
    public Handler f42977f;

    /* JADX INFO: renamed from: ha1$a */
    public class HandlerC6761a extends Handler {
        public HandlerC6761a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            String str = ((int) ((ha1.this.f42975d.getProgress() / ha1.this.f42975d.getMax()) * 100.0f)) + yv7.f103133a;
            if (ha1.this.f42973b.f24384C.contains("%s")) {
                ha1.this.f42976e.setText(String.format(ha1.this.f42973b.f24384C, str));
                return;
            }
            ha1.this.f42976e.setText(ha1.this.f42973b.f24384C + str);
        }
    }

    public ha1(Context context, DialogParams dialogParams, ProgressParams progressParams, i2c i2cVar) {
        super(context);
        this.f42972a = dialogParams;
        this.f42973b = progressParams;
        this.f42974c = i2cVar;
        init();
    }

    private void createProgressBar() {
        ProgressParams progressParams = this.f42973b;
        int i = progressParams.f24392d;
        if (progressParams.f24389a == 0) {
            if (i != 0) {
                ProgressBar progressBar = new ProgressBar(getContext());
                this.f42975d = progressBar;
                setFieldValue(progressBar, "mOnlyIndeterminate", new Boolean(false));
                this.f42975d.setIndeterminate(false);
                this.f42975d.setProgressDrawableTiled(getContext().getDrawable(i));
            } else {
                this.f42975d = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
            }
            this.f42973b.f24393e = zz1.f106561q;
        } else {
            if (i != 0) {
                ProgressBar progressBar2 = new ProgressBar(getContext());
                this.f42975d = progressBar2;
                progressBar2.setIndeterminateDrawableTiled(getContext().getDrawable(i));
            } else {
                this.f42975d = new ProgressBar(getContext(), null, R.attr.progressBarStyle);
            }
            this.f42973b.f24393e = zz1.f106562r;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C3860a.dp2px(getContext(), this.f42973b.f24393e));
        if (this.f42973b.f24390b != null) {
            layoutParams.setMargins(C3860a.dp2px(getContext(), r1[0]), C3860a.dp2px(getContext(), r1[1]), C3860a.dp2px(getContext(), r1[2]), C3860a.dp2px(getContext(), r1[3]));
        }
        addView(this.f42975d, layoutParams);
    }

    private void createText() {
        TextView textView = new TextView(getContext());
        this.f42976e = textView;
        textView.setGravity(17);
        this.f42976e.setTextSize(this.f42973b.f24387L);
        this.f42976e.setTextColor(this.f42973b.f24386H);
        TextView textView2 = this.f42976e;
        textView2.setTypeface(textView2.getTypeface(), this.f42973b.f24388M);
        if (this.f42973b.f24391c != null) {
            this.f42976e.setPadding(C3860a.dp2px(getContext(), r0[0]), C3860a.dp2px(getContext(), r0[1]), C3860a.dp2px(getContext(), r0[2]), C3860a.dp2px(getContext(), r0[3]));
        }
        addView(this.f42976e);
        this.f42976e.setText(this.f42973b.f24384C);
        ProgressParams progressParams = this.f42973b;
        if (progressParams.f24389a != 0 || TextUtils.isEmpty(progressParams.f24384C)) {
            return;
        }
        this.f42977f = new HandlerC6761a();
    }

    /* JADX INFO: renamed from: d */
    public static Field m12291d(Class cls, String str) {
        while (cls != Object.class) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Field m12292e(Object obj, String str) {
        return m12291d(obj.getClass(), str);
    }

    /* JADX INFO: renamed from: f */
    public static void m12293f(Field field) {
        if (Modifier.isPublic(field.getModifiers()) && Modifier.isPublic(field.getDeclaringClass().getModifiers())) {
            return;
        }
        field.setAccessible(true);
    }

    private void init() {
        setOrientation(1);
        int i = this.f42973b.f24385F;
        if (i == 0) {
            i = this.f42972a.f24298H;
        }
        setBackgroundColor(i);
        createProgressBar();
        createText();
        i2c i2cVar = this.f42974c;
        if (i2cVar != null) {
            i2cVar.onCreateProgressView(this.f42975d, this.f42976e);
        }
    }

    private void onProgressChanged() {
        Handler handler = this.f42977f;
        if (handler == null || handler.hasMessages(0)) {
            return;
        }
        this.f42977f.sendEmptyMessage(0);
    }

    private static void setFieldValue(Object obj, String str, Object obj2) {
        Field fieldM12292e = m12292e(obj, str);
        if (fieldM12292e != null) {
            m12293f(fieldM12292e);
            try {
                fieldM12292e.set(obj, obj2);
                return;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return;
            }
        }
        throw new IllegalArgumentException("Could not find field [" + str + "] on target [" + obj + "]");
    }

    public synchronized void refreshProgress() {
        this.f42975d.setMax(this.f42973b.f24394f);
        this.f42975d.setProgress(this.f42973b.f24395m);
        this.f42975d.setSecondaryProgress(this.f42973b.f24395m + 10);
        onProgressChanged();
    }
}
