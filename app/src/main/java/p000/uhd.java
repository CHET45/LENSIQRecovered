package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public enum uhd {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* JADX INFO: renamed from: a */
    public final String f88021a;

    uhd(String str) {
        this.f88021a = str;
    }

    public static uhd get(String str) throws IOException {
        uhd uhdVar = HTTP_1_0;
        if (str.equals(uhdVar.f88021a)) {
            return uhdVar;
        }
        uhd uhdVar2 = HTTP_1_1;
        if (str.equals(uhdVar2.f88021a)) {
            return uhdVar2;
        }
        uhd uhdVar3 = HTTP_2;
        if (str.equals(uhdVar3.f88021a)) {
            return uhdVar3;
        }
        uhd uhdVar4 = SPDY_3;
        if (str.equals(uhdVar4.f88021a)) {
            return uhdVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f88021a;
    }
}
