package p000;

import android.content.LocusId;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class wh9 {

    /* JADX INFO: renamed from: a */
    public final String f94263a;

    /* JADX INFO: renamed from: b */
    public final LocusId f94264b;

    /* JADX INFO: renamed from: wh9$a */
    @c5e(29)
    public static class C14605a {
        private C14605a() {
        }

        @efb
        /* JADX INFO: renamed from: a */
        public static LocusId m24555a(@efb String str) {
            return new LocusId(str);
        }

        @efb
        /* JADX INFO: renamed from: b */
        public static String m24556b(@efb LocusId locusId) {
            return locusId.getId();
        }
    }

    public wh9(@efb String str) {
        this.f94263a = (String) z7d.checkStringNotEmpty(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f94264b = C14605a.m24555a(str);
        } else {
            this.f94264b = null;
        }
    }

    @efb
    private String getSanitizedId() {
        return this.f94263a.length() + "_chars";
    }

    @c5e(29)
    @efb
    public static wh9 toLocusIdCompat(@efb LocusId locusId) {
        z7d.checkNotNull(locusId, "locusId cannot be null");
        return new wh9((String) z7d.checkStringNotEmpty(C14605a.m24556b(locusId), "id cannot be empty"));
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wh9.class != obj.getClass()) {
            return false;
        }
        wh9 wh9Var = (wh9) obj;
        String str = this.f94263a;
        return str == null ? wh9Var.f94263a == null : str.equals(wh9Var.f94263a);
    }

    @efb
    public String getId() {
        return this.f94263a;
    }

    public int hashCode() {
        String str = this.f94263a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @c5e(29)
    @efb
    public LocusId toLocusId() {
        return this.f94264b;
    }

    @efb
    public String toString() {
        return "LocusIdCompat[" + getSanitizedId() + "]";
    }
}
