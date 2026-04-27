package p000;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
public final class m57 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<t4h> f59931a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<w15> f59932b;

    @yg5.InterfaceC15649b
    public m57(@yfb List<t4h> list, @yfb List<w15> list2) {
        md8.checkNotNullParameter(list, "topics");
        md8.checkNotNullParameter(list2, "encryptedTopics");
        this.f59931a = list;
        this.f59932b = list2;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m57)) {
            return false;
        }
        m57 m57Var = (m57) obj;
        if (this.f59931a.size() == m57Var.f59931a.size() && this.f59932b.size() == m57Var.f59932b.size()) {
            return md8.areEqual(new HashSet(this.f59931a), new HashSet(m57Var.f59931a)) && md8.areEqual(new HashSet(this.f59932b), new HashSet(m57Var.f59932b));
        }
        return false;
    }

    @yfb
    public final List<w15> getEncryptedTopics() {
        return this.f59932b;
    }

    @yfb
    public final List<t4h> getTopics() {
        return this.f59931a;
    }

    public int hashCode() {
        return Objects.hash(this.f59931a, this.f59932b);
    }

    @yfb
    public String toString() {
        return "GetTopicsResponse: Topics=" + this.f59931a + ", EncryptedTopics=" + this.f59932b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m57(@yfb List<t4h> list) {
        this(list, l82.emptyList());
        md8.checkNotNullParameter(list, "topics");
    }
}
