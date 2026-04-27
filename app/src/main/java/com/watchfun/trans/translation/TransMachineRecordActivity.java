package com.watchfun.trans.translation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.ToastUtils;
import com.watchfun.base.BaseActivity;
import com.watchfun.trans.C4035R;
import com.watchfun.trans.database.transmachine.TransMachineDatabase;
import com.watchfun.trans.translation.C4187a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.widget.BottomEditView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p000.C7236id;
import p000.ct5;
import p000.d1h;
import p000.d99;
import p000.dbh;
import p000.g1i;
import p000.jbh;
import p000.kva;
import p000.lx2;
import p000.m9f;
import p000.mzd;
import p000.qxb;
import p000.uah;
import p000.xt5;
import p000.ztd;

/* JADX INFO: loaded from: classes6.dex */
public class TransMachineRecordActivity extends BaseActivity<C7236id> {

    /* JADX INFO: renamed from: H */
    public static final int f25764H = 44100;

    /* JADX INFO: renamed from: C */
    public boolean f25765C = false;

    /* JADX INFO: renamed from: F */
    public boolean f25766F = false;

    /* JADX INFO: renamed from: a */
    public TransMachineDatabase f25767a;

    /* JADX INFO: renamed from: b */
    public uah f25768b;

    /* JADX INFO: renamed from: c */
    public C4187a f25769c;

    /* JADX INFO: renamed from: d */
    public TransMachineRecordActivity f25770d;

    /* JADX INFO: renamed from: e */
    public ArrayList<jbh> f25771e;

    /* JADX INFO: renamed from: f */
    public mzd f25772f;

    /* JADX INFO: renamed from: m */
    public ztd f25773m;

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TransMachineRecordActivity$a */
    public class C4156a implements qxb<List<jbh>> {
        public C4156a() {
        }

