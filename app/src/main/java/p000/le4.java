package p000;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public interface le4 {

    /* JADX INFO: renamed from: le4$a */
    public interface InterfaceC8783a {

        /* JADX INFO: renamed from: a */
        public static final int f57349a = 262144000;

        /* JADX INFO: renamed from: b */
        public static final String f57350b = "image_manager_disk_cache";

        @hib
        le4 build();
    }

    /* JADX INFO: renamed from: le4$b */
    public interface InterfaceC8784b {
        boolean write(@efb File file);
    }

    void clear();

    void delete(eq8 eq8Var);

    @hib
    File get(eq8 eq8Var);

    void put(eq8 eq8Var, InterfaceC8784b interfaceC8784b);
}
