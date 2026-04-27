package p000;

import android.content.SharedPreferences;
import com.blankj.utilcode.util.C2479l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@igg({"ApplySharedPref"})
public final class wfe {

    /* JADX INFO: renamed from: b */
    public static final Map<String, wfe> f94118b = new HashMap();

    /* JADX INFO: renamed from: a */
    public SharedPreferences f94119a;

    private wfe(String str) {
        this.f94119a = C2479l.getApp().getSharedPreferences(str, 0);
    }

    public static wfe getInstance() {
        return getInstance("", 0);
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        clear(false);
    }

    public boolean contains(@efb String str) {
        if (str != null) {
            return this.f94119a.contains(str);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public Map<String, ?> getAll() {
        return this.f94119a.getAll();
    }

    public boolean getBoolean(@efb String str) {
        if (str != null) {
            return getBoolean(str, false);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public float getFloat(@efb String str) {
        if (str != null) {
            return getFloat(str, -1.0f);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public int getInt(@efb String str) {
        if (str != null) {
            return getInt(str, -1);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public long getLong(@efb String str) {
        if (str != null) {
            return getLong(str, -1L);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public String getString(@efb String str) {
        if (str != null) {
            return getString(str, "");
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public Set<String> getStringSet(@efb String str) {
        if (str != null) {
            return getStringSet(str, Collections.emptySet());
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        put(str, str2, false);
    }

    public void remove(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        remove(str, false);
    }

    public static wfe getInstance(int i) {
        return getInstance("", i);
    }

    public void clear(boolean z) {
        if (z) {
            this.f94119a.edit().clear().commit();
        } else {
            this.f94119a.edit().clear().apply();
        }
    }

    private wfe(String str, int i) {
        this.f94119a = C2479l.getApp().getSharedPreferences(str, i);
    }

    public static wfe getInstance(String str) {
        return getInstance(str, 0);
    }

    public boolean getBoolean(@efb String str, boolean z) {
        if (str != null) {
            return this.f94119a.getBoolean(str, z);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public float getFloat(@efb String str, float f) {
        if (str != null) {
            return this.f94119a.getFloat(str, f);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public int getInt(@efb String str, int i) {
        if (str != null) {
            return this.f94119a.getInt(str, i);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public long getLong(@efb String str, long j) {
        if (str != null) {
            return this.f94119a.getLong(str, j);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public String getString(@efb String str, String str2) {
        if (str != null) {
            return this.f94119a.getString(str, str2);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public Set<String> getStringSet(@efb String str, Set<String> set) {
        if (str != null) {
            return this.f94119a.getStringSet(str, set);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z) {
            this.f94119a.edit().putString(str, str2).commit();
        } else {
            this.f94119a.edit().putString(str, str2).apply();
        }
    }

    public void remove(@efb String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z) {
            this.f94119a.edit().remove(str).commit();
        } else {
            this.f94119a.edit().remove(str).apply();
        }
    }

    public static wfe getInstance(String str, int i) {
        if (isSpace(str)) {
            str = "spUtils";
        }
        Map<String, wfe> map = f94118b;
        wfe wfeVar = map.get(str);
        if (wfeVar == null) {
            synchronized (wfe.class) {
                try {
                    wfeVar = map.get(str);
                    if (wfeVar == null) {
                        wfeVar = new wfe(str, i);
                        map.put(str, wfeVar);
                    }
                } finally {
                }
            }
        }
        return wfeVar;
    }

    public void put(@efb String str, int i) {
        if (str != null) {
            put(str, i, false);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, int i, boolean z) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z) {
            this.f94119a.edit().putInt(str, i).commit();
        } else {
            this.f94119a.edit().putInt(str, i).apply();
        }
    }

    public void put(@efb String str, long j) {
        if (str != null) {
            put(str, j, false);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, long j, boolean z) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z) {
            this.f94119a.edit().putLong(str, j).commit();
        } else {
            this.f94119a.edit().putLong(str, j).apply();
        }
    }

    public void put(@efb String str, float f) {
        if (str != null) {
            put(str, f, false);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, float f, boolean z) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z) {
            this.f94119a.edit().putFloat(str, f).commit();
        } else {
            this.f94119a.edit().putFloat(str, f).apply();
        }
    }

    public void put(@efb String str, boolean z) {
        if (str != null) {
            put(str, z, false);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, boolean z, boolean z2) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z2) {
            this.f94119a.edit().putBoolean(str, z).commit();
        } else {
            this.f94119a.edit().putBoolean(str, z).apply();
        }
    }

    public void put(@efb String str, Set<String> set) {
        if (str != null) {
            put(str, set, false);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Set<String> set, boolean z) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (z) {
            this.f94119a.edit().putStringSet(str, set).commit();
        } else {
            this.f94119a.edit().putStringSet(str, set).apply();
        }
    }
}
