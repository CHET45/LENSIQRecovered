package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class tpg {

    /* JADX INFO: renamed from: a */
    public final String f85559a;

    /* JADX INFO: renamed from: b */
    public final rog f85560b;

    /* JADX INFO: renamed from: c */
    public final List<Object> f85561c;

    public tpg(String str, rog rogVar, List<Object> list) {
        notNull(str, "The name is missing.");
        notNull(rogVar, "The test class is missing.");
        notNull(list, "The parameters are missing.");
        this.f85559a = str;
        this.f85560b = rogVar;
        this.f85561c = Collections.unmodifiableList(new ArrayList(list));
    }

    private static void notNull(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tpg tpgVar = (tpg) obj;
        return this.f85559a.equals(tpgVar.f85559a) && this.f85561c.equals(tpgVar.f85561c) && this.f85560b.equals(tpgVar.f85560b);
    }

    public String getName() {
        return this.f85559a;
    }

    public List<Object> getParameters() {
        return this.f85561c;
    }

    public rog getTestClass() {
        return this.f85560b;
    }

    public int hashCode() {
        return ((((this.f85559a.hashCode() + 14747) * 14747) + this.f85560b.hashCode()) * 14747) + this.f85561c.hashCode();
    }

    public String toString() {
        return this.f85560b.getName() + " '" + this.f85559a + "' with parameters " + this.f85561c;
    }
}
