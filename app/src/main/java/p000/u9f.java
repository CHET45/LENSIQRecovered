package p000;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class u9f {

    /* JADX INFO: renamed from: u9f$a */
    @Deprecated
    public static final class C13417a {

        /* JADX INFO: renamed from: b */
        public static C13417a f87227b;

        /* JADX INFO: renamed from: a */
        public final a f87228a = new a();

        /* JADX INFO: renamed from: u9f$a$a */
        public static class a {
            public void apply(@efb SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private C13417a() {
        }

        @Deprecated
        public static C13417a getInstance() {
            if (f87227b == null) {
                f87227b = new C13417a();
            }
            return f87227b;
        }

        @Deprecated
        public void apply(@efb SharedPreferences.Editor editor) {
            this.f87228a.apply(editor);
        }
    }

    private u9f() {
    }
}
