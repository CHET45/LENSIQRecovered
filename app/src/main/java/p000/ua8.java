package p000;

import java.util.List;
import p000.y3f;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class ua8 {
    private ua8() {
    }

    public static List<d42> getClientInterceptors() {
        return l77.m15954a();
    }

    public static List<j3f> getServerInterceptors() {
        return l77.m15955b();
    }

    public static List<y3f.AbstractC15412a> getServerStreamTracerFactories() {
        return l77.m15956c();
    }

    public static void setInterceptorsTracers(List<d42> list, List<j3f> list2, List<y3f.AbstractC15412a> list3) {
        l77.m15957d(list, list2, list3);
    }
}
