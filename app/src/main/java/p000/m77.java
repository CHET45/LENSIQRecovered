package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class m77 {

    /* JADX INFO: renamed from: b */
    public static volatile m77 f60140b;

    /* JADX INFO: renamed from: a */
    public final Set<q49> f60141a = new HashSet();

    public static m77 getInstance() {
        m77 m77Var = f60140b;
        if (m77Var == null) {
            synchronized (m77.class) {
                try {
                    m77Var = f60140b;
                    if (m77Var == null) {
                        m77Var = new m77();
                        f60140b = m77Var;
                    }
                } finally {
                }
            }
        }
        return m77Var;
    }

    /* JADX INFO: renamed from: a */
    public Set<q49> m17101a() {
        Set<q49> setUnmodifiableSet;
        synchronized (this.f60141a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f60141a);
        }
        return setUnmodifiableSet;
    }

    public void registerVersion(String str, String str2) {
        synchronized (this.f60141a) {
            this.f60141a.add(q49.m20066a(str, str2));
        }
    }
}
