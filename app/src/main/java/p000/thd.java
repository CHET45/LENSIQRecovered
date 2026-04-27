package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class thd implements fq7 {

    /* JADX INFO: renamed from: b */
    public static final Pattern f84740b = Pattern.compile(C2473f.f17566z);

    /* JADX INFO: renamed from: c */
    public static final Pattern f84741c = Pattern.compile(",");

    /* JADX INFO: renamed from: a */
    public final String f84742a;

    public thd(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f84742a = str;
    }

    @Override // p000.fq7
    public boolean acceptProvidedProtocol(String str) {
        for (String str2 : f84741c.split(f84740b.matcher(str).replaceAll(""))) {
            if (this.f84742a.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.fq7
    public fq7 copyInstance() {
        return new thd(getProvidedProtocol());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f84742a.equals(((thd) obj).f84742a);
    }

    @Override // p000.fq7
    public String getProvidedProtocol() {
        return this.f84742a;
    }

    public int hashCode() {
        return this.f84742a.hashCode();
    }

    @Override // p000.fq7
    public String toString() {
        return getProvidedProtocol();
    }
}
