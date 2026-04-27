package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class ki7 {

    /* JADX INFO: renamed from: a */
    public final String[] f54212a;

    /* JADX INFO: renamed from: ki7$b */
    public static final class C8380b {

        /* JADX INFO: renamed from: a */
        public final List<String> f54213a = new ArrayList(20);

        private void checkNameAndValue(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i2), str2));
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public C8380b m14756b(String str, String str2) {
            this.f54213a.add(str);
            this.f54213a.add(str2.trim());
            return this;
        }

        public ki7 build() {
            return new ki7(this);
        }

        public C8380b removeAll(String str) {
            int i = 0;
            while (i < this.f54213a.size()) {
                if (str.equalsIgnoreCase(this.f54213a.get(i))) {
                    this.f54213a.remove(i);
                    this.f54213a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public C8380b set(String str, String str2) {
            checkNameAndValue(str, str2);
            removeAll(str);
            m14756b(str, str2);
            return this;
        }
    }

    public String get(String str) {
        return get(this.f54212a, str);
    }

    public String name(int i) {
        int i2 = i * 2;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f54212a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public C8380b newBuilder() {
        C8380b c8380b = new C8380b();
        Collections.addAll(c8380b.f54213a, this.f54212a);
        return c8380b;
    }

    public int size() {
        return this.f54212a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(name(i));
            sb.append(": ");
            sb.append(value(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public String value(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f54212a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    private ki7(C8380b c8380b) {
        this.f54212a = (String[]) c8380b.f54213a.toArray(new String[c8380b.f54213a.size()]);
    }

    private static String get(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }
}
