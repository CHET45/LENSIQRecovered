package p000;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@rh5
@dwf({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2:231\n36#2,3:232\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231\n190#1:232,3\n*E\n"})
public final class qfc implements ParameterizedType, plh {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Class<?> f74308a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Type f74309b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Type[] f74310c;

    /* JADX INFO: renamed from: qfc$a */
    public /* synthetic */ class C11466a extends n07 implements qy6<Type, String> {

        /* JADX INFO: renamed from: a */
        public static final C11466a f74311a = new C11466a();

        public C11466a() {
            super(1, wnh.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // p000.qy6
        public final String invoke(Type type) {
            md8.checkNotNullParameter(type, "p0");
            return wnh.typeToString(type);
        }
    }

    public qfc(@yfb Class<?> cls, @gib Type type, @yfb List<? extends Type> list) {
        md8.checkNotNullParameter(cls, "rawType");
        md8.checkNotNullParameter(list, "typeArguments");
        this.f74308a = cls;
        this.f74309b = type;
        this.f74310c = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (md8.areEqual(this.f74308a, parameterizedType.getRawType()) && md8.areEqual(this.f74309b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @yfb
    public Type[] getActualTypeArguments() {
        return this.f74310c;
    }

    @Override // java.lang.reflect.ParameterizedType
    @gib
    public Type getOwnerType() {
        return this.f74309b;
    }

    @Override // java.lang.reflect.ParameterizedType
    @yfb
    public Type getRawType() {
        return this.f74308a;
    }

    @Override // java.lang.reflect.Type, p000.plh
    @yfb
    public String getTypeName() throws IOException {
        StringBuilder sb = new StringBuilder();
        Type type = this.f74309b;
        if (type != null) {
            sb.append(wnh.typeToString(type));
            sb.append("$");
            sb.append(this.f74308a.getSimpleName());
        } else {
            sb.append(wnh.typeToString(this.f74308a));
        }
        Type[] typeArr = this.f74310c;
        if (!(typeArr.length == 0)) {
            e80.joinTo(typeArr, sb, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : C11466a.f74311a);
        }
        return sb.toString();
    }

    public int hashCode() {
        int iHashCode = this.f74308a.hashCode();
        Type type = this.f74309b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @yfb
    public String toString() {
        return getTypeName();
    }
}
