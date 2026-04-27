package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class rfc implements ParameterizedType {

    /* JADX INFO: renamed from: a */
    public final Type[] f78159a;

    /* JADX INFO: renamed from: b */
    public final Type f78160b;

    /* JADX INFO: renamed from: c */
    public final Type f78161c;

    public rfc(Type[] typeArr, Type type, Type type2) {
        this.f78159a = typeArr;
        this.f78160b = type;
        this.f78161c = type2;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f78159a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f78160b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f78161c;
    }
}
