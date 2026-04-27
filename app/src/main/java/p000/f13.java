package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
public final class f13 {
    /* JADX WARN: Multi-variable type inference failed */
    @gib
    @rh5
    @jjf(version = "1.3")
    public static final <E extends e13.InterfaceC5040b> E getPolymorphicElement(@yfb e13.InterfaceC5040b interfaceC5040b, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        E e;
        md8.checkNotNullParameter(interfaceC5040b, "<this>");
        md8.checkNotNullParameter(interfaceC5041c, "key");
        if (!(interfaceC5041c instanceof AbstractC13806v0)) {
            if (interfaceC5040b.getKey() == interfaceC5041c) {
                return interfaceC5040b;
            }
            return null;
        }
        AbstractC13806v0 abstractC13806v0 = (AbstractC13806v0) interfaceC5041c;
        if (!abstractC13806v0.isSubKey$kotlin_stdlib(interfaceC5040b.getKey()) || (e = (E) abstractC13806v0.tryCast$kotlin_stdlib(interfaceC5040b)) == null) {
            return null;
        }
        return e;
    }

    @rh5
    @jjf(version = "1.3")
    @yfb
    public static final e13 minusPolymorphicKey(@yfb e13.InterfaceC5040b interfaceC5040b, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        md8.checkNotNullParameter(interfaceC5040b, "<this>");
        md8.checkNotNullParameter(interfaceC5041c, "key");
        if (!(interfaceC5041c instanceof AbstractC13806v0)) {
            return interfaceC5040b.getKey() == interfaceC5041c ? a05.f2a : interfaceC5040b;
        }
        AbstractC13806v0 abstractC13806v0 = (AbstractC13806v0) interfaceC5041c;
        return (!abstractC13806v0.isSubKey$kotlin_stdlib(interfaceC5040b.getKey()) || abstractC13806v0.tryCast$kotlin_stdlib(interfaceC5040b) == null) ? interfaceC5040b : a05.f2a;
    }
}
