package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ql1 implements il1 {

    /* JADX INFO: renamed from: g */
    public static final Map<String, ql1> f74784g = new HashMap();

    /* JADX INFO: renamed from: e */
    public final lm1 f74785e;

    /* JADX INFO: renamed from: f */
    public final ol1 f74786f;

    private ql1(lm1 lm1Var, ol1 ol1Var) {
        this.f74785e = lm1Var;
        this.f74786f = ol1Var;
    }

    public static ql1 getInstance() {
        return getInstance(lm1.getInstance(), ol1.getInstance());
    }

    public void clear() {
        this.f74785e.clear();
        this.f74786f.clear();
    }

    public Bitmap getBitmap(@efb String str) {
        if (str != null) {
            return getBitmap(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public byte[] getBytes(@efb String str) {
        if (str != null) {
            return getBytes(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public int getCacheDiskCount() {
        return this.f74786f.getCacheCount();
    }

    public long getCacheDiskSize() {
        return this.f74786f.getCacheSize();
    }

    public int getCacheMemoryCount() {
        return this.f74785e.getCacheCount();
    }

    public Drawable getDrawable(@efb String str) {
        if (str != null) {
            return getDrawable(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public JSONArray getJSONArray(@efb String str) {
        if (str != null) {
            return getJSONArray(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public JSONObject getJSONObject(@efb String str) {
        if (str != null) {
            return getJSONObject(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator != null) {
            return (T) getParcelable(str, creator, null);
        }
        throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public Object getSerializable(@efb String str) {
        if (str != null) {
            return getSerializable(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public String getString(@efb String str) {
        if (str != null) {
            return getString(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, byte[] bArr) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        put(str, bArr, -1);
    }

    public void remove(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        this.f74785e.remove(str);
        this.f74786f.remove(str);
    }

    public static ql1 getInstance(@efb lm1 lm1Var, @efb ol1 ol1Var) {
        if (lm1Var == null) {
            throw new NullPointerException("Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (ol1Var == null) {
            throw new NullPointerException("Argument 'cacheDiskUtils' of type CacheDiskUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        String str = ol1Var.toString() + p43.f69617m + lm1Var.toString();
        Map<String, ql1> map = f74784g;
        ql1 ql1Var = map.get(str);
        if (ql1Var == null) {
            synchronized (ql1.class) {
                try {
                    ql1Var = map.get(str);
                    if (ql1Var == null) {
                        ql1Var = new ql1(lm1Var, ol1Var);
                        map.put(str, ql1Var);
                    }
                } finally {
                }
            }
        }
        return ql1Var;
    }

    public Bitmap getBitmap(@efb String str, Bitmap bitmap) {
        if (str != null) {
            Bitmap bitmap2 = (Bitmap) this.f74785e.get(str);
            if (bitmap2 != null) {
                return bitmap2;
            }
            Bitmap bitmap3 = this.f74786f.getBitmap(str);
            if (bitmap3 == null) {
                return bitmap;
            }
            this.f74785e.put(str, bitmap3);
            return bitmap3;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public byte[] getBytes(@efb String str, byte[] bArr) {
        if (str != null) {
            byte[] bArr2 = (byte[]) this.f74785e.get(str);
            if (bArr2 != null) {
                return bArr2;
            }
            byte[] bytes = this.f74786f.getBytes(str);
            if (bytes == null) {
                return bArr;
            }
            this.f74785e.put(str, bytes);
            return bytes;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public Drawable getDrawable(@efb String str, Drawable drawable) {
        if (str != null) {
            Drawable drawable2 = (Drawable) this.f74785e.get(str);
            if (drawable2 != null) {
                return drawable2;
            }
            Drawable drawable3 = this.f74786f.getDrawable(str);
            if (drawable3 == null) {
                return drawable;
            }
            this.f74785e.put(str, drawable3);
            return drawable3;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public JSONArray getJSONArray(@efb String str, JSONArray jSONArray) {
        if (str != null) {
            JSONArray jSONArray2 = (JSONArray) this.f74785e.get(str);
            if (jSONArray2 != null) {
                return jSONArray2;
            }
            JSONArray jSONArray3 = this.f74786f.getJSONArray(str);
            if (jSONArray3 == null) {
                return jSONArray;
            }
            this.f74785e.put(str, jSONArray3);
            return jSONArray3;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public JSONObject getJSONObject(@efb String str, JSONObject jSONObject) {
        if (str != null) {
            JSONObject jSONObject2 = (JSONObject) this.f74785e.get(str);
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = this.f74786f.getJSONObject(str);
            if (jSONObject3 == null) {
                return jSONObject;
            }
            this.f74785e.put(str, jSONObject3);
            return jSONObject3;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public Object getSerializable(@efb String str, Object obj) {
        if (str != null) {
            Object obj2 = this.f74785e.get(str);
            if (obj2 != null) {
                return obj2;
            }
            Object serializable = this.f74786f.getSerializable(str);
            if (serializable == null) {
                return obj;
            }
            this.f74785e.put(str, serializable);
            return serializable;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public String getString(@efb String str, String str2) {
        if (str != null) {
            String str3 = (String) this.f74785e.get(str);
            if (str3 != null) {
                return str3;
            }
            String string = this.f74786f.getString(str);
            if (string == null) {
                return str2;
            }
            this.f74785e.put(str, string);
            return string;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, byte[] bArr, int i) {
        if (str != null) {
            this.f74785e.put(str, bArr, i);
            this.f74786f.put(str, bArr, i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator, T t) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator != null) {
            T t2 = (T) this.f74785e.get(str);
            if (t2 != null) {
                return t2;
            }
            T t3 = (T) this.f74786f.getParcelable(str, creator);
            if (t3 == null) {
                return t;
            }
            this.f74785e.put(str, t3);
            return t3;
        }
        throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, String str2) {
        if (str != null) {
            put(str, str2, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, String str2, int i) {
        if (str != null) {
            this.f74785e.put(str, str2, i);
            this.f74786f.put(str, str2, i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, JSONObject jSONObject) {
        if (str != null) {
            put(str, jSONObject, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, JSONObject jSONObject, int i) {
        if (str != null) {
            this.f74785e.put(str, jSONObject, i);
            this.f74786f.put(str, jSONObject, i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, JSONArray jSONArray) {
        if (str != null) {
            put(str, jSONArray, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, JSONArray jSONArray, int i) {
        if (str != null) {
            this.f74785e.put(str, jSONArray, i);
            this.f74786f.put(str, jSONArray, i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Bitmap bitmap) {
        if (str != null) {
            put(str, bitmap, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Bitmap bitmap, int i) {
        if (str != null) {
            this.f74785e.put(str, bitmap, i);
            this.f74786f.put(str, bitmap, i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Drawable drawable) {
        if (str != null) {
            put(str, drawable, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Drawable drawable, int i) {
        if (str != null) {
            this.f74785e.put(str, drawable, i);
            this.f74786f.put(str, drawable, i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Parcelable parcelable) {
        if (str != null) {
            put(str, parcelable, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Parcelable parcelable, int i) {
        if (str != null) {
            this.f74785e.put(str, parcelable, i);
            this.f74786f.put(str, parcelable, i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Serializable serializable) {
        if (str != null) {
            put(str, serializable, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Serializable serializable, int i) {
        if (str != null) {
            this.f74785e.put(str, serializable, i);
            this.f74786f.put(str, serializable, i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
