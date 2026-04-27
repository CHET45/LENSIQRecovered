package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f88 {

    /* JADX INFO: renamed from: a */
    @igg({"ActionValue"})
    public static final String f35678a = "android.intent.action.CREATE_REMINDER";

    /* JADX INFO: renamed from: b */
    public static final String f35679b = "android.intent.extra.HTML_TEXT";

    /* JADX INFO: renamed from: c */
    public static final String f35680c = "android.intent.extra.START_PLAYBACK";

    /* JADX INFO: renamed from: d */
    @igg({"ActionValue"})
    public static final String f35681d = "android.intent.extra.TIME";

    /* JADX INFO: renamed from: e */
    public static final String f35682e = "android.intent.category.LEANBACK_LAUNCHER";

    /* JADX INFO: renamed from: f88$a */
    @c5e(33)
    public static class C5677a {
        private C5677a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static <T> T[] m10714a(@efb Intent intent, @hib String str, @efb Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static <T> ArrayList<T> m10715b(@efb Intent intent, @hib String str, @efb Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static <T> T m10716c(@efb Intent intent, @hib String str, @efb Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static <T extends Serializable> T m10717d(@efb Intent intent, @hib String str, @efb Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }

    private f88() {
    }

    @efb
    public static Intent createManageUnusedAppRestrictionsIntent(@efb Context context, @efb String str) {
        if (!oac.areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts(C12269rt.f79418l, str, null));
        }
        Intent data = new Intent(oac.f66999b).setData(Uri.fromParts(C12269rt.f79418l, str, null));
        return i >= 30 ? data : data.setPackage((String) z7d.checkNotNull(oac.getPermissionRevocationVerifierApp(context.getPackageManager())));
    }

    @hib
    @igg({"ArrayReturn", "NullableCollection"})
    public static Parcelable[] getParcelableArrayExtra(@efb Intent intent, @hib String str, @efb Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) C5677a.m10714a(intent, str, cls) : intent.getParcelableArrayExtra(str);
    }

    @hib
    @igg({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> getParcelableArrayListExtra(@efb Intent intent, @hib String str, @efb Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C5677a.m10715b(intent, str, cls) : intent.getParcelableArrayListExtra(str);
    }

    @hib
    public static <T> T getParcelableExtra(@efb Intent intent, @hib String str, @efb Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C5677a.m10716c(intent, str, cls);
        }
        T t = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @hib
    public static <T extends Serializable> T getSerializableExtra(@efb Intent intent, @hib String str, @efb Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C5677a.m10717d(intent, str, cls);
        }
        T t = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @efb
    public static Intent makeMainSelectorActivity(@efb String str, @efb String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }
}
