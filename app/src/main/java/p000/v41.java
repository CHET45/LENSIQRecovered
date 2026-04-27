package p000;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class v41 extends c51 {

    /* JADX INFO: renamed from: a */
    public final UUID f89891a;

    /* JADX INFO: renamed from: b */
    public final boolean f89892b;

    public v41(UUID uuid, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Characteristic ");
        sb.append(uuid);
        sb.append(" notification already set to ");
        sb.append(z ? "indication" : "notification");
        super(sb.toString());
        this.f89891a = uuid;
        this.f89892b = z;
    }

    public UUID getCharacteristicUuid() {
        return this.f89891a;
    }

    public boolean indicationAlreadySet() {
        return this.f89892b;
    }

    public boolean notificationAlreadySet() {
        return !this.f89892b;
    }
}
