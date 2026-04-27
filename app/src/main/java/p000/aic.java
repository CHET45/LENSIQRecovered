package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class aic {
    private aic() {
    }

    public static void moveChildren(@efb deb debVar, @efb deb debVar2) {
        deb next = debVar2.getNext();
        while (next != null) {
            deb next2 = next.getNext();
            debVar.appendChild(next);
            next = next2;
        }
    }
}
