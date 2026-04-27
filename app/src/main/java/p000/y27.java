package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes7.dex */
@rh5
public final class y27 implements GenericArrayType, plh {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Type f100137a;

    public y27(@yfb Type type) {
        md8.checkNotNullParameter(type, "elementType");
        this.f100137a = type;
    }

    public boolean equals(@gib Object obj) {
        return (obj instanceof GenericArrayType) && md8.areEqual(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @yfb
    public Type getGenericComponentType() {
        return this.f100137a;
    }

    @Override // java.lang.reflect.Type, p000.plh
    @yfb
    public String getTypeName() {
        return wnh.typeToString(this.f100137a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @yfb
    public String toString() {
        return getTypeName();
    }
}
