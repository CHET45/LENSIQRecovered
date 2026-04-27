package p000;

import p000.C9278mc;
import p000.qvc;

/* JADX INFO: loaded from: classes.dex */
public final class rvc {
    @yfb
    public static final qvc PickVisualMediaRequest(@yfb C9278mc.j.f fVar) {
        md8.checkNotNullParameter(fVar, "mediaType");
        return new qvc.C11715a().setMediaType(fVar).build();
    }

    public static /* synthetic */ qvc PickVisualMediaRequest$default(C9278mc.j.f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C9278mc.j.b.f60525a;
        }
        return PickVisualMediaRequest(fVar);
    }
}
