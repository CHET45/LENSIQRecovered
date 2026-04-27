package p000;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class bx2 {

    /* JADX INFO: renamed from: a */
    public final Set<C2095a> f15122a = new HashSet();

    /* JADX INFO: renamed from: bx2$a */
    public static final class C2095a {

        /* JADX INFO: renamed from: a */
        @efb
        public final Uri f15123a;

        /* JADX INFO: renamed from: b */
        public final boolean f15124b;

        public C2095a(@efb Uri uri, boolean triggerForDescendants) {
            this.f15123a = uri;
            this.f15124b = triggerForDescendants;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || C2095a.class != o.getClass()) {
                return false;
            }
            C2095a c2095a = (C2095a) o;
            return this.f15124b == c2095a.f15124b && this.f15123a.equals(c2095a.f15123a);
        }

        @efb
        public Uri getUri() {
            return this.f15123a;
        }

        public int hashCode() {
            return (this.f15123a.hashCode() * 31) + (this.f15124b ? 1 : 0);
        }

        public boolean shouldTriggerForDescendants() {
            return this.f15124b;
        }
    }

    public void add(@efb Uri uri, boolean triggerForDescendants) {
        this.f15122a.add(new C2095a(uri, triggerForDescendants));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || bx2.class != o.getClass()) {
            return false;
        }
        return this.f15122a.equals(((bx2) o).f15122a);
    }

    @efb
    public Set<C2095a> getTriggers() {
        return this.f15122a;
    }

    public int hashCode() {
        return this.f15122a.hashCode();
    }

    public int size() {
        return this.f15122a.size();
    }
}
