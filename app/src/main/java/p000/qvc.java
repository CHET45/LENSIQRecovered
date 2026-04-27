package p000;

import p000.C9278mc;

/* JADX INFO: loaded from: classes.dex */
public final class qvc {

    /* JADX INFO: renamed from: a */
    @yfb
    public C9278mc.j.f f75925a = C9278mc.j.b.f60525a;

    /* JADX INFO: renamed from: qvc$a */
    public static final class C11715a {

        /* JADX INFO: renamed from: a */
        @yfb
        public C9278mc.j.f f75926a = C9278mc.j.b.f60525a;

        @yfb
        public final qvc build() {
            qvc qvcVar = new qvc();
            qvcVar.setMediaType$activity_release(this.f75926a);
            return qvcVar;
        }

        @yfb
        public final C11715a setMediaType(@yfb C9278mc.j.f fVar) {
            md8.checkNotNullParameter(fVar, "mediaType");
            this.f75926a = fVar;
            return this;
        }
    }

    @yfb
    public final C9278mc.j.f getMediaType() {
        return this.f75925a;
    }

    public final void setMediaType$activity_release(@yfb C9278mc.j.f fVar) {
        md8.checkNotNullParameter(fVar, "<set-?>");
        this.f75925a = fVar;
    }
}
