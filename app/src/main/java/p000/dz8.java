package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dz8 implements ii7 {

    /* JADX INFO: renamed from: c */
    public final Map<String, List<cz8>> f31361c;

    /* JADX INFO: renamed from: d */
    public volatile Map<String, String> f31362d;

    /* JADX INFO: renamed from: dz8$a */
    public static final class C5025a {

        /* JADX INFO: renamed from: d */
        public static final String f31363d = "User-Agent";

        /* JADX INFO: renamed from: e */
        public static final String f31364e;

        /* JADX INFO: renamed from: f */
        public static final Map<String, List<cz8>> f31365f;

        /* JADX INFO: renamed from: a */
        public boolean f31366a = true;

        /* JADX INFO: renamed from: b */
        public Map<String, List<cz8>> f31367b = f31365f;

        /* JADX INFO: renamed from: c */
        public boolean f31368c = true;

        static {
            String strM9599a = m9599a();
            f31364e = strM9599a;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM9599a)) {
                map.put("User-Agent", Collections.singletonList(new C5026b(strM9599a)));
            }
            f31365f = Collections.unmodifiableMap(map);
        }

        @fdi
        /* JADX INFO: renamed from: a */
        public static String m9599a() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        private Map<String, List<cz8>> copyHeaders() {
            HashMap map = new HashMap(this.f31367b.size());
            for (Map.Entry<String, List<cz8>> entry : this.f31367b.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        private void copyIfNecessary() {
            if (this.f31366a) {
                this.f31366a = false;
                this.f31367b = copyHeaders();
            }
        }

        private List<cz8> getFactories(String str) {
            List<cz8> list = this.f31367b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f31367b.put(str, arrayList);
            return arrayList;
        }

        public C5025a addHeader(@efb String str, @efb String str2) {
            return addHeader(str, new C5026b(str2));
        }

        public dz8 build() {
            this.f31366a = true;
            return new dz8(this.f31367b);
        }

        public C5025a setHeader(@efb String str, @hib String str2) {
            return setHeader(str, str2 == null ? null : new C5026b(str2));
        }

        public C5025a addHeader(@efb String str, @efb cz8 cz8Var) {
            if (this.f31368c && "User-Agent".equalsIgnoreCase(str)) {
                return setHeader(str, cz8Var);
            }
            copyIfNecessary();
            getFactories(str).add(cz8Var);
            return this;
        }

        public C5025a setHeader(@efb String str, @hib cz8 cz8Var) {
            copyIfNecessary();
            if (cz8Var == null) {
                this.f31367b.remove(str);
            } else {
                List<cz8> factories = getFactories(str);
                factories.clear();
                factories.add(cz8Var);
            }
            if (this.f31368c && "User-Agent".equalsIgnoreCase(str)) {
                this.f31368c = false;
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: dz8$b */
    public static final class C5026b implements cz8 {

        /* JADX INFO: renamed from: a */
        @efb
        public final String f31369a;

        public C5026b(@efb String str) {
            this.f31369a = str;
        }

        @Override // p000.cz8
        public String buildHeader() {
            return this.f31369a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5026b) {
                return this.f31369a.equals(((C5026b) obj).f31369a);
            }
            return false;
        }

        public int hashCode() {
            return this.f31369a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f31369a + "'}";
        }
    }

    public dz8(Map<String, List<cz8>> map) {
        this.f31361c = Collections.unmodifiableMap(map);
    }

    @efb
    private String buildHeaderValue(@efb List<cz8> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strBuildHeader = list.get(i).buildHeader();
            if (!TextUtils.isEmpty(strBuildHeader)) {
                sb.append(strBuildHeader);
                if (i != list.size() - 1) {
                    sb.append(C4584d2.f28238g);
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> generateHeaders() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<cz8>> entry : this.f31361c.entrySet()) {
            String strBuildHeaderValue = buildHeaderValue(entry.getValue());
            if (!TextUtils.isEmpty(strBuildHeaderValue)) {
                map.put(entry.getKey(), strBuildHeaderValue);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof dz8) {
            return this.f31361c.equals(((dz8) obj).f31361c);
        }
        return false;
    }

    @Override // p000.ii7
    public Map<String, String> getHeaders() {
        if (this.f31362d == null) {
            synchronized (this) {
                try {
                    if (this.f31362d == null) {
                        this.f31362d = Collections.unmodifiableMap(generateHeaders());
                    }
                } finally {
                }
            }
        }
        return this.f31362d;
    }

    public int hashCode() {
        return this.f31361c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f31361c + '}';
    }
}
