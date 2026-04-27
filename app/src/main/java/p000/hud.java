package p000;

import android.app.Application;
import androidx.lifecycle.AbstractC1158q;
import com.watchfun.trans.database.transmachine.TransMachineDatabase;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class hud extends C9561mw {

    /* JADX INFO: renamed from: b */
    public uah f44905b;

    /* JADX INFO: renamed from: c */
    public AbstractC1158q<List<jbh>> f44906c;

    public hud(@efb Application application) {
        super(application);
        uah uahVarMessageDao = TransMachineDatabase.getDatabase(application).messageDao();
        this.f44905b = uahVarMessageDao;
        this.f44906c = uahVarMessageDao.getAllRecordLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteItem$0(jbh jbhVar) {
        this.f44905b.deleteRecordById(jbhVar.getId());
    }

    public void deleteItem(final jbh record) {
        TransMachineDatabase.getDatabaseWriteExecutor().execute(new Runnable() { // from class: gud
            @Override // java.lang.Runnable
            public final void run() {
                this.f41216a.lambda$deleteItem$0(record);
            }
        });
    }

    public AbstractC1158q<List<jbh>> getAllItems() {
        return this.f44906c;
    }
}
