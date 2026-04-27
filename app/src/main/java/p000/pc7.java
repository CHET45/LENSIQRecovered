package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes6.dex */
public class pc7 implements ParameterizedType {

    /* JADX INFO: renamed from: a */
    public final Class<?> f70314a;

    /* JADX INFO: renamed from: b */
    public final Type[] f70315b;

    /* JADX INFO: renamed from: c */
    public final Type f70316c;

    public pc7(Class<?> cls, Type[] typeArr, Type type) {
        this.f70314a = cls;
        this.f70315b = typeArr == null ? new Type[0] : typeArr;
        this.f70316c = type;
    }

    @Override // java.lang.reflect.ParameterizedType
    @efb
    public Type[] getActualTypeArguments() {
        return this.f70315b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f70316c;
    }

    @Override // java.lang.reflect.ParameterizedType
    @efb
    public Type getRawType() {
        return this.f70314a;
    }
}
