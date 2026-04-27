package p000;

import com.google.android.gms.actions.SearchIntents;

/* JADX INFO: loaded from: classes3.dex */
public final class cjf implements zfg {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C2335a f16750c = new C2335a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f16751a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Object[] f16752b;

    /* JADX INFO: renamed from: cjf$a */
    public static final class C2335a {
        public /* synthetic */ C2335a(jt3 jt3Var) {
            this();
        }

        @do8
        @igg({"SyntheticAccessor"})
        public final void bind(@yfb yfg yfgVar, @gib Object[] objArr) {
            md8.checkNotNullParameter(yfgVar, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                bind(yfgVar, i, obj);
            }
        }

        private C2335a() {
        }

        private final void bind(yfg yfgVar, int i, Object obj) {
            if (obj == null) {
                yfgVar.bindNull(i);
                return;
            }
            if (obj instanceof byte[]) {
                yfgVar.bindBlob(i, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                yfgVar.bindDouble(i, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                yfgVar.bindDouble(i, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                yfgVar.bindLong(i, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                yfgVar.bindLong(i, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                yfgVar.bindLong(i, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                yfgVar.bindLong(i, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                yfgVar.bindString(i, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                yfgVar.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }
    }

    public cjf(@yfb String str, @gib Object[] objArr) {
        md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        this.f16751a = str;
        this.f16752b = objArr;
    }

    @do8
    @igg({"SyntheticAccessor"})
    public static final void bind(@yfb yfg yfgVar, @gib Object[] objArr) {
        f16750c.bind(yfgVar, objArr);
    }

    @Override // p000.zfg
    public void bindTo(@yfb yfg yfgVar) {
        md8.checkNotNullParameter(yfgVar, "statement");
        f16750c.bind(yfgVar, this.f16752b);
    }

    @Override // p000.zfg
    public int getArgCount() {
        Object[] objArr = this.f16752b;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // p000.zfg
    @yfb
    public String getSql() {
        return this.f16751a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cjf(@yfb String str) {
        this(str, null);
        md8.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
    }
}
