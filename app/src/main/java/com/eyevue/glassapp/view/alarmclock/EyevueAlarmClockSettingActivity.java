package com.eyevue.glassapp.view.alarmclock;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.DialogFragment;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2474g;
import com.blankj.utilcode.util.C2475h;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.RepeatBean;
import com.eyevue.glassapp.database.alarmclock.AlarmClockMessage;
import com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao;
import com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDatabase;
import com.eyevue.glassapp.utils.BatteryOptimization.BatteryOptimizationUtils;
import com.eyevue.glassapp.view.batterypermissions.EyevueBatteryPermissionsActivity;
import com.google.android.material.timepicker.TimeModel;
import com.haibin.calendarview.CalendarView;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.voicenotes.widget.WatchDialog;
import java.util.List;
import p000.C12269rt;
import p000.C14994x9;
import p000.C5372em;
import p000.DialogC2383cm;
import p000.DialogC4854dm;
import p000.a77;
import p000.efb;
import p000.g1i;
import p000.igg;
import p000.kn1;
import p000.m3h;
import p000.nn1;
import p000.xnc;
import p000.yp0;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueAlarmClockSettingActivity extends BaseActivity<C14994x9> {

    /* JADX INFO: renamed from: Q */
    public static final String f18418Q = "alarm_id";

    /* JADX INFO: renamed from: X */
    public static final String f18419X = "alarm_time";

    /* JADX INFO: renamed from: Y */
    public static final String f18420Y = "is_edit";

    /* JADX INFO: renamed from: Z */
    public static final String f18421Z = "calendar_id";

    /* JADX INFO: renamed from: C */
    public long f18422C;

    /* JADX INFO: renamed from: F */
    public kn1 f18423F;

    /* JADX INFO: renamed from: H */
    public int f18424H;

    /* JADX INFO: renamed from: L */
    public WatchDialog f18425L;

    /* JADX INFO: renamed from: M */
    public WatchDialog f18426M;

    /* JADX INFO: renamed from: N */
    public AlarmManager f18427N;

    /* JADX INFO: renamed from: b */
    public DialogC4854dm f18429b;

    /* JADX INFO: renamed from: c */
    public DialogC2383cm f18430c;

    /* JADX INFO: renamed from: d */
    public AlarmClockMessageDao f18431d;

    /* JADX INFO: renamed from: f */
    public boolean f18433f;

    /* JADX INFO: renamed from: m */
    public long f18434m;

    /* JADX INFO: renamed from: a */
    public final String f18428a = "EyevueAlarmClockSettingActivity";

    /* JADX INFO: renamed from: e */
    public int f18432e = 0;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$a */
    public class C2716a implements DialogC2383cm.b {
        public C2716a() {
        }

        @Override // p000.DialogC2383cm.b
        public void onOk(RepeatBean repeatBean) {
            ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97220N.setText(repeatBean.getRepeatStr());
            EyevueAlarmClockSettingActivity.this.f18432e = repeatBean.getRepeatType();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$b */
    public class C2717b implements kn1.InterfaceC8459a {
        public C2717b() {
        }

        @Override // p000.kn1.InterfaceC8459a
        public void onOk() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$c */
    public class C2718c implements C2475h.b {
        public C2718c() {
        }

        @Override // com.blankj.utilcode.util.C2475h.b
        public void onDenied(@efb List<String> deniedForever, @efb List<String> denied) {
            C2473f.m4168e("EyevueAlarmClockSettingActivity", "日历权限请求失败！！！2222222！！！！");
            m3h.showToastShort(EyevueAlarmClockSettingActivity.this.getString(C2531R.string.eyevue_permission_system_set));
            if (EyevueAlarmClockSettingActivity.this.f18423F == null || !EyevueAlarmClockSettingActivity.this.f18423F.isShowing()) {
                return;
            }
            EyevueAlarmClockSettingActivity.this.f18423F.dismiss();
        }

        @Override // com.blankj.utilcode.util.C2475h.b
        public void onGranted(@efb List<String> granted) {
            C2473f.m4168e("EyevueAlarmClockSettingActivity", "日历权限请求成功！！！！");
            if (EyevueAlarmClockSettingActivity.this.f18423F == null || !EyevueAlarmClockSettingActivity.this.f18423F.isShowing()) {
                return;
            }
            EyevueAlarmClockSettingActivity.this.f18423F.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$d */
    public class ViewOnClickListenerC2719d implements View.OnClickListener {
        public ViewOnClickListenerC2719d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueAlarmClockSettingActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$e */
    public class ViewOnClickListenerC2720e implements View.OnClickListener {
        public ViewOnClickListenerC2720e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueAlarmClockSettingActivity.this.showTimeRepeatDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$f */
    public class ViewOnClickListenerC2721f implements View.OnClickListener {
        public ViewOnClickListenerC2721f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueAlarmClockSettingActivity.this.showTimeSettingDialg();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$g */
    public class ViewOnClickListenerC2722g implements View.OnClickListener {
        public ViewOnClickListenerC2722g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97215C.scrollToPre();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$h */
    public class ViewOnClickListenerC2723h implements View.OnClickListener {
        public ViewOnClickListenerC2723h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97215C.scrollToNext();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$i */
    public class C2724i implements CalendarView.InterfaceC3789n {
        public C2724i() {
        }

        @Override // com.haibin.calendarview.CalendarView.InterfaceC3789n
        public void onMonthChange(int year, int month) {
            ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97218L.setText(year + EyevueAlarmClockSettingActivity.this.getString(C2531R.string.string_year) + a77.C0077a.f542d + month + EyevueAlarmClockSettingActivity.this.getString(C2531R.string.string_month));
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$j */
    public class ViewOnClickListenerC2725j implements View.OnClickListener {
        public ViewOnClickListenerC2725j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97217H.setSelected(!((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97217H.isSelected());
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$k */
    public class ViewOnClickListenerC2726k implements View.OnClickListener {
        public ViewOnClickListenerC2726k() {
        }

        @Override // android.view.View.OnClickListener
        @igg({"ScheduleExactAlarm"})
        public void onClick(View v) {
            ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97216F.clearFocus();
            if (!C2475h.isGranted(xnc.f98588M) || !C2475h.isGranted(xnc.f98589N)) {
                EyevueAlarmClockSettingActivity.this.showPermissionDialog();
                return;
            }
            if (!C2474g.areNotificationsEnabled()) {
                EyevueAlarmClockSettingActivity.this.showNotifyDialog();
                return;
            }
            if (!BatteryOptimizationUtils.isIgnoringBatteryOptimizations(EyevueAlarmClockSettingActivity.this)) {
                EyevueAlarmClockSettingActivity.this.showBackgroundDialog();
                return;
            }
            if (EyevueAlarmClockSettingActivity.this.f18427N != null && Build.VERSION.SDK_INT >= 31 && !EyevueAlarmClockSettingActivity.this.f18427N.canScheduleExactAlarms()) {
                Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse("package:" + EyevueAlarmClockSettingActivity.this.getPackageName()));
                EyevueAlarmClockSettingActivity.this.startActivity(intent);
                return;
            }
            String string = ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97222X.getText().toString();
            String string2 = ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97220N.getText().toString();
            String string3 = ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97216F.getText().toString();
            long jConvertToTimestamp = nn1.convertToTimestamp(((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97215C.getSelectedCalendar().getYear() + "-" + ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97215C.getSelectedCalendar().getMonth() + "-" + ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97215C.getSelectedCalendar().getDay() + C2473f.f17566z + string + ":00");
            StringBuilder sb = new StringBuilder();
            sb.append("时间戳:::");
            sb.append(jConvertToTimestamp);
            sb.append(":::");
            sb.append(EyevueAlarmClockSettingActivity.this.f18433f);
            C2473f.m4168e(sb.toString());
            if (string.isEmpty() || string2.isEmpty()) {
                return;
            }
            if (string3.isEmpty()) {
                string3 = nn1.convertToTimestampMonAndDay(jConvertToTimestamp, EyevueAlarmClockSettingActivity.this.getString(C2531R.string.string_month), EyevueAlarmClockSettingActivity.this.getString(C2531R.string.string_day)) + EyevueAlarmClockSettingActivity.this.getString(C2531R.string.string_alarm_reminder);
            }
            String str = string3;
            EyevueAlarmClockSettingActivity eyevueAlarmClockSettingActivity = EyevueAlarmClockSettingActivity.this;
            C5372em.setAlarm(eyevueAlarmClockSettingActivity, eyevueAlarmClockSettingActivity.f18433f ? EyevueAlarmClockSettingActivity.this.f18424H : -1, EyevueAlarmClockSettingActivity.this.f18434m, jConvertToTimestamp, EyevueAlarmClockSettingActivity.this.f18432e, str, ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97217H.isSelected(), EyevueAlarmClockSettingActivity.this.f18422C, EyevueAlarmClockSettingActivity.this.f18433f);
            EyevueAlarmClockSettingActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity$l */
    public class C2727l implements DialogC4854dm.e {
        public C2727l() {
        }

        @Override // p000.DialogC4854dm.e
        public void onOk(int hour, int minute) {
            ((C14994x9) ((BaseActivity) EyevueAlarmClockSettingActivity.this).binding).f97222X.setText(String.format(TimeModel.f22867C, Integer.valueOf(hour)) + g1i.f38277c + String.format(TimeModel.f22867C, Integer.valueOf(minute)));
        }
    }

    private void dismissBackgroundDialog() {
        WatchDialog watchDialog = this.f18426M;
        if (watchDialog != null) {
            if (watchDialog.isShow() && !isDestroyed()) {
                this.f18426M.dismiss();
            }
            this.f18426M = null;
        }
    }

    private void dismissNotifyDialog() {
        WatchDialog watchDialog = this.f18425L;
        if (watchDialog != null) {
            if (watchDialog.isShow() && !isDestroyed()) {
                this.f18425L.dismiss();
            }
            this.f18425L = null;
        }
    }

    private void initListener() {
        ((C14994x9) this.binding).f97226b.setOnClickListener(new ViewOnClickListenerC2719d());
        ((C14994x9) this.binding).f97229e.setOnClickListener(new ViewOnClickListenerC2720e());
        ((C14994x9) this.binding).f97231m.setOnClickListener(new ViewOnClickListenerC2721f());
        ((C14994x9) this.binding).f97228d.setOnClickListener(new ViewOnClickListenerC2722g());
        ((C14994x9) this.binding).f97230f.setOnClickListener(new ViewOnClickListenerC2723h());
        ((C14994x9) this.binding).f97215C.setOnMonthChangeListener(new C2724i());
        ((C14994x9) this.binding).f97217H.setOnClickListener(new ViewOnClickListenerC2725j());
        ((C14994x9) this.binding).f97227c.setOnClickListener(new ViewOnClickListenerC2726k());
    }

    private void initSetting() {
        ((C14994x9) this.binding).f97218L.setText(((C14994x9) this.binding).f97215C.getCurYear() + getString(C2531R.string.string_year) + a77.C0077a.f542d + ((C14994x9) this.binding).f97215C.getCurMonth() + getString(C2531R.string.string_month));
        ((C14994x9) this.binding).f97222X.setText(nn1.convertTimestampToOnlyHour(System.currentTimeMillis() + 60000));
        ((C14994x9) this.binding).f97220N.setText(RepeatBean.getRepeatTypeStr(this, 0));
        ((C14994x9) this.binding).f97217H.setSelected(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showBackgroundDialog$2(View view, DialogFragment dialogFragment) {
        dismissBackgroundDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showBackgroundDialog$3(View view, DialogFragment dialogFragment) {
        dismissBackgroundDialog();
        startActivity(new Intent(this, (Class<?>) EyevueBatteryPermissionsActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotifyDialog$0(View view, DialogFragment dialogFragment) {
        dismissNotifyDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotifyDialog$1(View view, DialogFragment dialogFragment) {
        dismissNotifyDialog();
        startNotificationSetting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBackgroundDialog() {
        if (isFinishing()) {
            return;
        }
        if (this.f18426M == null) {
            this.f18426M = new WatchDialog.Builder().title(getString(C2531R.string.permission)).content(getString(C2531R.string.string_alarm_background_tip)).cancel(true).left(getString(C2531R.string.cancel)).leftColor(getResources().getColor(C2531R.color.gray_d4d4d4)).right(getString(C2531R.string.to_setting)).rightColor(getResources().getColor(C4201R.color.text_important_color)).leftClickListener(new WatchDialog.InterfaceC4387c() { // from class: dl5
                @Override // com.watchfun.voicenotes.widget.WatchDialog.InterfaceC4387c
                public final void onClick(View view, DialogFragment dialogFragment) {
                    this.f29938a.lambda$showBackgroundDialog$2(view, dialogFragment);
                }
            }).rightClickListener(new WatchDialog.InterfaceC4387c() { // from class: el5
                @Override // com.watchfun.voicenotes.widget.WatchDialog.InterfaceC4387c
                public final void onClick(View view, DialogFragment dialogFragment) {
                    this.f33332a.lambda$showBackgroundDialog$3(view, dialogFragment);
                }
            }).build();
        }
        if (this.f18426M.isShow()) {
            return;
        }
        this.f18426M.show(getSupportFragmentManager(), "backgroundDialog_dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNotifyDialog() {
        if (isFinishing()) {
            return;
        }
        if (this.f18425L == null) {
            this.f18425L = new WatchDialog.Builder().title(getString(C2531R.string.permission)).content(getString(C2531R.string.string_alarm_notification_tip)).cancel(true).left(getString(C2531R.string.cancel)).leftColor(getResources().getColor(C2531R.color.gray_d4d4d4)).right(getString(C2531R.string.to_setting)).rightColor(getResources().getColor(C4201R.color.text_important_color)).leftClickListener(new WatchDialog.InterfaceC4387c() { // from class: fl5
                @Override // com.watchfun.voicenotes.widget.WatchDialog.InterfaceC4387c
                public final void onClick(View view, DialogFragment dialogFragment) {
                    this.f37046a.lambda$showNotifyDialog$0(view, dialogFragment);
                }
            }).rightClickListener(new WatchDialog.InterfaceC4387c() { // from class: gl5
                @Override // com.watchfun.voicenotes.widget.WatchDialog.InterfaceC4387c
                public final void onClick(View view, DialogFragment dialogFragment) {
                    this.f40134a.lambda$showNotifyDialog$1(view, dialogFragment);
                }
            }).build();
        }
        if (this.f18425L.isShow()) {
            return;
        }
        this.f18425L.show(getSupportFragmentManager(), "notify_dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPermissionDialog() {
        if (this.f18423F == null) {
            this.f18423F = new kn1(this, new C2717b());
        }
        if (this.f18423F.isShowing()) {
            return;
        }
        this.f18423F.show();
        C2475h.permission(xnc.f98588M, xnc.f98589N).callback(new C2718c()).request();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTimeRepeatDialog() {
        if (this.f18430c == null) {
            this.f18430c = new DialogC2383cm(this, new C2716a());
        }
        if (this.f18430c.isShowing()) {
            return;
        }
        this.f18430c.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTimeSettingDialg() {
        if (this.f18429b == null) {
            this.f18429b = new DialogC4854dm(this, new C2727l());
        }
        if (this.f18429b.isShowing()) {
            return;
        }
        this.f18429b.show();
        if (TextUtils.isEmpty(((C14994x9) this.binding).f97222X.getText().toString())) {
            return;
        }
        this.f18429b.setTime(Integer.parseInt(((C14994x9) this.binding).f97222X.getText().toString().split(g1i.f38277c)[0]), Integer.parseInt(((C14994x9) this.binding).f97222X.getText().toString().split(g1i.f38277c)[1]));
    }

    public static void start(Context context, int alarmid, long alarmTime, long calendarId, boolean isEdit) {
        Intent intent = new Intent(context, (Class<?>) EyevueAlarmClockSettingActivity.class);
        intent.putExtra(f18419X, alarmTime);
        intent.putExtra(f18421Z, calendarId);
        intent.putExtra(f18420Y, isEdit);
        intent.putExtra(f18418Q, alarmid);
        context.startActivity(intent);
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C14994x9 getViewBinding() {
        return C14994x9.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    @igg({"SetTextI18n"})
    public void initView() {
        AlarmClockMessage alarmClockMessageFindByResult;
        super.initView();
        this.f18431d = AlarmClockMessageDatabase.getDatabase(this).messageDao();
        this.f18427N = (AlarmManager) getSystemService(NotificationCompat.CATEGORY_ALARM);
        this.f18424H = getIntent().getIntExtra(f18418Q, 0);
        this.f18434m = getIntent().getLongExtra(f18419X, 0L);
        this.f18433f = getIntent().getBooleanExtra(f18420Y, false);
        this.f18422C = getIntent().getLongExtra(f18421Z, 0L);
        C2473f.m4168e("EyevueAlarmClockSettingActivity", "oldAlarmTime:::" + this.f18434m + "isEdit:::" + this.f18433f + "calendarId:::" + this.f18422C);
        long j = this.f18434m;
        if (j <= 0 || (alarmClockMessageFindByResult = this.f18431d.findByResult(this.f18424H, j)) == null) {
            initSetting();
        } else {
            ((C14994x9) this.binding).f97216F.setText(alarmClockMessageFindByResult.getAlarmDescription());
            ((C14994x9) this.binding).f97222X.setText(nn1.convertTimestampToOnlyHour(alarmClockMessageFindByResult.getAlarmTime()));
            ((C14994x9) this.binding).f97220N.setText(RepeatBean.getRepeatTypeStr(this, alarmClockMessageFindByResult.getAlarmRepeat()));
            ((C14994x9) this.binding).f97217H.setSelected(alarmClockMessageFindByResult.isSyncCalendar());
            this.f18432e = alarmClockMessageFindByResult.getAlarmRepeat();
            String[] strArrSplit = nn1.convertTimestampToStringNoHour(alarmClockMessageFindByResult.getAlarmTime()).split("-");
            if (strArrSplit.length > 0) {
                ((C14994x9) this.binding).f97215C.scrollToCalendar(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
                ((C14994x9) this.binding).f97218L.setText(Integer.parseInt(strArrSplit[0]) + getString(C2531R.string.string_year) + a77.C0077a.f542d + Integer.parseInt(strArrSplit[1]) + getString(C2531R.string.string_month));
            } else {
                ((C14994x9) this.binding).f97218L.setText(((C14994x9) this.binding).f97215C.getCurYear() + getString(C2531R.string.string_year) + a77.C0077a.f542d + ((C14994x9) this.binding).f97215C.getCurMonth() + getString(C2531R.string.string_month));
            }
        }
        initListener();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C4032a.setStatusBarDark(this, false, false, false, getColor(C2531R.color.tab_bg));
        yp0.setStatusBarLightMode((Activity) this, false);
    }

    public void startNotificationSetting() {
        ApplicationInfo applicationInfo = getApplicationInfo();
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", applicationInfo.packageName);
            intent.putExtra("android.provider.extra.APP_PACKAGE", applicationInfo.packageName);
            intent.putExtra("app_uid", applicationInfo.uid);
            startActivity(intent);
        } catch (Exception unused) {
            Intent intent2 = new Intent();
            intent2.setFlags(268435456);
            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts(C12269rt.f79418l, applicationInfo.packageName, null));
            startActivity(intent2);
        }
    }
}
