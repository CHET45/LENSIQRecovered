package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.C0392R;

/* JADX INFO: loaded from: classes.dex */
public class hy2 extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f45211f;

    /* JADX INFO: renamed from: a */
    public int f45212a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f45213b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f45214c;

    /* JADX INFO: renamed from: d */
    public Configuration f45215d;

    /* JADX INFO: renamed from: e */
    public Resources f45216e;

    /* JADX INFO: renamed from: hy2$a */
    @c5e(17)
    public static class C7079a {
        private C7079a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Context m12658a(hy2 hy2Var, Configuration configuration) {
            return hy2Var.createConfigurationContext(configuration);
        }
    }

    public hy2() {
        super(null);
    }

    private Resources getResourcesInternal() {
        if (this.f45216e == null) {
            Configuration configuration = this.f45215d;
            if (configuration == null || isEmptyConfiguration(configuration)) {
                this.f45216e = super.getResources();
            } else {
                this.f45216e = C7079a.m12658a(this, this.f45215d).getResources();
            }
        }
        return this.f45216e;
    }

    private void initializeTheme() {
        boolean z = this.f45213b == null;
        if (z) {
            this.f45213b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f45213b.setTo(theme);
            }
        }
        m12657a(this.f45213b, this.f45212a, z);
    }

    @c5e(26)
    private static boolean isEmptyConfiguration(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f45211f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f45211f = configuration2;
        }
        return configuration.equals(f45211f);
    }

    /* JADX INFO: renamed from: a */
    public void m12657a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public void applyOverrideConfiguration(Configuration configuration) {
        if (this.f45216e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f45215d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f45215d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return getResourcesInternal();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f45214c == null) {
            this.f45214c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f45214c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f45213b;
        if (theme != null) {
            return theme;
        }
        if (this.f45212a == 0) {
            this.f45212a = C0392R.style.Theme_AppCompat_Light;
        }
        initializeTheme();
        return this.f45213b;
    }

    public int getThemeResId() {
        return this.f45212a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f45212a != i) {
            this.f45212a = i;
            initializeTheme();
        }
    }

    public hy2(Context context, @dbg int i) {
        super(context);
        this.f45212a = i;
    }

    public hy2(Context context, Resources.Theme theme) {
        super(context);
        this.f45213b = theme;
    }
}
