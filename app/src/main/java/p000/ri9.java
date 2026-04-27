package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.c15;

/* JADX INFO: loaded from: classes4.dex */
public final class ri9 {

    /* JADX INFO: renamed from: c */
    public static final ri9 f78388c = new C12106a().build();

    /* JADX INFO: renamed from: a */
    public final String f78389a;

    /* JADX INFO: renamed from: b */
    public final List<ei9> f78390b;

    /* JADX INFO: renamed from: ri9$a */
    public static final class C12106a {

        /* JADX INFO: renamed from: a */
        public String f78391a = "";

        /* JADX INFO: renamed from: b */
        public List<ei9> f78392b = new ArrayList();

        public C12106a addLogEventDropped(ei9 ei9Var) {
            this.f78392b.add(ei9Var);
            return this;
        }

        public ri9 build() {
            return new ri9(this.f78391a, Collections.unmodifiableList(this.f78392b));
        }

        public C12106a setLogEventDroppedList(List<ei9> list) {
            this.f78392b = list;
            return this;
        }

        public C12106a setLogSource(String str) {
            this.f78391a = str;
            return this;
        }
    }

    public ri9(String str, List<ei9> list) {
        this.f78389a = str;
        this.f78390b = list;
    }

    public static ri9 getDefaultInstance() {
        return f78388c;
    }

    public static C12106a newBuilder() {
        return new C12106a();
    }

    @jhd(tag = 2)
    @c15.InterfaceC2147a(name = "logEventDropped")
    public List<ei9> getLogEventDroppedList() {
        return this.f78390b;
    }

    @jhd(tag = 1)
    public String getLogSource() {
        return this.f78389a;
    }
}
