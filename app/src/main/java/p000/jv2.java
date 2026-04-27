package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class jv2 {

    /* JADX INFO: renamed from: c */
    public static final String f51995c = "TREAT_AS_VIEW_TREE_APPEARING";

    /* JADX INFO: renamed from: d */
    public static final String f51996d = "TREAT_AS_VIEW_TREE_APPEARED";

    /* JADX INFO: renamed from: a */
    public final Object f51997a;

    /* JADX INFO: renamed from: b */
    public final View f51998b;

    /* JADX INFO: renamed from: jv2$a */
    @c5e(23)
    public static class C8101a {
        private C8101a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Bundle m14345a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* JADX INFO: renamed from: jv2$b */
    @c5e(29)
    public static class C8102b {
        private C8102b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static AutofillId m14346a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static ViewStructure m14347b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static ViewStructure m14348c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m14349d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m14350e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        @ih4
        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }
    }

    /* JADX INFO: renamed from: jv2$c */
    @c5e(34)
    public static class C8103c {
        private C8103c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m14351a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @c5e(29)
    private jv2(@efb ContentCaptureSession contentCaptureSession, @efb View view) {
        this.f51997a = contentCaptureSession;
        this.f51998b = view;
    }

    @c5e(29)
    @efb
    public static jv2 toContentCaptureSessionCompat(@efb ContentCaptureSession contentCaptureSession, @efb View view) {
        return new jv2(contentCaptureSession, view);
    }

    @hib
    public AutofillId newAutofillId(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionM13440a = iv2.m13440a(this.f51997a);
        km0 autofillId = q8i.getAutofillId(this.f51998b);
        Objects.requireNonNull(autofillId);
        return C8102b.m14346a(contentCaptureSessionM13440a, autofillId.toAutofillId(), j);
    }

    @hib
    public pbi newVirtualViewStructure(@efb AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return pbi.toViewStructureCompat(C8102b.m14348c(iv2.m13440a(this.f51997a), autofillId, j));
        }
        return null;
    }

    public void notifyViewTextChanged(@efb AutofillId autofillId, @hib CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8102b.notifyViewTextChanged(iv2.m13440a(this.f51997a), autofillId, charSequence);
        }
    }

    public void notifyViewsAppeared(@efb List<ViewStructure> list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C8103c.m14351a(iv2.m13440a(this.f51997a), list);
            return;
        }
        if (i >= 29) {
            ViewStructure viewStructureM14347b = C8102b.m14347b(iv2.m13440a(this.f51997a), this.f51998b);
            C8101a.m14345a(viewStructureM14347b).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C8102b.m14349d(iv2.m13440a(this.f51997a), viewStructureM14347b);
            for (int i2 = 0; i2 < list.size(); i2++) {
                C8102b.m14349d(iv2.m13440a(this.f51997a), list.get(i2));
            }
            ViewStructure viewStructureM14347b2 = C8102b.m14347b(iv2.m13440a(this.f51997a), this.f51998b);
            C8101a.m14345a(viewStructureM14347b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C8102b.m14349d(iv2.m13440a(this.f51997a), viewStructureM14347b2);
        }
    }

    public void notifyViewsDisappeared(@efb long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ContentCaptureSession contentCaptureSessionM13440a = iv2.m13440a(this.f51997a);
            km0 autofillId = q8i.getAutofillId(this.f51998b);
            Objects.requireNonNull(autofillId);
            C8102b.m14350e(contentCaptureSessionM13440a, autofillId.toAutofillId(), jArr);
            return;
        }
        if (i >= 29) {
            ViewStructure viewStructureM14347b = C8102b.m14347b(iv2.m13440a(this.f51997a), this.f51998b);
            C8101a.m14345a(viewStructureM14347b).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C8102b.m14349d(iv2.m13440a(this.f51997a), viewStructureM14347b);
            ContentCaptureSession contentCaptureSessionM13440a2 = iv2.m13440a(this.f51997a);
            km0 autofillId2 = q8i.getAutofillId(this.f51998b);
            Objects.requireNonNull(autofillId2);
            C8102b.m14350e(contentCaptureSessionM13440a2, autofillId2.toAutofillId(), jArr);
            ViewStructure viewStructureM14347b2 = C8102b.m14347b(iv2.m13440a(this.f51997a), this.f51998b);
            C8101a.m14345a(viewStructureM14347b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C8102b.m14349d(iv2.m13440a(this.f51997a), viewStructureM14347b2);
        }
    }

    @c5e(29)
    @efb
    public ContentCaptureSession toContentCaptureSession() {
        return iv2.m13440a(this.f51997a);
    }
}