        @Override // p000.qxb
        public void onChanged(List<jbh> transMachineRecords) {
            TransMachineRecordActivity.this.f25771e.clear();
            TransMachineRecordActivity.this.f25771e.addAll(transMachineRecords);
            TransMachineRecordActivity.this.f25769c.setData(TransMachineRecordActivity.this.f25771e);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TransMachineRecordActivity$b */
    public class C4157b implements C4187a.b {
        public C4157b() {
        }

        @Override // com.watchfun.trans.translation.C4187a.b
        public void click(boolean isSelect) {
            TransMachineRecordActivity.this.f25765C = isSelect;
            ((C7236id) ((BaseActivity) TransMachineRecordActivity.this).binding).f46521b.setViewSelected(TransMachineRecordActivity.this.f25765C);
        }

        @Override // com.watchfun.trans.translation.C4187a.b
        public void onItemClick(jbh record) {
            try {
                if (TextUtils.isEmpty(record.getSourceVoicePath())) {
                    return;
                }
                Intent intent = new Intent(TransMachineRecordActivity.this.f25770d, (Class<?>) TransMachineRecordDetailActivity.class);
                intent.putExtra(TransMachineRecordDetailActivity.f25781N, record.getId());
                TransMachineRecordActivity.this.startActivity(intent);
            } catch (Exception e) {
                Log.e("yujl", e.toString());
            }
        }

        @Override // com.watchfun.trans.translation.C4187a.b
        public void onShareClick(jbh record) {
            if (TextUtils.isEmpty(record.getSourceVoicePath())) {
                return;
            }
            TransMachineRecordActivity.this.showRecordShareDialog(record);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TransMachineRecordActivity$c */
    public class C4158c implements BottomEditView.OnEditClickListener {
        public C4158c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDelete$0() {
            for (jbh jbhVar : TransMachineRecordActivity.this.f25768b.getAllRecord()) {
                xt5.delete(jbhVar.getSourcePcmPath());
                xt5.delete(jbhVar.getSourceVoicePath());
            }
            TransMachineRecordActivity.this.f25768b.deleteAllRecord();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onCancel() {
            TransMachineRecordActivity.this.f25769c.setEditMode(false);
            TransMachineRecordActivity.this.updateRecyclerViewBottomMargin(false);
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onDelete(boolean isAllSelect) {
            if (isAllSelect) {
                C2478k.getCachedPool().execute(new Runnable() { // from class: mbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60510a.lambda$onDelete$0();
                    }
                });
                ((C7236id) ((BaseActivity) TransMachineRecordActivity.this).binding).f46521b.setVisibility(8);
            } else {
                for (jbh jbhVar : TransMachineRecordActivity.this.f25769c.getSelectData()) {
                    TransMachineRecordActivity.this.f25768b.deleteSelectRecordData(jbhVar.getTime());
                    xt5.delete(jbhVar.getSourceVoicePath());
                }
            }
            TransMachineRecordActivity.this.f25769c.removeSelectData();
        }

        @Override // com.watchfun.transcommon.widget.BottomEditView.OnEditClickListener
        public void onSelect(boolean isAllSelect) {
            TransMachineRecordActivity.this.f25769c.setAllSelectState(isAllSelect);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TransMachineRecordActivity$d */
    public class C4159d implements ztd.InterfaceC16252a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jbh f25777a;

        public C4159d(final jbh val$record) {
            this.f25777a = val$record;
        }

        @Override // p000.ztd.InterfaceC16252a
        public void cancel() {
            TransMachineRecordActivity.this.f25773m.dismiss();
            TransMachineRecordActivity.this.f25773m = null;
        }

        @Override // p000.ztd.InterfaceC16252a
        public void delete() {
            TransMachineRecordActivity.this.f25768b.deleteRecordById(this.f25777a.getId());
            TransMachineRecordActivity.this.f25773m.dismiss();
            TransMachineRecordActivity.this.f25773m = null;
        }

        @Override // p000.ztd.InterfaceC16252a
        public void rename() {
            TransMachineRecordActivity.this.showRenameDialog(this.f25777a);
            TransMachineRecordActivity.this.f25773m.dismiss();
            TransMachineRecordActivity.this.f25773m = null;
        }

        @Override // p000.ztd.InterfaceC16252a
        public void shareAudio() {
            String sourceVoicePath = this.f25777a.getSourceVoicePath();
            if (TextUtils.isEmpty(sourceVoicePath)) {
                return;
            }
            File file = new File(sourceVoicePath);
            if (file.exists()) {
                m9f.shareMp3File(TransMachineRecordActivity.this.f25770d, file);
            }
            TransMachineRecordActivity.this.f25773m.dismiss();
            TransMachineRecordActivity.this.f25773m = null;
        }

        @Override // p000.ztd.InterfaceC16252a
        public void shareText() {
            List<dbh> messageList = this.f25777a.getMessageList();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f25777a.getName());
            sb.append(System.lineSeparator());
            sb.append(TransMachineRecordActivity.this.f25770d.getResources().getString(C4035R.string.duration));
            sb.append(g1i.f38277c);
            sb.append(d1h.formatLongToTime(this.f25777a.getDuration()));
            sb.append(d99.f28832c);
            sb.append(TransMachineRecordActivity.this.f25770d.getResources().getString(C4035R.string.time));
            sb.append(d1h.formatLongToDate(this.f25777a.getTime()));
            sb.append(System.lineSeparator());
            for (dbh dbhVar : messageList) {
                sb.append(dbhVar.getResult());
                sb.append(System.lineSeparator());
                sb.append(dbhVar.getTransResult());
                sb.append(System.lineSeparator());
            }
            String string = sb.toString();
            m9f.shareTextFile(TransMachineRecordActivity.this.f25770d, ct5.getTextPath(TransMachineRecordActivity.this.f25770d, this.f25777a.getName()), string);
            TransMachineRecordActivity.this.f25773m.dismiss();
            TransMachineRecordActivity.this.f25773m = null;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.TransMachineRecordActivity$e */
    public class C4160e implements mzd.InterfaceC9617b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jbh f25779a;

        public C4160e(final jbh val$record) {
            this.f25779a = val$record;
        }

        @Override // p000.mzd.InterfaceC9617b
        public void onCancel() {
            TransMachineRecordActivity.this.f25772f.dismiss();
            TransMachineRecordActivity.this.f25772f = null;
        }

        @Override // p000.mzd.InterfaceC9617b
        public void onSure(String name) {
            if (TextUtils.isEmpty(name)) {
                ToastUtils.showShort(TransMachineRecordActivity.this.f25770d.getResources().getString(C4035R.string.title_cannot_be_empty));
            } else {
                String mP3Path = ct5.getMP3Path(TransMachineRecordActivity.this.f25770d, d1h.formatLongToYMDHMSS(this.f25779a.getTime()), name);
                if (ct5.renameFile(mP3Path, this.f25779a)) {
                    TransMachineRecordActivity.this.f25768b.reRecordNameById(this.f25779a.getId(), name, mP3Path);
                } else {
                    ToastUtils.showShort(TransMachineRecordActivity.this.f25770d.getResources().getString(C4201R.string.reboot_failed));
                }
            }
            TransMachineRecordActivity.this.f25772f.dismiss();
            TransMachineRecordActivity.this.f25772f = null;
        }
    }

    private void initRv() {
        this.f25771e = new ArrayList<>();
        this.f25768b.getAllRecordLiveData().observe(this, new C4156a());
        ((C7236id) this.binding).f46523d.setLayoutManager(new LinearLayoutManager(this, 1, false));
        C4187a c4187a = new C4187a(this.f25770d);
        this.f25769c = c4187a;
        c4187a.setData(this.f25771e);
        ((C7236id) this.binding).f46523d.setAdapter(this.f25769c);
        ((C7236id) this.binding).f46523d.addItemDecoration(new kva(lx2.getDrawable(this.f25770d, C4035R.drawable.divider_middle), 16, 16));
        this.f25769c.setOnItemClickListener(new C4157b());
        ((C7236id) this.binding).f46521b.setOnEditClickListener(new C4158c());
        ((C7236id) this.binding).f46522c.setOnClickListener(new View.OnClickListener() { // from class: lbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f57123a.lambda$initRv$1(view);
            }
        });
    }

    private void initUI() {
        initRv();
        ((C7236id) this.binding).f46525f.setOnClickListener(new View.OnClickListener() { // from class: kbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f53559a.lambda$initUI$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRv$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initUI$0(View view) {
        C4187a c4187a = this.f25769c;
        if (c4187a != null) {
            c4187a.setEditMode(!this.f25766F);
            boolean z = !this.f25766F;
            this.f25766F = z;
            ((C7236id) this.binding).f46521b.setEditMode(z);
            updateRecyclerViewBottomMargin(this.f25766F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRecordShareDialog(jbh record) {
        if (this.f25773m == null) {
            this.f25773m = new ztd(this, new C4159d(record));
        }
        if (this.f25773m.isShowing()) {
            return;
        }
        this.f25773m.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRenameDialog(jbh record) {
        if (this.f25772f == null) {
            this.f25772f = new mzd(this, record, new C4160e(record));
        }
        if (this.f25772f.isShowing()) {
            return;
        }
        this.f25772f.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRecyclerViewBottomMargin(boolean isEditMode) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((C7236id) this.binding).f46523d.getLayoutParams();
        layoutParams.bottomMargin = isEditMode ? (int) TypedValue.applyDimension(1, 90.0f, getResources().getDisplayMetrics()) : 0;
        ((C7236id) this.binding).f46523d.setLayoutParams(layoutParams);
    }

    @Override // com.watchfun.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TransMachineDatabase database = TransMachineDatabase.getDatabase(this);
        this.f25767a = database;
        this.f25768b = database.messageDao();
        this.f25770d = this;
        initUI();
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        updateRecyclerViewBottomMargin(false);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C7236id getViewBinding() {
        return C7236id.inflate(getLayoutInflater());
    }
}
