package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.o0c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class o0c<T extends o0c> {

    /* JADX INFO: renamed from: a */
    public String f66174a;

    /* JADX INFO: renamed from: b */
    public Object f66175b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f66176c;

    /* JADX INFO: renamed from: d */
    public Map<String, String> f66177d;

    /* JADX INFO: renamed from: e */
    public int f66178e;

    public T addHeader(String str, String str2) {
        if (this.f66176c == null) {
            this.f66176c = new LinkedHashMap();
        }
        this.f66176c.put(str, str2);
        return this;
    }

    public abstract u3e build();

    public T headers(Map<String, String> map) {
        this.f66176c = map;
        return this;
    }

    /* JADX INFO: renamed from: id */
    public T m18244id(int i) {
        this.f66178e = i;
        return this;
    }

    public T tag(Object obj) {
        this.f66175b = obj;
        return this;
    }

    public T url(String str) {
        this.f66174a = str;
        return this;
    }
}
