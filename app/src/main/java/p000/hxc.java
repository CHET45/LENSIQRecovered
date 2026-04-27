package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class hxc {
    @yfb
    public static final String getLanguage(@yfb Locale locale) {
        return locale.getLanguage();
    }

    @yfb
    public static final String getLanguageTag(@yfb Locale locale) {
        return locale.toLanguageTag();
    }

    @yfb
    public static final String getRegion(@yfb Locale locale) {
        return locale.getCountry();
    }

    @yfb
    public static final String getScript(@yfb Locale locale) {
        return locale.getScript();
    }
}
