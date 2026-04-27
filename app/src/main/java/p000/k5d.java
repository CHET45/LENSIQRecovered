package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class k5d extends o0c<k5d> implements ug7 {

    /* JADX INFO: renamed from: f */
    public List<C8203a> f52605f = new ArrayList();

    /* JADX INFO: renamed from: k5d$a */
    public static class C8203a {

        /* JADX INFO: renamed from: a */
        public String f52606a;

        /* JADX INFO: renamed from: b */
        public String f52607b;

        /* JADX INFO: renamed from: c */
        public File f52608c;

        public C8203a(String str, String str2, File file) {
            this.f52606a = str;
            this.f52607b = str2;
            this.f52608c = file;
        }

        public String toString() {
            return "FileInput{key='" + this.f52606a + "', filename='" + this.f52607b + "', file=" + this.f52608c + '}';
        }
    }

    public k5d addFile(String str, String str2, File file) {
        this.f52605f.add(new C8203a(str, str2, file));
        return this;
    }

    @Override // p000.o0c
    public u3e build() {
        return new l5d(this.f66174a, this.f66175b, this.f66177d, this.f66176c, this.f52605f, this.f66178e).build();
    }

    public k5d files(String str, Map<String, File> map) {
        for (String str2 : map.keySet()) {
            this.f52605f.add(new C8203a(str, str2, map.get(str2)));
        }
        return this;
    }

    @Override // p000.ug7
    public /* bridge */ /* synthetic */ o0c params(Map map) {
        return params((Map<String, String>) map);
    }

    @Override // p000.ug7
    public k5d addParams(String str, String str2) {
        if (this.f66177d == null) {
            this.f66177d = new LinkedHashMap();
        }
        this.f66177d.put(str, str2);
        return this;
    }

    @Override // p000.ug7
    public k5d params(Map<String, String> map) {
        this.f66177d = map;
        return this;
    }
}
