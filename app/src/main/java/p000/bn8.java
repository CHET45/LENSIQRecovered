package p000;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bn8 implements ujb, h2i {

    /* JADX INFO: renamed from: a */
    public bn8 f14190a = null;

    /* JADX INFO: renamed from: b */
    public boolean f14191b = true;

    /* JADX INFO: renamed from: c */
    public final JsonWriter f14192c;

    /* JADX INFO: renamed from: d */
    public final Map<Class<?>, tjb<?>> f14193d;

    /* JADX INFO: renamed from: e */
    public final Map<Class<?>, g2i<?>> f14194e;

    /* JADX INFO: renamed from: f */
    public final tjb<Object> f14195f;

    /* JADX INFO: renamed from: g */
    public final boolean f14196g;

    public bn8(@efb Writer writer, @efb Map<Class<?>, tjb<?>> map, @efb Map<Class<?>, g2i<?>> map2, tjb<Object> tjbVar, boolean z) {
        this.f14192c = new JsonWriter(writer);
        this.f14193d = map;
        this.f14194e = map2;
        this.f14195f = tjbVar;
        this.f14196g = z;
    }

    private boolean cannotBeInline(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private bn8 internalAdd(@efb String str, @hib Object obj) throws t15, IOException {
        maybeUnNest();
        this.f14192c.name(str);
        if (obj != null) {
            return m3253a(obj, false);
        }
        this.f14192c.nullValue();
        return this;
    }

    private bn8 internalAddIgnoreNullValues(@efb String str, @hib Object obj) throws t15, IOException {
        if (obj == null) {
            return this;
        }
        maybeUnNest();
        this.f14192c.name(str);
        return m3253a(obj, false);
    }

    private void maybeUnNest() throws IOException {
        if (!this.f14191b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        bn8 bn8Var = this.f14190a;
        if (bn8Var != null) {
            bn8Var.maybeUnNest();
            this.f14190a.f14191b = false;
            this.f14190a = null;
            this.f14192c.endObject();
        }
    }

    @efb
    /* JADX INFO: renamed from: a */
    public bn8 m3253a(@hib Object obj, boolean z) throws IOException {
        if (z && cannotBeInline(obj)) {
            throw new t15(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f14192c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f14192c.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f14192c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m3253a(it.next(), false);
                }
                this.f14192c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f14192c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        add((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new t15(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.f14192c.endObject();
                return this;
            }
            tjb<?> tjbVar = this.f14193d.get(obj.getClass());
            if (tjbVar != null) {
                return m3255c(tjbVar, obj, z);
            }
            g2i<?> g2iVar = this.f14194e.get(obj.getClass());
            if (g2iVar != null) {
                g2iVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return m3255c(this.f14195f, obj, z);
            }
            if (obj instanceof cjb) {
                add(((cjb) obj).getNumber());
            } else {
                add(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return add((byte[]) obj);
        }
        this.f14192c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                this.f14192c.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                add(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.f14192c.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.f14192c.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m3253a(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m3253a(obj2, false);
            }
        }
        this.f14192c.endArray();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m3254b() throws IOException {
        maybeUnNest();
        this.f14192c.flush();
    }

    /* JADX INFO: renamed from: c */
    public bn8 m3255c(tjb<Object> tjbVar, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f14192c.beginObject();
        }
        tjbVar.encode(obj, this);
        if (!z) {
            this.f14192c.endObject();
        }
        return this;
    }

    @Override // p000.ujb
    @efb
    public ujb inline(@hib Object obj) throws IOException {
        return m3253a(obj, true);
    }

    @Override // p000.ujb
    @efb
    public ujb nested(@efb String str) throws IOException {
        maybeUnNest();
        this.f14190a = new bn8(this);
        this.f14192c.name(str);
        this.f14192c.beginObject();
        return this.f14190a;
    }

    @Override // p000.ujb
    @efb
    public ujb nested(@efb ar5 ar5Var) throws IOException {
        return nested(ar5Var.getName());
    }

    private bn8(bn8 bn8Var) {
        this.f14192c = bn8Var.f14192c;
        this.f14193d = bn8Var.f14193d;
        this.f14194e = bn8Var.f14194e;
        this.f14195f = bn8Var.f14195f;
        this.f14196g = bn8Var.f14196g;
    }

    @Override // p000.ujb
    @efb
    public bn8 add(@efb String str, @hib Object obj) throws IOException {
        if (this.f14196g) {
            return internalAddIgnoreNullValues(str, obj);
        }
        return internalAdd(str, obj);
    }

    @Override // p000.ujb
    @efb
    public bn8 add(@efb String str, double d) throws IOException {
        maybeUnNest();
        this.f14192c.name(str);
        return add(d);
    }

    @Override // p000.ujb
    @efb
    public bn8 add(@efb String str, int i) throws IOException {
        maybeUnNest();
        this.f14192c.name(str);
        return add(i);
    }

    @Override // p000.ujb
    @efb
    public bn8 add(@efb String str, long j) throws IOException {
        maybeUnNest();
        this.f14192c.name(str);
        return add(j);
    }

    @Override // p000.ujb
    @efb
    public bn8 add(@efb String str, boolean z) throws IOException {
        maybeUnNest();
        this.f14192c.name(str);
        return add(z);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb ar5 ar5Var, @hib Object obj) throws IOException {
        return add(ar5Var.getName(), obj);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb ar5 ar5Var, float f) throws IOException {
        return add(ar5Var.getName(), f);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb ar5 ar5Var, double d) throws IOException {
        return add(ar5Var.getName(), d);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb ar5 ar5Var, int i) throws IOException {
        return add(ar5Var.getName(), i);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb ar5 ar5Var, long j) throws IOException {
        return add(ar5Var.getName(), j);
    }

    @Override // p000.ujb
    @efb
    public ujb add(@efb ar5 ar5Var, boolean z) throws IOException {
        return add(ar5Var.getName(), z);
    }

    @Override // p000.h2i
    @efb
    public bn8 add(@hib String str) throws IOException {
        maybeUnNest();
        this.f14192c.value(str);
        return this;
    }

    @Override // p000.h2i
    @efb
    public bn8 add(float f) throws IOException {
        maybeUnNest();
        this.f14192c.value(f);
        return this;
    }

    @Override // p000.h2i
    @efb
    public bn8 add(double d) throws IOException {
        maybeUnNest();
        this.f14192c.value(d);
        return this;
    }

    @Override // p000.h2i
    @efb
    public bn8 add(int i) throws IOException {
        maybeUnNest();
        this.f14192c.value(i);
        return this;
    }

    @Override // p000.h2i
    @efb
    public bn8 add(long j) throws IOException {
        maybeUnNest();
        this.f14192c.value(j);
        return this;
    }

    @Override // p000.h2i
    @efb
    public bn8 add(boolean z) throws IOException {
        maybeUnNest();
        this.f14192c.value(z);
        return this;
    }

    @Override // p000.h2i
    @efb
    public bn8 add(@hib byte[] bArr) throws IOException {
        maybeUnNest();
        if (bArr == null) {
            this.f14192c.nullValue();
        } else {
            this.f14192c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }
}
