package p000;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class q8i {

    /* JADX INFO: renamed from: a */
    public static final int f73636a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f73637b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f73638c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f73639d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f73640e = 8;

    /* JADX INFO: renamed from: q8i$a */
    @c5e(26)
    public static class C11386a {
        private C11386a() {
        }

        @ih4
        public static AutofillId getAutofillId(View view) {
            return view.getAutofillId();
        }
    }

    /* JADX INFO: renamed from: q8i$b */
    @c5e(29)
    public static class C11387b {
        private C11387b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static ContentCaptureSession m20177a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* JADX INFO: renamed from: q8i$c */
    @c5e(30)
    public static class C11388c {
        private C11388c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m20178a(View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }

    private q8i() {
    }

    @hib
    public static km0 getAutofillId(@efb View view) {
        return km0.toAutofillIdCompat(C11386a.getAutofillId(view));
    }

    @hib
    public static jv2 getContentCaptureSession(@efb View view) {
        ContentCaptureSession contentCaptureSessionM20177a;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionM20177a = C11387b.m20177a(view)) == null) {
            return null;
        }
        return jv2.toContentCaptureSessionCompat(contentCaptureSessionM20177a, view);
    }

    public static void setImportantForContentCapture(@efb View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C11388c.m20178a(view, i);
        }
    }
}
