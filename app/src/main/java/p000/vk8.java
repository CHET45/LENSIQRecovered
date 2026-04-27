package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vk8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final lx4 f91521a;

    /* JADX INFO: renamed from: b */
    public boolean f91522b;

    /* JADX INFO: renamed from: vk8$a */
    public /* synthetic */ class C14143a extends n07 implements gz6<f0f, Integer, Boolean> {
        public C14143a(Object obj) {
            super(2, obj, vk8.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean invoke(f0f f0fVar, int i) {
            md8.checkNotNullParameter(f0fVar, "p0");
            return Boolean.valueOf(((vk8) this.receiver).readIfAbsent(f0fVar, i));
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Boolean invoke(f0f f0fVar, Integer num) {
            return invoke(f0fVar, num.intValue());
        }
    }

    public vk8(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        this.f91521a = new lx4(f0fVar, new C14143a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean readIfAbsent(f0f f0fVar, int i) {
        boolean z = !f0fVar.isElementOptional(i) && f0fVar.getElementDescriptor(i).isNullable();
        this.f91522b = z;
        return z;
    }

    public final boolean isUnmarkedNull$kotlinx_serialization_json() {
        return this.f91522b;
    }

    public final void mark$kotlinx_serialization_json(int i) {
        this.f91521a.mark(i);
    }

    public final int nextUnmarkedIndex$kotlinx_serialization_json() {
        return this.f91521a.nextUnmarkedIndex();
    }
}
