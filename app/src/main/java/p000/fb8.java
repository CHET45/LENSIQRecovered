package p000;

import java.nio.charset.Charset;
import p000.fta;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class fb8 {

    /* JADX INFO: renamed from: a */
    @x98
    public static final Charset f36008a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    @x98
    public static final br0 f36009b = fta.f37691g;

    /* JADX INFO: renamed from: fb8$a */
    @x98
    public interface InterfaceC5712a<T> extends fta.InterfaceC5975m<T> {
    }

    @x98
    public static int headerCount(fta ftaVar) {
        return ftaVar.m11165g();
    }

    @x98
    public static <T> fta.AbstractC5971i<T> keyOf(String str, InterfaceC5712a<T> interfaceC5712a) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return fta.AbstractC5971i.m11173d(str, z, interfaceC5712a);
    }

    @x98
    public static fta newMetadata(byte[]... bArr) {
        return new fta(bArr);
    }

    @x98
    public static fta newMetadataWithParsedValues(int i, Object[] objArr) {
        return new fta(i, objArr);
    }

    @x98
    public static <T> Object parsedValue(fta.InterfaceC5970h<T> interfaceC5970h, T t) {
        return new fta.C5973k(interfaceC5970h, t);
    }

    @x98
    public static byte[][] serialize(fta ftaVar) {
        return ftaVar.m11166h();
    }

    @x98
    public static Object[] serializePartial(fta ftaVar) {
        return ftaVar.m11167i();
    }

    @x98
    public static fta newMetadata(int i, byte[]... bArr) {
        return new fta(i, bArr);
    }

    @x98
    public static <T> fta.AbstractC5971i<T> keyOf(String str, fta.InterfaceC5967e<T> interfaceC5967e) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return fta.AbstractC5971i.m11172c(str, z, interfaceC5967e);
    }
}
