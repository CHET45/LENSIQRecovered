package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class we9 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14566a f94035b = new C14566a(null);

    /* JADX INFO: renamed from: c */
    public static final int f94036c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Locale f94037a;

    /* JADX INFO: renamed from: we9$a */
    public static final class C14566a {
        public /* synthetic */ C14566a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final we9 getCurrent() {
            return gxc.getPlatformLocaleDelegate().getCurrent().get(0);
        }

        private C14566a() {
        }
    }

    public we9(@yfb Locale locale) {
        this.f94037a = locale;
    }

    public boolean equals(@gib Object obj) {
        if (obj == null || !(obj instanceof we9)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return md8.areEqual(toLanguageTag(), ((we9) obj).toLanguageTag());
    }

    @yfb
    public final String getLanguage() {
        return this.f94037a.getLanguage();
    }

    @yfb
    public final Locale getPlatformLocale() {
        return this.f94037a;
    }

    @yfb
    public final String getRegion() {
        return hxc.getRegion(this.f94037a);
    }

    @yfb
    public final String getScript() {
        return this.f94037a.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    @yfb
    public final String toLanguageTag() {
        return hxc.getLanguageTag(this.f94037a);
    }

    @yfb
    public String toString() {
        return toLanguageTag();
    }

    public we9(@yfb String str) {
        this(gxc.getPlatformLocaleDelegate().parseLanguageTag(str));
    }
}
