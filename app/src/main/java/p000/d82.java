package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.C3597c;
import com.google.firebase.firestore.C3611n;
import com.google.firebase.firestore.FirebaseFirestore;

/* JADX INFO: loaded from: classes5.dex */
public class d82 extends C3611n {
    public d82(s6e s6eVar, FirebaseFirestore firebaseFirestore) {
        super(nld.atPath(s6eVar), firebaseFirestore);
        if (s6eVar.length() % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + s6eVar.canonicalString() + " has " + s6eVar.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C3597c lambda$add$0(C3597c c3597c, Task task) throws Exception {
        task.getResult();
        return c3597c;
    }

    @efb
    public Task<C3597c> add(@efb Object obj) {
        x7d.checkNotNull(obj, "Provided data must not be null.");
        final C3597c c3597cDocument = document();
        return c3597cDocument.set(obj).continueWith(z85.f104372c, new Continuation() { // from class: c82
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return d82.lambda$add$0(c3597cDocument, task);
            }
        });
    }

    @efb
    public C3597c document() {
        return document(r0i.autoId());
    }

    @efb
    public String getId() {
        return this.f23591a.getPath().getLastSegment();
    }

    @hib
    public C3597c getParent() {
        s6e s6eVarPopLast = this.f23591a.getPath().popLast();
        if (s6eVarPopLast.isEmpty()) {
            return null;
        }
        return new C3597c(ci4.fromPath(s6eVarPopLast), this.f23592b);
    }

    @efb
    public String getPath() {
        return this.f23591a.getPath().canonicalString();
    }

    @efb
    public C3597c document(@efb String str) {
        x7d.checkNotNull(str, "Provided document path must not be null.");
        return C3597c.m6762j(this.f23591a.getPath().append(s6e.fromString(str)), this.f23592b);
    }
}
