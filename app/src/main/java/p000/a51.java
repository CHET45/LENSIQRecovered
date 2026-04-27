package p000;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class a51 extends c51 {

    /* JADX INFO: renamed from: a */
    public final UUID f419a;

    public a51(UUID uuid) {
        super("Descriptor not found with UUID " + uuid);
        this.f419a = uuid;
    }

    public UUID getDescriptorUUID() {
        return this.f419a;
    }
}
