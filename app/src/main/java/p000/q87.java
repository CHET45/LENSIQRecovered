package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.aichat.C3993R;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.manager.p013ai.MarkDownHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C2133c;
import p000.vfe;

/* JADX INFO: loaded from: classes6.dex */
public class q87 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: v */
    public static final String f73500v = "GptChatAiAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f73501a;

    /* JADX INFO: renamed from: b */
    public InterfaceC11362j f73502b;

    /* JADX INFO: renamed from: d */
    public InterfaceC11363k f73504d;

    /* JADX INFO: renamed from: e */
    public jx1 f73505e;

    /* JADX INFO: renamed from: f */
    public mx1 f73506f;

    /* JADX INFO: renamed from: g */
    public ox1 f73507g;

    /* JADX INFO: renamed from: h */
    public int f73508h;

    /* JADX INFO: renamed from: i */
    public lx1 f73509i;

    /* JADX INFO: renamed from: j */
    public boolean f73510j;

    /* JADX INFO: renamed from: k */
    public boolean f73511k;

    /* JADX INFO: renamed from: l */
    public int f73512l;

    /* JADX INFO: renamed from: m */
    public RecyclerView f73513m;

    /* JADX INFO: renamed from: n */
    public AnimationDrawable f73514n;

    /* JADX INFO: renamed from: o */
    public boolean f73515o;

    /* JADX INFO: renamed from: p */
    public b27 f73516p;

    /* JADX INFO: renamed from: r */
    public String f73518r;

    /* JADX INFO: renamed from: t */
    public boolean f73520t;

    /* JADX INFO: renamed from: u */
    public boolean f73521u;

    /* JADX INFO: renamed from: q */
    public int f73517q = -1;

    /* JADX INFO: renamed from: s */
    public int f73519s = 5;

    /* JADX INFO: renamed from: c */
    public ArrayList<c27> f73503c = new ArrayList<>();

    /* JADX INFO: renamed from: q87$a */
    public class ViewOnClickListenerC11353a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c27 f73522a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f73523b;

        public ViewOnClickListenerC11353a(c27 c27Var, int i) {
            this.f73522a = c27Var;
            this.f73523b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q87.this.f73521u = false;
            this.f73522a.setSelect(!r2.isSelect());
            q87.this.notifyItemChanged(this.f73523b);
            q87.this.f73502b.click(q87.this.f73521u);
        }
    }

    /* JADX INFO: renamed from: q87$b */
    public class ViewOnClickListenerC11354b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f73525a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b27 f73526b;

        public ViewOnClickListenerC11354b(int i, b27 b27Var) {
            this.f73525a = i;
            this.f73526b = b27Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q87.this.f73502b.onItemChatPlayVoice(view.findViewById(C3993R.id.receive_img_voice_btn), this.f73525a, this.f73526b);
        }
    }

    /* JADX INFO: renamed from: q87$c */
    public class ViewOnClickListenerC11355c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f73528a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b27 f73529b;

        public ViewOnClickListenerC11355c(int i, b27 b27Var) {
            this.f73528a = i;
            this.f73529b = b27Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q87.this.f73502b.onItemTranslate(this.f73528a, this.f73529b);
        }
    }

    /* JADX INFO: renamed from: q87$d */
    public class ViewOnClickListenerC11356d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c27 f73531a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f73532b;

        public ViewOnClickListenerC11356d(c27 c27Var, int i) {
            this.f73531a = c27Var;
            this.f73532b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q87.this.f73521u = false;
            this.f73531a.setSelect(!r2.isSelect());
            q87.this.notifyItemChanged(this.f73532b);
            q87.this.f73502b.click(q87.this.f73521u);
        }
    }

    /* JADX INFO: renamed from: q87$e */
    public class ViewOnClickListenerC11357e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f73534a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b27 f73535b;

        public ViewOnClickListenerC11357e(int i, b27 b27Var) {
            this.f73534a = i;
            this.f73535b = b27Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q87.this.f73502b.onItemChatVoice(q87.this.f73507g.f69134b, this.f73534a, this.f73535b.getVoicePath());
        }
    }

    /* JADX INFO: renamed from: q87$f */
    public static class C11358f extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public jx1 f73537a;

        /* JADX INFO: renamed from: b */
        public InterfaceC11362j f73538b;

        public C11358f(View view, InterfaceC11362j interfaceC11362j) {
            super(view);
            this.f73538b = interfaceC11362j;
        }

        public jx1 getBinding() {
            return this.f73537a;
        }

        public void setBinding(jx1 jx1Var) {
            this.f73537a = jx1Var;
        }
    }

    /* JADX INFO: renamed from: q87$g */
    public static class ViewOnClickListenerC11359g extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final InterfaceC11362j f73539a;

        /* JADX INFO: renamed from: b */
        public lx1 f73540b;

        public ViewOnClickListenerC11359g(View view, InterfaceC11362j interfaceC11362j) {
            super(view);
            this.f73539a = interfaceC11362j;
            view.findViewById(C3993R.id.tv_name).setOnClickListener(this);
        }

        public lx1 getBinding() {
            return this.f73540b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f73539a != null) {
                view.getId();
            }
        }

        public void setBinding(lx1 lx1Var) {
            this.f73540b = lx1Var;
        }
    }

    /* JADX INFO: renamed from: q87$h */
    public static class C11360h extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public mx1 f73541a;

        /* JADX INFO: renamed from: b */
        public InterfaceC11362j f73542b;

        public C11360h(View view, InterfaceC11362j interfaceC11362j) {
            super(view);
            this.f73542b = interfaceC11362j;
        }

        public mx1 getBinding() {
            return this.f73541a;
        }

        public void setBinding(mx1 mx1Var) {
            this.f73541a = mx1Var;
        }
    }

    /* JADX INFO: renamed from: q87$i */
    public static class ViewOnClickListenerC11361i extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final InterfaceC11362j f73543a;

        /* JADX INFO: renamed from: b */
        public ox1 f73544b;

        public ViewOnClickListenerC11361i(View view, InterfaceC11362j interfaceC11362j) {
            super(view);
            this.f73543a = interfaceC11362j;
            view.findViewById(C3993R.id.ic_voice).setOnClickListener(this);
        }

        public ox1 getBinding() {
            return this.f73544b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f73543a != null) {
                view.getId();
            }
        }

        public void setBinding(ox1 ox1Var) {
            this.f73544b = ox1Var;
        }
    }

    /* JADX INFO: renamed from: q87$j */
    public interface InterfaceC11362j {
        void click(boolean z);

        void onItemChatPlayVoice(View view, int i, b27 b27Var);

        void onItemChatVoice(View view, int i, String str);

        void onItemLongClick(boolean z, boolean z2);

        void onItemTranslate(int i, b27 b27Var);
    }

    /* JADX INFO: renamed from: q87$k */
    public interface InterfaceC11363k {
        void click(int i);
    }

    public q87(Context context, RecyclerView recyclerView) {
        this.f73501a = context;
        this.f73513m = recyclerView;
        recyclerView.setAdapter(this);
    }

    private int getSafeDefaultColor(Context context) {
        try {
            return lx2.getColor(context, C4201R.color.base_purple);
        } catch (Resources.NotFoundException unused) {
            Log.e("ThemeColor", "默认颜色资源缺失，使用系统黑色");
            return -16777216;
        }
    }

    private int handleColorFallback(Context context, TypedValue typedValue) {
        int i = typedValue.type;
        return (i < 28 || i > 31) ? getSafeDefaultColor(context) : typedValue.data;
    }

    private int resolveThemeColor(Context context, @gc0 int i) {
        try {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
                return getSafeDefaultColor(context);
            }
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                return handleColorFallback(context, typedValue);
            }
            try {
                return lx2.getColor(context, i2);
            } catch (Resources.NotFoundException unused) {
                return handleColorFallback(context, typedValue);
            }
        } catch (Exception e) {
            Log.w("ThemeColor", "解析主题颜色失败，使用默认值", e);
            return getSafeDefaultColor(context);
        }
    }

    private void updateRecyclerViewScrollPosition(TextView textView, int i) {
        int height = textView.getHeight();
        int measuredHeight = this.f73513m.getMeasuredHeight() / this.f73513m.getLayoutManager().getItemCount();
        this.f73513m.smoothScrollToPosition((height != 0 ? (i * measuredHeight) / height : (i * measuredHeight) / 10) + 200);
    }

    public String getCurrentPlayingMsgId() {
        return this.f73518r;
    }

    public List<C2133c.b> getHistoryRecentMSg() {
        ArrayList<c27> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.f73503c.size() >= 10) {
            ArrayList<c27> arrayList3 = this.f73503c;
            arrayList.addAll(arrayList3.subList(arrayList3.size() - 10, this.f73503c.size()));
        } else {
            arrayList.addAll(this.f73503c);
        }
        for (c27 c27Var : arrayList) {
            C2133c.b bVar = new C2133c.b();
            if (c27Var.getGptAiMessage().getType() == 2) {
                bVar.setRole("user");
                bVar.setContent(c27Var.getGptAiMessage().getDefaultCharacters());
            } else {
                bVar.setRole("assistant");
                bVar.setContent(c27Var.getGptAiMessage().getResult());
            }
            arrayList2.add(bVar);
        }
        return arrayList2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<c27> arrayList = this.f73503c;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f73503c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (!mc2.isEmpty(this.f73503c)) {
            b27 gptAiMessage = this.f73503c.get(i).getGptAiMessage();
            this.f73508h = gptAiMessage.getType();
            this.f73512l = gptAiMessage.getMultipleOptions();
        }
        int i2 = this.f73508h;
        if (i2 == 2) {
            int i3 = this.f73512l;
            if (i3 == 1) {
                return 1;
            }
            if (i3 == 2) {
                return 3;
            }
        } else if (i2 == 1) {
            int i4 = this.f73512l;
            if (i4 == 1) {
                return 2;
            }
            if (i4 == 2) {
                return 4;
            }
        }
        return super.getItemViewType(i);
    }

    public List<b27> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<c27> arrayList2 = this.f73503c;
        if (arrayList2 != null) {
            for (c27 c27Var : arrayList2) {
                if (c27Var.isSelect()) {
                    arrayList.add(c27Var.getGptAiMessage());
                }
            }
        }
        return arrayList;
    }

    public boolean isWorking() {
        return this.f73515o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder viewHolder, int i) {
        try {
            c27 c27Var = this.f73503c.get(i);
            b27 gptAiMessage = c27Var.getGptAiMessage();
            hy2 hy2Var = new hy2(this.f73501a, vfe.getInstance().getInt(vfe.C14037b.f90985o1, axg.f12167a));
            if (viewHolder instanceof C11358f) {
                this.f73505e = ((C11358f) viewHolder).f73537a;
                this.f73505e.f52161f.setBackground(u20.getDrawable(hy2Var, C3993R.drawable.btn_ai_light_blue).mutate());
                this.f73505e.f52161f.postInvalidate();
                this.f73505e.f52154H.setVisibility(8);
                this.f73505e.f52155L.setText(gptAiMessage.getDefaultCharacters().trim());
                if (i > 1) {
                    long messageTime = this.f73503c.get(i - 1).getGptAiMessage().getMessageTime();
                    long messageTime2 = gptAiMessage.getMessageTime();
                    if (messageTime > 0 && messageTime2 - messageTime > 360000) {
                        this.f73505e.f52154H.setVisibility(0);
                        this.f73505e.f52154H.setText(w0h.stampToDate(messageTime2));
                    }
                } else {
                    long messageTime3 = gptAiMessage.getMessageTime();
                    this.f73505e.f52154H.setVisibility(0);
                    this.f73505e.f52154H.setText(w0h.stampToDate(messageTime3));
                }
                if (this.f73511k && i == getItemCount() - 1) {
                    this.f73505e.f52162m.setVisibility(0);
                    AnimationDrawable animationDrawable = (AnimationDrawable) this.f73505e.f52157b.getDrawable();
                    this.f73514n = animationDrawable;
                    animationDrawable.start();
                } else {
                    this.f73505e.f52162m.setVisibility(8);
                }
                if (this.f73520t) {
                    this.f73505e.f52152C.setVisibility(0);
                    int iResolveThemeColor = resolveThemeColor(hy2Var, C3993R.attr.imgbg);
                    if (c27Var.isSelect()) {
                        this.f73505e.f52152C.setBackgroundResource(C3993R.drawable.ic_edit_select);
                    } else {
                        this.f73505e.f52152C.setBackgroundResource(C3993R.drawable.ic_edit_unselect);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("isEditMode =========");
                    sb.append(this.f73520t);
                    gxg.applyVectorColorTint(this.f73505e.f52152C, iResolveThemeColor);
                } else {
                    this.f73505e.f52152C.setVisibility(8);
                }
                this.f73505e.f52152C.setOnClickListener(new ViewOnClickListenerC11353a(c27Var, i));
                return;
            }
            if (!(viewHolder instanceof C11360h)) {
                if (!(viewHolder instanceof ViewOnClickListenerC11361i)) {
                    if (viewHolder instanceof ViewOnClickListenerC11359g) {
                        lx1 lx1Var = ((ViewOnClickListenerC11359g) viewHolder).f73540b;
                        this.f73509i = lx1Var;
                        lx1Var.f59111c.setText(gptAiMessage.getResult());
                        return;
                    }
                    return;
                }
                this.f73507g = ((ViewOnClickListenerC11361i) viewHolder).f73544b;
                if (gptAiMessage.getVoiceTime() != 0) {
                    long voiceTime = gptAiMessage.getVoiceTime();
                    this.f73507g.f69137e.setText(String.valueOf(voiceTime));
                    int i2 = (int) voiceTime;
                    this.f73507g.f69135c.setLayoutParams(i2 == 2 ? new RelativeLayout.LayoutParams(i2 * 80, -1) : (3 > i2 || i2 > 4) ? (5 > i2 || i2 <= 8) ? new RelativeLayout.LayoutParams(i2 * 50, -1) : new RelativeLayout.LayoutParams(i2 * 50, -1) : new RelativeLayout.LayoutParams(i2 * 60, -1));
                    this.f73507g.f69136d.setGravity(cb7.f16190c);
                    this.f73507g.f69135c.setGravity(17);
                }
                this.f73507g.f69134b.setBackgroundResource(C3993R.drawable.ic_voice_playback);
                this.f73507g.f69135c.setOnClickListener(new ViewOnClickListenerC11357e(i, gptAiMessage));
                return;
            }
            this.f73506f = ((C11360h) viewHolder).f73541a;
            int iResolveThemeColor2 = resolveThemeColor(hy2Var, C3993R.attr.imgbg);
            gxg.applyTintToBackground(this.f73506f.f62593e, iResolveThemeColor2);
            if (this.f73510j && i == getItemCount() - 1) {
                this.f73510j = false;
                this.f73506f.f62595m.setVisibility(8);
                this.f73506f.f62587H.setVisibility(8);
            } else {
                this.f73506f.f62595m.setVisibility(0);
                this.f73506f.f62594f.setBackgroundResource(C3993R.drawable.ic_ai_play);
                if (TextUtils.isEmpty(gptAiMessage.getResult())) {
                    this.f73506f.f62587H.setVisibility(8);
                } else {
                    this.f73506f.f62587H.setVisibility(0);
                    MarkDownHelper.getInstance().setText(gptAiMessage.getResult(), this.f73506f.f62587H);
                    if (TextUtils.isEmpty(this.f73518r) || !TextUtils.equals(this.f73518r, gptAiMessage.getMsgId())) {
                        this.f73506f.f62594f.setBackgroundResource(C3993R.drawable.ic_ai_play);
                    } else {
                        this.f73506f.f62594f.setBackgroundResource(C3993R.drawable.ic_ai_pause);
                    }
                }
                if (TextUtils.isEmpty(gptAiMessage.getReasoningResult())) {
                    this.f73506f.f62591c.setVisibility(8);
                } else {
                    this.f73506f.f62591c.setVisibility(0);
                    MarkDownHelper.getInstance().setText(gptAiMessage.getReasoningResult(), this.f73506f.f62586F);
                    if (TextUtils.isEmpty(this.f73518r) || !TextUtils.equals(this.f73518r, gptAiMessage.getMsgId())) {
                        this.f73506f.f62594f.setBackgroundResource(C3993R.drawable.ic_ai_play);
                    } else {
                        this.f73506f.f62594f.setBackgroundResource(C3993R.drawable.ic_ai_pause);
                    }
                }
                this.f73506f.f62587H.setLineSpacing(1.2f, 1.3f);
                this.f73506f.f62586F.setLineSpacing(1.2f, 1.3f);
            }
            this.f73506f.f62595m.setOnClickListener(new ViewOnClickListenerC11354b(i, gptAiMessage));
            this.f73506f.f62588L.setOnClickListener(new ViewOnClickListenerC11355c(i, gptAiMessage));
            if (this.f73520t) {
                this.f73506f.f62590b.setVisibility(0);
                if (c27Var.isSelect()) {
                    this.f73506f.f62590b.setBackgroundResource(C3993R.drawable.ic_edit_select);
                } else {
                    this.f73506f.f62590b.setBackgroundResource(C3993R.drawable.ic_edit_unselect);
                }
                gxg.applyVectorColorTint(this.f73506f.f62590b, iResolveThemeColor2);
            } else {
                this.f73506f.f62590b.setVisibility(8);
            }
            this.f73506f.f62590b.setOnClickListener(new ViewOnClickListenerC11356d(c27Var, i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            this.f73505e = jx1.inflate(layoutInflaterFrom, viewGroup, false);
            C11358f c11358f = new C11358f(this.f73505e.getRoot(), this.f73502b);
            c11358f.setBinding(this.f73505e);
            return c11358f;
        }
        if (i == 3) {
            this.f73507g = ox1.inflate(layoutInflaterFrom, viewGroup, false);
            ViewOnClickListenerC11361i viewOnClickListenerC11361i = new ViewOnClickListenerC11361i(this.f73507g.getRoot(), this.f73502b);
            viewOnClickListenerC11361i.setBinding(this.f73507g);
            return viewOnClickListenerC11361i;
        }
        if (i == 2) {
            this.f73506f = mx1.inflate(layoutInflaterFrom, viewGroup, false);
            C11360h c11360h = new C11360h(this.f73506f.getRoot(), this.f73502b);
            c11360h.setBinding(this.f73506f);
            return c11360h;
        }
        this.f73509i = lx1.inflate(layoutInflaterFrom, viewGroup, false);
        ViewOnClickListenerC11359g viewOnClickListenerC11359g = new ViewOnClickListenerC11359g(this.f73509i.getRoot(), this.f73502b);
        viewOnClickListenerC11359g.setBinding(this.f73509i);
        return viewOnClickListenerC11359g;
    }

    @igg({"NotifyDataSetChanged"})
    public void refreshData(b27 b27Var, boolean z, boolean z2) {
        this.f73510j = z;
        this.f73511k = z2;
        Iterator<c27> it = this.f73503c.iterator();
        while (true) {
            if (!it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new c27(false, b27Var));
                this.f73503c.addAll(arrayList);
                break;
            } else {
                c27 next = it.next();
                if (TextUtils.equals(next.getGptAiMessage().getMsgId(), b27Var.getMsgId())) {
                    if (!TextUtils.isEmpty(b27Var.getResult())) {
                        next.getGptAiMessage().setResult(b27Var.getResult());
                    }
                    if (!TextUtils.isEmpty(b27Var.getReasoningResult())) {
                        next.getGptAiMessage().setReasoningResult(b27Var.getReasoningResult());
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

    public void removeSelectData() {
        ArrayList<c27> arrayList = this.f73503c;
        if (arrayList != null) {
            Iterator<c27> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().isSelect()) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setAllSelectState(boolean z) {
        this.f73521u = z;
        ArrayList<c27> arrayList = this.f73503c;
        if (arrayList != null) {
            Iterator<c27> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setSelect(z);
            }
        }
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setCurrentPlayingMsgId(String str) {
        this.f73518r = str;
        StringBuilder sb = new StringBuilder();
        sb.append("setCurrentPlayingMsgId: ");
        sb.append(str);
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<b27> list, boolean z, boolean z2) {
        this.f73510j = z;
        this.f73511k = z2;
        ArrayList arrayList = new ArrayList();
        Iterator<b27> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c27(false, it.next()));
        }
        this.f73503c.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean z) {
        this.f73520t = z;
        if (!z) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setItemClickListener(InterfaceC11362j interfaceC11362j) {
        this.f73502b = interfaceC11362j;
    }

    public void setOnItemClickListener(InterfaceC11363k interfaceC11363k) {
        this.f73504d = interfaceC11363k;
    }

    public void setWorking(boolean z) {
        this.f73515o = z;
    }

    public void updateMessage(b27 b27Var, int i) {
        this.f73516p = b27Var;
        this.f73517q = i;
        notifyDataSetChanged();
    }

    public void updateUI(int i) {
        notifyItemChanged(i);
    }
}
