package p000;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@rh5
public final class jli implements WildcardType, plh {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C7972a f51126c = new C7972a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final jli f51127d = new jli(null, null);

    /* JADX INFO: renamed from: a */
    @gib
    public final Type f51128a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Type f51129b;

    /* JADX INFO: renamed from: jli$a */
    public static final class C7972a {
        public /* synthetic */ C7972a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final jli getSTAR() {
            return jli.f51127d;
        }

        private C7972a() {
        }
    }

    public jli(@gib Type type, @gib Type type2) {
        this.f51128a = type;
        this.f51129b = type2;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @yfb
    public Type[] getLowerBounds() {
        Type type = this.f51129b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, p000.plh
    @yfb
    public String getTypeName() {
        if (this.f51129b != null) {
            return "? super " + wnh.typeToString(this.f51129b);
        }
        Type type = this.f51128a;
        if (type == null || md8.areEqual(type, Object.class)) {
            return "?";
        }
        return "? extends " + wnh.typeToString(this.f51128a);
    }

    @Override // java.lang.reflect.WildcardType
    @yfb
    public Type[] getUpperBounds() {
        Type type = this.f51128a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @yfb
    public String toString() {
        return getTypeName();
    }
}
