package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class kv2 {

    /* JADX INFO: renamed from: c */
    public static final String f55432c = "TREAT_AS_VIEW_TREE_APPEARING";

    /* JADX INFO: renamed from: d */
    public static final String f55433d = "TREAT_AS_VIEW_TREE_APPEARED";

    /* JADX INFO: renamed from: a */
    public final Object f55434a;

    /* JADX INFO: renamed from: b */
    public final View f55435b;

    /* JADX INFO: renamed from: kv2$a */
    @c5e(23)
    public static class C8530a {
        private C8530a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Bundle m15014a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* JADX INFO: renamed from: kv2$b */
    @c5e(29)
    public static class C8531b {
        private C8531b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static AutofillId m15015a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static ViewStructure m15016b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static ViewStructure m15017c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m15018d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m15019e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        @ih4
        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }
    }

    /* JADX INFO: renamed from: kv2$c */
    @c5e(34)
    public static class C8532c {
        private C8532c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m15020a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @c5e(29)
    private kv2(@efb ContentCaptureSession contentCaptureSession, @efb View view) {
        this.f55434a = contentCaptureSession;
        this.f55435b = view;
    }

    @c5e(29)
    @efb
    public static kv2 toContentCaptureSessionCompat(@efb ContentCaptureSession contentCaptureSession, @efb View view) {
        return new kv2(contentCaptureSession, view);
    }

    @hib
    public AutofillId newAutofillId(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionM13440a = iv2.m13440a(this.f55434a);
        jm0 autofillId = o8i.getAutofillId(this.f55435b);
        Objects.requireNonNull(autofillId);
        return C8531b.m15015a(contentCaptureSessionM13440a, autofillId.toAutofillId(), j);
    }

    @hib
    public qbi newVirtualViewStructure(@efb AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return qbi.toViewStructureCompat(C8531b.m15017c(iv2.m13440a(this.f55434a), autofillId, j));
        }
        return null;
    }

    public void notifyViewTextChanged(@efb AutofillId autofillId, @hib CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8531b.notifyViewTextChanged(iv2.m13440a(this.f55434a), autofillId, charSequence);
        }
    }

    public void notifyViewsAppeared(@efb List<ViewStructure> list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C8532c.m15020a(iv2.m13440a(this.f55434a), list);
            return;
        }
        if (i >= 29) {
            ViewStructure viewStructureM15016b = C8531b.m15016b(iv2.m13440a(this.f55434a), this.f55435b);
            C8530a.m15014a(viewStructureM15016b).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C8531b.m15018d(iv2.m13440a(this.f55434a), viewStructureM15016b);
            for (int i2 = 0; i2 < list.size(); i2++) {
                C8531b.m15018d(iv2.m13440a(this.f55434a), list.get(i2));
            }
            ViewStructure viewStructureM15016b2 = C8531b.m15016b(iv2.m13440a(this.f55434a), this.f55435b);
            C8530a.m15014a(viewStructureM15016b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C8531b.m15018d(iv2.m13440a(this.f55434a), viewStructureM15016b2);
        }
    }

    public void notifyViewsDisappeared(@efb long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ContentCaptureSession contentCaptureSessionM13440a = iv2.m13440a(this.f55434a);
            jm0 autofillId = o8i.getAutofillId(this.f55435b);
            Objects.requireNonNull(autofillId);
            C8531b.m15019e(contentCaptureSessionM13440a, autofillId.toAutofillId(), jArr);
            return;
        }
        if (i >= 29) {
            ViewStructure viewStructureM15016b = C8531b.m15016b(iv2.m13440a(this.f55434a), this.f55435b);
            C8530a.m15014a(viewStructureM15016b).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C8531b.m15018d(iv2.m13440a(this.f55434a), viewStructureM15016b);
            ContentCaptureSession contentCaptureSessionM13440a2 = iv2.m13440a(this.f55434a);
            jm0 autofillId2 = o8i.getAutofillId(this.f55435b);
            Objects.requireNonNull(autofillId2);
            C8531b.m15019e(contentCaptureSessionM13440a2, autofillId2.toAutofillId(), jArr);
            ViewStructure viewStructureM15016b2 = C8531b.m15016b(iv2.m13440a(this.f55434a), this.f55435b);
            C8530a.m15014a(viewStructureM15016b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C8531b.m15018d(iv2.m13440a(this.f55434a), viewStructureM15016b2);
        }
    }

    @c5e(29)
    @efb
    public ContentCaptureSession toContentCaptureSession() {
        return iv2.m13440a(this.f55434a);
    }
}
