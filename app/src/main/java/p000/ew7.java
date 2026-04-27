package p000;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ew7 {

    /* JADX INFO: renamed from: b */
    public static final int f34291b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final HashMap<C5497b, WeakReference<C5496a>> f34292a = new HashMap<>();

    /* JADX INFO: renamed from: ew7$a */
    @e0g(parameters = 1)
    public static final class C5496a {

        /* JADX INFO: renamed from: c */
        public static final int f34293c = 0;

        /* JADX INFO: renamed from: a */
        @yfb
        public final dw7 f34294a;

        /* JADX INFO: renamed from: b */
        public final int f34295b;

        public C5496a(@yfb dw7 dw7Var, int i) {
            this.f34294a = dw7Var;
            this.f34295b = i;
        }

        public static /* synthetic */ C5496a copy$default(C5496a c5496a, dw7 dw7Var, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                dw7Var = c5496a.f34294a;
            }
            if ((i2 & 2) != 0) {
                i = c5496a.f34295b;
            }
            return c5496a.copy(dw7Var, i);
        }

        @yfb
        public final dw7 component1() {
            return this.f34294a;
        }

        public final int component2() {
            return this.f34295b;
        }

        @yfb
        public final C5496a copy(@yfb dw7 dw7Var, int i) {
            return new C5496a(dw7Var, i);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5496a)) {
                return false;
            }
            C5496a c5496a = (C5496a) obj;
            return md8.areEqual(this.f34294a, c5496a.f34294a) && this.f34295b == c5496a.f34295b;
        }

        public final int getConfigFlags() {
            return this.f34295b;
        }

        @yfb
        public final dw7 getImageVector() {
            return this.f34294a;
        }

        public int hashCode() {
            return (this.f34294a.hashCode() * 31) + Integer.hashCode(this.f34295b);
        }

        @yfb
        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f34294a + ", configFlags=" + this.f34295b + ')';
        }
    }

    /* JADX INFO: renamed from: ew7$b */
    @e0g(parameters = 0)
    public static final class C5497b {

        /* JADX INFO: renamed from: c */
        public static final int f34296c = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final Resources.Theme f34297a;

        /* JADX INFO: renamed from: b */
        public final int f34298b;

        public C5497b(@yfb Resources.Theme theme, int i) {
            this.f34297a = theme;
            this.f34298b = i;
        }

        public static /* synthetic */ C5497b copy$default(C5497b c5497b, Resources.Theme theme, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                theme = c5497b.f34297a;
            }
            if ((i2 & 2) != 0) {
                i = c5497b.f34298b;
            }
            return c5497b.copy(theme, i);
        }

        @yfb
        public final Resources.Theme component1() {
            return this.f34297a;
        }

        public final int component2() {
            return this.f34298b;
        }

        @yfb
        public final C5497b copy(@yfb Resources.Theme theme, int i) {
            return new C5497b(theme, i);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5497b)) {
                return false;
            }
            C5497b c5497b = (C5497b) obj;
            return md8.areEqual(this.f34297a, c5497b.f34297a) && this.f34298b == c5497b.f34298b;
        }

        public final int getId() {
            return this.f34298b;
        }

        @yfb
        public final Resources.Theme getTheme() {
            return this.f34297a;
        }

        public int hashCode() {
            return (this.f34297a.hashCode() * 31) + Integer.hashCode(this.f34298b);
        }

        @yfb
        public String toString() {
            return "Key(theme=" + this.f34297a + ", id=" + this.f34298b + ')';
        }
    }

    public final void clear() {
        this.f34292a.clear();
    }

    @gib
    public final C5496a get(@yfb C5497b c5497b) {
        WeakReference<C5496a> weakReference = this.f34292a.get(c5497b);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void prune(int i) {
        Iterator<Map.Entry<C5497b, WeakReference<C5496a>>> it = this.f34292a.entrySet().iterator();
        while (it.hasNext()) {
            C5496a c5496a = it.next().getValue().get();
            if (c5496a == null || Configuration.needNewResources(i, c5496a.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(@yfb C5497b c5497b, @yfb C5496a c5496a) {
        this.f34292a.put(c5497b, new WeakReference<>(c5496a));
    }
}
