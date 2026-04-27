package p000;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e9b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f32239a;

    public e9b(String str) {
        this.f32239a = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9815a();

    /* JADX INFO: renamed from: b */
    public abstract void mo9816b(InterruptedException interruptedException);

    public abstract void execute() throws InterruptedException;

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f32239a);
        try {
            try {
                execute();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                mo9816b(e);
            }
        } finally {
            Thread.currentThread().setName(name);
            mo9815a();
        }
    }
}
