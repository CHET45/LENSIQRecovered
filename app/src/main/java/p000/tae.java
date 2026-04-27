package p000;

import android.content.Context;
import p000.p7e;
import p000.uae;

/* JADX INFO: loaded from: classes3.dex */
public final class tae {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final tae f84089a = new tae();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f84090b = "ROOM";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f84091c = "room_master_table";

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f84092d = "_CursorConverter";

    private tae() {
    }

    @do8
    @yfb
    public static final <T extends uae> uae.C13432a<T> databaseBuilder(@yfb Context context, @yfb Class<T> cls, @gib String str) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(cls, "klass");
        if (str == null || m9g.isBlank(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new uae.C13432a<>(context, cls, str);
    }

    @do8
    @p7e({p7e.EnumC10826a.f69935b})
    public static final <T, C> T getGeneratedImplementation(@yfb Class<C> cls, @yfb String str) {
        String str2;
        md8.checkNotNullParameter(cls, "klass");
        md8.checkNotNullParameter(str, "suffix");
        Package r1 = cls.getPackage();
        md8.checkNotNull(r1);
        String name = r1.getName();
        String canonicalName = cls.getCanonicalName();
        md8.checkNotNull(canonicalName);
        md8.checkNotNullExpressionValue(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            md8.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = h9g.replace$default(canonicalName, a18.f100c, '_', false, 4, (Object) null) + str;
        try {
            if (name.length() == 0) {
                str2 = str3;
            } else {
                str2 = name + a18.f100c + str3;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            md8.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    @do8
    @yfb
    public static final <T extends uae> uae.C13432a<T> inMemoryDatabaseBuilder(@yfb Context context, @yfb Class<T> cls) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(cls, "klass");
        return new uae.C13432a<>(context, cls, null);
    }
}
