package p000;

/* JADX INFO: loaded from: classes5.dex */
@vx4
public class qj3 {

    /* JADX INFO: renamed from: a */
    public final Object f74568a;

    /* JADX INFO: renamed from: b */
    public final Object f74569b;

    public qj3(Object source, Object event) {
        this.f74568a = v7d.checkNotNull(source);
        this.f74569b = v7d.checkNotNull(event);
    }

    public Object getEvent() {
        return this.f74569b;
    }

    public Object getSource() {
        return this.f74568a;
    }

    public String toString() {
        return yya.toStringHelper(this).add("source", this.f74568a).add("event", this.f74569b).toString();
    }
}
