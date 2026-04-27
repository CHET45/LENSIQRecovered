package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;
import p000.p11;

/* JADX INFO: loaded from: classes3.dex */
public final class oli {

    /* JADX INFO: renamed from: a */
    public static final int f68101a = 8;

    /* JADX INFO: renamed from: b */
    public static final int f68102b = 9;

    /* JADX INFO: renamed from: c */
    public static final int f68103c = 10;

    /* JADX INFO: renamed from: oli$a */
    public static class C10460a {
        private C10460a() {
        }

        /* JADX INFO: renamed from: a */
        public static void m18772a(@efb Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | p11.C10745b.f69378f);
        }
    }

    /* JADX INFO: renamed from: oli$b */
    @c5e(28)
    public static class C10461b {
        private C10461b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static <T> T m18773a(Window window, int i) {
            return (T) window.requireViewById(i);
        }
    }

    /* JADX INFO: renamed from: oli$c */
    @c5e(30)
    public static class C10462c {
        private C10462c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m18774a(@efb Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    private oli() {
    }

    @efb
    public static xni getInsetsController(@efb Window window, @efb View view) {
        return new xni(window, view);
    }

    @efb
    public static <T extends View> T requireViewById(@efb Window window, @kr7 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C10461b.m18773a(window, i);
        }
        T t = (T) window.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(@efb Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C10462c.m18774a(window, z);
        } else {
            C10460a.m18772a(window, z);
        }
    }
}
