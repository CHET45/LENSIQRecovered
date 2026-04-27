package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import okhttp3.Cookie;

/* JADX INFO: loaded from: classes7.dex */
public class y0f implements Serializable {
    private static final long serialVersionUID = 6374381323722046732L;

    /* JADX INFO: renamed from: a */
    public final transient Cookie f99990a;

    /* JADX INFO: renamed from: b */
    public transient Cookie f99991b;

    public y0f(Cookie cookie) {
        this.f99990a = cookie;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        String str = (String) objectInputStream.readObject();
        String str2 = (String) objectInputStream.readObject();
        long j = objectInputStream.readLong();
        String str3 = (String) objectInputStream.readObject();
        String str4 = (String) objectInputStream.readObject();
        boolean z = objectInputStream.readBoolean();
        boolean z2 = objectInputStream.readBoolean();
        boolean z3 = objectInputStream.readBoolean();
        objectInputStream.readBoolean();
        Cookie.Builder builderExpiresAt = new Cookie.Builder().name(str).value(str2).expiresAt(j);
        Cookie.Builder builderPath = (z3 ? builderExpiresAt.hostOnlyDomain(str3) : builderExpiresAt.domain(str3)).path(str4);
        if (z) {
            builderPath = builderPath.secure();
        }
        if (z2) {
            builderPath = builderPath.httpOnly();
        }
        this.f99991b = builderPath.build();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f99990a.name());
        objectOutputStream.writeObject(this.f99990a.value());
        objectOutputStream.writeLong(this.f99990a.expiresAt());
        objectOutputStream.writeObject(this.f99990a.domain());
        objectOutputStream.writeObject(this.f99990a.path());
        objectOutputStream.writeBoolean(this.f99990a.secure());
        objectOutputStream.writeBoolean(this.f99990a.httpOnly());
        objectOutputStream.writeBoolean(this.f99990a.hostOnly());
        objectOutputStream.writeBoolean(this.f99990a.persistent());
    }

    public Cookie getCookie() {
        Cookie cookie = this.f99990a;
        Cookie cookie2 = this.f99991b;
        return cookie2 != null ? cookie2 : cookie;
    }
}
