package com.eyevue.glassapp.view.alarmclock;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.database.alarmclock.AlarmClockMessage;
import com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDao;
import com.eyevue.glassapp.database.alarmclock.AlarmClockMessageDatabase;
import com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockActivity;
import com.watchfun.base.BaseActivity;
import com.watchfun.theme.C4032a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import p000.C0318am;
import p000.C13087tl;
import p000.C14481w9;
import p000.C5372em;
import p000.DialogC14665wl;
import p000.DialogC16169zl;
import p000.xcg;
import p000.yp0;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class EyevueAlarmClockActivity extends BaseActivity<C14481w9> {

    /* JADX INFO: renamed from: C */
    public final Integer f18398C;

    /* JADX INFO: renamed from: H */
    public int f18400H;

    /* JADX INFO: renamed from: a */
    public AlarmClockMessageDao f18404a;

    /* JADX INFO: renamed from: b */
    public List<AlarmClockMessage> f18405b;

    /* JADX INFO: renamed from: c */
    public C13087tl f18406c;

    /* JADX INFO: renamed from: d */
    public DialogC16169zl f18407d;

    /* JADX INFO: renamed from: e */
    public AlarmClockMessage f18408e;

    /* JADX INFO: renamed from: f */
    public int f18409f;

    /* JADX INFO: renamed from: m */
    public DialogC14665wl f18410m;

    /* JADX INFO: renamed from: F */
    public final Integer f18399F = 1;

    /* JADX INFO: renamed from: L */
    public List<AlarmClockMessage> f18401L = new ArrayList();

    /* JADX INFO: renamed from: M */
    public List<AlarmClockMessage> f18402M = new ArrayList();

    /* JADX INFO: renamed from: N */
    public final xcg<C0318am> f18403N = new C2713e();

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockActivity$a */
    public class C2709a implements C13087tl.f {
        public C2709a() {
        }

        @Override // p000.C13087tl.f
        public void click(AlarmClockMessage alarmClockMessage) {
            EyevueAlarmClockSettingActivity.start(EyevueAlarmClockActivity.this, alarmClockMessage.getId(), alarmClockMessage.getAlarmTime(), alarmClockMessage.getCalendarId(), true);
        }

        @Override // p000.C13087tl.f
        public void onMoreClick(AlarmClockMessage alarmClockMessage, int position) {
            EyevueAlarmClockActivity.this.f18409f = position;
            EyevueAlarmClockActivity.this.f18408e = alarmClockMessage;
            EyevueAlarmClockActivity.this.showMoreDialog();
        }

        @Override // p000.C13087tl.f
        public void onSwitchClick(AlarmClockMessage alarmClockMessage, int i) {
            AlarmClockMessageDao alarmClockMessageDao = EyevueAlarmClockActivity.this.f18404a;
            int id = alarmClockMessage.getId();
            long alarmTime = alarmClockMessage.getAlarmTime();
            long alarmTime2 = alarmClockMessage.getAlarmTime();
            String alarmDescription = alarmClockMessage.getAlarmDescription();
            int alarmRepeat = alarmClockMessage.getAlarmRepeat();
            boolean zIsSyncCalendar = alarmClockMessage.isSyncCalendar();
            alarmClockMessageDao.updateTimeByAlarmTime(id, alarmTime, alarmTime2, alarmDescription, alarmRepeat, zIsSyncCalendar ? 1 : 0, alarmClockMessage.getCalendarId(), alarmClockMessage.isOpen() ? 1 : 0, alarmClockMessage.isOutOfTime() ? 1 : 0);
            if (alarmClockMessage.isOpen()) {
                C5372em.setAlarm(EyevueAlarmClockActivity.this, alarmClockMessage.getId(), alarmClockMessage.getAlarmTime(), alarmClockMessage.getAlarmTime(), alarmClockMessage.getAlarmRepeat(), alarmClockMessage.getAlarmDescription(), alarmClockMessage.isSyncCalendar(), alarmClockMessage.getCalendarId(), true);
            } else {
                C5372em.cancelAlarm(EyevueAlarmClockActivity.this, alarmClockMessage.getAlarmTime(), alarmClockMessage.getAlarmRepeat(), alarmClockMessage.getAlarmDescription(), alarmClockMessage.isSyncCalendar(), alarmClockMessage.getCalendarId());
            }
            EyevueAlarmClockActivity.this.initDaoData();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockActivity$b */
    public class ViewOnClickListenerC2710b implements View.OnClickListener {
        public ViewOnClickListenerC2710b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueAlarmClockSettingActivity.start(EyevueAlarmClockActivity.this, 0, 0L, 0L, false);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockActivity$c */
    public class ViewOnClickListenerC2711c implements View.OnClickListener {
        public ViewOnClickListenerC2711c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            EyevueAlarmClockActivity eyevueAlarmClockActivity = EyevueAlarmClockActivity.this;
            eyevueAlarmClockActivity.f18400H = eyevueAlarmClockActivity.f18398C.intValue();
            ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93623C.setBackgroundResource(C2531R.drawable.btn_base_purple);
            ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93623C.setTextColor(-16777216);
            ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93624F.setBackgroundColor(0);
            ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93624F.setTextColor(-1);
            EyevueAlarmClockActivity.this.f18406c.setDataAlarm(EyevueAlarmClockActivity.this.f18401L);
            if (!EyevueAlarmClockActivity.this.f18401L.isEmpty()) {
                ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93627c.setVisibility(8);
            } else {
                ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93627c.setVisibility(0);
                ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93631m.setText(EyevueAlarmClockActivity.this.getString(C2531R.string.string_empty_alarm));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockActivity$d */
    public class ViewOnClickListenerC2712d implements View.OnClickListener {
        public ViewOnClickListenerC2712d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93624F.setBackgroundResource(C2531R.drawable.btn_base_purple);
            ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93624F.setTextColor(-16777216);
            ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93623C.setBackgroundColor(0);
            ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93623C.setTextColor(-1);
            EyevueAlarmClockActivity eyevueAlarmClockActivity = EyevueAlarmClockActivity.this;
            List<Object> listGroupAlarmsByDate = eyevueAlarmClockActivity.groupAlarmsByDate(eyevueAlarmClockActivity.f18402M);
            EyevueAlarmClockActivity.this.f18406c.setData(listGroupAlarmsByDate);
            EyevueAlarmClockActivity eyevueAlarmClockActivity2 = EyevueAlarmClockActivity.this;
            eyevueAlarmClockActivity2.f18400H = eyevueAlarmClockActivity2.f18399F.intValue();
            if (!listGroupAlarmsByDate.isEmpty()) {
                ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93627c.setVisibility(8);
            } else {
                ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93627c.setVisibility(0);
                ((C14481w9) ((BaseActivity) EyevueAlarmClockActivity.this).binding).f93631m.setText(EyevueAlarmClockActivity.this.getString(C2531R.string.string_alarm_empty_expired_tip));
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockActivity$e */
    public class C2713e implements xcg<C0318am> {
        public C2713e() {
        }

        @Override // p000.xcg
        public void onEvent(C0318am AlarmMsgEvent) {
            EyevueAlarmClockActivity.this.initDaoData();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockActivity$f */
    public class C2714f implements DialogC16169zl.c {
        public C2714f() {
        }

        @Override // p000.DialogC16169zl.c
        public void onCopy() {
            EyevueAlarmClockActivity eyevueAlarmClockActivity = EyevueAlarmClockActivity.this;
            EyevueAlarmClockSettingActivity.start(eyevueAlarmClockActivity, eyevueAlarmClockActivity.f18408e.getId(), EyevueAlarmClockActivity.this.f18408e.getAlarmTime(), 0L, false);
        }

        @Override // p000.DialogC16169zl.c
        public void onDelete() {
            EyevueAlarmClockActivity.this.showDeleteDialog();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockActivity$g */
    public class C2715g implements DialogC14665wl.a {
        public C2715g() {
        }

        @Override // p000.DialogC14665wl.a
        public void onOk() {
            EyevueAlarmClockActivity.this.f18404a.deleteSelect(EyevueAlarmClockActivity.this.f18408e.getId(), EyevueAlarmClockActivity.this.f18408e.getAlarmTime());
            EyevueAlarmClockActivity.this.initDaoData();
            EyevueAlarmClockActivity eyevueAlarmClockActivity = EyevueAlarmClockActivity.this;
            C5372em.cancelAlarm(eyevueAlarmClockActivity, eyevueAlarmClockActivity.f18408e.getAlarmTime(), EyevueAlarmClockActivity.this.f18408e.getAlarmRepeat(), EyevueAlarmClockActivity.this.f18408e.getAlarmDescription(), EyevueAlarmClockActivity.this.f18408e.isSyncCalendar(), EyevueAlarmClockActivity.this.f18408e.getCalendarId());
        }
    }

    public EyevueAlarmClockActivity() {
        Integer num = 0;
        this.f18398C = num;
        this.f18400H = num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Object> groupAlarmsByDate(List<AlarmClockMessage> alarmList) {
        final Calendar calendar = Calendar.getInstance();
        ArrayList<AlarmClockMessage> arrayList = new ArrayList();
        for (AlarmClockMessage alarmClockMessage : alarmList) {
            if (alarmClockMessage.isOutOfTime()) {
                arrayList.add(alarmClockMessage);
            }
        }
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        for (AlarmClockMessage alarmClockMessage2 : arrayList) {
            String str = simpleDateFormat.format(new Date(alarmClockMessage2.getAlarmTime()));
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, new ArrayList());
            }
            ((List) linkedHashMap.get(str)).add(alarmClockMessage2);
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((List) it.next()).sort(Comparator.comparing(new Function() { // from class: cl5
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return EyevueAlarmClockActivity.lambda$groupAlarmsByDate$2(calendar, (AlarmClockMessage) obj);
                }
            }));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            arrayList2.add(str2);
            arrayList2.addAll(list);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void initDaoData() {
        AlarmClockMessageDao alarmClockMessageDao = this.f18404a;
        if (alarmClockMessageDao == null || this.f18406c == null || this.binding == 0) {
            return;
        }
        List<AlarmClockMessage> all = alarmClockMessageDao.getAll();
        this.f18405b = all;
        for (AlarmClockMessage alarmClockMessage : all) {
            if (alarmClockMessage.getAlarmRepeat() == 0 && alarmClockMessage.getAlarmTime() < System.currentTimeMillis() && !alarmClockMessage.isOutOfTime()) {
                AlarmClockMessageDao alarmClockMessageDao2 = this.f18404a;
                int id = alarmClockMessage.getId();
                long alarmTime = alarmClockMessage.getAlarmTime();
                long alarmTime2 = alarmClockMessage.getAlarmTime();
                String alarmDescription = alarmClockMessage.getAlarmDescription();
                int alarmRepeat = alarmClockMessage.getAlarmRepeat();
                boolean zIsSyncCalendar = alarmClockMessage.isSyncCalendar();
                alarmClockMessageDao2.updateTimeByAlarmTime(id, alarmTime, alarmTime2, alarmDescription, alarmRepeat, zIsSyncCalendar ? 1 : 0, alarmClockMessage.getCalendarId(), 0, 1);
            }
        }
        final Calendar calendar = Calendar.getInstance();
        List<AlarmClockMessage> all2 = this.f18404a.getAll();
        this.f18405b = all2;
        this.f18401L = (List) all2.stream().filter(new Predicate() { // from class: zk5
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EyevueAlarmClockActivity.lambda$initDaoData$0((AlarmClockMessage) obj);
            }
        }).sorted(Comparator.comparingLong(new ToLongFunction() { // from class: al5
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return EyevueAlarmClockActivity.lambda$initDaoData$1(calendar, (AlarmClockMessage) obj);
            }
        })).collect(Collectors.toList());
        this.f18402M = (List) this.f18405b.stream().filter(new Predicate() { // from class: bl5
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AlarmClockMessage) obj).isOutOfTime();
            }
        }).collect(Collectors.toList());
        if (this.f18401L.isEmpty() && this.f18400H == this.f18398C.intValue()) {
            ((C14481w9) this.binding).f93627c.setVisibility(0);
            ((C14481w9) this.binding).f93631m.setText(getString(C2531R.string.string_empty_alarm));
        } else if (this.f18402M.isEmpty() && this.f18400H == this.f18399F.intValue()) {
            ((C14481w9) this.binding).f93627c.setVisibility(0);
            ((C14481w9) this.binding).f93631m.setText(getString(C2531R.string.string_alarm_empty_expired_tip));
        } else {
            ((C14481w9) this.binding).f93627c.setVisibility(8);
        }
        if (this.f18400H == this.f18398C.intValue()) {
            this.f18406c.setDataAlarm(this.f18401L);
        } else if (this.f18400H == this.f18399F.intValue()) {
            this.f18406c.setData(groupAlarmsByDate(this.f18402M));
        }
    }

    private void initListener() {
        this.f18406c.setOnItemClickListener(new C2709a());
        ((C14481w9) this.binding).f93626b.setOnClickListener(new ViewOnClickListenerC2710b());
        ((C14481w9) this.binding).f93623C.setOnClickListener(new ViewOnClickListenerC2711c());
        ((C14481w9) this.binding).f93624F.setOnClickListener(new ViewOnClickListenerC2712d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$groupAlarmsByDate$2(Calendar calendar, AlarmClockMessage alarmClockMessage) {
        calendar.setTimeInMillis(alarmClockMessage.getAlarmTime());
        return Integer.valueOf((calendar.get(11) * 60) + calendar.get(12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$initDaoData$0(AlarmClockMessage alarmClockMessage) {
        return !alarmClockMessage.isOutOfTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long lambda$initDaoData$1(Calendar calendar, AlarmClockMessage alarmClockMessage) {
        calendar.setTimeInMillis(alarmClockMessage.getAlarmTime());
        return (((long) calendar.get(11)) * 60) + ((long) calendar.get(12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDeleteDialog() {
        if (this.f18410m == null) {
            this.f18410m = new DialogC14665wl(this, new C2715g());
        }
        if (this.f18410m.isShowing()) {
            return;
        }
        this.f18410m.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMoreDialog() {
        if (this.f18407d == null) {
            this.f18407d = new DialogC16169zl(this, new C2714f());
        }
        if (this.f18407d.isShowing()) {
            return;
        }
        this.f18407d.show();
    }

    @Override // com.watchfun.base.BaseActivity
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public C14481w9 getViewBinding() {
        return C14481w9.inflate(getLayoutInflater());
    }

    @Override // com.watchfun.base.BaseActivity
    public void initView() {
        super.initView();
        this.f18404a = AlarmClockMessageDatabase.getDatabase(this).messageDao();
        zgb.defaultCenter().subscribeStrongly(C0318am.class, this.f18403N);
        ((C14481w9) this.binding).f93630f.setTitle(getString(C2531R.string.string_alarm));
        ((C14481w9) this.binding).f93630f.hideBottomLine();
        C13087tl c13087tl = new C13087tl();
        this.f18406c = c13087tl;
        ((C14481w9) this.binding).f93629e.setAdapter(c13087tl);
        ((C14481w9) this.binding).f93629e.setItemAnimator(null);
        this.f18406c.setDataAlarm(this.f18401L);
        ((C14481w9) this.binding).f93629e.setLayoutManager(new LinearLayoutManager(this, 1, false));
        initListener();
    }

    @Override // com.watchfun.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zgb.defaultCenter().unsubscribe(C0318am.class, this.f18403N);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C4032a.setStatusBarDark(this, false, false, false, getColor(C2531R.color.tab_bg));
        yp0.setStatusBarLightMode((Activity) this, false);
        initDaoData();
    }
}
